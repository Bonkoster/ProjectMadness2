package Beans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "Cinema")
public class CinemaBean {
	
	private String urler = "http://www.youtube.com/v/H1aubPfepmg";
	
	private long pas = 0;
	
	private ArrayList<Episode> episodes = new ArrayList<>();
	
	@PostConstruct
	public void someEps(){
		episodes.add(new Episode("Episode 1", "https://www.youtube.com/v/H1aubPfepmg"));
		episodes.add(new Episode("Episode 2", "https://www.youtube.com/v/K9F7FKcz80k"));
		episodes.add(new Episode("Episode 3", "https://www.youtube.com/v/2cNVaHVP6p8"));
		episodes.add(new Episode("Episode 4", "https://www.youtube.com/v/rbitqTpQb78"));
		episodes.add(new Episode("Episode 5", "https://www.youtube.com/v/hkYRmCKMCLo"));
		episodes.add(new Episode("Episode 5.5", "https://www.youtube.com/v/YxPy2heneos"));
		episodes.add(new Episode("Episode 6", "https://www.youtube.com/v/EmukNTK7OGY"));
		episodes.add(new Episode("Episode 6.5", "https://www.youtube.com/v/2M_x_o8IY7c"));
		episodes.add(new Episode("Episode 7", "https://www.youtube.com/v/pC9u4IYEZGM"));
		episodes.add(new Episode("Episode 7.5", "https://www.youtube.com/v/mTW8HwKMzEw"));
		episodes.add(new Episode("Episode 8", "https://www.youtube.com/v/qBCefsFoG5E"));
		episodes.add(new Episode("Episode 9", "https://www.youtube.com/v/kaH2Zh_GCFM"));
		episodes.add(new Episode("Episode 10", "https://www.youtube.com/v/beFUMWxyoHg"));
	}	
	
	public String getUrler() {
		return urler;
	}

	public ArrayList<Episode> getEpisodes() {
		return episodes;
	}

	public void uiEpisode(int num){
		urler = episodes.get(num).Link;
	}


	public class Episode {

		private String Name;
		private String Link;
		
		public Episode(String name,String link){
			Name = name;
			Link = link;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return Name;
		}

		/**
		 * @return the link
		 */
		public String getLink() {
			return Link;
		}
		
	}
}
