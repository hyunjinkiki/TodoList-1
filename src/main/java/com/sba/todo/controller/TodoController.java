package com.sba.todo.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sba.todo.service.TodoService;
import com.sba.todo.vo.Result;
import com.sba.todo.vo.Todo;

@Controller
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	// 조회
	@GetMapping("/todolist")
	public String getTodoListView() {
		return "todo";
	}
	
	@GetMapping("/todolist_internal")
	@ResponseBody
	public List<Todo> getTodoList(){
		List<Todo> list = todoService.getTodoList();
		return list;
	}
	
	// 생성
	@PostMapping("/todo")
	@ResponseBody
	public Object addTodo(HttpServletResponse response, @RequestBody Todo todoParam) {
		Todo todo = new Todo(todoParam.getContent());
		boolean isSuccess = todoService.addTodo(todo);
		
		if(isSuccess) {
			response.setStatus(HttpServletResponse.SC_OK);
			return new Result(200, "Success");
		} else {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return new Result(500, "Fail");
		}
	}
	
	// 삭제
	@DeleteMapping("/todo/{id}")
	public Object deleteTodo(HttpServletResponse response, @PathVariable("id") Long id) {
		boolean isSuccess = todoService.deleteTodo(id);
		
		if(isSuccess) {
			response.setStatus(HttpServletResponse.SC_OK);
			return new Result(200, "Success");
		} else {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return new Result(500, "Fail");
		}
	}

}
