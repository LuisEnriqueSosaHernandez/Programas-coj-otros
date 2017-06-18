
import java.util.Scanner;

public class BrokenStrings {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int n = l.nextInt();
        String s;
        int conB = 0, conR = 0, conO = 0, conK = 0, conE = 0, conN = 0;
        while (n-- != 0) {
            s = l.next();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'B') {
                    conB++;
                }
                if (s.charAt(i) == 'R') {
                    conR++;
                }
                if (s.charAt(i) == 'O') {
                    conO++;
                }
                if (s.charAt(i) == 'K') {
                    conK++;
                }
                if (s.charAt(i) == 'E') {
                    conE++;
                }
                if (s.charAt(i) == 'N') {
                    conN++;
                }
            }

            if (conB==conR&&conB==conO&&conB==conK&&conB==conE&&conB==conN
              ||conR==conB&&conR==conO&&conR==conK&&conR==conE&&conR==conN
              ||conO==conB&&conO==conR&&conO==conK&&conO==conE&&conO==conN
              ||conK==conB&&conK==conR&&conK==conO&&conK==conE&&conK==conN
              ||conE==conB&&conE==conR&&conE==conO&&conE==conK&&conE==conN
              ||conN==conB&&conN==conR&&conN==conO&&conN==conK&&conN==conE) {
                System.out.println("No Secure");
            } else {
                System.out.println("Secure");
            }
            conB = 0;
            conR = 0;
            conO = 0;
            conK = 0;
            conE = 0;
            conN = 0;
        }

    }

}
