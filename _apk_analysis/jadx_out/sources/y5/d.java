package y5;

import a6.k0;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: compiled from: BaseDataSource.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class d implements com.google.android.exoplayer.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f87256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<q> f87257b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public h f87259d;

    public d(boolean z10) {
        this.f87256a = z10;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public final void b(q qVar) {
        if (this.f87257b.contains(qVar)) {
            return;
        }
        this.f87257b.add(qVar);
        this.f87258c++;
    }

    public final void c(int i10) {
        h hVar = (h) k0.i(this.f87259d);
        for (int i11 = 0; i11 < this.f87258c; i11++) {
            this.f87257b.get(i11).a(this, hVar, this.f87256a, i10);
        }
    }

    public final void d() {
        h hVar = (h) k0.i(this.f87259d);
        for (int i10 = 0; i10 < this.f87258c; i10++) {
            this.f87257b.get(i10).d(this, hVar, this.f87256a);
        }
        this.f87259d = null;
    }

    public final void e(h hVar) {
        for (int i10 = 0; i10 < this.f87258c; i10++) {
            this.f87257b.get(i10).c(this, hVar, this.f87256a);
        }
    }

    public final void f(h hVar) {
        this.f87259d = hVar;
        for (int i10 = 0; i10 < this.f87258c; i10++) {
            this.f87257b.get(i10).f(this, hVar, this.f87256a);
        }
    }
}
