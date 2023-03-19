package dev.nokore;

import java.util.List;
import java.util.Properties;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.ling.CoreAnnotations.*;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;

public class ChatBot {
    public static void main(String[] args) {
        // set up the pipeline properties
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, sentiment");
        // set up StanfordCoreNLP with the pipeline properties
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        // read in the user's input
        String userInput = "how is your day?";
        // create an Annotation object with the user's input
        Annotation document = new Annotation(userInput);
        // annotate the user's input
        pipeline.annotate(document);
        // extract the sentences from the annotated document
        List<CoreMap> sentences = document.get(SentencesAnnotation.class);
        // loop over the sentences and print the sentiment value
        for (CoreMap sentence : sentences) {
            String sentiment = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
            System.out.println("Sentiment: " + sentiment);
        }
    }
}