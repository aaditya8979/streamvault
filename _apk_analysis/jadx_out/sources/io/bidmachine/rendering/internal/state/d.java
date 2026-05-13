package io.bidmachine.rendering.internal.state;

import bn.r;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.internal.state.a;
import io.bidmachine.util.Tag;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public class d implements io.bidmachine.rendering.internal.state.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tag f70586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f70587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f70588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f70589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f70590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f70591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f70592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f70593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f70594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f70595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f70596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f70597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f70598m;

    public static final class a implements a.b {
        public a() {
        }

        @Override // io.bidmachine.rendering.internal.state.a.b
        public void a(io.bidmachine.rendering.internal.state.a aVar, a.EnumC0839a enumC0839a) {
            p.k(aVar, "source");
            p.k(enumC0839a, "event");
            o.b(d.this.f70586a, "Event: " + enumC0839a, new Object[0]);
        }
    }

    public d(String str) {
        p.k(str, "parent");
        this.f70586a = new Tag("DefaultAdState(" + str + ')');
        this.f70587b = new AtomicBoolean(false);
        this.f70588c = new AtomicBoolean(false);
        this.f70589d = new AtomicBoolean(false);
        this.f70590e = new AtomicBoolean(false);
        this.f70591f = new AtomicBoolean(false);
        this.f70592g = new AtomicBoolean(false);
        this.f70593h = new AtomicBoolean(false);
        this.f70594i = new AtomicBoolean(false);
        this.f70595j = new AtomicBoolean(false);
        this.f70596k = new AtomicBoolean(false);
        this.f70597l = new AtomicBoolean(false);
        this.f70598m = new LinkedHashSet();
        a(new a());
    }

    private final void a(a.EnumC0839a enumC0839a) {
        synchronized (this.f70598m) {
            Iterator it = this.f70598m.iterator();
            while (it.hasNext()) {
                ((a.b) it.next()).a(this, enumC0839a);
            }
            r rVar = r.f5635a;
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public void a() {
        this.f70590e.set(true);
        this.f70587b.set(false);
        this.f70588c.set(false);
        this.f70589d.set(false);
        this.f70591f.set(false);
        this.f70592g.set(false);
        this.f70593h.set(false);
        this.f70594i.set(false);
        this.f70595j.set(false);
        this.f70596k.set(false);
        this.f70597l.set(false);
        a(a.EnumC0839a.Destroyed);
        synchronized (this.f70598m) {
            this.f70598m.clear();
            r rVar = r.f5635a;
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public final void a(a.b bVar) {
        p.k(bVar, "observer");
        if (h()) {
            return;
        }
        synchronized (this.f70598m) {
            this.f70598m.add(bVar);
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean a(boolean z10) {
        boolean z11 = false;
        this.f70588c.set(false);
        this.f70587b.set(z10);
        if (this.f70591f.compareAndSet(false, true) && !h()) {
            z11 = true;
        }
        if (z11) {
            a(z10 ? a.EnumC0839a.Loaded : a.EnumC0839a.FailedToLoad);
        }
        return z11;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public final void b(a.b bVar) {
        p.k(bVar, "observer");
        synchronized (this.f70598m) {
            this.f70598m.remove(bVar);
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean b() {
        return this.f70587b.get() && !h();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean b(boolean z10) {
        boolean zCompareAndSet = this.f70596k.compareAndSet(!z10, z10);
        if (zCompareAndSet) {
            a(z10 ? a.EnumC0839a.Appeared : a.EnumC0839a.Disappeared);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean c() {
        boolean zCompareAndSet = this.f70588c.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(a.EnumC0839a.LoadingStarted);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean d() {
        return this.f70589d.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean e() {
        boolean zCompareAndSet = this.f70594i.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(a.EnumC0839a.Clicked);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean f() {
        boolean zCompareAndSet = this.f70593h.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(a.EnumC0839a.FailedToShow);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean g() {
        return this.f70595j.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean h() {
        return this.f70590e.get();
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean i() {
        boolean zCompareAndSet = this.f70592g.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(a.EnumC0839a.Shown);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean j() {
        boolean zCompareAndSet = this.f70595j.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(a.EnumC0839a.Finished);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean k() {
        boolean zCompareAndSet = this.f70597l.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(a.EnumC0839a.Expired);
        }
        return zCompareAndSet;
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public void l() {
        this.f70589d.set(true);
        a(a.EnumC0839a.ShowInitiated);
    }

    @Override // io.bidmachine.rendering.internal.state.a
    public boolean m() {
        return this.f70592g.get();
    }
}
