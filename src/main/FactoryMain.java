public class FactoryMain {
    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct("A");
        productA.use(); // Saída: Usando Produto A
        
        Product productB = ProductFactory.createProduct("B");
        productB.use(); // Saída: Usando Produto B
    }
}
