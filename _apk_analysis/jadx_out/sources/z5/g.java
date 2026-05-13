package z5;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.TreeSet;

/* JADX INFO: compiled from: CachedContent.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet<m> f98213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f98214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f98215e;

    public g(int i10, String str) {
        this(i10, str, k.f98236c);
    }

    public g(int i10, String str, k kVar) {
        this.f98211a = i10;
        this.f98212b = str;
        this.f98214d = kVar;
        this.f98213c = new TreeSet<>();
    }

    public void a(m mVar) {
        this.f98213c.add(mVar);
    }

    public boolean b(j jVar) {
        this.f98214d = this.f98214d.e(jVar);
        return !r2.equals(r0);
    }

    public k c() {
        return this.f98214d;
    }

    public m d(long j10) {
        m mVarI = m.i(this.f98212b, j10);
        m mVarFloor = this.f98213c.floor(mVarI);
        if (mVarFloor != null && mVarFloor.f98206c + mVarFloor.f98207d > j10) {
            return mVarFloor;
        }
        m mVarCeiling = this.f98213c.ceiling(mVarI);
        return mVarCeiling == null ? m.j(this.f98212b, j10) : m.g(this.f98212b, j10, mVarCeiling.f98206c - j10);
    }

    public TreeSet<m> e() {
        return this.f98213c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f98211a == gVar.f98211a && this.f98212b.equals(gVar.f98212b) && this.f98213c.equals(gVar.f98213c) && this.f98214d.equals(gVar.f98214d);
    }

    public boolean f() {
        return this.f98213c.isEmpty();
    }

    public boolean g() {
        return this.f98215e;
    }

    public boolean h(e eVar) {
        if (!this.f98213c.remove(eVar)) {
            return false;
        }
        eVar.f98209f.delete();
        return true;
    }

    public int hashCode() {
        return (((this.f98211a * 31) + this.f98212b.hashCode()) * 31) + this.f98214d.hashCode();
    }

    public m i(m mVar, long j10, boolean z10) {
        a6.a.f(this.f98213c.remove(mVar));
        File file = mVar.f98209f;
        if (z10) {
            File fileK = m.k(file.getParentFile(), this.f98211a, mVar.f98206c, j10);
            if (file.renameTo(fileK)) {
                file = fileK;
            } else {
                a6.m.h("CachedContent", "Failed to rename " + file + " to " + fileK);
            }
        }
        m mVarD = mVar.d(file, j10);
        this.f98213c.add(mVarD);
        return mVarD;
    }

    public void j(boolean z10) {
        this.f98215e = z10;
    }
}
