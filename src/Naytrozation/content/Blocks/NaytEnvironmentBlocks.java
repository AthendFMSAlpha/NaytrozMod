package Naytrozation.content.Blocks;
// 此文件内容包含：环境方块

import Naytrozation.world.meta.NaytAttribute;
import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.world.Block;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.SteamVent;

public class NaytEnvironmentBlocks {
    public static Block
        // 环境
        crystalSnow,crystalSnowVent
        // 石块
        ;
    public static void load() {
//---------- 环境 ----------//
        // 晶雪
        crystalSnow = new Floor("crystal-snow"){{
            // 属性
            attributes.set(NaytAttribute.naytful, 0.25f); // 地面属性
        }};

        // 晶雪喷口
        crystalSnowVent = new SteamVent("crystal-snow-vent"){{
            // 属性
            parent = blendGroup = NaytEnvironmentBlocks.crystalSnow; // 父级地面
            attributes.set(NaytAttribute.naytful, 0.375f); // 地面属性
            attributes.set(NaytAttribute.coldsteam, 1f); // 地面属性
            // 外观
            emitLight = true; // 发光？
            lightRadius = 15f; // 光半径
            lightColor = Color.valueOf("ffffff").a(0.25f); // 光颜色
            effect = Fx.steam; // 特效
        }};
//---------- 石块 ----------//
    }
}