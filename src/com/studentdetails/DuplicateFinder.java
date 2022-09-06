package com.studentdetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateFinder {

    List<Student> listOfStudent = new ArrayList<>();
    List<Student> duplicates = new ArrayList<>();

    List<Student> distint = new ArrayList<>();
    Student s = new Student("Dinuka", 20, "MV");

    public DuplicateFinder(List<Student> studentList){
        this.listOfStudent = studentList;


    }

    public List<Student> getDuplicates(){

        for (Student st : listOfStudent){
            this.duplicates.add(st);
        }

        for(int i=0; i<this.duplicates.size(); i++){
            for (int j = i+1; j < this.duplicates.size(); j++) {
                if(this.duplicates.get(i).getName()==this.duplicates.get(j).getName()
                        && this.duplicates.get(i).getAge()==this.duplicates.get(j).getAge()
                        && this.duplicates.get(i).getSchool()==this.duplicates.get(j).getSchool()){
                    duplicates.remove(j);
                }
                else{
                    duplicates.remove(i);
                }
            }
        }

        System.out.println("Dulpicate Students");
        for (Student st : duplicates){
            System.out.println(st.getName()+" "+st.getSchool()+" "+st.getAge());
        }
        System.out.println();

        return duplicates;
    }

    public List<Student> getDistintList(){

        for (Student st : listOfStudent){
            this.distint.add(st);
        }

        for(int i=0; i<this.distint.size(); i++){
            for (int j = i+1; j < this.distint.size(); j++) {
                if(this.distint.get(i).getName()==this.distint.get(j).getName()
                        && this.distint.get(i).getAge()==this.distint.get(j).getAge()
                        && this.distint.get(i).getSchool()==this.distint.get(j).getSchool()){
                    distint.remove(j);
                }
            }
        }

        System.out.println("Distint Students");
        for (Student st : distint){
            System.out.println(st.getName()+" "+st.getSchool()+" "+st.getAge());
        }
        System.out.println();

        return distint;
    }

    public Student getStudentByName(String name){

        Student nameByStudent=null;

        List<String> names = new ArrayList<>();

        for (Student st: listOfStudent){
            names.add(st.getName());
        }

        for (int i=0; i < listOfStudent.size(); i++){
            if(names.get(i)==name){
                System.out.println(listOfStudent.get(i).getName()+" "+listOfStudent.get(i).getAge()+" "+listOfStudent.get(i).getSchool()+" ");
                nameByStudent=listOfStudent.get(i);
                break;
            } else if(i==listOfStudent.size()-1){
                throw new RuntimeException("StudentNotFoundException");
            }
        }

        return nameByStudent;
    }

}
