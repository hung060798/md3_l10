package CustomerServlet;

public class Customer {
    String name;
    String date;
    String diaChi;
    String img;


    public Customer() {
    }

    public Customer(String name, String date, String diaChi, String img) {
        this.name = name;
        this.date = date;
        this.diaChi = diaChi;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
