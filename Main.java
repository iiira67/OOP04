package OOP04;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(4, "aab", "aab", "aab");
        Teacher teacher2 = new Teacher(2, "aaa", "aaa", "aaa");
        Teacher teacher3 = new Teacher(3, "Aaa", "Aaa", "Aaa");
        Teacher teacher4 = new Teacher(1, "bbb", "bbb", "bbb");
        List<Teacher> teacherList = new ArrayList<>();
        TeacherGroup teacherGroup = new TeacherGroup(teacherList);
        teacherGroup.addTeacher(teacher1);
        teacherGroup.addTeacher(teacher2);
        teacherGroup.addTeacher(teacher3);
        teacherGroup.addTeacher(teacher4);
        TeacherGroupService service = new TeacherGroupService(teacherGroup);
        for (Teacher teacher : teacherGroup) {
            System.out.println(teacher);
        }
        System.out.println();
        for (Teacher teacher : service.getSortedTeacherGroup()) {
            System.out.println(teacher);
        }
        System.out.println();
        for (Teacher teacher : service.getSortedTeacherGroupByFIO()) {
            System.out.println(teacher);
        }

    }
}
