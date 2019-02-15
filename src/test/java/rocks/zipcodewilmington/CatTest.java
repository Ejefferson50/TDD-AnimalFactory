package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setCatNameTest() {
        //given there is a cat
        Cat cat = new Cat(null, null, null);

        //given there is a name to give the cat
        String expected = "Reina";

        //when the cat's name of the cat
        String actual = cat.getName();

        //then
        Assert.assertEquals(expected, actual);

    }


    // TODO - Create tests for `speak`

    @Test
    public void speakTest() {
        //given
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";

        //when
        String actual = cat.speak();

        //then
        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDateTest() {
        //given there is a cat
        Cat cat = new Cat(null, null, null);

        //given there is a name to give the cat
        Date expected = new Date();

        //when the cat's birthdate is set
        Date actual = cat.getBirthDate();

        //then
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatTest() {
        //given
        Cat cat = new Cat(null, null, null);
        int preMealCount = cat.getNumberOfMealsEaten();
        int expected = preMealCount + 1;

        //when
        Food food = new Food();
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();

        //then
        Assert.assertEquals(expected, actual);


    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testAnimalInheritance() {
        //given
        Cat cat = new Cat(null, null, null);
        boolean expected = true;

        //when
        boolean actual = cat instanceof Animal;

        //then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testMammalInheritance() {
        //given
        Cat cat = new Cat(null, null, null);
        boolean expected = true;

        //when
        boolean actual = cat instanceof Mammal;

        //then
        Assert.assertEquals(expected, actual);
    }


        @Test
        public void constructorTest () {
            // Given (cat data)
           String givenName = "Reina";
            Date givenBirthDate = new Date();
            Integer givenId = 0;

            // When (a cat is constructed)
            Cat cat = new Cat(givenName, givenBirthDate, givenId);

            // When (we retrieve data from the cat)
            String retrievedName = cat.getName();
            Date retrievedBirthDate = cat.getBirthDate();
            Integer retrievedId = cat.getId();

            // Then (we expect the given data, to match the retrieved data)
            assertEquals(givenName, retrievedName);
            assertEquals(givenBirthDate, retrievedBirthDate);
            assertEquals(givenId, retrievedId);
        }

    }

