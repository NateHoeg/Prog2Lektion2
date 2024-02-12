package Model;

public class FixedDiscount extends Discount{
    private int discount;
    private int minimumAmount;

    public FixedDiscount(String description, int discount, int minimumAmount) {
        super(description);
        this.discount = discount;
        this.minimumAmount = minimumAmount;
    }

    @Override
    public double applyDiscount(Basket basket) {
         double price = basket.getTotal();
         if(price <= minimumAmount) {
             price = price - discount;
         }
         return price;
    }
}
