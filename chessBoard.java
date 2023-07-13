import java.util.*;


public class chessBoard {
    public static void printBoard() {

        String boardTop = "    a   b   c  d   e  f   g  h";
        String botBoard8 = "8 |♖||♘||♗||♔||♕||♗||♘||♖|";
        String botBoard7 = "7 |♙||♙||♙||♙||♙||♙||♙||♙|";
        String blankLine = " |-||-||-||-||-||-||-||-|";
        String playerBoard2 = "2 |♟||♟||♟||♟||♟||♟||♟||♟|";
        String playerBoard1 = "1 |♜||♞||♝||♚||♛||♝||♞||♜|";

        System.out.println(boardTop);
        System.out.println(botBoard8);
        System.out.println(botBoard7);
        System.out.println("6" + blankLine);
        System.out.println("5" + blankLine);
        System.out.println("4" + blankLine);
        System.out.println("3" + blankLine);
        System.out.println(playerBoard2);
        System.out.println(playerBoard1);
    }

    public static void firstPlayerMove() {
        String boardTop = "    a   b   c  d   e  f   g  h";
        String botBoard8 = "8 |♖||♘||♗||♔||♕||♗||♘||♖|";
        String botBoard7 = "7 |♙||♙||♙||♙||♙||♙||♙||♙|";
        String blankLine = " |-||-||-||-||-||-||-||-|";
        String playerBoard2 = "2 |♟||♟||♟||♟||♟||♟||♟||♟|";
        String playerBoard1 = "1 |♜||♞||♝||♚||♛||♝||♞||♜|";

        System.out.println(boardTop);
        System.out.println(botBoard8);
        System.out.println(botBoard7);
        System.out.println("6" + blankLine);
        System.out.println("5" + blankLine);
    }
//    a  b  c  d  e  f  g  h
//8 |♖||♘||♗||♔||♕||♗||♘||♖|
//7 |♙||♙||♙||♙||♙||♙||♙||♙|
//6 |-||-||-||-||-||-||-||-|
//5 |-||-||-||-||-||-||-||-|
//4 |-||-||-||-||-||-||-||-|
//3 |-||-||-||-||-||-||-||-|
//2 |♟||♟||♟||♟||♟||♟||♟||♟|
//1 |♜||♞||♝||♚||♛||♝||♞||♜|

