package Views;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

import Models.Book;
public record ViewConsole() {
    public void printArray(Book[] libros){
        System.out.println(libros);
    }
    public void showMessage(String message){
        System.out.println(message);
    }
     public String inputSerch(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese el Nombre que decea buscar");
         String libro = scanner.nextLine();
         return libro;
     }
}
