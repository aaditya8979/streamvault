package s7;

import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: compiled from: Size.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f79453c = new e0(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79455b;

    public e0(int i10, int i11) {
        a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f79454a = i10;
        this.f79455b = i11;
    }

    public int a() {
        return this.f79455b;
    }

    public int b() {
        return this.f79454a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f79454a == e0Var.f79454a && this.f79455b == e0Var.f79455b;
    }

    public int hashCode() {
        int i10 = this.f79455b;
        int i11 = this.f79454a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f79454a + VastAttributes.HORIZONTAL_POSITION + this.f79455b;
    }
}
