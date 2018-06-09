package study.soundsystem.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import study.soundsystem.CompactDisc;

@Configuration
public class JavaBeanConfig {
	
	@Bean
	public CompactDisc wolf() {
		return new Wolf();
	}
	
}
