import javax.swing.*;  
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  

public class WordCounter extends JFrame implements ActionListener {

    // GUI Components
    private JTextArea textArea;
    private JButton countButton;
    private JLabel resultLabel;

    // Constructor to set up the GUI
    public WordCounter() {
        // Frame settings
        setTitle("Word Counter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window

        // Creating components
        textArea = new JTextArea(8, 30);
        countButton = new JButton("Count Words");
        resultLabel = new JLabel("Word Count: 0");

        // Add action listener to the button
        countButton.addActionListener(this);

        // Organize components in the frame using a panel
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(textArea));  // Add text area with scroll support
        panel.add(countButton);
        panel.add(resultLabel);

        // Add panel to frame
        add(panel);

        // Make the frame visible
        setVisible(true);
    }

    // Method to handle button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText().trim();  // Get text from the text area
        if (text.isEmpty()) {
            resultLabel.setText("Word Count: 0");
        } else {
            String[] words = text.split("\\s+");  // Split text by spaces
            resultLabel.setText("Word Count: " + words.length);
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new WordCounter();  // Create and display the GUI
    }
}
