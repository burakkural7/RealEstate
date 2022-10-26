
public class Location {
	private String city;
	private String district;
	private String neighbourhood;
	public Location() {
		super();
	}
	public Location(String city, String district, String neighbourhood) {
		super();
		this.city = city;
		this.district = district;
		this.neighbourhood = neighbourhood;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getNeighbourhood() {
		return neighbourhood;
	}
	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

}
