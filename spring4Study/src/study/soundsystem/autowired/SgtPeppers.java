package study.soundsystem.autowired;

import org.springframework.stereotype.Component;

import study.soundsystem.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc {
	
	private String title = "Club Band";
	private String artist = "The Beatles";
	
	@Override
	public void playTrack(int trackNumber) {
		System.out.println("Playing '" + title + "' by " + artist);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}
