package cn.jonathanwx.model;

import javax.persistence.*;

/**
 * create by lichangjiang
 * 2018.03.15 20:22
 */
@Entity
@Table(name = "reference_detail")
public class ReferenceDetail {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "reference_id")
    private Integer referenceId;
    @Column(name = "value")
    private String value;
    @Column(name = "data_type")
    private Integer dataType;

    public ReferenceDetail() {
    }

    public ReferenceDetail(Integer referenceId, String value, Integer dataType) {
        this.referenceId = referenceId;
        this.value = value;
        this.dataType = dataType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }
}
