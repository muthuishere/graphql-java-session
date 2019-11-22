package sessions.graphql.eshop.mockgenerators;

import sessions.graphql.eshop.dealers.Dealer;

import java.util.ArrayList;
import java.util.List;

public class DealerDataGenerator {
    public static List<Dealer> generate(){
        List<Dealer> dealers = new ArrayList<>();
        //Assume   public Dealer(Long id, String name, String address, String location, String phone)
        dealers.add(new Dealer(1L,"Autobots","G2 & G3, Bhaskar House,Near Y.M.C.A. Club, S.G. Highway","Ahmedabad - 380055, Gujarat ","079-29707172"));
        dealers.add(new Dealer(2L,"Martial Motors","Survey No. 92, TC Halli, Yamare Panchayat,,Dommasandra Circle, Sarjapur Road,","Anekal Taluk, BANGALORE - 562125 Karnataka ","080-44002000"));
        dealers.add(new Dealer(3L,"Kerala Volvo","Near Parisons Agrotech,,Kannur Road, West Hill, Chungam,","Calicut - 373 005, Kerala ","91 9947346666"));
        dealers.add(new Dealer(4L,"Talwar Cars","8-2-684/3/J/A, Banjara Edifice,,Road No.12, Banjara Hills,  ","Hyderabad - 500034, Telangana ","040 -23609999"));
        dealers.add(new Dealer(5L,"Central Volvo KNMV Motors Pvt Ltd.","4/7/1- 4/7/2 Lasudia Mori Dewas Naka,,A.B Road"," Indore - 452 010, Madhya Pradesh "," 91 62626 06211"));
        dealers.add(new Dealer(6L,"Morani Volvo","(A unit of 'Morani Motocorp Pvt. Ltd.),Plot No. 5 &6, Opp. Sitabari, Tonk Road )","Jaipur - 302011, Rajasthan ","0141 4072727-30"));
        dealers.add(new Dealer(7L,"KIFS Volvo Cars","Kotia Nirman, New Link Road,,Andheri (West),","Mumbai 400053, Maharashtra ","022 42422727 "));
        dealers.add(new Dealer(8L,"Scandia Volvo Cars","H7/Block B1,,Mohan Cooperative Industrial Estate,","Mathura Road, New Delhi- 110044 "," +91 8800010188"));
        dealers.add(new Dealer(9L,"Autobots","Piplod Plaza, Below Shagun Party Plot, ,,Opp Lancers Army School, Surat Dumas","Road, Surat - 395007, Gujarat ","+91 9825000944"));

        return dealers;
    }
}
