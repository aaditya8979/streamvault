package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import bn.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g;
import fo.m;
import go.e;
import go.f;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.a;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsFlow$1", f = "CountdownFlow.kt", l = {30, 33, 34}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<e<? super k>, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f48130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48131d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f48131d = i10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(e<? super k> eVar, hn.c<? super bn.r> cVar) {
            return ((a) create(eVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            a aVar = new a(this.f48131d, cVar);
            aVar.f48130c = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0075 -> B:17:0x004b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r7.f48129b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L25
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                int r1 = r7.f48128a
                java.lang.Object r4 = r7.f48130c
                go.e r4 = (go.e) r4
                kotlin.c.b(r8)
                r8 = r7
                goto L61
            L25:
                int r1 = r7.f48128a
                java.lang.Object r4 = r7.f48130c
                go.e r4 = (go.e) r4
                kotlin.c.b(r8)
                goto L4a
            L2f:
                kotlin.c.b(r8)
                java.lang.Object r8 = r7.f48130c
                go.e r8 = (go.e) r8
                int r1 = r7.f48131d
                bn.k r5 = bn.k.a(r1)
                r7.f48130c = r8
                r7.f48128a = r1
                r7.f48129b = r4
                java.lang.Object r4 = r8.emit(r5, r7)
                if (r4 != r0) goto L49
                return r0
            L49:
                r4 = r8
            L4a:
                r8 = r7
            L4b:
                r5 = 0
                int r5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l0.a(r1, r5)
                if (r5 <= 0) goto L78
                r8.f48130c = r4
                r8.f48128a = r1
                r8.f48129b = r3
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r5 = p000do.s0.a(r5, r8)
                if (r5 != r0) goto L61
                return r0
            L61:
                int r1 = r1 + (-1)
                int r1 = bn.k.b(r1)
                bn.k r5 = bn.k.a(r1)
                r8.f48130c = r4
                r8.f48128a = r1
                r8.f48129b = r2
                java.lang.Object r5 = r4.emit(r5, r8)
                if (r5 != r0) goto L4b
                return r0
            L78:
                bn.r r8 = bn.r.f5635a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsStateFlow$1", f = "CountdownFlow.kt", l = {83, 87, 89}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<m<? super k>, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f48132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f48134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f48135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ go.d<Boolean> f48136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f48137f;

        public static final class a<T> implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ref$IntRef f48138b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef<kotlinx.coroutines.g> f48139c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m<k> f48140d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Ref$IntRef f48141e;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Ref$IntRef ref$IntRef, Ref$ObjectRef<kotlinx.coroutines.g> ref$ObjectRef, m<? super k> mVar, Ref$IntRef ref$IntRef2) {
                this.f48138b = ref$IntRef;
                this.f48139c = ref$ObjectRef;
                this.f48140d = mVar;
                this.f48141e = ref$IntRef2;
            }

            public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
                if (z10) {
                    b.b(this.f48138b, this.f48139c, this.f48140d, this.f48141e);
                } else {
                    b.c(this.f48139c);
                }
                return bn.r.f5635a;
            }

            @Override // go.e
            public /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
                return a(((Boolean) obj).booleanValue(), cVar);
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$b, reason: collision with other inner class name */
        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsStateFlow$1$startCountdown$1", f = "CountdownFlow.kt", l = {65}, m = "invokeSuspend")
        public static final class C0605b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48142a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ref$IntRef f48143b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef<kotlinx.coroutines.g> f48144c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Ref$IntRef f48145d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m<k> f48146e;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$b$a */
            public static final class a<T> implements e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Ref$IntRef f48147b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Ref$IntRef f48148c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ m<k> f48149d;

                /* JADX WARN: Multi-variable type inference failed */
                public a(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, m<? super k> mVar) {
                    this.f48147b = ref$IntRef;
                    this.f48148c = ref$IntRef2;
                    this.f48149d = mVar;
                }

                public final Object a(int i10, hn.c<? super bn.r> cVar) {
                    this.f48147b.element = i10;
                    Ref$IntRef ref$IntRef = this.f48148c;
                    if (i10 == ref$IntRef.element) {
                        return bn.r.f5635a;
                    }
                    ref$IntRef.element = i10;
                    Object objI = this.f48149d.I(k.a(i10), cVar);
                    return objI == in.a.g() ? objI : bn.r.f5635a;
                }

                @Override // go.e
                public /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
                    return a(((k) obj).f(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0605b(Ref$IntRef ref$IntRef, Ref$ObjectRef<kotlinx.coroutines.g> ref$ObjectRef, Ref$IntRef ref$IntRef2, m<? super k> mVar, hn.c<? super C0605b> cVar) {
                super(2, cVar);
                this.f48143b = ref$IntRef;
                this.f48144c = ref$ObjectRef;
                this.f48145d = ref$IntRef2;
                this.f48146e = mVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((C0605b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new C0605b(this.f48143b, this.f48144c, this.f48145d, this.f48146e, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f48142a;
                try {
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        go.d<k> dVarA = g.a(this.f48143b.element);
                        a aVar = new a(this.f48143b, this.f48145d, this.f48146e);
                        this.f48142a = 1;
                        if (dVarA.collect(aVar, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                    this.f48144c.element = null;
                    return bn.r.f5635a;
                } catch (Throwable th2) {
                    this.f48144c.element = null;
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref$IntRef ref$IntRef, go.d<Boolean> dVar, Ref$IntRef ref$IntRef2, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f48135d = ref$IntRef;
            this.f48136e = dVar;
            this.f48137f = ref$IntRef2;
        }

        public static final bn.r b(Ref$ObjectRef ref$ObjectRef) {
            c(ref$ObjectRef);
            return bn.r.f5635a;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [T, kotlinx.coroutines.g] */
        public static final void b(Ref$IntRef ref$IntRef, Ref$ObjectRef<kotlinx.coroutines.g> ref$ObjectRef, m<? super k> mVar, Ref$IntRef ref$IntRef2) {
            if (ref$IntRef.element == 0 || ref$ObjectRef.element != null) {
                return;
            }
            ref$ObjectRef.element = i.d(mVar, null, null, new C0605b(ref$IntRef, ref$ObjectRef, ref$IntRef2, mVar, null), 3, null);
        }

        public static final void c(Ref$ObjectRef<kotlinx.coroutines.g> ref$ObjectRef) {
            kotlinx.coroutines.g gVar = ref$ObjectRef.element;
            if (gVar != null) {
                g.a.a(gVar, null, 1, null);
            }
            ref$ObjectRef.element = null;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(m<? super k> mVar, hn.c<? super bn.r> cVar) {
            return ((b) create(mVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            b bVar = new b(this.f48135d, this.f48136e, this.f48137f, cVar);
            bVar.f48134c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final Ref$ObjectRef ref$ObjectRef;
            m mVar;
            Object objG = in.a.g();
            int i10 = this.f48133b;
            if (i10 == 0) {
                kotlin.c.b(obj);
                m mVar2 = (m) this.f48134c;
                ref$ObjectRef = new Ref$ObjectRef();
                k kVarA = k.a(this.f48135d.element);
                this.f48134c = mVar2;
                this.f48132a = ref$ObjectRef;
                this.f48133b = 1;
                if (mVar2.I(kVarA, this) == objG) {
                    return objG;
                }
                mVar = mVar2;
            } else {
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return bn.r.f5635a;
                }
                ref$ObjectRef = (Ref$ObjectRef) this.f48132a;
                mVar = (m) this.f48134c;
                kotlin.c.b(obj);
            }
            go.d<Boolean> dVar = this.f48136e;
            if (dVar == null) {
                b(this.f48137f, ref$ObjectRef, mVar, this.f48135d);
                sn.a aVar = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0
                    @Override // sn.a
                    public final Object invoke() {
                        return g.b.b(ref$ObjectRef);
                    }
                };
                this.f48134c = null;
                this.f48132a = null;
                this.f48133b = 2;
                if (ProduceKt.b(mVar, aVar, this) == objG) {
                    return objG;
                }
            } else {
                go.d dVarP = f.p(dVar);
                a aVar2 = new a(this.f48137f, ref$ObjectRef, mVar, this.f48135d);
                this.f48134c = null;
                this.f48132a = null;
                this.f48133b = 3;
                if (dVarP.collect(aVar2, this) == objG) {
                    return objG;
                }
            }
            return bn.r.f5635a;
        }
    }

    @NotNull
    public static final go.d<k> a(int i10) {
        return f.z(new a(i10, null));
    }

    @NotNull
    public static final go.u<k> b(int i10, @NotNull p000do.l0 l0Var, @Nullable go.d<Boolean> dVar) {
        tn.p.k(l0Var, "scope");
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i10;
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = i10;
        return f.M(f.j(new b(ref$IntRef2, dVar, ref$IntRef, null)), l0Var, a.C0862a.b(kotlinx.coroutines.flow.a.f73397a, 0L, 0L, 3, null), k.a(i10));
    }

    public static /* synthetic */ go.u c(int i10, p000do.l0 l0Var, go.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            dVar = null;
        }
        return b(i10, l0Var, dVar);
    }
}
