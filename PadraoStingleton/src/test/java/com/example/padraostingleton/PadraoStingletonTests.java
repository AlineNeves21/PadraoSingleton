package com.example.padraostingleton;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PadraoStingletonTests {

    @Test
    public void deveRetornarNomeInstituicao() {

        PadraoSingleton.getInstancia().setNomeInstituicao("Aline LTDA");
        assertEquals("Aline LTDA", PadraoSingleton.getInstancia().getNomeInstituicao());
    }

    @Test
    public void deveRetornarTelefoneInstituicao() {

        PadraoSingleton.getInstancia().setTelefoneEmpresa("32999188896");
        assertEquals("32999188896", PadraoSingleton.getInstancia().getTelefoneEmpresa());
    }

}
