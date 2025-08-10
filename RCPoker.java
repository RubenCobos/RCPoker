package poker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Comparator;

public class RCPoker
{
	private static void initDeck(ArrayList<PlayingCard> deck) // Initialize the deck.
	{
		PlayingCard card = null;
		
		// Spades
		
		// Ace of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.ACE);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[A\u2660]\u001B[0m");
		deck.add(card);
		
		// Two of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.TWO);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[2\u2660]\u001B[0m");
		deck.add(card);
		
		// Three of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.THREE);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[3\u2660]\u001B[0m");
		deck.add(card);
		
		// Four of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.FOUR);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[4\u2660]\u001B[0m");
		deck.add(card);
		
		// Five of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.FIVE);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[5\u2660]\u001B[0m");
		deck.add(card);
		
		// Six of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.SIX);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[6\u2660]\u001B[0m");
		deck.add(card);
		
		// Seven of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.SEVEN);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[7\u2660]\u001B[0m");
		deck.add(card);
		
		// Eight of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.EIGHT);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[8\u2660]\u001B[0m");
		deck.add(card);
		
		// Nine of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.NINE);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[9\u2660]\u001B[0m");
		deck.add(card);
		
		// Ten of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.TEN);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[10\u2660]\u001B[0m");
		deck.add(card);
		
		// Jack of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.JACK);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[J\u2660]\u001B[0m");
		deck.add(card);
		
		// Queen of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.QUEEN);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[Q\u2660]\u001B[0m");
		deck.add(card);
		
		// King of Spades
		card = new PlayingCard();
		card.setRank(PlayingCard.KING);
		card.setSuit(PlayingCard.SPADES);
		card.setDisplay("\u001B[30m[K\u2660]\u001B[0m");
		deck.add(card);
		
		// Diamonds
		
		// Ace of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.ACE);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[A\u2666]\u001B[0m");
		deck.add(card);
		
		// Two of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.TWO);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[2\u2666]\u001B[0m");
		deck.add(card);
		
		// Three of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.THREE);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[3\u2666]\u001B[0m");
		deck.add(card);
		
		// Four of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.FOUR);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[4\u2666]\u001B[0m");
		deck.add(card);
		
		// Five of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.FIVE);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[5\u2666]\u001B[0m");
		deck.add(card);
		
		// Six of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.SIX);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[6\u2666]\u001B[0m");
		deck.add(card);
		
		// Seven of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.SEVEN);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[7\u2666]\u001B[0m");
		deck.add(card);
		
		// Eight of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.EIGHT);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[8\u2666]\u001B[0m");
		deck.add(card);
		
		// Nine of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.NINE);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[9\u2666]\u001B[0m");
		deck.add(card);
		
		// Ten of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.TEN);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[10\u2666]\u001B[0m");
		deck.add(card);
		
		// Jack of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.JACK);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[J\u2666]\u001B[0m");
		deck.add(card);
		
		// Queen of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.QUEEN);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[Q\u2666]\u001B[0m");
		deck.add(card);
		
		// King of Diamonds
		card = new PlayingCard();
		card.setRank(PlayingCard.KING);
		card.setSuit(PlayingCard.DIAMONDS);
		card.setDisplay("\u001B[31m[K\u2666]\u001B[0m");
		deck.add(card);
		
		// Clubs
		
		// Ace of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.ACE);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[A\u2663]\u001B[0m");
		deck.add(card);
		
		// Two of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.TWO);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[2\u2663]\u001B[0m");
		deck.add(card);
		
		// Three of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.THREE);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[3\u2663]\u001B[0m");
		deck.add(card);
		
		// Four of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.FOUR);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[4\u2663]\u001B[0m");
		deck.add(card);
		
		// Five of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.FIVE);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[5\u2663]\u001B[0m");
		deck.add(card);
		
		// Six of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.SIX);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[6\u2663]\u001B[0m");
		deck.add(card);
		
		// Seven of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.SEVEN);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[7\u2663]\u001B[0m");
		deck.add(card);
		
		// Eight of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.EIGHT);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[8\u2663]\u001B[0m");
		deck.add(card);
		
		// Nine of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.NINE);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[9\u2663]\u001B[0m");
		deck.add(card);
		
		// Ten of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.TEN);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[10\u2663]\u001B[0m");
		deck.add(card);
		
		// Jack of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.JACK);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[J\u2663]\u001B[0m");
		deck.add(card);
		
		// Queen of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.QUEEN);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[Q\u2663]\u001B[0m");
		deck.add(card);
		
		// King of Clubs
		card = new PlayingCard();
		card.setRank(PlayingCard.KING);
		card.setSuit(PlayingCard.CLUBS);
		card.setDisplay("\u001B[30m[K\u2663]\u001B[0m");
		deck.add(card);
		
		// Hearts
		
		// Ace of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.ACE);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[A\u2665]\u001B[0m");
		deck.add(card);
		
		// Two of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.TWO);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[2\u2665]\u001B[0m");
		deck.add(card);
		
		// Three of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.THREE);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[3\u2665]\u001B[0m");
		deck.add(card);
		
		// Four of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.FOUR);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[4\u2665]\u001B[0m");
		deck.add(card);
		
		// Five of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.FIVE);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[5\u2665]\u001B[0m");
		deck.add(card);
		
		// Six of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.SIX);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[6\u2665]\u001B[0m");
		deck.add(card);
		
		// Seven of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.SEVEN);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[7\u2665]\u001B[0m");
		deck.add(card);
		
		// Eight of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.EIGHT);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[8\u2665]\u001B[0m");
		deck.add(card);
		
		// Nine of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.NINE);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[9\u2665]\u001B[0m");
		deck.add(card);
		
		// Ten of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.TEN);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[10\u2665]\u001B[0m");
		deck.add(card);
		
		// Jack of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.JACK);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[J\u2665]\u001B[0m");
		deck.add(card);
		
		// Queen of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.QUEEN);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[Q\u2665]\u001B[0m");
		deck.add(card);
		
		// King of Hearts
		card = new PlayingCard();
		card.setRank(PlayingCard.KING);
		card.setSuit(PlayingCard.HEARTS);
		card.setDisplay("\u001B[31m[K\u2665]\u001B[0m");
		deck.add(card);
	}
	
