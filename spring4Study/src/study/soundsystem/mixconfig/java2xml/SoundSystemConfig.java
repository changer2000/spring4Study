package study.soundsystem.mixconfig.java2xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:study/soundsystem/mixconfig/java2xml/cd-config.xml")
public class SoundSystemConfig {

}
