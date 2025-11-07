import java.io.*;
import java.util.*;
public class Q6{
    public static void main(String[] args) {
       Student std1 = new Student("Dablu",23,46,37);
       System.out.println("Total Marks:"+std1.getTotalMarks());
       System.out.println("Average Marks:"+std1.getAverageMarks());
    }
}
class Student{
    private String name;
    private int englishMarks;
    private int scienceMarks;
    private int mathsMarks;

    public Student(String name, int englishMarks, int scienceMarks, int mathsMarks) {
        this.name = name;
        this.englishMarks = englishMarks;
        this.scienceMarks = scienceMarks;
        this.mathsMarks = mathsMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public int getTotalMarks(){
        return englishMarks+scienceMarks+mathsMarks;
    }
    public double getAverageMarks(){
        return getTotalMarks()/3;
    }
}