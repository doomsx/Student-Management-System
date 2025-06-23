import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();


    public void addStudents (Student s){
        students.add(s);
    }

    public ArrayList<Student> getAllStudents(){
        return students;
    }

    public Student searchById(String id){
        for(Student s : students){
            if(s.getId().equals(id)){
                return s;
            }
        }
        return null;
    }

    public boolean deleteById(String id){
        Student s = searchById(id);
        if (s != null){
            students.remove(s);
            return true;
        }
        return false;
    }

    public boolean updateStudent(String name, String id, int age, String grade){
        Student s = searchById(id);
        if(s != null){
            s.setName(name);
            s.setId(id);
            s.setAge(age);
            s.setGrade(grade);
            return true;
        }
        return false;
    }
}
