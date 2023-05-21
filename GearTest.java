import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GearTest {

    @Test
    void setDescription(){

    }

    @Test
    void setCost(){

    }

    @Test
    void setName() {

    }
    @Test
    void emptyConstructor(){
        Gear gear = new Gear();
        assertNotNull(gear);

    }
    @Test
    void nonemptyConstructorName(){
        Gear gear = new Gear("Name", 0.0, "");
        assertNull(null, gear.getDescription());
    }
    @Test
    void nonemptyConstructorCost(){
        Gear gear = new Gear("", 0.0, "");
        assertEquals(0.0, gear.getCost());
    }
    @Test
    void nonemptyConstructorDescription(){
        Gear gear = new Gear("", 0.0, "Description");

    }



}


