package io.corbs.stocks;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockQuotesApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(StockQuotesApplication.class, args);
	}

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("Non-Optional args: ");
        for(String name : args.getNonOptionArgs()) {
            System.out.println(name);
        }
        System.out.println("Optional args: ");
        for(String name : args.getOptionNames())  {
            System.out.println(name + args.getOptionValues(name));
        }
    }
}
