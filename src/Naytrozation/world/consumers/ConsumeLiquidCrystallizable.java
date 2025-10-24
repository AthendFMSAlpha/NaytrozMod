package Naytrozation.world.consumers;
// 此文件内容包含：结晶性流体需求筛选
import Naytrozation.type.NaytLiquid;
import mindustry.type.Liquid;
import mindustry.world.consumers.ConsumeLiquidFilter;

public class ConsumeLiquidCrystallizable extends ConsumeLiquidFilter {
    public float minCrystallinity; // 默认值为0

    public ConsumeLiquidCrystallizable() {
        this(0.2f); // 调用带参数的构造函数，使用默认值0.2f
    }

    public ConsumeLiquidCrystallizable(float minCrystallinity) {
        this.minCrystallinity = minCrystallinity;
        filter = liquid -> liquid instanceof NaytLiquid && ((NaytLiquid)liquid).crystallinity >= this.minCrystallinity;
    }

    @Override
    public float liquidEfficiencyMultiplier(Liquid liquid) {
        if (liquid instanceof NaytLiquid) {
            return ((NaytLiquid)liquid).crystallinity;
        }
        return 0;
    }
}