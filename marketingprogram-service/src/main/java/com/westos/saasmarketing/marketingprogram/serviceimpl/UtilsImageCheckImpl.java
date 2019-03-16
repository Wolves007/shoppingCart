package com.westos.saasmarketing.marketingprogram.serviceimpl;

import com.westos.saasmarketing.marketingprogram.service.UtilsImageCheck;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
@Service
public class UtilsImageCheckImpl implements UtilsImageCheck {

    public String captcha() {
        String []arr ={"+","-","*"};
        Random r = new Random();
        StringBuilder sb = new StringBuilder(10);
        int x =r.nextInt(10);
        sb.append(x);
        String s = arr[r.nextInt(arr.length)];
        sb.append(s);
        int y =r.nextInt(10);
        sb.append(y);
        sb.append("=?");

        return sb.toString();

    }

    public void outputimage(String str, OutputStream os) {
        //1.图片对象
        BufferedImage image = new BufferedImage(80, 30, BufferedImage.TYPE_INT_RGB);

        //2.获得画布对象
        Graphics g = image.getGraphics();

        //背景
        g.setColor(Color.GRAY);
        g.fillRect(0,0,80,30);

        //作画
        g.setColor(Color.BLACK);
        g.setFont(new Font("宋体",Font.PLAIN,20));
        g.drawString(str,22,20);
       /* g.drawLine(0,0,100,100);
        g.drawLine(0,50,50,100);
        g.drawLine(50,0,100,50);*/

        //输出结果
        try {
            ImageIO.write(image,"png",os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
