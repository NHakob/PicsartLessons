package NPCTypes;

import Items.Item;

public class Shopkeepers extends NPC implements NPCFunctionality.Shopkeepers {

    public Shopkeepers(Integer x, Integer y) {
        super("Shopkeeper", x, y);
    }

    @Override
    public Item trade(Item requestedItem) {
        return null;
    }
}
