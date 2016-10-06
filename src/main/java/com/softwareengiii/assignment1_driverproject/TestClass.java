package com.softwareengiii.assignment1_driverproject;
import com.software_eng_assingment1_maven.*;
import java.util.*;
import org.joda.time.*;

/**
 * @author Aoife McDonagh, 13411348 <https://github.com/aoifemcdonagh>
 */
public class TestClass {
    public static void main(String args[]){
        // Create Students
        Student s1 = new Student("Alex", 18, "20/11/1997", 13411349);
        Student s2 = new Student("John", 19, "20/11/1996", 13411348);
        Student s3 = new Student("Mary", 20, "20/11/1995", 13411347);
        Student s4 = new Student("Emma", 21, "20/11/1994", 13411346);
        Student s5 = new Student("Frank", 22, "20/11/1993", 13411345);
        
        // Create modules
        Module softwareEng = new Module("Software Engineering III", "CT417");
        Module digitalSystems = new Module("Digital Systems", "EE432");
        
        LocalDate startDate = new LocalDate(2016,9,1);
        LocalDate endDate = new LocalDate(2017,5,30);
        
        // Create course programmes
        CourseProgramme BP4 = new CourseProgramme("4BP", startDate, endDate);
        CourseProgramme CT4 = new CourseProgramme("4CT", startDate, endDate);
        
        ArrayList<Student> studentsSE = new ArrayList(); // Software Eng students
        ArrayList<Student> studentsDS = new ArrayList(); // Digital systems students
        
        // Adding modules to courses
        BP4.addModule(softwareEng);
        BP4.addModule(digitalSystems);
        
        CT4.addModule(softwareEng);
        
        // Adding students to courses
        BP4.addStudent(s1);
        BP4.addStudent(s2);
        BP4.addStudent(s3);
        
        CT4.addStudent(s4);
        CT4.addStudent(s5);
        
        // Print out info for each student via course.
        for(Student s : BP4.getStudents()){
            s.printInfo();
        }
        for(Student s : CT4.getStudents()){
            s.printInfo();
        }
    }
}
