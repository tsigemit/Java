package com.bankAcoountParse;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.util.*;
import java.util.List;

public class App extends JFrame implements ActionListener{
    private JPanel accountPanel;
    private JButton submitButton;
    private JTextArea textArea;
    static int count=0;
    //containers that are used to th string to be parsed
    ArrayList<String> arrayList1=new ArrayList<>();
    ArrayList<String> arrayList2=new ArrayList<>();
    ArrayList<String> temp= new ArrayList<>();
    ParsingHelper pHelper= new ParsingHelper();

    /**
     *  Constructor used to intialize the listners
     */
    public App() {
        //Submit button listner that is activated when the submit button is clicked
        submitButton.addActionListener(actionEvent -> {
            try {
                FileWriter myWriter = new FileWriter("filename.txt");
                ArrayList<String> finalResult = pHelper.finalListArray(arrayList1);
              for(String output : finalResult) {
//                   String splited[] = output.split(" ");
//                   for(String str : splited)
//                       myWriter.write(str+"        ");
                  myWriter.write(output);
                  myWriter.write("\n");
                  System.out.println(output);
              }
              myWriter.close();
            }
            catch( Exception e ) {
            }
        });
        accountPanel.setPreferredSize(new Dimension(800,1000)); // used to control the diamention of the JPanel
        textArea.getDocument().addDocumentListener(new MyDocumentListener());
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private class MyDocumentListener implements DocumentListener {
    public void changedUpdate(DocumentEvent e) {

    }
    @Override
    public void insertUpdate(DocumentEvent e) {
        Document document = e.getDocument();
        try{
             String str = document.getText(0, document.getLength());
            int diff=0;
            if(e.getLength()<4) {
                return;
            }
            else
                str = document.getText(0, document.getLength());
            ArrayList<String> splited=new ArrayList<String>();
            for(String sp : str.trim().split("\n+"))
                splited.add(sp);
            List<String> subArray = splited.subList(arrayList1.size(), splited.size());
            for(String row1 : subArray){
                if(count==0) {
                    arrayList1.add(row1);
                    continue;
                }
                else
                    arrayList2.add(row1);
            }
            count++;
            for(String row2: arrayList2){
                if(!arrayList1.contains(row2))
                    arrayList1.add(row2);
                else if(pHelper.countRow(row2, arrayList2) > pHelper.countRow(row2, arrayList1)) {
                    if (!temp.contains(row2)) {
                        diff = pHelper.countRow(row2, arrayList2) - pHelper.countRow(row2, arrayList1);
                        while (diff > 0) {
                            arrayList1.add(row2);
                            diff--;
                        }
                        temp.add(row2);
                    }
                }
            }

        }
        catch (Exception e1) {
            e1.printStackTrace();
            return;
        }

    }
@Override
    public void removeUpdate(DocumentEvent e) {
        System.out.println("Remove update");
    }
}
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
        public static void main(String[] args) {
            JFrame frame = new JFrame("App");
            App app = new App();
            frame.setContentPane(app.accountPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
}
/*
2016-10-01 TextA 1000 kr
2016-10-02 TextB 1000 kr
2016-10-02 TextB 1000 kr
2016-10-02 TextB 1000 kr
2016-10-02 TextC 1500 kr
 */
