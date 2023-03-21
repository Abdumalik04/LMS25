package dataBaza;

import service.Gender;

public class Student {
    private long id;
    private String firstName;
    private String lastName;

    private Gender gender;
    private String email;
    private int password;
    public Student(){

    }

    public Student(long id, String firstName, String lastName, Gender gender, String email, int password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName: " + firstName +
                ", lastName: " + lastName +
                ", email:"+email+", password"+password+
                ", gender:" + gender;
    }


}
