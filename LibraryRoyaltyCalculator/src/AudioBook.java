public class AudioBook extends Title {

    private int durationInMinutes;
    private double points;

  public  AudioBook(String title, String literatureType, int copies, int durationInMinutes)
  {
        super(title, literatureType, copies );
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    double calculatePoints()
    {
        return  points = copies*durationInMinutes*0.5;
    }

    @Override
    double calculateLiteraturePoints(double points){
        if(getLiteratureType().equals("BI") || getLiteratureType().equals("TE")){
            return points*1.5;
        }
        else if(getLiteratureType().equals("LYRIK")){
            return points*3;
        }
        else if(getLiteratureType().equals("SKØN")){
            return points*0.85;
        }
        else{ return points*0.5;}
    }
}


