package com.softwareengiii.assignment1_driverproject;
import com.software_eng_assingment1_maven.*;
import java.util.*;
import org.joda.time.*;

/**
 * @author Aoife McDonagh, 13411348 <https://github.com/aoifemcdonagh>
 */
public class TestClass {
    public static void main(String args[]){
        Student s1 = new Student("Alex1", 18, "20/11/1997", 13411349);
        Student s2 = new Student("Alex2", 19, "20/11/1996", 13411348);
        Student s3 = new Student("Alex3", 20, "20/11/1995", 13411347);
        Student s4 = new Student("Alex4", 21, "20/11/1994", 13411346);
        Student s5 = new Student("Alex5", 22, "20/11/1993", 13411345);
        
        List<Student> students = new ArrayList();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        
        Module softwareEng = new Module("Software Engineering III", "CT417", students);
        
        List<Module> modules = new ArrayList();
        modules.add(softwareEng);
        
        LocalDate startDate = new LocalDate(2016,9,1);
        LocalDate endDate = new LocalDate(2017,5,30);
        
        CourseProgramme BP4 = new CourseProgramme("4BP", modules, startDate, endDate);
        
        System.out.println("\nModules:");
        
        List<Module> moduleList = BP4.getModules();
        
        for (Module module : moduleList) {
            System.out.println(module.getModuleName());
        }
    }
}
