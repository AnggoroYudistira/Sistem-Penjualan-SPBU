/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author MY
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil konek driver");
        }catch(ClassNotFoundException ex){
            System.out.println("gagal konek"+ex);
        }
        String url = "jdbc:mysql://localhost/spbu1";
        
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Konek Database");
        } catch (Exception e) {
            System.out.println("Gagal Konek Database " + e);
        }
        return koneksi;
    }
}