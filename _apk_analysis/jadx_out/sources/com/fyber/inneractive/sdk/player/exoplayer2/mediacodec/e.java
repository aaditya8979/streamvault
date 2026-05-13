package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18403b;

    public e(boolean z10, String str) {
        this.f18402a = str;
        this.f18403b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != e.class) {
            return false;
        }
        e eVar = (e) obj;
        return TextUtils.equals(this.f18402a, eVar.f18402a) && this.f18403b == eVar.f18403b;
    }

    public final int hashCode() {
        String str = this.f18402a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f18403b ? 1231 : 1237);
    }
}
