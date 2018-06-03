package study.soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TrackCounterConfig.class)
public class TrackCounterTest {
	
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private TrackCounter counter;
	
	@Test
	public void test() {
		cd.playTrack(1);
		cd.playTrack(1);
		cd.playTrack(1);
		cd.playTrack(2);
		cd.playTrack(2);
		cd.playTrack(3);
		
		assertEquals(3, counter.getPlayCount(1));
		assertEquals(2, counter.getPlayCount(2));
		assertEquals(1, counter.getPlayCount(3));
		assertEquals(0, counter.getPlayCount(4));
	}

	public CompactDisc getCd() {
		return cd;
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	public TrackCounter getCounter() {
		return counter;
	}

	public void setCounter(TrackCounter counter) {
		this.counter = counter;
	}

}
