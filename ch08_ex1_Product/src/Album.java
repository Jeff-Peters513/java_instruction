
public class Album extends Product {

	private String artist;
    	
	// generate constructor(s)
	public Album(String artist) {
		super();
		this.artist = artist;
		count++;
	}
		
	public Album() {
		super();
		count++;
	}

	// generate getters and setters
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (" + artist + ")";
	}
	
	
	
	

}
