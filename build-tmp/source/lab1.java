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

public class lab1 extends PApplet {

public void setup() {
  size(640,640);
}

public void draw() {
  polygon(320,320,160,16);
}

public void polygon(float x, float y, float radius, int npoints) {
    float[] s;
    float[] t;
    char[] v={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
    t = new float[npoints];
    s = new float[npoints];
    float angle = TWO_PI / npoints;
    beginShape();
    for (float a = 0; a < TWO_PI; a += angle) {
      float sx = x + cos(a) * radius;
      float sy = y + sin(a) * radius;
      vertex(sx, sy);
    }
    endShape(CLOSE);
    int i = 0;
    float a = 0;
    while (i<npoints) {
      s[i]=x+cos(a)*radius;
      t[i]=y+sin(a)*radius;
      text(v[i], s[i], t[i]);
      i++;
      a+=angle;
    }
     
    for(int b =0; b <npoints; b++){
      if(mouseX<=s[b]+10&&mouseX>=s[b]-10&&mouseY<=t[b]+10&&mouseY>=t[b]-10){
        for(int c = 0; c<npoints; c++){
          line(s[b],t[b],s[c],t[c]);
        }
      }
    }    
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "lab1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
