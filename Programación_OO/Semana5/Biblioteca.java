public class Biblioteca {
    
    private String libro;
    private int isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String disponible;

        public Biblioteca(String libro, int isbn, String titulo, String autor, int anioPublicacion, String disponible){

            this.libro = libro;
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.anioPublicacion = anioPublicacion;
            this.disponible = disponible;

        }

        public String getLibro(){
            return libro;
        }

        public int getIsbn(){
            return isbn;
        }

        public String getTitulo(){
            return titulo;
        }

        public String getAutor(){
            return autor;
        }

        public int getAniopublicacion(){
            return anioPublicacion;
        }

        public String getDisponible(){
            return disponible;
        }

        public String toString(){
            return "Biblioteca [ Libro: " + libro + " Isbn: " + isbn + " Titulo: " + titulo + " Autor: " + autor + " Año Publicacion: " + anioPublicacion + " Disponible : " + disponible +"]";
        }

}
