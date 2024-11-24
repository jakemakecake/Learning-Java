package java102;

	public class Point {
		public final double x;
		public final double y;
	
		// Constructor
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
	
	


	


