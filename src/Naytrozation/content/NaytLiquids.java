package Naytrozation.content;
// 此文件内容包含：流体

import Naytrozation.type.NaytLiquid;
import arc.graphics.Color;
import mindustry.content.StatusEffects;
import mindustry.type.Liquid;

public class NaytLiquids {
    public static Liquid
        liquidCrystal,
        fluorine,naytroz,activeNaytroz;
    public static void load(){
        // 液态晶体
        liquidCrystal = new NaytLiquid("liquid-liquid-crystal", Color.valueOf("ebd5f2")){{
            // 属性
            gasColor = Color.grays(0.9f); // 气体颜色
            explosiveness = 0f; // 爆炸性
            flammability = 0f; // 燃烧性
            heatCapacity = 1f; // 热容量
            viscosity = 0.75f; // 粘度
            temperature = 0.5f; // 温度
            crystallinity = 0.98f; // 结晶性
            naytrozity = 0.45f; // 纳英性
            boilPoint = 2f; // 沸点
            effect = StatusEffects.wet; // 产生效果（应替换为[结晶]）
            lightColor = Color.valueOf("ebd5f2").a(0.25f); // 光色
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        // 氟气
        fluorine = new NaytLiquid("liquid-fluorine", Color.valueOf("2fc5d4")){{
            // 属性
            gas = true; // 是否气体
            gasColor = Color.grays(0.9f); // 气体颜色
            explosiveness = 1f; // 爆炸性
            flammability = 0.25f; // 燃烧性
            heatCapacity = 0.75f; // 热容量
            viscosity = 0.5f; // 粘度
            temperature = 0f; // 温度
            crystallinity = 0f; // 结晶性
            naytrozity = 0.15f; // 纳英性
            boilPoint = 0f; // 沸点
            effect = StatusEffects.freezing; // 产生效果
            lightColor = Color.valueOf("2fc5d4").a(0.25f); // 光色
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        // 纳英
        naytroz = new NaytLiquid("liquid-naytroz", Color.valueOf("ababab")){{
            // 属性
            gas = true; // 是否气体
            gasColor = Color.grays(0.9f); // 气体颜色
            explosiveness = 0.5f; // 爆炸性
            flammability = 0f; // 燃烧性
            heatCapacity = 0.25f; // 热容量
            viscosity = 0f; // 粘度
            temperature = 0f; // 温度
            crystallinity = 0f; // 结晶性
            naytrozity = 1f; // 纳英性
            boilPoint = 0f; // 沸点
            effect = StatusEffects.wet; // 产生效果（应替换为[纳英化]）
            lightColor = Color.valueOf("ababab").a(0.25f); // 光色
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        // 活性纳英
        activeNaytroz = new NaytLiquid("liquid-active-naytroz", Color.valueOf("ffffff")){{
            // 属性
            gas = true; // 是否气体
            gasColor = Color.grays(0.9f); // 气体颜色
            explosiveness = 3f; // 爆炸性
            flammability = 0.1f; // 燃烧性
            heatCapacity = 0f; // 热容量
            viscosity = 0f; // 粘度
            temperature = 0.5f; // 温度
            crystallinity = 0.01f; // 结晶性
            naytrozity = 5f; // 纳英性
            boilPoint = 0f; // 沸点
            effect = StatusEffects.wet; // 产生效果（应替换为[纳英病]）
            lightColor = Color.valueOf("ffffff").a(0.25f); // 光色
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
    }
}