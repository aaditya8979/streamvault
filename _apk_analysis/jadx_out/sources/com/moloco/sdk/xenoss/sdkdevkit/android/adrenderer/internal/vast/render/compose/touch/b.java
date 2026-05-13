package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import bn.r;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2", f = "Tap.kt", l = {42}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<PointerInputScope, c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a f50426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<Offset, Offset, r> f50427d;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$a$a, reason: collision with other inner class name */
        @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2$1", f = "Tap.kt", l = {44}, m = "invokeSuspend")
        public static final class C0680a extends SuspendLambda implements p<l0, c<? super r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50428a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a f50429b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PointerInputScope f50430c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p<Offset, Offset, r> f50431d;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$a$a$a, reason: collision with other inner class name */
            @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2$1$1", f = "Tap.kt", l = {45, 48}, m = "invokeSuspend")
            public static final class C0681a extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super r>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f50432a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f50433b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a f50434c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ p<Offset, Offset, r> f50435d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0681a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, p<? super Offset, ? super Offset, r> pVar, c<? super C0681a> cVar) {
                    super(2, cVar);
                    this.f50434c = aVar;
                    this.f50435d = pVar;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo2invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super r> cVar) {
                    return ((C0681a) create(awaitPointerEventScope, cVar)).invokeSuspend(r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final c<r> create(Object obj, c<?> cVar) {
                    C0681a c0681a = new C0681a(this.f50434c, this.f50435d, cVar);
                    c0681a.f50433b = obj;
                    return c0681a;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.Object r0 = in.a.g()
                        int r1 = r5.f50432a
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L26
                        if (r1 == r3) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r0 = r5.f50433b
                        androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                        kotlin.c.b(r6)
                        goto L56
                    L16:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1e:
                        java.lang.Object r1 = r5.f50433b
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.c.b(r6)
                        goto L3a
                    L26:
                        kotlin.c.b(r6)
                        java.lang.Object r6 = r5.f50433b
                        r1 = r6
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        r5.f50433b = r1
                        r5.f50432a = r3
                        r6 = 0
                        java.lang.Object r6 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r1, r6, r5)
                        if (r6 != r0) goto L3a
                        return r0
                    L3a:
                        androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
                        boolean r3 = r6.getPressed()
                        boolean r4 = r6.getPreviousPressed()
                        if (r3 == r4) goto L49
                        r6.consume()
                    L49:
                        r5.f50433b = r6
                        r5.f50432a = r2
                        java.lang.Object r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(r1, r5)
                        if (r1 != r0) goto L54
                        return r0
                    L54:
                        r0 = r6
                        r6 = r1
                    L56:
                        androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
                        if (r6 != 0) goto L60
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a r6 = r5.f50434c
                        r6.a()
                        goto L7a
                    L60:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a r1 = r5.f50434c
                        r1.b()
                        sn.p<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset, bn.r> r1 = r5.f50435d
                        long r2 = r0.getPosition()
                        androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m1372boximpl(r2)
                        long r2 = r6.getPosition()
                        androidx.compose.ui.geometry.Offset r6 = androidx.compose.ui.geometry.Offset.m1372boximpl(r2)
                        r1.mo2invoke(r0, r6)
                    L7a:
                        bn.r r6 = bn.r.f5635a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0680a.C0681a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0680a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, PointerInputScope pointerInputScope, p<? super Offset, ? super Offset, r> pVar, c<? super C0680a> cVar) {
                super(2, cVar);
                this.f50429b = aVar;
                this.f50430c = pointerInputScope;
                this.f50431d = pVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, c<? super r> cVar) {
                return ((C0680a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<r> create(Object obj, c<?> cVar) {
                return new C0680a(this.f50429b, this.f50430c, this.f50431d, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f50428a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    this.f50429b.c();
                    PointerInputScope pointerInputScope = this.f50430c;
                    C0681a c0681a = new C0681a(this.f50429b, this.f50431d, null);
                    this.f50428a = 1;
                    if (pointerInputScope.awaitPointerEventScope(c0681a, this) == objG) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, p<? super Offset, ? super Offset, r> pVar, c<? super a> cVar) {
            super(2, cVar);
            this.f50426c = aVar;
            this.f50427d = pVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(PointerInputScope pointerInputScope, c<? super r> cVar) {
            return ((a) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            a aVar = new a(this.f50426c, this.f50427d, cVar);
            aVar.f50425b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50424a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                C0680a c0680a = new C0680a(this.f50426c, (PointerInputScope) this.f50425b, this.f50427d, null);
                this.f50424a = 1;
                if (kotlinx.coroutines.d.f(c0680a, this) == objG) {
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

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$b, reason: collision with other inner class name */
    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt", f = "Tap.kt", l = {62, 77}, m = "waitForUpOrCancellationInitial")
    public static final class C0682b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f50436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50438c;

        public C0682b(c<? super C0682b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f50437b = obj;
            this.f50438c |= Integer.MIN_VALUE;
            return b.c(null, this);
        }
    }

    @Nullable
    public static final Object b(@NotNull PointerInputScope pointerInputScope, @NotNull p<? super Offset, ? super Offset, r> pVar, @NotNull c<? super r> cVar) {
        Object objForEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a(pointerInputScope), pVar, null), cVar);
        return objForEachGesture == in.a.g() ? objForEachGesture : r.f5635a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a0 -> B:36:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.AwaitPointerEventScope r13, hn.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r14) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.c(androidx.compose.ui.input.pointer.AwaitPointerEventScope, hn.c):java.lang.Object");
    }
}
