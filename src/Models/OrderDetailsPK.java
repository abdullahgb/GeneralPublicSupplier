package Models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


public class OrderDetailsPK implements Serializable {
    private int orderId;
    private int productId;

    @Column(name = "Order_ID")
    @Id
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Column(name = "Product_ID")
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderDetailsPK that = (OrderDetailsPK) o;

        if (orderId != that.orderId) return false;
        if (productId != that.productId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + productId;
        return result;
    }
}
