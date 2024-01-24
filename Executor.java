import java.io.IOException;

public class Executor {
    public static void main(String... args){
        String[] command = {
            ".\\utils\\docto.exe",
            "-f", ".\\archivos\\archivoWord.doc",
            "-O", ".\\archivos\\archivoTxt.txt",
            "-T", "wdFormatText"
        };

        ProcessBuilder processBuilder = new ProcessBuilder(command);

        try {        
            Process process = processBuilder.start();

            int exitCode = process.waitFor();

            System.out.println("La aplicacion fue executada con código: "+exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}