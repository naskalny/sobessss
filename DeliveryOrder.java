import java.time.LocalDate;
import java.util.Date;

public class DeliveryOrder {
    private Long id;
    private String address;
     private LocalDate date;

    public DeliveryOrder(Long id, String address, LocalDate date) {
        this.id = id;
        this.address = address;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", date=" + date +
                '}';
    }
}
