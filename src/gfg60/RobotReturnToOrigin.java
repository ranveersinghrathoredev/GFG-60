package gfg60;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String s1 = "UDRL";
        String s2 = "URR";

        System.out.println("Robot return to origin: "+ robotOriginCheck(s2) );
    }
        private static boolean robotOriginCheck(String moves) {

            int x = 0;
            int y = 0;

            for(int i = 0; i < moves.length(); i++) {
                char move = moves.charAt(i);

                if(move == 'U') y++;
                if(move == 'D') y--;
                if(move == 'R') x++;
                if(move == 'L') x--;

            }
            return x == 0 && y == 0;
        }

}
