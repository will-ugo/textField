import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class textField extends JFrame {
	private JLabel text;
	private JTextField field;
	private JPasswordField password;
	
	public textField() {
		super("JTextField Demo");
		setLayout(new FlowLayout());
		
		text = new JLabel("Enter Username and Password");
		text.setToolTipText("Login Details");
		add(text);
		
		field = new JTextField("Username", 15 );
		add(field);
		
		password = new JPasswordField("Password", 15);
		add(password);
	}

}
