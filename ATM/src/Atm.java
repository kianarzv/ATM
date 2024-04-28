import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Atm extends JFrame implements ActionListener {
    JButton english1Back = new JButton("Return");
    JButton persian1Back = new JButton("بازگشت");
    JButton english2Back = new JButton("Return");
    JButton persian2Back = new JButton("بازگشت");
    JButton english3Back = new JButton("Return");
    JButton persian3Back = new JButton("بازگشت");
    JButton english4Back = new JButton("Return");
    JButton persian4Back = new JButton("بازگشت");
    JButton english5Back = new JButton("Return");
    JButton persian5Back = new JButton("بازگشت");
    JButton english6Back = new JButton("Return");
    JButton persian6Back = new JButton("بازگشت");
    JButton english7Back = new JButton("Return");
    JButton persian7Back = new JButton("بازگشت");
    JLabel logo = new JLabel();
    JPanel languagePanel = new JPanel();
    JButton english = new JButton("English");
    JButton persian = new JButton("فارسی");
    JPanel persianPasswordPanel = new JPanel();
    JButton persianEnter = new JButton("ثبت");
    JPanel englishPasswordPanel = new JPanel();
    JButton englishEnter = new JButton("Enter");
    JPanel persianMenuPanel = new JPanel();
    JButton persianButton1 = new JButton("تغییر رمز");
    JButton persianButton2 = new JButton("برداشت وجه");
    JButton persianButton3 = new JButton("کارت به کارت");
    JButton persianButton4 = new JButton("اعلام موجودی");
    JPanel englishMenuPanel = new JPanel();
    JButton englishButton1 = new JButton("Change password");
    JButton englishButton2 = new JButton("Debit");
    JButton englishButton3 = new JButton("Transfer money");
    JButton englishButton4 = new JButton("Check balance");

    JPanel persianChangePasswordPanel = new JPanel();
    JButton persianEnter2 = new JButton("ثبت");
    JPanel englishChangePasswordPanel = new JPanel();
    JButton englishEnter2 = new JButton("Enter");
    JPanel persianLastPanel = new JPanel();
    JPanel englishLastPanel = new JPanel();
    JPanel persianBalancePanel = new JPanel();
    JPanel englishBalancePanel = new JPanel();
    JPanel persianDebitPanel = new JPanel();
    JPanel englishDebitPanel = new JPanel();
    JButton persianEnter3 = new JButton("ثبت");
    JButton englishEnter3 = new JButton("Enter");
    JPanel persianTransferPanel = new JPanel();
    JPanel englishTransferPanel = new JPanel();
    JButton persianEnter4 = new JButton("ثبت");
    JButton englishEnter4 = new JButton("Enter");

    Atm() {
        buildLogo();
        buildBackButton();
        buildLanguagePanel();
        buildEnglishPasswordPanel();
        buildPersianPasswordPanel();
        buildPersianMenuPanel();
        buildEnglishMenuPanel();
        buildPersianChangePasswordPanel();
        buildEnglishChangePasswordPanel();
        buildPersianBalancePanel();
        buildEnglishBalancePanel();
        buildPersianDebitPanel();
        buildEnglishDebitPanel();
        buildPersianTransferPanel();
        buildEnglishTransferPanel();
        buildPersianLastPanel();
        buildEnglishLastPanel();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("ATM");
        this.setSize(1020, 720);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        ImageIcon image = new ImageIcon("atm-icon.png");
        this.setIconImage(image.getImage());
        this.add(languagePanel, BorderLayout.CENTER);
    }
    public void buildLogo() {
        logo.setBounds(470, 30, 100, 100);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("atm-icon.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        logo.setIcon(imageIcon);
        logo.setText("ATM");
        logo.setFont(new Font("Bauhaus 93", Font.PLAIN, 20));
        logo.setHorizontalTextPosition(JLabel.CENTER);
        logo.setVerticalTextPosition(JLabel.TOP);
        logo.setIconTextGap(-10);
    }
    public void buildLanguagePanel() {
        languagePanel.setBackground(new Color(130, 179, 210));
        languagePanel.setLayout(null);
        languagePanel.setBounds(0, 0, 1020, 720);


        english.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        english.setBounds(20, 360, 100, 70);
        english.setBackground(new Color(245, 231, 181));
        english.addActionListener(this);

        persian.setBounds(900, 360, 100, 70);
        persian.setBackground(new Color(245, 231, 181));
        persian.setFont(new Font("B lotus", Font.BOLD, 20));
        persian.addActionListener(this);

        JLabel persianQuestionLabel = new JLabel("زبان خود را انتخاب کنید");
        persianQuestionLabel.setFont(new Font("B lotus", Font.BOLD, 20));
        persianQuestionLabel.setBounds(700, 360, 200, 70);

        JLabel englishQuestionLabel = new JLabel("Choose Language");
        englishQuestionLabel.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        englishQuestionLabel.setBounds(150, 360, 200, 70);

        languagePanel.add(persian);
        languagePanel.add(english);
        languagePanel.add(persianQuestionLabel);
        languagePanel.add(englishQuestionLabel);
        languagePanel.add(logo);
    }
    public void buildBackButton() {
        english1Back.addActionListener(this);
        english1Back.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        english1Back.setBounds(890, 600, 100, 70);
        english1Back.setBackground(new Color(255, 237, 218));
        persian1Back.addActionListener(this);
        persian1Back.setFont(new Font("B lotus", Font.BOLD, 20));
        persian1Back.setBounds(890, 600, 100, 70);
        persian1Back.setBackground(new Color(255, 237, 218));

        english2Back.addActionListener(this);
        english2Back.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        english2Back.setBounds(890, 600, 100, 70);
        english2Back.setBackground(new Color(255, 237, 218));
        persian2Back.addActionListener(this);
        persian2Back.setFont(new Font("B lotus", Font.BOLD, 20));
        persian2Back.setBounds(890, 600, 100, 70);
        persian2Back.setBackground(new Color(255, 237, 218));

        english3Back.addActionListener(this);
        english3Back.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        english3Back.setBounds(890, 600, 100, 70);
        english3Back.setBackground(new Color(255, 237, 218));
        persian3Back.addActionListener(this);
        persian3Back.setFont(new Font("B lotus", Font.BOLD, 20));
        persian3Back.setBounds(890, 600, 100, 70);
        persian3Back.setBackground(new Color(255, 237, 218));

        english4Back.addActionListener(this);
        english4Back.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        english4Back.setBounds(890, 600, 100, 70);
        english4Back.setBackground(new Color(255, 237, 218));
        persian4Back.addActionListener(this);
        persian4Back.setFont(new Font("B lotus", Font.BOLD, 20));
        persian4Back.setBounds(890, 600, 100, 70);
        persian4Back.setBackground(new Color(255, 237, 218));

        english5Back.addActionListener(this);
        english5Back.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        english5Back.setBounds(890, 600, 100, 70);
        english5Back.setBackground(new Color(255, 237, 218));
        persian5Back.addActionListener(this);
        persian5Back.setFont(new Font("B lotus", Font.BOLD, 20));
        persian5Back.setBounds(890, 600, 100, 70);
        persian5Back.setBackground(new Color(255, 237, 218));

        english6Back.addActionListener(this);
        english6Back.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        english6Back.setBounds(890, 600, 100, 70);
        english6Back.setBackground(new Color(255, 237, 218));
        persian6Back.addActionListener(this);
        persian6Back.setFont(new Font("B lotus", Font.BOLD, 20));
        persian6Back.setBounds(890, 600, 100, 70);
        persian6Back.setBackground(new Color(255, 237, 218));

        english7Back.addActionListener(this);
        english7Back.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        english7Back.setBounds(890, 600, 100, 70);
        english7Back.setBackground(new Color(255, 237, 218));
        persian7Back.addActionListener(this);
        persian7Back.setFont(new Font("B lotus", Font.BOLD, 20));
        persian7Back.setBounds(890, 600, 100, 70);
        persian7Back.setBackground(new Color(255, 237, 218));
    }
    public void buildPersianPasswordPanel() {
        JLabel enterPassword = new JLabel("رمز خود را وارد کنید.");
        enterPassword.setFont(new Font("B lotus", Font.BOLD, 20));
        enterPassword.setBounds(415, 270, 200, 70);

        JPasswordField persianPasswordField =  new JPasswordField();
        persianPasswordField.setBounds(360, 350, 300, 70);
        persianPasswordField.setFont(new Font("title", Font.PLAIN, 40));

        persianEnter.addActionListener(this);
        persianEnter.setFont(new Font("B lotus", Font.BOLD, 20));
        persianEnter.setBackground(new Color(245, 231, 181));
        persianEnter.setBounds(385, 500, 250, 70);

        persianPasswordPanel.setBounds(0, 0, 1020, 720);
        persianPasswordPanel.setLayout(null);
        persianPasswordPanel.setBackground(new Color(130, 179, 210));
        persianPasswordPanel.add(persian1Back);
        persianPasswordPanel.add(persianEnter);
        persianPasswordPanel.add(persianPasswordField);
        persianPasswordPanel.add(enterPassword);
    }
    public void buildEnglishPasswordPanel() {
        JLabel enterPassword = new JLabel("Enter your password.");
        enterPassword.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        enterPassword.setBounds(415, 270, 200, 70);

        JPasswordField englishPasswordField = new JPasswordField();
        englishPasswordField.setBounds(360, 350, 300, 70);
        englishPasswordField.setFont(new Font("title", Font.PLAIN, 40));

        englishEnter.addActionListener(this);
        englishEnter.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        englishEnter.setBackground(new Color(245, 231, 181));
        englishEnter.setBounds(385, 500, 250, 70);

        englishPasswordPanel.setBounds(0, 0, 1020, 720);
        englishPasswordPanel.setBackground(new Color(130, 179, 210));
        englishPasswordPanel.setLayout(null);
        englishPasswordPanel.add(english1Back);
        englishPasswordPanel.add(englishEnter);
        englishPasswordPanel.add(englishPasswordField);
        englishPasswordPanel.add(enterPassword);
    }
    public void buildPersianMenuPanel() {
        persianButton1.addActionListener(this);
        persianButton1.setFont(new Font("B lotus", Font.BOLD, 20));
        persianButton1.setBounds(40, 200, 180, 70);
        persianButton1.setBackground(new Color(245, 231, 181));

        persianButton2.addActionListener(this);
        persianButton2.setFont(new Font("B lotus", Font.BOLD, 20));
        persianButton2.setBounds(40, 400, 180, 70);
        persianButton2.setBackground(new Color(245, 231, 181));

        persianButton3.addActionListener(this);
        persianButton3.setFont(new Font("B lotus", Font.BOLD, 20));
        persianButton3.setBounds(800, 200, 180, 70);
        persianButton3.setBackground(new Color(245, 231, 181));

        persianButton4.addActionListener(this);
        persianButton4.setFont(new Font("B lotus", Font.BOLD, 20));
        persianButton4.setBounds(800, 400, 180, 70);
        persianButton4.setBackground(new Color(245, 231, 181));

        persianMenuPanel.setBounds(0, 0, 1020, 720);
        persianMenuPanel.setLayout(null);
        persianMenuPanel.setBackground(new Color(130, 179, 210));
        persianMenuPanel.add(persian2Back);
        persianMenuPanel.add(persianButton1);
        persianMenuPanel.add(persianButton2);
        persianMenuPanel.add(persianButton3);
        persianMenuPanel.add(persianButton4);
    }
    public void buildEnglishMenuPanel() {
        englishButton1.addActionListener(this);
        englishButton1.setFont(new Font("Britannic Bold", Font.PLAIN, 16));
        englishButton1.setBounds(40, 200, 180, 70);
        englishButton1.setBackground(new Color(245, 231, 181));

        englishButton2.addActionListener(this);
        englishButton2.setFont(new Font("Britannic Bold", Font.PLAIN, 16));
        englishButton2.setBounds(40, 400, 180, 70);
        englishButton2.setBackground(new Color(245, 231, 181));

        englishButton3.addActionListener(this);
        englishButton3.setFont(new Font("Britannic Bold", Font.PLAIN, 16));
        englishButton3.setBounds(800, 200, 180, 70);
        englishButton3.setBackground(new Color(245, 231, 181));

        englishButton4.addActionListener(this);
        englishButton4.setFont(new Font("Britannic Bold", Font.PLAIN, 16));
        englishButton4.setBounds(800, 400, 180, 70);
        englishButton4.setBackground(new Color(245, 231, 181));

        englishMenuPanel.setBounds(0, 0, 1020, 720);
        englishMenuPanel.setBackground(new Color(130, 179, 210));
        englishMenuPanel.setLayout(null);
        englishMenuPanel.add(english2Back);
        englishMenuPanel.add(englishButton1);
        englishMenuPanel.add(englishButton2);
        englishMenuPanel.add(englishButton3);
        englishMenuPanel.add(englishButton4);
    }
    public void buildPersianChangePasswordPanel() {
        persianChangePasswordPanel.setBounds(0, 0, 1020, 720);
        persianChangePasswordPanel.setBackground(new Color(130, 179, 210));
        persianChangePasswordPanel.setLayout(null);

        JLabel enterPassword = new JLabel("رمز جدید را وارد کنید.");
        enterPassword.setFont(new Font("B lotus", Font.BOLD, 20));
        enterPassword.setBounds(415, 270, 200, 70);

        JPasswordField persianPasswordField =  new JPasswordField();
        persianPasswordField.setBounds(360, 350, 300, 70);
        persianPasswordField.setFont(new Font("title", Font.PLAIN, 40));

        persianEnter2.addActionListener(this);
        persianEnter2.setFont(new Font("B lotus", Font.BOLD, 20));
        persianEnter2.setBackground(new Color(245, 231, 181));
        persianEnter2.setBounds(385, 500, 250, 70);

        persianChangePasswordPanel.add(enterPassword);
        persianChangePasswordPanel.add(persianPasswordField);
        persianChangePasswordPanel.add(persian3Back);
        persianChangePasswordPanel.add(persianEnter2);
    }
    public void buildEnglishChangePasswordPanel() {
        englishChangePasswordPanel.setBounds(0, 0, 1020, 720);
        englishChangePasswordPanel.setBackground(new Color(130, 179, 210));
        englishChangePasswordPanel.setLayout(null);

        JLabel enterPassword = new JLabel("Enter your new password.");
        enterPassword.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        enterPassword.setBounds(400, 270, 250, 70);

        JPasswordField englishPasswordField = new JPasswordField();
        englishPasswordField.setBounds(360, 350, 300, 70);
        englishPasswordField.setFont(new Font("title", Font.PLAIN, 40));

        englishEnter2.addActionListener(this);
        englishEnter2.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        englishEnter2.setBackground(new Color(245, 231, 181));
        englishEnter2.setBounds(385, 500, 250, 70);

        englishChangePasswordPanel.add(enterPassword);
        englishChangePasswordPanel.add(englishPasswordField);
        englishChangePasswordPanel.add(english3Back);
        englishChangePasswordPanel.add(englishEnter2);
    }
    public void buildPersianLastPanel() {
        persianLastPanel.setBounds(0, 0, 1020, 720);
        persianLastPanel.setBackground(new Color(172, 223, 135));
        persianLastPanel.setLayout(null);
        persianLastPanel.add(persian4Back);
        JLabel label = new JLabel("عملیات با موفقیت انجام شد.");
        label.setFont(new Font("B lotus", Font.BOLD, 30));
        label.setBounds(360,260, 300, 200);
        persianLastPanel.add(label);
    }
    public void buildEnglishLastPanel() {
        englishLastPanel.setBounds(0, 0, 1020, 720);
        englishLastPanel.setBackground(new Color(172, 223, 135));
        englishLastPanel.setLayout(null);
        englishLastPanel.add(english4Back);
        JLabel label = new JLabel("Successful");
        label.setFont(new Font("Britannic Bold", Font.PLAIN, 40));
        label.setBounds(420,260, 200, 200);
        englishLastPanel.add(label);
    }
    public void buildPersianBalancePanel() {
        persianBalancePanel.setBounds(0, 0, 1020, 720);
        persianBalancePanel.setBackground(new Color(130, 179, 210));
        persianBalancePanel.setLayout(null);
        persianBalancePanel.add(persian5Back);
        JLabel label = new JLabel("موجودی شما 1000000 تومان است.");
        label.setFont(new Font("B lotus", Font.BOLD, 25));
        label.setBounds(360,260, 300, 200);
        persianBalancePanel.add(label);

    }
    public void buildEnglishBalancePanel() {
        englishBalancePanel.setBounds(0, 0, 1020, 720);
        englishBalancePanel.setBackground(new Color(130, 179, 210));
        englishBalancePanel.setLayout(null);
        englishBalancePanel.add(english5Back);
        JLabel label = new JLabel("Your balance is equal 100000");
        label.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        label.setBounds(360,260, 300, 200);
        englishBalancePanel.add(label);
    }
    public void buildPersianDebitPanel() {
        persianDebitPanel.setBounds(0, 0, 1020, 720);
        persianDebitPanel.setBackground(new Color(130, 179, 210));
        persianDebitPanel.setLayout(null);
        persianDebitPanel.add(persian6Back);

        JLabel label = new JLabel("مبلغ مورد نظر را وارد کنید.");
        label.setFont(new Font("B lotus", Font.BOLD, 25));
        label.setBounds(380,200, 300, 200);
        persianDebitPanel.add(label);

        JTextField textField =  new JTextField();
        textField.setBounds(360, 350, 300, 70);
        textField.setFont(new Font("title", Font.PLAIN, 40));
        persianDebitPanel.add(textField);

        persianEnter3.addActionListener(this);
        persianEnter3.setFont(new Font("B lotus", Font.BOLD, 20));
        persianEnter3.setBackground(new Color(245, 231, 181));
        persianEnter3.setBounds(385, 500, 250, 70);
        persianDebitPanel.add(persianEnter3);
    }
    public void buildEnglishDebitPanel() {
        englishDebitPanel.setBounds(0, 0, 1020, 720);
        englishDebitPanel.setBackground(new Color(130, 179, 210));
        englishDebitPanel.setLayout(null);
        englishDebitPanel.add(english6Back);

        JLabel label = new JLabel("Enter the desired amount.");
        label.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        label.setBounds(380, 200, 300, 70);
        englishDebitPanel.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(360, 350, 300, 70);
        textField.setFont(new Font("title", Font.PLAIN, 40));
        englishDebitPanel.add(textField);

        englishEnter3.addActionListener(this);
        englishEnter3.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        englishEnter3.setBackground(new Color(245, 231, 181));
        englishEnter3.setBounds(385, 500, 250, 70);
        englishDebitPanel.add(englishEnter3);
    }
    public void buildPersianTransferPanel() {
        persianTransferPanel.setBounds(0, 0, 1020, 720);
        persianTransferPanel.setBackground(new Color(130, 179, 210));
        persianTransferPanel.setLayout(null);
        persianTransferPanel.add(persian7Back);

        JLabel label1 = new JLabel("کارت مبدا");
        label1.setFont(new Font("B lotus", Font.BOLD, 20));
        label1.setBounds(480,200, 300, 70);
        persianTransferPanel.add(label1);

        JTextField textField1 =  new JTextField();
        textField1.setBounds(320, 250, 380, 50);
        textField1.setFont(new Font("title", Font.PLAIN, 30));
        persianTransferPanel.add(textField1);

        JLabel label2 = new JLabel("کارت مقصد");
        label2.setFont(new Font("B lotus", Font.BOLD, 20));
        label2.setBounds(480,300, 300, 70);
        persianTransferPanel.add(label2);

        JTextField textField2 =  new JTextField();
        textField2.setBounds(320, 350, 380, 50);
        textField2.setFont(new Font("title", Font.PLAIN, 30));
        persianTransferPanel.add(textField2);

        JLabel label3 = new JLabel("مبلغ");
        label3.setFont(new Font("B lotus", Font.BOLD, 20));
        label3.setBounds(510,400, 300, 70);
        persianTransferPanel.add(label3);

        JTextField textField3 =  new JTextField();
        textField3.setBounds(320, 450, 380, 50);
        textField3.setFont(new Font("title", Font.PLAIN, 30));
        persianTransferPanel.add(textField3);

        persianEnter4.addActionListener(this);
        persianEnter4.setFont(new Font("B lotus", Font.BOLD, 20));
        persianEnter4.setBackground(new Color(245, 231, 181));
        persianEnter4.setBounds(385, 550, 250, 70);
        persianTransferPanel.add(persianEnter4);
    }
    public void buildEnglishTransferPanel() {
        englishTransferPanel.setBounds(0, 0, 1020, 720);
        englishTransferPanel.setBackground(new Color(130, 179, 210));
        englishTransferPanel.setLayout(null);
        englishTransferPanel.add(english7Back);

        JLabel label1 = new JLabel("Source card");
        label1.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        label1.setBounds(450,200, 300, 70);
        englishTransferPanel.add(label1);

        JTextField textField1 =  new JTextField();
        textField1.setBounds(320, 250, 380, 50);
        textField1.setFont(new Font("title", Font.PLAIN, 30));
        englishTransferPanel.add(textField1);

        JLabel label2 = new JLabel("Destination card");
        label2.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        label2.setBounds(450,300, 300, 70);
        englishTransferPanel.add(label2);

        JTextField textField2 =  new JTextField();
        textField2.setBounds(320, 350, 380, 50);
        textField2.setFont(new Font("title", Font.PLAIN, 30));
        englishTransferPanel.add(textField2);

        JLabel label3 = new JLabel("Amount money");
        label3.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        label3.setBounds(450,400, 300, 70);
        englishTransferPanel.add(label3);

        JTextField textField3 =  new JTextField();
        textField3.setBounds(320, 450, 380, 50);
        textField3.setFont(new Font("title", Font.PLAIN, 30));
        englishTransferPanel.add(textField3);

        englishEnter4.addActionListener(this);
        englishEnter4.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
        englishEnter4.setBackground(new Color(245, 231, 181));
        englishEnter4.setBounds(385, 550, 250, 70);
        englishTransferPanel.add(englishEnter4);
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == english) {
            this.remove(languagePanel);
            englishPasswordPanel.add(logo);
            this.add(englishPasswordPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persian) {
            this.remove(languagePanel);
            persianPasswordPanel.add(logo);
            this.add(persianPasswordPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persian1Back) {
            this.remove(persianPasswordPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == english1Back) {
            this.remove(englishPasswordPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persian2Back) {
            this.remove(persianMenuPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == english2Back) {
            this.remove(englishMenuPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persian3Back) {
            this.remove(persianChangePasswordPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == english3Back) {
            this.remove(englishChangePasswordPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persian4Back) {
            this.remove(persianLastPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == english4Back) {
            this.remove(englishLastPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persian5Back) {
            this.remove(persianBalancePanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == english5Back) {
            this.remove(englishBalancePanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persian6Back) {
            this.remove(persianDebitPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == english6Back) {
            this.remove(englishDebitPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persian7Back) {
            this.remove(persianTransferPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == english7Back) {
            this.remove(englishTransferPanel);
            languagePanel.add(logo);
            this.add(languagePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persianEnter) {
            this.remove(persianPasswordPanel);
            persianMenuPanel.add(logo);
            this.add(persianMenuPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == englishEnter) {
            this.remove(englishPasswordPanel);
            englishMenuPanel.add(logo);
            this.add(englishMenuPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persianEnter2) {
            this.remove(persianChangePasswordPanel);
            persianLastPanel.add(logo);
            this.add(persianLastPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == englishEnter2) {
            this.remove(englishChangePasswordPanel);
            englishLastPanel.add(logo);
            this.add(englishLastPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persianEnter3) {
            this.remove(persianDebitPanel);
            persianLastPanel.add(logo);
            this.add(persianLastPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == englishEnter3) {
            this.remove(englishDebitPanel);
            englishLastPanel.add(logo);
            this.add(englishLastPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persianEnter4) {
            this.remove(persianTransferPanel);
            persianLastPanel.add(logo);
            this.add(persianLastPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == englishEnter4) {
            this.remove(englishTransferPanel);
            englishLastPanel.add(logo);
            this.add(englishLastPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persianButton1) {
            this.remove(persianMenuPanel);
            persianChangePasswordPanel.add(logo);
            this.add(persianChangePasswordPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == englishButton1) {
            this.remove(englishMenuPanel);
            englishChangePasswordPanel.add(logo);
            this.add(englishChangePasswordPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persianButton2) {
            this.remove(persianMenuPanel);
            persianDebitPanel.add(logo);
            this.add(persianDebitPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == englishButton2) {
            this.remove(englishMenuPanel);
            englishDebitPanel.add(logo);
            this.add(englishDebitPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persianButton3) {
            this.remove(persianMenuPanel);
            persianTransferPanel.add(logo);
            this.add(persianTransferPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == englishButton3) {
            this.remove(englishMenuPanel);
            englishTransferPanel.add(logo);
            this.add(englishTransferPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == persianButton4) {
            this.remove(persianMenuPanel);
            persianBalancePanel.add(logo);
            this.add(persianBalancePanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == englishButton4) {
            this.remove(englishMenuPanel);
            englishBalancePanel.add(logo);
            this.add(englishBalancePanel);
            this.revalidate();
            this.repaint();
        }
    }
}
