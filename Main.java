/**
 * Created by emictr on 14.07.2014.
 */
public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.setAbstractFactory(new ConcreteFactory1());
        client.generateProduct();
        client.useProduct();
    }
}
