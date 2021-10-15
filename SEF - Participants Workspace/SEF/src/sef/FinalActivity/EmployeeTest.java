package sef.FinalActivity;

import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    private Employee employee;

    protected void setUp() throws Exception {
        employee = new Employee();
    }
    @Test
    void testSetAndGetFirstName() {
        String testFirstName = "Karin";
        assertNull(employee.getFirstName());
        employee.setFirstName(testFirstName);
        assertEquals(testFirstName, employee.getFirstName());
    }
    @Test
    void testSetAndGetAge() {
        int testAge = 27;
        assertEquals(0, 0, 0);
        employee.setAge(testAge);
        assertEquals(testAge, employee.getAge(), 0);
    }
    @Test
    void testSetAndGetJobTitle() {
        String testJobTitle = "Tester";
        assertNull(employee.getJobTitle());
        employee.setJobTitle(testJobTitle);
        assertEquals(testJobTitle, employee.getJobTitle());
    }
    @Test
    void testSetAndGetCompany() {
        String testCompany = "Apple";
        assertNull(employee.getCompany());
        employee.setCompany(testCompany);
        assertEquals(testCompany, employee.getCompany());
    }
    @Test
    void testSetAndGetSalary() {
        int testSalary = 2000;
        assertEquals(0, 0, 0);
        employee.setAge(testSalary);
        assertEquals(testSalary, employee.getSalary(), 0);
    }
    @Test
    void introMsg() {

        String testName = "Kristina";
        int age= 37;
        String testWelcome="My name is " + testName +  " and I am " + age +" years old!";
        assertEquals("My name is Kristina and I am 37 years old!",testWelcome);

    }

    @Test
    void jobDesc() {
        String testCompany = "Accenture";
        String jobTitle = "Developer";
        String testDesc ="I work in " + testCompany + " as " + jobTitle;
        assertEquals("I work in Accenture as Developer",testDesc);
    }
}