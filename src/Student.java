public class Student {
    int SID;
    String SName;
    int sub1, sub2, sub3;

    void getStuData(int id, String name){
        SID = id;
        SName = name;
    }

    void getStuMarks(int subject1, int subject2, int subject3){
        sub1 = subject1;
        sub2 = subject2;
        sub3 = subject3;
    }

    void totalMarks(){
        int total = sub1 + sub2 + sub3;
        System.out.println("Student ID: " + SID);
        System.out.println("Student name: " + SName);
        System.out.println("Total marks: " + total);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getStuData(22004837, "James");
        s1.getStuMarks(90,90,100);
        s1.totalMarks();
    }
}
