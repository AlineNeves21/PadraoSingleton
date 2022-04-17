package com.example.padraostingleton;

public class PadraoSingleton {
    private PadraoSingleton() {};

    private static PadraoSingleton instancia = new PadraoSingleton();

    public static PadraoSingleton getInstancia() {
        return instancia;
    }

    private String nomeInstituicao;
    private String telefoneEmpresa;

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getTelefoneEmpresa() {
        return telefoneEmpresa;
    }

    public void setTelefoneEmpresa(String telefoneEmpresa) {
        this.telefoneEmpresa = telefoneEmpresa;
    }
}

