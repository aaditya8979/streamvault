package com.moloco.sdk.common_adapter_internal;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f45902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f45903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f45905f;

    public b(int i10, int i11, float f10, float f11, int i12, float f12) {
        this.f45900a = i10;
        this.f45901b = i11;
        this.f45902c = f10;
        this.f45903d = f11;
        this.f45904e = i12;
        this.f45905f = f12;
    }

    public final int a() {
        return this.f45904e;
    }

    public final float b() {
        return this.f45903d;
    }

    public final int c() {
        return this.f45901b;
    }

    public final float d() {
        return this.f45905f;
    }

    public final float e() {
        return this.f45902c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f45900a == bVar.f45900a && this.f45901b == bVar.f45901b && Float.compare(this.f45902c, bVar.f45902c) == 0 && Float.compare(this.f45903d, bVar.f45903d) == 0 && this.f45904e == bVar.f45904e && Float.compare(this.f45905f, bVar.f45905f) == 0;
    }

    public final int f() {
        return this.f45900a;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f45900a) * 31) + Integer.hashCode(this.f45901b)) * 31) + Float.hashCode(this.f45902c)) * 31) + Float.hashCode(this.f45903d)) * 31) + Integer.hashCode(this.f45904e)) * 31) + Float.hashCode(this.f45905f);
    }

    @NotNull
    public String toString() {
        return "ScreenData(widthPx=" + this.f45900a + ", heightPx=" + this.f45901b + ", widthDp=" + this.f45902c + ", heightDp=" + this.f45903d + ", dpi=" + this.f45904e + ", pxRatio=" + this.f45905f + ')';
    }
}
