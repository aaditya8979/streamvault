package com.moloco.sdk.service_locator;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.B;
import com.moloco.sdk.internal.C4376b;
import com.moloco.sdk.internal.services.D;
import com.moloco.sdk.internal.services.SingleObserverBackgroundThenForegroundAnalyticsListener;
import com.moloco.sdk.internal.services.init.g;
import com.moloco.sdk.internal.services.j0;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0;
import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.j2;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
@SuppressLint({"StaticFieldLeak"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f47628a = new b();

    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f47629a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final bn.g f47630b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.a
            @Override // sn.a
            public final Object invoke() {
                return b.a.c();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f47631c = 8;

        public static final com.moloco.sdk.internal.services.l c() {
            return new com.moloco.sdk.internal.services.l(b.f47628a.a(), com.moloco.sdk.acm.recorder.a.Companion.b());
        }

        @NotNull
        public final s0 a() {
            return t0.a(g.f47660a.a(), C0586b.f47632a.f());
        }

        @NotNull
        public final com.moloco.sdk.internal.services.l b() {
            return (com.moloco.sdk.internal.services.l) f47630b.getValue();
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.service_locator.b$b, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    public static final class C0586b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0586b f47632a = new C0586b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final bn.g f47633b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.c
            @Override // sn.a
            public final Object invoke() {
                return b.C0586b.a();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final bn.g f47634c = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.d
            @Override // sn.a
            public final Object invoke() {
                return b.C0586b.j();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final bn.g f47635d = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.e
            @Override // sn.a
            public final Object invoke() {
                return b.C0586b.b();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final bn.g f47636e = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.f
            @Override // sn.a
            public final Object invoke() {
                return b.C0586b.c();
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final bn.g f47637f = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.g
            @Override // sn.a
            public final Object invoke() {
                return b.C0586b.i();
            }
        });

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f47638g = 8;

        public static final com.moloco.sdk.internal.services.analytics.b a() {
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVarC = i.f47671a.c();
            k kVar = k.f47680a;
            return new com.moloco.sdk.internal.services.analytics.b(lVarC, kVar.b(), kVar.c());
        }

        public static final com.moloco.sdk.internal.services.g b() {
            return new com.moloco.sdk.internal.services.g(ProcessLifecycleOwner.Companion.get().getLifecycle(), f47632a.h());
        }

        public static final com.moloco.sdk.internal.error.c c() {
            return new com.moloco.sdk.internal.error.c(c.f47639a.b(), new com.moloco.sdk.internal.error.api.b(h.f47664a.h(), com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a()));
        }

        public static final com.moloco.sdk.internal.ilrd.c i() {
            return new com.moloco.sdk.internal.ilrd.c(b.f47628a.a());
        }

        public static final SingleObserverBackgroundThenForegroundAnalyticsListener j() {
            return new SingleObserverBackgroundThenForegroundAnalyticsListener(f47632a.d(), h.f47664a.h());
        }

        @NotNull
        public final com.moloco.sdk.internal.services.analytics.a d() {
            return (com.moloco.sdk.internal.services.analytics.a) f47633b.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.r e() {
            return (com.moloco.sdk.internal.services.r) f47635d.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.error.b f() {
            return (com.moloco.sdk.internal.error.b) f47636e.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.ilrd.c g() {
            return (com.moloco.sdk.internal.ilrd.c) f47637f.getValue();
        }

        @NotNull
        public final SingleObserverBackgroundThenForegroundAnalyticsListener h() {
            return (SingleObserverBackgroundThenForegroundAnalyticsListener) f47634c.getValue();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f47639a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final bn.g f47640b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.h
            @Override // sn.a
            public final Object invoke() {
                return b.c.a();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f47641c = 8;

        public static final com.moloco.sdk.internal.services.config.b a() {
            return new com.moloco.sdk.internal.services.config.b();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.config.a b() {
            return (com.moloco.sdk.internal.services.config.a) f47640b.getValue();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f47642a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final bn.g f47643b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.i
            @Override // sn.a
            public final Object invoke() {
                return b.d.a();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f47644c = 8;

        public static final com.moloco.sdk.internal.error.crash.b a() {
            return new com.moloco.sdk.internal.error.crash.b(new com.moloco.sdk.internal.error.crash.e(cn.v.e(new com.moloco.sdk.internal.error.crash.filters.b()), new com.moloco.sdk.internal.error.api.b(h.f47664a.h(), com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a()), com.moloco.sdk.acm.recorder.a.Companion.b()));
        }

        @NotNull
        public final com.moloco.sdk.internal.error.crash.a b() {
            return (com.moloco.sdk.internal.error.crash.a) f47643b.getValue();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f47645a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final bn.g f47646b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.j
            @Override // sn.a
            public final Object invoke() {
                return b.e.b();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final bn.g f47647c = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.k
            @Override // sn.a
            public final Object invoke() {
                return b.e.f();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final bn.g f47648d = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.l
            @Override // sn.a
            public final Object invoke() {
                return b.e.c();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final bn.g f47649e = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.m
            @Override // sn.a
            public final Object invoke() {
                return b.e.n();
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final bn.g f47650f = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.n
            @Override // sn.a
            public final Object invoke() {
                return b.e.e();
            }
        });

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final bn.g f47651g = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.o
            @Override // sn.a
            public final Object invoke() {
                return b.e.d();
            }
        });

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final bn.g f47652h = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.p
            @Override // sn.a
            public final Object invoke() {
                return b.e.a();
            }
        });

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f47653i = 8;

        public static final com.moloco.sdk.internal.services.n a() {
            return new com.moloco.sdk.internal.services.n(b.f47628a.a());
        }

        public static final com.moloco.sdk.internal.services.y b() {
            return new com.moloco.sdk.internal.services.y(b.f47628a.a());
        }

        public static final com.moloco.sdk.internal.services.c0 c() {
            return new com.moloco.sdk.internal.services.c0(b.f47628a.a());
        }

        public static final com.moloco.sdk.internal.services.e0 d() {
            return new com.moloco.sdk.internal.services.e0(b.f47628a.a());
        }

        public static final com.moloco.sdk.internal.services.v e() {
            return new com.moloco.sdk.internal.services.v(b.f47628a.a());
        }

        public static final com.moloco.sdk.internal.services.u f() {
            return new com.moloco.sdk.internal.services.u(b.f47628a.a());
        }

        public static final com.moloco.sdk.internal.services.i n() {
            return new com.moloco.sdk.internal.services.i(b.f47628a.a());
        }

        @NotNull
        public final com.moloco.sdk.internal.services.m g() {
            return (com.moloco.sdk.internal.services.m) f47652h.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.x h() {
            return (com.moloco.sdk.internal.services.x) f47646b.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.b0 i() {
            return (com.moloco.sdk.internal.services.b0) f47648d.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.d0 j() {
            return (com.moloco.sdk.internal.services.d0) f47651g.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.g0 k() {
            return (com.moloco.sdk.internal.services.g0) f47650f.getValue();
        }

        @NotNull
        public final j0 l() {
            return (j0) f47647c.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.f m() {
            return (com.moloco.sdk.internal.services.f) f47649e.getValue();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public static volatile com.moloco.sdk.internal.e f47655b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f47654a = new f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final bn.g f47656c = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.q
            @Override // sn.a
            public final Object invoke() {
                return b.f.g();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final bn.g f47657d = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.r
            @Override // sn.a
            public final Object invoke() {
                return b.f.e();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final bn.g f47658e = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.s
            @Override // sn.a
            public final Object invoke() {
                return b.f.f();
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f47659f = 8;

        public static final com.moloco.sdk.internal.services.init.e e() {
            e eVar = e.f47645a;
            return new com.moloco.sdk.internal.services.init.e(eVar.l(), eVar.h(), k.f47680a.f(), BuildConfig.SDK_VERSION_NAME, BuildConfig.MOLOCO_ENDPOINT_INIT_CONFIG, 3000L, i.f47671a.a());
        }

        public static final com.moloco.sdk.internal.services.init.l f() {
            com.moloco.sdk.internal.services.init.d dVarB = f47654a.b();
            g.a aVar = com.moloco.sdk.internal.services.init.g.f47469a;
            SharedPreferences sharedPreferences = b.f47628a.a().getSharedPreferences("moloco_sdk_init_cache", 0);
            tn.p.j(sharedPreferences, "getSharedPreferences(...)");
            return new com.moloco.sdk.internal.services.init.l(dVarB, aVar.a(sharedPreferences), kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getIo().plus(j2.b(null, 1, null))));
        }

        public static final com.moloco.sdk.internal.services.init.n g() {
            return new com.moloco.sdk.internal.services.init.n(BuildConfig.MOLOCO_ENDPOINT_INIT_TRACKING, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a());
        }

        @NotNull
        public final com.moloco.sdk.internal.e a(@NotNull Init$SDKInitResponse init$SDKInitResponse) {
            tn.p.k(init$SDKInitResponse, "initResponse");
            com.moloco.sdk.internal.e c4376b = f47655b;
            if (c4376b == null) {
                synchronized (this) {
                    c4376b = f47655b;
                    if (c4376b == null) {
                        c4376b = new C4376b(init$SDKInitResponse, k.f47680a.b(), h.f47664a.e());
                        f47655b = c4376b;
                    }
                }
            }
            return c4376b;
        }

        @NotNull
        public final com.moloco.sdk.internal.services.init.d b() {
            return (com.moloco.sdk.internal.services.init.d) f47657d.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.init.j c() {
            return (com.moloco.sdk.internal.services.init.j) f47658e.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.init.m d() {
            return (com.moloco.sdk.internal.services.init.m) f47656c.getValue();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final g f47660a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final bn.g f47661b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.t
            @Override // sn.a
            public final Object invoke() {
                return b.g.d();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final bn.g f47662c = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.u
            @Override // sn.a
            public final Object invoke() {
                return b.g.c();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f47663d = 8;

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j c() {
            g gVar = f47660a;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o oVarB = gVar.b();
            e eVar = e.f47645a;
            com.moloco.sdk.internal.services.g0 g0VarK = eVar.k();
            C0586b c0586b = C0586b.f47632a;
            com.moloco.sdk.internal.error.b bVarF = c0586b.f();
            i iVar = i.f47671a;
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j(gVar.b(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d(eVar.k(), c0586b.f(), iVar.a()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b(oVarB, g0VarK, bVarF, iVar.a()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m(b.f47628a.a(), "com.moloco.sdk.xenoss.sdkdevkit.android.cache"));
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o d() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o) c.f47639a.b().b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o.class, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.q.a());
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n a() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n) f47662c.getValue();
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o b() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o) f47661b.getValue();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final h f47664a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final bn.g f47665b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.v
            @Override // sn.a
            public final Object invoke() {
                return b.h.l();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final bn.g f47666c = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.w
            @Override // sn.a
            public final Object invoke() {
                return b.h.k();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final bn.g f47667d = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.x
            @Override // sn.a
            public final Object invoke() {
                return b.h.b();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final bn.g f47668e = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.y
            @Override // sn.a
            public final Object invoke() {
                return b.h.m();
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final bn.g f47669f = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.z
            @Override // sn.a
            public final Object invoke() {
                return b.h.a();
            }
        });

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f47670g = 8;

        public static final ActivityManager a() {
            Object systemService = b.f47628a.a().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            tn.p.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return (ActivityManager) systemService;
        }

        public static final com.moloco.sdk.internal.services.q b() {
            return new com.moloco.sdk.internal.services.q(b.f47628a.a());
        }

        public static final com.moloco.sdk.internal.services.proto.b k() {
            return new com.moloco.sdk.internal.services.proto.b();
        }

        public static final com.moloco.sdk.internal.services.k l() {
            return new com.moloco.sdk.internal.services.k();
        }

        public static final B m() {
            return new B();
        }

        @NotNull
        public final ActivityManager c() {
            return (ActivityManager) f47669f.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.p d() {
            return (com.moloco.sdk.internal.services.p) f47667d.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.f0 e() {
            return new com.moloco.sdk.internal.services.t(f(), k.f47680a.b());
        }

        @NotNull
        public final w0 f() {
            return new x0(b.f47628a.a());
        }

        @NotNull
        public final com.moloco.sdk.internal.services.proto.a g() {
            return (com.moloco.sdk.internal.services.proto.a) f47666c.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.j h() {
            return (com.moloco.sdk.internal.services.j) f47665b.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.a i() {
            return (com.moloco.sdk.internal.a) f47668e.getValue();
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 j() {
            return new Q();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final i f47671a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final bn.g f47672b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.a0
            @Override // sn.a
            public final Object invoke() {
                return b.i.e();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final bn.g f47673c = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.b0
            @Override // sn.a
            public final Object invoke() {
                return b.i.f();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final bn.g f47674d = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.c0
            @Override // sn.a
            public final Object invoke() {
                return b.i.h();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final bn.g f47675e = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.d0
            @Override // sn.a
            public final Object invoke() {
                return b.i.g();
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f47676f = 8;

        public static final HttpClient e() {
            e eVar = e.f47645a;
            return com.moloco.sdk.internal.http.e.e(eVar.h().invoke(), eVar.l().invoke());
        }

        public static final com.moloco.sdk.internal.services.c f() {
            return new com.moloco.sdk.internal.services.c(b.f47628a.a(), e.f47645a.l());
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l g() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l.f51004a.a(f47671a.d());
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.p h() {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.p(b.f47628a.a());
        }

        @NotNull
        public final HttpClient a() {
            return (HttpClient) f47672b.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.b b() {
            return (com.moloco.sdk.internal.services.b) f47673c.getValue();
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l c() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l) f47675e.getValue();
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.o d() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.o) f47674d.getValue();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final j f47677a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final bn.g f47678b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.e0
            @Override // sn.a
            public final Object invoke() {
                return b.j.a();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f47679c = 8;

        public static final D a() {
            SharedPreferences sharedPreferences = b.f47628a.a().getSharedPreferences("moloco_sdk_preferences", 0);
            tn.p.h(sharedPreferences);
            return new D(sharedPreferences);
        }

        @NotNull
        public final com.moloco.sdk.internal.services.h0 b() {
            return (com.moloco.sdk.internal.services.h0) f47678b.getValue();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final k f47680a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final bn.g f47681b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.f0
            @Override // sn.a
            public final Object invoke() {
                return b.k.g();
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final bn.g f47682c = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.g0
            @Override // sn.a
            public final Object invoke() {
                return b.k.h();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final bn.g f47683d = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.service_locator.h0
            @Override // sn.a
            public final Object invoke() {
                return b.k.a();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f47684e = 8;

        public static final com.moloco.sdk.internal.services.events.c a() {
            return new com.moloco.sdk.internal.services.events.c();
        }

        public static final com.moloco.sdk.internal.services.usertracker.c g() {
            return new com.moloco.sdk.internal.services.usertracker.c(j.f47677a.b());
        }

        public static final com.moloco.sdk.internal.services.usertracker.g h() {
            k kVar = f47680a;
            return new com.moloco.sdk.internal.services.usertracker.g(kVar.e(), kVar.d());
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b() {
            e eVar = e.f47645a;
            com.moloco.sdk.internal.services.x xVarH = eVar.h();
            com.moloco.sdk.internal.services.b bVarB = i.f47671a.b();
            j0 j0VarL = eVar.l();
            com.moloco.sdk.internal.services.f fVarM = eVar.m();
            com.moloco.sdk.internal.services.usertracker.e eVarF = f();
            h hVar = h.f47664a;
            return new com.moloco.sdk.internal.services.events.a(xVarH, bVarB, j0VarL, fVarM, eVarF, hVar.d(), hVar.g(), c(), BuildConfig.SDK_VERSION_NAME);
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b c() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b) f47683d.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.usertracker.b d() {
            return (com.moloco.sdk.internal.services.usertracker.b) f47681b.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.usertracker.d e() {
            return new com.moloco.sdk.internal.services.usertracker.a();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.usertracker.e f() {
            return (com.moloco.sdk.internal.services.usertracker.e) f47682c.getValue();
        }
    }

    @NotNull
    public final Context a() {
        return com.moloco.sdk.internal.android_context.b.b(null, 1, null);
    }
}
