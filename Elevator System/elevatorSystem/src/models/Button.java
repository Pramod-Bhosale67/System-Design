package models;

public abstract class Button {
    private boolean status;

    public boolean status() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public abstract void press();
    public abstract boolean isPressed();
}
