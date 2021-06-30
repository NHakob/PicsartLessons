public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student = Student.INSTANCE;
        student.username = "narekha";
        student.email = "hakobyan94.nh@gmail.com";
        student.password = "asadsa";

        studentService.serializeToXml(student);


        Student student1 = studentService.deserializeToXml();

        student1.printInfo();
    }
}
