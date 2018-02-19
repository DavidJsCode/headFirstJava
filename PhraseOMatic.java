public class PhraseOMatic {
	public static void main (String[] args) {


	String[] wordListOne = {"complex", "Agile", "speed to market", "contingencies", "SaaS-based", "big data", "risk based analysis", "domain level"};

	String[] wordListTwo = {"robust", "on-time", "interpreted", "business value", "secure", "platform independent", "work smart" };


	String[] wordListThree = {"delineated", "concise", "auspiciousness", "top 3", "figuratively", "perspective", "dumb mutha fuckers" };

	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;

	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);

	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

	System.out.println("What we need is a " + phrase);


		}

	}

	