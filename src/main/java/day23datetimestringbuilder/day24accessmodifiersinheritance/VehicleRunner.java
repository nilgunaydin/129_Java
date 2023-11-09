package day23datetimestringbuilder.day24accessmodifiersinheritance;

public class VehicleRunner {
    //Example 1: Car turunde, rengi beyaz
    // olan 54000km'de 250000TL fiyati olan
    // 2020 model bir Honda Accord ariyorum.

    public static void main(String[] args) {
 HondaAccord endut=new HondaAccord(250000,2020);
 System.out.println("endut = " + endut);

        Honda yeni = new Honda("ela","bela");
        System.out.println("yeni = " + yeni);
        System.out.println(yeni.type);
 
    }
}
