package Naytrozation.content.Blocks;
// 此文件内容包含：电力方块

import Naytrozation.content.NaytItems;
import Naytrozation.world.consumers.ConsumeItemCrystallizable;
import mindustry.content.Fx;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.power.BeamNode;
import mindustry.world.blocks.power.ConsumeGenerator;

public class NaytPowerBlocks {
    public static Block
        // 电力
        naytNode,
        crystalGenerator
        ;
    public static void load() {
        // 聚英节点
        naytNode = new BeamNode("nayt-node") {{
            // 属性
            requirements(Category.power, ItemStack.with(NaytItems.cobalt, 8)); // 建造需求
            health = 75; // 血量
            buildCostMultiplier = 2.5f; // 建造速度倍数
            // 作用
            outputsPower = true; // 可以传输电力
            range = 12; // 范围
            fogRadius = 1; // 战争迷雾视野
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 晶体发电机
        crystalGenerator = new ConsumeGenerator("crystal-generator") {{
            // 属性
            requirements(Category.power, ItemStack.with(NaytItems.crysnow, 50, NaytItems.cobalt, 25)); // 建造需求
            health = 150; // 血量
            size = 2; // 大小
            // 作用
            consume(new ConsumeItemCrystallizable()); // 消耗物品类型
            itemDuration = 60 * 5f; // 物品作用持续时间
            powerProduction = 180 / 60f; // 产电
            // 外观
            generateEffect = Fx.generatespark; // 发电特效
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
    }
}
