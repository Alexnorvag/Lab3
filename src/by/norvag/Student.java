package by.norvag;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by norvag on 11.02.2016.
 * Создать классы, спецификации которых приведены ниже. Определить конструкторы и
 * методы setТип(), getТип(), toString(). Определить дополнительно методы в классе,
 * создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль.
 * Student: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
 * Создать массив объектов. Вывести:
 * a) список абитуриентов, имеющих неудовлетворительные оценки;
 * b) список абитуриентов, средний балл у которых выше заданного;
 * c) выбрать заданное число n абитуриентов, имеющих самый высокий
 * средний балл (вывести также полный список абитуриентов, имеющих полупроходной балл).
 */
public class Student {
    private int id;
    private String Surname;
    private String Name;
    private String MiddleName;
    private String Address;
    private String PhNumber;
    private int[] Marks = new int[5];

    public Student (int id, String Surname, String Name, String MiddleName, String Address, String PhNumber, int Marks[]) {
        this.id = id;
        this.Surname = Surname;
        this.Name = Name;
        this.MiddleName = MiddleName;
        this.Address = Address;
        this.PhNumber = PhNumber;
        this.Marks = Marks;
    }

    public int getId() {
        return id;
    }
    public String getSurname() {
        return Surname;
    }
    public String getName() {
        return Name;
    }
    public String getMiddleName() {
        return MiddleName;
    }
    public String getAddress() { return Address; }
    public String getPhNumber() { return PhNumber; }
    public int[] getMarks() { return Marks; }

    public void setId(int id) {
        this.id = id;
    }
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }
    public void setAddress(String Address) { this.Address = Address; }
    public void setPhNumber(String PhNumber) { this.PhNumber = PhNumber; }
    public void setMarks(int[] Marks) { this.Marks = Marks; }

    public String toString() {
        return this.Name + " " + this.Surname;
    }

    public void show () {
        System.out.println("id: " + getId());
        System.out.println("Surname: " + getSurname());
        System.out.println("Name: " + getName());
        System.out.println("Middle name: " + getMiddleName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhNumber());
        System.out.println("Marks: " + getMarks());
    }

    public void UnsatisfactoryRatings() {
        for (int i = 0; i < 5; i++) {
            /*if(getMarks()[i] < 4) {

            }*/
            System.out.println(getMarks()[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Number of students: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int NumOfStud = Integer.parseInt(reader.readLine());
        Student[] students = new Student[NumOfStud];
        students[0] = new Student(1, "Gaqwd", "Aer", "Valeads", "Bs", "375294444447", {1, 2, 4, 6, 5});
        students[0].UnsatisfactoryRatings();
    }
}
