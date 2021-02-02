package auction.view;

import auction.model.Product;
import java.util.List;

public interface ProductListDisplay extends Product.Observer {
    
    @Override
    public void update();

    void display(List<Product> products);
    
    void on(ProductSelected productSelected);
        
    public interface ProductSelected {
        void product(Product product);
    }
}
