package dataFactory;

import model.Funcionario;
import net.datafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class FuncionarioDataFactory extends Funcionario {
    private static Faker faker = new Faker(new Locale("PT-BR"));

    public static String gerarRole() {
        String[] cargo = {
                "ROLE_MODERADOR",
                "ROLE_GESTOR",
                //"ROLE_CANDIDATO",
        };
        Random random = new Random();
        int indice = random.nextInt(cargo.length);
        return cargo[indice];
    }

    public static Funcionario novoFuncionarioAtualizado(){

        Funcionario novoFuncionarioAtualizado = new Funcionario();
        novoFuncionarioAtualizado.setEmail(faker.internet().emailAddress());
        novoFuncionarioAtualizado.setSenha(faker.passport().toString());
        novoFuncionarioAtualizado.setCargo(gerarRole());
        novoFuncionarioAtualizado.setNome(faker.name().firstName());
        return novoFuncionarioAtualizado;
    }

    public static Funcionario novoFuncionarioNaEmpresa(){
        Funcionario novoFuncionarioNaEmpresa = new Funcionario();
        novoFuncionarioNaEmpresa.setEmail(faker.internet().emailAddress());
        novoFuncionarioNaEmpresa.setCargo(gerarRole());
        novoFuncionarioNaEmpresa.setNome(faker.name().firstName());

        return novoFuncionarioNaEmpresa;
    }
}
