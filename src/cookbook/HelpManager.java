package cookbook;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * @author Anna Phillips
 */

public class HelpManager {
    private List<Question> questions = new ArrayList<>();
    
    /**
     * Default Constructor for the HelpManager
     * Fetches the questions and answers are fetched from the text file and creates Question objects
     * @param file
     * @param pnlButtons
     * @param lblAnswer 
     */
    public HelpManager(String file, JPanel pnlButtons, JLabel lblAnswer){
        try{
            Scanner scFile = new Scanner(new File(file));
            String line, question, answer;
            
            while(scFile.hasNext()){
                line = scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("##");
                
                question = scLine.next();
                answer = scLine.next();
                
                questions.add(new Question(question, answer));
                
                scLine.close();
            }
            scFile.close();
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "The help.txt file could not be found.");
        }
        // The questions are displayed as the text on buttons
        displayButtons(pnlButtons, lblAnswer);
    }
    
    /**
     * Displays the buttons with the help text on them
     * @param pnlButtons
     * @param lblAnswer 
     */
    private void displayButtons(JPanel pnlButtons, JLabel lblAnswer){
        // The layout of the buttons are defined
        pnlButtons.setLayout(new BoxLayout(pnlButtons, BoxLayout.Y_AXIS));
        pnlButtons.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        pnlButtons.setBorder(new EmptyBorder(15, 15, 15, 15));

        for(int i = 0; i < questions.size(); i++){
            JButton btn = new JButton(questions.get(i).getQuestion());
            btn.setFont(new Font("Tahoma", Font.PLAIN, 15));
            btn.setSize(questions.get(i).getQuestion().length()*10, 100);
            pnlButtons.add(btn);

            btn.addActionListener(evt->{
                // The answer to the question is displayed when the button is clicked
                lblAnswer.setText("<html>"+find(btn.getText()).getAnswer()+"</html>");
                lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 14));
            });
            // Spacing between the buttons is added
            pnlButtons.add(Box.createVerticalStrut(15));
        }
    }
    
    /**
     * Returns the corresponding Question of the question String
     * @param q
     * @return 
     */
    private Question find(String q){
        Question output = null;
        for(int i = 0; i < questions.size(); i++){
            if(questions.get(i).getQuestion().equals(q))
                output = questions.get(i);
        }
        return output;
    }
}
