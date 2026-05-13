package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.ortb.model.C4381e;
import com.moloco.sdk.internal.ortb.model.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.vungle.ads.internal.protos.Sdk;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class K implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C4381e f47846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final p000do.l0 f47847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h f47848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final s0 f47849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> f47851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final go.l<Boolean> f47852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final go.u<Boolean> f47853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.g f47854j;

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1", f = "VastAdLoad.kt", l = {80, 94}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47856b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k.a f47858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f47859e;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K$a$a, reason: collision with other inner class name */
        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$decDeferred$1", f = "VastAdLoad.kt", l = {70}, m = "invokeSuspend")
        public static final class C0593a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super o0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47860a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f47861b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o0 f47862c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ K f47863d;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K$a$a$a, reason: collision with other inner class name */
            @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$decDeferred$1$1", f = "VastAdLoad.kt", l = {72}, m = "invokeSuspend")
            public static final class C0594a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super o0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f47864a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o0 f47865b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ K f47866c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0594a(o0 o0Var, K k10, hn.c<? super C0594a> cVar) {
                    super(2, cVar);
                    this.f47865b = o0Var;
                    this.f47866c = k10;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super o0> cVar) {
                    return ((C0594a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    return new C0594a(this.f47865b, this.f47866c, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objG = in.a.g();
                    int i10 = this.f47864a;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        o0 o0Var = this.f47865b;
                        if (o0Var == null) {
                            return null;
                        }
                        K k10 = this.f47866c;
                        s0 s0Var = k10.f47849e;
                        f fVarF = k10.f47846b.f();
                        String strD = fVarF != null ? fVarF.d() : null;
                        this.f47864a = 1;
                        obj = s0Var.a(o0Var, strD, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                    return (o0) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0593a(long j10, o0 o0Var, K k10, hn.c<? super C0593a> cVar) {
                super(2, cVar);
                this.f47861b = j10;
                this.f47862c = o0Var;
                this.f47863d = k10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super o0> cVar) {
                return ((C0593a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new C0593a(this.f47861b, this.f47862c, this.f47863d, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f47860a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    long j10 = this.f47861b;
                    C0594a c0594a = new C0594a(this.f47862c, this.f47863d, null);
                    this.f47860a = 1;
                    obj = TimeoutKt.f(j10, c0594a, this);
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
                return o0Var == null ? this.f47862c : o0Var;
            }
        }

        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$vastAdDeferred$1", f = "VastAdLoad.kt", l = {62}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47867a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f47868b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ K f47869c;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K$a$b$a, reason: collision with other inner class name */
            @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$vastAdDeferred$1$1", f = "VastAdLoad.kt", l = {63}, m = "invokeSuspend")
            public static final class C0595a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f47870a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ K f47871b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0595a(K k10, hn.c<? super C0595a> cVar) {
                    super(2, cVar);
                    this.f47871b = k10;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> cVar) {
                    return ((C0595a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    return new C0595a(this.f47871b, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objG = in.a.g();
                    int i10 = this.f47870a;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h hVar = this.f47871b.f47848d;
                        String strA = this.f47871b.f47846b.a();
                        String strA2 = com.moloco.sdk.internal.ortb.model.j.a(this.f47871b.f47846b);
                        this.f47870a = 1;
                        obj = hVar.b(strA, strA2, false, this);
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
            public b(long j10, K k10, hn.c<? super b> cVar) {
                super(2, cVar);
                this.f47868b = j10;
                this.f47869c = k10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> cVar) {
                return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new b(this.f47868b, this.f47869c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f47867a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    long j10 = this.f47868b;
                    C0595a c0595a = new C0595a(this.f47869c, null);
                    this.f47867a = 1;
                    obj = TimeoutKt.d(j10, c0595a, this);
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
            this.f47858d = aVar;
            this.f47859e = j10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            a aVar = K.this.new a(this.f47858d, this.f47859e, cVar);
            aVar.f47856b = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 289
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1", f = "VastAdLoad.kt", l = {118, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 135}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f47874c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k.a f47876e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f47877f;

        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1$decDeferred$1", f = "VastAdLoad.kt", l = {122}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super o0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f47879b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o0 f47880c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ K f47881d;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K$b$a$a, reason: collision with other inner class name */
            @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1$decDeferred$1$1", f = "VastAdLoad.kt", l = {124}, m = "invokeSuspend")
            public static final class C0596a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super o0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f47882a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o0 f47883b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ K f47884c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0596a(o0 o0Var, K k10, hn.c<? super C0596a> cVar) {
                    super(2, cVar);
                    this.f47883b = o0Var;
                    this.f47884c = k10;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super o0> cVar) {
                    return ((C0596a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                    return new C0596a(this.f47883b, this.f47884c, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objG = in.a.g();
                    int i10 = this.f47882a;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        o0 o0Var = this.f47883b;
                        if (o0Var == null) {
                            return null;
                        }
                        K k10 = this.f47884c;
                        s0 s0Var = k10.f47849e;
                        String strD = k10.f47846b.f().d();
                        this.f47882a = 1;
                        obj = s0Var.a(o0Var, strD, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                    return (o0) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j10, o0 o0Var, K k10, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f47879b = j10;
                this.f47880c = o0Var;
                this.f47881d = k10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super o0> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f47879b, this.f47880c, this.f47881d, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f47878a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    long j10 = this.f47879b;
                    C0596a c0596a = new C0596a(this.f47880c, this.f47881d, null);
                    this.f47878a = 1;
                    obj = TimeoutKt.f(j10, c0596a, this);
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
                return o0Var == null ? this.f47880c : o0Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k.a aVar, long j10, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f47876e = aVar;
            this.f47877f = j10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            b bVar = K.this.new b(this.f47876e, this.f47877f, cVar);
            bVar.f47874c = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 386
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public K(@NotNull C4381e c4381e, @NotNull p000do.l0 l0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h hVar, @NotNull s0 s0Var, boolean z10) {
        tn.p.k(c4381e, "bid");
        tn.p.k(l0Var, "scope");
        tn.p.k(hVar, "loadVast");
        tn.p.k(s0Var, "decLoader");
        this.f47846b = c4381e;
        this.f47847c = l0Var;
        this.f47848d = hVar;
        this.f47849e = s0Var;
        this.f47850f = z10;
        this.f47851g = new g0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f48094a);
        go.l<Boolean> lVarA = go.v.a(Boolean.FALSE);
        this.f47852h = lVarA;
        this.f47853i = go.f.c(lVarA);
    }

    @NotNull
    public final com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> c() {
        return this.f47851g;
    }

    public final void d(@NotNull com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> g0Var) {
        tn.p.k(g0Var, "<set-?>");
        this.f47851g = g0Var;
    }

    public final void f(p000do.p0<o0> p0Var, k.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoad", "Vast AD failed to load: " + cVar, null, false, 12, null);
        g.a.a(p0Var, null, 1, null);
        this.f47851g = new g0.a(cVar);
        if (aVar != null) {
            aVar.a(cVar);
        }
    }

    public final void h(long j10, k.a aVar) {
        kotlinx.coroutines.g gVar = this.f47854j;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.f47854j = i.d(this.f47847c, null, null, new a(aVar, j10, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void i(long j10, @Nullable k.a aVar) {
        if (this.f47850f) {
            m(j10, aVar);
        } else {
            h(j10, aVar);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    @NotNull
    public go.u<Boolean> isLoaded() {
        return this.f47853i;
    }

    public final void k(p000do.p0<o0> p0Var, k.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        g.a.a(p0Var, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f48037b;
        this.f47851g = new g0.a(cVar);
        if (aVar != null) {
            aVar.b(aVar2);
        }
    }

    public final void m(long j10, k.a aVar) {
        kotlinx.coroutines.g gVar = this.f47854j;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.f47854j = i.d(this.f47847c, null, null, new b(aVar, j10, null), 3, null);
    }
}
