String[] addBorder(String[] picture) {
  String[] framed  = new String [picture.length+2];
  for (int i=0; i<picture.length; i++) 
    framed[i+1] = "*"+picture[i]+"*";
  
  framed[0] = framed[1].replaceAll(".", "*");
  framed[framed.length-1] = framed[1].replaceAll(".", "*");
    
  return framed;
}
