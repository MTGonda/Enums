public enum Topping {
    Mustard,
    Pickles,
    Bacon,
    Tomato,
    Cheddar;
    public double getPrice(){
        return switch (this){
            case Bacon -> 1.5;
            case Cheddar -> 1.5;
            default -> 0.0;
        };
    }
}
