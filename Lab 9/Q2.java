package lab;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args){
        PersonProfile s1 = new Student("Ooi",'M',"234/03/2000");

    }
    
}

class PersonProfile{
    protected String name,dob;
    protected char gender;

    public PersonProfile(String name,char gender,String dob){
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);
    }
}

class Student extends PersonProfile{
    protected ArrayList<String[]> course;
    protected ArrayList<String> semesters,sessions;
    protected ArrayList<Integer> marks;
    protected String fileName;
    
    
    public Student(String name,char gender,String dob){
        super(name,gender,dob);
        this.fileName = "lab//DataFile//course.txt";

        course = new ArrayList<String[]>();
        semesters = new ArrayList<String>();
        sessions = new ArrayList<String>();
        marks = new ArrayList<Integer>();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine())!=null){
                String courseCode = line;
                String courseName = reader.readLine();
                String semester = reader.readLine().strip();
                String session = reader.readLine().strip();
                int mark = Integer.parseInt(reader.readLine().strip());

                course.add(new String[]{courseCode,courseName});
                semesters.add(semester);
                sessions.add(session);
                marks.add(mark);
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        

        super.display();
        System.out.println(" ");
        for(int i=0;i<course.size();i++){
            System.out.println("Course Code: " + course.get(i)[0]);
            System.out.println("Course Name: " + course.get(i)[1]);
            System.out.println("Semester: " + semesters.get(i) + " Session: " + sessions.get(i));
            System.out.println("Marks: " + marks.get(i) + " Grade: " + getGrade().get(i));
            System.out.println(" ");
        }
    }

    public ArrayList<String> getGrade(){
        ArrayList<String> grades = new ArrayList<String>();
        String grade;
        for(int mark:marks){
            if(mark<35){
                grade = "F";
            }else if(mark<45){
                grade = "E";
            }else if(mark<50){
                grade = "D";
            }else if(mark<55){
                grade = "C";
            }else if(mark<60){
                grade = "C+";
            }else if(mark<65){
                grade = "B-";
            }else if(mark<70){
                grade = "B";
            }else if(mark<75){
                grade = "B+";
            }else if(mark<85){
                grade = "A-";
            }else{
                grade = "A";
            }
            grades.add(grade);
        }
        
        return grades;
        
    }
}

