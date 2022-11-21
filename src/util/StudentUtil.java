package util;

import beans.Student;
import main.Config;

public class StudentUtil {
    public static Student fillStudent() {
//        String name = InputUtil.requireText("enter name.");
//        String surname = InputUtil.requireText("enter surname.");
//        int age = InputUtil.requireNumber("enter age.");
//        String classname = InputUtil.requireText("enter classname.");

        String name =MenuUtil.requireName();
        String surname = MenuUtil.requireSurname();
        int age = MenuUtil.requireAge();
        String classname = MenuUtil.requireClassname();

        Student st = new Student(name, surname, age, classname);
        return st;
    }

    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            System.out.println((i + 1) + student.getFullInfo());
        }
    }

    public static void registerStudent() {
        int count = InputUtil.requireNumber("How many students will register?");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Register.");

            Config.students[i] = StudentUtil.fillStudent();
        }
        System.out.println("Registration completed successfully!");
        StudentUtil.printAllRegisteredStudents();
    }

    public static void findStudentsAndPrint() {
        String text = InputUtil.requireText("type name,surname or class name");

        Student[] result = findStudents(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullInfo());
        }
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(text) || student.getSurname().contains(text) || student.getClassName().contains(text)) {
                count++;
            }
        }


        Student[] result = new Student[count];
        int found = 0;


        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(text) || student.getSurname().contains(text) || student.getClassName().contains(text)) {
                result[found++] = student;
            }
        }
        return result;
    }

    public static void updateStudent(){
        StudentUtil.printAllRegisteredStudents();
        int i = InputUtil.requireNumber("Which student do you want to update?");
        System.out.println("Enter information");
        Student s = StudentUtil.fillStudent();
        Config.students[i-1] = s;
    }
}


