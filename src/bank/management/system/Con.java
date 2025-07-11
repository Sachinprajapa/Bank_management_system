package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;

public class Con {
    Connection connection;
    public Con(){
        try{
            connection = DriverManager.getConnection("");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
