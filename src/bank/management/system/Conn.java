package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn() {
        try{
            c = DriverManager.getConnection("","root","");// add your database url here like this "jdbc:mysql://database name" add password here like this "your password"
            s=c.createStatement();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
