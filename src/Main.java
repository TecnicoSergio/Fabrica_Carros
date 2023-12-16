import Carro.fiat;
import Carro.gm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        fiat fiat1 = new fiat("Nome:" + " Fiat 500","COR:" + " Branco", "MODELO:" + " 2023/2024",  + 10.1 );
        fiat fiat2 = new fiat("Nome:" + " Touro","COR:" + " Preto", "MODELO:" + " 2022/2023",  + 15.1 );
        fiat fiat3 = new fiat("Nome:" + " Mobi","COR:" + " Vermelho", "MODELO:" + " 2022/2023",  + 9.1 );
        fiat fiat4 = new fiat("Nome:" + " Cronos","COR:" + " Prata", "MODELO:" + " 2022/2023",  + 10.1 );

        System.out.println(fiat1.getNome());
        System.out.println(fiat1.getCor());
        System.out.println(fiat1.getModelo());
        System.out.println(fiat1.getPeso());
        System.out.println(fiat1.freio());
        System.out.println("===================");
        System.out.println(fiat2.getNome());
        System.out.println(fiat2.getCor());
        System.out.println(fiat2.getModelo());
        System.out.println(fiat2.getPeso());
        System.out.println(fiat2.freio());
        System.out.println("====================");
        System.out.println(fiat3.getNome());
        System.out.println(fiat3.getCor());
        System.out.println(fiat3.getModelo());
        System.out.println(fiat3.getPeso());
        System.out.println(fiat3.freio());
        System.out.println("=======================");
        System.out.println(fiat4.getNome());
        System.out.println(fiat4.getCor());
        System.out.println(fiat4.getModelo());
        System.out.println(fiat4.getPeso());
        System.out.println(fiat4.freio());
        System.out.println(" Quando eu pisar no freio " + fiat1.freio() + " o carro para ");
        System.out.println(" Quando acionar a ceta " + fiat1.alerta() + " as palhetas funcionaram ");





    }
}