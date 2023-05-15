package com.udea.Fabrica_g6_v2.repository;

import static org.assertj.core.api.Assertions.assertThat;
import com.udea.Fabrica_g6_v2.models.ViceDecano;
import com.udea.Fabrica_g6_v2.repository.ViceDecanoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


public class ViceDecanoRepositoryTest {


    @Test
    public void testGuardarVicedecano(){
        ViceDecanoRepository viceDecanoRepository = null;
        ViceDecano viceDecano1 = ViceDecano.builder().
                nombre("pepe")
                .oficina("420")
                .email("p12@gmail.com")
                .idPersona(10L)
                .build();
        ViceDecano viceDecanoGuardado =viceDecanoRepository.save(viceDecano1);
        assertThat(viceDecanoGuardado).isNotNull();
        assertThat(viceDecanoGuardado.getIdPersona()).isGreaterThan(0);
    }

}
