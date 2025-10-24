package Naytrozation.content.UnitTypes;
// 此文件内容包含：航空单位
import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.entities.abilities.MoveEffectAbility;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.part.HoverPart;
import mindustry.entities.pattern.ShootSpread;
import mindustry.gen.Sounds;
import mindustry.gen.UnitEntity;
import mindustry.graphics.Pal;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

public class NaytAirUnits {

    public static UnitType
            // 启程、观索、思梦、研析、赛维
            depart,survey,dreamer,analyze,sawi;

    public static void loadContent() {
        // 启程
        depart = new UnitType("depart") {{
            // 属性
            constructor = UnitEntity::create; // 构造分类
            flying = true; // 飞行单位？
            canDrown = false; // 可下落？
            lowAltitude = true; // 低空单位？
            hitSize = 11f; // 受击碰撞箱
            speed = 2.5f; // 速度
            accel = 0.09f; // 加速度
            drag = 0.05f; // 拖曳力（移动的渐入渐出）
            rotateSpeed = 5f; // 转向速度
            health = 600f; // 血量
            armor = 1f; // 护甲
            itemCapacity = 10; // 物品容量
            // 外观
            outlineColor = Color.valueOf("333333"); // 描边颜色
            shadowElevation = 0.1f; // 阴影高度
            engineSize = 2f; // 引擎大小
            engineOffset = 7f; // 引擎偏移量
            useEngineElevation = false; // 使用引擎高度？（不确定）
            // 移动效果
            abilities.add(new MoveEffectAbility(0f, -7f, Pal.sapBulletBack, Fx.missileTrailShort, 4f) {{
                teamColor = true; // 使用队伍颜色？
            }});
            // 悬浮效果
            for(float f : new float[]{-3f, 3f}) {
                parts.add(new HoverPart() {{
                    x = 3.9f; // x坐标
                    y = f; // y坐标（f为单位的上下两处）
                    mirror = true; // 镜像效果？
                    radius = 6f; // 半径
                    phase = 90f; // 动画同步
                    stroke = 2f; // 描边
                    layerOffset = -0.001f; // 图层偏移
                    color = Color.valueOf("ebd5f2"); // 颜色
                }});
            }
            // 武器
            weapons.add(new Weapon("nayt_mod-depart-weapon") {{
                x = 4f; // x坐标
                y = -2f; // y坐标
                top = true; // 顶部武器？（不确定）
                mirror = true; // 镜像武器？
                reload = 40f; // 开火速率（60 / [x]）
                baseRotation = -35f; // 基础旋转角度
                shootCone = 360f; // 射击间隔
                shoot = new ShootSpread(2, 11f); // 攻击方式
                shootSound = Sounds.blaster; // 射击音效
                // 子弹
                bullet = new BasicBulletType(5f, 15) {{
                    // 属性
                    collidesGround = true; // 对地
                    collidesAir = true; // 对空
                    width = 7f; // 宽度
                    height = 12f; // 长度
                    lifetime = 30f; // 存在时间
                    homingPower = 0.19f; // 追踪强度
                    homingDelay = 4f; // 追踪间隔
                    // 外观
                    smokeEffect = Fx.shootBigSmoke; // 烟雾效果
                    shootEffect = Fx.sparkShoot; // 射击效果
                    hitEffect = despawnEffect = Fx.hitBulletColor; // 击中/消失效果
                    hitColor = backColor = trailColor = Color.valueOf("ebd5f2"); // 击中/子弹背面/尾迹颜色
                    frontColor = Color.valueOf("ffffff"); // 子弹正面颜色
                    trailWidth = 1.5f; // 尾迹宽度
                    trailLength = 5; // 尾迹长度
                }};
            }});
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 观索

        // 思梦

        // 研析

        // 赛维
    }
}
