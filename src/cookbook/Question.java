package cookbook;

/*
 * @author Anna Phillips
 */

public class Question {
    // The question class, used to store the questions and answers from help.txt
    private String question;
    private String answer;
    
    /**
     * Default constructor for the Question class
     * @param q question
     * @param a answer
     */
    public Question(String q, String a){
        question = q;
        answer = a;
    }
    
    /**
     * Accessor method for the question
     * @return question
     */
    public String getQuestion(){
        return question;
    }
    
    /**
     * Accessor method for the answer
     * @return answer
     */
    public String getAnswer(){
        return answer;
    }
    
    /**
     * Combines question and answer into a single String
     * @return 
     */
    @Override
    public String toString(){
        return question + " : " + answer;
    }
}
