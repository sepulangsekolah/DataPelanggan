package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author lay
 */
public class conek {
    public static Connection koneksi;
    public static Statement stm;
    
    public static void main(String args[]){
        
      getkoneksi();
    }
    
  public static Connection getkoneksi(){
     try {
            String url = "jdbc:mysql://localhost/penjualan";
            String user = "root";
            String password = "";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = (Connection) DriverManager.getConnection(url,user,password);
            
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi gagal");
        }
     
     return koneksi;
  }
}

   