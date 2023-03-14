import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

//package tinh_can_chi;
//
import java.util.Scanner;
//
public class SumCanChi {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        //tìm can bằng cách lấy năm đó chia lấy dư cho 10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tuoi cua ban: ");

        String[] tenCan = {"Canh ", "Tân ", "Nhâm ", "Quý ", "Giáp ", "Ất ", "Bính ", "Đinh ", "Mậu ", "Kỷ "};
        String[] tenChi = {"Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tị", "Ngọ", "Mùi"};

        int tuoi = scanner.nextInt();
        int nam = Year.now().getValue();
        int sn = nam -tuoi;
        String can1 = tenCan[sn%10];
        String chi1 = tenChi[sn%12];
        System.out.println("Tuổi can chi vừa nhập là : "+  can1  + chi1 );


    }}
