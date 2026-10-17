package gfg60;

import java.util.ArrayList;
import java.util.List;

public class SnakeInMatrix {
    public static void main(String[] args) {
        List<String> commands = new ArrayList<>();
        commands.add("DOWN");
        commands.add("RIGHT");
        commands.add("RIGHT");
        int n = 3;
        System.out.println(finalPositionOfSnake(n, commands));
    }
        private static int finalPositionOfSnake(int n, List<String> commands) {

            int currentRow = 0;
            int currentCol = 0;

            for(String command: commands) {
                if(command.equals("UP")) {
                    currentRow--;
                } else if(command.equals("DOWN")) {
                    currentRow++;
                } else if(command.equals("LEFT")) {
                    currentCol--;
                } else if(command.equals("RIGHT")) {
                    currentCol++;
                }
            }
            return (currentRow * n) + currentCol;
        }
}
