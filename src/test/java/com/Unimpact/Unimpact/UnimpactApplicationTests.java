package com.Unimpact.Unimpact;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.Unimpact.Unimpact.model.Interest;
import com.Unimpact.Unimpact.repository.InterestRepository;

@SpringBootTest
class UnimpactApplicationTests {

	@Autowired
    private InterestRepository interestRepository;

	@Test
	void contextLoads() {
	}

	@DataJpaTest
    public void testDatabaseConnection() {
        // Testa a conexão com o banco de dados criando e buscando um registro
        Interest interest = new Interest();
        interest.setName("Test Interest");
        interest = interestRepository.save(interest);

        Interest found = interestRepository.findById(interest.getId()).orElse(null);
        assertThat(found).isNotNull();
        assertThat(found.getName()).isEqualTo("Test Interest");

        // Limpa o registro de teste
        interestRepository.delete(found);
    }

}
