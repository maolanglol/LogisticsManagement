package wuliu.com.Action;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import com.opensymphony.xwork2.ActionContext;

public class VerificationCode extends baseAction{
	private ByteArrayInputStream inputStream;
	private String MSG;
	
	public ByteArrayInputStream getInputStream()
	{
		return inputStream;
	}
	public void setInputStream(ByteArrayInputStream inputStream)
	{
		this.inputStream = inputStream;
	}

	public String getMSG() {
		return MSG;
	}
	public void setMSG(String mSG) {
		MSG = mSG;
	}
	
	public String getVerificationCode() throws Exception
	{
		int width = 65, height = 20;//图片的长度、宽度
		BufferedImage image = new  BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);//实例化图片流
		Graphics g = image.getGraphics();//根据图片流创建画笔
		Random random = new Random();//实例化一个随机对象
		g.setColor(getRandColor(200, 255));//设置画笔随机颜色
		g.fillRect(0, 0, width, height);//使用画笔填充图片（随机背景颜色）
		
		g.setFont(new Font("Times New Roman", Font.PLAIN, 18));//设置画笔的字体
		g.setColor(getRandColor(160, 200));//设置随机颜色
		for(int i = 0; i < 155; i++)//for循环随机描绘155根线条
		{
			int x1 = random.nextInt(width);
			int y1 = random.nextInt(height);
			int x2 = random.nextInt(12);
			int y2 = random.nextInt(12);
			g.drawLine(x1, y1, x2, y2);//画笔描绘线条
		}
		
		String sRand = "";
		for(int i = 0; i < 4; i++)
		{
			String rand = getRandomChar();
			sRand += rand;
			g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
			g.drawString(rand, 13*i+6, 16);
		}
		ActionContext.getContext().getSession().put("randomImg", sRand.toLowerCase());//存进session,用于验证
		g.dispose();
		ByteArrayOutputStream output = new ByteArrayOutputStream();//实例化一个二进制输出流
		ImageOutputStream imageOut = ImageIO.createImageOutputStream(output);//实例化一个图片输出流
		ImageIO.write(image, "JPEG", imageOut);
		imageOut.close();
		ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());//实例化一个二进制输入流
		this.setInputStream(input);
		return SUCCESS;
		
	}
	
	public String validateVerificationCode(){
		String str = ActionContext.getContext().getSession().get("randomImg").toString();
		if(this.getRequest().getParameter("vCode").toString().toLowerCase().trim().equals(str)){
			this.setMSG("true");
		}
		else{
			this.setMSG("false");
		}
		return SUCCESS;
	}
	
	private Color getRandColor(int fc, int bc)
	{
		Random random = new Random();
		if(fc > 255) fc = 255;
		if(bc > 255) bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
	private static String getRandomChar()
    {
		  int rand = (int)Math.round(Math.random() * 2);
		  long itmp = 0;
		  char ctmp = '\u0000';
		  switch (rand)
		  {
			   case 1:
				    itmp = Math.round(Math.random() * 25 + 65);
				    ctmp = (char)itmp;
				    return String.valueOf(ctmp);
			   case 2:
				    itmp = Math.round(Math.random() * 25 + 97);
				    ctmp = (char)itmp;
				    return String.valueOf(ctmp);
			   default :
				    itmp = Math.round(Math.random() * 9);
			    
		  }
		  return String.valueOf(itmp);
    }
}
