package com.udea.Fabrica_g6_v2.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class ViceDecanoServiceTest {
    @BeforeEach
    public void inicializar(){
        ViceDecanoService vicedecano = new ViceDecanoService();
    }
    @Test
    void findAll() {
        Assertions.assertEquals(2,2);
    }

    @Test
    void save() {
    }

    @Test
    void findById() {
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }
}