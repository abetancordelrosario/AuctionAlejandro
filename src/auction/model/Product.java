package auction.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private final String description;
    private final List<Observer> observers = new ArrayList<>();
    private final List<String> photos;
    private final List<Bidder> bidders = new ArrayList<>();
    private final int timeOut;
    private final int price;

    public Product(String description, List<String> photos, int timeOut, int price) {
        this.description = description;
        this.photos = photos;
        this.timeOut = timeOut;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public int getPrice() {
        return price;
    }
    
    public void addPhoto(String photo){
        photos.add(photo);
    }
    
    public void removePhoto(String photo){
        photos.remove(photo);
    } 
    
    public void addBid(Bidder bidder){
        bidders.add(bidder);
    }
    
    public void removeBid(Bidder bidder){
        bidders.remove(bidder);
    } 
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer){
        observers.remove(observer);
    } 

    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", photos=" + photos + ", bidders=" + bidders + ", timeOut=" + timeOut + ", price=" + price + '}';
    }
    
    
    public interface Observer {
        void update();
    }
}
