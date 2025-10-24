package Naytrozation.content;
// 此文件内容包含：物品
import Naytrozation.type.NaytItem;
import arc.graphics.Color;
import mindustry.type.Item;

public class NaytItems {
    public static Item
            crysnow,cobalt,ruby,fluorite,violetMetal,azureFiber,compositeCrystal,quartiz,crystalGlass;

    public static void load() {
        // 雪晶
        crysnow = new NaytItem("item-crysnow", Color.valueOf("cdd8f5")) {{
            // 属性
            explosiveness = 0f; // 爆炸性（如爆炸混合物 = 1.2f）
            flammability = 0f; // 燃烧性（如硫化物 = 1.4f）
            radioactivity = 0f; // 放射性（如钍 = 1f）
            charge = 0f; // 放电性（如巨浪合金 = 0.75f）
            crystallinity = 0.75f; // 结晶性
            naytrozity = 0.1f; // 纳英性
            hardness = 1; // 挖掘硬度（0废/1铜/2煤/3钛/4钍/5钨）
            cost = 0.5f; // 延长建造
            healthScaling = 0; // 增加血量

            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        // 钴
        cobalt = new NaytItem("item-cobalt", Color.valueOf("253e5a")) {{
            // 属性
            explosiveness = 0f; // 爆炸性（如爆炸混合物 = 1.2f）
            flammability = 0f; // 燃烧性（如硫化物 = 1.4f）
            radioactivity = 0f; // 放射性（如钍 = 1f）
            charge = 0.25f; // 放电性（如巨浪合金 = 0.75f）
            crystallinity = 0f; // 结晶性
            naytrozity = 0.15f; // 纳英性
            hardness = 2; // 挖掘硬度（0废/1铜/2煤/3钛/4钍/5钨）
            cost = 0.75f; // 延长建造
            healthScaling = 0; // 增加血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        // 红玉
        ruby = new NaytItem("item-ruby", Color.valueOf("5f0f0f")) {{
            // 属性
            explosiveness = 0f; // 爆炸性（如爆炸混合物 = 1.2f）
            flammability = 0f; // 燃烧性（如硫化物 = 1.4f）
            radioactivity = 0f; // 放射性（如钍 = 1f）
            charge = 0.25f; // 放电性（如巨浪合金 = 0.75f）
            crystallinity = 0.85f; // 结晶性
            naytrozity = 0.3f; // 纳英性
            hardness = 3; // 挖掘硬度（0废/1铜/2煤/3钛/4钍/5钨）
            cost = 1f; // 延长建造
            healthScaling = 0; // 增加血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        // 萤石
        fluorite = new NaytItem("item-fluorite", Color.valueOf("4db18d")) {{
            // 属性
            explosiveness = 0f; // 爆炸性（如爆炸混合物 = 1.2f）
            flammability = 0f; // 燃烧性（如硫化物 = 1.4f）
            radioactivity = 0.1f; // 放射性（如钍 = 1f）
            charge = 0f; // 放电性（如巨浪合金 = 0.75f）
            crystallinity = 0.9f; // 结晶性
            naytrozity = 0.25f; // 纳英性
            hardness = 2; // 挖掘硬度（0废/1铜/2煤/3钛/4钍/5钨）
            buildable = false; // 用于建造？
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        // 紫金
        violetMetal = new NaytItem("item-violet-metal", Color.valueOf("4f287f")) {{
            // 属性
            explosiveness = 0f; // 爆炸性（如爆炸混合物 = 1.2f）
            flammability = 0f; // 燃烧性（如硫化物 = 1.4f）
            radioactivity = 0f; // 放射性（如钍 = 1f）
            charge = 0.25f; // 放电性（如巨浪合金 = 0.75f）
            crystallinity = 0.45f; // 结晶性
            naytrozity = 0.35f; // 纳英性
            hardness = 4; // 挖掘硬度（0废/1铜/2煤/3钛/4钍/5钨）
            cost = 1f; // 延长建造
            healthScaling = 0; // 增加血量

            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        // 琉璃纤维
        azureFiber = new NaytItem("item-azure-fiber", Color.valueOf("c59154")) {{
            // 属性
            explosiveness = 0f; // 爆炸性（如爆炸混合物 = 1.2f）
            flammability = 0.25f; // 燃烧性（如硫化物 = 1.4f）
            radioactivity = 0.25f; // 放射性（如钍 = 1f）
            charge = 1f; // 放电性（如巨浪合金 = 0.75f）
            crystallinity = 0.7f; // 结晶性
            naytrozity = 0.4f; // 纳英性
            hardness = 5; // 挖掘硬度（0废/1铜/2煤/3钛/4钍/5钨）
            cost = 1.4f; // 延长建造
            healthScaling = 0; // 增加血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        // 复合晶体
        compositeCrystal = new NaytItem("item-compsite-crystal", Color.valueOf("281540")) {{
            // 属性
            explosiveness = 0.1f; // 爆炸性（如爆炸混合物 = 1.2f）
            flammability = 0f; // 燃烧性（如硫化物 = 1.4f）
            radioactivity = 1f; // 放射性（如钍 = 1f）
            charge = 0.25f; // 放电性（如巨浪合金 = 0.75f）
            crystallinity = 0.95f; // 结晶性
            naytrozity = 0.5f; // 纳英性
            hardness = 5; // 挖掘硬度（0废/1铜/2煤/3钛/4钍/5钨）
            cost = 1.5f; // 延长建造
            healthScaling = 0; // 增加血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        // 石英质
        quartiz = new NaytItem("item-quartiz", Color.valueOf("cccccc")) {{
            // 属性
            explosiveness = 0f; // 爆炸性（如爆炸混合物 = 1.2f）
            flammability = 0f; // 燃烧性（如硫化物 = 1.4f）
            radioactivity = 0f; // 放射性（如钍 = 1f）
            charge = 0.1f; // 放电性（如巨浪合金 = 0.75f）
            crystallinity = 0.8f; // 结晶性
            naytrozity = 0.2f; // 纳英性
            hardness = 3; // 挖掘硬度（0废/1铜/2煤/3钛/4钍/5钨）
            cost = 0.8f; // 延长建造
            healthScaling = 0.25f; // 增加血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
        // 水晶玻璃
        crystalGlass = new NaytItem("item-crystal-glass", Color.valueOf("c2b0d5")) {{
            // 属性
            explosiveness = 0.1f; // 爆炸性（如爆炸混合物 = 1.2f）
            flammability = 0f; // 燃烧性（如硫化物 = 1.4f）
            radioactivity = 0.25f; // 放射性（如钍 = 1f）
            charge = 0.75f; // 放电性（如巨浪合金 = 0.75f）
            crystallinity = 0.9f; // 结晶性
            naytrozity = 0.35f; // 纳英性
            hardness = 4; // 挖掘硬度（0废/1铜/2煤/3钛/4钍/5钨）
            cost = 1.3f; // 延长建造
            healthScaling = 0.5f; // 增加血量
            // 测试
            alwaysUnlocked = true; // 总是解锁？
        }};
    }
}
