package hangmanex1;

import java.util.Random;
import javax.swing.*;
public class HangGameEx1 extends javax.swing.JFrame {
    static boolean terminate = false;
    static int w = 0, l = 0;
    String word = "", clue = "", guess = "";
    int option;
    public HangGameEx1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        display2 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("HANGMAN");

        display1.setColumns(20);
        display1.setRows(5);
        jScrollPane1.setViewportView(display1);

        display2.setColumns(20);
        display2.setRows(5);
        jScrollPane2.setViewportView(display2);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("SPORTS");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("MOVIES");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("COMPUTERS");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("ANDROID");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("CAPITALS");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("START");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("RULES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(266, 266, 266))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton5)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      JOptionPane.showMessageDialog(this,"Based on the clue given, choose letters to fill in the blanks.\n"
              + "Incorrect characters already entered must not be entered again .\n"
              +"Words are related to the topics given.\n\n1. Sports\n2. Movies\n3. Computer\n4. Android\n5. Capitals\n"
              + "If you successfully guess the word, CONGRATULATIONS, you have won the round.\n"
              ,"\tRULES",-1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //HangGameEx1 obj = new HangGameEx1();
 
        String B[] = {"",""};
        //select topic
        if(jRadioButton1.isSelected() == true){
            Sports();
             B = Sports();
             
        }
            
        else if(jRadioButton2.isSelected()){
                Movies();
                B = Movies();
                }
            
        else if(jRadioButton3.isSelected()){
                Computers();
                B = Computers();
                //input1.append("CLUE - "+ clue+"\nWORD - "+word);
                }
            
        else if(jRadioButton4.isSelected()){
               Android();
                B = Android();             
                //input1.append("CLUE - "+ clue+"\nWORD - "+word);
                }
            
        else if(jRadioButton5.isSelected()){
                Capitals();
                B = Capitals();
               // input1.append("CLUE - "+ clue+"\nWORD - "+word);
                }
            
        else
             JOptionPane.showMessageDialog(this,"Please SELECT a topic to proceed","  ERROR",0); 
        
        display1.append("-----------------------------------\n\n");
        clue = B[0];
        word = B[1];
        
            algorithm();
        

        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
         display1.setText("You have selected the topic  - Sports\n"
         +"Click on the RULES button to learn about the game\n"
         +"Click START to play the Game\n\n");
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
                 display1.setText("You have selected the topic  - Movies\n"
         +"Click on the RULES button to learn about the game\n"
         +"Click START to play the Game\n\n");
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
                 display1.setText("You have selected the topic  - Computers\n"
         +"Click on the RULES button to learn about the game\n"
         +"Click START to play the Game\n\n");
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
                 display1.setText("You have selected the topic  - Android\n"
         +"Click on the RULES button to learn about the game\n"
         +"Click START to play the Game\n\n");
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
                 display1.setText("You have selected the topic  - Capitals\n"
         +"Click on the RULES button to learn about the game\n"
         +"Click START to play the Game\n\n");
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HangGameEx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangGameEx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangGameEx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangGameEx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangGameEx1().setVisible(true);
            }
        });

    }
    public void algorithm(){
        
        boolean flag = false;
            int counter = 6;  
            String guessword = word;
            int len = (int)(Math.round(((double)guessword.length()/2)));
            int checkguess = 0;

            StringBuffer guessit = new StringBuffer(); // show me what is
            
            // Places a blank underscore to signify the presence of a letter
            for (int i = 0;i<len;i++)
                guessit = guessit.append("_ ");

            guessit.delete((2 * len)-1,(2 * len));
            int index = guessword.indexOf("|");

            while(index >= 0)
            {
                guessit.setCharAt(index, '|');
                // Start searching for next "|" after this index
                index = guessword.indexOf("|", index+1);
            }
            
            display1.append( "The correct letters you have entered so far \n"+guessit);

            //Print Image
            do
            {
                display1.append("\n");
                if(counter == 6)
                    Hang1();
                else if(counter == 5)
                    Hang2();
                else if(counter == 4)
                    Hang3();
                else if(counter == 3)
                    Hang4();
                else if(counter == 2)
                    Hang5();
                else if(counter == 1)
                    Hang6();
                display1.append(clue);
                display1.append("\nEnter your guess letter\n\n");
                guess = JOptionPane.showInputDialog("Enter a alphabet");
//                if(guess.length()>1)
//                {
//                    JOptionPane.showMessageDialog(this,"Please enter 1 letter","WARNING",1);
//                }
                do{
                    if(!(guess.equals("")||guess.length()>1))
                    {
                        flag = true;
                    }
                    else
                    {
                        
                        JOptionPane.showMessageDialog(this,"Please enter an Alphabet","WARNING",1);
                        guess = JOptionPane.showInputDialog("Enter a alphabet");
                        flag = false;
                    }
                }while(flag == false);
                guess = guess.toUpperCase();
//                guess = Character.toString(guess.charAt(0));
                

                for(int i = 0;i<len;i++)    
                {
                    try
                    {
                        if(guess.charAt(0) == guessword.charAt(2*i))    
                        {
                            guessit.setCharAt(2*i,guess.charAt(0));
                            checkguess=1;
                        }
                    }
                    catch(Exception e) 
                    {
                        continue;
                    }
                }
                if(checkguess == 1)
                {
                    display1.append("Correct Guess. You have " + counter + " guess(es) left\n");
                    display1.append("The correct letters you have entered so far \n"+guessit);
                }
                else
                {
                    counter--;
                    //Checks if User has Guesses left
                    if(counter == 0)
                    {
                        display1.append("Wrong guess. You hanged the man :(\n");
                        display1.append(""+guessit);
                        Hang7();
                    }
                    //Prints if Entered Letter is Wrong
                    else
                    {
                        display1.append("Wrong guess. You have " + counter + " guess(es) left\n");
                        display1.append("The letters you have entered so far \n"+guessit);
                    }
                }
                checkguess = 0;
                //Prints if the User lost the game
                if(counter == 0)
                {
                    
                    display1.append("\nSorry, you lost the game\n\nThe correct word is " + guessword);
                    display1.append("-----------------------------------");
                    l++;
                }

                String a =  guessit.toString();;
                //Prints if User won the game
                if(a.equals(guessword))
                {
                    display1.append("\nYou guessed the word!!!!!");
                    display1.append("-----------------------------------");
                    w++;
                    counter=0;
                }        
            }while(counter>0);
            //terminate program
        
        }
        
            
            


        //Function to call Sports Questions
    public String[] Sports()
    {
        // Randomly generates a number which is then used to select one of the different cases.
        Random rand = new Random();
        int i = rand.nextInt(10);
        
        //{"EEE", "eee"},
        
        String A[][] = {
            {"He is an Argentine footballer who plays for La Liga club FC Barcelona and is the captain of the Argentina national team.", "L I O N E L | M E S S I"},
            {"First person to score 200 in ODIs", "S A C H I N | T E N D U L K A R"},
            {"One of the most famous and successful english football teams in history.", "M A N C H E S T E R | U N I T E D"},
            {"It is a two-player board game", "C H E S S"},
            {"It is a team sport in which two teams of six players are separated by a net.", "V O L L E Y B A L L"},
            {"Known as 'The wall' in Cricket","R A H U L | D R A V I D"},
            {"A sport played by two teams of five players on a rectangular court. The objective is to shoot a ball through a hoop. ", "B A S K E T B A L L"},
            {"The 'Beautiful' game.", "F O O T B A L L"},
            {"Second fastest sport in the world.", "T A B L E | T E N N I S"},
            {"Indian Chess Grandmaster", "V I S H W A N A T A N | A N A N D"}
        };
       String B []= A[i];

        return B;
        //return clue;return word;
    }

    //Function to call Movie Questions
    public String[] Movies()
    {
        // Randomly generates a number which is then used to select one of the different cases.
        Random rand = new Random();
        int i = rand.nextInt(10);
       
        String A[][] = {
            {"A story of Lightning Mcqueen and his mistaken journey to Radiator Springs.", "C A R S"},
            {"A movie in which cars transform into fighting robots. ", "T R A N S F O R M E R S"},
            {"The highest grossing hollywood movie of all time.", "A V A T A R"},
            {"An American musical drama film,about a young Austrian woman studying to become a nun in Salzburg in 1938 who is sent to the villa of a retired naval officer and widower to be governess to his seven children", "S O U N D | O F | M U S I C "},
            {"This film stars Jason Statham as Frank Martin, a driver for hire – a mercenary transporter who will deliver anything, anywhere – no questions asked – for the right price", "T H E | T R A N S P O R T E R"},
            {"This film tells the story of Jamal Malik, a young man from the Juhu slums of Mumbai who appears on the Indian version of 'Who Wants to Be a Millionaire?'", "S L U M D O G | M I L L I O N A R E"},
            {"Set during the Sierra Leone Civil War in 1996–2001, the film shows a country torn apart by the struggle between government soldiers and rebel forces", "B L O O D | D I A M O N D"},
            {"This film stars Macaulay Culkin as Kevin McCallister, an eight-year-old boy, who is mistakenly left behind when his family flies to Paris for their Christmas vacation", "H O M E | A L O N E"},
            {"One of the most famous and highest grossing movie franchises of all time(HINT: Lots of cars in this franchisee", "T H E | F A S T | A N D | T H E | F U R I O U S"},
            {"This movie follows a group of animals that are stranded on an island.", "M A D A G A S C A R"}
        };
              
        String B []= A[i];

        return B;
        //return clue;return word;
    }

    //Function to call Computer Questions
    public String[] Computers()
    {
        // Randomly generates a number which is then used to select one of the different cases.
        Random rand = new Random();
        int i = rand.nextInt(10);
        
        
        String A[][] = {
            {"What is DNS in computer terminology ?", "D O M A I N | N A M E | S Y S T E M"},
            {"Stores a real world 2d object in the form of a digital image", "S C A N N E R"},
            {"A 3D simulation of a real or imagined environment using computers.", "V I R T U A L | R E A L I T Y"},
            {"It is a family of computer networking technologies for LANs", "E T H E R N E T"},
            {"It is a computer network that uses Internet Protocol technology to share information, operational systems, or computing services within an organization", "I N T R A N E T"},
            {"It is an IDE for Java", "B L U E J"},
            {"What is ASCII in computer Terminology ", "A M E R I C A N | S T A N D A R D | C O D E | F O R | I N F O R M A T I O N | I N T E R C H A N G E"},
            {"It is a software application that provides comprehensive facilities to computer programmers for software development", "I N T E G R A T E D | D E V E L O P M E N T | E N V I R O N M E N T"},
            {"It is a temporary form of computer data storage", "R A N D O M | A C C E S S | M E M O R Y"},
            {"A battery-powered memory chip in your computer that stores startup information.", "C O M P L E M E N T A R Y | M E T A L | O X I D E | S E M I C O N D U C T O R"}
        };

      
        String B []= A[i];

        return B;
        //return clue;return word;
        
    }

    //Function to call Android Questions
    public String[] Android()
    {
        // Randomly generates a number which is then used to select one of the different cases.
        Random rand = new Random();
        int i = rand.nextInt(10); 
        
        String A[][] = {
            {"The 'Father' of Android", "A N D Y | R U B I N"},
            {"The First Android powered Smartphone ", "H T C | D R E A M"},
            {"The Company that produces the Exynos SOC's", "S A M S U N G"},
            {"The first Android powered Blackberry phone", "B L A C K B E R R Y | P R I V"},
            {"An open-source operating system for smartphones and tablet computers, based on the Android mobile platform created by Steve Kondik", "C Y A N O G E N M O D"},
            {"What is ADB in Android Terminoloy?", "A N D R O I D | D E B U G | B R I D G E"},
            {"The current largest maker of mobile phones", "S A M S U N G"},
            {"The company that makes the Snapdragon SOC's", "Q U A L C O M M"},
            {"What is OHA in Android terminology?", "O P E N | H A N D S E T | A L L I A N C E"},
            {"Sofware skin used in Huawei phones.", "E M O T I O N | U I"}
        };

        String B []= A[i];
        

        return B;

    }

    //Function to call Capital-related Questions
    public String[] Capitals()
    {
        // Randomly generates a number which is then used to select one of the different cases.
        Random rand = new Random();
        int i = rand.nextInt(10);
        
        
            String A[][] = {
            {"Capital of Austalia", "C A N B E R R A"},
            {"Capital of Ethiopia", "A D D I S | A B A B A"},
            {"Capital of Uzbekistan", "T A S H K E N T"},
            {"Capital of Peru", "L I M A"},
            {"Capital of Saudi Arabia", "R I Y A D H"},
            {"Capital of The Philippines", "M A N I L A"},
            {"Capital of Poland", "W A R S A W"},
            {"Capital of Iceland", "R E Y K J A V I K"},
            {"Capital of Malta", "V A L L E T T A"},
            {"Capital of Cambodia", "P H N O M | P E N H"}
        };
      
         String B []= A[i];

        return B;

    }
    
    public void Hang1() 
    {
        display2.setText("      _______   \n");
        display2.append("     |       |\n");
        display2.append("     |\n");
        display2.append("     |\n");
        display2.append("     |\n");
        display2.append("     |\n");
        display2.append("     |\n");
        display2.append("__|_____ \n");
    }

    //Image02
    public void Hang2()
    {
        display2.setText("      _______ \n");
        display2.append("     |       |\n");
        display2.append("     |      ( )\n");
        display2.append("     |       \n");
        display2.append("     |\n");
        display2.append("     |\n");
        display2.append("     |\n");
        display2.append("__|_____ \n");
    }

    //Image03
    public void Hang3()
    {
        display2.setText("      _______ \n");
        display2.append("     |       |\n");
        display2.append("     |      ( )\n");
        display2.append("     |       |\n");
        display2.append("     |       |\n");
        display2.append("     |       |\n");
        display2.append("     |\n");
        display2.append("__|_____ \n");
    }

    //Image04
    public void Hang4()
    {
        display2.setText("      _______ \n");
        display2.append("     |       |\n");
        display2.append("     |      ( )\n");
        display2.append("     |       |\n");
        display2.append("     |       |\n");
        display2.append("     |       |\n");
        display2.append("     |      /\n");
        display2.append("__|_____ \n");
    }

    //Image05
    public void Hang5()
    {
        display2.setText("      _______ \n");
        display2.append("     |       |\n");
        display2.append("     |      ( )\n");
        display2.append("     |       |\n");
        display2.append("     |       |\n");
        display2.append("     |       |\n");
        display2.append("     |      / \\\n");
        display2.append("__|_____ \n");
    }

    //Image06
    public void Hang6()
    {
        display2.setText("      _______ \n");
        display2.append("     |       |\n");
        display2.append("     |      ( )\n");
        display2.append("     |       |\n");
        display2.append("     |      /|\n");
        display2.append("     |       |\n");
        display2.append("     |      / \\\n");
        display2.append("__|_____ \n");
    }  

    //Image07
    public void Hang7()
    {
        display2.setText("      _______ \n");
        display2.append("     |       |\n");
        display2.append("     |      ( )\n");
        display2.append("     |       |\n");
        display2.append("     |      /|\\\n");
        display2.append("     |       |\n");
        display2.append("     |      / \\\n");
        display2.append("__|_____ ");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea display1;
    private javax.swing.JTextArea display2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
