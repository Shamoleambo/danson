package tidz.com.danson;

import org.springframework.boot.SpringApplication;

public class TestDansonApplication {

	public static void main(String[] args) {
		SpringApplication.from(DansonApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
