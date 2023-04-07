import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double MB;
        double Mbps;
        double tempoDD;
        double min;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho do arquivo?");
        MB = input.nextDouble();
        System.out.println("Qual a velocidade de donwload da sua rede em Mbps?");
        Mbps = input.nextDouble();
        input.close();
        tempoDD = (MB / Mbps);
        min = (tempoDD / 60);
        System.out.println("O tempo estimado de espera é de: " + min + " Minutos");

    }
}