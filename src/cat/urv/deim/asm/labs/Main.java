package cat.urv.deim.asm.labs;

import cat.urv.deim.asm.labs.log.Log;

public class Main {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        Log.e("TAG","missatge estàtic de tipus error");
        Log.d("TAG", "missatge estàtic de tipus debug");
        Log.w("TAG","missatge estàtic de tipus warning");
        Log.i("TAG", "missatge estàtic de tipus info");
        Log.v("TAG","missatge estàtic de tipus verbose");

        Log log = new Log();
        log.error("TAG", ANSI_RED+("missatge mitjançant Log instanciat de tipus error"+ANSI_RESET));
        log.debug("TAG", ANSI_BLUE+("missatge mitjançant Log instanciat de tipus debug"+ANSI_RESET));
        log.warning("TAG", ANSI_YELLOW+("missatge mitjançant Log instanciat de tipus warning"+ANSI_RESET));
        log.info("TAG", ANSI_GREEN+("missatge mitjançant Log instanciat de tipus info"+ANSI_RESET));
        log.verbose("TAG", ANSI_PURPLE+("missatge mitjançant Log instanciat de tipus verbose"+ANSI_RESET));

    }
}
