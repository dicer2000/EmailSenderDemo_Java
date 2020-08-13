import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Main
{
	public static void main(String[] args) {

		Path path = Paths.get("doc.txt");
		byte[] bytes = "ABCD".getBytes(StandardCharsets.UTF_8);

		try {
			Files.write(path, bytes);	// Java 7+ only
			System.out.println("Successfully written data to the file");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}