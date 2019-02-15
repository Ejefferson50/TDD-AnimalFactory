package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAdd(){
        //given
        Dog expected  = new Dog(null, null, null);
        Integer id = expected.getId();


        //when
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(id);

        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        //given

        Dog dog = new Dog(null, null, null);
        int id = dog.getId();
        DogHouse.add(dog);
        Dog dogFromDogHouse = DogHouse.getDogById(id);
        Assert.assertNotNull(dogFromDogHouse);

        //when
        DogHouse.remove(id);
        Dog actual = DogHouse.getDogById(id);

        //then
        Assert.assertNull(actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Ozzy";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
