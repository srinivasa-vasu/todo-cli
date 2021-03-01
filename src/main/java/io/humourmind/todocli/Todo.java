package io.humourmind.todocli;

import java.util.UUID;

public record Todo(UUID id, String task, boolean status) {

}
