package Naytrozation.content.Blocks;
// 此文件内容包含：防御墙方块
import Naytrozation.content.NaytItems;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.AutoDoor;
import mindustry.world.blocks.defense.Wall;

public class NaytWallBlocks {
    public static Block
        // 防御墙
        crysnowWall,crysnowWallLarge,
        rubyWall,rubyWallLarge,
        coatedDoor,
        quartizWall,quartizWallLarge,
        violetWall, violetWallLarge,
        fiberWall,fiberWallLarge,
        compositeWall,compositeWallLarge
        ;
    public static void load() {
        // 血量乘数定义
        int wallHealthMultiplier = 4;

        // 雪晶墙
        crysnowWall = new Wall("crysnow-wall"){{
            // 属性
            requirements(Category.defense, ItemStack.with(NaytItems.crysnow, 6)); // 建造需求
            health = 75 * wallHealthMultiplier; // 血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 大型雪晶墙
        crysnowWallLarge = new Wall("crysnow-wall-large"){{
            // 属性
            requirements(Category.defense, ItemStack.mult(crysnowWall.requirements, 4)); // 建造需求
            size = 2; // 大小
            health = 75 * 4 * wallHealthMultiplier; // 血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 红玉墙
        rubyWall = new Wall("ruby-wall"){{
            // 属性
            requirements(Category.defense, ItemStack.with(NaytItems.ruby, 6)); // 建造需求
            health = 100 * wallHealthMultiplier; // 血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 大型红玉墙
        rubyWallLarge = new Wall("ruby-wall-large"){{
            // 属性
            requirements(Category.defense, ItemStack.mult(rubyWall.requirements, 4)); // 建造需求
            size = 2; // 大小
            health = 100 * 4 * wallHealthMultiplier; // 血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 镀层闸门
        coatedDoor = new AutoDoor("coated-door"){{
            requirements(Category.defense, ItemStack.with(NaytItems.ruby, 24, NaytItems.quartiz, 24)); // 建造需求
            size = 2; // 大小
            health = 100 * 4 * wallHealthMultiplier; // 血量
            // 作用
            chanceDeflect = 10f; // 基础反射概率
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 石英质墙
        quartizWall = new Wall("quartiz-wall"){{
            // 属性
            requirements(Category.defense, ItemStack.with(NaytItems.quartiz, 6, NaytItems.crystalGlass, 2, NaytItems.crysnow, 2)); // 建造需求
            health = 150 * wallHealthMultiplier; // 血量
            armor = 10f; // 护甲
            // 作用
            insulated = true; // 绝缘？
            absorbLasers = true; // 吸收激光？
            chanceDeflect = 25f; // 基础反射概率
            schematicPriority = 10; // 蓝图优先级
            flashHit = true; // 被击中时闪烁？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 大型石英质墙
        quartizWallLarge = new Wall("quartiz-wall-large"){{
            // 属性
            requirements(Category.defense, ItemStack.mult(quartizWall.requirements, 4)); // 建造需求
            size = 2; // 大小
            health = 150 * 4 * wallHealthMultiplier; // 血量
            armor = 10f; // 护甲
            // 作用
            insulated = true; // 绝缘？
            absorbLasers = true; // 吸收激光？
            chanceDeflect = 25f; // 基础反射概率
            schematicPriority = 10; // 蓝图优先级
            flashHit = true; // 被击中时闪烁？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 紫金墙
        violetWall = new Wall("violet-wall"){{
            // 属性
            requirements(Category.defense, ItemStack.with(NaytItems.violetMetal, 6)); // 建造需求
            health = 250 * wallHealthMultiplier; // 血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 大型紫金墙
        violetWallLarge = new Wall("violet-wall-large"){{
            // 属性
            requirements(Category.defense, ItemStack.mult(violetWall.requirements, 4)); // 建造需求
            size = 2; // 大小
            health = 250 * 4 * wallHealthMultiplier; // 血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 纤维墙
        fiberWall = new Wall("fiber-wall"){{
            // 属性
            requirements(Category.defense, ItemStack.with(NaytItems.azureFiber, 6, NaytItems.ruby, 2)); // 建造需求
            health = 225 * wallHealthMultiplier; // 血量
            armor = 15f; // 护甲
            // 作用
            lightningChance = 0.1f; // 闪电概率
            lightningDamage = 30f; // 闪电伤害
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 大型纤维墙
        fiberWallLarge = new Wall("fiber-wall-large"){{
            // 属性
            requirements(Category.defense, ItemStack.mult(fiberWall.requirements, 4)); // 建造需求
            size = 2; // 大小
            health = 225 * wallHealthMultiplier * 4; // 血量
            armor = 15f; // 护甲
            // 作用
            lightningChance = 0.1f; // 闪电概率
            lightningDamage = 30f; // 闪电伤害
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 复合墙
        compositeWall = new Wall("composite-wall"){{
            // 属性
            requirements(Category.defense, ItemStack.with(NaytItems.violetMetal, 6, NaytItems.compositeCrystal, 6)); // 建造需求
            health = 400 * wallHealthMultiplier; // 血量
            armor = 20f; // 护甲
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 大型复合墙
        compositeWallLarge = new Wall("composite-wall-large"){{
            // 属性
            requirements(Category.defense, ItemStack.mult(compositeWall.requirements, 4)); // 建造需求
            size = 2; // 大小
            health = 400 * wallHealthMultiplier * 4; // 血量
            armor = 20f; // 护甲
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
    }
}
