public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rateKr = 0.067574;

    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public String getTitle(){
        return this.title;
    }

    public String getLiteratureType(){
        return this.literatureType;

    }

    // This method calculates libraryMoney based on points and rate in kr.
    public double calculateRoyalty(){
        double points1 = calculatePoints();
        double points2 = calculateLiteraturePoints(points1);
        return rateKr*points2;
    }

    // this method calculates points based on the number of copies for one title
    abstract double calculatePoints(); // double

    // this method calculates total points for one title based on the different
    // literature types times the result from calculatePoints
    abstract double calculateLiteraturePoints(double points);

}
