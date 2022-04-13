package user;

import com.m2i.cardealership.CarDealership;
import com.m2i.cardealership.entity.Role;
import com.m2i.cardealership.entity.User;
import com.m2i.cardealership.repository.UserRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;



@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest(classes = CarDealership.class)
public class UserTest {
    public static final String login = "userTestLogin";
    public static final String password = "userTestPassword";

    @Autowired
    UserRepository userRepository;

    @Test
    public void t1_createUerTestCase() {
        User user = new User();
        user.setFname("userFName");
        user.setLname("userTestLName");
        user.setLogin(login);
        user.setPassword(password);
        User userSaved = userRepository.save(user);
        assertNotNull(userSaved);
    }
    @Test
    public void t2_selectUerTestCase() {
        User userLogin = userRepository.findUserByLoginAndPassword(login, password);
        assertNotNull(userLogin);
    }
    @Test
    @Transactional
    public void t3_deleteUerTestCase() {
        userRepository.deleteUserByLogin(login);
        User deletedUser = userRepository.findUserByLoginAndPassword(login, password);
        assertNull(deletedUser);
    }
}
