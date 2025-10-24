package Naytrozation;
// 此文件内容包含：模组内容加载
import Naytrozation.content.*;
import Naytrozation.content.Blocks.*;
import Naytrozation.content.UnitTypes.*;
import mindustry.mod.*;

public class Naytrozation extends Mod {

    public Naytrozation() {}

    @Override
    public void loadContent() {
        // 单位
        NaytTankUnits.loadContent(); // 坦克单位
        NaytScoutUnits.loadContent(); // 侦察单位
        NaytSniperUnits.loadContent(); // 狙击单位
        NaytAirUnits.loadContent(); // 航空单位
        NaytMarineUnits.loadContent(); // 舰船单位
        NaytCoreUnits.loadContent(); // 核心单位
        // 项目
        NaytItems.load(); // 物品
        NaytLiquids.load(); // 流体
        // 方块
        NaytEnvironmentBlocks.load(); // 环境方块
        NaytOreBlocks.load(); // 矿石方块
        NaytStorageBlocks.load(); // 储存方块
        NaytTransportBlocks.load(); // 物品传输方块
        NaytLiquidBlocks.load(); // 流体传输方块
        NaytProductionBlocks.load(); // 生产方块
        NaytCraftingBlocks.load(); // 工厂方块
        NaytPowerBlocks.load(); // 电力方块
        NaytTurretBlocks.load(); // 炮台方块
        NaytWallBlocks.load(); // 防御墙方块
        NaytUnitBlocks.load(); // 单位方块
        // 流程
        NaytPlanets.load(); // 星球
        NaytSectorPresets.load(); // 区块
        NaytTechTree.load(); // 科技树
    }

}