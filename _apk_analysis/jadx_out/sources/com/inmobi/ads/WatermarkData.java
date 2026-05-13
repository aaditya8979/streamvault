package com.inmobi.ads;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
public final class WatermarkData {
    private float alpha;

    @NotNull
    private final String watermarkBase64EncodedString;

    public WatermarkData(@NotNull String str, float f10) {
        p.k(str, "watermarkBase64EncodedString");
        this.watermarkBase64EncodedString = str;
        this.alpha = f10;
    }

    public /* synthetic */ WatermarkData(String str, float f10, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? 1.0f : f10);
    }

    public static /* synthetic */ WatermarkData copy$default(WatermarkData watermarkData, String str, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = watermarkData.watermarkBase64EncodedString;
        }
        if ((i10 & 2) != 0) {
            f10 = watermarkData.alpha;
        }
        return watermarkData.copy(str, f10);
    }

    @NotNull
    public final String component1() {
        return this.watermarkBase64EncodedString;
    }

    public final float component2() {
        return this.alpha;
    }

    @NotNull
    public final WatermarkData copy(@NotNull String str, float f10) {
        p.k(str, "watermarkBase64EncodedString");
        return new WatermarkData(str, f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatermarkData)) {
            return false;
        }
        WatermarkData watermarkData = (WatermarkData) obj;
        return p.f(this.watermarkBase64EncodedString, watermarkData.watermarkBase64EncodedString) && Float.compare(this.alpha, watermarkData.alpha) == 0;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @NotNull
    public final String getWatermarkBase64EncodedString() {
        return this.watermarkBase64EncodedString;
    }

    public int hashCode() {
        return Float.hashCode(this.alpha) + (this.watermarkBase64EncodedString.hashCode() * 31);
    }

    public final void setAlpha(float f10) {
        this.alpha = f10;
    }

    @NotNull
    public String toString() {
        return "WatermarkData(watermarkBase64EncodedString=" + this.watermarkBase64EncodedString + ", alpha=" + this.alpha + ")";
    }
}
