package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f18576d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y[] f18578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18579c;

    static {
        new z(new y[0]);
    }

    public z(y... yVarArr) {
        this.f18578b = yVarArr;
        this.f18577a = yVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f18577a == zVar.f18577a && Arrays.equals(this.f18578b, zVar.f18578b);
    }

    public final int hashCode() {
        if (this.f18579c == 0) {
            this.f18579c = Arrays.hashCode(this.f18578b);
        }
        return this.f18579c;
    }
}
