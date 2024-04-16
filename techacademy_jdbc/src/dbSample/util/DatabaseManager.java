package dbSample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static Connection con;
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        // 1. ドライバのクラスをJava上で読み込む
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2. DBと接続する
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost/world?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "Koneshimachan055!"
                );
        
        return con;
                
    }
    
    public static void close() {
        // 7. 接続を閉じる
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
       
    }

}
