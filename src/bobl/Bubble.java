package bobl;

public class Bubble
{
        public static void main(String[] args)
  {
            Array one = new Array(4);
            one.add(21);
            one.add(3);
            one.add(0);
            one.add(134);
            one.add(8);
            one.add(99);
            //    one.bubble();
            one.display();
            one.bubble();
            one.display();
        }
    }
