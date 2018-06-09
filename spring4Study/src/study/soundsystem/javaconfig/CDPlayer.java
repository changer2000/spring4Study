package study.soundsystem.javaconfig;

import study.soundsystem.CompactDisc;

public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;
	
	@Override
	public void play() {
		cd.playTrack(1);
	}

	public CompactDisc getCd() {
		return cd;
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

}
