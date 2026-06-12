import java.util.*;

class Students {
    String name;
    int id;
    int roll_no;
    int marks;

    Students(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

class MarkComparator implements Comparator<Students> {

    @Override
    public int compare(Students s1, Students s2) {
        return Integer.compare(s1.marks, s2.marks);
    }
}

public class task {

    public static void main(String[] args) {

        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("shiv", 69, 99));
        students.add(new Students("Dharam", 70, 92));
        students.add(new Students("Param", 71, 75));
        students.add(new Students("Dhanno", 72, 88));

        // Sort students by marks in ascending order
        Collections.sort(students, new MarkComparator());

        // Print sorted students
        for (Students s : students) {
            System.out.println(s);
        }
    }
}