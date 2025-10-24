package Naytrozation.content;
// 此文件内容包含：科技树

import Naytrozation.content.Blocks.*;
import Naytrozation.content.UnitTypes.NaytAirUnits;
import Naytrozation.content.UnitTypes.NaytMarineUnits;
import Naytrozation.content.UnitTypes.NaytTankUnits;
import mindustry.content.Liquids;

import static mindustry.content.TechTree.*;

public class NaytTechTree {

    public static void load() {
        NaytPlanets.naytron.techTree = nodeRoot("naytron", NaytStorageBlocks.coreAnti,() -> {
            // 物品管道
            nodeProduce(NaytTransportBlocks.pressureDuct, () -> { // 气压管道
                nodeProduce(NaytTransportBlocks.pressureDuctJunction, () -> { // 气体管道交叉器
                    nodeProduce(NaytTransportBlocks.pressureDuctRouter, () -> { // 气体管道路由器
                        nodeProduce(NaytTransportBlocks.pressureDuctBridge, () -> { // 气压管道桥
                        });
                        nodeProduce(NaytTransportBlocks.pressureOverflowDuct, () -> { // 气压溢流管道
                            nodeProduce(NaytTransportBlocks.pressureUnderflowDuct, () -> { // 气压反向溢流管道
                            });
                            nodeProduce(NaytTransportBlocks.pressureDuctUnloader, () -> { // 气压管道装卸器
                            });
                        });
                    });
                });
            });
            // 流体导管
            node(NaytLiquidBlocks.vacuumConduit, () -> { // 真空导管
                node(NaytLiquidBlocks.vacuumLiquidJunction, () -> { // 真空流体交叉器
                    node(NaytLiquidBlocks.vacuumBridgeConduit, () -> { // 真空流体带桥
                    });
                    node(NaytLiquidBlocks.vacuumLiquidRouter, () -> { // 真空流体路由器
                        node(NaytLiquidBlocks.vacuumLiquidContainer, () -> { // 真空流体容器
                            node(NaytLiquidBlocks.vacuumLiquidTank, () -> { // 真空流体储罐
                            });
                        });
                    });
                });
            });
            // 钻头
            node(NaytProductionBlocks.naytfuelDrill, () -> { // 英割钻头
                // 钻机
                // 工厂
                node(NaytCraftingBlocks.crucible, () -> { // 坩埚（应替换）
                });
            });
            // 电力
            node(NaytProductionBlocks.naytCollector, () -> { // 纳英收集器
                node(NaytPowerBlocks.crystalGenerator, () -> { // 晶体发电机
                    node(NaytPowerBlocks.naytNode, () -> { // 聚英节点
                    });
                });
                node(NaytProductionBlocks.quartizCondenser, () -> { // 石英质冷凝器
                });
            });
            // 炮塔
            node(NaytTurretBlocks.froze, () -> { // 霜花
                // 防御墙
                node(NaytWallBlocks.crysnowWall, () -> { // 雪晶墙
                    node(NaytWallBlocks.crysnowWallLarge, () -> { // 大型雪晶墙
                        node(NaytWallBlocks.rubyWall, () -> { // 红玉墙
                            node(NaytWallBlocks.rubyWallLarge, () -> { // 大型红玉墙
                                node(NaytWallBlocks.coatedDoor, () -> { // 镀层闸门
                                });
                            });
                            node(NaytWallBlocks.quartizWall, () -> { // 石英质墙
                                node(NaytWallBlocks.quartizWallLarge, () -> { // 大型石英质墙
                                });
                            });
                            node(NaytWallBlocks.violetWall, () -> { // 紫金墙
                                node(NaytWallBlocks.violetWallLarge, () -> { // 大型紫金墙
                                });
                                node(NaytWallBlocks.fiberWall, () -> { // 纤维墙
                                    node(NaytWallBlocks.fiberWallLarge, () -> { // 大型纤维墙
                                    });
                                });
                                node(NaytWallBlocks.compositeWall, () -> { // 复合墙
                                    node(NaytWallBlocks.compositeWallLarge, () -> { // 大型复合墙
                                    });
                                });
                            });
                        });
                    });
                });
            });
            // 核心
            node(NaytStorageBlocks.coreAnti, () -> { // 失纯核心（应替换）
                node(NaytStorageBlocks.coreAnti, () -> { // 至纯核心（应替换）
                });
            });
            // 单位
            node(NaytUnitBlocks.armoredWorkyard, () -> { // 装甲车间
                node(NaytTankUnits.grita, () -> { // 砂峰
                });
                node(NaytUnitBlocks.aircraftWorkyard, () -> { // 航空车间
                    node(NaytAirUnits.depart, () -> { // 启程
                    });
                    node(NaytUnitBlocks.marineWorkyard, () -> { // 舰船车间
                        node(NaytMarineUnits.roar, () -> { // 潮鸣
                        });
                    });
                });
            });
            // 区块
            node(NaytSectorPresets.siensua, () -> { // 思恩苏阿
            });
            // 素材
            nodeProduce(NaytItems.crysnow, () -> { // 雪晶
                nodeProduce(NaytItems.cobalt, () -> { // 钴
                    nodeProduce(NaytLiquids.naytroz, () -> { // 纳英
                        nodeProduce(Liquids.water, () -> { // 水
                            nodeProduce(NaytLiquids.fluorine, () -> { // 氟气
                            });
                        });
                        nodeProduce(NaytItems.quartiz, () -> { // 石英质
                            nodeProduce(NaytLiquids.liquidCrystal, () -> { // 液态晶体
                                nodeProduce(NaytItems.crystalGlass, () -> { // 水晶玻璃
                                });
                                nodeProduce(NaytLiquids.activeNaytroz, () -> { // 活性纳英
                                });
                            });
                        });
                    });
                    nodeProduce(NaytItems.ruby, () -> { // 红玉
                        nodeProduce(NaytItems.fluorite, () -> { // 萤石
                        });
                        nodeProduce(NaytItems.violetMetal, () -> { // 紫金
                            nodeProduce(NaytItems.azureFiber, () -> { // 琉璃纤维
                            });
                            nodeProduce(NaytItems.compositeCrystal, () -> { // 复合晶体
                            });
                        });
                    });
                });
            });
        });
    }
}
