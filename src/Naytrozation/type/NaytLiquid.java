package Naytrozation.type;
// 此文件内容包含：流体项目属性
import Naytrozation.world.meta.NaytStat;
import arc.graphics.Color;
import mindustry.type.Liquid;

public class NaytLiquid extends Liquid {
    public NaytLiquid(String name, Color color) {
        super(name, color);
    }
    public float crystallinity = 0;
    public float naytrozity = 0;
    @Override
    public void setStats(){
        super.setStats();
        stats.addPercent(NaytStat.crystallinity, crystallinity);
        stats.addPercent(NaytStat.naytrozity, naytrozity);
    }
}