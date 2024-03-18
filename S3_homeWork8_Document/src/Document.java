
public class Document implements CanUndu {
	private final int MAX = 10; 
	private String[] text;
	private int textCount;
	private String lastText; // save the last deleted text.
	private int lastIndex; // save the line that the last action took place in.
	private int lastAction; // save what the last action was.
	
	//constructor
	public Document() {
		this.text = new String[MAX];
		for (int i = 0; i < text.length; i++) {
			text[i] = "";
		}
		this.lastAction = 0;
		this.textCount = 0;
	}
	
	// Add sentences to the next line in the document 
	public boolean addSentence(String s) {
		if(this.textCount >= MAX) {
			return false;
		}
		
		// look for the next empty line.
		while(this.textCount < MAX) {
			if(!this.text[textCount].equals("")) {
				textCount++;
			}
			else {
				break;
			}			
		}
		if(this.textCount >= MAX) {
			return false;
		}
		
		this.text[this.textCount++] = s;
		lastText = "";
		lastAction = 1;
		lastIndex = textCount - 1;
		return true;
	}
	
	// Add sentences to a specific line and if line is already has a sentence it replace
	public boolean addSentenceInPlace(String s, int i){
		if(i < 0 || i >= MAX) {
			return false;
		}
		lastText = new String(text[i]);
		lastIndex = i;
		lastAction = 2;
		text[i] = s;
		return true;
	}

	// Cancel the last action.
	@Override
	public void undo() {
		if(lastAction == 1) {
			text[--textCount] = "";
			lastAction = 0;
		}
		
		if(lastAction == 2) {
			text[lastIndex] = lastText;
			lastAction = 0;
		}				
	}
	
	// toString
	public String toString() {
		String str = "--------------------Document--------------------\n";
		for (int i = 0; i < text.length; i++) {
			str += "|" + text[i] + "\n";
		}
		str += "------------------------------------------------";
		return str;
	}
}
