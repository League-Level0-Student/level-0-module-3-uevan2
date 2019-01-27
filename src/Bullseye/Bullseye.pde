
  void setup(){
  
    size(1000, 1000);
  
    noFill();
  
  }

  void draw(){
     
      for(int x = 800; x>0; x=x-2){
      
        ellipse(500, 500, x, x);
    
        fill(220, 10, 10);
        ellipse(500, 500, x-1, x-1);
    
        fill(255, 255, 255);
  
    }
}