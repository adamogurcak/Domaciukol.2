
import java.math.BigDecimal;
import java.time.LocalDate;

public class Guest {




    private String nameAndSurname;
    private LocalDate birthdate;
    private BigDecimal withBalconyAndSeaView;


    private int roomNo;

    public boolean canBuy(BigDecimal pricePerNight, int withBalconyAndSeaView)   {

        BigDecimal totalPrice = pricePerNight.multiply(BigDecimal.valueOf(withBalconyAndSeaView));
        return withBalconyAndSeaView >= 0;
    }
    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public Guest(String nameAndSurname, LocalDate birthdate) {
        this(nameAndSurname, birthdate, BigDecimal.ZERO,1);;
    }
    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public BigDecimal getWithBalconyAndSeaView() {
        return withBalconyAndSeaView;
    }

    public void setWithBalconyAndSeaView(BigDecimal withBalconyAndSeaView) {
        this.withBalconyAndSeaView = withBalconyAndSeaView;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;


    }

    public Guest(String nameAndSurname, LocalDate birthdate, BigDecimal withBalconyAndSeaView, int roomNo) {
        this.nameAndSurname = nameAndSurname;
        this.birthdate = birthdate;
        this.withBalconyAndSeaView = withBalconyAndSeaView;
        this.roomNo = roomNo;
    }
}
