package Naytrozation.content.Blocks;
// 此文件内容包含：流体传输方块
import Naytrozation.content.NaytItems;
import mindustry.graphics.Pal;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.DirectionLiquidBridge;
import mindustry.world.blocks.liquid.Conduit;
import mindustry.world.blocks.liquid.LiquidJunction;
import mindustry.world.blocks.liquid.LiquidRouter;

public class NaytLiquidBlocks {
    public static Block
        // 流体传输
        vacuumConduit,
        // 流体传输 - 交叉型
        vacuumLiquidJunction,
        vacuumBridgeConduit, vacuumLiquidRouter,
        vacuumLiquidContainer, vacuumLiquidTank
        ;
    public static void load() {
//---------- 流体传输 ----------//
        // 真空导管
        vacuumConduit = new Conduit("vacuum-conduit") {{
            // 属性
            requirements(Category.liquid, ItemStack.with(NaytItems.cobalt, 1)); // 建造需求
            health = 250; // 血量
            liquidCapacity = 20; // 流体容量
            leaks = true; // 泄露流体？
            liquidPressure = 1f; // 流体压力（数值越高液速越快）
            underBullets = true; // 非瞄准时子弹穿过？
            explosivenessScale = flammabilityScale = 10f / 25f; // 基于含物的爆炸和燃烧倾向（不确定）
            // 材质
            botColor = Pal.darkestMetal; // 底部材质颜色
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
//---------- 流体传输 - 交叉型 ----------//
        // 真空流体交叉器
        vacuumLiquidJunction = new LiquidJunction("vacuum-liquid-junction") {{
            // 属性
            requirements(Category.liquid, ItemStack.with(NaytItems.cobalt, 3, NaytItems.quartiz, 1)); // 建造需求
            health = 250; // 血量
            underBullets = true; // 非瞄准时子弹穿过？
            solid = false; // 是否实心？（不确定）
            // 作用
            ((Conduit)vacuumConduit).junctionReplacement = this; // 替换条件
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 真空流体带桥
        vacuumBridgeConduit = new DirectionLiquidBridge("vacuum-bridge-conduit") {{
            // 属性
            requirements(Category.liquid, ItemStack.with(NaytItems.cobalt, 15, NaytItems.quartiz, 1)); // 建造需求
            health = 250; // 血量
            liquidCapacity = 120; // 流体容量
            underBullets = true; // 非瞄准时子弹穿过？
            hasPower = false; // 储存电力？
            explosivenessScale = flammabilityScale = 25f / 125f; // 基于含物的爆炸和燃烧倾向（不确定）
            // 作用
            range = 4; // 范围
            ((Conduit)vacuumConduit).rotBridgeReplacement = this; // 替换条件
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 真空流体路由器
        vacuumLiquidRouter = new LiquidRouter("vacuum-liquid-router") {{
            // 属性
            requirements(Category.liquid, ItemStack.with(NaytItems.cobalt, 10, NaytItems.quartiz, 1)); // 建造需求
            health = 250; // 血量
            liquidCapacity = 150; // 流体容量
            liquidPadding = 3f / 4f; // 液体填充（不确定）
            underBullets = true; // 非瞄准时子弹穿过？
            explosivenessScale = flammabilityScale = 25f / 100f; // 基于含物的爆炸和燃烧倾向（不确定）
            solid = false; // 是否实心？（不确定）
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 真空流体容器
        vacuumLiquidContainer = new LiquidRouter("vacuum-liquid-container") {{
            // 属性
            requirements(Category.liquid, ItemStack.with(NaytItems.cobalt, 20, NaytItems.quartiz, 5)); // 建造需求
            health = 250; // 血量
            size = 2; // 大小
            liquidCapacity = 1000; // 流体容量
            liquidPadding = 6f / 4f; // 液体填充（不确定）
            solid = true; // 是否实心？（不确定）
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 真空流体储罐
        vacuumLiquidTank = new LiquidRouter("vacuum-liquid-tank") {{
            // 属性
            requirements(Category.liquid, ItemStack.with(NaytItems.cobalt, 50, NaytItems.quartiz, 20)); // 建造需求
            health = 500; // 血量
            size = 3; // 大小
            liquidCapacity = 2000; // 流体容量
            liquidPadding = 2f; // 液体填充（不确定）
            solid = true; // 是否实心？（不确定）
            // 外观
            squareSprite = false; // 完整材质？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
    }
}
