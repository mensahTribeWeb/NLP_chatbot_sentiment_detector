# ChatBot

This code is a simple Java program that demonstrates how to use the Stanford CoreNLP library to perform sentiment analysis on a user's input. 
The program sets up a pipeline with various annotators including tokenization, sentence splitting, part-of-speech tagging, named entity recognition, parsing, and sentiment analysis. 
It takes a user's input, annotates it, and extracts the sentences from the annotated document. 
It then loops over the sentences and prints the sentiment value using the SentimentCoreAnnotations class provided by the Stanford CoreNLP library.

Installation
Prerequisites
Java 11 or later
Apache Maven 3.6.3 or later
Building from source
Clone the repository to your local machine using Git:


git clone https://github.com/mensahTribeWeb/NLP_chatbot_sentiment_detector.git
Navigate to the project directory:


cd ChatBot
Build the project using Maven:


mvn clean package
Running the ChatBot
After building the project, navigate to the target directory:


cd target
Run the ChatBot using the following command:


java -jar ChatBot-1.0-SNAPSHOT.jar
Enter a message when prompted and the ChatBot will analyze the sentiment of the input.

Usage
The ChatBot will prompt the user to enter a message. After entering a message, the ChatBot will analyze the sentiment of the input and display the sentiment value.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Acknowledgments
Stanford CoreNLP library (https://stanfordnlp.github.io/CoreNLP/)
