package com.ParulStudent;

import com.ParulStudent.dao.StudentDao;
import com.ParulStudent.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Student s1 = new Student(410,"Nitish","OS");
       Student s2 = new Student(357,"Mhendi","COM");
       Student s3 = new Student(365,"Ram","Network");
       
       StudentDao dao = new StudentDao();
       dao.saveStudent(s1);
       dao.saveStudent(s2);
       dao.saveStudent(s3);
       
    }
}
