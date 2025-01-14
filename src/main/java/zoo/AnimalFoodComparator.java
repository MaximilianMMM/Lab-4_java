package zoo;

import java.util.Comparator;

public class AnimalFoodComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        return animal1.getFoodName().compareTo(animal2.getFoodName());
    }
}
