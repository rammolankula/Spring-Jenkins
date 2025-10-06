package ram.explore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsApplicationTests {

	@Test
	void contextLoads() {
        System.out.println("Test Cases executing....");
        System.out.println("Check Jenkins test-02")
        assertEquals(true,true);
	}

}
