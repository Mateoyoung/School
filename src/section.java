public class section{
    private teacher teacher;
    private student[] students = new student[50];
    private String name;
    private int currentSize;
    private section[] sections = new section[10];


    public section(String name) {
        this.teacher = teacher;
        this.students = students;
        this.name = name;
        this.currentSize = 0;
    }

    public teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(teacher teacher) {
        this.teacher = teacher;
    }

    public student[] getStudents() {
        return students;
    }

    public void setStudents(student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void addSection(section s) {
        sections[currentSize] = s;
        currentSize++;
    };

    public void addStudents(student s) {
        students[currentSize] = s;
        currentSize++;
    };

    public String stringOfStudents() {
        String o = "";

        for(int i = 0; i < currentSize; i++) {
            o += students[i].getName();
        }
        return o;
    }

    public String SECTION() {
        return getName() + " is taught by " + getTeacher().getName() + " and has " + getCurrentSize() + " students: " + stringOfStudents();

    }
}


