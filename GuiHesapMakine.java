package guiHesapMakinesi;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class GuiHesapMakine extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private double cevap, numara;
    private int islem;
    private JLabel bl; 
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    guiHesapMakinesi1 frame = new guiHesapMakinesi1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void addInput(String str) {
        textField.setText(textField.getText() + str);
    }

    public void hesaplama() {
        try {
            double giris = Double.parseDouble(textField.getText());
            switch (islem) {
                case 1: // Toplama
                    cevap = numara + giris;
                    break;
                case 2: // Cıkarma
                    cevap = numara - giris;
                    break;
                case 3: // Carpma
                    cevap = numara * giris;
                    break;
                case 4: // Bolme
                    if (giris == 0) {
                        bl.setText("Hata: Sıfıra bölme!");
                        return;
                    }
                    cevap = numara / giris;
                    break;
                default:
                    bl.setText("Geçersiz işlem!");
                    return;
            }
            textField.setText(Double.toString(cevap));
            bl.setText(""); 
        } catch (NumberFormatException ex) {
            bl.setText("Hatalı giriş!");
        }
    }

    
    public GuiHesapMakine() {
        setType(Type.UTILITY);
        setTitle("Hesap Makinesi");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 530);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel cıktıEkranı = new JPanel();
        cıktıEkranı.setBounds(30, 40, 376, 75);
        contentPane.add(cıktıEkranı);

        textField = new JTextField();
        cıktıEkranı.add(textField);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 49));
        textField.setHorizontalAlignment(SwingConstants.TRAILING);
        textField.setDropMode(DropMode.INSERT);
        textField.setColumns(9);

        JPanel kontrolPaneli = new JPanel();
        kontrolPaneli.setBounds(30, 146, 376, 309);
        contentPane.add(kontrolPaneli);
        kontrolPaneli.setLayout(new GridLayout(0, 4, 10, 10));

        
        bl = new JLabel("");
        bl.setBounds(30, 25, 376, 14);
        contentPane.add(bl);
        bl.setBackground(new Color(240, 240, 240));
        bl.setToolTipText("");
        bl.setHorizontalAlignment(SwingConstants.RIGHT);
        bl.setFont(new Font("Tahoma", Font.BOLD, 20));

       
        JButton btnTopla = new JButton("+");
        btnTopla.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    numara = Double.parseDouble(textField.getText());
                    islem = 1;
                    textField.setText("");
                    bl.setText(numara + " +");
                } catch (NumberFormatException ex) {
                    bl.setText("Hatalı giriş!");
                }
            }
        });
        btnTopla.setFont(new Font("Tahoma", Font.PLAIN, 23));
        kontrolPaneli.add(btnTopla);

        JButton btnCikar = new JButton("-");
        btnCikar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    numara = Double.parseDouble(textField.getText());
                    islem = 2;
                    textField.setText("");
                    bl.setText(numara + " -");
                } catch (NumberFormatException ex) {
                    bl.setText("Hatalı giriş!");
                }
            }
        });
        btnCikar.setFont(new Font("Tahoma", Font.PLAIN, 23));
        kontrolPaneli.add(btnCikar);

        JButton btnCarp = new JButton("*");
        btnCarp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    numara = Double.parseDouble(textField.getText());
                    islem = 3;
                    textField.setText("");
                    bl.setText(numara + " *");
                } catch (NumberFormatException ex) {
                    bl.setText("Hatalı giriş!");
                }
            }
        });
        btnCarp.setFont(new Font("Tahoma", Font.PLAIN, 23));
        kontrolPaneli.add(btnCarp);

        JButton btnBol = new JButton("/");
        btnBol.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    numara = Double.parseDouble(textField.getText());
                    islem = 4;
                    textField.setText("");
                    bl.setText(numara + " /");
                } catch (NumberFormatException ex) {
                    bl.setText("Hatalı giriş!");
                }
            }
        });
        btnBol.setFont(new Font("Tahoma", Font.PLAIN, 23));
        kontrolPaneli.add(btnBol);

        
        String[] buttonTexts = { "9", "8", "7", "C", "6", "5", "4", "=", "3", "2", "1", "0" };
        for (String text : buttonTexts) {
            JButton button = new JButton(text);
            button.setFont(new Font("Tahoma", Font.PLAIN, 23));
            if (text.equals("=")) {
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        hesaplama();
                    }
                });
            } else if (text.equals("C")) {
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textField.setText("");
                        bl.setText("");
                    }
                });
            } else {
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        addInput(e.getActionCommand());
                    }
                });
            }
            kontrolPaneli.add(button);
        }
    }
}
