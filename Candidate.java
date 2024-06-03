import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Candidate {
    String name;
    int age;
    public Candidate(String name,int age){
        this.age = age;
        this.name = name;
    }
    public void manifesto() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your manifesto");
        String manifesto1 = scanner.nextLine();
        FileWriter writer = new FileWriter("manifesto");
        writer.write(manifesto1);
    }
    public static void main(String[] args) {
        
    }
}
