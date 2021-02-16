package io.humourmind.todocli;

import org.springframework.http.MediaType;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ShellComponent
public class TodoCommand {

	private final TodoConfigProp configProp;
	private final WebClient requester;

	TodoCommand(TodoConfigProp configProp) {
		this.configProp = configProp;
		this.requester = WebClient.create(this.configProp.getUrl());
	}

	@ShellMethod(group = "get", key = {
			"get task" }, value = "key-in the task id to get the task details")
	public void findById(@PathVariable String id) {
		requester.get().uri("/todo/{id}", id).accept(MediaType.APPLICATION_JSON)
				.retrieve().bodyToMono(Todo.class).subscribe(e -> {
					if (e != null)
						log.info(e.toString());
				});
	}

	@ShellMethod(group = "get", key = {
			"get task all" }, value = "returns all the available tasks")
	public void findAll() {
		requester.get().uri("/todo").accept(MediaType.APPLICATION_JSON).retrieve()
				.bodyToFlux(Todo.class).subscribe(e -> {
					if (e != null)
						log.info(e.toString());
				});
	}

}
