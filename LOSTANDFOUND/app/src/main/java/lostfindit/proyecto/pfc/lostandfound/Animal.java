package lostfindit.proyecto.pfc.lostandfound;

import java.sql.Blob;

public class Animal extends Usuario{
    private int _idmas;
    private String nombremas;
    private String razamas;
    private String estadomas;
    private String descripcionmas;//comprobar si el string abarca una descripción con caracteres limitados
    private Blob fotomas;

    //Constructores de la clase animal
    public void Animal(){}
    public void Animal(int _idmas,String nombremas,String razamas,String estadomas,String descripcionmas,Blob fotomas)
    {
        this._idmas=_idmas;
        this.nombremas=nombremas;
        this.razamas=razamas;
        this.estadomas=estadomas;
        this.descripcionmas=descripcionmas;
        this.fotomas=fotomas;
    }

    //Metodos de la clase animal

    //Establecer id del animal
    public void set_idmas(int _idmas)
    {
        this._idmas=_idmas;
    }

    //Recuperar id del animal
    public int get_idmas()
    {
        return _idmas;
    }

    //Establecer el nombre de un animal
    public void setNombremas(String nombremas)
    {
        this.nombremas=nombremas;
    }
    //Recuperar el nombre de un animal
    public String getNombremas()
    {
        return nombremas;
    }
    //Establecer la raza del animal
    public void setRazamas(String razamas)
    {
        this.razamas=razamas;
    }
    //Recuperar la raza del animal
    public String getRazamas()
    {
        return razamas;
    }
    //Establecer el estado de un animal
    public void setEstadomas(String estadomas)
    {
        this.estadomas=estadomas;
    }
    //Recuperar el estado de un animal
    public String getEstadomas()
    {
        return estadomas;
    }
    //Establecer una descripcion del animal
    public void setDescripcionmas(String descripcionmas)
    {
        this.descripcionmas=descripcionmas;
    }
    //Recuperar una descripción del animal
    public String getDescripcionmas()
    {
        return descripcionmas;
    }
    //Establecer la foto de un animal
    public void setFotomas(Blob fotomas)
    {
        this.fotomas=fotomas;//Almacenará la ruta relativa donde se ha guardado la imagen en vez de la fotografia en si
    }
    //Recuperar la foto de un animal
   public Blob getFotomas()
   {
       return fotomas;//Devolvería la ruta en la que se encuentra la fotografía
   }
}


