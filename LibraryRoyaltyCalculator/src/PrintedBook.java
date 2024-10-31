public class PrintedBook extends Title {

    private int pages;
    private double points;

    public PrintedBook(String title, String literatureType, int copies, int pages){

        super(title, literatureType, copies);
        this.pages = pages;

    }
@Override
        double calculatePoints()
{
        return points = copies*pages;
    }

    @Override
        protected double calculateLiteraturePoints(double points){

        if(getLiteratureType().equals("BI") || getLiteratureType().equals("TE")){
            return points*3;
        }
        else if(getLiteratureType().equals("LYRIK")){
            return points*6;
        }
        else if(getLiteratureType().equals("SKØN")){
            return points*1.7;
        }
        else{ return points*1;}
    }
}
