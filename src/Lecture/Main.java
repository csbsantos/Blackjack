package Lecture;

public class Main {
    public static void main(String[] args) {
        Student s1= new Student("Cláudia", 1);
        Student s2= new Student("Rui", 2);
        Student s3= new Student("João", 3);

        Teacher t1= new Teacher("Joaquim Almeida");
        Teacher t2= new Teacher("Carlos Peixoto");

        Lecture l1= new Lecture("Java");

        l1.addNewStudent(s1);
        l1.addNewStudent(s2);
        l1.addNewStudent(s3);

//   l1.addNewStudent(new Student []{s1,s2,s3});
//
//   Student [] bunchOfStudents= new Student[]{s1, s2, s3};
//   l1.addNewStudent(bunchOfStudents);
l1.printAllStudents();
    }
}
