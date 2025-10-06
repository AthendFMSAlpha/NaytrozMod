package content;

import arc.graphics.Color;
import mindustry.type.Item;

public class NayItem {
    public static Item
            quartiz;
    public static void load() {
        quartiz = new Item("quartiz", Color.valueOf("DDDDDD")){{
            explosiveness = 0; // 爆炸性（如爆炸混合物 = 1.2f）
            flammability = 0; // 易燃性（如硫化物 = 1.4f）
            radioactivity = 0; // 放射性（如钍 = 1f）
            charge = 0; // 导电性（如巨浪合金 = 0.75f）
            hardness = 5; // 挖掘硬度（0废/1铜/2煤/3钛/4钍/5钨）
            cost = 1.5f; // 延长建造
            healthScaling = 0; // 增加血量
        }};
    }
}
