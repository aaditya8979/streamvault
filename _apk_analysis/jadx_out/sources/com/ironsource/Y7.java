package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30735b;

    public Y7(int i10, int i11) {
        this.f30734a = i10;
        this.f30735b = i11;
    }

    public static /* synthetic */ Y7 a(Y7 y72, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = y72.f30734a;
        }
        if ((i12 & 2) != 0) {
            i11 = y72.f30735b;
        }
        return y72.a(i10, i11);
    }

    public final int a() {
        return this.f30734a;
    }

    @NotNull
    public final Y7 a(int i10, int i11) {
        return new Y7(i10, i11);
    }

    public final int b() {
        return this.f30735b;
    }

    public final int c() {
        return this.f30735b;
    }

    public final int d() {
        return this.f30734a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y7)) {
            return false;
        }
        Y7 y72 = (Y7) obj;
        return this.f30734a == y72.f30734a && this.f30735b == y72.f30735b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f30734a) * 31) + Integer.hashCode(this.f30735b);
    }

    @NotNull
    public String toString() {
        return "ISContainerParams(width=" + this.f30734a + ", height=" + this.f30735b + ")";
    }
}
