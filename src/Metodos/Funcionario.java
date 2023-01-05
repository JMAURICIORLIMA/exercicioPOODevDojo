package Metodos;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void impressaoDeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print("R$ " + salario + " ");
        }

        mediaSalarial();
    }

    private void mediaSalarial() {
        double media = 0;
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: R$ " + media);
    }
}
