package Controllers;

import Models.Book;

public class LibroController {
    public void sortByName(Book[] libros) {
        for (int i = 0; i < libros.length; i++) {
            int im = 0;
            for (int j = 0; j < libros.length; j++) {
                if (libros[i].getName().equalsIgnoreCase(libros[j].getName())) {
                    im=j;
                }
            }
            Book aux= libros[i];
            libros[i]=libros[im];
            libros[im]=aux;
        }
    }
    public Book searchByName(Book[] libros, String name) {
        for (int i = 0; i < libros.length; i++) {
            
        }
        return null;
    }
}
