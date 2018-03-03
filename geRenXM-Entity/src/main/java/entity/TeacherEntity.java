package entity;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
public class TeacherEntity {
    private String gonhao;
    private String kemu;
    private String name;

    @Id
    @Column(name = "gonhao")
    public String getGonhao() {
        return gonhao;
    }

    public void setGonhao(String gonhao) {
        this.gonhao = gonhao;
    }

    @Column(name = "kemu")
    public String getKemu() {
        return kemu;
    }

    public void setKemu(String kemu) {
        this.kemu = kemu;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherEntity that = (TeacherEntity) o;

        if (gonhao != null ? !gonhao.equals(that.gonhao) : that.gonhao != null) return false;
        if (kemu != null ? !kemu.equals(that.kemu) : that.kemu != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gonhao != null ? gonhao.hashCode() : 0;
        result = 31 * result + (kemu != null ? kemu.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
