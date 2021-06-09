import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentService {
    public void serializeToXml(Student student) {
        try(FileOutputStream fos = new FileOutputStream("datas\\datas.xml");
            XMLEncoder encoder = new XMLEncoder(fos)) {
            encoder.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Student deserializeToXml() {
        Student student = null;

        try(FileInputStream fis = new FileInputStream("datas\\datas.xml");
            XMLDecoder decoder = new XMLDecoder(fis)) {
            student = (Student) decoder.readObject();
            return student;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return student;
    }
}
