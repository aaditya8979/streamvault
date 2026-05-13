package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import e6.s1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r7.y;

/* JADX INFO: compiled from: BaseMediaSource.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<i.c> f22244a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet<i.c> f22245b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.a f22246c = new j.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b.a f22247d = new b.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Looper f22248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public c0 f22249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public s1 f22250g;

    @Override // com.google.android.exoplayer2.source.i
    public final void b(i.c cVar) {
        this.f22244a.remove(cVar);
        if (!this.f22244a.isEmpty()) {
            h(cVar);
            return;
        }
        this.f22248e = null;
        this.f22249f = null;
        this.f22250g = null;
        this.f22245b.clear();
        u();
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void c(j jVar) {
        this.f22246c.w(jVar);
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void d(i.c cVar, @Nullable y yVar, s1 s1Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f22248e;
        s7.a.a(looper == null || looper == looperMyLooper);
        this.f22250g = s1Var;
        c0 c0Var = this.f22249f;
        this.f22244a.add(cVar);
        if (this.f22248e == null) {
            this.f22248e = looperMyLooper;
            this.f22245b.add(cVar);
            s(yVar);
        } else if (c0Var != null) {
            g(cVar);
            cVar.a(this, c0Var);
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void e(Handler handler, j jVar) {
        s7.a.e(handler);
        s7.a.e(jVar);
        this.f22246c.f(handler, jVar);
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void g(i.c cVar) {
        s7.a.e(this.f22248e);
        boolean zIsEmpty = this.f22245b.isEmpty();
        this.f22245b.add(cVar);
        if (zIsEmpty) {
            p();
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void h(i.c cVar) {
        boolean z10 = !this.f22245b.isEmpty();
        this.f22245b.remove(cVar);
        if (z10 && this.f22245b.isEmpty()) {
            o();
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void i(Handler handler, com.google.android.exoplayer2.drm.b bVar) {
        s7.a.e(handler);
        s7.a.e(bVar);
        this.f22247d.g(handler, bVar);
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void j(com.google.android.exoplayer2.drm.b bVar) {
        this.f22247d.t(bVar);
    }

    public final b.a k(int i10, @Nullable i.b bVar) {
        return this.f22247d.u(i10, bVar);
    }

    public final b.a l(@Nullable i.b bVar) {
        return this.f22247d.u(0, bVar);
    }

    public final j.a m(int i10, @Nullable i.b bVar, long j10) {
        return this.f22246c.x(i10, bVar, j10);
    }

    public final j.a n(@Nullable i.b bVar) {
        return this.f22246c.x(0, bVar, 0L);
    }

    public void o() {
    }

    public void p() {
    }

    public final s1 q() {
        return (s1) s7.a.i(this.f22250g);
    }

    public final boolean r() {
        return !this.f22245b.isEmpty();
    }

    public abstract void s(@Nullable y yVar);

    public final void t(c0 c0Var) {
        this.f22249f = c0Var;
        Iterator<i.c> it = this.f22244a.iterator();
        while (it.hasNext()) {
            it.next().a(this, c0Var);
        }
    }

    public abstract void u();
}
