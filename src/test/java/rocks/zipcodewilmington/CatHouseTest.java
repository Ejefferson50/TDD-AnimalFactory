package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    @Before
    public void setup(){
        CatHouse.clear();

    }
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAdd(){
        //given
        Cat expected  = new Cat(null, null, null);
        Integer id = expected.getId();


        //when
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(id);

        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void remove(Integer id)`

        @Test
        public void removeIDTest(){
        //given

        Cat cat = new Cat(null, null, null);
        int id = cat.getId();
        CatHouse.remove(cat);
        Cat catFromCatHouse = CatHouse.getCatById(id);
        Assert.assertNotNull(catFromCatHouse);

        //when
        CatHouse.remove(id);
        Cat actual = CatHouse.getCatById(id);

        //then
        Assert.assertNull(actual);




    }
    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeTest() {
        //given
        Cat cat = new Cat(null, null, null);
        int id = cat.getId();
        CatHouse.add(cat);
        Cat catFromCatHouse = CatHouse.getCatById(id);

        //when
        CatHouse.remove(id);
        Cat actual = CatHouse.getCatById(id);

        //then
        Assert.assertNull(actual);
    }


    // TODO - Create tests for `Integer getNumberOfCats()`
        @Test
    public void getNumberOfCatsTest(){
        //given
            int expected = 1;
            Cat cat = new Cat(null,null,null);
            CatHouse.add(cat);

            //when
            int actual = CatHouse.getNumberOfCats();

            //then
            Assert.assertEquals(expected, actual);
        }

}
