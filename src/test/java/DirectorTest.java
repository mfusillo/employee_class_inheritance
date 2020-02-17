import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Matteo", "AB1000", 35000, "Security", 10000);

    }

    @Test
    public void can_get_name(){
        assertEquals("Matteo", director.getName());
    }
    @Test
    public void can_get_ninumber(){
        assertEquals("AB1000", director.getNINumber());
    }
    @Test
    public void can_get_salary(){
        assertEquals(35000, director.getSalary(), 0.0001);
    }
    @Test
    public void can_get_deptname(){
        assertEquals("Security", director.getDeptName());
    }
    @Test
    public void can_get_budget(){
        assertEquals(10000, director.getBudget(), 0.01);
    }
    @Test
    public void can_raise_salary(){
        director.raiseSalary(50.50);
        assertEquals(52675, director.getSalary(), 0.0001);
    }
    @Test
    public void can_get_bonus(){
        assertEquals(700, director.payBonus(), 0.0001);
    }
    @Test
    public void can_set_name_with_string(){
        director.setName("Harrison");
        assertEquals("Harrison", director.getName());
    }
    @Test
    public void cannot_set_name_with_null(){
        director.setName(null);
        assertEquals("Matteo", director.getName());
    }

}
