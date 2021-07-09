package lostfindit.proyecto.pfc.lostandfound;

import lostfindit.proyecto.pfc.lostandfound.LoginActivity;


import android.os.Bundle;

public class Usuario extends LoginActivity {

    //Declaracion de variables de la clase Usuario
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private String web;//solo si el usuario marca la opción de protectora
    private String tipo_usuario;//guardaremos si es persona o protectora de animales

    //Constructores de la clase Usuario
    public Usuario(){}

    public Usuario(int id,String nombre,String email,String telefono,String web,String tipo_usuario){
        this.id=id;
        this.nombre=nombre;
        this.email=email;
        this.telefono=telefono;
        this.web=web;
        this.tipo_usuario=tipo_usuario;
    }

    //Metodos de la clase Usuario

    //Establecer id de un usuario
    public void setId(int id)
    {
        this.id=id;
    }
    //Recuperar id de un usuario
    public int getId()
    {
        return id;
    }
    //Establecer nombre de un usuario
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    //Recuperar nombre de un usuario
    public String getNombre()
    {
        return nombre;
    }
    //Establecer telefono de un usuario
    public void setTelefono(String telefono)
    {
        this.telefono=telefono;
    }
    //Recuperar telefono de un usuario
    public String getTelefono()
    {
        return telefono;
    }

    //Establecer el email de un usuario
    public void setEmail(String email)
    {
        this.email=email;
    }
    //Recuperar email de un usuario
    public String getEmail()
    {
        return email;
    }
    //Metodos del usuario en caso de que sea una protectora además de los anteriores

    //Establecer web del usuario tipo_protectora
    public void setWeb(String web)
    {
        this.web=web;
    }

    //Recuperar web del usuario tipo_protectora
    public String getWeb()
    {
        return web;
    }

    //Establecer tipo de usuario persona-protectora
    public void setTipo_usuario(String tipo_usuario)
    {
        this.tipo_usuario=tipo_usuario;
    }
    //Recuperar tipo de usuario persona-protectora
    public String getTipo_usuario()
    {
        return tipo_usuario;
    }
}

