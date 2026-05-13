package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import kotlin.reflect.KProperty;
import yads.qv2;

/* JADX INFO: loaded from: classes3.dex */
public final class qv2 implements um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km f94165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t42 f94166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dn f94167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d22 f94168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zs2 f94169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m22 f94170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f94171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dw2 f94172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mm f94173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i02 f94174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kz f94175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f94176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v9 f94177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w02 f94178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f94179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public cn f94180p;

    public /* synthetic */ qv2(final km kmVar, lu2 lu2Var) {
        t42 t42Var = new t42(kmVar.g(), lu2Var, kmVar.e(), kmVar.f());
        dn dnVar = new dn(kmVar.e(), kmVar.h());
        d22 d22Var = new d22(kmVar.e());
        zs2 zs2Var = new zs2(kmVar.e(), kmVar.h());
        m22 m22Var = new m22(kmVar);
        Handler handler = new Handler(Looper.getMainLooper());
        Object obj = dw2.f89000j;
        this(kmVar, t42Var, dnVar, d22Var, zs2Var, m22Var, handler, cw2.a(), new mm(), new i02(), new kz() { // from class: bt.a9
            @Override // yads.kz
            public final void e() {
                qv2.a(kmVar);
            }
        });
    }

    public qv2(km kmVar, t42 t42Var, dn dnVar, d22 d22Var, zs2 zs2Var, m22 m22Var, Handler handler, dw2 dw2Var, mm mmVar, i02 i02Var, kz kzVar) {
        this.f94165a = kmVar;
        this.f94166b = t42Var;
        this.f94167c = dnVar;
        this.f94168d = d22Var;
        this.f94169e = zs2Var;
        this.f94170f = m22Var;
        this.f94171g = handler;
        this.f94172h = dw2Var;
        this.f94173i = mmVar;
        this.f94174j = i02Var;
        this.f94175k = kzVar;
        this.f94176l = new ViewTreeObserver.OnPreDrawListener() { // from class: bt.b9
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return qv2.a(this.f5958b);
            }
        };
    }

    public static final void a(km kmVar) {
        kmVar.d();
    }

    public static final boolean a(final qv2 qv2Var) {
        qv2Var.f94171g.postDelayed(new Runnable() { // from class: bt.c9
            @Override // java.lang.Runnable
            public final void run() {
                qv2.b(this.f5973b);
            }
        }, 50L);
        return true;
    }

    public static final void b(qv2 qv2Var) {
        mk3.a(qv2Var.f94165a.C, false);
    }

    @Override // yads.um
    public final List a() {
        i02 i02Var = this.f94174j;
        w02 w02Var = this.f94178n;
        i02Var.getClass();
        return i02.a(w02Var);
    }

    @Override // yads.um
    public final void a(Context context) {
        cn cnVar = this.f94180p;
        if (cnVar != null) {
            an anVar = cnVar.f88507a.f88088e;
            lm2 lm2Var = anVar.f87751c;
            KProperty kProperty = an.f87748d[0];
            ViewGroup viewGroup = (ViewGroup) lm2Var.f92035a.get();
            if (viewGroup != null) {
                nk3.a(viewGroup);
            }
            zf0 zf0Var = anVar.f87750b;
            if (zf0Var != null) {
                zf0Var.c();
            }
        }
        this.f94166b.f95063b.a();
        this.f94177m = null;
        this.f94178n = null;
        this.f94179o = true;
    }

    @Override // yads.um
    public final void a(Context context, v9 v9Var) {
        this.f94165a.f97677b.a(v5.f95924c, null);
        nt2 nt2VarA = this.f94172h.a(context);
        if (nt2VarA == null || !nt2VarA.C) {
            this.f94165a.b(h9.f90282a);
            return;
        }
        if (this.f94179o) {
            return;
        }
        a03 a03Var = this.f94165a.f97678c.f88743d.f87866a;
        nv0 nv0VarC = v9Var.c();
        this.f94177m = v9Var;
        if (a03Var != null && c03.a(context, v9Var, nv0VarC, this.f94173i, a03Var)) {
            this.f94166b.a(v9Var, new ov2(this), new nv2(this, context, v9Var));
            return;
        }
        l4 l4VarA = h9.a(a03Var != null ? a03Var.c(context) : 0, a03Var != null ? a03Var.a(context) : 0, nv0VarC.f92998c, nv0VarC.f92999d, kl3.d(context), kl3.b(context));
        lc1.a(l4VarA.f91880c, new Object[0]);
        this.f94165a.b(l4VarA);
    }

    @Override // yads.um
    public final List b() {
        i02 i02Var = this.f94174j;
        w02 w02Var = this.f94178n;
        i02Var.getClass();
        return i02.b(w02Var);
    }

    @Override // yads.um
    public final String getAdInfo() {
        return this.f94174j.c(this.f94178n);
    }
}
