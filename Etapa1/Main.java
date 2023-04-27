package Etapa1;

public class Main {
    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();
        labirinto.criaLabirinto("labirinto.txt");
        boolean temSaida = labirinto.percorreLabirinto();
        System.out.println("O labirinto " + (temSaida ? "tem saída." : "não tem saída."));
    }
}
