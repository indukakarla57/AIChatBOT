import java.util.Scanner;

public class AIChatbot {

    static String getResponse(String input) {

        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you?";
        }

        else if (input.contains("how are you")) {
            return "I am fine! Thank you for asking.";
        }

        else if (input.contains("your name")) {
            return "My name is JavaBot.";
        }

        else if (input.contains("java")) {
            return "Java is a popular object-oriented programming language.";
        }

        else if (input.contains("what can you do")) {
            return "I can answer simple questions and have a basic conversation.";
        }

        else if (input.contains("thank")) {
            return "You're welcome!";
        }

        else if (input.contains("bye")) {
            return "Goodbye! Have a nice day.";
        }

        else {
            return "Sorry, I don't understand that question.";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI CHATBOT =====");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine();

            String response = getResponse(input);

            System.out.println("Bot: " + response);

            if (input.toLowerCase().contains("bye")) {
                break;
            }
        }

        sc.close();
    }
}