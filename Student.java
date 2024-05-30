package basicjava;

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double cg;
    
    public Student(String name, int id, double cg) {
        this.name = name;
        this.id = id;
        this.cg = cg;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getCg() {
        return cg;
    }
    public static void main(String[] args) {
        Scanner gogo = new Scanner(System.in);
        System.out.println("Enter 1st Student's Name, Id, Cgpa:");
        
        String name1 = gogo.nextLine();
        int id1 = gogo.nextInt();
        double cg1 = gogo.nextDouble();
        
        Student student1 = new Student(name1, id1, cg1);
        
        System.out.println("Enter 2nd Student's Name, Id, Cgpa:");
        
        String name2 = gogo.next();
        int id2 = gogo.nextInt();
        double cg2 = gogo.nextDouble();
        
        Student student2 = new Student(name2, id2, cg2);
        
        System.out.println("Student Information:");
        System.out.println("Student 1:\nName: " + student1.getName() + ", ID: " +
        student1.getId() + ", CGPA: "
        + student1.getCg());
        System.out.println("Student 2:\nName: " + student2.getName() + ", ID: " +
        student2.getId() + ", CGPA: "
        + student2.getCg());
        }
}
