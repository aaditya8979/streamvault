package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f18475d = new s(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18478c;

    public s(float f10, float f11) {
        this.f18476a = f10;
        this.f18477b = f11;
        this.f18478c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f18476a == sVar.f18476a && this.f18477b == sVar.f18477b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f18477b) + ((Float.floatToRawIntBits(this.f18476a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
