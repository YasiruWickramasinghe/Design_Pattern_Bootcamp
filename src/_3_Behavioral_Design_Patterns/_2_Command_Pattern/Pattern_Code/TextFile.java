package _3_Behavioral_Design_Patterns._2_Command_Pattern._1_Daily_Code_Buffer;

public class TextFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open() {
        return "Opening file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }
}
