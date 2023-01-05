package metodos;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Arthur Oliveira";
        funcionario.idade = 39;
        funcionario.salarios = new double[]{1550.39, 1998.73, 1755.94};

        funcionario.impressaoDeDados();
    }
}
