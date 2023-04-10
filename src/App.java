import java.util.Scanner; 

public class App {

    public static void main(String[] args) throws Exception {
        // Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
        double height, base, area; 

        System.out.println("Informe a altura: ");
        Scanner teclado = new Scanner(System.in); 
        height = teclado.nextDouble(); 

        System.out.println("Informe a base: ");
        base = teclado.nextDouble(); 

        area = base * height; 

        System.out.println("O dobro desta aréa é: " + area * 2);
        teclado.close();

        
        
    }
}
