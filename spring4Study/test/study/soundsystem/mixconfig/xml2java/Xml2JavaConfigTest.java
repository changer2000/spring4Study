package study.soundsystem.mixconfig.xml2java;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import study.soundsystem.javaconfig.CDPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:study/soundsystem/mixconfig/xml2java/soundsystem-config.xml")
public class Xml2JavaConfigTest {

	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void test() {
		assertNotNull(cdPlayer);
		assertNotNull(cdPlayer.getCd());
		cdPlayer.play();
	}

	public CDPlayer getCdPlayer() {
		return cdPlayer;
	}

	public void setCdPlayer(CDPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

}
