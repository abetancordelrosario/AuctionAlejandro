package auction.apps;

import auction.model.Bidder;
import auction.model.Product;
import auction.view.ProductLoader;
import java.util.ArrayList;
import java.util.List;

public class ProductLoaderMock implements ProductLoader{
    
    private final String a = "a";
    private final String b = "b";
    private final List<String> photos = new ArrayList<>();
    int timeOut = 10;
    int price = 5;
    

    @Override
    public List<Product> load() {
        List<Product> products = new ArrayList<>();
        photos.add(a);
        photos.add(b);
        Product pra = new Product("Este es a", photos, timeOut, price);
        Product prb = new Product("Este es b", photos, timeOut, price);
        products.add(pra);
        products.add(prb);
        return products;
    }

}
