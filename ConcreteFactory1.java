/**
 * Created by emictr on 14.07.2014.
 */
public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public AbstractProductA constructA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB constructB() {
        return new ConcreteProductB1();
    }
}
