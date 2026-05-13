package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class l73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f91907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f91909d;

    public l73(int i10, int i11, int i12, byte[] bArr) {
        this.f91906a = i10;
        this.f91907b = bArr;
        this.f91908c = i11;
        this.f91909d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l73.class != obj.getClass()) {
            return false;
        }
        l73 l73Var = (l73) obj;
        return this.f91906a == l73Var.f91906a && this.f91908c == l73Var.f91908c && this.f91909d == l73Var.f91909d && Arrays.equals(this.f91907b, l73Var.f91907b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f91907b) + (this.f91906a * 31)) * 31) + this.f91908c) * 31) + this.f91909d;
    }
}
