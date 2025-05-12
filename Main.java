public class Main {

    public static void main(String[] args){


        //Usuario
        Usuario usuario1 = new Usuario("Margeory", "Lopez", 16, 2009);
        Usuario usuario2 = new Usuario("Nidia", "Garcìa", 15, 2009);


        //Metodos de objeto
        usuario1.setNombre("Patricia");
        usuario1.mostrardatos();
        usuario2.mostrardatos();


        System.out.println(usuario1.getEdad());
        if (usuario1.getEdad() >= 18) {
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Menor de edad");
        }
        


        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getApellido());
        System.out.println(usuario1.getAñoNa());

    }
}