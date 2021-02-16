package io.humourmind.todocli;

import java.util.UUID;

import lombok.Data;

@Data
public class Todo {

	private UUID id;
	private String task;
	private boolean status;

}
