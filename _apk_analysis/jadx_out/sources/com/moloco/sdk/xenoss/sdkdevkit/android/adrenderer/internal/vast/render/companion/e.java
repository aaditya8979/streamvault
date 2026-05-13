package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import bn.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import go.u;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.a;
import org.jetbrains.annotations.NotNull;
import p000do.l0;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C f50113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final u<d.a> f50114d;

    public static final class a implements go.d<d.a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ go.d f50115b;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a, reason: collision with other inner class name */
        public static final class C0667a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ go.e f50116b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.CompanionGoNextActionImpl$special$$inlined$map$1$2", f = "CompanionGoNextAction.kt", l = {50}, m = "emit")
            public static final class C0668a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f50117a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f50118b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f50119c;

                public C0668a(hn.c cVar) {
                    super(cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f50117a = obj;
                    this.f50118b |= Integer.MIN_VALUE;
                    return C0667a.this.emit(null, this);
                }
            }

            public C0667a(go.e eVar) {
                this.f50116b = eVar;
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
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e.a.C0667a.C0668a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e.a.C0667a.C0668a) r0
                    int r1 = r0.f50118b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f50118b = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f50117a
                    java.lang.Object r1 = in.a.g()
                    int r2 = r0.f50118b
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
                    go.e r6 = r4.f50116b
                    bn.k r5 = (bn.k) r5
                    int r5 = r5.f()
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d$a r5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h.b(r5)
                    r0.f50118b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    bn.r r5 = bn.r.f5635a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e.a.C0667a.emit(java.lang.Object, hn.c):java.lang.Object");
            }
        }

        public a(go.d dVar) {
            this.f50115b = dVar;
        }

        @Override // go.d
        public Object collect(go.e<? super d.a> eVar, hn.c cVar) {
            Object objCollect = this.f50115b.collect(new C0667a(eVar), cVar);
            return objCollect == in.a.g() ? objCollect : r.f5635a;
        }
    }

    public e(int i10, l0 l0Var) {
        p.k(l0Var, "scope");
        this.f50112b = i10;
        C c10 = new C(i10, l0Var, null);
        this.f50113c = c10;
        this.f50114d = go.f.M(new a(c10.b()), l0Var, a.C0862a.b(kotlinx.coroutines.flow.a.f73397a, 0L, 0L, 3, null), h.c(i10));
    }

    public /* synthetic */ e(int i10, l0 l0Var, tn.i iVar) {
        this(i10, l0Var);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public u<d.a> l() {
        return this.f50114d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g
    public void reset() {
        this.f50113c.c(this.f50112b);
    }
}
