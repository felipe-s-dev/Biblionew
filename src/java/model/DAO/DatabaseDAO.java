package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseDAO {

    protected Connection conn = null;

    public DatabaseDAO() throws Exception, SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    public Connection connect() throws SQLException, Exception {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/3306/biblionew", "root", ""
            );
            System.out.println("Connected to Databasae");
        } catch (SQLException e) {
        }
        return conn;
    }

    public void desconnect() throws Exception {
        if (conn != null) {
            conn.close();
        }
    }

//    public final String url = "jdbc:mysq://localhost/3306/biblionew";;
//    public final String user = "root";
//    public final String passwd = " ";
//    public Connection conn;
//    
//    public DatabaseDAO() throws SQLException, ClassNotFoundException{
//         Class.forName("com.mysql.jdbc.Driver");
//     }
//    
//    public void connect() throws SQLException {
//        conn = DriverManager.getConnection(url, user, passwd);
//    }
//    public void desconnect() throws SQLException {
//        conn.close();
//    }
}
