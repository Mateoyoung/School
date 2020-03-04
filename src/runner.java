public class runner {
    public static void main(String[] args) {
        school BHS = new school("Berkeley High");

        section math = new section("Math");
        section bio = new section("Biology");
        section cs = new section("Computer Science");

        teacher albinson = new teacher("Albinson", "Computer Science");
        teacher muller = new teacher("Muller", "Biology");
        teacher Kaku = new teacher("Kaku", "English");

        student mateo = new student("Mateo", 3);
        student keenan = new student("Keenan", 8);
        student tenzin = new student("Tenzin", 1);
        student lassi = new student("Lassi", 7);
        student obama = new student("Obama", 12);
        student john = new student("John", 4);

        BHS.addSection(math);
        BHS.addSection(bio);
        BHS.addSection(cs);

        math.setTeacher(Kaku);
        bio.setTeacher(muller);
        cs.setTeacher(albinson);

        Kaku.setSubjects("math");
        muller.setSubjects("biology");
        albinson.setSubjects("computer science");

        math.addStudents(mateo);
        bio.addStudents(keenan);
        math.addStudents(tenzin);
        math.addStudents(lassi);
        cs.addStudents(obama);
        cs.addStudents(john);

        mateo.addStudent(math);
        keenan.addStudent(bio);
        tenzin.addStudent(math);
        lassi.addStudent(math);
        obama.addStudent(cs);
        john.addStudent(cs);

        System.out.println(BHS.SCHOOL());
        System.out.println("--------------------------");
        System.out.println(math.SECTION());
        System.out.println(bio.SECTION());
        System.out.println(cs.SECTION());
        System.out.println("--------------------------");
        System.out.println(Kaku.TEACHER());
        System.out.println(albinson.TEACHER());
        System.out.println(muller.TEACHER());
        System.out.println("--------------------------");
        System.out.println(mateo.STUDENT());
        System.out.println(keenan.STUDENT());
        System.out.println(tenzin.STUDENT());
        System.out.println(lassi.STUDENT());
        System.out.println(obama.STUDENT());
        System.out.println(john.STUDENT());







    }
}



