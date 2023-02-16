public class Invoice {
    private String model;
    private String productDescription;
    private int productQuantity;
    private double productPrice;
    public Invoice (String model, String productDescription, int productQuantity, double productPrice)

    {   this.model=model;
        this.productDescription=productDescription;
        this.productQuantity=productQuantity;
        this.productPrice=productPrice;

        if (this.productQuantity<0)
        {
            this.productQuantity=0;
        }
        if (this.productPrice<0)
        {
            this.productPrice=0;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getAmount() {
        return this.productQuantity*this.productPrice;
    }
}
