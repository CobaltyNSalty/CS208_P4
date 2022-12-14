/*  Christopher Peters - Wrote class in accordance with UML design,
    added Equals method.
 */

import javafx.scene.paint.Paint;

public abstract class NPC extends GameItem {
    private int speedX;
    private int speedY;
    private boolean canTeleport;

    public NPC() {
        super();
        this.speedX = 1;
        this.speedY = 1;
        this.canTeleport = false;
    }

    public NPC(double centerX, double centerY, double rad, Paint inColor, int ID) {
        // public GameItem(double startX, double startY, double rad, Paint inColor, int ID) {
        super(centerX, centerY, rad, inColor, ID);
        this.speedX = 1;
        this.speedY = 1;
        this.canTeleport = false;

    }

    public int getSpeedX() {
        return speedX;
    }
    public void setSpeedX(int speed) {
        this.speedX = speed;
    }
    public int getSpeedY() {
        return speedY;
    }
    public void setSpeedY(int speed) {
        this.speedY = speed;
    }
    public boolean getCanTeleport() {
        return canTeleport;
    }
    public void setCanTeleport(boolean canTeleport) {
        this.canTeleport = canTeleport;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(obj.getClass() == this.getClass()) {
            NPC npc = (NPC) obj;
            return ( (this.getNumID() == npc.getNumID()) && (this.getCanTeleport() == npc.getCanTeleport()) );
        }
        return false;
    }
}
