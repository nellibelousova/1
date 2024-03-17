import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App
{
    private JButton buttonOK;
    private JTextField textField;

    public App()
    {
        buttonOK.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                
            }
        });
    }

    public static void main(String[] args)
    {

    }

}