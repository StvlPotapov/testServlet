package entity;


import javax.persistence.*;
import java.net.URL;

@Entity
@Table(name = "UserAuthAccounts")
public class UserAuthAccount {
    /**
     * id линкованных аккаунтов
     */
    @Column(name = "id_user_auth", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * vk - адрес пользователя
     */
    @Column(name = "vkmail")
    private URL vkMail;
    /**
     * id пользователя
     */
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    protected UserAuthAccount() {
    }

    public UserAuthAccount(URL vkMail, User userId) {
        this.vkMail = vkMail;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public URL getVkMail() {
        return vkMail;
    }

    public void setVkMail(URL vkMail) {
        this.vkMail = vkMail;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserAuthAccount{" +
                "id=" + id +
                ", vkMail=" + vkMail +
                ", userId=" + userId +
                '}';
    }
}
