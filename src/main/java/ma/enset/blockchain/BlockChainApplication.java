package ma.enset.blockchain;

import ma.enset.blockchain.entities.Blockchain;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlockChainApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlockChainApplication.class, args);
    }
    @Bean
    CommandLineRunner start(){
        return args -> {
            Blockchain b=new Blockchain(10);
        };
    }

}
