class Card{
    private String numarCard;
    private double soldCard;

    public Card(String numarCard, double soldCard){
        this.numarCard = numarCard;
        this.soldCard = soldCard;
    }

    public boolean equals(Object obj){
        if(obj instanceof Card){
            Card otherCard = (Card) obj;

            return this.numarCard.equals(otherCard.numarCard);
        }
    }
}