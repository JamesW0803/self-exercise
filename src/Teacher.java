public class Teacher {
    String designation = "Teacher";
    String collegeName = "BusyQA";

    void does(){
        System.out.println("Teaching.....");
    }
}

class ComputerTeacher extends Teacher{
    void teach(){
        System.out.println("Teaching......");
    }

    public static void main(String[] args) {
        ComputerTeacher ct = new ComputerTeacher();
        ct.does();
        ct.teach();
    }
}


