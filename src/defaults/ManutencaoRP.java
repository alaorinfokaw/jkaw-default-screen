package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ManutencaoRP {
  public ManutencaoRP() throws Exception {
    new SwingEngine(this).render("defaults/ManutencaoRP.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ManutencaoRP();
  }
}
