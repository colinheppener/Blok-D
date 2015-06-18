package projectdjava2.pkg0;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

/**
 *
 * @author Colin & Jeroen
 */
public final class Frame extends JFrame {

    private Vijand vijand;
    private final int HEIGHT = 950;
    private final int WIDTH = 950;
    private Timer timer;
    private int interval = 21;
    private JProgressBar timerBar;
    private JFrame frame = new JFrame();
    private Speelbord speelbord;

    public Frame() {
        createComponents();
    }

    private void createComponents() {
        JPanel controlPanel = new JPanel();
        JButton herstartKnop = new JButton("Herstart Level");
        JButton menuKnop = new JButton("Terug naar menu");
        JButton stopKnop = new JButton("sluit schermen");
        frame.setSize(HEIGHT, WIDTH);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        final JComponent component = new Speelbord(this);
        speelbord = (Speelbord) component;
        initialiseTimer();
        timerBar = new JProgressBar();
        timerBar.setMaximum(21);
        frame.add(component);
        frame.setResizable(true);
        component.setFocusable(true);
        frame.add(controlPanel, BorderLayout.EAST);
        GridLayout gridLayout = new GridLayout(20, 2);
        controlPanel.setLayout(gridLayout);
        controlPanel.add(herstartKnop);
        controlPanel.add(menuKnop);
        controlPanel.add(stopKnop);
        controlPanel.setVisible(true);
        controlPanel.add(timerBar);
        frame.setVisible(true);
        herstartKnop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                component.requestFocusInWindow();
                speelbord.HerstartLevel();
                speelbord.repaint();
                meerTijd(21);
            }
        });
        menuKnop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Menu menu = new Menu();
            }
        });
        stopKnop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void setVijand(Vijand vij) {
        vijand = vij;
    }

    private void initialiseTimer() {
        int delay = 10;
        int period = 1000;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                timerBar.setValue(setInterval());
            }
        }, delay, period);
    }

    public void meerTijd(int waarde) {
        timerBar.setValue(interval += waarde);
        if (interval > 21) {
            interval = 21;
        }
    }

    public void minderTijd(int waarde) {
        timerBar.setValue(interval -= waarde);
    }
    
    public void stopTimer()
    {
        timer.cancel();
    }
    
    public void startTimer()
    {
        initialiseTimer();
    }

    private int setInterval() {
        if (interval < 1) {
            timer.cancel();
            Object[] choices = {"Opnieuw proberen", "Naar menu"};
            Object defaultChoice = choices[0];
            int dialogResult = JOptionPane.showOptionDialog(this,
                    "Wilt u opnieuw het doolhof proberen of terug naar het menu?",
                    "Opnieuw proberen?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choices,
                    defaultChoice);                    
            if (dialogResult == JOptionPane.YES_OPTION) {
                frame.dispose();
                frame = new Frame();
            }
            if (dialogResult == JOptionPane.NO_OPTION) {
                frame.dispose();
                Menu menu = new Menu();
            }
        }
        if (vijand != null) {
            vijand.loop();
        }
        return --interval;
    }

    public int getCurrentTime() {
        return interval;
    }
    
    public void setTime(int waarde)
    {
        interval = waarde;
    }
    
    public boolean getOptionPaneCreated()
    {
        return optPaneCreated;
    }
}
