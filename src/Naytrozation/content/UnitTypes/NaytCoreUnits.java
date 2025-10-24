package Naytrozation.content.UnitTypes;
// 此文件内容包含：核心单位

import arc.graphics.Color;
import mindustry.ai.types.BuilderAI;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.UnitEntity;
import mindustry.graphics.Pal;
import mindustry.type.UnitType;
import mindustry.type.weapons.RepairBeamWeapon;

import static mindustry.Vars.tilesize;

public class NaytCoreUnits {

    public static UnitType
            // 科限、科护、科疫、坛卫
            inhibit,nurser, kovaccin,guardian;

    public static void loadContent() {
        // 核心损毁后逃生范围
        float coreFleeRange = 500f;

        // 科限
        inhibit = new UnitType("inhibit"){{
            // 属性
            constructor = UnitEntity::create; // 构造分类
            flying = true; // 飞行单位？
            lowAltitude = false; // 低空单位？
            hitSize = 9f; // 受击碰撞箱
            speed = 5.6f; // 速度
            accel = 0.09f; // 加速度
            drag = 0.08f; // 拖曳力（移动的渐入渐出）
            rotateSpeed = 7f; // 转向速度
            health = 300f; // 血量
            armor = 1f; // 护甲
            itemCapacity = 60; // 物品容量
            faceTarget = true; // 面朝目标？
            fogRadius = 0f; // 战争迷雾视野
            // 作用
            coreUnitDock = true; // 自核心重生？
            mineWalls = false; // 挖掘墙矿石？
            mineFloor = true; // 挖掘地板矿石？
            mineTier = 2; // 挖掘等级
            mineSpeed = 6f; // 挖掘效率
            mineHardnessScaling = false; // 区分硬度效率
            range = 60f; // 建造范围
            buildSpeed = 1.2f; // 建造速度
            payloadCapacity = 2f * 2f * tilesize * tilesize; // 载荷容量
            pickupUnits = false; // 携带单位
            vulnerableWithPayloads = true; // 携带载荷时脆弱化？
            // 特殊
            isEnemy = true; // 是敌人？（不确定）
            controller = u -> new BuilderAI(true, coreFleeRange); // 控制AI
            targetable = true; // 可作为目标？
            targetPriority = 2; // 作为目标优先级（不确定）
            hittable = true; // 可被攻击？
            envDisabled = 0; // 环境禁用
            // 外观
            outlineColor = Color.valueOf("333333"); // 描边颜色
            engineSize = 0; // 引擎大小
            setEnginesMirror( // 镜像引擎
                    new UnitEngine(21 / 4f, 19 / 4f, 2.2f, 45f),
                    new UnitEngine(23 / 4f, -22 / 4f, 2.2f, 315f)
            );
            // 武器
            weapons.add(new RepairBeamWeapon() {{
                // 属性
                x = 0f; // x坐标
                y = 6.5f; // y坐标
                mirror = false; // 镜像武器？
                reload = 20f; // 开火速率（60 / [x]）
                shootY = 0f; // 子弹高度
                rotate = false; // 能否旋转？
                shootCone = 15f; // 射击间隔
                beamWidth = 0.7f; // 激光宽度
                repairSpeed = 3f; // 修复速度
                fractionRepairSpeed = 0.05f; // 修复比例
                aimDst = 0f; // 瞄准点偏移量
                widthSinMag = 0.11f; // 命中区水平分散（不确定）
                targetUnits = false; // 单位目标？
                targetBuildings = true; // 建筑目标？
                autoTarget = false; // 自动目标？
                controllable = true; // 可控制？
                // 外观
                laserColor = Pal.accent; // 激光颜色
                healColor = Pal.accent; // 治疗颜色
                // 子弹
                bullet = new BulletType() {{
                    maxRange = 60f; // 最大范围
                }};
            }});
        }};
        // 科护

        // 科疫

        // 坛卫
    }
}
