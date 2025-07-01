package Lecture;

public class Lecture {
    private  String nameLecture;
    private Student [] students;
    private Teacher [] teachers;
    private String place;
    private int capacity;
    private int counter;

    public Lecture(String nameLecture) {
        this.nameLecture = nameLecture;
        this.teachers = new Teacher[2];
        this.place= "Mindera";
        this.capacity= 20;
        this.students = new Student[this.capacity];

    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNameLecture() {
        return nameLecture;
    }

    public int getCapacity() {
        return capacity;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Student[] getStudents() {
        return students;
    }

//    public void addNewStudent (Student newStudent){
////        if (this.students.length< this.capacity){
////            Student [] newStudents = new Student[this.students.length +1];
////            for (int i = 0; i < this.students.length; i++) {
////                newStudents [i]= this.students [i];
////                }
////            newStudents [this.students.length] = newStudent;
////            this.students= newStudents;
////
//        }
    public void addNewStudent (Student newStudent){
        if (this.counter<this.capacity)
        this.students [this.counter]= newStudent;
        this.counter++;
    }
    public void addNewStudent (Student [] newStudents) {
        for (Student temp : newStudents) {
            addNewStudent(temp);
        }
        }
        public void printAllStudents() {
            for (Student temp : this.students) {
                if (temp != null) {
                    System.out.println(temp.getName());

                }
            }
        }
    }