package i6;

import androidx.annotation.Nullable;
import com.ironsource.C3978d4;

/* JADX INFO: compiled from: SeekPoint.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f63837c = new a0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63839b;

    public a0(long j10, long j11) {
        this.f63838a = j10;
        this.f63839b = j11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f63838a == a0Var.f63838a && this.f63839b == a0Var.f63839b;
    }

    public int hashCode() {
        return (((int) this.f63838a) * 31) + ((int) this.f63839b);
    }

    public String toString() {
        return "[timeUs=" + this.f63838a + ", position=" + this.f63839b + C3978d4.j.f31385e;
    }
}
