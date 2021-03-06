package java8;

public class Student implements defaultInterfaceDemo{
    private String firstName;
    private String lastName;
    private Integer grade;
    public Integer passGrade = 60;

    public Student(String firstName, String lastName, Integer gradle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = gradle;
    }

    public boolean printIsPass() {
        return grade >= passGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
