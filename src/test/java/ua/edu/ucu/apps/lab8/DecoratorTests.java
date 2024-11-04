package ua.edu.ucu.apps.lab8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.edu.ucu.apps.lab8.model.Flower;
import ua.edu.ucu.apps.lab8.decorator.*;

class DecoratorTests {

    @Test
    void testPaperDecorator() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(10);

        FlowerDecorator paperWrappedFlower = new PaperDecorator(flower);
        assertEquals(23, paperWrappedFlower.getPrice());
        assertEquals("Rose wrapped in paper.", paperWrappedFlower.getDescription());
    }

    @Test
    void testRibbonDecorator() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(15);

        FlowerDecorator ribbonFlower = new RibbonDecorator(flower);
        assertEquals(55, ribbonFlower.getPrice());
        assertEquals("Rose with ribbon.", ribbonFlower.getDescription());
    }

    @Test
    void testBasketDecorator() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(8);

        FlowerDecorator basketFlower = new BasketDecorator(flower);
        assertEquals(12, basketFlower.getPrice());
        assertEquals("Rose in a basket", basketFlower.getDescription());
    }

}
