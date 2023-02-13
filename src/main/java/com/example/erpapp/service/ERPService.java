package com.example.erpapp.service;

import com.example.erpapp.dto.StudentPercentageDTO;
import com.example.erpapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ERPService {
    private static final List<Student> students= new ArrayList<>();
    static{
        Student s1= new Student(1,"Aman","Male",List.of(80.0,90.0,90.0,80.0,95.0),"Ghaziabad");
        students.add(s1);
        Student s2= new Student(2,"Anant","Male",List.of(80.0,90.0,80.0,80.0,95.0),"Ghaziabad");
        students.add(s2);
        Student s3= new Student(3,"Rajan","Male",List.of(80.0,90.0,70.0,80.0,95.0),"Ghaziabad");
        students.add(s3);
        Student s4= new Student(4,"Sushant","Male",List.of(80.0,90.0,60.0,80.0,95.0),"Ghaziabad");
        students.add(s4);
        Student s5= new Student(5,"Ishan","Male",List.of(80.0,90.0,90.0,95.0,95.0),"Ghaziabad");
        students.add(s5);
    }
    public List<Student>findAll(){
        return students;
    }
    public Student findByID(int rollno){
        for(Student student: students){
            if(student.getRollnumber()==rollno) {
                return student;
            }
        }
        return null;
    }
//    public Student findTopper(){
//        return
//    }
    public List<StudentPercentageDTO> findAllPercentage(){
        List<StudentPercentageDTO> percentages= new ArrayList<>();
        for(Student student: students){
            List<Double> marks= student.getMarks();
            Double perc= 0.0;
            for(Double mark: marks){
                perc+=mark;
            }
            perc*=0.2;
            StudentPercentageDTO studentPercentageDTO= new StudentPercentageDTO(student.getRollnumber(),student.getName(),perc);
            percentages.add(studentPercentageDTO);
        }
        return percentages;
    }

}
