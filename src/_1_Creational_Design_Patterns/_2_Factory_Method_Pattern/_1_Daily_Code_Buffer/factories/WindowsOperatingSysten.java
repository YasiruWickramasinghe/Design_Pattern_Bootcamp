package _1_Creational_Design_Patterns._2_Factory_Method_Pattern._1_Daily_Code_Buffer.factories;

public class WindowsOperatingSysten extends OperatingSystem{
    public WindowsOperatingSysten(String version, String architecture) {
        super(version,architecture);
    }

    @Override
    public void changeDir(String dir) {
        //Windows command
    }

    @Override
    public void removeDir(String dir) {
        //Windows command
    }
}
