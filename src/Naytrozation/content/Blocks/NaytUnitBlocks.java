package Naytrozation.content.Blocks;
// 此文件内容包含：单位方块

import Naytrozation.content.NaytItems;
import Naytrozation.content.NaytLiquids;
import Naytrozation.content.UnitTypes.NaytAirUnits;
import Naytrozation.content.UnitTypes.NaytMarineUnits;
import Naytrozation.content.UnitTypes.NaytTankUnits;
import arc.struct.Seq;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.units.UnitFactory;

public class NaytUnitBlocks {
    public static Block
        // 单位工厂
        armoredWorkyard,aircraftWorkyard,marineWorkyard
        // 单位传输
        ;
    public static void load() {
//---------- 单位工厂 ----------//
        // 装甲车间
        armoredWorkyard = new UnitFactory("armored-workyard"){{
            // 属性
            requirements(Category.units, ItemStack.with(NaytItems.crysnow, 100, NaytItems.cobalt, 100, NaytItems.quartiz, 50)); // 建造需求
            size = 3; // 大小
            fogRadius = 3; // 战争迷雾视野
            regionSuffix = "-dark"; // 工厂区域后缀
            // 作用
            consumePower(1.5f); // 耗电（1f = 60电力/秒）
            consumeLiquid(NaytLiquids.naytroz,1f); // 消耗流体
            configurable = true; // 可配置生产方案？
            plans = Seq.with( // 生产方案
                    // 砂峰
                    new UnitPlan(NaytTankUnits.grita, 60f * 35f, ItemStack.with(NaytItems.crysnow, 50, NaytItems.quartiz, 25))
            );
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 航空车间
        aircraftWorkyard = new UnitFactory("aircraft-workyard"){{
            // 属性
            requirements(Category.units, ItemStack.with(NaytItems.crysnow, 75, NaytItems.cobalt, 125, NaytItems.quartiz, 50)); // 建造需求
            size = 3; // 大小
            fogRadius = 3; // 战争迷雾视野
            regionSuffix = "-dark"; // 工厂区域后缀
            // 作用
            consumePower(1.5f); // 耗电（1f = 60电力/秒）
            consumeLiquid(NaytLiquids.naytroz,1f); // 消耗流体
            configurable = true; // 可配置生产方案？
            plans = Seq.with( // 生产方案
                    // 启程
                    new UnitPlan(NaytAirUnits.depart, 60f * 35f, ItemStack.with(NaytItems.cobalt, 30, NaytItems.quartiz, 30))
            );
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 舰船车间
        marineWorkyard = new UnitFactory("marine-workyard"){{
            // 属性
            requirements(Category.units, ItemStack.with(NaytItems.crysnow, 125, NaytItems.cobalt, 75, NaytItems.quartiz, 50)); // 建造需求
            size = 3; // 大小
            fogRadius = 3; // 战争迷雾视野
            regionSuffix = "-dark"; // 工厂区域后缀
            // 作用
            consumePower(1.5f); // 耗电（1f = 60电力/秒）
            consumeLiquid(NaytLiquids.naytroz,1f); // 消耗流体
            configurable = true; // 可配置生产方案？
            plans = Seq.with( // 生产方案
                    // 潮鸣
                    new UnitPlan(NaytMarineUnits.roar, 60f * 35f, ItemStack.with(NaytItems.cobalt, 50, NaytItems.quartiz, 25))
            );
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
//---------- 单位传输 ----------//
    }
}
