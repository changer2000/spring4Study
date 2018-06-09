package study.soundsystem.javaconfig;

import study.soundsystem.CompactDisc;

public class Wolf implements CompactDisc {

	private String title = "Wolf From North";
	private String artist = "QiQing";
	
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
