package auction.apps;

import auction.model.Product;
import auction.view.ProductDisplay;

public class ProductDisplayMock implements ProductDisplay{

    @Override
    public void update() {
    }

    @Override
    public void display(Product product) {
        System.out.println(product);
    }

    @Override
    public Product product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
