package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled  = in.nextBoolean(); 
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();

		
		double x1 = parameterOne;
		double y1 = parameterTwo;
		double x2 = parameterThree;
		double y2 = parameterFour;

		
		if(shapeType.equals( "rectangle")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if(isFilled) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}	
			else {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		if(shapeType.equals( "ellipse")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if(isFilled) {
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}	
			else {
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		else {
			double parameterFive = in.nextDouble();
			double parameterSix = in.nextDouble();
			double x3 = parameterFive;
			double y3 = parameterSix;
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			double[] x = {x1, x2, x3};
			double[] y = {y1, y2, y3};
			if(isFilled) {
				StdDraw.filledPolygon(x,y);
				
			}	
			else {
				StdDraw.polygon(x,y);
			}
		}
	}
}
