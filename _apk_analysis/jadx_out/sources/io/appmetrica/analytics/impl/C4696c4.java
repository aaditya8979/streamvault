package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4696c4 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static volatile C4696c4 f66450w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5104s6 f66451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E7 f66452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3 f66453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G1 f66454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4998o f66455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Xk f66456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F5 f66457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4948m f66458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4997nn f66459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C5211wd f66460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C5073r0 f66461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile Z3 f66462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Tc f66463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile We f66464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C4711cj f66465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C5273z0 f66466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final L1 f66467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C4728da f66468r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile C4666b0 f66469s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile N9 f66470t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile H7 f66471u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile C4722d4 f66472v;

    public C4696c4(C5104s6 c5104s6, E7 e72, S3 s32, C4948m c4948m, G1 g12, C4998o c4998o, Xk xk2, F5 f52, C4997nn c4997nn, C5073r0 c5073r0) {
        this.f66463m = new Tc();
        this.f66466p = new C5273z0();
        this.f66467q = new L1();
        this.f66468r = new C4728da();
        new D7();
        this.f66471u = new H7();
        this.f66451a = c5104s6;
        this.f66452b = e72;
        this.f66453c = s32;
        this.f66458h = c4948m;
        this.f66454d = g12;
        this.f66455e = c4998o;
        this.f66456f = xk2;
        this.f66457g = f52;
        this.f66459i = c4997nn;
        this.f66461k = c5073r0;
    }

    public C4696c4(C5104s6 c5104s6, C4998o c4998o, S3 s32) {
        this(c5104s6, c4998o, s32, new C4948m(c4998o));
    }

    public C4696c4(C5104s6 c5104s6, C4998o c4998o, S3 s32, C4948m c4948m) {
        this(c5104s6, new E7(), s32, c4948m, new G1(), c4998o, new Xk(c4998o, c4948m), new F5(c4998o), new C4997nn(), new C5073r0());
    }

    public static C4696c4 l() {
        if (f66450w == null) {
            synchronized (C4696c4.class) {
                if (f66450w == null) {
                    f66450w = new C4696c4(new C5104s6(), new C4998o(), new S3());
                }
            }
        }
        return f66450w;
    }

    public final C4998o a() {
        return this.f66455e;
    }

    public final synchronized C5211wd a(Context context) {
        if (this.f66460j == null) {
            this.f66460j = new C5211wd(context, new no());
        }
        return this.f66460j;
    }

    public final We b(Context context) {
        We we2 = this.f66464n;
        if (we2 == null) {
            synchronized (this) {
                we2 = this.f66464n;
                if (we2 == null) {
                    we2 = new We(c(context).a(context));
                    this.f66464n = we2;
                }
            }
        }
        return we2;
    }

    public final C4666b0 b() {
        C4666b0 c4666b0 = this.f66469s;
        if (c4666b0 == null) {
            synchronized (this) {
                c4666b0 = this.f66469s;
                if (c4666b0 == null) {
                    c4666b0 = new C4666b0(this.f66466p, this.f66456f, this.f66453c);
                    this.f66469s = c4666b0;
                }
            }
        }
        return c4666b0;
    }

    public final C4722d4 c(Context context) {
        File file;
        C4722d4 c4722d4 = this.f66472v;
        if (c4722d4 == null) {
            synchronized (this) {
                c4722d4 = this.f66472v;
                if (c4722d4 == null) {
                    String systemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                    String systemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                    if (bo.d0.u0(systemProperty)) {
                        systemProperty = systemProperty2;
                    }
                    if (!bo.d0.u0(systemProperty)) {
                        file = new File(systemProperty, context.getPackageName());
                        try {
                            file.mkdirs();
                        } catch (Exception unused) {
                            file = null;
                        }
                        c4722d4 = new C4722d4(file);
                        this.f66472v = c4722d4;
                    }
                    file = null;
                    c4722d4 = new C4722d4(file);
                    this.f66472v = c4722d4;
                }
            }
        }
        return c4722d4;
    }

    public final C5073r0 c() {
        return this.f66461k;
    }

    public final C5273z0 d() {
        return this.f66466p;
    }

    public final G1 e() {
        return this.f66454d;
    }

    public final L1 f() {
        return this.f66467q;
    }

    public final S3 g() {
        return this.f66453c;
    }

    public final F5 h() {
        return this.f66457g;
    }

    public final C5104s6 i() {
        return this.f66451a;
    }

    public final E7 j() {
        return this.f66452b;
    }

    public final C4728da k() {
        return this.f66468r;
    }

    public final Z3 m() {
        Z3 z32 = this.f66462l;
        if (z32 == null) {
            synchronized (this) {
                z32 = this.f66462l;
                if (z32 == null) {
                    z32 = new Z3();
                    this.f66462l = z32;
                }
            }
        }
        return z32;
    }

    public final C5104s6 n() {
        return this.f66451a;
    }

    public final Xk o() {
        return this.f66456f;
    }
}
