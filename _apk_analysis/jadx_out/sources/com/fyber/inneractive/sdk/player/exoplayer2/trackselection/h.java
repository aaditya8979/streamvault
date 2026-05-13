package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f18595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18596c;

    public h(b... bVarArr) {
        this.f18595b = bVarArr;
        this.f18594a = bVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f18595b, ((h) obj).f18595b);
    }

    public final int hashCode() {
        if (this.f18596c == 0) {
            this.f18596c = Arrays.hashCode(this.f18595b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f18596c;
    }
}
