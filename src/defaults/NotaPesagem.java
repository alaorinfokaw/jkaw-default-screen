package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class NotaPesagem {
  public NotaPesagem() throws Exception {
    new SwingEngine(this).render("swix/NotaPesagem.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new NotaPesagem();
  }
}