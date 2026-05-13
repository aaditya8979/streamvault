package yads;

import android.content.Context;
import android.os.Looper;
import yads.kb0;
import yads.rn0;
import yads.xv;
import yads.zd0;

/* JADX INFO: loaded from: classes6.dex */
public final class rn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f94504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f53 f94505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y43 f94506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y43 f94507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y43 f94508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y43 f94509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y43 f94510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wy0 f94511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Looper f94512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pk f94513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f94514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f94515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ww2 f94516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yd0 f94517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f94518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f94519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f94520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f94521r;

    public rn0(final Context context) {
        this(context, new y43() { // from class: bt.j9
            @Override // yads.y43
            public final Object get() {
                return rn0.a(context);
            }
        }, new y43() { // from class: bt.k9
            @Override // yads.y43
            public final Object get() {
                return rn0.b(context);
            }
        });
    }

    public rn0(final Context context, y43 y43Var, y43 y43Var2) {
        this(context, y43Var, y43Var2, new y43() { // from class: bt.n9
            @Override // yads.y43
            public final Object get() {
                return rn0.c(context);
            }
        }, new y43() { // from class: bt.o9
            @Override // yads.y43
            public final Object get() {
                return new zd0();
            }
        }, new y43() { // from class: bt.p9
            @Override // yads.y43
            public final Object get() {
                return rn0.d(context);
            }
        }, new wy0() { // from class: bt.q9
            @Override // yads.wy0
            public final Object apply(Object obj) {
                return new kb0((xv) obj);
            }
        });
    }

    public rn0(Context context, y43 y43Var, y43 y43Var2, y43 y43Var3, y43 y43Var4, y43 y43Var5, wy0 wy0Var) {
        this.f94504a = context;
        this.f94506c = y43Var;
        this.f94507d = y43Var2;
        this.f94508e = y43Var3;
        this.f94509f = y43Var4;
        this.f94510g = y43Var5;
        this.f94511h = wy0Var;
        this.f94512i = ib3.c();
        this.f94513j = pk.f93612h;
        this.f94514k = 1;
        this.f94515l = true;
        this.f94516m = ww2.f96549c;
        this.f94517n = new xd0().a();
        this.f94505b = xv.f96882a;
        this.f94518o = 500L;
        this.f94519p = 2000L;
        this.f94520q = true;
    }

    public static /* synthetic */ pe0 a(Context context) {
        return new pe0(context);
    }

    public static /* synthetic */ sf1 a(sf1 sf1Var) {
        return sf1Var;
    }

    public static /* synthetic */ pe0 b(pe0 pe0Var) {
        return pe0Var;
    }

    public static xm1 b(Context context) {
        return new ge0(new oc0(context, new pd0()), new od0());
    }

    public static s73 c(Context context) {
        return new if0(context, af0.a(context), new dc(0));
    }

    public static im d(Context context) {
        dc0 dc0Var;
        synchronized (dc0.class) {
            if (dc0.f88798t == null) {
                dc0.f88798t = new dc0(context == null ? null : context.getApplicationContext(), cc0.a(ib3.b(context)), 2000, xv.f96882a, true);
            }
            dc0Var = dc0.f88798t;
        }
        return dc0Var;
    }

    public final void a(final zd0 zd0Var) {
        if (!(!this.f94521r)) {
            throw new IllegalStateException();
        }
        this.f94509f = new y43() { // from class: bt.m9
            @Override // yads.y43
            public final Object get() {
                return rn0.a(zd0Var);
            }
        };
    }

    public final rn0 c(final pe0 pe0Var) {
        if (!(!this.f94521r)) {
            throw new IllegalStateException();
        }
        this.f94506c = new y43() { // from class: bt.l9
            @Override // yads.y43
            public final Object get() {
                return rn0.b(pe0Var);
            }
        };
        return this;
    }
}
