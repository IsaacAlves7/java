import java.io.IOException;
import java.nio.file.Files;
import java.util.Set;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;

public class BashScript {
  // throws IOException
    public static void main(String[] args) throws IOException {
      try {
        var script = """
                #!/bin/sh
                echo 'Hello, world!'
                """;
        // Caso não funcione, tente abaixo:
        // var script = "#!/bin/bash\necho Hello, world!";
        var path = Files.writeString(Path.of("hello.sh"), script);
        // Implemente somente no ambiente Linux
        // Files.setPosixFilePermissions(path,Set.of(PosixFilePermission.OWNER_READ,PosixFilePermission.OWNER_EXECUTE));
        System.out.println("Arquivo criado em: " + path);
      } catch (IOException e) {
        e.printStackTrace();
      }
  }
}

