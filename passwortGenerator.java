import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.01.2022
 * @author 
 */

public class passwortGenerator extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JCheckBox jCheckBox1 = new JCheckBox();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JLabel jLabel3 = new JLabel();
  private JNumberField jNumberField1 = new JNumberField();
  // Ende Attribute
  
  public passwortGenerator() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 296; 
    int frameHeight = 263;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("PasswortGenerator");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(24, 16, 233, 41);
    jLabel1.setText("Länge des Passworts: ");
    cp.add(jLabel1);
    jLabel2.setBounds(24, 72, 233, 41);
    jLabel2.setText("Sonderzeichen ");
    cp.add(jLabel2);
    jCheckBox1.setBounds(184, 80, 25, 25);
    jCheckBox1.setOpaque(false);
    cp.add(jCheckBox1);
    jButton1.setBounds(24, 136, 113, 33);
    jButton1.setText("generieren");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(144, 136, 113, 33);
    jButton2.setText("kopieren");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jLabel3.setBounds(24, 184, 233, 25);
    jLabel3.setText("generiertes Passwort");
    cp.add(jLabel3);
    jNumberField1.setBounds(184, 24, 73, 25);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public PasswortGenerator
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new passwortGenerator();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    if ( jNumberField1.getInt() >= 10){
      passwort A1 = new passwort(jNumberField1.getInt(),jCheckBox1.isSelected());
      String p1 = A1.createPasswort();
      jLabel3.setText(p1);
    }
    else{
      jLabel3.setText("minimum Passwortlänge: 10");
    }
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    StringSelection stringSelection = new StringSelection(jLabel3.getText());
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
  } // end of jButton2_ActionPerformed

  // Ende Methoden
} // end of class PasswortGenerator
