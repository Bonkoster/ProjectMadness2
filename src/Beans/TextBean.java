package Beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean (name="Pictures")
public class TextBean {
	
	private static String HankAvatar = "Hank_basic.png";
	private static String JesusAvatar = "Jesus_Basic.png";
	private static String TrickyAvatar = "Tricky_1000a.png";
	private static String AuditorAvatar = "Auditor_basic.png";
	
	public static String getHankAvatar() {
		return HankAvatar;
	}
	public void setHankAvatar(String hankAvatar) {
		HankAvatar = hankAvatar;
	}
	public static String getJesusAvatar() {
		return JesusAvatar;
	}
	public void setJesusAvatar(String jesusAvatar) {
		JesusAvatar = jesusAvatar;
	}
	public static String getTrickyAvatar() {
		return TrickyAvatar;
	}
	public void setTrickyAvatar(String trickyAvatar) {
		TrickyAvatar = trickyAvatar;
	}
	public static String getAuditorAvatar() {
		return AuditorAvatar;
	}
	public void setAuditorAvatar(String auditorAvatar) {
		AuditorAvatar = auditorAvatar;
	}
	
	
}
