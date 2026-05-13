package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButtonKt$LifecycleAwareAdCountdownButton$1$1", f = "LifecycleAwareAdCountdownButton.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ State<bn.k> f49236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ State<sn.a<bn.r>> f49237c;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$a$a, reason: collision with other inner class name */
        public static final class C0646a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ State<sn.a<bn.r>> f49238b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0646a(State<? extends sn.a<bn.r>> state) {
                this.f49238b = state;
            }

            public final Object a(int i10, hn.c<? super bn.r> cVar) {
                u.d(this.f49238b).invoke();
                return bn.r.f5635a;
            }

            @Override // go.e
            public /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar) {
                return a(((bn.k) obj).f(), cVar);
            }
        }

        public static final class b implements go.d<bn.k> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ go.d f49239b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$a$b$a, reason: collision with other inner class name */
            public static final class C0647a<T> implements go.e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ go.e f49240b;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$a$b$a$a, reason: collision with other inner class name */
                @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButtonKt$LifecycleAwareAdCountdownButton$1$1$invokeSuspend$$inlined$filter$1$2", f = "LifecycleAwareAdCountdownButton.kt", l = {50}, m = "emit")
                public static final class C0648a extends ContinuationImpl {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f49241a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f49242b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public Object f49243c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public Object f49244d;

                    public C0648a(hn.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f49241a = obj;
                        this.f49242b |= Integer.MIN_VALUE;
                        return C0647a.this.emit(null, this);
                    }
                }

                public C0647a(go.e eVar) {
                    this.f49240b = eVar;
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
                        boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u.a.b.C0647a.C0648a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$a$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u.a.b.C0647a.C0648a) r0
                        int r1 = r0.f49242b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f49242b = r1
                        goto L18
                    L13:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$a$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$a$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f49241a
                        java.lang.Object r1 = in.a.g()
                        int r2 = r0.f49242b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.c.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.c.b(r6)
                        go.e r6 = r4.f49240b
                        r2 = r5
                        bn.k r2 = (bn.k) r2
                        int r2 = r2.f()
                        if (r2 != 0) goto L48
                        r0.f49242b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        bn.r r5 = bn.r.f5635a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u.a.b.C0647a.emit(java.lang.Object, hn.c):java.lang.Object");
                }
            }

            public b(go.d dVar) {
                this.f49239b = dVar;
            }

            @Override // go.d
            public Object collect(go.e<? super bn.k> eVar, hn.c cVar) {
                Object objCollect = this.f49239b.collect(new C0647a(eVar), cVar);
                return objCollect == in.a.g() ? objCollect : bn.r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(State<bn.k> state, State<? extends sn.a<bn.r>> state2, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f49236b = state;
            this.f49237c = state2;
        }

        public static final bn.k a(State state) {
            return bn.k.a(u.a(state));
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f49236b, this.f49237c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f49235a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final State<bn.k> state = this.f49236b;
                b bVar = new b(SnapshotStateKt.snapshotFlow(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i0
                    @Override // sn.a
                    public final Object invoke() {
                        return u.a.a(state);
                    }
                }));
                C0646a c0646a = new C0646a(this.f49237c);
                this.f49235a = 1;
                if (bVar.collect(c0646a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    public static final int a(State<bn.k> state) {
        return state.getValue().f();
    }

    public static final bn.r b(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar, boolean z10, boolean z11, sn.a aVar, sn.a aVar2, sn.l lVar, sn.c cVar, boolean z12, go.d dVar, int i10, int i11, Composer composer, int i12) {
        c(boxScope, pVar, z10, z11, aVar, aVar2, lVar, cVar, z12, dVar, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.BoxScope r22, @org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p<bn.k> r23, final boolean r24, final boolean r25, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r26, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r27, @org.jetbrains.annotations.NotNull final sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, bn.r> r28, @org.jetbrains.annotations.NotNull final sn.c<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super sn.a<bn.r>, ? super sn.l<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0696a.c, bn.r>, ? super java.lang.Boolean, ? super bn.k, ? super bn.k, ? super sn.a<bn.r>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r29, final boolean r30, @org.jetbrains.annotations.Nullable go.d<java.lang.Boolean> r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u.c(androidx.compose.foundation.layout.BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p, boolean, boolean, sn.a, sn.a, sn.l, sn.c, boolean, go.d, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final sn.a<bn.r> d(State<? extends sn.a<bn.r>> state) {
        return state.getValue();
    }
}
