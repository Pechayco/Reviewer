
import javax.swing.*;




public class LoginProgramWithGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Program");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel headingLabel = new JLabel("Welcome to Login Program");
        headingLabel.setBounds(100, 20, 200, 25);
        panel.add(headingLabel);

        JLabel subHeadingLabel = new JLabel("Please enter your credentials:");
        subHeadingLabel.setBounds(100, 50, 200, 25);
        panel.add(subHeadingLabel);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 80, 80, 25);
        panel.add(usernameLabel);

        JTextField usernameText = new JTextField(20);
        usernameText.setBounds(150, 80, 165, 25);
        panel.add(usernameText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 110, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(150, 110, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 160, 80, 25);
        panel.add(loginButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(200, 160, 80, 25);
        panel.add(clearButton);

        clearButton.addActionListener(e -> {
            usernameText.setText("");
            passwordText.setText("");
        });
    }
}