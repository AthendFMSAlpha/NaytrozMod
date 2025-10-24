package Naytrozation.world.consumers;
// 此文件内容包含：纳英性物品需求筛选
import Naytrozation.type.NaytItem;
import mindustry.type.Item;
import mindustry.world.consumers.ConsumeItemEfficiency;

public class ConsumeItemNaytrozable extends ConsumeItemEfficiency {
    public float minNaytrozity; // 默认值为0

    public ConsumeItemNaytrozable() {
        this(0.2f); // 调用带参数的构造函数，使用默认值0.2f
    }

    public ConsumeItemNaytrozable(float minNaytrozity) {
        this.minNaytrozity = minNaytrozity;
        filter = item -> item instanceof NaytItem && ((NaytItem)item).naytrozity >= this.minNaytrozity;
    }

    @Override
    public float itemEfficiencyMultiplier(Item item) {
        if (item instanceof NaytItem) {
            return ((NaytItem)item).naytrozity;
        }
        return 0;
    }
}