	private static ArrayList<PlayingCard> shuffleDeck(ArrayList<PlayingCard> deck) // Shuffle the deck.
	{
		Random randomGenerator = new Random();
		int randomNumber = -1;
		
		ArrayList<PlayingCard> shufflerDeck1 = new ArrayList<PlayingCard>();
		ArrayList<PlayingCard> shufflerDeck2 = new ArrayList<PlayingCard>();
		
		for (int i = 51; i >= 0; --i) // Shuffle 1
		{
			randomNumber = randomGenerator.nextInt(i + 1);
			
			shufflerDeck1.add(deck.get(randomNumber));
			deck.remove(randomNumber);
		}
		
		for (int i = 51; i >= 0; --i) // Shuffle 2
		{
			randomNumber = randomGenerator.nextInt(i + 1);
			
			shufflerDeck2.add(shufflerDeck1.get(randomNumber));
			shufflerDeck1.remove(randomNumber);
		}
		
		for (int i = 51; i >= 0; --i) // Shuffle 3
		{
			randomNumber = randomGenerator.nextInt(i + 1);
			
			shufflerDeck1.add(shufflerDeck2.get(randomNumber));
			shufflerDeck2.remove(randomNumber);
		}
		
		for (int i = 51; i >= 0; --i) // Shuffle 4
		{
			randomNumber = randomGenerator.nextInt(i + 1);
			
			shufflerDeck2.add(shufflerDeck1.get(randomNumber));
			shufflerDeck1.remove(randomNumber);
		}
		
		for (int i = 51; i >= 0; --i) // Shuffle 5
		{
			randomNumber = randomGenerator.nextInt(i + 1);
			
			shufflerDeck1.add(shufflerDeck2.get(randomNumber));
			shufflerDeck2.remove(randomNumber);
		}
		
		for (int i = 51; i >= 0; --i) // Shuffle 6
		{
			randomNumber = randomGenerator.nextInt(i + 1);
			
			shufflerDeck2.add(shufflerDeck1.get(randomNumber));
			shufflerDeck1.remove(randomNumber);
		}
		
		for (int i = 51; i >= 0; --i) // Shuffle 7
		{
			randomNumber = randomGenerator.nextInt(i + 1);
			
			shufflerDeck1.add(shufflerDeck2.get(randomNumber));
			shufflerDeck2.remove(randomNumber);
		}
		
		return shufflerDeck1;
	}
	
	private static void restackDeck(ArrayList<PlayingCard> deck, ArrayList<PlayingCard> hand, ArrayList<PlayingCard> pile) // Reconsolidate the deck.
	{
		int midDeck = deck.size() / 2; // Appriximate the middle of the deck.
		
		while (pile.size() > 0) // Reinsert the discard pile.
		{
			deck.add(midDeck, pile.get(pile.size() - 1));
			pile.remove(pile.size() - 1);
		}
		
		while (hand.size() > 0) // Reinsert the player's hand.
		{
			deck.add(midDeck, hand.get(hand.size() - 1));
			hand.remove(hand.size() - 1);
		}
	}
	
