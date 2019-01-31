import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

import java.util.ArrayList;
import java.util.Collections;

public class PokerRunner
	{
		static ArrayList<Card> playerHand = new ArrayList<Card>();
		static ArrayList<Card> computerHand = new ArrayList<Card>();
		static String name;
		static int balance;
		static int ante;
		static int bet1;
		static int bet2;
		static int bet3;
		static int totalBet;

		public static void main(String[] args)
			{
				Deck.fillDeck();
				Deck.shuffle();
//				greetPlayer();
				purchaseChips();
				createHands();
				playPoker();
//				HierarchyOfCards.hierarchy();
				HierarchyOfCards.onePair();
			}

		public static void greetPlayer()
			{
				System.out.println("So we are going to be playing a game of poker, but we will only be playing with winning scenarios of a two of a kind, three of a kind, or a four of a kind.");
				System.out.println("Hey player, what is your name?");
				Scanner userInput = new Scanner(System.in);
				name = userInput.nextLine();
				System.out.println("Nice to meet you " + name + "! Hope you have a good time!");
			}

		public static void purchaseChips()
			{
				System.out.println(
						"How many chips would you like to buy today? You can buy a maximum of 1000 chips! (Please enter in only numbers)");
				Scanner userInput = new Scanner(System.in);
				int balance1 = userInput.nextInt();
				balance = balance1;
				boolean fairBalance = true;
				while (fairBalance)
					{
						if (balance > 1000)
							{
								System.out.println(
										"You would like to purchase too many chips, please re-enter a smaller amount.");
								int newBalance = userInput.nextInt();
								balance = newBalance;
							} else if (balance < 0)
							{
								System.out.println(
										"You cannot purchase negative chips, please re-enter a positive amount under 1000!");
								int newBalance = userInput.nextInt();
								balance = newBalance;
							} else if (balance == 0)
							{
								System.out.println(
										"You have to at least buy 1 chip in order to play, please re-enter a greater amount.");
								int newBalance = userInput.nextInt();
								balance = newBalance;
							} else
							{
								System.out.println("OK good to go!");
								fairBalance = false;
							}
					}
			}

		public static void createHands()
			{
				System.out.println("You've been dealt:");
				for (int i = 0; i < 4; i = i + 2)
					{
						playerHand.add(Deck.deck.get(i));
						System.out.println(Deck.deck.get(i).getRank() + " of " + Deck.deck.get(i).getSuit());
					}
				System.out.println();
				System.out.println("The computer has been dealt:");
				for (int i = 1; i < 4; i = i + 2)
					{
						computerHand.add(Deck.deck.get(i));
						System.out.println(Deck.deck.get(i).getRank() + " of " + Deck.deck.get(i).getSuit());
					}
				for (int i = 3; i >= 0; i--)
					{
						Deck.deck.remove(i);
					}
			}
		public static void playPoker()
		{
			System.out.println();
			System.out.println("So " + name + ", the ante is 10 chips. Press enter to pay the ante and begin the round.");
			Scanner play = new Scanner(System.in);
			String space = play.nextLine();
			ante = 10;
			System.out.println("The flop is:");
			for (int i = 2; i >= 0; i--)
				{
					System.out.println(Deck.deck.get(i).getRank() + " of " + Deck.deck.get(i).getSuit());
					playerHand.add(Deck.deck.get(i));
					computerHand.add(Deck.deck.get(i));
				}
			// Give the option of folding
			System.out.println("Would you like to make a bet? Please enter a yes or no answer.");
			boolean goodAnswer = true;
			while (goodAnswer)
				{
			Scanner userInput1 = new Scanner(System.in);
			String answer1 = userInput1.nextLine();
			String upperCase1 = answer1.toUpperCase();
					if (upperCase1.equals("YES"))
						{
							System.out.println("How much would you like to bet? Please enter just a number, and make sure that it is within your total number of chips");
							Scanner userInput = new Scanner(System.in);
							bet1 = userInput.nextInt();
							System.out.println("The next card flipped is:");
							goodAnswer = false;
						}
					else if (upperCase1.equals("NO"))
						{
							System.out.println("Ok, here is the next card flipped:");
							bet1 = 0;
							goodAnswer = false;
						}
					else
						{
							System.out.println("Please enter in a yes or no answer!");
						}
				}
			 System.out.println(Deck.deck.get(3).getRank() + " of " + Deck.deck.get(3).getSuit());
			 playerHand.add(Deck.deck.get(3));
			 computerHand.add(Deck.deck.get(3));
			 System.out.println("Would you like to make a bet?");
			 boolean goodAnswer2 = true;
			 while (goodAnswer2)
					{
			 Scanner userInput2 = new Scanner(System.in);
				String answer2 = userInput2.nextLine();
				String upperCase2 = answer2.toUpperCase();
						if (upperCase2.equals("YES"))
							{
								System.out.println("How much would you like to bet? Please enter just a number, and make sure that it is within your total number of chips");
								Scanner userInput = new Scanner(System.in);
								bet2 = userInput.nextInt();
								System.out.println("The next card flipped is:");
								goodAnswer2 = false;
							}
						else if (upperCase2.equals("NO"))
							{
								System.out.println("Ok, here is the next card flipped:");
								bet2 = 0;
								goodAnswer2 = false;
							}
						else
							{
								System.out.println("Please enter in a yes or no answer!");
							}
					}
			System.out.println(Deck.deck.get(4).getRank() + " of " + Deck.deck.get(4).getSuit());
			playerHand.add(Deck.deck.get(4));
			computerHand.add(Deck.deck.get(4));
			System.out.println("Would you like to make any final bets?");
			boolean goodAnswer3 = true;
			while (goodAnswer3)
				{
			Scanner userInput3 = new Scanner(System.in);
			String answer3 = userInput3.nextLine();
			String upperCase3 = answer3.toUpperCase();
					if (upperCase3.equals("YES"))
						{
							System.out.println("How much would you like to bet? Please enter just a number, and make sure that it is within your total number of chips");
							Scanner userInput = new Scanner(System.in);
							bet3 = userInput.nextInt();
							goodAnswer3 = false;
						}
					else if (upperCase3.equals("NO"))
						{
							System.out.println("Ok, here is who won:");
							bet3 = 0;
							goodAnswer3 = false;
						}
					else
						{
							System.out.println("Please enter in a yes or no answer!");
						}
				}
			totalBet = ante + bet1 + bet2 + bet3;
			HierarchyOfCards.onePair();
			// compare the playerHand cards to the 5 cards and decide what the best option is 
			// compare the computerHand cards to the 5 cards and decide what the best option is
			// whichever hand is better then receives all the pot
			// put all cards into a discard pile and deal a new hand
			// once too little cards to play, shuffle all of the discard pile and put it back into the real deck
				// FOR HIERACRCHY OF CARDS
					// have to create a system in which the computer can compare all of the best options 
					// have it compare the best to worst and then eliminate options to continue down the list
					// create it where it can take either card of the hands or take both cards of the player hands
		}
	}
