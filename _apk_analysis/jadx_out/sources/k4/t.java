package k4;

import androidx.annotation.Nullable;
import com.ironsource.C3978d4;

/* JADX INFO: compiled from: SeekPoint.java */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f72923c = new t(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f72925b;

    public t(long j10, long j11) {
        this.f72924a = j10;
        this.f72925b = j11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f72924a == tVar.f72924a && this.f72925b == tVar.f72925b;
    }

    public int hashCode() {
        return (((int) this.f72924a) * 31) + ((int) this.f72925b);
    }

    public String toString() {
        return "[timeUs=" + this.f72924a + ", position=" + this.f72925b + C3978d4.j.f31385e;
    }
}
