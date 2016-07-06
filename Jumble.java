import java.util.*;
public class Jumble
{

    public Jumble()
    {

    }

    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("giraffe");
        words.add("fairies");
        words.add("computer");
        words.add("leech");
        words.add("speaker");
        words.add("dinosaur");
        words.add("leaves");
        words.add("cricket");
        words.add("water");
        words.add("clever");
        words.add("array");
        words.add("queen");
        words.add("daisies");
        System.out.println("Word scrambler! Enter 0 to get a word or 1 to quit.");
        Scanner scan=new Scanner(System.in);
        int next=scan.nextInt();
        if(next==0)
        {
            ArrayList<String> second = new ArrayList<String>();
            ArrayList<String> third = new ArrayList<String>();
            for(int x=0; x<words.size(); x++)
            {
                int y=(int)(Math.random()*words.size());
                if(words.get(y).equals("null"))
                {
                    x--;
                }
                else
                {
                    second.add(words.get(y));
                    words.set(y, "null");
                }
            }
            for(int x=0; x<words.size(); x++)
            {
                third.add(second.get(x));
            }
            for(int x=0; x<second.size(); x++)
            {
                for(int w=0; w<third.get(x).length(); w++)
                {
                    String s=second.get(x);
                    int a=(int)(Math.random()*s.length());
                    String r=s.substring(a, a+1);
                    int b=(int)(Math.random()*s.length());
                    String t=s.substring(b, b+1);
                    s=s.substring(0, a)+t+s.substring(a+1);
                    s=s.substring(0, b)+r+s.substring(b+1);
                    second.set(x, s);

                }
            }
            int time=0;
            while(time<third.size())
            {
                
                System.out.println("Unscramble this word and enter: " + second.get(time));
                Scanner str=new Scanner(System.in);
                String stri=str.next();
                if(stri.equals(third.get(time))) System.out.println("Congratulations! Enter 0 to get another word, enter 1 to quit.");
                else System.out.println("Sorry, the word is " + third.get(time) + ". Enter 0 to get another word, enter 1 to quit.");
                Scanner st=new Scanner(System.in);
                int in=st.nextInt();
                if(in==0)
                {
                    time++;
                    if(time==third.size()) System.out.println("That was the last word in the list! Goodbye.");
                }
                else
                {
                    time=third.size();
                }
            }
        }
    }
}
