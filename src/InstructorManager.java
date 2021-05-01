public class InstructorManager extends UserManager {

    public void publishCourse(String[] courses) {
        for (String course:courses)
        {
            System.out.println(course +" kursu yayımlandı");
        }
    }
}
