package entity;

public abstract class ServiceStaff extends Employees {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
