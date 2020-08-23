public class Main
{
    public static void main(String[] args) {
        game_method(true, 10000,20,500);
    }
    public static void game_method(boolean gameover_1, int score, int level, int bonus)
    {
        if (gameover_1)
        {
            int extra_bonus = 10000;
            int final_score1= score + (bonus * level);
            final_score1=final_score1+extra_bonus;
            System.out.println("The final score is :"+final_score1);
        }
    }
}