class RadiusTooLarge extends Exception { // define RadiusTooLarge class
}
class RadiusIsNegative extends Exception { // define RadiusIsNegative class
}
class CCircle {
	private double radius;
	public void setRadius(double r) throws RadiusTooLarge, RadiusIsNegative {
		if(r>100) {
			throw new RadiusTooLarge(); // throw exception "RadiusTooLarge"
		}
		else if(r<0) {
			throw new RadiusIsNegative(); // throw exception "RadiusIsNegative"
		}
		else radius=r;
	}
	public void show() {
		System.out.println("area="+3.14*radius*radius);
	}
}
public class Java10 {
	public static void main(String args[]) {
		CCircle cir=new CCircle();
		try {
			cir.setRadius(-2.0);
		}
		catch(RadiusTooLarge e) {
			System.out.println(e+" throwed");
		}
		catch(RadiusIsNegative e) {
			System.out.println(e+" throwed");
		}
		cir.show();
	}
}