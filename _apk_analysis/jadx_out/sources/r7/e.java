package r7;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import s7.m0;

/* JADX INFO: compiled from: BaseDataSource.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<y> f78742b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public k f78744d;

    public e(boolean z10) {
        this.f78741a = z10;
    }

    @Override // r7.h
    public final void b(y yVar) {
        s7.a.e(yVar);
        if (this.f78742b.contains(yVar)) {
            return;
        }
        this.f78742b.add(yVar);
        this.f78743c++;
    }

    public final void c(int i10) {
        k kVar = (k) m0.j(this.f78744d);
        for (int i11 = 0; i11 < this.f78743c; i11++) {
            this.f78742b.get(i11).e(this, kVar, this.f78741a, i10);
        }
    }

    public final void d() {
        k kVar = (k) m0.j(this.f78744d);
        for (int i10 = 0; i10 < this.f78743c; i10++) {
            this.f78742b.get(i10).c(this, kVar, this.f78741a);
        }
        this.f78744d = null;
    }

    public final void e(k kVar) {
        for (int i10 = 0; i10 < this.f78743c; i10++) {
            this.f78742b.get(i10).a(this, kVar, this.f78741a);
        }
    }

    public final void f(k kVar) {
        this.f78744d = kVar;
        for (int i10 = 0; i10 < this.f78743c; i10++) {
            this.f78742b.get(i10).f(this, kVar, this.f78741a);
        }
    }
}
