public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student = new Student("narekha", "hakobyan94.nh@gmail.com", "19051994");

        studentService.serializeToXml(student);

        Student student1 = studentService.deserializeToXml();

        student1.printInfo();
    }
}
