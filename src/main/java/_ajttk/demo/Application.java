package _ajttk.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner runner(DataSource dataSource) {
		return args -> {
			System.out.println("🔍 DB 연결 테스트 중...");
			dataSource.getConnection(); // 비번 틀리면 여기서 죽음
		};
	}

}
