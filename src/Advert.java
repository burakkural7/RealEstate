
public class Advert {
	private String özellik;
	private String name;
	private String advertDate;
	private String advertType;
	private String category;
	private String price;
	private String area;
	private String location;
	private String photo;
	private String estateAgent;
	private String isActive;
	public Advert() {
	
	}
	public Advert(String özellik, String name, String advertDate, String advertType, String category, String price,
			String area, String location, String photo, String estateAgent, String isActive) {
		super();
		this.özellik = özellik;
		this.name = name;
		this.advertDate = advertDate;
		this.advertType = advertType;
		this.category = category;
		this.price = price;
		this.area = area;
		this.location = location;
		this.photo = photo;
		this.estateAgent = estateAgent;
		this.isActive = isActive;
	}
	public String getÖzellik() {
		return özellik;
	}
	public void setÖzellik(String özellik) {
		this.özellik = özellik;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdvertDate() {
		return advertDate;
	}
	public void setAdvertDate(String advertDate) {
		this.advertDate = advertDate;
	}
	public String getAdvertType() {
		return advertType;
	}
	public void setAdvertType(String advertType) {
		this.advertType = advertType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEstateAgent() {
		return estateAgent;
	}
	public void setEstateAgent(String estateAgent) {
		this.estateAgent = estateAgent;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
