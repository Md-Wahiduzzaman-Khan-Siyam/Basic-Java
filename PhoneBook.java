package basicjava;

import java.util.ArrayList;

public class PhoneBook {
    private String name;
    private int code;
    private double price;
    private String brand;
    public void insertRecord(String name, int code, double price, String brand) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.brand = brand;
    }
    public void displayRecord() {
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
    }
    public boolean searchRecord(String keyword) {
        if (keyword.equalsIgnoreCase(name) ||
            keyword.equalsIgnoreCase(Integer.toString(code)) ||
            keyword.equalsIgnoreCase(brand)) {
            return true;
        }
        return false;
    }
    public int getCode() {
        return code;
    }
    public void deleteRecord(ArrayList<PhoneBook> list, int code) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode() == code) {
                list.remove(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<PhoneBook> list = new ArrayList<PhoneBook>();
        
        PhoneBook m1 = new PhoneBook();
        m1.insertRecord("Motorola Edge 30 Ultra", 1001, 999.99, "Motorola");
        list.add(m1);
        
        PhoneBook m2 = new PhoneBook();
        m2.insertRecord("iPhone 13 Pro Max", 1002, 1199.99, "Apple");
        list.add(m2);
        
        PhoneBook m3 = new PhoneBook();
        m3.insertRecord("Samsung Galaxy S22 Ultra", 1003, 1099.99, "Samsung");
        list.add(m3);
        
        System.out.println("Mobile List:");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).displayRecord();
            System.out.println();
        }

        System.out.println("\nSearch for Mobile:");
        
        String keyword = "Apple";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).searchRecord(keyword)) {
                list.get(i).displayRecord();
                System.out.println();
            }
        }
        System.out.println("\nDelete Mobile:");
        m2.deleteRecord(list, m2.getCode());
        
        System.out.println("Mobile List:");
        
        for (int i = 0; i < list.size(); i++) {
            list.get(i).displayRecord();
            System.out.println();
        }
    }
}