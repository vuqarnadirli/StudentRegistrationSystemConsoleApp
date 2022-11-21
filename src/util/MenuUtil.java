package util;

public class MenuUtil {
    public static void processMenu(int selectedMenu){
//        if (selectedMenu == 1) {
//            StudentUtil.registerStudent();
//
//        } else if (selectedMenu == 2) {
//            StudentUtil.printAllRegisteredStudents();
//        } else if (selectedMenu == 3) {
//            StudentUtil.findStudentsAndPrint();
//        } else if (selectedMenu == 4) {
//            StudentUtil.updateStudent();
//        }

        switch (selectedMenu){
            case 1:
                StudentUtil.registerStudent();
                break;
            case 2:
                StudentUtil.printAllRegisteredStudents();
                break;
            case 3:
                StudentUtil.findStudentsAndPrint();
                break;
            case 4:
                StudentUtil.updateStudent();
                break;
            case 5:
                System.exit(0);
        }
    }

    public static String requireName(){
        return InputUtil.requireText("enter name.");
    }

    public static String requireSurname(){
        return InputUtil.requireText("enter surname.");
    }

    public static int requireAge(){
        return InputUtil.requireNumber("enter age.");
    }

    public static String requireClassname(){
        return InputUtil.requireText("enter classname.");
    }

}
