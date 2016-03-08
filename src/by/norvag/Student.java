package by.norvag;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

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
    private int[] Marks;

    public Student(BufferedReader reader) throws IOException {
        System.out.print("ID: ");
        this.id = Integer.parseInt(reader.readLine());
        System.out.print("SURNAME: ");
        this.Surname = reader.readLine();
        System.out.print("NAME: ");
        this.Name = reader.readLine();
        System.out.print("MIDDLE NAME: ");
        this.MiddleName = reader.readLine();
        System.out.print("ADDRESS: ");
        this.Address = reader.readLine();
        System.out.print("PHONE NUMBER: ");
        this.PhNumber = reader.readLine();
        System.out.print("MARKS: ");
        this.Marks = new int[5];
        for (int i = 0; i < Marks.length; i++) {
            Marks[i] = Integer.parseInt(reader.readLine());
        }
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

    public String getAddress() {
        return Address;
    }

    public String getPhNumber() {
        return PhNumber;
    }

    public int[] getMarks() {
        return Marks;
    }

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

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhNumber(String PhNumber) {
        this.PhNumber = PhNumber;
    }

    public void setMarks(int[] Marks) {
        this.Marks = Marks;
    }

    public String toString() {
        return this.id + " " + this.Surname + " " + this.Name + " " + this.MiddleName + " " + this.Address + " " + this.PhNumber + " " + Arrays.toString(Marks);
    }

    public void UnsatisfactoryRatings() throws IOException {
        for (int i = 0; i < 5; i++) {
            if (this.Marks[i] < 4) {
                System.out.println(toString() + " GPA = " + AGPA());
                break;
            }
        }
    }

    public void GPA(BufferedReader reader, double EntGPA) throws IOException {
        double GPA = 0.0;

        for (int i = 0; i < 5; i++) {
            GPA += this.Marks[i];
        }

        GPA = GPA / 5;

        if (EntGPA < GPA)
            System.out.println(toString() + " GPA = " + AGPA());
    }

    public double AGPA() throws IOException {
        double GPA = 0.0;
        for (int i = 0; i < 5; i++) {
            GPA += this.Marks[i];
        }

        return GPA / 5;
    }
}