package study.soundsystem.javaconfig;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {JavaBeanConfig.class, JavaBeanConfig2.class})
public class JavaBeanConfigTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	private MediaPlayer cdPlayer;
	
	@Test
	public void test() {
		cdPlayer.play();
		assertEquals("Playing 'Wolf From North' by QiQing\r\n", log.getLog());
	}

	public MediaPlayer getCdPlayer() {
		return cdPlayer;
	}

	public void setCdPlayer(MediaPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

}
