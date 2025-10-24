package Naytrozation.content.UnitTypes;
// 此文件内容包含：坦克单位

import arc.graphics.Color;
import arc.math.geom.Rect;
import mindustry.content.Fx;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.gen.TankUnit;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.type.unit.TankUnitType;

public class NaytTankUnits {

    public static UnitType
            // 砂峰、烁岩、层脉、辉英、紫晶
            grita,sparock,laveins,brily,ameth;

    public static void loadContent() {
        // 砂峰
        grita = new TankUnitType("grita") {{
            // 属性
            constructor = TankUnit::create; // 构造分类
            hitSize = 12f; // 受击碰撞箱
            speed = 0.75f; // 速度
            rotateSpeed = 3.5f; // 转向速度
            health = 750; // 血量
            armor = 6f; // 护甲
            itemCapacity = 0; // 物品容量
//            floorMultiplier = 0.95f; // 移速修正（莫名不存在的参数）
            // 外观
            outlineColor = Color.valueOf("333333"); // 描边颜色
            treadPullOffset = 3; // 履带偏移量
            treadRects = new Rect[]{new Rect(12 - 32f, 7 - 32f, 14, 51)}; // 履带区域
            // 武器
            weapons.add(new Weapon("nayt_mod-grita-weapon") {{
                // 属性
                x = 0f; // x坐标
                y = -0.75f; // y坐标
                mirror = false; // 镜像武器？
                reload = 5f; // 开火速率（60 / [x]）
                cooldownTime = 30f; // 射击冷却
                layerOffset = 0.0001f; // 射击位偏移量（不确定）
                shootY = 4.5f; // 子弹高度
                recoil = 1f; // 后坐力
                rotate = true; // 能否旋转？
                rotateSpeed = 2.2f; // 转向速度
                heatColor = Color.valueOf("4f287f"); // 过热颜色
                // 子弹
                bullet = new BasicBulletType(4f, 3) {{
                    // 属性
                    collidesGround = true; // 对地
                    collidesAir = true; // 对空
                    width = 3f; // 宽度
                    height = 7f; // 长度
                    lifetime = 30f; // 存在时间
                    hitSize = 4f; // 击中判定箱
                    // 外观
                    sprite = "missile-large"; // 材质
                    smokeEffect = Fx.shootBigSmoke; // 烟雾效果
                    shootEffect = Fx.shootBigColor; // 射击效果
                    hitColor = backColor = trailColor = Color.valueOf("281540"); // 击中/子弹背面/尾迹颜色
                    frontColor = Color.valueOf("cccccc"); // 子弹正面颜色
                    trailWidth = 1.7f; // 尾迹宽度
                    trailLength = 5; // 尾迹长度
                    hitEffect = despawnEffect = Fx.hitBulletColor; // 击中/消失效果
                }};
            }});
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 烁岩

        // 层脉

        // 辉英

        // 紫晶
    }
}
