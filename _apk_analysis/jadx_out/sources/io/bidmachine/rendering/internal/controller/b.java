package io.bidmachine.rendering.internal.controller;

import android.content.Context;
import io.bidmachine.rendering.internal.n;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.internal.view.f;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.CacheType;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.Orientation;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.Tag;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.Executable;
import io.bidmachine.util.Utils;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public class b implements io.bidmachine.rendering.internal.controller.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tag f70205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f70206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdParams f70207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.controller.c f70208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.animation.b f70209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.state.a f70210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Queue f70211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f70212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f70213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f70214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public io.bidmachine.rendering.internal.view.f f70215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile e f70216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile e f70217m;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70218a;

        static {
            int[] iArr = new int[CacheType.values().length];
            f70218a = iArr;
            try {
                iArr[CacheType.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70218a[CacheType.PartialLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70218a[CacheType.StreamLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.controller.b$b, reason: collision with other inner class name */
    public class C0825b implements f {
        public C0825b() {
        }

        @Override // io.bidmachine.rendering.internal.controller.f
        public void a(e eVar) {
            o.b(b.this.f70205a, "onAdPhaseLoaded (%s)", eVar);
            if (b.this.k()) {
                b.this.u();
                b.this.p();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.f
        public void a(e eVar, Error error) {
            o.a(b.this.f70205a, "onAdPhaseFailToLoad (%s) - %s", eVar, error);
            b.this.d(eVar);
            if (!b.this.l()) {
                b.this.a(error);
                return;
            }
            if (!b.this.f70210f.d()) {
                b.this.o();
                return;
            }
            b.this.b(eVar, new Error("Fail to load after show (CacheType - " + b.this.h() + ") - " + error));
        }
    }

    public class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.bidmachine.rendering.internal.controller.c f70220a;

        public c(io.bidmachine.rendering.internal.controller.c cVar) {
            this.f70220a = cVar;
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a() {
            this.f70220a.a();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            b.this.a(brokenCreativeEvent);
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(PrivacySheetParams privacySheetParams) {
            this.f70220a.a(privacySheetParams);
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void b() {
            b.this.g();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void c() {
            this.f70220a.c();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void d() {
            this.f70220a.onAdClicked();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void e() {
            if (!b.this.j()) {
                b();
            } else {
                b.this.u();
                b.this.v();
            }
        }
    }

    public class d implements f.d {
        private d() {
        }

        public /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        @Override // io.bidmachine.rendering.internal.view.f.d
        public void a() {
            b.this.q();
        }

        @Override // io.bidmachine.rendering.internal.view.f.d
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            b.this.a(brokenCreativeEvent);
        }

        @Override // io.bidmachine.rendering.internal.view.f.d
        public void onLoaded() {
            b.this.s();
        }
    }

    public b(Context context, AdParams adParams, io.bidmachine.rendering.internal.controller.c cVar, io.bidmachine.rendering.internal.animation.b bVar) {
        Tag tag = new Tag("AdController");
        this.f70205a = tag;
        this.f70210f = new io.bidmachine.rendering.internal.state.d(tag.toString());
        this.f70206b = context.getApplicationContext();
        this.f70207c = adParams;
        this.f70208d = cVar;
        this.f70209e = bVar;
        this.f70211g = new ConcurrentLinkedQueue();
        this.f70212h = new AtomicBoolean(false);
        this.f70213i = new AtomicBoolean(false);
        this.f70214j = new AtomicBoolean(false);
    }

    private void a(final e eVar, e eVar2) {
        Utils.ifNotNull(eVar2, new Executable() { // from class: lk.f
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f73857a.c((io.bidmachine.rendering.internal.controller.e) obj);
            }
        });
        this.f70209e.a(eVar.e(), AnimationEventType.Appear, (Runnable) null, new n() { // from class: lk.g
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.controller.b.h(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e eVar, Error error) {
        this.f70208d.a(eVar, error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdPhaseParams adPhaseParams) {
        if (this.f70215k != null) {
            return;
        }
        io.bidmachine.rendering.internal.view.f fVar = new io.bidmachine.rendering.internal.view.f(this.f70206b, adPhaseParams, this.f70209e);
        this.f70215k = fVar;
        fVar.setListener(new d(this, null));
        this.f70215k.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final e eVar) {
        n nVar = new n() { // from class: lk.j
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                this.f73861b.d(eVar);
            }
        };
        eVar.a(true);
        this.f70209e.a(eVar.e(), AnimationEventType.Disappear, (Runnable) null, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(e eVar) {
        if (this.f70210f.i()) {
            v();
            this.f70208d.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        final io.bidmachine.rendering.internal.controller.c cVar = this.f70208d;
        Objects.requireNonNull(cVar);
        n nVar = new n() { // from class: lk.b
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                cVar.b();
            }
        };
        e eVar = this.f70216l;
        if (eVar == null) {
            nVar.run();
        } else {
            eVar.a(true);
            this.f70209e.a(eVar.e(), AnimationEventType.Disappear, (Runnable) null, nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(e eVar) {
        a(eVar, this.f70217m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(e eVar) {
        eVar.d();
        eVar.onShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        Utils.ifNotNull(this.f70216l, new Executable() { // from class: lk.d
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f73856a.g((io.bidmachine.rendering.internal.controller.e) obj);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void a() {
        o.b(this.f70205a, "destroy", new Object[0]);
        this.f70209e.a();
        b(this.f70216l);
        Iterator it = this.f70211g.iterator();
        while (it.hasNext()) {
            b((e) it.next());
        }
        e();
        Utils.ifNotNull(this.f70215k, new Executable() { // from class: lk.c
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                ((io.bidmachine.rendering.internal.view.f) obj).b();
            }
        });
        this.f70215k = null;
        this.f70210f.a();
    }

    public void a(BrokenCreativeEvent brokenCreativeEvent) {
        if (this.f70210f.h()) {
            return;
        }
        this.f70208d.a(brokenCreativeEvent);
    }

    public boolean a(e eVar) {
        return this.f70211g.add(eVar);
    }

    public boolean a(Error error) {
        if (!this.f70210f.a(false)) {
            return false;
        }
        this.f70208d.a(this, error);
        return true;
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public Orientation b() {
        return this.f70207c.getOrientation();
    }

    public void b(e eVar) {
        o.b(this.f70205a, "destroyAdPhaseController (%s)", eVar);
        Utils.ifNotNull(eVar, new Executable() { // from class: lk.e
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                ((io.bidmachine.rendering.internal.controller.e) obj).a();
            }
        });
        if (this.f70216l == eVar) {
            this.f70216l = null;
        }
        if (this.f70217m == eVar) {
            this.f70217m = null;
        }
    }

    public void b(final e eVar, Error error) {
        Utils.ifNotNull(error, new Executable() { // from class: lk.l
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f73864a.a(eVar, (Error) obj);
            }
        });
        g();
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void c() {
        o.b(this.f70205a, "load (cacheType - %s)", h());
        io.bidmachine.rendering.internal.f.b(this.f70206b);
        Queue<AdPhaseParams> adPhaseParamsQueue = this.f70207c.getAdPhaseParamsQueue();
        if (adPhaseParamsQueue.isEmpty()) {
            this.f70208d.a(this, new Error("Ad phase queue is empty"));
            return;
        }
        if (l()) {
            this.f70208d.b(this);
            return;
        }
        if (this.f70210f.c()) {
            for (AdPhaseParams adPhaseParams : adPhaseParamsQueue) {
                Tag tag = new Tag("AdPhaseController");
                a(new h(this.f70206b, adPhaseParams, tag, new io.bidmachine.rendering.internal.state.c(tag.toString(), io.bidmachine.rendering.internal.h.f()), new C0825b(), this.f70209e));
            }
            int i10 = a.f70218a[h().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    n();
                    return;
                }
                n();
            }
            m();
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public boolean d() {
        o.b(this.f70205a, "performShow", new Object[0]);
        this.f70210f.l();
        e eVar = this.f70216l;
        if (eVar == null) {
            t();
            m();
            return false;
        }
        if (!this.f70210f.m()) {
            return true;
        }
        eVar.d();
        return true;
    }

    public void e() {
        this.f70211g.clear();
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void f() {
        o.b(this.f70205a, "performHide", new Object[0]);
        Utils.ifNotNull(this.f70216l, new Executable() { // from class: lk.i
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                ((io.bidmachine.rendering.internal.controller.e) obj).a(false);
            }
        });
        r();
    }

    public CacheType h() {
        return this.f70207c.getCacheType();
    }

    public e i() {
        return (e) this.f70211g.peek();
    }

    public boolean i(e eVar) {
        return this.f70211g.remove(eVar);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void d(e eVar) {
        o.b(this.f70205a, "removeAndDestroyAdPhaseController (%s)", eVar);
        Utils.ifNotNull(eVar, new Executable() { // from class: lk.a
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f73854a.i((io.bidmachine.rendering.internal.controller.e) obj);
            }
        });
        b(eVar);
    }

    public boolean j() {
        return i() != null;
    }

    public boolean k() {
        Iterator it = this.f70211g.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public boolean l() {
        return this.f70210f.b();
    }

    public void m() {
        if (this.f70212h.compareAndSet(false, true)) {
            for (e eVar : this.f70211g) {
                o.b(this.f70205a, "loadAdPhase (%s)", eVar);
                eVar.c();
            }
        }
    }

    public void n() {
        final AdPhaseParams placeholderParams = this.f70207c.getPlaceholderParams();
        UiUtils.onUiThread(new n() { // from class: lk.h
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                this.f73859b.a(placeholderParams);
            }
        });
    }

    public void o() {
        if (this.f70210f.k()) {
            this.f70208d.a(this);
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void onShown() {
        o.b(this.f70205a, "onShown", new Object[0]);
        Utils.ifNotNull(this.f70216l, new Executable() { // from class: lk.k
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f73863a.e((io.bidmachine.rendering.internal.controller.e) obj);
            }
        });
    }

    public boolean p() {
        if (!this.f70210f.a(true)) {
            return false;
        }
        this.f70208d.b(this);
        return true;
    }

    public void q() {
        this.f70208d.e();
    }

    public void r() {
        io.bidmachine.rendering.internal.view.f fVar = this.f70215k;
        if (fVar != null && this.f70214j.compareAndSet(true, false)) {
            fVar.i();
            this.f70208d.b(fVar);
        }
    }

    public void s() {
        p();
    }

    public void t() {
        io.bidmachine.rendering.internal.view.f fVar = this.f70215k;
        if (fVar != null && this.f70214j.compareAndSet(false, true)) {
            this.f70208d.a(fVar);
            fVar.j();
        }
    }

    public String toString() {
        return this.f70205a.toString();
    }

    public void u() {
        if (this.f70213i.compareAndSet(false, true)) {
            this.f70208d.d();
            this.f70217m = this.f70216l;
            e eVarI = i();
            if (eVarI == null) {
                b(this.f70217m, this.f70217m == null ? new Error("No ad phase to show") : null);
            } else {
                if (this.f70217m != eVarI) {
                    i(eVarI);
                    eVarI.a(new c(this.f70208d));
                    this.f70216l = eVarI;
                    io.bidmachine.rendering.internal.d dVarE = eVarI.e();
                    this.f70209e.b(dVarE);
                    this.f70209e.a(dVarE, AnimationEventType.Appear);
                }
                this.f70208d.a(eVarI);
                r();
            }
            this.f70213i.set(false);
        }
    }
}
