package com.pgl.ssdk;

/* JADX INFO: loaded from: classes12.dex */
public final class o<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f51416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f51417b;

    public o(A a10, B b10) {
        this.f51416a = a10;
        this.f51417b = b10;
    }

    public static <A, B> o<A, B> a(A a10, B b10) {
        return new o<>(a10, b10);
    }

    public final A a() {
        return this.f51416a;
    }

    public final B b() {
        return this.f51417b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a10 = this.f51416a;
        if (a10 == null) {
            if (oVar.f51416a != null) {
                return false;
            }
        } else if (!a10.equals(oVar.f51416a)) {
            return false;
        }
        B b10 = this.f51417b;
        if (b10 == null) {
            if (oVar.f51417b != null) {
                return false;
            }
        } else if (!b10.equals(oVar.f51417b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        A a10 = this.f51416a;
        int iHashCode = ((a10 == null ? 0 : a10.hashCode()) + 31) * 31;
        B b10 = this.f51417b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }
}
