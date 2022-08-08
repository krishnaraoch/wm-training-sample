package com.wavemaker.training;

import com.wavemaker.training.dao.StudioDAO;
import com.wavemaker.training.db.model.Student;

import java.util.List;

public class Main {

    private StudioDAO studioDAO = new StudioDAO();

    public  void printStudents() {
        List<Student> listOfStudents = studioDAO.getListOfStudents();
        if(listOfStudents != null) {
            for (Student student : listOfStudents) {
                System.out.println(student);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Main Program");
        new Main().printStudents();
    }
}
