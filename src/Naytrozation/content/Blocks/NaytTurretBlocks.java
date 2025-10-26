package Naytrozation.content.Blocks;
// 此文件内容包含：炮台方块

import Naytrozation.content.NaytItems;
import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.part.RegionPart;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.draw.DrawTurret;

public class NaytTurretBlocks {
    public static Block
        // 炮台
        froze
        ;
    public static void load() {
        // 霜花
        froze = new ItemTurret("froze") {{
            // 属性
            requirements(Category.turret, ItemStack.with(NaytItems.crysnow, 25, NaytItems.cobalt, 5)); // 建造需求
            size = 2; // 大小
            recoil = 1f; // 后坐力
            recoils = 2; // 持续后坐力
            rotateSpeed = 10f; // 转向速度
            range = 200; // 范围（[x] / 8）
            limitRange(5f); // 有效射程（不确定）
            reload = 15f; // 开火速率（60 / [x]）
            shootCone = 15f; // 射击冷却
            inaccuracy = 3f; // 射击误差
            shootY = 3f; // 弹道偏移
            coolant = consumeCoolant(0.1f); // 冷却剂消耗
            // 弹药
            ammo(
                // 雪晶
                NaytItems.crysnow, new BasicBulletType(2.5f, 10) {{
                    // 属性
                    width = 3f; // 宽度
                    height = 9f; // 长度
                    lifetime = 60f; // 存在时间
                    ammoMultiplier = 2; // 装填倍率
                    // 外观
                    hitEffect = despawnEffect = Fx.hitBulletColor; // 击中/消失效果
                    hitColor = backColor = trailColor = Color.valueOf("b3c3ed"); // 击中/子弹背面/尾迹颜色
                    frontColor = Color.valueOf("cdd8f5"); // 子弹正面颜色
                }}
            );
            // 外观
            squareSprite = false; // 完整材质？
            drawer = new DrawTurret("coated-"){{
                parts.add(new RegionPart("-mid"){{
                    progress = PartProgress.recoil;
                    under = false;
                    moveY = -1.25f;
                }});
            }};
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
    }
}
