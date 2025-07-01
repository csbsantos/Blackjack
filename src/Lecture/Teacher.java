package Lecture;

public class Teacher {
    private String fullName;

    public Teacher(String fullName) {
        this.fullName = fullName;
    }

    public void teaching (){
        System.out.println("Teaching a new lecture");
    }

    public String getFullName() {
        return fullName;
    }

}
