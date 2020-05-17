import java.io.IOException;
import java.lang.*;
import java.util.Scanner;

public class Init {
    int scanin() {
        int size;
        //byte buffer;
        String address ;
        Scanner sc = new Scanner(System.in);
        address =sc.next();
        //buffer=sc.nextByte();
        size = address.getBytes().length;
        System.out.println(address);
        //40x4
        if(address.startsWith("0x"))
        {
            size =size-2;
            if(size<40)
            {
                System.out.println("地址不足20字节");
            }
        }
        //40*4
        else
        {
            if(size<40)
            {
                System.out.println("地址不足20字节");
            }
        }
        return 0;
    }


}
