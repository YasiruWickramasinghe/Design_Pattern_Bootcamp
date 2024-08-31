package _0_SOLID_Principles._1_Daily_Code_Buffer.src.main.java.com.solid._4_interfacesegregation.good;

//This is good we will only include the dao operation
// And segregate connection part so consumer can implement required interfaces.
public interface DAOInterface {
    public void createRecord();
    public void deleteRecord();
}
