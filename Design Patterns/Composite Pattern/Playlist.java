public class Playlist implements IComponent {
	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
    this.playbackSpeed = 1.0f;
	}

  // Your code goes here!

  public void play() {
    for (IComponent component : this.playlist) {
      component.play();
    }
	}

  public void setPlaybackSpeed(float speed) {
    for (IComponent component : this.playlist) {
      component.setPlaybackSpeed(speed);
    }
  }

  public String getName() {
    return this.playlistName;
  }

  public void add(IComponent component) {
    this.playlist.add(component);
    return this.playlist.size - 1;
  }

  public void remove(IComponent component) {
    int componentIndex = this.playlist.indexOf(component);

    if (componentIndex != -1)
      this.playlist.remove(componentIndex);
  }
}
