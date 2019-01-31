import java.util.ArrayList;
import java.util.Scanner;
public class HierarchyOfCards
	{
		static ArrayList<Card> playerDeal = new ArrayList<Card>();
		static ArrayList<Card> computerDeal = new ArrayList<Card>();
		static int heartCounter = 0;
		static int clubCounter = 0;
		static int spadeCounter = 0;
		static int diamondCounter = 0;
		static int pair = 0;
//		public static void hierarchy()
//		{
//			playerDeal.add(PokerRunner.playerHand.get(0));
//			playerDeal.add(PokerRunner.playerHand.get(1));
//			for (int i = 4; i <= 0; i--)
//				{
//					playerDeal.add(Deck.deck.get(i));
//				}
//			computerDeal.add(PokerRunner.computerHand.get(0));
//			computerDeal.add(PokerRunner.computerHand.get(1));
//			for (int i = 4; i <= 0; i--)
//				{
//					computerDeal.add(Deck.deck.get(i));
//				}
//		}
//		public static void flush()
//		{
//			boolean isFlush = false;
//			for (int i = 0; i < playerDeal.size(); i++)
//				{
//					if (playerDeal.get(i).getRank() == "hearts")
//						{
//							heartCounter = heartCounter + 1;
//						}
//					else if (playerDeal.get(i).getRank() == "clubs")
//						{
//							clubCounter = clubCounter + 1;
//						}
//					else if (playerDeal.get(i).getRank() == "diamonds")
//						{
//							diamondCounter = diamondCounter + 1;
//						}
//					else if (playerDeal.get(i).getRank() == "spades")
//						{
//							spadeCounter = spadeCounter + 1;
//						}
//				}
//			if (heartCounter == 5 || spadeCounter == 5 || diamondCounter == 5 || clubCounter == 5)
//				{
//					isFlush = true;
//					System.out.println("You had a flush");
//				}
//		}
		public static void straight()
		{
			
		}
		public static void straightFlush()
		{
			
		}
		public static void fullHouse()
		{
			
		}
		public static void twoPairs()
		{
			
		}
		public static void fourOfKind()
		{
			
		}
		public static void threeOfKind()
		{
			
		}
		public static void onePair()
		{
			boolean isPair = false;
			System.out.println("In isPair");
			for (int i = 0; i < PokerRunner.playerHand.size(); i++)
				{
					for (int x = 0; x < PokerRunner.playerHand.size(); i++)
						{
							if (PokerRunner.playerHand.get(i).getValue() == PokerRunner.playerHand.get(x).getValue())
								{
									pair = pair + 1;
								}
						}
				}
			if (pair == 8)
				{
					isPair = true;
					System.out.println("You have a pair");
				}
		}
	}
