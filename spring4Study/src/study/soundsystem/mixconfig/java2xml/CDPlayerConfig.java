package study.soundsystem.mixconfig.java2xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import study.soundsystem.CompactDisc;
import study.soundsystem.javaconfig.CDPlayer;

@Configuration
public class CDPlayerConfig {

	@Bean
	public CDPlayer cdPlayer(CompactDisc cd) {
		CDPlayer cdPlayer = new CDPlayer();
		cdPlayer.setCd(cd);
		return cdPlayer;
	}
	
}
