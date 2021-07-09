package lostfindit.proyecto.pfc.lostandfound;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper  extends SQLiteOpenHelper {

    //Versión de la base de datos
    public static final int version=1;
    //Nombre del archivo de la base de datos
    public static final String nombre_bd="laf.db";

    //Columnas de la tabla USUARIOS
    public static final String TABLA_USUARIOS = "usuarios";
    public static final String COLUMNA_USUARIO_ID="_id";
    public static final String COLUMNA_USUARIO_NOMBRE="nombre";
    public static final String COLUMNA_USUARIO_EMAIL="email";
    public static final String COLUMNA_USUARIO_TELEFONO="telefono";
    public static final String COLUMNA_USUARIO_WEB="web";//solo si es protectora de animales
    public static final String COLUMNA_USUARIO_TIPO="tipo_usuario";//campo que guarda si es persona o protectora en el registro

    //Columnas de la tabla MASCOTA
    public static final String TABLA_MASCOTAS="mascotas";
    public static final String COLUMNA_MASCOTA_ID="_idmas";
    public static final String COLUMNA_MASCOTA_CHIP="chip";
    public static final String COLUMNA_MASCOTA_FOTO="fotomas";
    public static final String COLUMNA_MASCOTA_LUGAR="lugarmas";//lugar donde se ha encontrado o perdido la mascota
    public static final String COLUMNA_MASCOTA_ESTADO="estadomas";//adopcion o perdida o encontrada la mascota

    //Creación de las tablas de la base de datos
    public static final String TABLA_USUARIOS_SQL=" CREATE TABLE " + TABLA_USUARIOS + " ( " + COLUMNA_USUARIO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMNA_USUARIO_NOMBRE + " TEXT NOT NULL, " + COLUMNA_USUARIO_EMAIL + " TEXT NOT NULL, "+ COLUMNA_USUARIO_TELEFONO + "TEXT NOT NULL, " + COLUMNA_USUARIO_TIPO + "TEXT," + COLUMNA_USUARIO_WEB + "TEXT);";
    public static final String TABLA_MASCOSTAS_SQL=" CREATE TABLE " + TABLA_MASCOTAS + " ( " + COLUMNA_MASCOTA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMNA_MASCOTA_CHIP + " TEXT NOT NULL, " + COLUMNA_MASCOTA_ESTADO + " TEXT NOT NULL, " + COLUMNA_MASCOTA_FOTO + " TEXT NOT NULL, " + COLUMNA_MASCOTA_LUGAR + "TEXT NOT NULL); ";

    //Constructor de la clase
    public DBHelper (Context contexto, String nombre_bd, SQLiteDatabase.CursorFactory factory,int version)
    {
        super(contexto,nombre_bd,factory,version);
    }

    //Se ejecutará cuando no exista o no esté creada la base de datos
    @Override
    public void onCreate(SQLiteDatabase db) {
        //Ejecución de sentencias de la base de datos SQL

    }
    //Metodo que se lanzará cuando sea necesaria una actualización de la base de datos
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Eliminamos la versión anterior con la siguiente sentencia

        //Creamos la nueva versión de la tabla

    }
}
