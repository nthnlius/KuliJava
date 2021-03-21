class Player extends PlayerBase{
  private String name;
  private boolean inTurn = false;
  
  //constructor
  public Player(String name, ArrayList<Card> cards){
    super(cards);
    this.name = name;
  }

  //Public methods for declare HIJI
  public void declaerHiji(){
    int cardsCount = super.getCardsLeft();
    if((this.inTurn == true) && cardsCount==1){
      System.out.printf("%d mendeklarasikan HIJI!\n", this.name);
    }
  }

  public void setInTurn(boolean b){
    this.inTurn = b;
  }

  public boolean isInTurn(){
    return this.inTurn;
  }
}