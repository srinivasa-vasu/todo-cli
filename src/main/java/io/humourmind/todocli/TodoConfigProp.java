package io.humourmind.todocli;

import lombok.Getter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "service")
@ConstructorBinding
@Getter
public class TodoConfigProp {
	private final String url;

	TodoConfigProp(String url) {
		this.url = url;
	}
}
