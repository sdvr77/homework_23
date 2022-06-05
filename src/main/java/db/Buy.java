package db;

import javax.persistence.*;

@Entity
@Table
public class Buy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private int sum;

    @OneToOne
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;

    @OneToOne(mappedBy = "buy")
    private BuyDetails buyDetails;

    public Buy() {
    }

    public Buy(int id, int sum, Buyer buyer, BuyDetails buyDetails) {
        this.id = id;
        this.sum = sum;
        this.buyer = buyer;
        this.buyDetails = buyDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public BuyDetails getBuyDetails() {
        return buyDetails;
    }

    public void setBuyDetails(BuyDetails buyDetails) {
        this.buyDetails = buyDetails;
    }
}
