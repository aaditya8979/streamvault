package com.google.android.exoplayer.offline;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.scheduler.Requirements;
import d5.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: DownloadManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Requirements f20361l = new Requirements(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.c f20363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet<InterfaceC0286a> f20364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<b5.a> f20371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d5.a f20372k;

    /* JADX INFO: renamed from: com.google.android.exoplayer.offline.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadManager.java */
    public interface InterfaceC0286a {
        default void a(a aVar, boolean z10) {
        }

        default void b(a aVar, Requirements requirements, int i10) {
        }
    }

    public void a(DownloadRequest downloadRequest, int i10) {
        this.f20365d++;
        throw null;
    }

    public void b(InterfaceC0286a interfaceC0286a) {
        this.f20364c.add(interfaceC0286a);
    }

    public List<b5.a> c() {
        return this.f20371j;
    }

    public boolean d() {
        return this.f20368g;
    }

    public Requirements e() {
        return this.f20372k.f();
    }

    public boolean f() {
        return this.f20366e == 0 && this.f20365d == 0;
    }

    public boolean g() {
        return this.f20367f;
    }

    public boolean h() {
        return this.f20370i;
    }

    public final void i() {
        Iterator<InterfaceC0286a> it = this.f20364c.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f20370i);
        }
    }

    public final void j(d5.a aVar, int i10) {
        Requirements requirementsF = aVar.f();
        if (this.f20369h != i10) {
            this.f20369h = i10;
            this.f20365d++;
            throw null;
        }
        boolean zR = r();
        Iterator<InterfaceC0286a> it = this.f20364c.iterator();
        while (it.hasNext()) {
            it.next().b(this, requirementsF, i10);
        }
        if (zR) {
            i();
        }
    }

    public void k() {
        o(true);
    }

    public void l() {
        this.f20365d++;
        throw null;
    }

    public void m(String str) {
        this.f20365d++;
        throw null;
    }

    public void n() {
        o(false);
    }

    public final void o(boolean z10) {
        if (this.f20368g == z10) {
            return;
        }
        this.f20368g = z10;
        this.f20365d++;
        throw null;
    }

    public void p(Requirements requirements) {
        if (requirements.equals(this.f20372k.f())) {
            return;
        }
        this.f20372k.j();
        d5.a aVar = new d5.a(this.f20362a, this.f20363b, requirements);
        this.f20372k = aVar;
        j(this.f20372k, aVar.i());
    }

    public void q(@Nullable String str, int i10) {
        this.f20365d++;
        throw null;
    }

    public final boolean r() {
        boolean z10;
        if (this.f20368g || this.f20369h == 0) {
            z10 = false;
        } else {
            for (int i10 = 0; i10 < this.f20371j.size(); i10++) {
                if (this.f20371j.get(i10).f5398a == 0) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        boolean z11 = this.f20370i != z10;
        this.f20370i = z10;
        return z11;
    }
}
