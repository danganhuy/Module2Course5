import java.util.Scanner;

public class Exercise1 {
    // [Thực hành] Static Method
    public static void main(String[] args) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        s1.display();
        s2.display();
        s3.display();

        Student.change();

        s1.display();
        s2.display();
        s3.display();
    }
}