	private static int scoreHand(ArrayList<PlayingCard> hand) // Rank the hand and award tokens.
	{
		int tokens = 0;
		
		PlayingCard card = null;
		
		int kind1 = 0;
		int kind2 = 0;
		
		// First sort the hand in ascending order.
		
		hand.sort(Comparator.comparingInt(PlayingCard::getRank));
		
		for (int i = 0; i < 4; ++i) // Order duplicate rank information.
		{
			if (i <= 1 && hand.get(i).getRank() == hand.get(i + 3).getRank()) // Four adjacent.
			{
				if (kind1 > 0)
				{
					kind2 = 4;
				}
				else
				{
					kind1 = 4;
				}
				
				i += 3; // Skip over duplicates.
			}
			else if (i <= 2 && hand.get(i).getRank() == hand.get(i + 2).getRank()) // Three adjacent.
			{
				if (kind1 > 0)
				{
					kind2 = 3;
				}
				else
				{
					kind1 = 3;
				}
				
				i += 2; // Skip over duplicates.
			}
			else if (i <= 3 && hand.get(i).getRank() == hand.get(i + 1).getRank()) // Two adjacent.
			{
				if (kind1 > 0)
				{
					kind2 = 2;
				}
				else
				{
					kind1 = 2;
				}
				
				i += 1; // Skip over duplicates.
			}
		}
		
		// Main scoring logic.
		
		if (hand.get(0).getRank() == PlayingCard.ACE && hand.get(1).getRank() == PlayingCard.TEN && hand.get(2).getRank() == PlayingCard.JACK && hand.get(3).getRank() == PlayingCard.QUEEN && hand.get(4).getRank() == PlayingCard.KING)
		{
			card = hand.get(0);
			hand.remove(0);
			hand.add(card);
			
			if (hand.get(0).getSuit() == hand.get(1).getSuit() && hand.get(0).getSuit() == hand.get(2).getSuit() && hand.get(0).getSuit() == hand.get(3).getSuit() && hand.get(0).getSuit() == hand.get(4).getSuit())
			{
				System.out.println("ROYAL FLUSH! 250 token(s) awarded.\n");
				tokens = 250;
			}
			else
			{
				System.out.println("STRAIGHT! 4 token(s) awarded.\n");
				tokens = 4;
			}
		}
		else if (hand.get(1).getRank() - hand.get(0).getRank() == 1 && hand.get(2).getRank() - hand.get(1).getRank() == 1 && hand.get(3).getRank() - hand.get(2).getRank() == 1 && hand.get(4).getRank() - hand.get(3).getRank() == 1)
		{
			if (hand.get(0).getSuit() == hand.get(1).getSuit() && hand.get(0).getSuit() == hand.get(2).getSuit() && hand.get(0).getSuit() == hand.get(3).getSuit() && hand.get(0).getSuit() == hand.get(4).getSuit())
			{
				System.out.println("STRAIGHT FLUSH! 50 token(s) awarded.\n");
				tokens = 50;
			}
			else
			{
				System.out.println("STRAIGHT! 4 token(s) awarded.\n");
				tokens = 4;
			}
		}
		else if (kind1 == 4)
		{
			System.out.println("4 OF A KIND! 25 token(s) awarded.\n");
			tokens = 25;
		}
		else if ((kind1 == 3 && kind2 == 2) || (kind1 == 2 && kind2 == 3))
		{
			System.out.println("FULL HOUSE! 6 token(s) awarded.\n");
			tokens = 6;
		}
		else if (hand.get(0).getSuit() == hand.get(1).getSuit() && hand.get(0).getSuit() == hand.get(2).getSuit() && hand.get(0).getSuit() == hand.get(3).getSuit() && hand.get(0).getSuit() == hand.get(4).getSuit())
		{
			System.out.println("FLUSH! 5 token(s) awarded.\n");
			tokens = 5;
		}
		else if (kind1 == 3 && kind2 == 0)
		{
			System.out.println("3 OF A KIND! 3 token(s) awarded.\n");
			tokens = 3;
		}
		else if (kind1 == 2 && kind2 == 2)
		{
			System.out.println("2 PAIR! 2 token(s) awarded.\n");
			tokens = 2;
		}
		else if (kind1 == 2)
		{
			System.out.println("1 PAIR! 1 token(s) awarded.\n");
			tokens = 1;
		}
		else
		{
			System.out.println("LOW! 0 token(s) awarded.\n");
		}
		
		return tokens;
	}
	
	private static void showBanner(int tokens) // Print title and tokens.
	{
		System.out.println("============================================");
		System.out.print("          ");
		System.out.print("\u001B[30m\u2660\u001B[0m\u001B[31m\u2666\u001B[0m ");
		System.out.print("RC's UNICODE POKER ");
		System.out.print("\u001B[30m\u2663\u001B[0m\u001B[31m\u2665\u001B[0m");
		System.out.println("          ");
		System.out.println("============================================");
		System.out.printf("Tokens: %d%n", tokens);
		System.out.println("--------------------------------------------\n");
	}
	
