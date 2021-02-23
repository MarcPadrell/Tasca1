package cat.urv.deim.asm.labs.log;

import cat.urv.deim.asm.labs.log.interfaces.IColor;

import java.util.Date;



public class ConsoleLog implements IColor {

    public static void consoleMessage(String color, String tag, String message, String Indicator){

        Date data = new Date();

        System.out.print(color+"0"+(data.getMonth()+1)+"/"+data.getDate()+"/"+ (data.getYear()+1900));
        System.out.print(color+" "+data.getHours()+":"+data.getMinutes()+":"+ data.getSeconds());

        System.out.println(" "+Indicator+" "+tag+": "+message);

    }

    public static void e(String tag, String message) {
        consoleMessage(ANSI_RED,tag, message+ANSI_RESET, Log.ERROR);
    }

    public static void w(String tag, String message){
        consoleMessage(ANSI_ORANGE,tag, message+ANSI_RESET, Log.WARNING);
    }

    public static void d(String tag, String message){

        consoleMessage(ANSI_BLUE,tag, message+ANSI_RESET, Log.DEBUG);
    }

    public static void i(String tag, String message){

        consoleMessage(ANSI_BLACK,tag, message+ANSI_RESET, Log.INFO);
    }

    public static void v(String tag, String message){
        consoleMessage(ANSI_BLACK,tag, message+ANSI_RESET, Log.VERBOSE);
    }

}
