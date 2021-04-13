package NPCTypes;

import Items.Item;
import Items.ItemType;
import Items.Reward;

public class QuestGivers extends NPC implements NPCFunctionality.QuestGivers {

    public QuestGivers(Integer x, Integer y) {
        super("Person in danger", x, y);
    }


    @Override
    public Reward giveReward() {
        //After Collections will be modified to give random item from ItemType enum
        return new Reward(100, 200, new Item(ItemType.sword, 1));
    }
}
