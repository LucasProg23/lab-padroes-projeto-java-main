import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {
    @Test
    void testCreateProductA() {
        Product product = ProductFactory.createProduct("A");
        assertNotNull(product);
        assertEquals(ConcreteProductA.class, product.getClass());
    }
    
    @Test
    void testCreateProductB() {
        Product product = ProductFactory.createProduct("B");
        assertNotNull(product);
        assertEquals(ConcreteProductB.class, product.getClass());
    }
}
