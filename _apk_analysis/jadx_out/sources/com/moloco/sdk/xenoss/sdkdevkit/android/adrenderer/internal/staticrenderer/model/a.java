package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f48579f;

    public a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f48574a = i10;
        this.f48575b = i11;
        this.f48576c = i12;
        this.f48577d = i13;
        this.f48578e = i14;
        this.f48579f = i15;
    }

    public final int a() {
        return this.f48578e;
    }

    public final int b() {
        return this.f48579f;
    }

    public final int c() {
        return this.f48574a;
    }

    public final int d() {
        return this.f48575b;
    }

    public final int e() {
        return this.f48576c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f48574a == aVar.f48574a && this.f48575b == aVar.f48575b && this.f48576c == aVar.f48576c && this.f48577d == aVar.f48577d && this.f48578e == aVar.f48578e && this.f48579f == aVar.f48579f;
    }

    public final int f() {
        return this.f48577d;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f48574a) * 31) + Integer.hashCode(this.f48575b)) * 31) + Integer.hashCode(this.f48576c)) * 31) + Integer.hashCode(this.f48577d)) * 31) + Integer.hashCode(this.f48578e)) * 31) + Integer.hashCode(this.f48579f);
    }

    @NotNull
    public String toString() {
        return "AdTouch(viewPositionX=" + this.f48574a + ", viewPositionY=" + this.f48575b + ", viewSizeHeight=" + this.f48576c + ", viewSizeWidth=" + this.f48577d + ", touchX=" + this.f48578e + ", touchY=" + this.f48579f + ')';
    }
}
