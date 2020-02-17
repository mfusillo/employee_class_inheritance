import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Olivia", "IE245", 40000, "Security");
    }

    @Test
    public void can_get_name(){
        assertEquals("Olivia", manager.getName());
    }
    @Test
    public void can_get_ninumber(){
        assertEquals("IE245", manager.getNINumber());
    }
    @Test
    public void can_get_salary(){
        assertEquals(40000, manager.getSalary(), 0.0001);
    }
    @Test
    public void can_get_deptname(){
        assertEquals("Security", manager.getDeptName());
    }
    @Test
    public void can_increase_salary_if_percentage_over_0_and_double(){
        manager.raiseSalary(50.50);
        assertEquals(60200, manager.getSalary(), 0.0001);
    }
    @Test
    public void cannot_increase_salary_if_percentage_under_0_and_double(){
        manager.raiseSalary(-5.5);
        assertEquals(40000, manager.getSalary(), 0.0001);
    }
    @Test
    public void can_increase_salary_if_percentage_over_0_and_int(){
        manager.raiseSalary(50);
        assertEquals(60000, manager.getSalary(), 0.01);
    }
    @Test
    public void can_get_bonus(){
        assertEquals(400, manager.payBonus(), 0.0001);
    }



}
