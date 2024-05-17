import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class LoginPage extends JFrame {
    public LoginPage() {
        super("Welcome Back!");
        setSize(800, 600); // Set frame size based on the description 
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Create top panel with welcome message
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(102, 51, 153)); // Set background color to a shade of purple 
        topPanel.setBorder(new TitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Arial", Font.BOLD, 16), Color.WHITE));
        JLabel welcomeLabel = new JLabel("Welcome Back!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setForeground(Color.WHITE);
        topPanel.add(welcomeLabel);

        // Create center panel with instructions and email text field
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(4, 1));  // Use grid layout for 4 rows and 1 column
        JLabel instructionLabel1 = new JLabel("To keep connected with us please", SwingConstants.LEFT);
        instructionLabel1.setFont(new Font("Arial", Font.PLAIN, 14));
        JLabel instructionLabel2 = new JLabel("login with your personal info", SwingConstants.LEFT);
        instructionLabel2.setFont(new Font("Arial", Font.PLAIN, 14));
        JTextField emailField = new JTextField(20);  // Create a text field for email
        centerPanel.add(instructionLabel1);
        centerPanel.add(instructionLabel2);
        centerPanel.add(emailField);

        // Create bottom button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // Align buttons to the right
        JButton signInButton = new JButton("SIGN IN");
        JButton signUpButton = new JButton("SIGN UP");  // Create a sign up button based on the image description
        buttonPanel.add(signInButton);
        buttonPanel.add(signUpButton);

        // Add panels to the frame
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
