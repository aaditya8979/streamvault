package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5009oa {
    public static volatile C5009oa I;
    public volatile N9 C;
    public C5293zk H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C4965mg f67419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile F6 f67420c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile S2 f67422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile C4993nj f67423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile U f67424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile C4668b2 f67425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile PlatformIdentifiers f67426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile C5163uf f67427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile A3 f67428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile C4655af f67429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile Bo f67430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile C4788fj f67431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile Gb f67432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bl f67433p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile C5268yk f67435r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Lb f67440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile C5047pn f67441x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile C5169ul f67442y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile C5211wd f67443z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C4984na f67434q = new C4984na();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Tc f67436s = new Tc();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Vc f67437t = new Vc();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C4868im f67438u = new C4868im();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C4789fk f67439v = new C4789fk();
    public final Pd A = new Pd();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final C4994nk D = new C4994nk();
    public final ReferenceHolder E = new ReferenceHolder();
    public final C5243xk F = new C5243xk();
    public final C4871j G = new C4871j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4944lk f67421d = new C4944lk();

    public C5009oa(Context context) {
        this.f67418a = context;
    }

    public static void a(Context context) {
        if (I == null) {
            synchronized (C5009oa.class) {
                if (I == null) {
                    I = new C5009oa(context.getApplicationContext());
                }
            }
        }
    }

    public static C5009oa k() {
        return I;
    }

    public final C4868im A() {
        return this.f67438u;
    }

    public final C5293zk B() {
        File file;
        C5293zk c5293zk = this.H;
        if (c5293zk == null) {
            synchronized (this) {
                c5293zk = this.H;
                if (c5293zk == null) {
                    Context context = this.f67418a;
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
                        c5293zk = new C5293zk(file);
                        this.H = c5293zk;
                    }
                    file = null;
                    c5293zk = new C5293zk(file);
                    this.H = c5293zk;
                }
            }
        }
        return c5293zk;
    }

    public final C5047pn C() {
        C5047pn c5047pn = this.f67441x;
        if (c5047pn == null) {
            synchronized (this) {
                c5047pn = this.f67441x;
                if (c5047pn == null) {
                    c5047pn = new C5047pn(this.f67418a);
                    this.f67441x = c5047pn;
                }
            }
        }
        return c5047pn;
    }

    public final synchronized Bo D() {
        if (this.f67430m == null) {
            this.f67430m = new Bo(this.f67418a);
        }
        return this.f67430m;
    }

    public final void E() {
        if (this.f67427j == null) {
            synchronized (this) {
                if (this.f67427j == null) {
                    Rm rmA = Qm.a(C4758ef.class);
                    Context context = this.f67418a;
                    Sm sm2 = (Sm) rmA;
                    ProtobufStateStorage<Object> protobufStateStorageA = sm2.a(context, sm2.a(context));
                    C4758ef c4758ef = (C4758ef) protobufStateStorageA.read();
                    this.f67427j = new C5163uf(this.f67418a, protobufStateStorageA, new C4939lf(), new C4707cf(c4758ef), new C5138tf(), new C4913kf(this.f67418a), new C5039pf(k().y()), new C4784ff(), c4758ef, "[PreloadInfoStorage]");
                }
            }
        }
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }

    public final C4871j b() {
        return this.G;
    }

    public final U c() {
        U u10 = this.f67424g;
        if (u10 == null) {
            synchronized (this) {
                u10 = this.f67424g;
                if (u10 == null) {
                    u10 = new U(this.f67418a, this.f67421d.a(), this.f67438u.b());
                    this.f67438u.a(u10);
                    this.f67424g = u10;
                }
            }
        }
        return u10;
    }

    public final C4668b2 d() {
        C4668b2 c4668b2 = this.f67425h;
        if (c4668b2 == null) {
            synchronized (this) {
                c4668b2 = this.f67425h;
                if (c4668b2 == null) {
                    c4668b2 = new C4668b2(this.f67418a, AbstractC4694c2.a());
                    this.f67425h = c4668b2;
                }
            }
        }
        return c4668b2;
    }

    public final C4823h2 e() {
        return l().f65278b;
    }

    public final A3 f() {
        if (this.f67428k == null) {
            synchronized (this) {
                if (this.f67428k == null) {
                    Rm rmA = Qm.a(C5126t3.class);
                    Context context = this.f67418a;
                    Sm sm2 = (Sm) rmA;
                    ProtobufStateStorage<Object> protobufStateStorageA = sm2.a(context, sm2.a(context));
                    this.f67428k = new A3(this.f67418a, protobufStateStorageA, new B3(), new C5002o3(), new E3(), new Ui(this.f67418a), new C3(y()), new C5027p3(), (C5126t3) protobufStateStorageA.read(), "[ClidsInfoStorage]");
                }
            }
        }
        return this.f67428k;
    }

    public final Context g() {
        return this.f67418a;
    }

    public final F6 h() {
        if (this.f67420c == null) {
            synchronized (this) {
                if (this.f67420c == null) {
                    this.f67420c = new F6(new E6(y()));
                }
            }
        }
        return this.f67420c;
    }

    public final N9 i() {
        N9 n92 = this.C;
        if (n92 == null) {
            synchronized (this) {
                n92 = this.C;
                if (n92 == null) {
                    n92 = new N9(this.f67418a);
                    this.C = n92;
                }
            }
        }
        return n92;
    }

    public final PermissionExtractor j() {
        C5169ul c5169ul = this.f67442y;
        if (c5169ul != null) {
            return c5169ul;
        }
        synchronized (this) {
            C5169ul c5169ul2 = this.f67442y;
            if (c5169ul2 != null) {
                return c5169ul2;
            }
            C5169ul c5169ul3 = new C5169ul(p().f68050c.getAskForPermissionStrategy());
            this.f67442y = c5169ul3;
            return c5169ul3;
        }
    }

    public final Gb l() {
        Gb gb2 = this.f67432o;
        if (gb2 == null) {
            synchronized (this) {
                gb2 = this.f67432o;
                if (gb2 == null) {
                    gb2 = new Gb(new P2(this.f67418a, this.f67421d.a()), new C4823h2());
                    this.f67432o = gb2;
                }
            }
        }
        return gb2;
    }

    public final Lb m() {
        Lb nb2 = this.f67440w;
        if (nb2 == null) {
            synchronized (this) {
                nb2 = this.f67440w;
                if (nb2 == null) {
                    Context context = this.f67418a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    nb2 = locationClient == null ? new Nb() : new Mb(context, new Tb(), locationClient);
                    this.f67440w = nb2;
                }
            }
        }
        return nb2;
    }

    public final Lb n() {
        return m();
    }

    public final Vc o() {
        return this.f67437t;
    }

    public final C5268yk p() {
        C5268yk c5268yk = this.f67435r;
        if (c5268yk == null) {
            synchronized (this) {
                c5268yk = this.f67435r;
                if (c5268yk == null) {
                    c5268yk = new C5268yk();
                    this.f67435r = c5268yk;
                }
            }
        }
        return c5268yk;
    }

    public final C5211wd q() {
        C5211wd c5211wd = this.f67443z;
        if (c5211wd == null) {
            synchronized (this) {
                c5211wd = this.f67443z;
                if (c5211wd == null) {
                    c5211wd = new C5211wd(this.f67418a, new oo());
                    this.f67443z = c5211wd;
                }
            }
        }
        return c5211wd;
    }

    public final Pd r() {
        return this.A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers = this.f67426i;
        if (platformIdentifiers == null) {
            synchronized (this) {
                platformIdentifiers = this.f67426i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(c(), d());
                    this.f67426i = platformIdentifiers;
                }
            }
        }
        return platformIdentifiers;
    }

    public final C5163uf t() {
        E();
        return this.f67427j;
    }

    public final C4965mg u() {
        if (this.f67419b == null) {
            synchronized (this) {
                if (this.f67419b == null) {
                    this.f67419b = new C4965mg(this.f67418a, I.D().f65061c);
                }
            }
        }
        return this.f67419b;
    }

    public final C4788fj v() {
        C4788fj c4788fj = this.f67431n;
        if (c4788fj == null) {
            synchronized (this) {
                c4788fj = this.f67431n;
                if (c4788fj == null) {
                    c4788fj = new C4788fj(this.f67418a);
                    this.f67431n = c4788fj;
                }
            }
        }
        return c4788fj;
    }

    public final C4944lk w() {
        return this.f67421d;
    }

    public final C5243xk x() {
        return this.F;
    }

    public final C4655af y() {
        if (this.f67429l == null) {
            synchronized (this) {
                if (this.f67429l == null) {
                    this.f67429l = new C4655af(B().d(this.f67418a));
                }
            }
        }
        return this.f67429l;
    }

    public final synchronized L2 z() {
        if (this.f67433p == null) {
            Bl bl2 = new Bl(this.f67418a);
            this.f67433p = bl2;
            this.f67438u.a(bl2);
        }
        return this.f67433p;
    }
}
