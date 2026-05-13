package yads;

import com.ironsource.C3978d4;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zr implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f97752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f97753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f97754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f97755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f97756g;

    public zr(String str, long j10, long j11, long j12, File file) {
        this.f97751b = str;
        this.f97752c = j10;
        this.f97753d = j11;
        this.f97754e = file != null;
        this.f97755f = file;
        this.f97756g = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zr zrVar = (zr) obj;
        if (!this.f97751b.equals(zrVar.f97751b)) {
            return this.f97751b.compareTo(zrVar.f97751b);
        }
        long j10 = this.f97752c - zrVar.f97752c;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final String toString() {
        return C3978d4.j.f31383d + this.f97752c + ", " + this.f97753d + C3978d4.j.f31385e;
    }
}
