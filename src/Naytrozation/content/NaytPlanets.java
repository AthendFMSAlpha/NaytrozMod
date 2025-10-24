package Naytrozation.content;
// 此文件内容包含：星球

import Naytrozation.content.Blocks.NaytStorageBlocks;
import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.game.Team;
import mindustry.graphics.g3d.HexMesh;
import mindustry.graphics.g3d.HexSkyMesh;
import mindustry.graphics.g3d.MultiMesh;
import mindustry.maps.planet.ErekirPlanetGenerator;
import mindustry.type.Planet;

public class NaytPlanets {
    public static Planet
            naytron;

    // 纳戎
    public static void load() {
        naytron = new Planet("naytron", Planets.sun,1f,3){{
            // 外观
            generator = new ErekirPlanetGenerator(); // 地形生成器（未编写，暂时使用E星）
            meshLoader = () -> new HexMesh(this, 6); // 地图区块
            cloudMeshLoader = () -> new MultiMesh( // 云层区块 (下列为云层1、云层2等)
                    new HexSkyMesh(this, 12, 0.5f, 0.13f, 5, Color.valueOf("ababab").mul(0.9f).a(0.75f), 2, 0.45f, 0.9f, 0.38f),
                    new HexSkyMesh(this, 2, 0.75f, 0.16f, 5, Color.valueOf("ffffff").mul(0.55f).a(0.75f), 2, 0.45f, 1f, 0.41f)
            );
            iconColor = Color.valueOf("ffffff"); // 图标颜色
            landCloudColor = Color.valueOf("333333").a(0.5f); // 地表云层颜色
            atmosphereColor = Color.valueOf("333333").a(0.5f); // 大气颜色（过亮的颜色会导致严重曝光）
            lightColor = Color.valueOf("ababab"); // 地表光照颜色
            atmosphereRadIn = 0.02f; // 大气内半径
            atmosphereRadOut = 0.3f; // 大气外半径
            orbitRadius = 100; // 轨道半径
            orbitTime = 192 * 60; // 公转时间
            rotateTime = 32 * 60; // 自转时间
            // 属性
            startSector = 170; // 起始区块
            alwaysUnlocked = visible = accessible = true; // 是否默认解锁/可见/可访问

            // 波次
            allowWaves = true; // 启用波数？
            allowWaveSimulation = true; // 启用波次模拟？
            // 资源与建筑
            defaultCore = NaytStorageBlocks.coreAnti; // 默认核心
            allowLaunchLoadout = false; // 类S星装载发射？（暂定）
            allowLaunchSchematics = false; // 允许使用蓝图核心发射？（暂定）
            prebuildBase = true; // 类E星预建基地？
            // 敌对阵营
            enemyCoreSpawnReplace = true; // 摧毁后占领核心？
            // 战役规则
            clearSectorOnLose = true; // 丢失后彻底清除区块？（未实装分类）
            allowCampaignRules = true; // 启用星球难度自调整？
                // 波次
                campaignRuleDefaults.randomWaveAI = true; // 不可预测的AI波次？
                // 敌对阵营
                // allowSectorInvasion = true; // 区块入侵？（取消注释则可被调整）
                campaignRuleDefaults.sectorInvasion = true; // 区块入侵？
                campaignRuleDefaults.showSpawns = true; // 显示敌人出生点？
                campaignRuleDefaults.rtsAI = true; // RTS进攻AI？
            // 属性规则
            ruleSetter = r -> {
                // 波次
                r.coreDestroyClear = true; // 摧毁敌人核心清除所有波次？
                // 资源与建筑
                r.onlyDepositCore = true; // 资源仅可丢入核心？
                r.placeRangeCheck = false; // 放置范围检查？（不确定）
                // 队伍
                r.defaultTeam = Team.blue; // 己方队伍
                r.waveTeam = Team.crux; // 敌人队伍
            };
            // 测试
            allowLaunchToNumbered = true; // 允许前往编号区块？
        }};
    }
}