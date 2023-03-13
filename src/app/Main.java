package app;

import entities.ProfissionaisTi;
import utils.ImpostoSobRenda;
public class Main {

    public static void main(String[] args) {

        ProfissionaisTi pti = new ProfissionaisTi(135,"Alfredo", "alfredogog@gmail.com", 1000);

        System.out.println("Id: " + pti.getId());
        System.out.println("Nome: " + pti.getNome());
        System.out.println("Salário: " + pti.getSalario());

        pti.aumentarSalario(1500);

        System.out.println("Id: " + pti.getId());
        System.out.println("Nome: " + pti.getNome());
        System.out.println("Salário: " + pti.getSalario());

        double salario = pti.getSalario();
        double salario_imposto = ImpostoSobRenda.calcularImposto(salario);
        pti.setSalario(salario_imposto);

       pti.setSalario(ImpostoSobRenda.calcularImposto(pti.getSalario()));

    }
}
