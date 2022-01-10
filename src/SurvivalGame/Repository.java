package SurvivalGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Repository {

    private static final String DatabaseLocation = System.getProperty("user.dir") + "\\SurvivalGameDatabase.accdb";

    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            return con;

        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }return null;
    }

    public static void inputSignUpDetails(String Name, String Email, String Password) {
        try {

            Connection con = getConnection();

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "INSERT INTO Login (Account_Name, Email, Password) VALUES ('" + Name +"','" + Email + "','" + Password + "')";
            stmt.executeUpdate(sql);

            stmt.close();
            con.close();

        }catch (Exception e) {
            System.out.println("Error in the repository: " + e);
        }

    }

    public static void login(String Email, String Password){

        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM LoginTbl WHERE Email = '" + Email + "' AND password ='" + Password + "'";
            stmt.executeQuery(sql);

            System.out.println(Email + Password);
        }catch (Exception e) {
            System.out.println("Error in the repository: " + e);
        }

    }


}
