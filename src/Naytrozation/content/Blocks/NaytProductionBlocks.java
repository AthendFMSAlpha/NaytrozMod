package Naytrozation.content.Blocks;
// 此文件内容包含：生产方块

import Naytrozation.content.NaytItems;
import Naytrozation.content.NaytLiquids;
import Naytrozation.world.meta.NaytAttribute;
import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.Liquids;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.AttributeCrafter;
import mindustry.world.blocks.production.Drill;
import mindustry.world.draw.*;

public class NaytProductionBlocks {
    public static Block
        // 钻头
        naytfuelDrill,
        // 钻机
        // 其他
        naytCollector, quartizCondenser
        ;
    public static void load() {
//---------- 钻头 ----------//
        // 英割钻头
        naytfuelDrill = new Drill("nayt-fuel-drill") {{
            // 属性
            requirements(Category.production, ItemStack.with(NaytItems.crysnow, 15, NaytItems.cobalt, 5)); // 建造需求
            size = 2; // 大小
            // 作用
            tier = 2; // 挖掘等级
            drillTime = 60 / 0.125f; // 挖掘时间（普通：60/[x]个每秒，冲击：60/[x]f*间隔f个每秒）
            consumeLiquid(NaytLiquids.naytroz,1f / 60f).boost(); // 增强所需
            liquidBoostIntensity = 1.415f; // 增强倍率（[x]^2倍）
            // 外观
            drillEffect = Fx.steam; // 挖掘特效
            drawMineItem = true; // 绘制挖掘矿物表示？（贴图-item）
            drawRim = true; // 绘制过热（贴图-rim）
            heatColor = Color.valueOf("ffffff"); // 过热颜色
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        //---------- 钻机 ----------//
        //---------- 其他 ----------//
        // 纳英收集器
        naytCollector = new AttributeCrafter("nayt-collector") {{
            //属性
            requirements(Category.production, ItemStack.with(NaytItems.crysnow, 25, NaytItems.cobalt, 15)); // 建造需求
            health = 150; // 血量
            size = 2; // 大小
            hasLiquids = true; // 储存流体？
            liquidCapacity = 100; // 流体容量
            // 作用
            consumePower(80f / 60f); // 耗电（1f = 60电力/秒）
            outputLiquid = new LiquidStack(NaytLiquids.naytroz, 15 / 60f); // 产出流体（1f = 60流体/秒）
            craftTime = 100; // 生产时间（60f = 1秒）
            baseEfficiency = 1f; // 基础效率
            attribute = NaytAttribute.naytful; // 需求地块属性
            maxBoost = 2f; // 最大地块加成倍率
            displayEfficiency = true; // 显示效率？
            // 外观
            craftEffect = Fx.steam; // 运行特效
            drawer = new DrawMulti(
                    new DrawRegion("-bottom"), // 底部
                    new DrawLiquidTile(NaytLiquids.naytroz), // 流体层
                    new DrawDefault() // 基础层
            );
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 石英质冷凝器
        quartizCondenser = new AttributeCrafter("quartiz-condenser") {{
            // 属性
            requirements(Category.production, ItemStack.with(NaytItems.crysnow, 50, NaytItems.cobalt, 25)); // 建造需求
            size = 3; // 大小
            hasItems = true; // 存储物品？
            itemCapacity = 10; // 物品容量
            hasLiquids = true; // 储存流体？
            liquidCapacity = 10; // 流体容量
            // 作用
            consumeLiquid(NaytLiquids.naytroz,15f / 60f); // 消耗流体
            consumePower(1f); // 耗电（1f = 60电力/秒）
            attribute = NaytAttribute.coldsteam; // 需求地块属性
            outputItem = new ItemStack(NaytItems.quartiz,1); // 产出物品
            outputLiquid = new LiquidStack(Liquids.water,10 / 60f); // 产出流体（1f = 60流体/秒）
            craftTime = 4 * 60f; // 生产时间
            minEfficiency = 9f - 0.0001f; // 最小效率
            baseEfficiency = 0f; // 基础效率
            boostScale = 1f / 9f; // 效率提升比（不确定）
            displayEfficiency = false; // 显示效率？
            // 外观
            squareSprite = false; // 完整材质？
            craftEffect = Fx.steam; // 运行特效
            drawer = new DrawMulti(
                    new DrawRegion("-bottom"), // 底层
                    new DrawBlurSpin("-rotator",6f), // 旋转层
                    new DrawRegion("-mid"), // 中层
                    new DrawLiquidTile(NaytLiquids.naytroz,38f / 4f), // 流体层
                    new DrawDefault() // 基础层
            );
            // 音效
            ambientSound = Sounds.hum; // 音效
            ambientSoundVolume = 0.06f; // 音量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
    }
}
