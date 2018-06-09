package study.soundsystem.autowired;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import study.soundsystem.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayComponentScanConfig.class) //@ContextConfiguration(locations="classpath:study/soundsystem/autowired/soundsystem.xml")
public class AutowiredTest {

	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShoudNotNull() {
		assertNotNull(cd);
		cd.playTrack(1);
	}

}
