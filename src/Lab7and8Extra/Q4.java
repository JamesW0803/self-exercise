package Lab7and8Extra;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random rand = new Random();
        MyQueue <String> player1 = new MyQueue<>();
        MyQueue <String> player2 = new MyQueue<>();

        for (int i = 0; i < 5; i++){
            int randomColor = rand.nextInt(4) + 1;

            String player1Card = "";
            switch (randomColor){
                case 1:
                    player1Card = generateValue() + " Yellow";
                    player1.enqueue(player1Card);
                    break;
                case 2:
                    player1Card = generateValue() + " Blue";
                    player1.enqueue(player1Card);
                    break;
                case 3:
                    player1Card = generateValue() + " Green";
                    player1.enqueue(player1Card);
                    break;
                case 4:
                    player1Card = generateValue() + " Red";
                    player1.enqueue(player1Card);
                    break;
            }
        }

        for (int i = 0; i < 5; i++){
            int randomColor = rand.nextInt(4) + 1;

            String player2Card = "";
            switch (randomColor){
                case 1:
                    player2Card = generateValue() + " Yellow";
                    player2.enqueue(player2Card);
                    break;
                case 2:
                    player2Card = generateValue() + " Blue";
                    player2.enqueue(player2Card);
                    break;
                case 3:
                    player2Card = generateValue() + " Green";
                    player2.enqueue(player2Card);
                    break;
                case 4:
                    player2Card = generateValue() + " Red";
                    player2.enqueue(player2Card);
                    break;
            }
        }

        System.out.println("Player 1 Card: ");
        player1.displayProduct();
        System.out.println();
        System.out.println("Player 2 Card: ");
        player2.displayProduct();
        System.out.println();

        int finalScoreP1 = 0;
        int finalScoreP2 = 0;
        int tempScoreP1 = 0;
        for (int i = 0; i < player1.getSize(); i++){
            tempScoreP1 = comparePlayerCard(player1.dequeue(), player2.dequeue());
            if (tempScoreP1 > 0){
                finalScoreP1 += 1;
            }else if (tempScoreP1 == 0){
                finalScoreP2 += 2;
            }else if (tempScoreP1 < 0){
                finalScoreP1 += 0;
                finalScoreP2 += 0;
            }
        }
        System.out.println("Player 1 Score: " + finalScoreP1);
        System.out.println("Player 2 Score: " + finalScoreP2);
        if (finalScoreP1 > finalScoreP2) {
            System.out.println("Player 1 wins!");
        } else if (finalScoreP1 == finalScoreP2) {
            System.out.println("It's a draw!");
        } else
            System.out.println("Player 2 wins!");
    }

    public static int comparePlayerCard(String player1Card, String player2Card){
        String[] player1 = player1Card.split(" ");
        String[] player2 = player2Card.split(" ");

        int player1Score;

        if (player1[2].equals(player2[2])){
            if (Integer.parseInt(player1[0]) - Integer.parseInt(player2[0]) > 0){
                player1Score = 1;
                return player1Score;
            }else if (Integer.parseInt(player1[0]) - Integer.parseInt(player2[0]) == 0){
                player1Score = -1;
                return player1Score;
            }else if (Integer.parseInt(player1[0]) - Integer.parseInt(player2[0]) < 0){
                player1Score = 0;
                return player1Score;
            }
        }else if (player1[2].equals("Red")){
            player1Score = 1;
            return player1Score;
        }else if (player1[2].equals("Green") && player2[2].equals("Blue") || player2[2].equals("Yellow")){
            player1Score = 1;
            return player1Score;
        }else if (player1[2].equals("Blue") && player2[2].equals("Yellow")){
            player1Score = 1;
            return player1Score;
        }else if (player1[2].equals("Yellow") && !(player2[2].equals("Yellow"))){
            player1Score = 0;
            return player1Score;
        }else if (player2[2].equals("Red")){
            player1Score = 0;
            return player1Score;
        }
        return 100;
    }

    public static String generateValue(){
        Random rand = new Random();
        int randomCardValue = rand.nextInt(10) + 1;

        if (randomCardValue == 10){
            return "10 Ten ";
        }else if (randomCardValue == 9){
            return "9 ine ";
        }else if (randomCardValue == 8){
            return "8 Eight ";
        }else if (randomCardValue == 7){
            return "7 Seven ";
        }else if (randomCardValue == 6){
            return "6 Six ";
        }else if (randomCardValue == 5){
            return "5 Five ";
        }else if (randomCardValue == 4){
            return "4 Four ";
        }else if (randomCardValue == 3){
            return "3 Three ";
        }else if (randomCardValue == 2){
            return "2 Two ";
        }else if (randomCardValue == 1) {
            return "1 One ";
        }else{
            return " ";
        }
    }
}
