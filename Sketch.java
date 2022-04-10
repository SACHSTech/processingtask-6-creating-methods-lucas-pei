import processing.core.PApplet;
/**
 * Description: A program that draws a house using methods with parameters and return values
 * @author: L. Pei
 */
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    // draw sky
    drawSky(0, 275, 173, 216, 230);

    // draw house
    drawHouse(60, 150, 125, 168, 96, 50);

    // draw windows
    drawWindows(255, 255, 255, 92 ,185, 30);
    
    // draw door
    drawDoor(145, 61, 7, 110, 220, 25, 55, 107, 67, 33);
  }

  /**
   * Draws the sky
   * 
   * @param fltSkyX: Starting x coordinate sky
   * @param fltSkyHeight: Height of the sky
   * @param fltSkyR: Starting x coordinate of window 1
   * @param fltSkyG: Starting y coordinate of window 1
   * @param fltSkyB: Size of the rectangular body of window
   * 
   */
  public void drawSky(float fltSkyX, float fltSkyHeight, float fltSkyR, float fltSkyG, float fltSkyB) {
    noStroke();
    
    // draw sky
    fill(fltSkyR, fltSkyG, fltSkyB);
    rect(fltSkyX, height - height, width, fltSkyHeight);
  }

  /**
   * Draws the body of house and the roof
   * 
   * @param fltHouseX: Starting x coordinate of house 
   * @param fltHouseY: Starting y coordinate of house 
   * @param fltHouseSize: Size of the square body of house 
   * @param fltHouseR: Red colour value for the RGB colour of house 
   * @param fltHouseG: Green colour value for the RGB colour of house
   * @param fltHouseB: Blue colour value for the RGB colour of house 
   * 
   */
  public void drawHouse(float fltHouseX, float fltHouseY, float fltHouseSize, float fltHouseR, float fltHouseG, float fltHouseB) {
    stroke(0, 0, 0);

    // draws rectangular body
    fill(fltHouseR, fltHouseG, fltHouseB);
    rect(fltHouseX, fltHouseY, fltHouseSize, fltHouseSize);

    // draws roof
    fill(fltHouseR, fltHouseG, fltHouseB);
    triangle(fltHouseX - 30, fltHouseY, fltHouseX + 62, fltHouseY - 58, fltHouseX + 155, fltHouseY);
  }
  
  /**
   * Draws windows
   * 
   * @param fltWindowR: Red colour value for the RGB colour of window
   * @param fltWindowG: Green colour value for the RGB colour of window
   * @param fltWindowB: Blue colour value for the RGB colour of window
   * @param fltWindowX: Starting x coordinate of window 1
   * @param fltWindowY: Starting y coordinate of window 1
   * @param fltWindowSize: Size of the rectangular body of window
   * 
   */
  public void drawWindows(float fltWindowR, float fltWindowG, float fltWindowB, float fltWindowX, float fltWindowY, float fltWindowSize) {
    // draws window 1
    fill(fltWindowR, fltWindowG, fltWindowB);
    ellipse(fltWindowX ,fltWindowY, fltWindowSize, fltWindowSize);

    // draws window 2
    fill(fltWindowR, fltWindowG, fltWindowB);
    ellipse(fltWindowX + 63 ,fltWindowY, fltWindowSize, fltWindowSize);
  }

  /**
   * Draws door
   * 
   * @param fltDoorR: Red colour value for the RGB colour of door
   * @param fltDoorG: Green colour value for the RGB colour of door
   * @param fltDoorB: Blue colour value for the RGB colour of door
   * @param fltDoorX: Starting x coordinate of door
   * @param fltDoorY: Starting y coordinate of door
   * @param fltDoorWidth: Width of  door
   * @param fltDoorHeight: Height of door
   * @param fltDoorknobR: Red colour value for the RGB colour of doorknob
   * @param fltDoorknobG: Green colour value for the RGB colour of doorknob
   * @param fltDoorknovB: Blue colour value for the RGB colour of doorknob
   * 
   */
  public void drawDoor(float fltDoorR, float fltDoorG, float fltDoorB, float fltDoorX, float fltDoorY,  float fltDoorWidth, float fltDoorHeight, float fltDoorknobR, float fltDoorknobG, float fltDoorknobB) {
    // draws door
    fill(fltDoorR, fltDoorG, fltDoorB);
    rect(fltDoorX, fltDoorY, fltDoorWidth, fltDoorHeight);

    // draws doorknob
    fill(fltDoorknobR, fltDoorknobG, fltDoorknobB);
    ellipse(fltDoorX + 20, fltDoorY + (fltDoorHeight/2), fltDoorWidth - 20, fltDoorHeight - 50);
  }
}