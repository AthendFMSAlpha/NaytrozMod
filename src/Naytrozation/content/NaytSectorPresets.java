package Naytrozation.content;
// 此文件内容包含：区块
import mindustry.type.SectorPreset;

public class NaytSectorPresets {
    public static SectorPreset
            siensua;

    public static void load() {
        // 思恩苏阿
        siensua = new SectorPreset("siensua", NaytPlanets.naytron,170){{
            // 波次
            // this.captureWave = 0; // 占领波数（会破坏敌人核心）
            this.startWaveTimeMultiplier = 180; // 初始波次间隔
            // 资源与建筑
            this.addStartingItems = false; // 初始资源？
            this.overrideLaunchDefaults = true; // 覆盖星球默认发射核心？
            // 敌对阵营
            this.difficulty = 1; // 难度
            this.attackAfterWaves = true; // 波数结束后启动进攻模式？
            // 环境
            this.noLighting = false; // 不使用星球光照？
            // 其他
            this.alwaysUnlocked = true; // 总是解锁？
        }};
    }
}
