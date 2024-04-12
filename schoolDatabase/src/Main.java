public class Main {
    public static void main(String[] args) {
        School Hogwarts = new School();

        Hogwarts.addStudent("Harry", "Potter", 1);
        Hogwarts.addStudent("Hermione", "Granger", 1);
        Hogwarts.addStudent("Neville", "Longbotton", 1);
        Hogwarts.addStudent("Ron", "Weasley", 1);
        Hogwarts.addStudent("Draco", "Malfoy", 1);
        Hogwarts.addStudent("Hannah", "Abbot", 1);
        Hogwarts.addStudent("Gregory", "Goyle", 1);
        Hogwarts.addStudent("Vincent", "Crabbe", 1);
        Hogwarts.addStudent("Cho", "Chang", 2);
        Hogwarts.addStudent("Cedric", "Diggory", 3);

        Hogwarts.addTeacher("Severus", "Snape", "Potions");
        Hogwarts.addTeacher("Minerva", "McGonagall", "Transfiguration");
        Hogwarts.addTeacher("Quirinus", "Quirrell", "Defence against the Dark Arts");

        System.out.println("During the 1991-1992 Hogwarts year, many crazy events happened with the arrival of the\n" +
                "famous Harry Potter. Some prominent characters during Harry Potter's years at Hogwarts attended\n" +
                "when he was enrolled.\n\nList of aforementioned students:");
        Hogwarts.showStudents();

        System.out.println("\nList of notable teachers during 1991-1992 Hogwarts year:");
        Hogwarts.showTeachers();

        Hogwarts.removeStudent("Cho");
        Hogwarts.removeStudent("Cedric");
        Hogwarts.removeTeacher("Quirinus");

        System.out.println("\nBy the end of the year, it was revealed that professor Quirrel was a vessel for the\n" +
                "evil Lord Voldermort. Harry Potter disintegrated him, which ended the threat.\n\nList of students " +
                "relevant to Harry's first year at hogwarts:");
        Hogwarts.showStudents();

        System.out.println("\nList of previous teachers list with professor Quirrel removed:");
        Hogwarts.showTeachers();
    }
}