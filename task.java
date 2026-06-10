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
        return s1.marks - s2.marks;
    }
}

public class task {

    public static void main(String[] args) {

        ArrayList<Students> students = new ArrayList<>();o
        

        students.add(new Students("Shiv", 69, 85));
        students.add(new Students("Dharam", 70, 92));
        students.add(new Students("Param", 71, 75));
        students.add(new Students("Dhanno", 72, 88));

        // Sorting by marks
        Collections.sort(students, new MarkComparator());

        // Printing students
        for(Students s : students) {
            System.out.println(s);
        }
    }
}