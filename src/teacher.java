public class teacher extends person{
    private section[] sections = new section[10];
    private String subjects;
    private String name;
    private int sectionCount;

    public teacher(String name, String subjects) {
        super(name);
        this.subjects = subjects;
    }






    public void setSections(section[] sections) {
        this.sections = sections;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public int getSelectionCount() {
        return sectionCount;
    }

    public void setSelectionCount(int selectionCount) {
        this.sectionCount = selectionCount;
    }



    public String TEACHER() {

        return this.getName() + " teaches the following sections: " + this.getSubjects();


    }
}

