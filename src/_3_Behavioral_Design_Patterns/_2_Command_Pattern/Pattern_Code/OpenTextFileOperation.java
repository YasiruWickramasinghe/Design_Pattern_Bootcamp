package _3_Behavioral_Design_Patterns._2_Command_Pattern._1_Daily_Code_Buffer;

public class OpenTextFileOperation implements TextFileOperation{

    private TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
