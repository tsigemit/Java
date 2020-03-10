import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
public class CreateFile{
	public static void main(String[] args) {
		try{
			File file = new File("./file1.txt");
			FileWriter fileWriter = new FileWriter("./file1.txt");
			FileReader fileReader = new FileReader("./file1.txt");
			fileWriter.write("java file io operation");
			fileWriter.close();
			Scanner s = new Scanner(fileReader);
			while (s.hasNextLine()) {
				String data = s.next();
				System.out.println(data);
			}
			fileReader.close();
			if(file.createNewFile())
				System.out.println("File created successfully as " +file.getName());
			else {
				System.out.println(file.getName()+" already exists");
			}
			if(file.exists()){
				System.out.println(file.getName());
				System.out.println(file.getAbsolutePath());
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.length());

			}
		}
		catch(IOException e){
			System.out.println("There is an error");
		}
	}
}