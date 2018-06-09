package study.soundsystem.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import study.soundsystem.CompactDisc;

@Configuration
public class JavaBeanConfig2 {

	@Bean
	public MediaPlayer cdPlayer(CompactDisc cd) {
		CDPlayer cdPlayer = new CDPlayer();
		cdPlayer.setCd(cd);
		return cdPlayer;
	}
}
