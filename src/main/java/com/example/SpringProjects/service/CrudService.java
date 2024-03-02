package com.example.SpringProjects.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.SpringProjects.model.CrudModel;

public class CrudService {
    
    Connection con;

    public CrudService() {
      try {
        String url = String.format("jdbc:mysql//localhost:3306/db_patient_spring_boot");
        String name = "root";
        String pwd = "";

        Class.forName("con.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, name, pwd);
      } catch (Exception e) {
        System.out.println(e + "error");
      }
    }

    public CrudModel insertUser(CrudModel user){
        String insert = "insert int person(name,age) values(?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setString(1, user.getName());
            ps.setLong(2, user.getAge());

            ps.execute();
        } catch (Exception e) {
            System.out.println(e + "data insert unsuccess");
        }

        return user;
    }

    public ArrayList<CrudModel> getUser() throws SQLException{
        ArrayList<CrudModel> data = new ArrayList<>();
        String select = "select * from person";
        PreparedStatement ps = con.prepareStatement(select);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            CrudModel model = new CrudModel();
            model.setName(rs.getString("name"));
            model.setAge(rs.getInt("age"));

            data.add(model);
        }

        return data;
    }
}
