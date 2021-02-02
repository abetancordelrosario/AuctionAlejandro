package auction.apps;

import auction.control.OpenAuctionCommand;
import auction.view.ProductDisplay;
import auction.view.ProductListDisplay;
import auction.view.ProductLoader;

public class Main {

    public static void main(String[] args) {
        new Main().execute();
    }
    private final ProductLoader loader;
    private final ProductDisplay display;   
    private final ProductListDisplay listDisplay;

    public Main() {
        loader = new ProductLoaderMock();
        listDisplay = new ProductListDisplayMock();
        display = new ProductDisplayMock();
    }

    
    private void execute() {
        new OpenAuctionCommand(loader,display,listDisplay).execute();
    }
    
}
