import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GUI implements ActionListener {
    public static long size;
    static JLabel folderSize, info;
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JButton button;

    public GUI() {
        frame = new JFrame();
        panel = new JPanel();
        info = new JLabel();
        folderSize = new JLabel();
        textField = new JTextField(12);
        button = new JButton("Start");

        panel.add(textField);
        panel.add(button);
        panel.add(folderSize);

        button.addActionListener(this);

        frame.add(panel);

        frame.setSize(200, 150);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            if (new File(textField.getText()).isDirectory()) {
                Thread t = new Thread(() -> System.out.println(SizeCounter
                        .getReadableSizeByte(SizeCounter.getFileSize(new File(textField.getText())))));

                Thread t1 = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        while (t.isAlive()) {

                            folderSize.setText("Size of the folder " + SizeCounter.getReadableSizeByte((size)));
                            try {
                                Thread.sleep(300);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                        folderSize.setText("Size of the folder " + SizeCounter.getReadableSizeByte((size)));
                    }
                });
                t1.start();
                t.start();
            } else {
                JOptionPane.showMessageDialog(frame, "Wrong path. Please enter again.", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);

            }
        }
    }
}
