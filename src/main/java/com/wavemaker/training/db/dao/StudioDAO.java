package com.wavemaker.training.db.dao;


import com.wavemaker.training.db.connection.MySQLConnectionUtility;
import com.wavemaker.training.db.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class StudioDAO {

    public List<Student> getListOfStudents() {
        List<Student> studentList = new ArrayList<>();
        Connection connection = MySQLConnectionUtility.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENTS");
            while(resultSet.next()) {// points to Row ON each iteration
                //ID, NAME, AGE, ADDRESS
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                int age = resultSet.getInt("AGE");
                String address = resultSet.getString("ADDRESS");
                studentList.add(new Student(id, name, age, address));
            }
        } catch (SQLException e) {
            //TODO
        }
        return studentList;
    }

    public void createStudent() {
        //TDOO
    }
}
