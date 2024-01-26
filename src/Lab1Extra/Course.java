package Lab1Extra;

public class Course {
    String courseName;
    String [] students;
    int numberOfStudents;
    public Course(String courseName){
        this.courseName = courseName;
        students = new String[2];
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudents(String studentName){
        if (numberOfStudents == students.length){
            String [] newStudents = new String[students.length * 2];
            System.arraycopy(students, 0, newStudents, 0, students.length);
            students = newStudents;
        }
        students[numberOfStudents] = studentName;
        numberOfStudents ++;
    }

    public void dropStudent(String studentName){
        boolean found = false;
        if (numberOfStudents == 0){
            System.out.println("There is not students yet. ");
            return;
        }
        for (int i = 0; i < students.length; i++){
            if (students[i].equalsIgnoreCase(studentName)){
                students[i] = students[numberOfStudents - 1];
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Error: Student not found.");
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public void clear(){
        for (int i = 0; i < students.length; i++){
            students[i] = null;
            numberOfStudents = 0;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("List of students name: ");
        for (int i = 0; i < numberOfStudents; i++){
            sb.append(students[i]);
            if (i < numberOfStudents - 1){
                sb.append(", ");
            }
        }
        sb.append("\nNumber of students: ").append(numberOfStudents);
        return sb.toString();
    }

    public static void main(String[] args) {
        Course course = new Course("Math");
        course.addStudents("J");
        System.out.println(course.toString());
        course.addStudents("Z");
        System.out.println(course.toString());
        course.addStudents("D");
        System.out.println(course.toString());
        course.addStudents("E");
        System.out.println(course.toString());
        course.dropStudent("Z");
        System.out.println(course.toString());
        course.clear();
        System.out.println(course.toString());
    }
}
