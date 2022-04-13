package user;

import com.m2i.cardealership.CarDealership;
import com.m2i.cardealership.entity.Role;
import com.m2i.cardealership.entity.User;
import com.m2i.cardealership.repository.RoleRepository;
import com.m2i.cardealership.repository.UserRepository;
import org.junit.BeforeClass;
import org.junit.Test;




import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CarDealership.class)
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserTest {
    public static final String login = "userTestLogin";
    public static final String password = "userTestPassword";
    private static Role role;
    @Autowired
    UserRepository userRepository;
    @Autowired
    static
    RoleRepository roleRepository;

    @BeforeClass
    public static void addRoles(){
        role = new Role();
        role.setLable("Commercial");
    }


    @Test
    @Order(1)
    public void createUerTestCase() {
        User user = new User();
        user.setFname("userFName");
        user.setLname("userTestLName");
        user.setLogin(login);
        user.setPassword(password);
        user.setRole(role);
        User userSaved = userRepository.save(user);
        assertNotNull(userSaved);
    }
    @Test
    @Order(2)
    public void selectUerTestCase() {
        User userLogin = userRepository.findUserByLoginAndPassword(login, password);
        assertEquals(userLogin.getFname(), "userFName");
        assertEquals(userLogin.getLname(), "userTestLName");
        assertEquals(userLogin.getRole().getId(), role.getId());
    }
    @Test
    @Order(3)
    public void deleteUerTestCase() {
        userRepository.deleteUserByLogin(login);
        User deletedUser = userRepository.findUserByLoginAndPassword(login, password);
        assertNull(deletedUser);
    }
}
