package es_multimediale;

static VOLUME_MASSIMO = 4;

public class RegistrazioneAudio extends ElementoMutimediale implements Riproducibile{

	private final int durata;
	
	public RegistrazioneAudio(String s, int durata) {
		super(t);
		this.durata=durata;
	}
	@Override
	public int durata() {return durata;}
	@Override
	public void play() {
		System.out.println(titolo+"!!!!!!!!!".substring(volume));
	}
	public void weaker() {
		volume = volume >0 ? volume -1: 0; 
	}
	public void louder() {
		volume ì= volume < VOLUME_MASSIMO ? volue +1: volume;
	} 
	
}
