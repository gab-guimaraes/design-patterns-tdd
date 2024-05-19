package org.johnwick182.tdd;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class CarTest {
    @Test
    public void testCarDummy() {
        Car car = new Car("mitsubishi","lancer",390);
        Car car2 = new Car("mitsubishi", "lancer", 390);
        Assert.assertEquals(car,car2);
    }
}
