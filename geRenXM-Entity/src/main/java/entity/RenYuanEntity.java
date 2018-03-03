package entity;

import javax.persistence.*;

@Entity
@Table(name = "renYuan")
public class RenYuanEntity {
    private int id;
    private String name;
    private String sex;
    private Float height;
    private Integer sjhm;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(name = "height")
    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Column(name = "sjhm")
    public Integer getSjhm() {
        return sjhm;
    }

    public void setSjhm(Integer sjhm) {
        this.sjhm = sjhm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RenYuanEntity that = (RenYuanEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (sjhm != null ? !sjhm.equals(that.sjhm) : that.sjhm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (sjhm != null ? sjhm.hashCode() : 0);
        return result;
    }

    public void setHeight(String height) {

    }
}
