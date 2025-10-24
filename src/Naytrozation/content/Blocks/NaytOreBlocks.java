package Naytrozation.content.Blocks;
// 此文件内容包含：矿石方块

import Naytrozation.content.NaytItems;
import mindustry.world.Block;
import mindustry.world.blocks.environment.OreBlock;

public class NaytOreBlocks {
    public static Block
        // 矿石
        oreCrysnow, oreCobalt
        // 墙矿石
        ;
    public static void load() {
//---------- 矿石 ----------//
        // 雪晶矿石
        oreCrysnow = new OreBlock("ore-crysnow", NaytItems.crysnow) {{
            // 属性
            oreDefault = true; // 是可钻探矿物？
            oreThreshold = 0.81f; // 生成比例
            oreScale = 23.47619f; // 矿脉缩放（不确定）
        }};

        // 钴矿石
        oreCobalt = new OreBlock("ore-cobalt", NaytItems.cobalt) {{
            // 属性
            oreDefault = true; // 是可钻探矿物？
            oreThreshold = 0.828f; // 矿脉比例
            oreScale = 23.952381f; // 矿脉缩放（不确定）

        }};
//---------- 墙矿石 ----------//
    }
}
