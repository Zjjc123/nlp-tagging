import java.io.IOException;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class TagText {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Initialize the tagger
		MaxentTagger tagger = new MaxentTagger("taggers/english-caseless-left3words-distsim.tagger");

		// The sample string
		String sample = "Jason is very cool!";

		// The tagged string
		String tagged = tagger.tagString(sample);

		// Output the result
		System.out.println(tagged);
	}
}