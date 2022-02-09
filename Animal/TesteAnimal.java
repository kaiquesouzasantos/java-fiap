package Animal;

public class TesteAnimal {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setAlimenta("Todo animal se alimenta");
        animal.setLocomove("Todo animal se locomove");

        Cachorro cachorro = new Cachorro();
        cachorro.setAlimenta("Cachorro come ração");
        cachorro.setLocomove("Cachorro usa 4 patas");
        cachorro.setLatido("Cachorro faz AU AU");

        Animal poodle = new Cachorro(); // não posso utilizar as caracteristicas de Cachorro
        poodle.setAlimenta("Poodle come ração");
        poodle.setLocomove("Poodle usa 4 patas");
    }
}
