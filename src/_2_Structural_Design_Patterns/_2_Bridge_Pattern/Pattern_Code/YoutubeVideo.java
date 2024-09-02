package _2_Structural_Design_Patterns._2_Bridge_Pattern._1_Daily_Code_Buffer;

public class YoutubeVideo extends Video{
    public YoutubeVideo(VideoProcessor processor) {
        super(processor);
    }

    @Override
    public void play(String videoFile) {
        processor.process(videoFile); //Processed as per given processor
        //Now play
    }
}
