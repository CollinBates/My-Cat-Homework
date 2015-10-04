package catwork;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/**
 * Draws a cat with eyes, ears, whiskers and a mouth. It does not scale with the
 * frame.
 *
 * @author Collin Bates
 */
public class CatFace extends JComponent {

    /**
     *
     * @param g the graphics context
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //Anti Aliasing
        g2.addRenderingHints(new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON));

        //Translate the origin to 
        g2.translate(300, 300);

        //background
        g2.setColor(Color.GRAY);
        g2.fill(new Rectangle(-300, -300, 600, 600));

        //head
        Ellipse2D.Double head = new Ellipse2D.Double(-200, -200, 400, 400);
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(6));
        g2.draw(head);

        //Black of eyes
        Ellipse2D.Double eyeR = new Ellipse2D.Double(-100, -75, 40, 40);
        Ellipse2D.Double eyeL = new Ellipse2D.Double(60, -75, 40, 40);
        g2.fill(eyeR);
        g2.fill(eyeL);

        //Whites of eyes
        Ellipse2D.Double eyeRW = new Ellipse2D.Double(-95, -70, 30, 30);
        Ellipse2D.Double eyeLW = new Ellipse2D.Double(65, -70, 30, 30);
        g2.setColor(Color.WHITE);
        g2.fill(eyeRW);
        g2.fill(eyeLW);

        //blue of eyes
        Ellipse2D.Double eyeRB = new Ellipse2D.Double(-90, -65, 20, 20);
        Ellipse2D.Double eyeLB = new Ellipse2D.Double(70, -65, 20, 20);
        g2.setColor(Color.BLUE);
        g2.fill(eyeRB);
        g2.fill(eyeLB);



        //Left Ear
        Point2D.Double leftEarL1 = new Point2D.Double(-175, -100);
        Point2D.Double leftEarR1 = new Point2D.Double(-175, -250);
        Line2D.Double leftEar1 = new Line2D.Double(leftEarL1, leftEarR1);
        g2.setColor(Color.BLACK);
        g2.draw(leftEar1);

        Point2D.Double leftEarL2 = new Point2D.Double(-175, -250);
        Point2D.Double leftEarR2 = new Point2D.Double(-75, -190);
        Line2D.Double leftEar2 = new Line2D.Double(leftEarL2, leftEarR2);
        g2.draw(leftEar2);

        //Right Ear
        Point2D.Double rightEarL1 = new Point2D.Double(175, -100);
        Point2D.Double rightEarR1 = new Point2D.Double(175, -250);
        Line2D.Double rightEar1 = new Line2D.Double(rightEarL1, rightEarR1);
        g2.draw(rightEar1);

        Point2D.Double rightEarL2 = new Point2D.Double(175, -250);
        Point2D.Double rightEarR2 = new Point2D.Double(75, -190);
        Line2D.Double rightEar2 = new Line2D.Double(rightEarL2, rightEarR2);
        g2.draw(rightEar2);

        //center whiskers
        g2.setStroke(new BasicStroke(3));
        Point2D.Double leftCW1 = new Point2D.Double(100, 50);
        Point2D.Double rightCW1 = new Point2D.Double(250, 50);
        Line2D.Double rightCW = new Line2D.Double(leftCW1, rightCW1);
        g2.draw(rightCW);

        Point2D.Double leftCW2 = new Point2D.Double(-100, 50);
        Point2D.Double rightCW2 = new Point2D.Double(-250, 50);
        Line2D.Double leftCW = new Line2D.Double(leftCW2, rightCW2);
        g2.draw(leftCW);

        //Lower Whiskers
        Point2D.Double leftLW1 = new Point2D.Double(100, 60);
        Point2D.Double rightLW1 = new Point2D.Double(250, 90);
        Line2D.Double rightLW = new Line2D.Double(leftLW1, rightLW1);
        g2.draw(rightLW);

        Point2D.Double leftLW2 = new Point2D.Double(-100, 60);
        Point2D.Double rightLW2 = new Point2D.Double(-250, 90);
        Line2D.Double leftLW = new Line2D.Double(leftLW2, rightLW2);
        g2.draw(leftLW);

        //Upper Whiskers
        Point2D.Double leftUW1 = new Point2D.Double(100, 40);
        Point2D.Double rightUW1 = new Point2D.Double(250, 10);
        Line2D.Double rightUW = new Line2D.Double(leftUW1, rightUW1);
        g2.draw(rightUW);

        Point2D.Double leftUW2 = new Point2D.Double(-100, 40);
        Point2D.Double rightUW2 = new Point2D.Double(-250, 10);
        Line2D.Double leftUW = new Line2D.Double(leftUW2, rightUW2);
        g2.draw(leftUW);
        
        //mouth ellipses
        Ellipse2D.Double mouthL = new Ellipse2D.Double(-60, 35 , 60, 30);
        g2.draw(mouthL);
        
        Ellipse2D.Double mouthR = new Ellipse2D.Double(0, 35 , 60, 30);
        g2.draw(mouthR);
        
        //covers top of mouth ellipses to make it look like a mouth
        g2.setColor(Color.GRAY);
        g2.fill(new Rectangle(-65, 25, 135, 25));

    }
}
