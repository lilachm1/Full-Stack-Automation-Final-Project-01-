package utilities;

import java.sql.DriverManager;

public class ManageDB extends CommonOps{

    /*
    ##################################################################
    This method initiates a connection with DB. Receives connection details from commonOps
    class(@BeforeClass). Also it defines SQL statement parameter
        ##################################################################
     */

    public static void openConnection(String dbURL, String user, String pass)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL,user,pass);
            stmt = con.createStatement();
        }
        catch (Exception e) {
            System.out.println("Error Occurred while Connecting to DB, See Details:" + e);
        }

    }

     /*
    ##################################################################
    This method closes a connection with DB
     ##################################################################
     */

    public static void closeConnection()
    {
        try {
            con.close();
        } catch (Exception e)
        {
            System.out.println("Error Occured While Closing DB, See Details: " + e);
        }
    }
}



