package java102;

		public class Point {
			public final double x;
			public final double y;
		
			public Point(double x, double y) {
				this.x = x;
				this.y = y;
			}
			
// Practice Problem Angle
public double angle() {
	double angleinrads = Math.atan2(y, x);
	double angleindegrees = Math.toDegrees(angleinrads);
	return angleindegrees;
}
		}
		
	
	


	


