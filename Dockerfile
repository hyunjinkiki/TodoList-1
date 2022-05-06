FROM java:8
ARG JAR_FILE=target/TodoList-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} todolist.jar
ENTRYPOINT ["jave", "-jar", "/todolist.jar"]
