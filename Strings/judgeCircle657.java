package Strings;

public class judgeCircle657 {
    public static void main(String[] args) {
       String moves = "RR";

       System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves) {
       char moves2[] = moves.toCharArray();
        int x =0; int y = 0;
       for(char move : moves2){
            if(move == 'L'){
                x--;
            }else if (move == 'R') {
                x++;
            }else if(move == 'U'){
                y++;
            }else if(move == 'D'){
                y--;
            }

       }            return x == 0 && y == 0;

    }
}
