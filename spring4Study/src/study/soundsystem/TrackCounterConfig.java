package study.soundsystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
	
	@Bean
	public CompactDisc sgtPeppers() {
		BlankDisc cd = new BlankDisc();
		cd.setTitle("t1");
		cd.setArtist("a1");
		
		List<String> tracks = new ArrayList<>();
		tracks.add("music1");
		tracks.add("music2");
		tracks.add("music3");
		tracks.add("music4");
		
		cd.setTracks(tracks);
		
		return cd;
	}
	
	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}
}
