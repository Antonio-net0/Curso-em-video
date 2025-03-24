package CBanco;

import java.util.Scanner;

public class Mostador {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        ContaBancd c1 = new ContaBancd();
        Menu menu = new Menu();
        c1.setDono("Arthur Mendes");
        c1.setNumConta(122);
        menu.imprimir();
        byte cont = ler.nextByte();
        while(cont != 6){
            switch(cont){
                case 1:
                    c1.abrirConta("CP");
                    break;
                case 2:
                    c1.depositar(100);
                    break;
                case 3:
                    c1.fecharConta();
                    break;
                case 4:
                    c1.sacar(213);
                    break;
                case 5:
                    c1.pagarMensal();
                    break;
            }
            menu.imprimir();
            cont = ler.nextByte();

        }
    }
}
