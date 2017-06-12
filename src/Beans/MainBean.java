package Beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "History")
public class MainBean {
	
	private String His = null;
	
	
	private String Hank = "Hank J. Wimbleton is the main protagonist of the Madness Combat series. Hank has played a capital role in almost every Madness Combat episode. The only episodes of the main series where he is not a protagonist are Madness Combat 8: Inundation, in which his corpse only appeared as a cameo in the foreground, Madness Combat 5.5, where he only appeared for less than a second, Madness Combat 6.5, and Madness Combat 7.5. In the latter two, he was only mentioned and did not appear at all. In the animations, Hank has died seven times (three times by Jesus, three times by Tricky, and once by suicide in order to finish off Jesus), and has been revived again, by an unknown medium known as the Higher Powers, and Tricky in Madness Combat 6. Overall, Hank has killed 605 people in the series, which is more than all the other main characters have combined, and amounts to around 48% of the series' total kills.";
	private String Jebus = "Jesus Christ, the Savior, also known as Jebus and affectionally Jeb by Krinkels, is a major character in the Madness Combat series. He serves as the main antagonist against Hank J. Wimbleton in the first five episodes of the series and as the protagonist in Madness Inundation, Incident: 110A, Incident: 111A and for a segment of Incident: 1000A. Jesus has been killed 5 times in the canon (3 times by Hank, once by Tricky, and for the last time during the upstart of the normality restoration). He has killed over 248 people in the series. Krinkels has said that Jesus went the way of the Sheriff, meaning that he won't return. \n\n Jesus is a boss enemy in the Story Mode of Madness Interactive. In Madness: Project Nexus, he is a mercenary in Arena Combat Mode. He is the playable character Dr. Christoff in the Story Mode.";
	private String Tricky = "Tricky the Clown is a recurring character in the Madness Combat series. He started out as an assassin hired by the Sheriff and later became the primary antagonist of the Tricky saga. Up until the end of Madness Combat 7: Consternation, Tricky used the power of the Improbability Drive in order to revive repeatedly, run and jump at extremely high speeds and gain superhuman hand-to-hand fighting skills which allowed him to render the mightiest of enemies helpless. He has been killed six times (5 times by Hank, and once by Jesus), has been resurrected as a zombie once after being pinned to the marshmallow by a streetsign and possesses the ability to warp the fabric of reality. Tricky has killed four different characters in the series.";
	private String Auditor = "The Auditor is the true and main antagonist in the Madness series, first seen in Madness Combat 7: Consternation, and known to be a very powerful entity, immune to most physical attacks. He does not have Tricky's objectives, which is to toy with Hank J. Wimbleton, whereas the Auditor wants him dead. It is likely that he is one of the Higher Powers mentioned by Krinkels.";
	private String ava = null;
	
	
	
	/**
	 * @return the ava
	 */
	public String getAva() {
		return ava;
	}
	/**
	 * @param ava the ava to set
	 */
	public void setAva(String ava) {
		this.ava = ava;
	}
	public String getHis() {
		return His;
	}
	public void setHis(String his) {
		His = his;
	}
	
	public void MakeHank(){
		addMakeStory(Hank);
		HankMessage();
		ava = TextBean.getHankAvatar();
	}
	
	public void MakeJebus(){
		addMakeStory(Jebus);
		JebusMessage();
		ava = TextBean.getJesusAvatar();
	}
	
	public void MakeTriky(){
		addMakeStory(Tricky);
		TrickyMessage();
		ava = TextBean.getTrickyAvatar();
	}
	
	public void MakeAuditor(){
		addMakeStory(Auditor);
		AuditorMessage();
		ava = TextBean.getAuditorAvatar();
	}
	
	public String addMakeStory(String a){
		return His = a;
	}
	
	public void addMessage(String summary,String detail){
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	public void HankMessage(){
		addMessage("Success", "Hank Information");
	}
	
	public void JebusMessage(){
		addMessage("Success", "Jebus Information");
	}
	
	public void TrickyMessage(){
		addMessage("Success", "Tricky Information");
	}
	
	public void AuditorMessage(){
		addMessage("Success", "Auditor Information");
	}
}
