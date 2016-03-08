package by.norvag;

import java.io.BufferedReader;
import java.io.IOException;
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

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Number of students: ");
        int NumOfStud = Integer.parseInt(reader.readLine());

        Student[] students = new Student[NumOfStud];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(reader);
            System.out.println();
        }

        System.out.println("A list of students who have unsatisfactory ratings:");
        for (int i = 0; i < students.length; i++) {
            students[i].UnsatisfactoryRatings();
        }

        System.out.println("A list of students, who have GPA greater than the specified:");
        System.out.print("Enter the GPA: ");
        double EntGPA = Double.parseDouble(reader.readLine());
        for (int i = 0; i < students.length; i++) {
            students[i].GPA(reader, EntGPA);
        }

        System.out.println("Select a predetermined number n of entrants with the highest GPA:");
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].AGPA() < students[j + 1].AGPA()) {
                    Student tmp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;
                }
            }
        }

        System.out.print("Enter n: ");
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].toString() + " GPA = " + students[i].AGPA());
        }

        System.out.println("Students with semi-GPA: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].AGPA() < EntGPA && students[i].AGPA() > EntGPA / 2)
                System.out.println(students[i].toString() + " GPA = " + students[i].AGPA());
        }
    }
}
