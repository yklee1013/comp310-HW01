package shape;
import java.util.HashSet;
import java.util.Set;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * A composite shape 
 */
public class CompositeShape extends AShape {

/**
 * <pre>
 *           1..1     0..*
 * CompositeShape ------------------------- AShape
 *           compositeShape        &gt;       aShape
 * </pre>
 */
private Set<AShape> aShape;

public Set<AShape> getAShape() {
   if (this.aShape == null) {
this.aShape = new HashSet<AShape>();
   }
   return this.aShape;
}

	private AShape shapeA;
	private AShape shapeB;

	/**
	 * Constructor
	 * @param location the location of the shape
	 * @param color the color of the shape
	 * @param shapeA the first AShape object
	 * @param shapeB the second AShape object
	 */
	public CompositeShape(Point location, Color color, AShape shapeA, AShape shapeB) {
		super(location, color);
		this.shapeA = shapeA;
		this.shapeB = shapeB;
	}

	/**
	 * Constructor
	 * @param shapeA the first AShape object
	 * @param shapeB the second AShape object
	 */
	public CompositeShape(AShape shapeA, AShape shapeB) {
		super(null, null);
		this.shapeA = shapeA;
		this.shapeB = shapeB;
	}

	@Override
	public void paint(Graphics g) {
		/**
		 * Paint each of the two AShape objects
		 */
		shapeA.paint(g);
		shapeB.paint(g);
	}
}
