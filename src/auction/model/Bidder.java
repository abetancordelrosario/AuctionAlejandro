package auction.model;

public class Bidder {
    private final String name;
    private final int bid;

    public Bidder(String name, int bid) {
        this.name = name;
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public int getBid() {
        return bid;
    }
    
   
    
}
