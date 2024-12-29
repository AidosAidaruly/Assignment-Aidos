public class Main {
    public static void main(String[] args) {
        School school = new School();

        Student student1 = new Student("Aidos", "Aidaruly", 20, true);
        student1.addGrade(85);
        student1.addGrade(90);
        Student student2 = new Student("Bekzat", "Aknurov", 22, false);
        student2.addGrade(78);
        student2.addGrade(88);

        Teacher teacher1 = new Teacher("Aya", "Ardakova", 35, false, "Math", 12, 50000);
        Teacher teacher2 = new Teacher("Zhasmin", "Askarova", 40, true, "CScience", 8, 55000);

        teacher1.giveRaise(10);

        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);

        System.out.println(school);
    }
}
