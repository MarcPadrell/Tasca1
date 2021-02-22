package cat.urv.deim.asm.labs.log;

import java.util.Date;

public class ConsoleLog {
    public static void consoleMessage(String color, String tag, String message, String Indicator){

        Date data = new Date();

        System.out.print(color+"0"+(data.getMonth()+1)+"/"+data.getDate()+"/"+ (data.getYear()+1900));
        System.out.print(color+" "+data.getHours()+":"+data.getMinutes()+":"+ data.getSeconds());

        System.out.println(" "+Indicator+" "+tag+": "+message);

    }


}
