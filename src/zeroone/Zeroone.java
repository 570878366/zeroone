package zeroone;
import java.awt.*;
import javax.swing.*;

public class Zeroone extends JFrame {
    public Zeroone() {
        setSize(600,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        //黑色的头部底色
        g.fillOval(110,100,80,100);
        //黄色的头体
        g.setColor(Color.YELLOW);
        g.fillOval(120,110,60,80);
        //触须
        g.drawLine(150,150,100,50);
        g.drawLine(150,150,200,50);
        //眼睛
        g.setColor(Color.RED);
        g.fillOval(120,140,30,30);
        g.fillOval(150,140,30,30);
        //黑色的身体底色
        g.setColor(Color.BLACK);
        g.fill3DRect(79,195,140,200,true);
        //两个肩甲
        g.fillArc(70,185,70,70,80,90);
        g.fillArc(157,185,70,70,10,100);
        //黄色的胸甲
        g.setColor(Color.YELLOW);
        Polygon pg1=new Polygon();//左上角的胸甲
        pg1.addPoint(200,198);
        pg1.addPoint(153,200);
        pg1.addPoint(153,250);
        pg1.addPoint(191,270);
        g.fillPolygon(pg1);
        Polygon pg2=new Polygon();//右上角的胸甲
        pg2.addPoint(100,198);
        pg2.addPoint(147,200);
        pg2.addPoint(147,250);
        pg2.addPoint(109,270);
        g.fillPolygon(pg2);
        Polygon pg3=new Polygon();//底部的胸甲
        pg3.addPoint(150,260);
        pg3.addPoint(108,280);
        pg3.addPoint(140,290);
        pg3.addPoint(140,310);
        pg3.addPoint(160,310);
        pg3.addPoint(160,290);
        pg3.addPoint(190,280);
        g.fillPolygon(pg3);
        //腰带
        g.setColor(Color.BLACK);
        g.fillRect(70,320,160,30);
        //腰带上的修饰
        g.setColor(Color.YELLOW);
        g.fillOval(130,315,40,40);
        g.setColor(Color.WHITE);
        g.fillOval(135,320,30,30);
        //右边的箭头
        Polygon pg4=new Polygon();
        pg4.addPoint(170,320);
        pg4.addPoint(190,335);
        pg4.addPoint(170,350);
        pg4.addPoint(225,335);
        g.fillPolygon(pg4);
        g.setColor(Color.YELLOW);
        g.drawArc(90,320,30,30,90,-270);
        //腿部底色
        g.setColor(Color.BLACK);
        Polygon pg5=new Polygon();
        pg5.addPoint(79,379);
        pg5.addPoint(49,529);
        pg5.addPoint(79,529);
        pg5.addPoint(150,379);
        pg5.addPoint(219,529);
        pg5.addPoint(249,529);
        pg5.addPoint(219,379);
        g.fillPolygon(pg5);
        //腿甲
        g.setColor(Color.YELLOW);
        Polygon pg6=new Polygon();
        pg6.addPoint(79,350);
        pg6.addPoint(79,395);
        pg6.addPoint(69,445);
        pg6.addPoint(109,445);
        g.fillPolygon(pg6);
        Polygon pg7=new Polygon();
        pg7.addPoint(219,350);
        pg7.addPoint(219,395);
        pg7.addPoint(229,445);
        pg7.addPoint(189,445);
        g.fillPolygon(pg7);
        Polygon pg8=new Polygon();
        pg8.addPoint(59,495);
        pg8.addPoint(49,529);
        pg8.addPoint(79,529);
        g.fillPolygon(pg8);
        Polygon pg9=new Polygon();
        pg9.addPoint(239,499);
        pg9.addPoint(249,529);
        pg9.addPoint(219,529);
        g.fillPolygon(pg9);
        //脚
        g.fillRect(39,529,40,20);
        g.fillRect(219,529,40,20);
        g.setColor(Color.BLACK);
        //手部
        Polygon pg10=new Polygon();
        pg10.addPoint(80,195);
        pg10.addPoint(70,250);
        pg10.addPoint(169,230);
        pg10.addPoint(169,210);
        pg10.addPoint(85,200);
        g.fillPolygon(pg10);
        Polygon pg11=new Polygon();
        pg11.addPoint(200,200);
        pg11.addPoint(140,260);
        pg11.addPoint(160,280);
        pg11.addPoint(200,240);
        g.fillPolygon(pg11);
    }

    public static void main(String[] args) {
        Zeroone one = new Zeroone();
    }
}
