package Data_Access_Object_DAO_Pattern;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void updateStudent(Student student, int index);
    void deleteStudent(int index);
}
