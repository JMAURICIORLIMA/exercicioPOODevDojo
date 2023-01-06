package metodos;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Arthur Oliveira");
        funcionario.setIdade(39);
        funcionario.setSalarios(new double[]{1550.39, 1998.73, 1755.94});

        funcionario.impressaoDeDados();

    }
}
