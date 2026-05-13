package io.bidmachine.rendering.internal;

import kotlin.jvm.internal.Lambda;
import p000do.h0;
import p000do.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f70435i = new e(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h f70436j = new h(a.f70445a, b.f70446a, c.f70447a, d.f70448a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sn.a f70437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sn.a f70438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sn.a f70439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sn.a f70440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bn.g f70441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bn.g f70442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bn.g f70443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bn.g f70444h;

    public static final class a extends Lambda implements sn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70445a = new a();

        public a() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return w0.c();
        }
    }

    public static final class b extends Lambda implements sn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f70446a = new b();

        public b() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return w0.c().M();
        }
    }

    public static final class c extends Lambda implements sn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f70447a = new c();

        public c() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return w0.b();
        }
    }

    public static final class d extends Lambda implements sn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f70448a = new d();

        public d() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return w0.a();
        }
    }

    public static final class e {
        private e() {
        }

        public /* synthetic */ e(tn.i iVar) {
            this();
        }

        public final h a() {
            return h.f70436j;
        }
    }

    public static final class f extends Lambda implements sn.a {
        public f() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return (h0) h.this.f70440d.invoke();
        }
    }

    public static final class g extends Lambda implements sn.a {
        public g() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return (h0) h.this.f70439c.invoke();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.h$h, reason: collision with other inner class name */
    public static final class C0834h extends Lambda implements sn.a {
        public C0834h() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return (h0) h.this.f70437a.invoke();
        }
    }

    public static final class i extends Lambda implements sn.a {
        public i() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return (h0) h.this.f70438b.invoke();
        }
    }

    public h(sn.a aVar, sn.a aVar2, sn.a aVar3, sn.a aVar4) {
        tn.p.k(aVar, "mainProvider");
        tn.p.k(aVar2, "mainImmediateProvider");
        tn.p.k(aVar3, "ioProvider");
        tn.p.k(aVar4, "defaultProvider");
        this.f70437a = aVar;
        this.f70438b = aVar2;
        this.f70439c = aVar3;
        this.f70440d = aVar4;
        this.f70441e = kotlin.b.b(new C0834h());
        this.f70442f = kotlin.b.b(new i());
        this.f70443g = kotlin.b.b(new g());
        this.f70444h = kotlin.b.b(new f());
    }

    public static final h f() {
        return f70435i.a();
    }

    public final h0 b() {
        return (h0) this.f70444h.getValue();
    }

    public final h0 c() {
        return (h0) this.f70443g.getValue();
    }

    public final h0 d() {
        return (h0) this.f70441e.getValue();
    }

    public final h0 e() {
        return (h0) this.f70442f.getValue();
    }
}
