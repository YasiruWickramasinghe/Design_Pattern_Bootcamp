package _0_SOLID_Principles._1_Daily_Code_Buffer_Series.src.main.java.com.solid._4_interfacesegregation.bad;

public class BadDBDaoConnection implements BadDAOInterface {
    @Override
    public void openConnection() {
        //Connection logic
    }

    @Override
    public void createRecord() {
        //Create record logic
    }

    @Override
    public void openFile() {
        // We are in DB Connection so no need to support open file
        throw new UnsupportedOperationException("Open file Not supported");
    }

    @Override
    public void deleteRecord() {
        // This is fine
    }
}
