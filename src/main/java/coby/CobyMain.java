package coby;

public class CobyMain {

    public static void main(String[] args) {
        Student student=new Student(1);
        Student student1=(Student) student.clone();
        System.out.println(student==student1);
        student.setAge(2);
        System.out.println(student);
        System.out.println(student1);
    }

}