	public static void main(String[] args) // Program main entry point.
	{
		Scanner input = new Scanner(System.in);
		
		ArrayList<PlayingCard> deck = new ArrayList<PlayingCard>();
		ArrayList<PlayingCard> hand = new ArrayList<PlayingCard>();
		ArrayList<PlayingCard> pile = new ArrayList<PlayingCard>();
		
		boolean play = true;
		int playerTokens = 11;
		
		// Create a new deck of cards.
		
		initDeck(deck);
		
		// Give myself credit. :)
		
		System.out.println("\n--------------------------------------------");
		System.out.println("                         Author: Ruben Cobos");
		
		do
		{
			// Show the token count.
			
			playerTokens -= 1;
			
			showBanner(playerTokens);
			
			// Shuffle the deck.
			
			System.out.print("Shuffling the deck...\n\n");
			
			deck = shuffleDeck(deck);
			
			// Draw 5 cards.
			
			for (int i = 0; i < 5; ++i)
			{
				hand.add(deck.get(deck.size() - 1));
				deck.remove(deck.size() - 1);
			}
			
			System.out.print("Drawing 5 cards...\n\n");
			
			for (PlayingCard card : hand)
			{
				System.out.print(card.getDisplay());
			}
			
			System.out.print("\n\n");
			
			// Let the user discard.
			
			boolean validated = true;
			
			String userInput = new String();
			
			int index = 0;
			
			while (index < hand.size())
			{
				do
				{
					System.out.print("Discard " + hand.get(index).getDisplay() + " (y/n)?: ");
					
					if (input.hasNextLine())
					{
						userInput = input.nextLine();
						userInput = userInput.trim();
						validated = true;
					}
					else
					{
						validated = false;
					}
					
					if (userInput.compareTo("y") != 0 && userInput.compareTo("Y") != 0 && userInput.compareTo("n") != 0 && userInput.compareTo("N") != 0)
					{
						validated = false;
					}
				}
				while (!validated);
				
				if (userInput.compareTo("y") == 0 || userInput.compareTo("Y") == 0)
				{
					pile.add(hand.get(index));
					hand.remove(index);
				}
				if (userInput.compareTo("n") == 0 || userInput.compareTo("N") == 0)
				{
					++index;
				}
			}
			
			System.out.print('\n');
			
			for (PlayingCard card : hand)
			{
				System.out.print(card.getDisplay());
			}
			
			// Draw more cards.
			
			int drawSize = 5 - hand.size();
			
			System.out.print("\n\nDrawing " + drawSize + " card(s)...\n\n");
			
			for (int i = 0; i < drawSize; ++i)
			{
				hand.add(deck.get(deck.size() - 1));
				deck.remove(deck.size() - 1);
			}
			
			for (PlayingCard card : hand)
			{
				System.out.print(card.getDisplay());
			}
			
			System.out.print("\n\n");
			
			// Score the hand.
			
			playerTokens += scoreHand(hand);
			
			for (PlayingCard card : hand)
			{
				System.out.print(card.getDisplay());
			}
			
			System.out.print("\n\n");
			
			// Insert the hand and the discard pile into the middle of the deck.
			
			restackDeck(deck, hand, pile);
			
			// The player is out of tokens.
			
			if (playerTokens == 0)
			{
				System.out.println("Game Over! You have no more tokens.");
				input.close();
				return;
			}
			
			// Simulate the machine being out of tokens.
			
			if (playerTokens > Integer.MAX_VALUE - 250)
			{
				System.out.println("Game Over. The machine is out of tokens!");
				input.close();
				return;
			}
			
			// Does the user want to play again?
			
			do
			{
				System.out.print("Play again for 1 token? (y/n): ");
				
				if (input.hasNextLine())
				{
					userInput = input.nextLine();
					userInput = userInput.trim();
					validated = true;
				}
				else
				{
					validated = false;
				}
				
				if (userInput.compareTo("y") != 0 && userInput.compareTo("Y") != 0 && userInput.compareTo("n") != 0 && userInput.compareTo("N") != 0)
				{
					validated = false;
				}
			}
			while (!validated);
			
			if (userInput.compareTo("y") == 0 || userInput.compareTo("Y") == 0)
			{
				play = true;
			}
			if (userInput.compareTo("n") == 0 || userInput.compareTo("N") == 0)
			{
				play = false;
			}
			
			System.out.print('\n');
		}
		while (play == true);
		
		input.close();
	}
}
