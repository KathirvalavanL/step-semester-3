package week3.practice_problems;

class Student {
    String name;
    int attendance;
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class M5_StudentCollegeInfo {
    public static void main(String[] args) {
        Student student1 = new Student("Aarav", 85);
        Student student2 = new Student("Diya", 92);

        Student.printCollegeInfo();
    }
}
