package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f50243a = Dp.m3826constructorimpl(48);

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastIconKt$VastIcon$1$1", f = "VastIcon.kt", l = {21}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f50245b;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$a$a, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastIconKt$VastIcon$1$1$1", f = "VastIcon.kt", l = {}, m = "invokeSuspend")
        public static final class C0675a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50246a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f50247b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0675a(sn.a<bn.r> aVar, hn.c<? super C0675a> cVar) {
                super(2, cVar);
                this.f50247b = aVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((C0675a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new C0675a(this.f50247b, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f50246a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                this.f50247b.invoke();
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sn.a<bn.r> aVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f50245b = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f50245b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50244a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                kotlin.coroutines.d main = com.moloco.sdk.internal.scheduling.c.a().getMain();
                C0675a c0675a = new C0675a(this.f50245b, null);
                this.f50244a = 1;
                if (p000do.g.g(main, c0675a, this) == objG) {
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

    public static final bn.r a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, sn.a aVar, sn.a aVar2, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b(jVar, aVar, aVar2, modifier, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j r21, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r22, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r24, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, sn.a, sn.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
