package _2_Structural_Design_Patterns._2_Bridge_Pattern._1_Daily_Code_Buffer;

public abstract class Video {
    protected VideoProcessor processor;
    public Video(VideoProcessor processor){
        this.processor = processor;
    }
    public abstract void play(String videoFile);
}
