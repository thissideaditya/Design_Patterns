package CodeForState.Solution;

public class StandByState extends AudioPlayerState{
    @Override
    public void pressPlay(AudioPlayer pl) {
        System.out.println("Invalid operation.");
    }

    @Override
    public void pressChangeSource(AudioPlayer pl) {
        System.out.println("Setting State to Radio");
        pl.state = new RadioState();
    }
}
