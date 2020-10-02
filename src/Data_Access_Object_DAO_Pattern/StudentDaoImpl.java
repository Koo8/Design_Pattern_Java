package Data_Access_Object_DAO_Pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    //list is working as a database
    List<Student> students;
    List<String[]> objects;

    public StudentDaoImpl(){
      objects = new FileReading("C:\\Users\\NancyPC\\Desktop\\Design_Pattern_Java\\src\\StudentDataFile").readFile();
        students = new ArrayList<>();
        for (int i = 0; i <objects.size() ; i++) {
            Student newStudent = new Student((objects.get(i))[0],Integer.parseInt((objects.get(i))[2]));
            students.add(newStudent);

        }
    }
    @Override
    public void deleteStudent(int index) {
        students.remove(index);
        System.out.println("There are " + students.size() + " students." );

    }

    //retrive list of students from the database
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student, int index) {
        students.get(index).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }
}
