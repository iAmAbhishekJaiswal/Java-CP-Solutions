public class RandomCard{
  public static void main(String[] args){
   byte rank,suit;
   rank=(byte)(Math.random()*13+1);
   suit=(byte)(Math.random()*5);

   switch(rank)
   {
    case 1: if(suit==0)
    System.out.println("The card you picked is Ace of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is Ace of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is Ace of Hearts !");
    else
    System.out.println("The card you picked is Ace of Spades !");
    break;

    case 2: if(suit==0)
    System.out.println("The card you picked is 2 of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is 2 of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is 2 of Hearts !");
    else
    System.out.println("The card you picked is 2 of Spades !");
    break;

    case 3:if(suit==0)
    System.out.println("The card you picked is 3 of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is 3 of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is 3 of Hearts !");
    else
    System.out.println("The card you picked is 3 of Spades !");
    break;

    case 4:if(suit==0)
    System.out.println("The card you picked is 4 of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is 4 of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is 4 of Hearts !");
    else
    System.out.println("The card you picked is 4 of Spades !");
    break;

    case 5:if(suit==0)
    System.out.println("The card you picked is 5 of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is 5 of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is 5 of Hearts !");
    else
    System.out.println("The card you picked is 5 of Spades !");
    break;

    case 6:if(suit==0)
    System.out.println("The card you picked is 6 of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is 6 of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is 6 of Hearts !");
    else
    System.out.println("The card you picked is 6 of Spades !");
    break;

    case 7: if(suit==0)
    System.out.println("The card you picked is 7 of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is 7 of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is 7 of Hearts !");
    else
    System.out.println("The card you picked is 7 of Spades !");
    break;

    case 8:if(suit==0)
    System.out.println("The card you picked is 8 of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is 8 of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is 8 of Hearts !");
    else
    System.out.println("The card you picked is 8 of Spades !");
    break;

    case 9:if(suit==0)
    System.out.println("The card you picked is 9 of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is 9 of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is 9 of Hearts !");
    else
    System.out.println("The card you picked is 9 of Spades !");
    break;

    case 10:if(suit==0)
    System.out.println("The card you picked is 11 of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is 11 of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is 11 of Hearts !");
    else
    System.out.println("The card you picked is 11 of Spades !");
    break;

    case 11:if(suit==0)
    System.out.println("The card you picked is Jack of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is Jack of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is Jack of Hearts !");
    else
    System.out.println("The card you picked is Jack of Spades !");
    break;

    case 12:if(suit==0)
    System.out.println("The card you picked is Queen of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is Queen of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is Queen of Hearts !");
    else
    System.out.println("The card you picked is Queen of Spades !");
    break;

    case 13:if(suit==0)
    System.out.println("The card you picked is King of Clubs ! ");
    else if(suit==1)
    System.out.println("The card you picked is King of Diamonds !");
    else if(suit==2)
    System.out.println("The card you picked is King of Hearts !");
    else
    System.out.println("The card you picked is King of Spades !");
    break;
   }
  }
}
