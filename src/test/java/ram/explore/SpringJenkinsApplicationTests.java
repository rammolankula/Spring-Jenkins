package ram.explore;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsApplicationTests {

    Logger logger= LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@Test
	void contextLoads() {
        System.out.println("Test Cases executing....");
        logger.info("Test:::01");
        assertEquals(true,true);
	}
}
