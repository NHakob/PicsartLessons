package NPCTypes;

public class NPC implements NPCFunctionality.NPC {
    protected Integer x;
    protected Integer y;
    protected String name;

    public NPC(String name, Integer x, Integer y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public void walk(Integer x, Integer y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void talk(String msg) {
        System.out.println(this.name + " say:\n\t" + msg);
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
