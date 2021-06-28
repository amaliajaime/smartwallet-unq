package unitTests;

import app.model.Exceptions.InvalidEmailException;
import app.model.User.Users;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTests {

    @Test
    public void userProperties(){

        Users user = new Users("Smart", "smart.wallet.app1@gmail.com", "sw");

        assertEquals("Smart", user.getName());
        assertEquals("smart.wallet.app1@gmail.com", user.getUsername());
        assertEquals("sw", user.getPassword());
        assertEquals(0, user.getAccountCredit(), 0);
        assertEquals(0, user.getAccountExpense(), 0);
        assertTrue(user.isAccountNonExpired());
        assertTrue(user.isAccountNonLocked());
        assertTrue(user.isCredentialsNonExpired());
        assertFalse(user.isEnabled());

    }

    @Test
    public void setName(){

        Users user = new Users("Smart", "smart.wallet.app1@gmail.com", "sw");

        String expect = "Sm";
        user.setName("Sm");

        assertEquals(expect, user.getName());

    }

    @Test
    public void setEmail(){

        Users user = new Users("Smart", "smart.wallet.app1@gmail.com", "sw");

        String expect = "smart.wallet.app@com";
        user.setEmail("smart.wallet.app@com");

        assertEquals(expect, user.getUsername());

    }

    @Test
    public void setPassword(){

        Users user = new Users("Smart", "smart.wallet.app1@gmail.com", "sw");

        String expect = "SmartW";
        user.setPassword("SmartW");

        assertEquals(expect, user.getPassword());

    }

    @Test(expected = InvalidEmailException.class)
    public void invalidEmailException(){

        Users user = new Users("Smart", "smart.wallet.app1", "sw");

    }

}