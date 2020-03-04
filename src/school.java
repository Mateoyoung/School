public class school {
    private String name;
    private section[] sections = new section[200];
    private int sectionCount = 0;


    public school(String name) {
        this.name = name;
        this.sections = sections;
        this.sectionCount = sectionCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public section[] getSections() {
        return sections;
    }

    public void setSections(section[] sections) {
        this.sections = sections;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public void addSection(section s){
        sections[sectionCount] = s;
        sectionCount ++;
    }



    public String SCHOOL() {
       String o = "The school named " + this.getName() + " has " + getSections() + " sections.";
        return o;
    }
}
