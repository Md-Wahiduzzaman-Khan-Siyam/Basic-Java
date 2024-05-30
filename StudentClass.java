package basicjava;

import java.util.Scanner;

public class StudentClass {
    private String name;
    private int id;
    private double cg;
    
    public void insertRecord(String name, int id, double cg) {
        this.name = name;
        this.id = id;
        this.cg = cg;
    }
    public void displayRecord() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cg);
    }
    public static void main(String[] args) {
        Scanner gogo = new Scanner(System.in);
        
        StudentClass s1 = new StudentClass();
        System.out.println("Enter 1st Student's Name, Id & Cgpa: ");
        String name1 = gogo.next();
        int id1 = gogo.nextInt();
        double cg1 = gogo.nextDouble();
        
        s1.insertRecord(name1, id1, cg1);
        
        StudentClass s2 = new StudentClass();
        System.out.println("Enter 2nd Student's Name, Id & Cgpa: ");
        String name2 = gogo.next();
        int id2 = gogo.nextInt();
        double cg2 = gogo.nextDouble();
        
        s2.insertRecord(name2, id2, cg2);
        
        System.out.println("Record of Student 1:");
        s1.displayRecord();
        System.out.println("Record of Student 2:");
        s2.displayRecord();
    }
}
