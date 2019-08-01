/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Hemant
 */
public class mainController implements Initializable {
    Float data = 0f;
    int operation = -1;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
      @FXML
    private Button five;
       @FXML
    private Button six;
     @FXML
    private Button seven;
     @FXML
    private Button eight;
     @FXML
    private Button nine;
     @FXML
    private Button zero;
     @FXML
    private Button add;
     @FXML
    private Button sub;
     @FXML
    private Button multiply;
     @FXML
    private Button divide;
     @FXML
    private Button equal; 
      @FXML
    private Button clear;     
    @FXML
    private TextArea display;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource()== one)
        {
            display.setText(display.getText() + "1");
        }
        else if(event.getSource()== two)
        {
            display.setText(display.getText() + "2");
        }
        else if (event.getSource()==three)
        {
            display.setText(display.getText()+ "3");
        }
        else if(event.getSource()==four)
        {
            display.setText(display.getText()+ "4");
        }
        else if(event.getSource()==five) 
        {
            display.setText(display.getText()+ "5");
        }
        else if(event.getSource()==six) 
        {
            display.setText(display.getText()+ "6");
        }
        else if(event.getSource()==seven) 
        {
            display.setText(display.getText()+ "7");
        }
        else if(event.getSource()==eight) 
        {
            display.setText(display.getText()+ "8");
        }
        else if(event.getSource()==nine) 
        {
            display.setText(display.getText()+ "9");
        }
        else if(event.getSource()==zero) 
        {
            display.setText(display.getText()+ "0");
        }
        else if(event.getSource()==clear)
        {
            display.setText("");
        }
        else if(event.getSource()== add)
        {
            data = Float.parseFloat(display.getText());
            operation = 1; //addition
            display.setText("");
        }
        else if(event.getSource()== sub)
        {
            data = Float.parseFloat(display.getText());
            operation = 2; //Substraction
            display.setText("");
        }
        else if(event.getSource()== multiply)
        {
            data = Float.parseFloat(display.getText());
            operation = 3; //Multiply
           display.setText("");
        }
        else if(event.getSource()==divide)
        {
            data = Float.parseFloat(display.getText());
            operation = 4; //Divide
            display.setText("");
        }
        else if (event.getSource() == equal)
        {
            Float seco = Float.parseFloat(display.getText());
            switch(operation)
            {
                case 1: //addition
                    try
                    {
                        Float ans = data + seco;
                    
                    display.setText(String.valueOf(ans)); break;
                    }catch(Exception e){System.out.println("Problem is here");}
                case 2: //Substraction
                   Float  ans = data - seco;
                    display.setText(String.valueOf(ans)); break;
                    
                
                case 3: //Multiplication
                     ans = data * seco;
                    display.setText(String.valueOf(ans)); break;
                
                case 4: //Divide
                     ans = 0f; // SecondOperand;
                     try{
                         ans =data / seco;
                     }catch(Exception e) {display.setText("error");}
                     
                    display.setText(String.valueOf(ans)); break;
            }
        }
        
            }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
