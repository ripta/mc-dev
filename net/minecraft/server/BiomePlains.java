package net.minecraft.server;

public class BiomePlains extends BiomeBase {

    protected BiomePlains(int i) {
        super(i);
        this.K.add(new BiomeMeta(EntityHorse.class, 5, 2, 6));
        this.I.z = -999;
        this.I.A = 4;
        this.I.B = 10;
    }
}
