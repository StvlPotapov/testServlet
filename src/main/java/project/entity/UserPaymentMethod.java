package project.entity;

import javax.persistence.*;

@Entity
@Table(name = "UserPaymentMethods")
public class UserPaymentMethod {
    /**
     * id платежного средства
     */
    @Id
    @Column(name = "id_pay_method",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * номер Qiwi кошелька
     */
    @Column
    private String qiwiNumber;

    protected UserPaymentMethod(){

    }

    public UserPaymentMethod(String qiwiNumber, User userId) {
        this.qiwiNumber = qiwiNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQiwiNumber() {
        return qiwiNumber;
    }

    public void setQiwiNumber(String qiwiNumber) {
        this.qiwiNumber = qiwiNumber;
    }

    @Override
    public String toString() {
        return "UserPaymentMethod{" +
                "id=" + id +
                ", qiwiNumber='" + qiwiNumber + '\'' +
                '}';
    }
}
