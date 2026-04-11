package Aula05.Exerc01;

public class Cirurgiao extends Medico {
    private int numCirurgias;

    public void setNumCirurgias(int numCirurgias) {
        this.numCirurgias = numCirurgias;
    }

    public int getNumCirurgias() {
        return numCirurgias;
    }

    public void realizarCirurgia() {
        System.out.println("O cirurgião " + getNome() + " está operando agora.");
    }
}
