package eshop;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.SQLException;

public class My_CNX {
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "eshop";
    private static Integer portnumber = 3306;
    private static String password = "";

    public static Connection getConnection() throws SQLException {
        Connection cnx = null;
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);

        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cnx;
    }
}
