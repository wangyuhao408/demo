package java7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNewApiDemo {
    public void pathTest() throws IOException {
        Path path = Paths.get("C:\\Users\\wyh\\Desktop");
        System.out.println("File Name:" + path.getFileName());
        System.out.println("File Root:" + path.getRoot());
        System.out.println("File Parent:" + path.getParent());

        //Files.delete(path);  Å×Òì³£
        //Files.deleteIfExists(path);  ²»Å×Òì³£
    }

}
