
public class TestDocument {

	public static void main(String[] args) {
		// .1
		Document d1 = new Document();
		// .2
		d1.addSentence("That was how he came to win $1 million.");
		d1.addSentence("The door swung open to reveal pink giraffes and red elephants.");
		d1.addSentence("I’m working on a sweet potato farm.");
		// .3
		System.out.println(d1);
		// .4
		d1.undo();
		// .5
		System.out.println(d1);
		// .6
		d1.addSentenceInPlace("THE END", 8);
		// .7
		System.out.println(d1);
		// .8
		d1.undo();
		// .9
		System.out.println(d1);
	}

}
