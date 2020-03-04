public class student extends person{
    private section[] sections = new section[10];
    private int grade;
    private String name;
    private int sectionCount;


    public student(String name, int grade) {
        super(name);
        this.grade = grade;
    }




    public section[] getSections() {
        return sections;
    }

    public void setSections(section[] sections) {
        this.sections = sections;
    }

    public int getGrade() {
        return grade;
    }

    public void addStudent(section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }


    public String stringStuff() {
        String o = "";
        for(int i = 0; i < getSectionCount(); i++) {
            o += this.sections[i].getName() + "(" + this.sections[i].getTeacher().getName() + ")";

        }

        return o;
    }

    public String STUDENT(){
        return this.getName() + " is in grade " + this.getGrade() + " and is enrolled in the following sections: " + stringStuff();
    }
}

//"[student name] is in [grade] grade  and is enrolled in the following sections [each section/teacher, like Computer Science (Albinson)"
