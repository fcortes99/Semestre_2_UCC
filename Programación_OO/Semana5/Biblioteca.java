public class Biblioteca {
    
    private String libro;
    private int isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String disponible;
    private boolean prestado;

        public Biblioteca(String libro, int isbn, String titulo, String autor, int anioPublicacion, String disponible, boolean prestado){

            this.libro = libro;
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.anioPublicacion = anioPublicacion;
            this.disponible = disponible;
            this.prestado = prestado;

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

        public boolean isPrestado(){
            return prestado;
        }

        public String getDisponible(){
            return disponible;
        }

        public void  setDisponible(String disponible){
            this.disponible = disponible;
        }

        public void prestar(){

            if (this.isPrestado()){
                System.out.println("El libro "+ libro + ", Con Isbn: " + isbn + " Se encuentra prestado.");
            } else {
                this.prestado = true;
                setDisponible("Prestado");
                System.out.println("El prestamos fue exitoso. El libro " + libro + "Con Isbn: " + isbn + "Es tuyo, por favor recuerda devolverlo");
            }
        }

        public void devolver(){

            if (!this.isPrestado()){
                System.out.println("El libro "+ libro + " Con Isbn: " + isbn + "ya está en la biblioteca, no lo puedes devolver de nuevo.");
            } else {
                this.prestado = false;
                setDisponible("Disponible");
                System.out.println("Devolucion exitosa libro " + libro + "Con Isbn: " + isbn + " Vuelve a estar disponible.");
            }
        }

        public String toString(){
            return "Biblioteca [ Libro: " + libro + " Isbn: " + isbn + " Titulo: " + titulo + " Autor: " + autor + " Año Publicacion: " + anioPublicacion + " Disponible : " + disponible +"]";
        }

}
