import java.util.Random;
public class passwort{
  //attribute
  public int länge;
  public boolean Sonderzeichen;


  //Konstruktor
  public passwort(int l, boolean s){
    this.länge = l;
    this.Sonderzeichen = s;
  }

  //Methoden
  public void getinfos(){
    System.out.println(this.länge);
    System.out.println(this.Sonderzeichen);
  }

  public String createPasswort(){
    //vars
    Random r = new Random();
    Random rd = new Random();
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
    String alphabetUndSonderzeichen = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789=)(/&%$§!²³{[]}äöü-.,;#+* ";
    char passwortS[] = new char[this.länge];
    char passwort[] = new char[this.länge];
    
    //ifs
    if(länge > 0){
      if(Sonderzeichen){
        for(int i = 0;i<=this.länge-1;i++){

        passwortS[i] = alphabetUndSonderzeichen.charAt(r.nextInt(alphabetUndSonderzeichen.length()));
        }
        String pw = new String(passwortS);
        return pw;
      }
      else{
        for(int i = 0;i<=this.länge-1;i++){

          passwort[i] = alphabet.charAt(rd.nextInt(alphabet.length()));
        }
        String pw2 = new String(passwort);
        return pw2;
      }
    }
    else{
      return "passwortlänge muss über 0 sein";
    }
  }
}