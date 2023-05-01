package homework6;
public class Notebook {
    private String name;
    private int ram;
    private int storageCap;
    private String os;
    private String colour;
    private double diagonal;

    public Notebook (String name, int ram, int storageCap, String os, String colour, double diagonal){
        //this.id = counter++;
        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.colour = colour;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return String.format("Название: %s \n объем оперативной памяти: %d Гб \n объем накопителя %d Гб \n" +
                        " ОС %s \n Цвет %s \n Диагональ %.1f \n",
                this.name, this.ram, this.storageCap, this.os, this.colour, this.diagonal);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Notebook) {
            return this.name.equals(((Notebook) obj).name) && this.ram == ((Notebook) obj).ram
                    && this.storageCap == ((Notebook) obj).storageCap && this.os.equals(((Notebook) obj).os)
                    && this.colour.equals(((Notebook) obj).colour) && this.diagonal == ((Notebook) obj).diagonal;
        }
        return false;

    }

    public int getRam(){
        return this.ram;
    }
    public int getStorageCap(){
        return this.storageCap;
    }
    public String getOS(){
        return this.os;
    }
    public double getDiagonal(){
        return this.diagonal;
    }
}
