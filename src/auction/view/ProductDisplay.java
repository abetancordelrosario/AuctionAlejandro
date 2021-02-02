package auction.view;

import auction.model.Product;

public interface ProductDisplay extends Product.Observer {
    
    @Override
    public void update();
    
    void display(Product product);
    
    public Product product();
}
