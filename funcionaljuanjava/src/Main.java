import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {


        List<String> usuarios = Arrays.asList("juan","fer","paula","florencia","belen","felicitas","estefania");
        List<String> usuariosFiltrados = usuarios.stream()
                .filter(nombre -> nombre.contains("f"))
                .filter(nombre -> nombre.contains("e"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(usuariosFiltrados);


        String texto = """
                 hola uso text blocks.
                 esta es la fomar de usar.
                 Practicando java funcional.
                 Jcode.
                """;

        System.out.println(texto);

        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
        bands
                .sorted()
                .filter(b-> b.length() < 10)
                .map(String::toUpperCase)
                .toList()
                .forEach(System.out::println);

        bands.close();



    }
}