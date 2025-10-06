package ram.explore;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

    Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @PostConstruct
    public void init(){
        logger.info("Application Started");
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
        System.out.println("Application executed");
    }

}
