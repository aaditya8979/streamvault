package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.http2.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Http2Connection.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g implements Closeable {
    public static final /* synthetic */ boolean A = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final ExecutorService f40501z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f40503b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f40509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ExecutorService f40510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.http2.l f40511j;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f40520s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m f40522u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Socket f40523v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.http2.j f40524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l f40525x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Set<Integer> f40526y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.i> f40504c = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f40512k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f40513l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f40514m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f40515n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f40516o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f40517p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f40518q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f40519r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f40521t = new m();

    /* JADX INFO: compiled from: Http2Connection.java */
    public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f40527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f40528c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f40527b = i10;
            this.f40528c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.b(this.f40527b, this.f40528c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f40530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f40531c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f40530b = i10;
            this.f40531c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.f40524w.a(this.f40530b, this.f40531c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(false, 2, 0);
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class d extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f40534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f40535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f40534b = i10;
            this.f40535c = list;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            if (g.this.f40511j.a(this.f40534b, this.f40535c)) {
                try {
                    g.this.f40524w.a(this.f40534b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                    synchronized (g.this) {
                        g.this.f40526y.remove(Integer.valueOf(this.f40534b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class e extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f40537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f40538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f40539d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f40537b = i10;
            this.f40538c = list;
            this.f40539d = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean zA = g.this.f40511j.a(this.f40537b, this.f40538c, this.f40539d);
            if (zA) {
                try {
                    g.this.f40524w.a(this.f40537b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zA || this.f40539d) {
                synchronized (g.this) {
                    g.this.f40526y.remove(Integer.valueOf(this.f40537b));
                }
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class f extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f40541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.thrid.okio.c f40542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f40543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f40544e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okio.c cVar, int i11, boolean z10) {
            super(str, objArr);
            this.f40541b = i10;
            this.f40542c = cVar;
            this.f40543d = i11;
            this.f40544e = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                boolean zA = g.this.f40511j.a(this.f40541b, this.f40542c, this.f40543d, this.f40544e);
                if (zA) {
                    g.this.f40524w.a(this.f40541b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                }
                if (zA || this.f40544e) {
                    synchronized (g.this) {
                        g.this.f40526y.remove(Integer.valueOf(this.f40541b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Http2Connection.java */
    public class C0507g extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f40546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f40547c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0507g(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f40546b = i10;
            this.f40547c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.f40511j.a(this.f40546b, this.f40547c);
            synchronized (g.this) {
                g.this.f40526y.remove(Integer.valueOf(this.f40546b));
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Socket f40549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f40550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okio.e f40551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okio.d f40552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f40553e = j.f40558a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okhttp.internal.http2.l f40554f = com.mbridge.msdk.thrid.okhttp.internal.http2.l.f40621a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f40555g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f40556h;

        public h(boolean z10) {
            this.f40555g = z10;
        }

        public h a(int i10) {
            this.f40556h = i10;
            return this;
        }

        public h a(j jVar) {
            this.f40553e = jVar;
            return this;
        }

        public h a(Socket socket, String str, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
            this.f40549a = socket;
            this.f40550b = str;
            this.f40551c = eVar;
            this.f40552d = dVar;
            return this;
        }

        public g a() {
            return new g(this);
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public final class i extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public i() {
            super("OkHttp %s ping", g.this.f40505d);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean z10;
            synchronized (g.this) {
                if (g.this.f40513l < g.this.f40512k) {
                    z10 = true;
                } else {
                    g.e(g.this);
                    z10 = false;
                }
            }
            if (z10) {
                g.this.h();
            } else {
                g.this.a(false, 1, 0);
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public static abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f40558a = new a();

        /* JADX INFO: compiled from: Http2Connection.java */
        public static class a extends j {
            @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
            public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
                iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException;
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public final class k extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f40559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f40561d;

        public k(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", g.this.f40505d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f40559b = z10;
            this.f40560c = i10;
            this.f40561d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(this.f40559b, this.f40560c, this.f40561d);
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class l extends com.mbridge.msdk.thrid.okhttp.internal.b implements h.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.mbridge.msdk.thrid.okhttp.internal.http2.h f40563b;

        /* JADX INFO: compiled from: Http2Connection.java */
        public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.i f40565b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) {
                super(str, objArr);
                this.f40565b = iVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                try {
                    g.this.f40503b.a(this.f40565b);
                } catch (IOException e10) {
                    com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Http2Connection.Listener failure for " + g.this.f40505d, e10);
                    try {
                        this.f40565b.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* JADX INFO: compiled from: Http2Connection.java */
        public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f40567b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f40568c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z10, m mVar) {
                super(str, objArr);
                this.f40567b = z10;
                this.f40568c = mVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                l.this.b(this.f40567b, this.f40568c);
            }
        }

        /* JADX INFO: compiled from: Http2Connection.java */
        public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                g gVar = g.this;
                gVar.f40503b.a(gVar);
            }
        }

        public l(com.mbridge.msdk.thrid.okhttp.internal.http2.h hVar) {
            super("OkHttp %s", g.this.f40505d);
            this.f40563b = hVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, int i12, boolean z10) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
            g.this.a(i11, list);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, long j10) {
            if (i10 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f40520s += j10;
                    gVar.notifyAll();
                }
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA != null) {
                synchronized (iVarA) {
                    iVarA.a(j10);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            if (g.this.b(i10)) {
                g.this.a(i10, bVar);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarC = g.this.c(i10);
            if (iVarC != null) {
                iVarC.d(bVar);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okio.f fVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            fVar.j();
            synchronized (g.this) {
                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f40504c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f40504c.size()]);
                g.this.f40508g = true;
            }
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                if (iVar.c() > i10 && iVar.f()) {
                    iVar.d(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                    g.this.c(iVar.c());
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11) {
            if (!z10) {
                try {
                    g.this.f40509h.execute(g.this.new k(true, i10, i11));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (g.this) {
                try {
                    if (i10 == 1) {
                        g.c(g.this);
                    } else if (i10 == 2) {
                        g.h(g.this);
                    } else if (i10 == 3) {
                        g.i(g.this);
                        g.this.notifyAll();
                    }
                } finally {
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
            if (g.this.b(i10)) {
                g.this.b(i10, list, z10);
                return;
            }
            synchronized (g.this) {
                com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
                if (iVarA != null) {
                    iVarA.a(list);
                    if (z10) {
                        iVarA.i();
                        return;
                    }
                    return;
                }
                if (g.this.f40508g) {
                    return;
                }
                g gVar = g.this;
                if (i10 <= gVar.f40506e) {
                    return;
                }
                if (i10 % 2 == gVar.f40507f % 2) {
                    return;
                }
                com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i10, g.this, false, z10, com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
                g gVar2 = g.this;
                gVar2.f40506e = i10;
                gVar2.f40504c.put(Integer.valueOf(i10), iVar);
                g.f40501z.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f40505d, Integer.valueOf(i10)}, iVar));
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11) throws IOException {
            if (g.this.b(i10)) {
                g.this.a(i10, eVar, i11, z10);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA == null) {
                g.this.c(i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                long j10 = i11;
                g.this.g(j10);
                eVar.skip(j10);
                return;
            }
            iVarA.a(eVar, i11);
            if (z10) {
                iVarA.i();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, m mVar) {
            try {
                g.this.f40509h.execute(new b("OkHttp %s ACK Settings", new Object[]{g.this.f40505d}, z10, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() throws Throwable {
            Throwable th2;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.INTERNAL_ERROR;
            try {
                try {
                    this.f40563b.a(this);
                    while (this.f40563b.a(false, (h.b) this)) {
                    }
                    bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR;
                    try {
                        try {
                            g.this.a(bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                        } catch (IOException unused) {
                            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar3 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
                            g.this.a(bVar3, bVar3);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            g.this.a(bVar, bVar2);
                        } catch (IOException unused2) {
                        }
                        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f40563b);
                        throw th2;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                bVar = bVar2;
            } catch (Throwable th4) {
                th2 = th4;
                bVar = bVar2;
                g.this.a(bVar, bVar2);
                com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f40563b);
                throw th2;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f40563b);
        }

        public void b(boolean z10, m mVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            long j10;
            synchronized (g.this.f40524w) {
                synchronized (g.this) {
                    int iC = g.this.f40522u.c();
                    if (z10) {
                        g.this.f40522u.a();
                    }
                    g.this.f40522u.a(mVar);
                    int iC2 = g.this.f40522u.c();
                    iVarArr = null;
                    if (iC2 == -1 || iC2 == iC) {
                        j10 = 0;
                    } else {
                        j10 = iC2 - iC;
                        if (!g.this.f40504c.isEmpty()) {
                            iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f40504c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f40504c.size()]);
                        }
                    }
                }
                try {
                    g gVar = g.this;
                    gVar.f40524w.a(gVar.f40522u);
                } catch (IOException unused) {
                    g.this.h();
                }
            }
            if (iVarArr != null) {
                for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j10);
                    }
                }
            }
            g.f40501z.execute(new c("OkHttp %s settings", g.this.f40505d));
        }
    }

    public g(h hVar) {
        m mVar = new m();
        this.f40522u = mVar;
        this.f40526y = new LinkedHashSet();
        this.f40511j = hVar.f40554f;
        boolean z10 = hVar.f40555g;
        this.f40502a = z10;
        this.f40503b = hVar.f40553e;
        int i10 = z10 ? 1 : 2;
        this.f40507f = i10;
        if (z10) {
            this.f40507f = i10 + 2;
        }
        if (z10) {
            this.f40521t.a(7, 16777216);
        }
        String str = hVar.f40550b;
        this.f40505d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Writer", str), false));
        this.f40509h = scheduledThreadPoolExecutor;
        if (hVar.f40556h != 0) {
            i iVar = new i();
            long j10 = hVar.f40556h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j10, j10, TimeUnit.MILLISECONDS);
        }
        this.f40510i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Push Observer", str), true));
        mVar.a(7, 65535);
        mVar.a(5, 16384);
        this.f40520s = mVar.c();
        this.f40523v = hVar.f40549a;
        this.f40524w = new com.mbridge.msdk.thrid.okhttp.internal.http2.j(hVar.f40552d, z10);
        this.f40525x = new l(new com.mbridge.msdk.thrid.okhttp.internal.http2.h(hVar.f40551c, z10));
    }

    private com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws IOException {
        int i11;
        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar;
        boolean z11;
        boolean z12 = !z10;
        synchronized (this.f40524w) {
            synchronized (this) {
                if (this.f40507f > 1073741823) {
                    a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                }
                if (this.f40508g) {
                    throw new com.mbridge.msdk.thrid.okhttp.internal.http2.a();
                }
                i11 = this.f40507f;
                this.f40507f = i11 + 2;
                iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i11, this, z12, false, null);
                z11 = !z10 || this.f40520s == 0 || iVar.f40584b == 0;
                if (iVar.g()) {
                    this.f40504c.put(Integer.valueOf(i11), iVar);
                }
            }
            if (i10 == 0) {
                this.f40524w.a(z12, i11, i10, list);
            } else {
                if (this.f40502a) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.f40524w.a(i10, i11, list);
            }
        }
        if (z11) {
            this.f40524w.flush();
        }
        return iVar;
    }

    private synchronized void a(com.mbridge.msdk.thrid.okhttp.internal.b bVar) {
        if (!this.f40508g) {
            this.f40510i.execute(bVar);
        }
    }

    public static /* synthetic */ long c(g gVar) {
        long j10 = gVar.f40513l;
        gVar.f40513l = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long e(g gVar) {
        long j10 = gVar.f40512k;
        gVar.f40512k = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long h(g gVar) {
        long j10 = gVar.f40515n;
        gVar.f40515n = 1 + j10;
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
            a(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    public static /* synthetic */ long i(g gVar) {
        long j10 = gVar.f40517p;
        gVar.f40517p = 1 + j10;
        return j10;
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10) {
        return this.f40504c.get(Integer.valueOf(i10));
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http2.i a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws IOException {
        return a(0, list, z10);
    }

    public void a(int i10, long j10) {
        try {
            this.f40509h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f40505d, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        a(new C0507g("OkHttp %s Push Reset[%s]", new Object[]{this.f40505d, Integer.valueOf(i10)}, i10, bVar));
    }

    public void a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10) throws IOException {
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        long j10 = i11;
        eVar.e(j10);
        eVar.b(cVar, j10);
        if (cVar.size() == j10) {
            a(new f("OkHttp %s Push Data[%s]", new Object[]{this.f40505d, Integer.valueOf(i10)}, i10, cVar, i11, z10));
            return;
        }
        throw new IOException(cVar.size() + " != " + i11);
    }

    public void a(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        synchronized (this) {
            if (this.f40526y.contains(Integer.valueOf(i10))) {
                c(i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                return;
            }
            this.f40526y.add(Integer.valueOf(i10));
            try {
                a(new d("OkHttp %s Push Request[%s]", new Object[]{this.f40505d, Integer.valueOf(i10)}, i10, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f40524w.h());
        r6 = r2;
        r8.f40520s -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r9, boolean r10, com.mbridge.msdk.thrid.okio.c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r12 = r8.f40524w
            r12.a(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r4 = r8.f40520s     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L30
            java.util.Map<java.lang.Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.i> r2 = r8.f40504c     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r2 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L56
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L56
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r4 = r8.f40524w     // Catch: java.lang.Throwable -> L56
            int r4 = r4.h()     // Catch: java.lang.Throwable -> L56
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.f40520s     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.f40520s = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r4 = r8.f40524w
            if (r10 == 0) goto L51
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = r3
        L52:
            r4.a(r5, r9, r11, r2)
            goto Ld
        L56:
            r9 = move-exception
            goto L65
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r9.interrupt()     // Catch: java.lang.Throwable -> L56
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.g.a(int, boolean, com.mbridge.msdk.thrid.okio.c, long):void");
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        synchronized (this.f40524w) {
            synchronized (this) {
                if (this.f40508g) {
                    return;
                }
                this.f40508g = true;
                this.f40524w.a(this.f40506e, bVar, com.mbridge.msdk.thrid.okhttp.internal.c.f40306a);
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2) throws IOException {
        if (!A && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr = null;
        try {
            a(bVar);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        synchronized (this) {
            if (!this.f40504c.isEmpty()) {
                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) this.f40504c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[this.f40504c.size()]);
                this.f40504c.clear();
            }
        }
        if (iVarArr != null) {
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                try {
                    iVar.a(bVar2);
                } catch (IOException e11) {
                    if (e != null) {
                        e = e11;
                    }
                }
            }
        }
        try {
            this.f40524w.close();
        } catch (IOException e12) {
            if (e == null) {
                e = e12;
            }
        }
        try {
            this.f40523v.close();
        } catch (IOException e13) {
            e = e13;
        }
        this.f40509h.shutdown();
        this.f40510i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void a(boolean z10) throws IOException {
        if (z10) {
            this.f40524w.d();
            this.f40524w.b(this.f40521t);
            if (this.f40521t.c() != 65535) {
                this.f40524w.a(0, r5 - 65535);
            }
        }
        new Thread(this.f40525x).start();
    }

    public void a(boolean z10, int i10, int i11) {
        try {
            this.f40524w.a(z10, i10, i11);
        } catch (IOException unused) {
            h();
        }
    }

    public void b(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        this.f40524w.a(i10, bVar);
    }

    public void b(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) {
        try {
            a(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f40505d, Integer.valueOf(i10)}, i10, list, z10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public boolean b(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i c(int i10) {
        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarRemove;
        iVarRemove = this.f40504c.remove(Integer.valueOf(i10));
        notifyAll();
        return iVarRemove;
    }

    public void c(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        try {
            this.f40509h.execute(new a("OkHttp %s stream %d", new Object[]{this.f40505d, Integer.valueOf(i10)}, i10, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
    }

    public synchronized boolean f(long j10) {
        if (this.f40508g) {
            return false;
        }
        if (this.f40515n < this.f40514m) {
            if (j10 >= this.f40518q) {
                return false;
            }
        }
        return true;
    }

    public void flush() throws IOException {
        this.f40524w.flush();
    }

    public synchronized void g(long j10) {
        long j11 = this.f40519r + j10;
        this.f40519r = j11;
        if (j11 >= this.f40521t.c() / 2) {
            a(0, this.f40519r);
            this.f40519r = 0L;
        }
    }

    public synchronized int k() {
        return this.f40522u.b(Integer.MAX_VALUE);
    }

    public void l() {
        synchronized (this) {
            long j10 = this.f40515n;
            long j11 = this.f40514m;
            if (j10 < j11) {
                return;
            }
            this.f40514m = j11 + 1;
            this.f40518q = System.nanoTime() + 1000000000;
            try {
                this.f40509h.execute(new c("OkHttp %s ping", this.f40505d));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public void m() throws IOException {
        a(true);
    }
}
