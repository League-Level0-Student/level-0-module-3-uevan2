
int xPostionOne=600;

int xPostionTwo=1400;

void setup(){
  
    size(2000, 1000);
  
   
    
    background(100, 100, 100);
  }

  void draw(){
    
        if(xPostionOne==800) {
      background(random(0,50), random(0,255), random(0,255));
    }
    
        if(xPostionOne==1400) {
      background(random(0,50), random(0,255), random(0,255));
    }
    
        if(xPostionOne==1000) {
      background(random(0,50), random(0,255), random(0,255));
    }
    
        if(xPostionOne==1200) {
      background(random(0,50), random(0,255), random(0,255));
    }
    
    
    noFill();
    
        for(int x=500;x>0;x=x-8){
          
          noFill();
          
          ellipse(xPostionOne, 500, x, x);
          
        }
        
        for(int z=500;z>0;z=z-8)  {
         
          ellipse(xPostionTwo, 500, z, z);
           
        }
         
        if(xPostionOne>1400){
          
          xPostionOne=600;
          
          xPostionTwo=1400;
          
        }
        
        else  {
        
        xPostionOne=xPostionOne +1;
        
        xPostionTwo=xPostionTwo-1;
        
        }
}