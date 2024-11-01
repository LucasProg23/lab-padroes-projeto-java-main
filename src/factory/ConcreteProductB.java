public class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("Usando Produto A");
    }
}

public class ConcreteProductB implements Product {
    @Override
    public void use() {
        System.out.println("Usando Produto B");
    }
}
