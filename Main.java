public class Main{
    public static void main(String[] args)
    {
        //Creamos e instanciamos los objetos
        Planta planta = new Planta(){};
        Carnivoro carnivoro = new Carnivoro(){};
        Herbivoro herbivoro = new Herbivoro(){};
        
        
        planta.alimentarse();
        carnivoro.alimentarse();
        herbivoro.alimentarse();
        
    }
}
