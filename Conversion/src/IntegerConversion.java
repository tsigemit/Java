import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.*;
public class IntegerConversion extends JFrame implements ActionListener {
	Container container = getContentPane();
	JLabel conversionLabel = new JLabel("ENTER NUMBER:");
	JLabel conversionOptions= new JLabel("CONVERSION:");
	String[] lists = {"BINARY", "DECIMAL", "HEXADECIMAL"};
	JComboBox conversionCombo = new JComboBox(lists);
	JLabel resultLabel = new JLabel("RESULT:");
	JTextField conversionTextField = new JTextField();
	JTextField resultTextField = new JTextField();
	JButton convertButton = new JButton("CONVERT");
	JButton clearButton = new JButton("CLEAR");
    JButton exitButton = new JButton("EXIT");

	IntegerConversion() {
     setLayoutManager();
     setLocationAndSize();
     addComponentsToContainer();
     addActionEvent();
	}
   public void setLayoutManager(){
   	container.setLayout(null);
   }
   public void setLocationAndSize(){
       conversionLabel.setBounds(50,150,120,30);
       conversionTextField.setBounds(180,150,110,30);
       conversionOptions.setBounds(50,190,100,30);
       conversionCombo.setBounds(180,190,110,30);
       resultLabel.setBounds(50,230,100,30);
;      resultTextField.setBounds(180,230,110,30);
       convertButton.setBounds(50,270,100,30);
       clearButton.setBounds(160,270,100,30);
       exitButton.setBounds(270,270,100,30);
   }

    public void addComponentsToContainer()
   {
      //Adding each components to the Container
       container.add(conversionLabel);
       container.add(conversionTextField);
       container.add(resultLabel);
       container.add(resultTextField);
       container.add(conversionOptions);
       container.add(conversionCombo);
       container.add(convertButton);
       container.add(clearButton);
       container.add(exitButton);
   }
   public void addActionEvent(){
   	convertButton.addActionListener(this);
   	clearButton.addActionListener(this);
   	exitButton.addActionListener(this);
   }
    @Override
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() ==convertButton) {
    	    try {
    	        Object selectedItem = conversionCombo.getSelectedItem();
                String str = conversionTextField.getText();
                if (selectedItem.equals("BINARY")) {
                    int input = Integer.parseInt(str);
                    String bin = Integer.toBinaryString(input);
                    resultTextField.setText(bin);
                } else if (selectedItem.equals("HEXADECIMAL")) {
                    int input = Integer.parseInt(str);
                    String hex = Integer.toHexString(input);
                    resultTextField.setText(hex);
                } else if (selectedItem.equals("DECIMAL")) {
                    Integer changeFromBinary = Integer.valueOf(str, 2);
                    resultTextField.setText(Integer.toString(changeFromBinary));
                } else
                    resultTextField.setText(str);
            }
    	    catch(Exception e1){
    	        JOptionPane.showMessageDialog(this, "Please Enter Valid Value");
            }
        }
    	else if(e.getSource()==clearButton){
    	    conversionTextField.setText("");
    	    resultTextField.setText("");
        }
       else if(e.getSource()==exitButton)
           System.exit(0);
    }

  public static void main(String[] args) {
    IntegerConversion conForm = new IntegerConversion();
    conForm.setTitle("Number System");
    conForm.setVisible(true);
    conForm.setBounds(10, 10, 600 ,500);
    conForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}