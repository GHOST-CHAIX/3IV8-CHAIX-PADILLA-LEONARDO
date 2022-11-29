public class Principal {
    public static void main(String[] args){
        //mascotas kawaii

        Gato cat = new Gato("Michit", "de calle","atun", 1, 7);
        Perro dog = new Perro("Pulgas", "de calle", "Croquetas", 2, "hace guau guau");

        cat.mostrarGato();
        dog.mostrarPerro();
    }
}
