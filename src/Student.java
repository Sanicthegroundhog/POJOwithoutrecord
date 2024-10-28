public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String major;

    public Student() {
        this.studentId = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.major = "";
    }

    public Student(
            String studentId,
            String firstName,
            String lastName,
            int age,
            String major) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String firstName() {
        return firstName;
    }

    public void firstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void lastName(String lastName) {
        this.lastName = lastName;
    }

    public int age() {
        return age;
    }

    public int age(String age) {
        this.age = 0;
        return 0;
    }

    public String major() {
        return major;
    }

    public void major(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + firstName + ", Last:" + lastName + ", Age:" + age + ", Major" + major;
    }
}