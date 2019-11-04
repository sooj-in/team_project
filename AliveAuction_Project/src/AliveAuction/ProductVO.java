package AliveAuction;

public class ProductVO{

	private int pro_number;
	private String sort;
	private String id;
	private int buy_price;
	private String buy_time;
	private int start_price;
	private int lowest_price;
	private String endtime;
	private int span;
	private int gap;
	private String day;
	private String post_name;
	private String contents;
	private String link;
	private String state;
	
	public ProductVO(int pro_number, String sort, String id, int buy_price, String buy_time, int start_price, int lowest_price,
			 String endtime, int span, int gap, String day, String post_name, String contents, String link,
			String state) {
		
		this.sort = sort;
		this.id = id;
		this.buy_price = buy_price;
		this.buy_time = buy_time;
		this.start_price = start_price;
		this.lowest_price = lowest_price;
		this.endtime = endtime;
		this.span = span;
		this.gap = gap;
		this.day = day;
		this.post_name = post_name;
		this.contents = contents;
		this.link = link;
		this.state = state;
	}
		
	public int getPro_number() {
		return pro_number;
	}

	public void setPro_number(int pro_number) {
		this.pro_number = pro_number;
	}


	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBuy_price() {
		return buy_price;
	}

	public void setBuy_price(int buy_price) {
		this.buy_price = buy_price;
	}

	public String getBuy_time() {
		return buy_time;
	}

	public void setBuy_time(String buy_time) {
		this.buy_time = buy_time;
	}

	public int getStart_price() {
		return start_price;
	}

	public void setStart_price(int start_price) {
		this.start_price = start_price;
	}

	public int getLowest_price() {
		return lowest_price;
	}

	public void setLowest_price(int lowest_price) {
		this.lowest_price = lowest_price;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public int getSpan() {
		return span;
	}

	public void setSpan(int span) {
		this.span = span;
	}

	public int getGap() {
		return gap;
	}

	public void setGap(int gap) {
		this.gap = gap;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getPost_name() {
		return post_name;
	}

	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
