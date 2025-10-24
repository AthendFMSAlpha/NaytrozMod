package Naytrozation.content.Blocks;
// 此文件内容包含：工厂方块

import Naytrozation.content.NaytItems;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.GenericCrafter;

public class NaytCraftingBlocks {
    public static Block
        // 工厂
        crucible
        ;
    public static void load() {
        // 坩埚
        crucible = new GenericCrafter("crucible") {{
            // 属性
            requirements(Category.crafting, ItemStack.with(NaytItems.crysnow, 75, NaytItems.cobalt, 80)); // 建造需求
            size = 2; // 大小
            hasItems = true; // 存储物品？
            itemCapacity = 10; // 物品容量
            craftEffect = Fx.pulverizeMedium; // 运行特效
            // 作用
            consumeItem(NaytItems.crysnow,1); // 消耗物品
            consumeItem(NaytItems.cobalt,1); // 消耗物品
            consumePower(3f); // 耗电（1f = 60电力/秒）
            outputItem = new ItemStack(Items.metaglass,1); // 产出物品
            craftTime = 60f; // 生产时间（60f = 1秒）
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
    }
}
