package Naytrozation.content.Blocks;
// 此文件内容包含：储存方块

import Naytrozation.content.NaytItems;
import Naytrozation.content.UnitTypes.NaytCoreUnits;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.storage.CoreBlock;

public class NaytStorageBlocks {
    public static Block
        // 储存
        coreAnti
        ;
    public static void load() {
        // 逆反核心
        coreAnti = new CoreBlock("core-anti") {{
            // 属性
            requirements(Category.effect, ItemStack.with(NaytItems.crysnow, 1000, NaytItems.cobalt, 750, NaytItems.quartiz, 250)); // 建造需求
            size = 3; // 大小
            health = 2500; // 血量
            hasItems = true; // 存储物品？
            itemCapacity = 2500; // 物品容量
            isFirstTier = true; // 是否为初级核心
            // 作用
            unitType = NaytCoreUnits.inhibit; // 核心单位
            unitCapModifier = 10; // 最大单位数量增数
            requiresCoreZone = true; // 需要核心地板？
            incinerateNonBuildable = true; // 焚烧不可建造物品
            // 其他
            alwaysUnlocked = true; // 总是解锁？
        }};
    }
}
