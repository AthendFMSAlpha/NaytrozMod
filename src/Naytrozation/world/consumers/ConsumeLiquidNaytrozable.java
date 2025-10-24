package Naytrozation.world.consumers;
// 此文件内容包含：纳英性流体需求筛选
import Naytrozation.type.NaytLiquid;
import mindustry.type.Liquid;
import mindustry.world.consumers.ConsumeLiquidFilter;

public class ConsumeLiquidNaytrozable extends ConsumeLiquidFilter {
    public float minNaytrozity; // 默认值为0

    public ConsumeLiquidNaytrozable() {
        this(0.2f); // 调用带参数的构造函数，使用默认值0.2f
    }

    public ConsumeLiquidNaytrozable(float minNaytrozity) {
        this.minNaytrozity = minNaytrozity;
        filter = liquid -> liquid instanceof NaytLiquid && ((NaytLiquid)liquid).naytrozity >= this.minNaytrozity;
    }

    @Override
    public float liquidEfficiencyMultiplier(Liquid liquid) {
        if (liquid instanceof NaytLiquid) {
            return ((NaytLiquid)liquid).naytrozity;
        }
        return 0;
    }
}