package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void setDogNameTest() {
        //given there is a cat
        Dog dog = new Dog(null, null, null);

        //given there is a name to give the cat
        String expected = "Ozzy";

        //when the cat's name of the cat
        String actual = dog.getName();

        //then
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `speak`

    @Test
    public void speakTest() {
        //given
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";

        //when
        String actual = dog.speak();

        //then
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDateTest() {
        //given there is a cat
        Dog dog = new Dog(null, null, null);

        //given there is a name to give the cat
        Date expected = new Date();

        //when the cat's birthdate is set
        Date actual = dog.getBirthDate();

        //then
        Assert.assertEquals(expected,actual);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        //given
        Dog dog = new Dog(null, null, null);
        int preMealCount = dog.getNumberOfMealsEaten();
        int expected = preMealCount + 1;

        //when
        Food food = new Food();
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        //then
        Assert.assertEquals(expected,actual);


    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        //given
        Dog dog = new Dog(null, null, null);
        boolean expected = true;

        //when
        boolean actual = dog instanceof Animal;

        //then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
        @Test
        public void testMammalInheritance() {
            //given
            Dog dog = new Dog(null, null, null);
            boolean expected = true;

            //when
            boolean actual = dog instanceof Mammal;

            //then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void constructorTest () {
        // Given (dog data)
        String givenName = "Ozzy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }
}
