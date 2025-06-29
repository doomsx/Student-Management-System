public class Student{
    private String id;
    private String name;
    private int age;
    private String grade;

    public Student(String id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getId() {return this.id;}
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }

    @Override
    public String toString(){ return "\nID: " + id + "\nName: " + name + "\nAge: " + age + "\nGrade: " + grade; }
}
