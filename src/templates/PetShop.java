/*package templates;

public class PetShop {
    import java.util.*;


    abstract class Animal{
        public abstract String getType();

        @Override
        public String toString() {
            return "Animal{"+getType()+"}";
        }
    }

    class Dog extends Animal{

        @Override
        public String getType() {
            return "dog";
        }
    }

    class Cat extends Animal{

        @Override
        public String getType() {
            return "cat";
        }
    }

    class PetShop {
        List<Animal> animals;

        public List<Animal> getAnimals() {
            return animals;
        }

        public void setAnimals(List<Animal> animals) {
            this.animals = animals;
        }

        @Override
        public String toString() {
            return "PetShop{" +
                    "animals=" + animals +
                    '}';
        }
    }

    public class Main {

        public static void main(String[] args) {
            PetShop shop = new PetShop();


            ArrayList<Animal> animals = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                animals.add(new Dog());
            }
            for (int i = 0; i < 4; i++) {
                animals.add(new Cat());
            }
            shop.setAnimals(animals);


            Map<String, Integer> order = new HashMap<>();
            order.put("dog", 2);
            order.put("cat", 3);


            System.out.println(shop);

            try {
                List<Animal> animalsToBeRemoved = prepareListOfAnimalsToRemove(shop, order);
                removeAnimalsFromTheShop(shop, order);
                System.out.println("Order: "+animalsToBeRemoved);
            } catch (Exception e) {
                System.out.println("Exception happened: "+e.getMessage());
            }

            System.out.println(shop);

        }

        private static List<Animal> prepareListOfAnimalsToRemove(PetShop petShop, Map<String, Integer> order) {
            List<Animal> result = new ArrayList<>();

            for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
                String animalType = orderEntry.getKey();
                Integer numberOfAnimalToBeRemoved = orderEntry.getValue();
                int numberOfAnimalsRemoved = 0;
                for (Animal animal : petShop.getAnimals()) {
                    if (animal.getType().equals(animalType) && numberOfAnimalsRemoved<numberOfAnimalToBeRemoved) {
                        result.add(animal);
                        numberOfAnimalsRemoved++;
                    }
                }
                if(numberOfAnimalsRemoved<numberOfAnimalToBeRemoved)
                    throw new IllegalArgumentException("Shop does not have enough " + animalType+"s");
            }

            return result;
        }

        private static void removeAnimalsFromTheShop(PetShop petShop, Map<String, Integer> order){
            for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
                String animalType = orderEntry.getKey();
                Integer numberOfAnimalToBeRemoved = orderEntry.getValue();
                int numberOfAnimalsRemoved = 0;
                Iterator<Animal> iterator = petShop.getAnimals().iterator();
                while (iterator.hasNext()) {
                    Animal animal = iterator.next();
                    if (animal.getType().equals(animalType) && numberOfAnimalsRemoved<numberOfAnimalToBeRemoved) {
                        iterator.remove();
                        numberOfAnimalsRemoved++;
                    }
                }
            }
        }

    }
}
*/