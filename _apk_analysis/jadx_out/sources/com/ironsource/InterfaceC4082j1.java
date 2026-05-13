package com.ironsource;

import com.ironsource.C4136m1;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC4082j1 {

    /* JADX INFO: renamed from: com.ironsource.j1$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0390a f31980a = new C0390a(null);

        /* JADX INFO: renamed from: com.ironsource.j1$a$a, reason: collision with other inner class name */
        public static final class C0390a {
            private C0390a() {
            }

            public /* synthetic */ C0390a(tn.i iVar) {
                this();
            }

            @NotNull
            public final InterfaceC4082j1 a() {
                return new b(406, new ArrayList());
            }

            @NotNull
            public final InterfaceC4082j1 a(@NotNull C4136m1.j jVar, @NotNull C4136m1.k kVar) {
                tn.p.k(jVar, IronSourceConstants.EVENTS_ERROR_CODE);
                tn.p.k(kVar, "errorReason");
                return new b(403, cn.w.s(jVar, kVar));
            }

            @NotNull
            public final InterfaceC4082j1 a(boolean z10) {
                return z10 ? new b(410, new ArrayList()) : new b(411, new ArrayList());
            }

            @NotNull
            public final InterfaceC4082j1 a(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
                tn.p.k(interfaceC4156n1Arr, "entity");
                return new b(407, cn.w.s(Arrays.copyOf(interfaceC4156n1Arr, interfaceC4156n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4082j1 b(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
                tn.p.k(interfaceC4156n1Arr, "entity");
                return new b(404, cn.w.s(Arrays.copyOf(interfaceC4156n1Arr, interfaceC4156n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4082j1 c(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
                tn.p.k(interfaceC4156n1Arr, "entity");
                return new b(409, cn.w.s(Arrays.copyOf(interfaceC4156n1Arr, interfaceC4156n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4082j1 d(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
                tn.p.k(interfaceC4156n1Arr, "entity");
                return new b(401, cn.w.s(Arrays.copyOf(interfaceC4156n1Arr, interfaceC4156n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4082j1 e(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
                tn.p.k(interfaceC4156n1Arr, "entity");
                return new b(408, cn.w.s(Arrays.copyOf(interfaceC4156n1Arr, interfaceC4156n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4082j1 f(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
                tn.p.k(interfaceC4156n1Arr, "entity");
                return new b(405, cn.w.s(Arrays.copyOf(interfaceC4156n1Arr, interfaceC4156n1Arr.length)));
            }
        }

        /* JADX INFO: renamed from: com.ironsource.j1$a$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f31981a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f31982b = 401;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f31983c = 403;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f31984d = 404;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f31985e = 405;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f31986f = 406;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f31987g = 407;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f31988h = 408;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f31989i = 409;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f31990j = 410;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f31991k = 411;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC4082j1 a() {
            return f31980a.a();
        }

        @NotNull
        public static final InterfaceC4082j1 a(@NotNull C4136m1.j jVar, @NotNull C4136m1.k kVar) {
            return f31980a.a(jVar, kVar);
        }

        @NotNull
        public static final InterfaceC4082j1 a(boolean z10) {
            return f31980a.a(z10);
        }

        @NotNull
        public static final InterfaceC4082j1 a(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
            return f31980a.a(interfaceC4156n1Arr);
        }

        @NotNull
        public static final InterfaceC4082j1 b(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
            return f31980a.b(interfaceC4156n1Arr);
        }

        @NotNull
        public static final InterfaceC4082j1 c(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
            return f31980a.c(interfaceC4156n1Arr);
        }

        @NotNull
        public static final InterfaceC4082j1 d(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
            return f31980a.d(interfaceC4156n1Arr);
        }

        @NotNull
        public static final InterfaceC4082j1 e(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
            return f31980a.e(interfaceC4156n1Arr);
        }

        @NotNull
        public static final InterfaceC4082j1 f(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
            return f31980a.f(interfaceC4156n1Arr);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j1$b */
    public static final class b implements InterfaceC4082j1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<InterfaceC4156n1> f31993b;

        public b(int i10, @NotNull List<InterfaceC4156n1> list) {
            tn.p.k(list, "arrayList");
            this.f31992a = i10;
            this.f31993b = list;
        }

        @Override // com.ironsource.InterfaceC4082j1
        public void a(@NotNull InterfaceC4209q1 interfaceC4209q1) {
            tn.p.k(interfaceC4209q1, "analytics");
            interfaceC4209q1.a(this.f31992a, this.f31993b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j1$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f31994a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.j1$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final InterfaceC4082j1 a() {
                return new b(201, new ArrayList());
            }

            @NotNull
            public final InterfaceC4082j1 a(@NotNull C4136m1.j jVar, @NotNull C4136m1.k kVar, @NotNull C4136m1.f fVar) {
                tn.p.k(jVar, IronSourceConstants.EVENTS_ERROR_CODE);
                tn.p.k(kVar, "errorReason");
                tn.p.k(fVar, "duration");
                return new b(203, cn.w.s(jVar, kVar, fVar));
            }

            @NotNull
            public final InterfaceC4082j1 a(@NotNull C4136m1.l lVar) {
                tn.p.k(lVar, IronSourceConstants.EVENTS_EXT1);
                return new b(207, cn.w.s(lVar));
            }

            @NotNull
            public final InterfaceC4082j1 a(@NotNull InterfaceC4156n1 interfaceC4156n1) {
                tn.p.k(interfaceC4156n1, "duration");
                return new b(202, cn.w.s(interfaceC4156n1));
            }

            @NotNull
            public final InterfaceC4082j1 a(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
                tn.p.k(interfaceC4156n1Arr, "entity");
                return new b(204, cn.w.s(Arrays.copyOf(interfaceC4156n1Arr, interfaceC4156n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4082j1 b() {
                return new b(206, new ArrayList());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.j1$c$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f31995a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f31996b = 201;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f31997c = 202;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f31998d = 203;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f31999e = 204;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f32000f = 205;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f32001g = 206;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f32002h = 207;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC4082j1 a() {
            return f31994a.a();
        }

        @NotNull
        public static final InterfaceC4082j1 a(@NotNull C4136m1.j jVar, @NotNull C4136m1.k kVar, @NotNull C4136m1.f fVar) {
            return f31994a.a(jVar, kVar, fVar);
        }

        @NotNull
        public static final InterfaceC4082j1 a(@NotNull C4136m1.l lVar) {
            return f31994a.a(lVar);
        }

        @NotNull
        public static final InterfaceC4082j1 a(@NotNull InterfaceC4156n1 interfaceC4156n1) {
            return f31994a.a(interfaceC4156n1);
        }

        @NotNull
        public static final InterfaceC4082j1 a(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
            return f31994a.a(interfaceC4156n1Arr);
        }

        @NotNull
        public static final InterfaceC4082j1 b() {
            return f31994a.b();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j1$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f32003a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.j1$d$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final InterfaceC4082j1 a() {
                return new b(101, new ArrayList());
            }

            @NotNull
            public final InterfaceC4082j1 a(@NotNull C4136m1.f fVar) {
                tn.p.k(fVar, "duration");
                return new b(103, cn.w.s(fVar));
            }

            @NotNull
            public final InterfaceC4082j1 a(@NotNull C4136m1.j jVar, @NotNull C4136m1.k kVar) {
                tn.p.k(jVar, IronSourceConstants.EVENTS_ERROR_CODE);
                tn.p.k(kVar, "errorReason");
                return new b(109, cn.w.s(jVar, kVar));
            }

            @NotNull
            public final InterfaceC4082j1 a(@NotNull C4136m1.j jVar, @NotNull C4136m1.k kVar, @NotNull C4136m1.f fVar, @NotNull C4136m1.l lVar) {
                tn.p.k(jVar, IronSourceConstants.EVENTS_ERROR_CODE);
                tn.p.k(kVar, "errorReason");
                tn.p.k(fVar, "duration");
                tn.p.k(lVar, "loaderState");
                return new b(104, cn.w.s(jVar, kVar, fVar, lVar));
            }

            @NotNull
            public final InterfaceC4082j1 a(@NotNull InterfaceC4156n1 interfaceC4156n1) {
                tn.p.k(interfaceC4156n1, IronSourceConstants.EVENTS_EXT1);
                return new b(111, cn.w.s(interfaceC4156n1));
            }

            @NotNull
            public final InterfaceC4082j1 a(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
                tn.p.k(interfaceC4156n1Arr, "entity");
                return new b(102, cn.w.s(Arrays.copyOf(interfaceC4156n1Arr, interfaceC4156n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4082j1 b() {
                return new b(112, new ArrayList());
            }

            @NotNull
            public final InterfaceC4082j1 b(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
                tn.p.k(interfaceC4156n1Arr, "entity");
                return new b(110, cn.w.s(Arrays.copyOf(interfaceC4156n1Arr, interfaceC4156n1Arr.length)));
            }

            @NotNull
            public final b c() {
                return new b(105, new ArrayList());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.j1$d$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f32004a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32005b = 101;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f32006c = 102;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f32007d = 103;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f32008e = 104;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f32009f = 105;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f32010g = 109;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f32011h = 110;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f32012i = 111;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f32013j = 112;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC4082j1 a() {
            return f32003a.a();
        }

        @NotNull
        public static final InterfaceC4082j1 a(@NotNull C4136m1.f fVar) {
            return f32003a.a(fVar);
        }

        @NotNull
        public static final InterfaceC4082j1 a(@NotNull C4136m1.j jVar, @NotNull C4136m1.k kVar) {
            return f32003a.a(jVar, kVar);
        }

        @NotNull
        public static final InterfaceC4082j1 a(@NotNull C4136m1.j jVar, @NotNull C4136m1.k kVar, @NotNull C4136m1.f fVar, @NotNull C4136m1.l lVar) {
            return f32003a.a(jVar, kVar, fVar, lVar);
        }

        @NotNull
        public static final InterfaceC4082j1 a(@NotNull InterfaceC4156n1 interfaceC4156n1) {
            return f32003a.a(interfaceC4156n1);
        }

        @NotNull
        public static final InterfaceC4082j1 a(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
            return f32003a.a(interfaceC4156n1Arr);
        }

        @NotNull
        public static final InterfaceC4082j1 b() {
            return f32003a.b();
        }

        @NotNull
        public static final InterfaceC4082j1 b(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
            return f32003a.b(interfaceC4156n1Arr);
        }

        @NotNull
        public static final b c() {
            return f32003a.c();
        }
    }

    void a(@NotNull InterfaceC4209q1 interfaceC4209q1);
}
