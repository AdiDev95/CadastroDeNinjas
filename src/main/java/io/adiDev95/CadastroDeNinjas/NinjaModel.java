package io.adiDev95.CadastroDeNinjas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Anotação que indica que esta classe é uma entidade JPA
@Table(name = "tb_cadastro") // Anotação que define o nome da tabela no banco de dados
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY) // Gera o ID automaticamente
    long id; // Atributo id para identificar o ninja
    String nome;
    String email;
    int idade;

    public NinjaModel() { // no-args contructor é um construtor vazio!
    }

    public NinjaModel(String nome, String email, int idade) { // all-args constructor cheio!
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
