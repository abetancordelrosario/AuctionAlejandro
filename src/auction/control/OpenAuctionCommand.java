package auction.control;

import auction.model.Product;
import auction.view.ProductDisplay;
import auction.view.ProductListDisplay;
import auction.view.ProductLoader;
import java.util.List;

public class OpenAuctionCommand implements Command {
    
    private final ProductLoader loader;
    private final ProductDisplay display;   
    private final ProductListDisplay listDisplay;

    public OpenAuctionCommand(ProductLoader loader, ProductDisplay display, ProductListDisplay listDisplay) {
        this.loader = loader;
        this.display = display;
        this.listDisplay = listDisplay;
    }
       
    @Override
    public void execute() {
        List<Product> products = loader.load();
        for (Product product : products) {
            product.addObserver(listDisplay);
        }
        this.listDisplay.display(products);
        this.listDisplay.on(productSelected());
    }
    
    private ProductListDisplay.ProductSelected productSelected() {
        return new ProductListDisplay.ProductSelected() {
            @Override
            public void product(Product product) {
                display.product().removeObserver(display);
                product.addObserver(display);
                display.display(product);
            }
        };
    }
}
