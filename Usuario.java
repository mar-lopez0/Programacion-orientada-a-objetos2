//Crear primero una clase
public class Usuario {

    //Propiedades del objeto
    private String nombre ;
    private String apellido;
    private int edad;
    private int AñoN;

    public Usuario(String nombre, String apellido, int edad , int AñoN){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.AñoN = AñoN;
    
    }
    //Metodo get solo para ver el contenido 
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;        
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getAñoNa(){
        return this.AñoN;
    }
    //Metodo sets es para editar o cambiar

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setAñoN(int añoN) {
        AñoN = añoN;
    }


    //Metodos personalizadas
    public void mostrardatos(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido : " + apellido);
        System.out.println("Edad : " + edad);
        System.out.println("Año de nacimiento : " + AñoN);

    }




}