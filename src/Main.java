import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest();
        Guest guest2 = new Guest();

        guest1.setNameAndSurname("Adéla Malíková");
        LocalDate.of(1993, 3, 13),
                BigDecimal.ZERO, 1;


        guest2.setNameAndSurname("Jana Dvořáčka");
        LocalDate.of(1995, 5, 5),
        BigDecimal.ZERO, 2;

        List<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        System.out.println("Počet hostů: " + guestList);
        System.out.println(guest1.getNameAndSurname());
        for (int i = 1 <= 2; i++) {

            guestList.add(new Guest("Host"+i, LocalDate.of(1990, 1, i)));
        }
        System.out.println(guest2.getNameAndSurname());

        System.out.println(guest1.canBuy(BigDecimal.TWO, 1));

         guest1.setWithBalconyAndSeaView(BigDecimal.valueOf(1));
        System.out.println("Jméno prvního hosta" +guestList.get(1).getNameAndSurname());
        System.out.println("Jméno druhého hosta" +guestList.get(2).getNameAndSurname());




    }




































}