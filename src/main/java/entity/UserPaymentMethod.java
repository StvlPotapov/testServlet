package entity;

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


    @Column
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User userId;

    protected UserPaymentMethod(){

    }

    public UserPaymentMethod(String qiwiNumber, User userId) {
        this.qiwiNumber = qiwiNumber;
        this.userId = userId;
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

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserPaymentMethod{" +
                "id=" + id +
                ", qiwiNumber='" + qiwiNumber + '\'' +
                ", userId=" + userId +
                '}';
    }
}
