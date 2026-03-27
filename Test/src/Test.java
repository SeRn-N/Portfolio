import java.awt.*;
import javax.swing.*;

public class Test {
    public JFrame fr;
    public JPanel toppn, ptask, pur, phi, pmid, plo;
    public JLabel task, ur, hi, mid, lo;
    public JLabel nur, nhi, nmid, nlo;
    public JProgressBar pbur, pbhi, pbmid, pblo;

    public Test() {
        fr = new JFrame();

        toppn = new JPanel(new GridLayout(5,1,10,10));
        toppn.setBackground(new Color(15, 27, 45));
        toppn.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        ptask = new JPanel(new BorderLayout());
        pur = new JPanel(new BorderLayout());
        phi = new JPanel(new BorderLayout());
        pmid = new JPanel(new BorderLayout());
        plo = new JPanel(new BorderLayout());

        // Make panels transparent
        ptask.setOpaque(false);
        pur.setOpaque(false);
        phi.setOpaque(false);
        pmid.setOpaque(false);
        plo.setOpaque(false);

        // Labels
        task = new JLabel("Task Priorities");
        task.setForeground(Color.WHITE);
        task.setFont(new Font("Arial", Font.BOLD, 18));

        ur = new JLabel("Urgent / Critical");
        hi = new JLabel("High Priority");
        mid = new JLabel("Medium");
        lo = new JLabel("Low Priority");

        JLabel[] labels = {ur, hi, mid, lo};
        for (JLabel l : labels) {
            l.setForeground(Color.WHITE);
        }

        // Percent labels
        nur = new JLabel("18%");
        nhi = new JLabel("32%");
        nmid = new JLabel("41%");
        nlo = new JLabel("9%");

        JLabel[] nums = {nur, nhi, nmid, nlo};
        for (JLabel l : nums) {
            l.setForeground(Color.WHITE);
        }

        // Progress bars
        pbur = createBar(18, new Color(255, 77, 79));
        pbhi = createBar(32, new Color(250, 140, 22));
        pbmid = createBar(41, new Color(24, 144, 255));
        pblo = createBar(9, new Color(140, 140, 140));

        // Layout
        ptask.add(task, BorderLayout.WEST);

        pur.add(ur, BorderLayout.WEST);
        pur.add(nur, BorderLayout.EAST);
        pur.add(pbur, BorderLayout.SOUTH);

        phi.add(hi, BorderLayout.WEST);
        phi.add(nhi, BorderLayout.EAST);
        phi.add(pbhi, BorderLayout.SOUTH);

        pmid.add(mid, BorderLayout.WEST);
        pmid.add(nmid, BorderLayout.EAST);
        pmid.add(pbmid, BorderLayout.SOUTH);

        plo.add(lo, BorderLayout.WEST);
        plo.add(nlo, BorderLayout.EAST);
        plo.add(pblo, BorderLayout.SOUTH);

        toppn.add(ptask);
        toppn.add(pur);
        toppn.add(phi);
        toppn.add(pmid);
        toppn.add(plo);

        fr.add(toppn);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setSize(400, 300);
        fr.setVisible(true);
    }

    // Helper method for styling progress bars
    private JProgressBar createBar(int value, Color color) {
        JProgressBar bar = new JProgressBar(0, 100);
        bar.setValue(value);
        bar.setForeground(color);
        bar.setBackground(new Color(40, 50, 70));
        bar.setBorderPainted(false);
        bar.setPreferredSize(new Dimension(300, 8));
        return bar;
    }

    public static void main(String[] args) {
        new Test();
    }
}