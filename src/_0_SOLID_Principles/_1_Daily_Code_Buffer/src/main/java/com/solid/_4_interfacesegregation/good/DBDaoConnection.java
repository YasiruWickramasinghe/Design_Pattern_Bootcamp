package _0_SOLID_Principles._1_Daily_Code_Buffer.src.main.java.com.solid._4_interfacesegregation.good;

//Implemented method what is actual being operated by this.
//We don't had to bother about file operation as interface segregated.
public class DBDaoConnection implements  DAOInterface,DBInterface{
    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void openConnection() {

    }
}
