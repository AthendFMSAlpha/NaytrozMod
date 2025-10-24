package Naytrozation.content.Blocks;
// 此文件内容包含：物品传输方块
import Naytrozation.content.NaytItems;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.*;

public class NaytTransportBlocks {
    public static Block
        // 物品传输
        pressureDuct,
        // 物品传输 - 交叉型
        pressureDuctJunction,
        pressureDuctRouter, pressureOverflowDuct, pressureUnderflowDuct, pressureDuctBridge,
        pressureDuctUnloader
        ;

    public static void load() {
//---------- 物品传输 ----------//
        // 气压管道
        pressureDuct = new Duct("pressure-duct") {{
            // 属性
            requirements(Category.distribution, ItemStack.with(NaytItems.crysnow, 1)); // 建造需求
            health = 50; // 血量
            // 作用
            speed = 6f; // 运输速度（60/[x]f个每秒）
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
//---------- 物品传输 - 交叉型 ----------//
        // 气压管道交叉器
        pressureDuctJunction = new Junction("pressure-duct-junction") {{
            // 属性
            requirements(Category.distribution, ItemStack.with(NaytItems.crysnow, 3)); // 建造需求
            health = 50; // 血量
            capacity = 6; // 容量
            // 作用
            ((Duct)pressureDuct).junctionReplacement = this; // 替换条件
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 气压管道路由器
        pressureDuctRouter = new DuctRouter("pressure-duct-router") {{
            // 属性
            requirements(Category.distribution, ItemStack.with(NaytItems.crysnow, 10)); // 建造需求
            health = 100; // 血量
            solid = false; // 是否实心？（不确定）
            // 作用
            speed = 4f; // 运输速度（60/[x]f个每秒）
            regionRotated1 = 1; // 物品转向
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 气压溢流管道
        pressureOverflowDuct = new OverflowDuct("pressure-overflow-duct") {{
            // 属性
            requirements(Category.distribution, ItemStack.with(NaytItems.crysnow, 8, NaytItems.quartiz, 4)); // 建造需求
            health = 100; // 血量
            solid = false; // 是否实心？（不确定）
            // 作用
            speed = 4f; // 运输速度（60/[x]f个每秒）
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 气压反向溢流管道
        pressureUnderflowDuct = new OverflowDuct("pressure-underflow-duct") {{
            // 属性
            requirements(Category.distribution, ItemStack.with(NaytItems.crysnow, 8, NaytItems.quartiz, 4)); // 建造需求
            health = 100; // 血量
            solid = false; // 是否实心？（不确定）
            // 作用
            speed = 4f; // 运输速度（60/[x]f个每秒）
            invert = true; // 为反向溢流？
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 气压管道桥
        pressureDuctBridge = new DuctBridge("pressure-duct-bridge") {{
            // 属性
            requirements(Category.distribution, ItemStack.with(NaytItems.crysnow, 15)); // 建造需求
            health = 100; // 血量
            // 作用
            speed = 4f; // 运输速度（60/[x]f个每秒）
            ((Duct)pressureDuct).bridgeReplacement = this; // 替换条件
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 气压管道装卸器
        pressureDuctUnloader = new DirectionalUnloader("pressure-duct-unloader") {{
            // 属性
            requirements(Category.distribution, ItemStack.with(NaytItems.quartiz, 20,NaytItems.crystalGlass, 20, NaytItems.cobalt, 10)); // 建造需求
            health = 125; // 血量
            speed = 4f; // 运输速度（60/[x]f个每秒）
            underBullets = true; // 非瞄准时子弹穿过？
            solid = false; // 是否实心？（不确定）
            // 作用
            regionRotated1 = 1; // 物品转向
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？

        }};
    }
}
