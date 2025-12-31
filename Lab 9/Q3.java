package lab;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args){
        PersonProfile l1 = new Lecturer("Ooi",'M',"234/03/2000");
    }
    
}

class Lecturer extends PersonProfile{
    protected ArrayList<String[]> course;
    protected ArrayList<String> semesters,sessions;
    protected ArrayList<Double> creditHours;
    protected ArrayList<Integer> noOfStudents;
    protected String fileName;

    public Lecturer(String name,char gender,String dob){
        super(name,gender,dob);
        this.fileName = "lab//DataFile//lecturer.txt";

        course = new ArrayList<String[]>();
        semesters = new ArrayList<String>();
        sessions = new ArrayList<String>();
        creditHours = new ArrayList<Double>();
        noOfStudents = new ArrayList<Integer>();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine())!=null){
                String courseCode = line;
                String courseName = reader.readLine();
                String semester = reader.readLine().strip();
                String session = reader.readLine().strip();
                double creditHour = Integer.parseInt(reader.readLine().strip());
                int noOfStudent = Integer.parseInt(reader.readLine().strip());

                course.add(new String[]{courseCode,courseName});
                semesters.add(semester);
                sessions.add(session);
                creditHours.add(creditHour);
                noOfStudents.add(noOfStudent);
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        super.display();
        System.out.println(" ");
        updateCredit();
        for(int i=0;i<course.size();i++){
            System.out.println("Course Code: " + course.get(i)[0]);
            System.out.println("Course Name: " + course.get(i)[1]);
            System.out.println("Semester: " + semesters.get(i) + " Session: " + sessions.get(i));
            System.out.println("Credit Hours: " + creditHours.get(i) + " No. Of Students: " + noOfStudents.get(i));
            System.out.println(" ");
        }
    }

    public void updateCredit(){
        for(int i=0;i<creditHours.size();i++){
            int no = noOfStudents.get(i);
            if(no>=150){
                creditHours.set(i,creditHours.get(i)*3);
            }else if(no>=100){
                creditHours.set(i,creditHours.get(i)*2);
            }else if(no>=50){
                creditHours.set(i,creditHours.get(i)*1.5);
            }else{
                
            }

        }

    } 
}

