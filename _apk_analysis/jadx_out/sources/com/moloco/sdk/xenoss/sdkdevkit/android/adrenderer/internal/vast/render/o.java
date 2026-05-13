package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import go.v;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final a0 f50658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f50659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f50660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final w0 f50661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final sn.a<bn.r> f50662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final sn.a<bn.r> f50663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final go.l<k> f50664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final go.u<j> f50665i;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.VastPrivacyIconImpl$1", f = "VastPrivacyIcon.kt", l = {67}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50666a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f50668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Integer f50669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f50670e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Integer num, Integer num2, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f50668c = context;
            this.f50669d = num;
            this.f50670e = num2;
        }

        public static final bn.r a() {
            return bn.r.f5635a;
        }

        public static final bn.r a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            return bn.r.f5635a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return o.this.new a(this.f50668c, this.f50669d, this.f50670e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objC;
            Object objG = in.a.g();
            int i10 = this.f50666a;
            k kVar = null;
            try {
            } catch (Exception unused) {
                if (kVar != null) {
                    kVar.destroy();
                }
                o.this.destroy();
            }
            if (i10 == 0) {
                kotlin.c.b(obj);
                a0 a0Var = o.this.f50658b;
                if (a0Var != null) {
                    Context context = this.f50668c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = o.this.f50660d;
                    w0 w0Var = o.this.f50661e;
                    Integer num = this.f50669d;
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = this.f50670e;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    sn.a aVar2 = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r
                        @Override // sn.a
                        public final Object invoke() {
                            return o.a.a();
                        }
                    };
                    sn.l lVar = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s
                        @Override // sn.l
                        public final Object invoke(Object obj2) {
                            return o.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj2);
                        }
                    };
                    this.f50666a = 1;
                    objC = l.c(a0Var, context, aVar, w0Var, iIntValue, iIntValue2, aVar2, lVar, (384 & 128) != 0 ? false : false, (384 & 256) != 0 ? null : null, this);
                    if (objC == objG) {
                        return objG;
                    }
                }
                o.this.f50664h.setValue(kVar);
                return bn.r.f5635a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            objC = obj;
            kVar = (k) objC;
            o.this.f50664h.setValue(kVar);
            return bn.r.f5635a;
        }
    }

    public static final class b implements go.d<j> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ go.d f50671b;

        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ go.e f50672b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o$b$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.VastPrivacyIconImpl$special$$inlined$map$1$2", f = "VastPrivacyIcon.kt", l = {50}, m = "emit")
            public static final class C0686a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f50673a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f50674b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f50675c;

                public C0686a(hn.c cVar) {
                    super(cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f50673a = obj;
                    this.f50674b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(go.e eVar) {
                this.f50672b = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // go.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, hn.c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.b.a.C0686a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.b.a.C0686a) r0
                    int r1 = r0.f50674b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f50674b = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f50673a
                    java.lang.Object r1 = in.a.g()
                    int r2 = r0.f50674b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.c.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.c.b(r6)
                    go.e r6 = r4.f50672b
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) r5
                    if (r5 == 0) goto L3f
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j r5 = r5.l()
                    goto L40
                L3f:
                    r5 = 0
                L40:
                    r0.f50674b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    bn.r r5 = bn.r.f5635a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.b.a.emit(java.lang.Object, hn.c):java.lang.Object");
            }
        }

        public b(go.d dVar) {
            this.f50671b = dVar;
        }

        @Override // go.d
        public Object collect(go.e<? super j> eVar, hn.c cVar) {
            Object objCollect = this.f50671b.collect(new a(eVar), cVar);
            return objCollect == in.a.g() ? objCollect : bn.r.f5635a;
        }
    }

    public o(@Nullable a0 a0Var, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @NotNull l0 l0Var, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull w0 w0Var, @Nullable sn.a<bn.r> aVar2, @Nullable sn.a<bn.r> aVar3) {
        tn.p.k(l0Var, "scope");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(w0Var, "externalLinkHandler");
        this.f50658b = a0Var;
        this.f50659c = str;
        this.f50660d = aVar;
        this.f50661e = w0Var;
        this.f50662f = aVar2;
        this.f50663g = aVar3;
        go.l<k> lVarA = v.a(null);
        this.f50664h = lVarA;
        p000do.i.d(l0Var, null, null, new a(context, num, num2, null), 3, null);
        this.f50665i = go.f.M(new b(lVarA), l0Var, a.C0862a.b(kotlinx.coroutines.flow.a.f73397a, 0L, 0L, 3, null), null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q
    @NotNull
    public go.u<j> O() {
        return this.f50665i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        go.l<k> lVar = this.f50664h;
        k value = lVar.getValue();
        if (value != null) {
            value.destroy();
        }
        lVar.setValue(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q
    public void i() {
        sn.a<bn.r> aVar = this.f50663g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q
    public void u() {
        String str = this.f50659c;
        if (str != null) {
            sn.a<bn.r> aVar = this.f50662f;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f50661e.a(str);
        }
    }
}
