package _0_SOLID_Principles._1_Daily_Code_Buffer_Series.src.main.java.com.solid._4_interfacesegregation.bad;

//This dao interface defined to support data access using file system
// or database system. So we have added openConnection and openFile for it
// this bad because we have accomodate all operation in single interface.
public interface BadDAOInterface {
    public void openConnection();
    public void createRecord();
    public void openFile();
    public void deleteRecord();
}
