package Beans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "Gallery")
public class GalleryBean {
	
	private String a1 = "auditor/AA.png";
	private String a2 = "auditor/hqdefault.jpg";
	private String a3 = "auditor/i.jpg";
	private String a4 = "auditor/image (1).jpg";
	
	private String h1 = "hank/hank_by_deathbattledino-da35dcv.jpg";
	private String h2 = "hank/i (1).jpg";
	private String h3 = "hank/i.jpg";
	private String h4 = "hank/image (1).jpg";
	private String h5 = "hank/image (2).jpg";
	private String h6 = "hank/image.jpg";
	
	private String j1 = "jesus/12e.jpg";
	private String j2 = "jesus/293.jpg";
	private String j3 = "jesus/412.jpeg";
	private String j4 = "jesus/Episode_1.5_Intro.png";
	private String j5 = "jesus/Jesus07.png";
	
	private String t1 = "tricky/149013841_Tricky_Madness_Combat_Pump.jpg";
	private String t2 = "tricky/i (2).jpg";
	private String t3 = "tricky/image (1).jpg";
	private String t4 = "tricky/image.jpg";
	private String t5 = "tricky/ngbbs4a8a21420b17f.jpg";
	private String t6 = "tricky/seenya_one-hell-of-a-clown.jpg";
	
	ArrayList<String> num = new ArrayList<>();
	
	
	
	public void HankGallery(){
		num.clear();
		
		num.add(h1);
		num.add(h2);
		num.add(h3);
		num.add(h4);
		num.add(h5);
		num.add(h6);
		
	}
	
	public void JesusGallery(){
		num.clear();
		
		num.add(j1);
		num.add(j2);
		num.add(j3);
		num.add(j4);
		num.add(j5);
		
	}
	
	public void TrickyGallery(){	
		num.clear();
		
		num.add(t1);
		num.add(t2);
		num.add(t3);
		num.add(t4);
		num.add(t5);
		num.add(t6);
		
	}
	
	public void AuditorGallery(){
		num.clear();
		
		num.add(a1);
		num.add(a2);
		num.add(a3);
		num.add(a4);
		
	}

	public ArrayList<String> getNum() {
		return num;
	}

	public void setNum(ArrayList<String> num) {
		this.num = num;
	}
}
