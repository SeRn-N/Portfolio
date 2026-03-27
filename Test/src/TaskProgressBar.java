/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apimookweerakunwattana
 */
import java.awt.*;
import javax.swing.*;

public class TaskProgressBar {
    public JFrame fr;
    public JPanel toppn,ptask,pur,phi,pmid,plo;
    public JLabel task,ur,hi,mid,lo;
    public JLabel nur,nhi,nmid,nlo;
    public JProgressBar pbur,pbhi,pbmid,pblo;
    public Priority priority;
    public TaskProgressBar(){
        fr = new JFrame();
        
    private JProgressBar createBar(int value, Color color) {
        JProgressBar bar = new JProgressBar(0, 100);
        bar.setValue(value);

        bar.setUI(new javax.swing.plaf.basic.BasicProgressBarUI());

        bar.setForeground(color);
        bar.setBorderPainted(false);
        bar.setPreferredSize(new Dimension(300, 8));

        return bar;
}
    public static void main(String[] args) {
        new TaskProgressBar();
    }
}
