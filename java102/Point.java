package java102;

		public class Point {
			public final double x;
			public final double y;
		
			public Point(double x, double y) {
				this.x = x;
				this.y = y;
			}
				
				public Point translateX(double t) {
					return new Point(x + t, y);
				}
				
				public Point translateY(double t) {
					return new Point(x, y + t);
				}
			
				@Override
				public String toString() {
					return "(" + x + ", " + y + ")";
				}
			
//Distance
				public static double distance(Point p1, Point p2) {
					return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
				}
			
			 
			
// Practice Problem Angle
			public double angle() {
			double angleinrads = Math.atan2(y, x);
			double angleindegrees = Math.toDegrees(angleinrads);

	return angleindegrees;
			}
	// Practice Problem centerofMass
			public static Point centerOfMass(Point[] points){
				if (points.length == 0){
					return new Point (0, 0);
				}
				double sumX = 0;
				double sumY = 0;
	 
	 
				for (Point p : points) {
					sumX += p.x;
					sumY += p.y;
				}
		   
				double centerX = sumX / points.length;
				double centerY = sumY / points.length;
		   
				return new Point(centerX, centerY);
			}
		}
		
	
	


	


