package Naytrozation.world.meta;
// 此文件内容包含：项目属性
import arc.struct.Seq;
import mindustry.world.meta.Stat;
import mindustry.world.meta.StatCat;

public class NaytStat extends Stat {
    public static final Seq<Stat> all = new Seq<>();

    public NaytStat(String name, StatCat category) {
        super(name, category);
    }

    public static final Stat
            crystallinity = new Stat("crystallinity"),
            naytrozity = new Stat("naytrozity");
}