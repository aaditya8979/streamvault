package com.moloco.sdk.acm;

import bn.r;
import com.ironsource.C3978d4;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.j2;
import p000do.l0;
import p000do.w0;
import sn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidClientMetrics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static com.moloco.sdk.acm.eventprocessing.f f45709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static com.moloco.sdk.acm.services.c f45710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static h f45711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static g f45712e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static com.moloco.sdk.acm.eventprocessing.g f45718k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AndroidClientMetrics f45708a = new AndroidClientMetrics();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final mo.a f45713f = mo.g.b(false, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final l0 f45714g = kotlinx.coroutines.d.a(w0.b().plus(j2.b(null, 1, null)));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final AtomicReference<f> f45715h = new AtomicReference<>(f.f45843c);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArrayList<com.moloco.sdk.acm.e> f45716i = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArrayList<com.moloco.sdk.acm.b> f45717j = new CopyOnWriteArrayList<>();

    @jn.d(c = "com.moloco.sdk.acm.AndroidClientMetrics$initialize$1", f = "AndroidClientMetrics.kt", l = {258, 124}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f45719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.d f45721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.a f45722d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.acm.d dVar, com.moloco.sdk.acm.a aVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f45721c = dVar;
            this.f45722d = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f45721c, this.f45722d, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f0 A[Catch: Exception -> 0x00f8, IllegalStateException -> 0x0118, TryCatch #3 {IllegalStateException -> 0x0118, Exception -> 0x00f8, blocks: (B:32:0x00e4, B:34:0x00f0, B:35:0x00f4, B:36:0x00f7, B:14:0x002a, B:17:0x0032, B:19:0x0090, B:20:0x0096, B:22:0x009c, B:23:0x00a2, B:7:0x0016, B:31:0x00e2, B:26:0x00c0, B:28:0x00c6), top: B:47:0x000b, inners: #2 }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v12, types: [mo.a] */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v5, types: [mo.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.AndroidClientMetrics.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.acm.AndroidClientMetrics$processQueuedEvents$1", f = "AndroidClientMetrics.kt", l = {234, 235}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f45723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45724b;

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new b(cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r7.f45724b
                r2 = 0
                java.lang.String r3 = "eventProcessor"
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L29
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                java.lang.Object r1 = r7.f45723a
                java.util.Iterator r1 = (java.util.Iterator) r1
                kotlin.c.b(r8)
                goto L60
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f45723a
                java.util.Iterator r1 = (java.util.Iterator) r1
                kotlin.c.b(r8)
                goto L34
            L29:
                kotlin.c.b(r8)
                java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.AndroidClientMetrics.g()
                java.util.Iterator r1 = r8.iterator()
            L34:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L58
                java.lang.Object r8 = r1.next()
                com.moloco.sdk.acm.e r8 = (com.moloco.sdk.acm.e) r8
                com.moloco.sdk.acm.eventprocessing.f r6 = com.moloco.sdk.acm.AndroidClientMetrics.c()
                if (r6 != 0) goto L4a
                tn.p.C(r3)
                r6 = r2
            L4a:
                tn.p.h(r8)
                r7.f45723a = r1
                r7.f45724b = r5
                java.lang.Object r8 = r6.b(r8, r7)
                if (r8 != r0) goto L34
                return r0
            L58:
                java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.AndroidClientMetrics.f()
                java.util.Iterator r1 = r8.iterator()
            L60:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L84
                java.lang.Object r8 = r1.next()
                com.moloco.sdk.acm.b r8 = (com.moloco.sdk.acm.b) r8
                com.moloco.sdk.acm.eventprocessing.f r5 = com.moloco.sdk.acm.AndroidClientMetrics.c()
                if (r5 != 0) goto L76
                tn.p.C(r3)
                r5 = r2
            L76:
                tn.p.h(r8)
                r7.f45723a = r1
                r7.f45724b = r4
                java.lang.Object r8 = r5.a(r8, r7)
                if (r8 != r0) goto L60
                return r0
            L84:
                java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.AndroidClientMetrics.g()
                r8.clear()
                java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.AndroidClientMetrics.f()
                r8.clear()
                bn.r r8 = bn.r.f5635a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.AndroidClientMetrics.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.acm.AndroidClientMetrics$recordCountEvent$1", f = "AndroidClientMetrics.kt", l = {190}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.b f45726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.acm.b bVar, hn.c<? super c> cVar) {
            super(2, cVar);
            this.f45726b = bVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new c(this.f45726b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f45725a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.acm.eventprocessing.f fVar = AndroidClientMetrics.f45709b;
                if (fVar == null) {
                    tn.p.C("eventProcessor");
                    fVar = null;
                }
                com.moloco.sdk.acm.b bVar = this.f45726b;
                this.f45725a = 1;
                if (fVar.a(bVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.acm.AndroidClientMetrics$recordTimerEvent$1", f = "AndroidClientMetrics.kt", l = {225}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.e f45728b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.e eVar, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f45728b = eVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new d(this.f45728b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f45727a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.acm.eventprocessing.f fVar = AndroidClientMetrics.f45709b;
                if (fVar == null) {
                    tn.p.C("eventProcessor");
                    fVar = null;
                }
                com.moloco.sdk.acm.e eVar = this.f45728b;
                this.f45727a = 1;
                if (fVar.b(eVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.acm.AndroidClientMetrics", f = "AndroidClientMetrics.kt", l = {258, 164}, m = "updateConfig")
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f45729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f45730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f45731c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45733e;

        public e(hn.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45731c = obj;
            this.f45733e |= Integer.MIN_VALUE;
            return AndroidClientMetrics.this.x(null, this);
        }
    }

    public static /* synthetic */ void r(AndroidClientMetrics androidClientMetrics, com.moloco.sdk.acm.d dVar, com.moloco.sdk.acm.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        androidClientMetrics.q(dVar, aVar);
    }

    @NotNull
    public final h p() {
        h hVar = f45711d;
        if (hVar != null) {
            return hVar;
        }
        tn.p.C("opsConfig");
        return null;
    }

    public final void q(@NotNull com.moloco.sdk.acm.d dVar, @Nullable com.moloco.sdk.acm.a aVar) {
        tn.p.k(dVar, "config");
        com.moloco.sdk.acm.services.e.m(com.moloco.sdk.acm.services.e.f45892a, "AndroidClientMetrics", "ACM initialize", false, 4, null);
        if (androidx.compose.animation.core.a.a(f45715h, f.f45843c, f.f45842b)) {
            v(j.a(dVar));
            p000do.i.d(f45714g, null, null, new a(dVar, aVar, null), 3, null);
        }
    }

    public final void s() {
        p000do.i.d(f45714g, null, null, new b(null), 3, null);
    }

    public final void t(@NotNull com.moloco.sdk.acm.b bVar) {
        tn.p.k(bVar, "event");
        if (f45715h.get() == f.f45841a) {
            p000do.i.d(f45714g, null, null, new c(bVar, null), 3, null);
        } else {
            f45717j.add(bVar);
            com.moloco.sdk.acm.services.e.f(com.moloco.sdk.acm.services.e.f45892a, "AndroidClientMetrics", "Moloco Client Metrics not initialized", false, 4, null);
        }
    }

    public final void u(@NotNull com.moloco.sdk.acm.e eVar) {
        tn.p.k(eVar, "event");
        eVar.e();
        if (f45715h.get() == f.f45841a) {
            p000do.i.d(f45714g, null, null, new d(eVar, null), 3, null);
        } else {
            f45716i.add(eVar);
            com.moloco.sdk.acm.services.e.f(com.moloco.sdk.acm.services.e.f45892a, "AndroidClientMetrics", "Moloco Client Metrics not initialized", false, 4, null);
        }
    }

    public final void v(@NotNull h hVar) {
        tn.p.k(hVar, "<set-?>");
        f45711d = hVar;
    }

    @NotNull
    public final com.moloco.sdk.acm.e w(@NotNull String str) {
        tn.p.k(str, C3978d4.i.f31344j0);
        if (f45715h.get() != f.f45841a) {
            com.moloco.sdk.acm.services.e.f(com.moloco.sdk.acm.services.e.f45892a, "AndroidClientMetrics", "Moloco Client Metrics not initialized", false, 4, null);
        }
        com.moloco.sdk.acm.e eVarA = com.moloco.sdk.acm.e.Companion.a(str);
        eVarA.d();
        return eVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(@org.jetbrains.annotations.NotNull com.moloco.sdk.acm.g r14, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.acm.AndroidClientMetrics.e
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.acm.AndroidClientMetrics$e r0 = (com.moloco.sdk.acm.AndroidClientMetrics.e) r0
            int r1 = r0.f45733e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45733e = r1
            goto L18
        L13:
            com.moloco.sdk.acm.AndroidClientMetrics$e r0 = new com.moloco.sdk.acm.AndroidClientMetrics$e
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f45731c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f45733e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.c.b(r15)
            goto L8f
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            java.lang.Object r14 = r0.f45730b
            mo.a r14 = (mo.a) r14
            java.lang.Object r0 = r0.f45729a
            com.moloco.sdk.acm.g r0 = (com.moloco.sdk.acm.g) r0
            kotlin.c.b(r15)
            r15 = r14
            r14 = r0
            goto L6d
        L43:
            kotlin.c.b(r15)
            java.util.concurrent.atomic.AtomicReference<com.moloco.sdk.acm.f> r15 = com.moloco.sdk.acm.AndroidClientMetrics.f45715h
            java.lang.Object r15 = r15.get()
            com.moloco.sdk.acm.f r2 = com.moloco.sdk.acm.f.f45841a
            if (r15 == r2) goto L7a
            com.moloco.sdk.acm.services.e r6 = com.moloco.sdk.acm.services.e.f45892a
            r9 = 0
            r10 = 0
            r11 = 12
            r12 = 0
            java.lang.String r7 = "AndroidClientMetrics"
            java.lang.String r8 = "ACM updateConfig called when the SDK was not initialized. Initialize the SDK first."
            com.moloco.sdk.acm.services.e.l(r6, r7, r8, r9, r10, r11, r12)
            mo.a r15 = com.moloco.sdk.acm.AndroidClientMetrics.f45713f
            r0.f45729a = r14
            r0.f45730b = r15
            r0.f45733e = r4
            java.lang.Object r0 = r15.c(r5, r0)
            if (r0 != r1) goto L6d
            return r1
        L6d:
            com.moloco.sdk.acm.AndroidClientMetrics.f45712e = r14     // Catch: java.lang.Throwable -> L75
            bn.r r14 = bn.r.f5635a     // Catch: java.lang.Throwable -> L75
            r15.d(r5)
            return r14
        L75:
            r14 = move-exception
            r15.d(r5)
            throw r14
        L7a:
            com.moloco.sdk.acm.services.e r6 = com.moloco.sdk.acm.services.e.f45892a
            r9 = 0
            r10 = 4
            r11 = 0
            java.lang.String r7 = "AndroidClientMetrics"
            java.lang.String r8 = "ACM update called. ACM initialized already, proceeding with update"
            com.moloco.sdk.acm.services.e.m(r6, r7, r8, r9, r10, r11)
            r0.f45733e = r3
            java.lang.Object r14 = r13.y(r14, r0)
            if (r14 != r1) goto L8f
            return r1
        L8f:
            bn.r r14 = bn.r.f5635a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.AndroidClientMetrics.x(com.moloco.sdk.acm.g, hn.c):java.lang.Object");
    }

    public final Object y(g gVar, hn.c<? super r> cVar) {
        String strA = gVar.a();
        if (strA != null) {
            f45708a.p().b(strA);
        }
        Long lB = gVar.b();
        if (lB != null) {
            f45708a.p().a(lB.longValue());
        }
        com.moloco.sdk.acm.eventprocessing.g gVar2 = f45718k;
        if (gVar2 == null) {
            tn.p.C("requestScheduler");
            gVar2 = null;
        }
        Object objA = gVar2.a(cVar);
        return objA == in.a.g() ? objA : r.f5635a;
    }
}
