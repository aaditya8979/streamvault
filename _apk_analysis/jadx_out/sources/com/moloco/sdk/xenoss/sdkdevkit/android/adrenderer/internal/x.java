package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.internal.ortb.model.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
public final class x implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f50872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final C4381e f50873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final s0 f50874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final sn.l<hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d>>, Object> f50875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f50876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f50877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d> f50878h;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1", f = "MraidAdLoad.kt", l = {60, 80}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f50879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50881c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k.a f50883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f50884f;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x$a$a, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$decDeferred$1", f = "MraidAdLoad.kt", l = {48}, m = "invokeSuspend")
        public static final class C0693a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super o0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50885a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f50886b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o0 f50887c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x f50888d;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x$a$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$decDeferred$1$1", f = "MraidAdLoad.kt", l = {51}, m = "invokeSuspend")
            public static final class C0694a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super o0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f50889a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f50890b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ o0 f50891c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ x f50892d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0694a(o0 o0Var, x xVar, hn.c<? super C0694a> cVar) {
                    super(2, cVar);
                    this.f50891c = o0Var;
                    this.f50892d = xVar;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super o0> cVar) {
                    return ((C0694a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    return new C0694a(this.f50891c, this.f50892d, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    o0 o0Var;
                    f fVarF;
                    Object objG = in.a.g();
                    int i10 = this.f50890b;
                    String strD = null;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        o0 o0Var2 = this.f50891c;
                        if (o0Var2 == null) {
                            return null;
                        }
                        x xVar = this.f50892d;
                        try {
                            s0 s0Var = xVar.f50874d;
                            C4381e c4381e = xVar.f50873c;
                            if (c4381e != null && (fVarF = c4381e.f()) != null) {
                                strD = fVarF.d();
                            }
                            this.f50889a = o0Var2;
                            this.f50890b = 1;
                            Object objA = s0Var.a(o0Var2, strD, this);
                            if (objA == objG) {
                                return objG;
                            }
                            o0Var = o0Var2;
                            obj = objA;
                        } catch (Exception unused) {
                            return o0Var2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o0Var = (o0) this.f50889a;
                        try {
                            kotlin.c.b(obj);
                        } catch (Exception unused2) {
                            return o0Var;
                        }
                    }
                    return (o0) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0693a(long j10, o0 o0Var, x xVar, hn.c<? super C0693a> cVar) {
                super(2, cVar);
                this.f50886b = j10;
                this.f50887c = o0Var;
                this.f50888d = xVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super o0> cVar) {
                return ((C0693a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new C0693a(this.f50886b, this.f50887c, this.f50888d, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f50885a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    long j10 = this.f50886b;
                    C0694a c0694a = new C0694a(this.f50887c, this.f50888d, null);
                    this.f50885a = 1;
                    obj = TimeoutKt.f(j10, c0694a, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                o0 o0Var = (o0) obj;
                return o0Var == null ? this.f50887c : o0Var;
            }
        }

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$mraidLoadResultDeferred$1", f = "MraidAdLoad.kt", l = {39}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50893a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f50894b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x f50895c;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x$a$b$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$mraidLoadResultDeferred$1$1", f = "MraidAdLoad.kt", l = {40}, m = "invokeSuspend")
            public static final class C0695a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d>>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f50896a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x f50897b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0695a(x xVar, hn.c<? super C0695a> cVar) {
                    super(2, cVar);
                    this.f50897b = xVar;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d>> cVar) {
                    return ((C0695a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    return new C0695a(this.f50897b, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objG = in.a.g();
                    int i10 = this.f50896a;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        sn.l lVar = this.f50897b.f50875e;
                        this.f50896a = 1;
                        obj = lVar.invoke(this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j10, x xVar, hn.c<? super b> cVar) {
                super(2, cVar);
                this.f50894b = j10;
                this.f50895c = xVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d>> cVar) {
                return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new b(this.f50894b, this.f50895c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f50893a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    long j10 = this.f50894b;
                    C0695a c0695a = new C0695a(this.f50895c, null);
                    this.f50893a = 1;
                    obj = TimeoutKt.f(j10, c0695a, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k.a aVar, long j10, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f50883e = aVar;
            this.f50884f = j10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            a aVar = x.this.new a(this.f50883e, this.f50884f, cVar);
            aVar.f50881c = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 296
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(@NotNull p000do.l0 l0Var, @Nullable C4381e c4381e, @NotNull s0 s0Var, @NotNull sn.l<? super hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d>>, ? extends Object> lVar) {
        tn.p.k(l0Var, "scope");
        tn.p.k(s0Var, "decLoader");
        tn.p.k(lVar, "loadAndReadyMraid");
        this.f50872b = l0Var;
        this.f50873c = c4381e;
        this.f50874d = s0Var;
        this.f50875e = lVar;
        go.l<Boolean> lVarA = go.v.a(Boolean.FALSE);
        this.f50876f = lVarA;
        this.f50877g = lVarA;
        this.f50878h = new g0.a(d.f48056f);
    }

    @NotNull
    public final com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d> c() {
        return this.f50878h;
    }

    public final void d(@NotNull com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, d> g0Var) {
        tn.p.k(g0Var, "<set-?>");
        this.f50878h = g0Var;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void i(long j10, @Nullable k.a aVar) {
        i.d(this.f50872b, null, null, new a(aVar, j10, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    @NotNull
    public go.u<Boolean> isLoaded() {
        return this.f50877g;
    }
}
