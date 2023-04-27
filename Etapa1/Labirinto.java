package Etapa1;

import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Labirinto {
    private char[][] labirinto;
    private int linhas;
    private int colunas;

    public Labirinto() {
    }

    public void criaLabirinto(String filename) {
        ArrayList<String> linhasLabirinto = new ArrayList<>();
    
        try {
            Path path = Paths.get(System.getProperty("user.dir"), filename);
            linhasLabirinto = (ArrayList<String>) Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        linhas = linhasLabirinto.size();
        colunas = linhasLabirinto.get(0).length();
        labirinto = new char[linhas][colunas];
    
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j < linhasLabirinto.get(i).length()) {
                    labirinto[i][j] = linhasLabirinto.get(i).charAt(j);
                } else {
                    labirinto[i][j] = ' ';
                }
            }
        }
    }

    public boolean percorreLabirinto() {
        return percorreLabirintoRecursivo(0, 0);
    }
    
    private boolean percorreLabirintoRecursivo(int i, int j) {
        if (i < 0 || i >= linhas || j < 0 || j >= colunas || labirinto[i][j] == 'X' || labirinto[i][j] == '*') {
            return false;
        }
    
        if (labirinto[i][j] == 'D') {
            return true;
        }
    
        labirinto[i][j] = '*';
    
        if (percorreLabirintoRecursivo(i - 1, j) ||
            percorreLabirintoRecursivo(i + 1, j) ||
            percorreLabirintoRecursivo(i, j - 1) ||
            percorreLabirintoRecursivo(i, j + 1)) {
            return true;
        }
    
        labirinto[i][j] = ' ';
        return false;
    }

    public void imprimirLabirinto() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(labirinto[i][j]);
            }
            System.out.println();
        }
    }    
}
