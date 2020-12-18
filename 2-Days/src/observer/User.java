package observer;

public class User implements Customer {
	
	private News news;
	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	private String nameSurname;

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}
	

	public User(String nameSurname) {
		super();
		this.nameSurname = nameSurname;
	}

	@Override
	public void update() {
		System.out.println(nameSurname + " News Send ");
	}

	@Override
	public void customerCancel() {
		getNews().customerRemove(this);
		System.out.println(nameSurname + " News Remove ");
	}

	@Override
	public void customerEntry(News news) {
		
		setNews(news);
		getNews().customerAdd(this);
		System.out.println(nameSurname + " Customer Entry ");
		
	}

	
	
}
