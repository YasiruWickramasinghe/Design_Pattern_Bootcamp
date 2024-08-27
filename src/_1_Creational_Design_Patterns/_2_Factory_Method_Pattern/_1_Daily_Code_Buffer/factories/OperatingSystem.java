package _1_Creational_Design_Patterns._2_Factory_Method_Pattern._1_Daily_Code_Buffer.factories;

public abstract class OperatingSystem {
    private String  version;
    private String architecture;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public OperatingSystem(String version, String architecture) {
        this.version = version;
        this.architecture = architecture;
    }

    public abstract void changeDir(String dir);
    public abstract void removeDir(String dir);
}
