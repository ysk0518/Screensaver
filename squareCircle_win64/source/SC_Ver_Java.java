import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SC_Ver_Java extends PApplet {

float L=0;
float x=0;
float y=0;
float xr=60;
float xy=60;
float R=0;
float G=255;
float B=125;
float J1 = 0;
float J2 = 0;
float J3 = 0;
public void setup(){
  
  background(0);
  noCursor();
  x=width/2;
  y=height/2;
}

public void draw(){
  noFill();
  stroke(R,G,B);
  translate(x,y);
  rotate(L);
  rect(0,0,xr,xy);
  L+=0.35f;
  if (L>=6.3f){
    L=0;
    xr+=25;
    xy+=25;
  }
  if (J1==1){
    R-=1;
    if (R<=0){
      J1=0;
    }
  }  
  else if (J1==0){
    R+=1;
    if (R>=255){
      J1=1;
    }
  }
  if (J2==1){
    G-=1;
    if (G<=0){
      J2=0;
    }  
  }
  else if (J2==0){
    G+=1;
    if (G>=255){
      J2=1;
    }
  }
  if (J3==1){
    B-=1;
    if (B<=0){
      J3=0;
    }
  }
  else if (J3==0){
    B+=1;
    if (B>=255){
      J3=1;   
    }
  }
  noStroke();
  fill(0,3);
  rect(0,0,width,height);
  if (xr>=700){
    xr=30;
    xy=30;
  }
}

public void keyPressed(){
  exit();
}
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#9CF734", "--hide-stop", "SC_Ver_Java" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
