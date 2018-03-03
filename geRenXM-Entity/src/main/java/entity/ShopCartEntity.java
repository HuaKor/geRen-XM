package entity;

import javax.persistence.*;

@Entity
@Table(name = "ShopCart")
public class ShopCartEntity {
    private int goodId;
    private String goodName;
    private String category;
    private Double unitPrice;

    @Id
    @Column(name = "GoodID")
    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    @Column(name = "GoodName")
    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    @Column(name = "Category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name = "UnitPrice")
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopCartEntity that = (ShopCartEntity) o;

        if (goodId != that.goodId) return false;
        if (goodName != null ? !goodName.equals(that.goodName) : that.goodName != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = goodId;
        result = 31 * result + (goodName != null ? goodName.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        return result;
    }
}
