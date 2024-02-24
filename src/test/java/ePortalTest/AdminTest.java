package ePortalTest;
import erpPortal.Admin;
import erpPortal.Course;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdminTest {

    @DisplayName("Admin Creation")
    @Test
    public void testAdminCreation() {
        Admin admin = new Admin("admin", "password");
        Assertions.assertNotNull(admin, "Admin should be created");
    }

    @DisplayName("Admin Login")
    @Test
    public void testAdminLogin() {
        Admin admin = new Admin("admin", "password");
        boolean loginResult = admin.login("admin", "password");

        Assertions.assertTrue(loginResult, "Admin should be able to log in");
    }

    @DisplayName("Add course by Admin")
    @Test
    public void testAddCourseByAdmin() {
        Admin admin = new Admin("admin", "password");
        admin.login("admin", "password");

        Course course = new Course("Java Programming", "Introduction to Java", 6);
        boolean addCourseResult = admin.addCourse(course);

        Assertions.assertTrue(addCourseResult, "Admin should be able to add courses");
    }
}
