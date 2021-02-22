package cat.urv.deim.asm.labs.log;

import cat.urv.deim.asm.labs.log.interfaces.IColor;

import java.awt.*;
import java.util.Date;

public class ConsoleLog implements IColor {

    public static void consoleMessage(String tag, String message, String Indicator){

        Date data = new Date();

        System.out.print("0"+(data.getMonth()+1)+"/"+data.getDate()+"/"+ (data.getYear()+1900));
        System.out.print(" "+data.getHours()+":"+data.getMinutes()+":"+ data.getSeconds());

        System.out.println(" "+Indicator+" "+tag+": "+message);

    }


}
