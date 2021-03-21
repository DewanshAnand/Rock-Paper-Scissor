package com.company;

import java.util.Scanner;

public class RockPaperScissor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock,Paper,Scissors !!");
        while (true)
        {
            //Taking input form the user
            System.out.println("What is  your move? To make a move enter rock,paper or scissor. To quit the game,enter quit: ");
            String Mymove = sc.nextLine();

            if (Mymove.equals("quit")) //To quit the game
            {
                break;
            }
            if(!Mymove.equals("rock")&& !Mymove.equals("paper")&& !Mymove.equals("scissor")) //If user enters something different
            {
                System.out.println("Your move is invalid.");
            }
            else
            {
                int rand = (int)(Math.random()*3); //Generating 0,1,2. We do not want decimals so we have used int.
                String opponentMove = "";
                if(rand==0)
                {
                    opponentMove="rock";
                }
                else if(rand==1)
                {
                    opponentMove= "paper";
                }
                else if(rand==2)
                {
                    opponentMove="scissors";
                }
                System.out.println("Opponent Move: "+ opponentMove);

                if(Mymove.equals(opponentMove))
                {
                    System.out.println("It's a Tie");
                }
                else if(Mymove.equals("rock")&& opponentMove.equals("scissors") || Mymove.equals("scissors")
                        &&opponentMove.equals("paper") || Mymove.equals("paper")&& opponentMove.equals("rock"))
                {
                    System.out.println("You won!");
                }
                else
                {
                    System.out.println("You Lost!");
                }
            }
        } System.out.println("Thanks for Playing!!");

    }
}
