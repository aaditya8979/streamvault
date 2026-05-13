package e5;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import e4.v0;
import e5.b0;
import e5.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: BaseMediaSource.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<r.b> f60342b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<r.b> f60343c = new HashSet<>(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0.a f60344d = new b0.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Looper f60345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public v0 f60346f;

    @Override // e5.r
    public final void a(r.b bVar, @Nullable y5.q qVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f60345e;
        a6.a.a(looper == null || looper == looperMyLooper);
        v0 v0Var = this.f60346f;
        this.f60342b.add(bVar);
        if (this.f60345e == null) {
            this.f60345e = looperMyLooper;
            this.f60343c.add(bVar);
            s(qVar);
        } else if (v0Var != null) {
            h(bVar);
            bVar.b(this, v0Var);
        }
    }

    @Override // e5.r
    public final void c(Handler handler, b0 b0Var) {
        this.f60344d.j(handler, b0Var);
    }

    @Override // e5.r
    public final void d(r.b bVar) {
        this.f60342b.remove(bVar);
        if (!this.f60342b.isEmpty()) {
            e(bVar);
            return;
        }
        this.f60345e = null;
        this.f60346f = null;
        this.f60343c.clear();
        u();
    }

    @Override // e5.r
    public final void e(r.b bVar) {
        boolean z10 = !this.f60343c.isEmpty();
        this.f60343c.remove(bVar);
        if (z10 && this.f60343c.isEmpty()) {
            p();
        }
    }

    @Override // e5.r
    public final void f(b0 b0Var) {
        this.f60344d.M(b0Var);
    }

    @Override // e5.r
    public final void h(r.b bVar) {
        a6.a.e(this.f60345e);
        boolean zIsEmpty = this.f60343c.isEmpty();
        this.f60343c.add(bVar);
        if (zIsEmpty) {
            q();
        }
    }

    public final b0.a m(int i10, @Nullable r.a aVar, long j10) {
        return this.f60344d.P(i10, aVar, j10);
    }

    public final b0.a n(@Nullable r.a aVar) {
        return this.f60344d.P(0, aVar, 0L);
    }

    public final b0.a o(r.a aVar, long j10) {
        a6.a.a(aVar != null);
        return this.f60344d.P(0, aVar, j10);
    }

    public void p() {
    }

    public void q() {
    }

    public final boolean r() {
        return !this.f60343c.isEmpty();
    }

    public abstract void s(@Nullable y5.q qVar);

    public final void t(v0 v0Var) {
        this.f60346f = v0Var;
        Iterator<r.b> it = this.f60342b.iterator();
        while (it.hasNext()) {
            it.next().b(this, v0Var);
        }
    }

    public abstract void u();
}
