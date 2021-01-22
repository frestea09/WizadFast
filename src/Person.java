import java.util.ArrayList;

public class Person {
    private int ageDeath;
    private int yearDeath;
    private int ageDeathB;
    private int yearDeathB;
    private int peopleKilled;
    private int peopleKilledB;
    private int average;
    private ArrayList<Integer> listPeopleKilled = new ArrayList<Integer>();
    private ArrayList<Integer> listYear = new ArrayList<Integer>();

    public int getAgeDeath() {
        return ageDeath;
    }

    public void setAgeDeath(int ageDeath) {
        this.ageDeath = ageDeath;
    }

    public int getYearDeath() {
        return yearDeath;
    }

    public void setYearDeath(int yearDeath) {
        this.yearDeath = yearDeath;
    }

    public int getAverage() {
        Integer sum = 0;
        if(!this.listPeopleKilled.isEmpty()) {
            for (Integer mark : this.listPeopleKilled) {
                sum += mark;
            }
            return sum/ this.listPeopleKilled.size();
        }
        return sum;
    }

    public int getAgeDeathB() {
        return ageDeathB;
    }

    public void setAgeDeathB(int ageDeathB) {
        this.ageDeathB = ageDeathB;
    }

    public int getYearDeathB() {
        return yearDeathB;
    }

    public void setYearDeathB(int yearDeathB) {
        this.yearDeathB = yearDeathB;
    }

    public int getPeopleKilled() {
        this.peopleKilled = this.yearDeath - this.ageDeath;
        this.listPeopleKilled.add(peopleKilled);
        return peopleKilled;
    }
    public int getPeopleKilledB() {
        this.peopleKilledB = this.yearDeathB - this.ageDeathB;
        return peopleKilledB;
    }
    public void generateYear(int inputPeopleKilled, int inputPeopleKilledB){
        int threshold = inputPeopleKilled;
        if(inputPeopleKilled<inputPeopleKilledB){
            threshold = inputPeopleKilledB;
        }
        int item=1;
        for (int i=0;i<=threshold;i++)
        {
            item=item+i;
            this.listYear.add(item);
        }
    }
    public int getNumberKilledYear(){

        int index = this.getPeopleKilled() - 1;

        int  bornYear = this.listYear.get(index);
        return bornYear;
    }
    public int getNumberKilledYearB(){

        int index = this.getPeopleKilledB() - 1;

        int  bornYear = this.listYear.get(index);
        return bornYear;
    }
    public double getAverageDumpMethod(){
        int index = this.getPeopleKilled() - 1;
        int indexB = this.getPeopleKilledB() - 1;
        double  bornYear = this.listYear.get(index);
        double bornYearB = this.listYear.get(indexB);
        double hasil = (bornYearB+bornYear)/2;
        return hasil;
    }
}
