package io.ktor.client.plugins;

import al.i;
import bn.r;
import cl.b;
import cl.d;
import cn.f0;
import gl.m;
import gl.x;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpCallValidatorKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.plugins.api.SetupRequest;
import io.ktor.http.Url;
import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import tn.t;
import uk.h;
import zk.j;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class HttpCallValidatorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final rs.c f71111a = pl.a.a("io.ktor.client.plugins.HttpCallValidator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final al.b<j> f71112b = i.b("HttpResponseValidator", HttpCallValidatorKt$HttpCallValidator$1.INSTANCE, new l() { // from class: zk.k
        @Override // sn.l
        public final Object invoke(Object obj) {
            return HttpCallValidatorKt.b((al.d) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final kl.a<Boolean> f71113c;

    /* JADX INFO: compiled from: HttpCallValidator.kt */
    public static final class a implements cl.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f71114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Url f71115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final kl.b f71116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final m f71117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d f71118f;

        public a(d dVar) {
            this.f71118f = dVar;
            this.f71114b = dVar.h();
            this.f71115c = dVar.i().b();
            this.f71116d = dVar.c();
            this.f71117e = dVar.getHeaders().p();
        }

        @Override // cl.b
        public HttpClientCall L() {
            throw new IllegalStateException("Call is not initialized".toString());
        }

        @Override // cl.b
        public kl.b getAttributes() {
            return this.f71116d;
        }

        @Override // cl.b, p000do.l0
        public kotlin.coroutines.d getCoroutineContext() {
            return b.a.a(this);
        }

        @Override // gl.u
        public m getHeaders() {
            return this.f71117e;
        }

        @Override // cl.b
        public x getMethod() {
            return this.f71114b;
        }

        @Override // cl.b
        public Url getUrl() {
            return this.f71115c;
        }
    }

    static {
        KType kTypeM;
        KClass kClassB = t.b(Boolean.class);
        try {
            kTypeM = t.m(Boolean.TYPE);
        } catch (Throwable unused) {
            kTypeM = null;
        }
        f71113c = new kl.a<>("ExpectSuccessAttributeKey", new rl.a(kClassB, kTypeM));
    }

    public static final r b(al.d dVar) {
        p.k(dVar, "$this$createClientPlugin");
        List listR0 = f0.R0(((j) dVar.e()).c());
        List listR02 = f0.R0(((j) dVar.e()).b());
        dVar.f(SetupRequest.f71166a, new HttpCallValidatorKt$HttpCallValidator$2$1(((j) dVar.e()).a(), null));
        dVar.f(Send.f71163a, new HttpCallValidatorKt$HttpCallValidator$2$2(listR0, null));
        dVar.f(RequestError.f71156a, new HttpCallValidatorKt$HttpCallValidator$2$3(listR02, null));
        dVar.f(ReceiveError.f71154a, new HttpCallValidatorKt$HttpCallValidator$2$4(listR02, null));
        return r.f5635a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        r6 = r9;
        r9 = r8;
        r8 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.util.List<? extends zk.i> r7, java.lang.Throwable r8, cl.b r9, hn.c<? super bn.r> r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 r0 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 r0 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$1
            cl.b r8 = (cl.b) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.c.b(r10)
            goto L92
        L41:
            kotlin.c.b(r10)
            rs.c r10 = io.ktor.client.plugins.HttpCallValidatorKt.f71111a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Processing exception "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r5 = " for request "
            r2.append(r5)
            io.ktor.http.Url r5 = r9.getUrl()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r10.trace(r2)
            java.util.Iterator r7 = r7.iterator()
        L6a:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Lb5
            java.lang.Object r10 = r7.next()
            zk.i r10 = (zk.i) r10
            boolean r2 = r10 instanceof zk.h
            if (r2 == 0) goto L96
            zk.h r10 = (zk.h) r10
            sn.p r10 = r10.a()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r10 = r10.mo2invoke(r8, r0)
            if (r10 != r1) goto L8f
            return r1
        L8f:
            r6 = r9
            r9 = r8
            r8 = r6
        L92:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L6a
        L96:
            boolean r2 = r10 instanceof zk.j0
            if (r2 == 0) goto Laf
            zk.j0 r10 = (zk.j0) r10
            sn.q r10 = r10.a()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r10 = r10.invoke(r8, r9, r0)
            if (r10 != r1) goto L8f
            return r1
        Laf:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        Lb5:
            bn.r r7 = bn.r.f5635a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpCallValidatorKt.c(java.util.List, java.lang.Throwable, cl.b, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(java.util.List<? extends sn.p<? super dl.c, ? super hn.c<? super bn.r>, ? extends java.lang.Object>> r5, dl.c r6, hn.c<? super bn.r> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 r0 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 r0 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$0
            dl.c r6 = (dl.c) r6
            kotlin.c.b(r7)
            goto L62
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.c.b(r7)
            rs.c r7 = io.ktor.client.plugins.HttpCallValidatorKt.f71111a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Validating response for request "
            r2.append(r4)
            io.ktor.client.call.HttpClientCall r4 = r6.L()
            cl.b r4 = r4.d()
            io.ktor.http.Url r4 = r4.getUrl()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r7.trace(r2)
            java.util.Iterator r5 = r5.iterator()
        L62:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L7b
            java.lang.Object r7 = r5.next()
            sn.p r7 = (sn.p) r7
            r0.L$0 = r6
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = r7.mo2invoke(r6, r0)
            if (r7 != r1) goto L62
            return r1
        L7b:
            bn.r r5 = bn.r.f5635a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpCallValidatorKt.d(java.util.List, dl.c, hn.c):java.lang.Object");
    }

    public static final cl.b e(d dVar) {
        return new a(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(@NotNull h<?> hVar, @NotNull l<? super j, r> lVar) {
        p.k(hVar, "<this>");
        p.k(lVar, "block");
        hVar.m(f71112b, lVar);
    }

    @NotNull
    public static final kl.a<Boolean> j() {
        return f71113c;
    }

    @NotNull
    public static final al.b<j> k() {
        return f71112b;
    }
}
