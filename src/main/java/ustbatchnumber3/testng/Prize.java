package ustbatchnumber3.testng;

import java.util.ArrayList;

public class Prize {
	
	private String city;
	private int p_w_m1;
	private int p_wo_m1;
	public Prize(String city, int p_w_m1, int p_wo_m1) {
		super();
		this.city = city;
		this.p_w_m1 = p_w_m1;
		this.p_wo_m1 = p_wo_m1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getP_w_m1() {
		return p_w_m1;
	}
	public void setP_w_m1(int p_w_m1) {
		this.p_w_m1 = p_w_m1;
	}
	public int getP_wo_m1() {
		return p_wo_m1;
	}
	public void setP_wo_m1(int p_wo_m1) {
		this.p_wo_m1 = p_wo_m1;
	}
	@Override
	public String toString() {
		return "Prize [city=" + city + ", p_w_m1=" + p_w_m1 + ", p_wo_m1=" + p_wo_m1 + "]";
	}
	

}


