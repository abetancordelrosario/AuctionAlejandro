package auction.apps;

import auction.model.Product;
import auction.view.ProductListDisplay;
import java.util.List;

public class ProductListDisplayMock implements ProductListDisplay{

    @Override
    public void update() {
    }

    @Override
    public void display(List<Product> products) {
        System.out.println("Lista de productos");
    }

    @Override
    public void on(ProductSelected productSelected) {
    }

}
