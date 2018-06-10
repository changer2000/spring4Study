package study.soundsystem.mixconfig.xml2java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import study.soundsystem.javaconfig.Wolf;

@Configuration
public class CDConfig {

	@Bean
	public Wolf wolf() {
		Wolf cd = new Wolf();
		return cd;
	}
}
