package entities;

public class Livro {
    private String autor;
    private String editora;

    public Livro (String autor, String editora){
        this.autor = autor;
        this.editora = editora;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String a){
        a = autor;
    }

    public String getEditora(){
        return editora;
    }
    public void setEditora(String e){
        e = editora;
    }

}
