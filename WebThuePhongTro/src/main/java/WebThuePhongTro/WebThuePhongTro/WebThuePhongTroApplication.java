package WebThuePhongTro.WebThuePhongTro;


import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  WebThuePhongTroApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();

		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USER", dotenv.get("DB_USER"));
		System.setProperty("DB_PASS", dotenv.get("DB_PASS"));
		System.setProperty("MAP_KEY", dotenv.get("MAP_KEY"));
		System.setProperty("JWT_KEY", dotenv.get("JWT_KEY"));
		System.setProperty("MALL_USER", dotenv.get("MALL_USER"));
		System.setProperty("MALL_PASS", dotenv.get("MALL_PASS"));

		SpringApplication.run(WebThuePhongTroApplication.class, args);

	}
}
