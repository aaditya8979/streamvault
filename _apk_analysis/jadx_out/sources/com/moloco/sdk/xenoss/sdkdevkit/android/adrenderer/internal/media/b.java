package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.C3978d4;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h;
import gl.s;
import gl.x;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpRequestRetryConfig;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import zk.b0;
import zk.d0;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final o f48158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final g0 f48159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.error.b f48160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final HttpClient f48161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f48162e;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl", f = "ChunkedMediaDownloader.kt", l = {294, 294}, m = "downloadFullFile")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f48163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f48164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f48165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f48166d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f48168f;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48166d = obj;
            this.f48168f |= Integer.MIN_VALUE;
            return b.this.o(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$b, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl$downloadMedia$2", f = "ChunkedMediaDownloader.kt", l = {95, 106, 138, 149}, m = "invokeSuspend")
    public static final class C0606b extends SuspendLambda implements sn.p<l0, hn.c<? super n.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f48172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f48173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f48174f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f48175g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48177i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ File f48178j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a f48179k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48180l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0606b(String str, File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, String str2, hn.c<? super C0606b> cVar) {
            super(2, cVar);
            this.f48177i = str;
            this.f48178j = file;
            this.f48179k = aVar;
            this.f48180l = str2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super n.a> cVar) {
            return ((C0606b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return b.this.new C0606b(this.f48177i, this.f48178j, this.f48179k, this.f48180l, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x041e A[Catch: Exception -> 0x041c, TRY_LEAVE, TryCatch #0 {Exception -> 0x041c, blocks: (B:49:0x016b, B:52:0x0186, B:54:0x018e, B:56:0x0192, B:57:0x019c, B:59:0x019f, B:63:0x01f2, B:66:0x0203, B:68:0x025e, B:70:0x02b5, B:72:0x02bc, B:78:0x0302, B:82:0x0337, B:86:0x0359, B:88:0x035d, B:91:0x0379, B:92:0x038f, B:77:0x02e6, B:94:0x03b2, B:95:0x03b7, B:96:0x03b8, B:102:0x041e), top: B:112:0x016b }] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x018e A[Catch: Exception -> 0x041c, TryCatch #0 {Exception -> 0x041c, blocks: (B:49:0x016b, B:52:0x0186, B:54:0x018e, B:56:0x0192, B:57:0x019c, B:59:0x019f, B:63:0x01f2, B:66:0x0203, B:68:0x025e, B:70:0x02b5, B:72:0x02bc, B:78:0x0302, B:82:0x0337, B:86:0x0359, B:88:0x035d, B:91:0x0379, B:92:0x038f, B:77:0x02e6, B:94:0x03b2, B:95:0x03b7, B:96:0x03b8, B:102:0x041e), top: B:112:0x016b }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x019f A[Catch: Exception -> 0x041c, TryCatch #0 {Exception -> 0x041c, blocks: (B:49:0x016b, B:52:0x0186, B:54:0x018e, B:56:0x0192, B:57:0x019c, B:59:0x019f, B:63:0x01f2, B:66:0x0203, B:68:0x025e, B:70:0x02b5, B:72:0x02bc, B:78:0x0302, B:82:0x0337, B:86:0x0359, B:88:0x035d, B:91:0x0379, B:92:0x038f, B:77:0x02e6, B:94:0x03b2, B:95:0x03b7, B:96:0x03b8, B:102:0x041e), top: B:112:0x016b }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0202 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0203 A[Catch: Exception -> 0x041c, TryCatch #0 {Exception -> 0x041c, blocks: (B:49:0x016b, B:52:0x0186, B:54:0x018e, B:56:0x0192, B:57:0x019c, B:59:0x019f, B:63:0x01f2, B:66:0x0203, B:68:0x025e, B:70:0x02b5, B:72:0x02bc, B:78:0x0302, B:82:0x0337, B:86:0x0359, B:88:0x035d, B:91:0x0379, B:92:0x038f, B:77:0x02e6, B:94:0x03b2, B:95:0x03b7, B:96:0x03b8, B:102:0x041e), top: B:112:0x016b }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x035d A[Catch: Exception -> 0x041c, TryCatch #0 {Exception -> 0x041c, blocks: (B:49:0x016b, B:52:0x0186, B:54:0x018e, B:56:0x0192, B:57:0x019c, B:59:0x019f, B:63:0x01f2, B:66:0x0203, B:68:0x025e, B:70:0x02b5, B:72:0x02bc, B:78:0x0302, B:82:0x0337, B:86:0x0359, B:88:0x035d, B:91:0x0379, B:92:0x038f, B:77:0x02e6, B:94:0x03b2, B:95:0x03b7, B:96:0x03b8, B:102:0x041e), top: B:112:0x016b }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0373  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0379 A[Catch: Exception -> 0x041c, TryCatch #0 {Exception -> 0x041c, blocks: (B:49:0x016b, B:52:0x0186, B:54:0x018e, B:56:0x0192, B:57:0x019c, B:59:0x019f, B:63:0x01f2, B:66:0x0203, B:68:0x025e, B:70:0x02b5, B:72:0x02bc, B:78:0x0302, B:82:0x0337, B:86:0x0359, B:88:0x035d, B:91:0x0379, B:92:0x038f, B:77:0x02e6, B:94:0x03b2, B:95:0x03b7, B:96:0x03b8, B:102:0x041e), top: B:112:0x016b }] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x038f A[Catch: Exception -> 0x041c, TryCatch #0 {Exception -> 0x041c, blocks: (B:49:0x016b, B:52:0x0186, B:54:0x018e, B:56:0x0192, B:57:0x019c, B:59:0x019f, B:63:0x01f2, B:66:0x0203, B:68:0x025e, B:70:0x02b5, B:72:0x02bc, B:78:0x0302, B:82:0x0337, B:86:0x0359, B:88:0x035d, B:91:0x0379, B:92:0x038f, B:77:0x02e6, B:94:0x03b2, B:95:0x03b7, B:96:0x03b8, B:102:0x041e), top: B:112:0x016b }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x040c -> B:99:0x040f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r43) {
            /*
                Method dump skipped, instruction units count: 1129
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.C0606b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl", f = "ChunkedMediaDownloader.kt", l = {276, 278}, m = "writeChunkToFile")
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f48181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f48182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f48183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f48184d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f48186f;

        public c(hn.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48184d = obj;
            this.f48186f |= Integer.MIN_VALUE;
            return b.this.x(null, null, this);
        }
    }

    public b(@NotNull o oVar, @NotNull g0 g0Var, @NotNull com.moloco.sdk.internal.error.b bVar, @NotNull HttpClient httpClient) {
        tn.p.k(oVar, "mediaConfig");
        tn.p.k(g0Var, "connectivityService");
        tn.p.k(bVar, "errorReportingService");
        tn.p.k(httpClient, "httpClient");
        this.f48158a = oVar;
        this.f48159b = g0Var;
        this.f48160c = bVar;
        this.f48161d = httpClient;
        this.f48162e = "ChunkedMediaDownloader";
    }

    public static final long d(b0 b0Var, int i10) {
        tn.p.k(b0Var, "$this$delayMillis");
        return 100L;
    }

    public static final bn.r e(long j10, b bVar, int i10, String str, gl.n nVar) {
        tn.p.k(nVar, "$this$headers");
        String str2 = "bytes=" + j10 + '-' + Math.min(j10 + ((long) bVar.f48158a.a()), i10);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str3 = bVar.f48162e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Adding ");
        s sVar = s.f62569a;
        sb2.append(sVar.t());
        sb2.append(" header: ");
        sb2.append(str2);
        MolocoLogger.info$default(molocoLogger, str3, sb2.toString(), null, false, 12, null);
        nVar.e(sVar.t(), str2);
        if (str != null) {
            MolocoLogger.info$default(molocoLogger, bVar.f48162e, "Adding " + sVar.p() + " header: " + str, null, false, 12, null);
            nVar.e(sVar.p(), str);
            MolocoLogger.info$default(molocoLogger, bVar.f48162e, "Adding " + sVar.l() + " header: " + str, null, false, 12, null);
            nVar.e(sVar.l(), str);
        }
        return bn.r.f5635a;
    }

    public static final bn.r f(final b bVar, HttpRequestRetryConfig httpRequestRetryConfig) {
        tn.p.k(httpRequestRetryConfig, "$this$retry");
        httpRequestRetryConfig.D(10);
        HttpRequestRetryConfig.g(httpRequestRetryConfig, false, new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return Long.valueOf(b.d((b0) obj, ((Integer) obj2).intValue()));
            }
        }, 1, null);
        httpRequestRetryConfig.v(10, true);
        httpRequestRetryConfig.A(10);
        httpRequestRetryConfig.r(new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return b.g(this.f48202b, (d0) obj, (cl.d) obj2);
            }
        });
        return bn.r.f5635a;
    }

    public static final bn.r g(b bVar, d0 d0Var, cl.d dVar) {
        tn.p.k(d0Var, "$this$modifyRequest");
        tn.p.k(dVar, "it");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, bVar.f48162e, "Retry attempt #" + d0Var.b() + " for " + d0Var.a().i(), null, false, 12, null);
        return bn.r.f5635a;
    }

    public final String C(File file) {
        File fileZ = z(file);
        if (fileZ.exists()) {
            return on.g.l(fileZ, null, 1, null);
        }
        return null;
    }

    public final String D(File file) {
        File fileE = E(file);
        if (fileE.exists()) {
            return on.g.l(fileE, null, 1, null);
        }
        return null;
    }

    public final File E(File file) {
        return new File(file.getParent(), file.getName() + ".range");
    }

    public final void F(File file) {
        z(file).delete();
    }

    public final void G(File file) {
        E(file).delete();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public boolean a(@NotNull File file) {
        tn.p.k(file, C3978d4.i.f31327b);
        return file.exists() && !E(file).exists();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public boolean b(@NotNull File file) {
        tn.p.k(file, C3978d4.i.f31327b);
        return file.exists() && E(file).exists();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    @Nullable
    public Object c(@NotNull String str, @NotNull File file, @NotNull String str2, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, @NotNull hn.c<? super n.a> cVar) {
        return p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new C0606b(str, file, aVar, str2, null), cVar);
    }

    public final n.a k(File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar) {
        F(file);
        G(file);
        if (aVar != null) {
            aVar.b(new h.a(file));
        }
        return new n.a.b(file);
    }

    public final n.a l(File file, dl.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar) {
        int iE0 = cVar.d().e0();
        if (400 <= iE0 && iE0 < 500) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f48162e, "Failed to fetch media from url: " + HttpResponseKt.d(cVar).getUrl() + ", status: " + cVar.d(), null, false, 12, null);
            if (aVar != null) {
                aVar.a(new h.b(n.a.AbstractC0607a.e.f48250a));
            }
            return n.a.AbstractC0607a.e.f48250a;
        }
        if (500 > iE0 || iE0 >= 600) {
            return new n.a.b(file);
        }
        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f48162e, "Failed to fetch media from url: " + HttpResponseKt.d(cVar).getUrl() + ", status: " + cVar.d(), null, false, 12, null);
        if (aVar != null) {
            aVar.a(new h.b(n.a.AbstractC0607a.h.f48253a));
        }
        return n.a.AbstractC0607a.h.f48253a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.io.File r18, dl.c r19, hn.c<? super bn.r> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.o(java.io.File, dl.c, hn.c):java.lang.Object");
    }

    public final Object p(String str, final long j10, final int i10, final String str2, hn.c<? super dl.c> cVar) {
        HttpClient httpClient = this.f48161d;
        cl.d dVar = new cl.d();
        cl.f.c(dVar, str);
        HttpRequestRetryKt.v(dVar, new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c
            @Override // sn.l
            public final Object invoke(Object obj) {
                return b.f(this.f48187b, (HttpRequestRetryConfig) obj);
            }
        });
        cl.f.b(dVar, new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e
            @Override // sn.l
            public final Object invoke(Object obj) {
                return b.e(j10, this, i10, str2, (gl.n) obj);
            }
        });
        dVar.o(x.f62623b.b());
        return new HttpStatement(dVar, httpClient).b(cVar);
    }

    public final void t(File file, dl.c cVar) throws IOException {
        gl.m headers = cVar.getHeaders();
        s sVar = s.f62569a;
        String str = headers.get(sVar.l());
        if (str != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f48162e, sVar.l() + ": " + str, null, false, 12, null);
            on.g.o(z(file), str, null, 2, null);
            return;
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.f48162e, "No " + sVar.l() + " in header", null, false, 12, null);
        F(file);
    }

    public final void u(File file, String str) throws IOException {
        on.g.o(E(file), str, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[LOOP:0: B:27:0x0083->B:29:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007e -> B:26:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.io.File r13, dl.c r14, hn.c<? super bn.r> r15) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.c
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$c r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.c) r0
            int r1 = r0.f48186f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48186f = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$c r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$c
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f48184d
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f48186f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r13 = r0.f48183c
            io.ktor.utils.io.a r13 = (io.ktor.utils.io.a) r13
            java.lang.Object r14 = r0.f48182b
            java.io.File r14 = (java.io.File) r14
            java.lang.Object r2 = r0.f48181a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b r2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b) r2
            kotlin.c.b(r15)
            goto L81
        L38:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L40:
            java.lang.Object r13 = r0.f48182b
            java.io.File r13 = (java.io.File) r13
            java.lang.Object r14 = r0.f48181a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b r14 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b) r14
            kotlin.c.b(r15)
            goto L5d
        L4c:
            kotlin.c.b(r15)
            r0.f48181a = r12
            r0.f48182b = r13
            r0.f48186f = r4
            java.lang.Object r15 = io.ktor.client.statement.HttpResponseKt.a(r14, r0)
            if (r15 != r1) goto L5c
            return r1
        L5c:
            r14 = r12
        L5d:
            io.ktor.utils.io.a r15 = (io.ktor.utils.io.a) r15
            r2 = r14
            r14 = r13
            r13 = r15
        L62:
            boolean r15 = r13.h()
            if (r15 != 0) goto Lb7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o r15 = r2.f48158a
            int r15 = r15.a()
            long r4 = (long) r15
            r6 = 2
            long r4 = r4 * r6
            r0.f48181a = r2
            r0.f48182b = r14
            r0.f48183c = r13
            r0.f48186f = r3
            java.lang.Object r15 = io.ktor.utils.io.ByteReadChannelOperationsKt.k(r13, r4, r0)
            if (r15 != r1) goto L81
            return r1
        L81:
            no.r r15 = (no.r) r15
        L83:
            boolean r4 = ul.g.a(r15)
            if (r4 != 0) goto L62
            byte[] r4 = ul.h.a(r15)
            on.g.d(r14, r4)
            com.moloco.sdk.internal.MolocoLogger r5 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r6 = r2.f48162e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "dst file length: "
            r4.append(r7)
            long r7 = r14.length()
            r4.append(r7)
            java.lang.String r7 = " bytes"
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r5, r6, r7, r8, r9, r10, r11)
            goto L83
        Lb7:
            bn.r r13 = bn.r.f5635a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.x(java.io.File, dl.c, hn.c):java.lang.Object");
    }

    public final File z(File file) {
        return new File(file.getParent(), file.getName() + ".etag");
    }
}
