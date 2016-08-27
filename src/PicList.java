import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PicList implements MouseListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ArrayList<JLabel> pictures = new ArrayList();

	private void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(pictures.get(0));
		frame.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	public void loadImages() {
		pictures.add(loadImageFromJavaProject("pic1.png"));
		pictures.add(loadImageFromJavaProject("pic2.png"));
		pictures.add(loadImageFromJavaProject("pic3.png"));
		pictures.add(loadImageFromJavaProject("pic4.png"));
	}

	public static void main(String[] args) {
		PicList picList = new PicList();picList.loadImages();picList.createUI();
		
	}

	private JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private JLabel loadImageFromJavaProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int r = new Random().nextInt(4);
		panel.removeAll();
		JLabel nextPic = pictures.get(r);
		System.out.println(r);
		panel.add(nextPic);
		frame.pack();
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}