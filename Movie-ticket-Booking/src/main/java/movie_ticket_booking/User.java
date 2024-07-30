package movie_ticket_booking;
import jakarta.persistence.*;

@Entity
@Table(name="login")
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(unique=true,length=50)
    private String username;
    @Column(length=20)
    private String password;


     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}