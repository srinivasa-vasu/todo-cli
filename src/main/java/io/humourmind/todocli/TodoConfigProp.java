package io.humourmind.todocli;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.Getter;

@ConfigurationProperties(prefix = "service")
@ConstructorBinding
@Getter
public class TodoConfigProp {
	private final String url;

	TodoConfigProp(String url) {
		this.url = url;
	}
}