    public static void main(String[] args) {
        String boardTop = "    a   b  c   d  e   f   g  h";
        String botBoard8 = "8 |♖||♘||♗||♔||♕||♗||♘||♖|";
        String botBoard7 = "7 |♙||♙||♙||♙||♙||♙||♙||♙|";
        String blankLine = " |-||-||-||-||-||-||-||-|";
        String playerBoard2 = "2 |♟||♟||♟||♟||♟||♟||♟||♟|";
        String playerBoard1 = "1 |♜||♞||♝||♚||♛||♝||♞||♜|";

        String a2a_ = " |♟||-||-||-||-||-||-||-|";
        String a2a = " |-||♟||♟||♟||♟||♟||♟||♟|";
        String a7a_ = " |♟||-||-||-||-||-||-||-|";
        String a7a = " |-||♟||♟||♟||♟||♟||♟||♟|";

        String b2b_ = " |-||♟||-||-||-||-||-||-|";
        String b2b = " |♟||-||♟||♟||♟||♟||♟||♟|";
        String b7b_ = " |-||♟||-||-||-||-||-||-|";
        String b7b = " |♟||-||♟||♟||♟||♟||♟||♟|";

        String c2c_ = " |-||-||♟||-||-||-||-||-|";
        String c2c = " |♟||♟||-||♟||♟||♟||♟||♟|";
        String c7c_ = " |-||-||♟||-||-||-||-||-|";
        String c7c = " |♟||♟||-||♟||♟||♟||♟||♟|";

        String d2d_ = " |-||-||-||♟||-||-||-||-|";
        String d2d = " |♟||♟||♟||-||♟||♟||♟||♟|";
        String d7d_ = " |-||-||-||♟||-||-||-||-|";
        String d7d = " |♟||♟||♟||-||♟||♟||♟||♟|";

        String e2e_ = " |-||-||-||-||♟||-||-||-|";
        String e2e = " |♟||♟||♟||♟||-||♟||♟||♟|";
        String e7e_ = " |-||-||-||-||♟||-||-||-|";
        String e7e = " |♟||♟||♟||♟||-||♟||♟||♟|";

        String f2f_ = " |-||-||-||-||-||♟||-||-|";
        String f2f = " |♟||♟||♟||♟||♟||-||♟||♟|";
        String f7f_ = " |-||-||-||-||-||♟||-||-|";
        String f7f = " |♟||♟||♟||♟||♟||-||♟||♟|";

        String g2g_ = " |-||-||-||-||-||-||♟||-|";
        String g2g = " |♟||♟||♟||♟||♟||♟||-||♟|";
        String g7g_ = " |-||-||-||-||-||-||♟||-|";
        String g7g = " |♟||♟||♟||♟||♟||♟||-||♟|";

        String h2h_ = " |-||-||-||-||-||-||-||♟|";
        String h2h = " |♟||♟||♟||♟||♟||♟||♟||-|";
        String h7h_ = " |-||-||-||-||-||-||-||♟|";
        String h7h = " |♟||♟||♟||♟||♟||♟||♟||-|";

        printBoard();

        System.out.println("Enter your move (e.g., a2a4): ");

        Scanner scanner = new Scanner(System.in);
        String firstUserMove = scanner.nextLine();
        Random random = new Random();
        switch (firstUserMove) {
            case "A2A3", "a2a3" -> {
                firstPlayerMove();
                System.out.println("4" + blankLine);
                System.out.println("3" + a2a_);
                System.out.println("2" + a2a);
                System.out.println(playerBoard1);

                int botFirstMove = random.nextInt(16) + 1;
                if (botFirstMove == 1) {
                    System.out.println(" ");
                    System.out.println("Bot moved a7a6!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + a7a);
                    System.out.println("6" + a7a_);
                    System.out.println("5" + blankLine);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 2) {
                    System.out.println(" ");
                    System.out.println("Bot moved a7a5!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + a7a);
                    System.out.println("6" + blankLine);
                    System.out.println("5" + a7a_);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 3) {
                    System.out.println(" ");
                    System.out.println("Bot moved b7b6!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + b7b);
                    System.out.println("6" + b7b_);
                    System.out.println("5" + blankLine);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 4) {
                    System.out.println(" ");
                    System.out.println("Bot moved b7b5!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + b7b);
                    System.out.println("6" + blankLine);
                    System.out.println("5" + b7b_);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 5) {
                    System.out.println(" ");
                    System.out.println("Bot moved c7c6!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + c7c);
                    System.out.println("6" + c7c_);
                    System.out.println("5" + blankLine);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 6) {
                    System.out.println(" ");
                    System.out.println("Bot moved c7c5!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + c7c);
                    System.out.println("6" + blankLine);
                    System.out.println("5" + c7c_);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 7) {
                    System.out.println(" ");
                    System.out.println("Bot moved d7d6!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + d7d);
                    System.out.println("6" + d7d_);
                    System.out.println("5" + blankLine);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 8) {
                    System.out.println(" ");
                    System.out.println("Bot moved d7d5!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + d7d);
                    System.out.println("6" + blankLine);
                    System.out.println("5" + d7d_);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 9) {
                    System.out.println(" ");
                    System.out.println("Bot moved e7e6!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + e7e);
                    System.out.println("6" + e7e_);
                    System.out.println("5" + blankLine);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 10) {
                    System.out.println(" ");
                    System.out.println("Bot moved e7e5!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + e7e);
                    System.out.println("6" + blankLine);
                    System.out.println("5" + e7e_);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 11) {
                    System.out.println(" ");
                    System.out.println("Bot moved f7f6!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + f7f);
                    System.out.println("6" + f7f_);
                    System.out.println("5" + blankLine);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 12) {
                    System.out.println(" ");
                    System.out.println("Bot moved e7e5!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + f7f);
                    System.out.println("6" + blankLine);
                    System.out.println("5" + f7f_);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 13) {
                    System.out.println(" ");
                    System.out.println("Bot moved g7g6!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + g7g);
                    System.out.println("6" + g7g_);
                    System.out.println("5" + blankLine);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 14) {
                    System.out.println(" ");
                    System.out.println("Bot moved g7g5!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + g7g);
                    System.out.println("6" + blankLine);
                    System.out.println("5" + g7g_);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 15) {
                    System.out.println(" ");
                    System.out.println("Bot moved h7h6!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + h7h);
                    System.out.println("6" + h7h_);
                    System.out.println("5" + blankLine);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                if (botFirstMove == 16) {
                    System.out.println(" ");
                    System.out.println("Bot moved h7h5!");
                    System.out.println(boardTop);
                    System.out.println(botBoard8);
                    System.out.println("7" + h7h);
                    System.out.println("6" + blankLine);
                    System.out.println("5" + h7h_);
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
            }
                case "A2A4", "a2a4" -> {
                    firstPlayerMove();
                    System.out.println("4" + a2a_);
                    System.out.println("3" + blankLine);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);

                    int botFirstMove = random.nextInt(16) + 1;
                    if (botFirstMove == 1) {
                        System.out.println(" ");
                        System.out.println("Bot moved a7a6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + a7a);
                        System.out.println("6" + a7a_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 2) {
                        System.out.println(" ");
                        System.out.println("Bot moved a7a5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + a7a);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + a7a_);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 3) {
                        System.out.println(" ");
                        System.out.println("Bot moved b7b6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + b7b);
                        System.out.println("6" + b7b_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 4) {
                        System.out.println(" ");
                        System.out.println("Bot moved b7b5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + b7b);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + b7b_);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 5) {
                        System.out.println(" ");
                        System.out.println("Bot moved c7c6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + c7c);
                        System.out.println("6" + c7c_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 6) {
                        System.out.println(" ");
                        System.out.println("Bot moved c7c5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + c7c);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + c7c_);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 7) {
                        System.out.println(" ");
                        System.out.println("Bot moved d7d6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + d7d);
                        System.out.println("6" + d7d_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 8) {
                        System.out.println(" ");
                        System.out.println("Bot moved d7d5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + d7d);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + d7d_);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 9) {
                        System.out.println(" ");
                        System.out.println("Bot moved e7e6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + e7e);
                        System.out.println("6" + e7e_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 10) {
                        System.out.println(" ");
                        System.out.println("Bot moved e7e5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + e7e);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + e7e_);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 11) {
                        System.out.println(" ");
                        System.out.println("Bot moved f7f6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + f7f);
                        System.out.println("6" + f7f_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 12) {
                        System.out.println(" ");
                        System.out.println("Bot moved e7e5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + f7f);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + f7f_);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 13) {
                        System.out.println(" ");
                        System.out.println("Bot moved g7g6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + g7g);
                        System.out.println("6" + g7g_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 14) {
                        System.out.println(" ");
                        System.out.println("Bot moved g7g5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + g7g);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + g7g_);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 15) {
                        System.out.println(" ");
                        System.out.println("Bot moved h7h6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + h7h);
                        System.out.println("6" + h7h_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 16) {
                        System.out.println(" ");
                        System.out.println("Bot moved h7h5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + h7h);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + h7h_);
                        System.out.println("4" + a2a_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + a2a);
                        System.out.println(playerBoard1);
                    }
                }
                case "b2b3", "B2B3" -> {
                    firstPlayerMove();
                    System.out.println("3" + blankLine);
                    System.out.println("3" + b2b_);
                    System.out.println("2" + b2b);
                    System.out.println(playerBoard1);
                }
                case "b2b4", "B2B4" -> {
                    firstPlayerMove();
                    System.out.println("4" + b2b_);
                    System.out.println("3" + blankLine);
                    System.out.println("2" + b2b);
                    System.out.println(playerBoard1);

                    int botFirstMove = random.nextInt(16) + 1;
                    if (botFirstMove == 1) {
                        System.out.println(" ");
                        System.out.println("Bot moved a7a6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + a7a);
                        System.out.println("6" + a7a_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 2) {
                        System.out.println(" ");
                        System.out.println("Bot moved a7a5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + a7a);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + a7a_);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 3) {
                        System.out.println(" ");
                        System.out.println("Bot moved b7b6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + b7b);
                        System.out.println("6" + b7b_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 4) {
                        System.out.println(" ");
                        System.out.println("Bot moved b7b5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + b7b);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + b7b_);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 5) {
                        System.out.println(" ");
                        System.out.println("Bot moved c7c6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + c7c);
                        System.out.println("6" + c7c_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 6) {
                        System.out.println(" ");
                        System.out.println("Bot moved c7c5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + c7c);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + c7c_);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 7) {
                        System.out.println(" ");
                        System.out.println("Bot moved d7d6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + d7d);
                        System.out.println("6" + d7d_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 8) {
                        System.out.println(" ");
                        System.out.println("Bot moved d7d5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + d7d);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + d7d_);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 9) {
                        System.out.println(" ");
                        System.out.println("Bot moved e7e6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + e7e);
                        System.out.println("6" + e7e_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 10) {
                        System.out.println(" ");
                        System.out.println("Bot moved e7e5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + e7e);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + e7e_);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 11) {
                        System.out.println(" ");
                        System.out.println("Bot moved f7f6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + f7f);
                        System.out.println("6" + f7f_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 12) {
                        System.out.println(" ");
                        System.out.println("Bot moved e7e5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + f7f);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + f7f_);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 13) {
                        System.out.println(" ");
                        System.out.println("Bot moved g7g6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + g7g);
                        System.out.println("6" + g7g_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 14) {
                        System.out.println(" ");
                        System.out.println("Bot moved g7g5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + g7g);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + g7g_);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 15) {
                        System.out.println(" ");
                        System.out.println("Bot moved h7h6!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + h7h);
                        System.out.println("6" + h7h_);
                        System.out.println("5" + blankLine);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                    if (botFirstMove == 16) {
                        System.out.println(" ");
                        System.out.println("Bot moved h7h5!");
                        System.out.println(boardTop);
                        System.out.println(botBoard8);
                        System.out.println("7" + h7h);
                        System.out.println("6" + blankLine);
                        System.out.println("5" + h7h_);
                        System.out.println("4" + b2b_);
                        System.out.println("3" + blankLine);
                        System.out.println("2" + b2b);
                        System.out.println(playerBoard1);
                    }
                }
                case "c2c3", "C2C3" -> {
                    firstPlayerMove();
                    System.out.println("4" + blankLine);
                    System.out.println("3" + c2c_);
                    System.out.println("2" + c2c);
                    System.out.println(playerBoard1);
                }
                case "c2c4", "C2C4" -> {
                    firstPlayerMove();
                    System.out.println("4" + c2c_);
                    System.out.println("3" + blankLine);
                    System.out.println("2" + c2c);
                    System.out.println(playerBoard1);
                }
                case "d2d3", "D2D3" -> {
                    firstPlayerMove();
                    System.out.println("4" + blankLine);
                    System.out.println("3" + d2d_);
                    System.out.println("2" + d2d);
                    System.out.println(playerBoard1);
                }
                case "d2d4", "D2D4" -> {
                    firstPlayerMove();
                    System.out.println("4" + d2d_);
                    System.out.println("3" + blankLine);
                    System.out.println("2" + d2d);
                    System.out.println(playerBoard1);
                }
                case "e2e3", "E2E3" -> {
                    firstPlayerMove();
                    System.out.println("4" + blankLine);
                    System.out.println("3" + e2e_);
                    System.out.println("2" + e2e);
                    System.out.println(playerBoard1);
                }
                case "e2e4", "E2E4" -> {
                    firstPlayerMove();
                    System.out.println("4" + e2e_);
                    System.out.println("3" + blankLine);
                    System.out.println("2" + e2e);
                    System.out.println(playerBoard1);
                }
                case "f2f3", "F2F3" -> {
                    firstPlayerMove();
                    System.out.println("4" + blankLine);
                    System.out.println("3" + f2f_);
                    System.out.println("2" + f2f);
                    System.out.println(playerBoard1);
                }
                case "f2f4", "F2F4" -> {
                    firstPlayerMove();
                    System.out.println("4" + f2f_);
                    System.out.println("3" + blankLine);
                    System.out.println("2" + f2f);
                    System.out.println(playerBoard1);
                }
                case "g2g3", "G2G3" -> {
                    firstPlayerMove();
                    System.out.println("4" + blankLine);
                    System.out.println("3" + g2g_);
                    System.out.println("2" + g2g);
                    System.out.println(playerBoard1);
                }
                case "g2g4", "G2G4" -> {
                    firstPlayerMove();
                    System.out.println("4" + g2g_);
                    System.out.println("3" + blankLine);
                    System.out.println("2" + g2g);
                    System.out.println(playerBoard1);
                }
                case "h2h3", "H2H3" -> {
                    firstPlayerMove();
                    System.out.println("4" + blankLine);
                    System.out.println("3" + h2h_);
                    System.out.println("2" + h2h);
                    System.out.println(playerBoard1);
                }
                case "h2h4", "H2H4" -> {
                    firstPlayerMove();
                    System.out.println("4" + h2h_);
                    System.out.println("3" + blankLine);
                    System.out.println("2" + h2h);
                    System.out.println(playerBoard1);
                }


            }

        }
    }


