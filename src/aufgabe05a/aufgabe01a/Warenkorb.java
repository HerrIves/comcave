package aufgabe05a.aufgabe01a;

import java.util.List;

public class Warenkorb {
    private List<AbstractPosition> positionList;

    public Warenkorb(List<AbstractPosition> positionList) {
        this.positionList = positionList;
    }

    public void addPosition(Position position){
        positionList.add(position);
    }
    public void removePosition(Position position){
        positionList.remove(position);
    }


    public float getGesamtPreis(){
        float gesamtPreis = 0;
        for (AbstractPosition p: positionList             ) {
            gesamtPreis += p.getPrice()*p.getMwSt()*p.getAmount();
        }
        return gesamtPreis;
    }
}
