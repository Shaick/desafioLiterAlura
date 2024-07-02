package cloud.shaick.desafioLiterAlura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cloud.shaick.desafioLiterAlura.main.Main;

@SpringBootApplication
public class DesafioLiterAluraApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DesafioLiterAluraApplication.class, args);
	}

	@Autowired
	private Main main;

    public DesafioLiterAluraApplication(Main main) {
        this.main = main;
    }


	@Override
	public void run(String... args) throws Exception {
		main.executar();
	}

}
