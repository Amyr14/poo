package negocio;
import dados.FormaGeometrica;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorFormasGeometricas {

    private final List<FormaGeometrica> formasGeometricas = new ArrayList<FormaGeometrica>();

    public void addFormaGeometrica(FormaGeometrica f) {
        formasGeometricas.add(f);
    }

    public void salvarNoArquivo() {
        Writer writer = null;
        try {
            writer = new FileWriter("arquivo.txt");
        } catch(IOException er) {
            System.out.println("Erro ao ler o arquivo");
            System.exit(0);
        }
        // Acabou o tempo :(
    }
}
