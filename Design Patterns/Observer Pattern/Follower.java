public class Follower extends Observer {
  private String followerName;

  public void update(String status) {
    if (status == "newVideo")
      this.play();
  }

  public void play() {
    // Get newest video and play
  }
}
