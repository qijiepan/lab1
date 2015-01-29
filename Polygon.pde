
void polygon(float x, float y, float radius, int npoints) {
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


