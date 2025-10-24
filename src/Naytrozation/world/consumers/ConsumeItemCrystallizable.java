package Naytrozation.world.consumers;
// 此文件内容包含：结晶性物品需求筛选
import mindustry.type.Item;
import mindustry.world.consumers.ConsumeItemEfficiency;
import Naytrozation.type.NaytItem;

public class ConsumeItemCrystallizable extends ConsumeItemEfficiency {
    public float minCrystallinity; // 默认值为0

    public ConsumeItemCrystallizable() {
        this(0.2f); // 调用带参数的构造函数，使用默认值0.2f
    }

    public ConsumeItemCrystallizable(float minCrystallinity) {
        this.minCrystallinity = minCrystallinity;
        filter = item -> item instanceof NaytItem && ((NaytItem)item).crystallinity >= this.minCrystallinity;
    }

    @Override
    public float itemEfficiencyMultiplier(Item item) {
        if (item instanceof NaytItem) {
            return ((NaytItem)item).crystallinity;
        }
        return 0;
    }
}