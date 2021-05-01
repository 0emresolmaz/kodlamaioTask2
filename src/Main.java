public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setFirstName("Emre");
        student.setLastName("Solmaz");
        student.setEmail("emresolmaz@gmail.com");
        student.setPassword("12345");
        student.setPurchasedCourse("Java-React Programming");

        Instructor instructor = new Instructor();
        instructor.setId(2);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setEmail("engindemirog@gmail.com");
        instructor.setPassword("67890");
        instructor.setCourseName(new String[]{"C#-Angular Programming", "Java-React Programming"});

        User[] users = {student, instructor};

        UserManager userManager = new UserManager();
        for (User user : users) {
            userManager.add(user);
        }
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.publishCourse(instructor.getCourseName());

        StudentManager studentManager = new StudentManager();
        studentManager.buyCourse(student.getPurchasedCourse());
    }
}