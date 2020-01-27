public class Printer {

    private int paper;
    private int toner;

    public Printer(){
        this.paper = 9;
        this.toner = 10;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public void addPaper(int pages){
        this.paper += pages;
    }

    public void addToner(int toner){
        this.toner += toner;
    }

    public String print(int pages, int copies){
        int totalPages = (pages * copies);
        if (totalPages > this.paper && totalPages > this.toner){
            return ("There is not enough paper and toner.");
        }
        else if (totalPages > this.paper){
            return ("There is not enough paper.");
        }
        else if (totalPages > this.toner){
            return ("There is not enough toner.");
        }
        else {
            this.paper -= totalPages;
            this.toner -= totalPages;
            return ("Printing complete.");
        }
    }

    public String print2(int pages, int copies){
        int totalPages = (pages * copies);
        while (this.paper != 0 && this.toner != 0 && totalPages != 0){
            this.paper -= 1;
            this.toner -= 1;
            totalPages -= 1;
        }
        if (this.paper == 0 && this.toner == 0){
            return "There is not enough paper and toner.";
        }
        else if (this.paper == 0){
            return "There is not enough paper.";
        }
        else if (this.toner == 0){
            return "There is not enough toner.";
        }
        else {
            return "Printing complete.";
        }

    }
}
