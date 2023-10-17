import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class mainclass {
    public static void main(String[] args) {
        new Calculator();
    }
}

class Calculator {
    JFrame calculator;
    JPanel panel,display,buttonpanel;
    JLabel x=new JLabel("x");
    JLabel toptext=new JLabel("Calculator");
    JLabel result,topresult;
    JButton b[]=new JButton[20];
    double num1,num2;
    char operator;
    Calculator(){
        calculator=new JFrame();
        calculator.setSize(370, 450);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setLocationRelativeTo(null);
        calculator.setUndecorated(true);
        calculator.setOpacity(0.97f);
        calculator.setShape(new RoundRectangle2D.Double(0,0,370,450,30,30));
        calculator.setLayout(null);

        x.setForeground(Color.white);
        x.setBounds(350, 3, 20, 20);
        x.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                System.exit(0);
            }
        });

        toptext.setForeground(Color.white);
        toptext.setBounds(160, 3, 60, 20);

        topresult=new JLabel("V1.01");
        topresult.setBounds(0, 0, 80, 20);
        topresult.setHorizontalAlignment(JLabel.LEFT);
        topresult.setFont(new Font("courier",Font.PLAIN,10));
        
        result=new JLabel("0");
        result.setBounds(0, 0, 320, 50);
        result.setHorizontalAlignment(JLabel.RIGHT);
        result.setFont(new Font("courier",Font.BOLD,45));
        
        display=new JPanel();
        display.setBounds(15, 50, 340,50);
        display.setLayout(null);
        display.setBackground(Color.WHITE);
        display.add(result);
        display.add(topresult);

        panel=new JPanel();
        panel.setBounds(0, 0, 370, 25);
        panel.setBackground(new Color(71, 71, 71));
        panel.add(x);
        panel.add(toptext);
        panel.setLayout(null);

        buttons();
        calculator.add(buttonpanel);
        calculator.add(panel);
        calculator.add(display);
        calculator.setVisible(true);
    } 
    
    void buttons(){
        String op[]={"cls","( / )","( * )","( - )","<--","( % )","7","8","9","( + )","pow","4","5","6","( = )","( rt )","1","2","3","0"};
        buttonpanel=new JPanel();
        buttonpanel.setBounds(20, 120, 330, 310);
        buttonpanel.setBackground(Color.WHITE);
        buttonpanel.setLayout(new GridLayout(4, 5,4,8));
        

        for (int i=0;i<b.length;i++){
            b[i]=new JButton(op[i]);
            buttonpanel.add(b[i]);
            b[i].setFocusable(false);
            b[i].setBorderPainted(false);
            b[i].setBackground(new Color(230, 230, 230));
            if(i==1 || i==2 || i==3 ||i==5 ||i==9 ||i==10 ||i==14 ||i==15 ){
                b[i].setBackground(new Color(210, 210, 250));
            }
            if(i==6 || i==7 || i==8 ||i==11 ||i==12 ||i==13 ||i==16 ||i==17 ||i==18 ||i==19 ){
                b[i].setBackground(new Color(235, 235, 250));
            }
        }

        b[0].addActionListener(e->{
            clearesult();
        });
        b[19].addActionListener(e->{
            if((Integer.parseInt(result.getText()))!=0){
                result.setText(result.getText()+"0");
            }
        });
        b[16].addActionListener(e->{ 
            if(result.getText()=="+" || result.getText()=="-" ||result.getText()=="*" ||result.getText()=="/" ||result.getText()=="^" || result.getText()=="rt" || result.getText()=="%" )
            clearesult();         
         if((Integer.parseInt(result.getText()))!=0){
                result.setText(result.getText()+"1");
            }
            else if((Integer.parseInt(result.getText()))==0){
                result.setText("1");
            }
        });
        b[17].addActionListener(e->{   
            if(result.getText()=="+" || result.getText()=="-" ||result.getText()=="*" ||result.getText()=="/" ||result.getText()=="^"  || result.getText()=="rt" || result.getText()=="%")
            clearesult();       
         if((Integer.parseInt(result.getText()))!=0){
                result.setText(result.getText()+"2");
            }
            else if((Integer.parseInt(result.getText()))==0){
                result.setText("2");
            }
        });
        b[18].addActionListener(e->{  
            if(result.getText()=="+" || result.getText()=="-" ||result.getText()=="*" ||result.getText()=="/" ||result.getText()=="%" ||result.getText()=="^"|| result.getText()=="rt")
            clearesult();        
         if((Integer.parseInt(result.getText()))!=0){
                result.setText(result.getText()+"3");
            }
            else if((Integer.parseInt(result.getText()))==0){
                result.setText("3");
            }
        });
        b[13].addActionListener(e->{  
            if(result.getText()=="+" || result.getText()=="-" ||result.getText()=="*" ||result.getText()=="/" ||result.getText()=="^" || result.getText()=="rt" || result.getText()=="%")
            clearesult();        
         if((Integer.parseInt(result.getText()))!=0){
                result.setText(result.getText()+"6");
            }
            else if((Integer.parseInt(result.getText()))==0){
                result.setText("6");
            }
        });
        b[12].addActionListener(e->{  
            if(result.getText()=="+" || result.getText()=="-" ||result.getText()=="*" ||result.getText()=="/" ||result.getText()=="^" || result.getText()=="rt" || result.getText()=="%" )
            clearesult();        
         if((Integer.parseInt(result.getText()))!=0){
                result.setText(result.getText()+"5");
            }
            else if((Integer.parseInt(result.getText()))==0){
                result.setText("5");
            }
        });
        b[11].addActionListener(e->{  
            if(result.getText()=="+" || result.getText()=="-" ||result.getText()=="*" ||result.getText()=="/" ||result.getText()=="^" || result.getText()=="rt" || result.getText()=="%")
            clearesult();        
         if((Integer.parseInt(result.getText()))!=0){
                result.setText(result.getText()+"4");
            }
            else if((Integer.parseInt(result.getText()))==0){
                result.setText("4");
            }
        });
        b[8].addActionListener(e->{  
            if(result.getText()=="+" || result.getText()=="-" ||result.getText()=="*" ||result.getText()=="/" ||result.getText()=="^" || result.getText()=="rt" || result.getText()=="%" )
            clearesult();        
         if((Integer.parseInt(result.getText()))!=0){
                result.setText(result.getText()+"9");
            }
            else if((Integer.parseInt(result.getText()))==0){
                result.setText("9");
            }
        });
        b[7].addActionListener(e->{  
            if(result.getText()=="+" || result.getText()=="-" ||result.getText()=="*" ||result.getText()=="/" ||result.getText()=="^" || result.getText()=="rt" || result.getText()=="%" )
            clearesult();        
         if((Integer.parseInt(result.getText()))!=0){
                result.setText(result.getText()+"8");
            }
            else if((Integer.parseInt(result.getText()))==0){
                result.setText("8");
            }
        });
        b[6].addActionListener(e->{   
            if(result.getText()=="+" || result.getText()=="-" ||result.getText()=="*" ||result.getText()=="/" ||result.getText()=="^" || result.getText()=="rt" || result.getText()=="%" )
            clearesult();       
         if((Integer.parseInt(result.getText()))!=0){
                result.setText(result.getText()+"7");
            }
            else if((Integer.parseInt(result.getText()))==0){
                result.setText("7");
            }
        });
        b[14].addActionListener(e->{
            num2=Double.parseDouble(result.getText());
            Double c;
            switch(operator){
                case '+'-> {c=num1+num2;result.setText(c.toString());}
                case '-'-> {c=num1-num2;result.setText(c.toString());}
                case '*'-> {c=num1*num2;result.setText(c.toString());}       
                case '/'-> {c=num1/num2;result.setText(c.toString());}       
                case '%'-> {c=num1%num2;result.setText(c.toString());}              
                case '^'-> {c=Math.pow(num1, num2);result.setText(c.toString());}  

            }
        });
        b[15].addActionListener(e->{
            num1=Double.parseDouble(result.getText()); 
            clearesult();
            Double c=Math.sqrt(num1);
            result.setText(c.toString());
        });
         b[9].addActionListener(e->{
            num1=Double.parseDouble(result.getText()); 
            clearesult();
             result.setText("+");
             operator='+';
        });
         b[1].addActionListener(e->{
            num1=Double.parseDouble(result.getText()); 
            clearesult();
            result.setText("/");
            operator='/';
        });
         b[2].addActionListener(e->{
            num1=Double.parseDouble(result.getText()); 
            clearesult();
            result.setText("*");
            operator='*';
        });
         b[3].addActionListener(e->{
            num1=Double.parseDouble(result.getText()); 
            clearesult();
            result.setText("-");
            operator='-';
        });
         b[4].addActionListener(e->{
            StringBuffer s=new StringBuffer(result.getText());
            if(s.length()==1){result.setText("0");}
            else{
            result.setText(s.deleteCharAt(result.getText().length()-1).toString());}
         });
         b[5].addActionListener(e->{
            num1=Double.parseDouble(result.getText()); 
            clearesult();
            result.setText("%");
            operator='%';
        });
         b[10].addActionListener(e->{
            num1=Double.parseDouble(result.getText()); 
            clearesult();
            result.setText("^");
            operator='^';
        });
    }
    
    void clearesult(){
    result.setText("0");
    }
}
