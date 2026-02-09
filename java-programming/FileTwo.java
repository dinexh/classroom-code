import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
public class FileTwo {
    public static void main(String[] args) {
        try{
            Student S1 = new Student(123,"SitaRama");
            FileOutputStream fos = new FileOutputStream("F.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(sl);
            oos.flush();
            oss.close();
            System.out.println("Serialization Done");
        }catch(Exception e){System.out.println(e);}
    }
}
class Student implements Serializable
{
    int id;
    String name;
    public Student
}