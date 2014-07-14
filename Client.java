/**
 * Created by emictr on 14.07.2014.
 */
public class Client {

    private AbstractFactory factory = null;
    private AbstractProductA productA = null;
    private AbstractProductB productB = null;

    public void setAbstractFactory(AbstractFactory factory){
        if(this.factory == null){
            this.factory = factory;
        }
    }

    public void generateProduct() {
        if(this.factory != null) {
            this.productA = this.factory.constructA();
            this.productB = this.factory.constructB();
        }
    }

    public void useProduct(){
        if(this.productA != null && this.productB != null){
            this.productA.print();
            this.productB.printSomethingElse();
        }
    }
}
