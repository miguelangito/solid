package eje3;

public class RobotWorker implements Worker {
    @Override
    public void work() {
        // Lógica para trabajar
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}