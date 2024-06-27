package HamleysLaptopStore;

public class LaptopInfo {
	private String laptopId;
	private String modelName;
	private String brandName;
	private double cost;
	
	public LaptopInfo() {
		super();
	}
	
	public LaptopInfo(String laptopId, String modelName, String brandName, double cost) {
		super();
		this.laptopId = laptopId;
		this.modelName = modelName;
		this.brandName = brandName;
		this.cost = cost;
	}


	public String getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(String laptopId) {
		this.laptopId = laptopId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double calculateLaptopCost() {
		double lapCost = 0;
		if(cost>0) {
			switch(brandName.toUpperCase()) {
			case "APPLE":
				lapCost = cost -(cost * 0.05);
				break;
			case "DELL":
				lapCost = cost -(cost * 0.1);
				break;
			case "SAMSUNG":
				lapCost = cost -(cost * 0.15);
				break;
			case "LENOVO":
				lapCost = cost -(cost * 0.2);
				break;
			default:
				return -1;
			
			}
		}
		else {
			return -1;
		}
		
		return lapCost;
	}
	
}
