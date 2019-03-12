boolean chessBoardCellColor(String cell1, String cell2) {
  return (cell1.matches("([ACEG][1357])|([BDFH][2468])") && 
        cell2.matches("([ACEG][1357])|([BDFH][2468])")) || 
        (cell1.matches("([ACEG][2468])|([BDFH][1357])") &&
        cell2.matches("([ACEG][2468])|([BDFH][1357])"));
}
