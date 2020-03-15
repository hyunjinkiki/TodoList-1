package com.sba.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sba.todo.vo.Todo;

@Service
public class TodoService {

	
	public boolean addTodo(Todo todo) {

		return true;
	}
	
	public List<Todo> getTodoList(){
		List<Todo> list = null;
		return list;
	}
	
	public boolean deleteTodo(Long id) {
		Todo result = null;
		if(result == null) {
			return false;
		}
		
		return true;
	}
}
