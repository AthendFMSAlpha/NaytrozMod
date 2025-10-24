package Naytrozation.content.UnitTypes;
// 此文件内容包含：舰船单位
import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.MissileBulletType;
import mindustry.gen.Sounds;
import mindustry.gen.UnitWaterMove;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

public class NaytMarineUnits {

    public static UnitType
            // 潮鸣、潮起、潮涌、潮落、潮息
            roar,rise,surge,recede,lament;

    public static void loadContent() {
        // 潮鸣
        roar = new UnitType("roar") {{
            // 属性
            constructor = UnitWaterMove::create; // 构造分类
            hitSize = 10f; // 受击碰撞箱
            speed = 1.1f; // 速度
            accel = 0.4f; // 加速度
            drag = 0.13f; // 拖曳力（行动的渐入渐出）
            rotateSpeed = 3.3f; // 转向速度
            health = 300; // 血量
            armor = 2f; // 护甲
            itemCapacity = 15; // 物品容量
            faceTarget = false; // 面朝目标？
            // 外观
            outlineColor = Color.valueOf("333333"); // 描边颜色
            // 武器
            weapons.add(new Weapon("nayt_mod-roar-weapon") {{
                x = 4f; // x坐标
                y = 1.5f; // y坐标
                mirror = true; // 镜像武器？
                reload = 13f; // 开火速率（60 / [x]）
                shootY = 4f; // 子弹高度
                rotate = true; // 能否旋转？
                ejectEffect = Fx.casing1; // 退弹效果
                // 子弹
                bullet = new BasicBulletType(2.5f, 9){{
                    // 属性
                    collidesGround = true; // 对地
                    collidesAir = false; // 对空
                    width = 7f; // 宽度
                    height = 9f; // 长度
                    lifetime = 60f; // 存在时间
                    ammoMultiplier = 2; // 装填倍率
                    // 外观
                    hitColor = backColor = trailColor = Color.valueOf("2fc5d4"); // 击中/子弹背面/尾迹颜色
                    frontColor = Color.valueOf("b6e8ed"); // 子弹正面颜色
                }};
            }});
            weapons.add(new Weapon("nayt_mod-roar-missiles") {{
                x = 0f; // x坐标
                y = -5f; // y坐标
                mirror = false; // 镜像武器？
                reload = 25f; // 开火速率（60 / [x]）
                rotate = true; // 能否旋转？
                ejectEffect = Fx.casing1; // 退弹效果
                shootSound = Sounds.missile; // 射击音效
                // 子弹
                bullet = new MissileBulletType(2.7f, 12, "missile") {{
                    // 属性
                    collidesGround = false; // 对地
                    collidesAir = true; // 对空
                    width = 8f; // 宽度
                    height = 8f; // 长度
                    keepVelocity = true; // 保持弹速
                    lifetime = 65f; // 存在时间
                    homingRange = 60f; // 追踪范围
                    splashDamage = 10f; // 溅射伤害
                    splashDamageRadius = 25f; // 溅射伤害半径
                    weaveMag = 2f; // 曲绕强度（不确定）
                    weaveScale = 8f; // 曲绕比例（不确定）
                    shrinkY = 0f; // 垂直收缩量（不确定）
                    drag = -0.003f; // 拖曳力（移动的渐入渐出）
                    // 外观
                    sprite = "missile-large"; // 材质
                    smokeEffect = Fx.shootBigSmoke; // 烟雾效果
                    shootEffect = Fx.sparkShoot; // 射击效果
                    hitEffect = despawnEffect = Fx.blastExplosion; // 击中/消失效果
                    hitColor = backColor = trailColor = Color.valueOf("2fc5d4"); // 击中/子弹背面/尾迹颜色
                    frontColor = Color.valueOf("b6e8ed"); // 子弹正面颜色
                    trailWidth = 1.5f; // 尾迹宽度
                    trailLength = 5; // 尾迹长度
                }};
            }});
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};

        // 潮起

        // 潮涌

        // 潮落

        // 潮息
    }
}
