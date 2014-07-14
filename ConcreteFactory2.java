/**
 * Created by emictr on 14.07.2014.
 */
public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public AbstractProductA constructA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB constructB() {
        return new ConcreteProductB2();
    }
}
