package com.leetcode;

import java.io.IOException;
import java.util.Scanner;


/**
 * Created by summer on 2017/3/18.
 * 1 means rock, 2 means paper, 3 means scissor.
 */
public class FingerGuessing {
    private static String[] str = new String[3];
    static {
        str[0] = "Rock";
        str[1] = "Paper";
        str[2] = "Scissor";
    }

    public void startGame() throws IOException{
        while(true) {
            int input = 0;
            System.out.println("==============Welcome the Game============");
            System.out.println("please enter '1' for Rock, '2' for Paper, '3' for Scissor, '0' to exit");
            Scanner scan = new Scanner(System.in);

            try {
                input = scan.nextInt();
                if (input < 0 || input > 3){
                    throw new Exception();
                }
            }catch (Exception e){
                System.out.println("wrong input, please enter again!!");
                continue;
            }

            int output = (int)(Math.random() * 2 + 1);
            if (input == 0){
                System.out.println("Bye!");
                break;
            }
            else if ((output == 1 && input == 2)||(output == 2 && input == 3)||
                    (output == 3 && input == 1)){
                System.out.println("Computer: " + str[output - 1] + ", You: " + str[input - 1] + ", you win!");
            }
            else if (output == input){
                System.out.println("Computer: " + str[output - 1] + ", You: " + str[input - 1] + ", draw!");
            }
            else {
                System.out.println("Computer: " + str[output - 1] + ", You: " + str[input - 1] + ", you lose!");
            }

        }
    }

    public static void main(String[] args) throws IOException{
        FingerGuessing fg = new FingerGuessing();
        fg.startGame();
    }
}
