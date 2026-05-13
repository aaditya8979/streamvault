package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastProgressBarKt$VastProgressBar$1$1", f = "VastProgressBar.kt", l = {43, 45, 53}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f50252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f50253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f50254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i f50255e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Animatable<Float, AnimationVector1D> animatable, float f10, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f50252b = animatable;
            this.f50253c = f10;
            this.f50254d = z10;
            this.f50255e = iVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f50252b, this.f50253c, this.f50254d, this.f50255e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50251a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                Animatable<Float, AnimationVector1D> animatable = this.f50252b;
                Float fC = jn.a.c(this.f50253c);
                this.f50251a = 1;
                if (animatable.snapTo(fC, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        kotlin.c.b(obj);
                        return bn.r.f5635a;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    bn.r rVar = bn.r.f5635a;
                    return bn.r.f5635a;
                }
                kotlin.c.b(obj);
            }
            if (!this.f50254d || !(this.f50255e instanceof i.c)) {
                Animatable<Float, AnimationVector1D> animatable2 = this.f50252b;
                this.f50251a = 3;
                if (animatable2.stop(this) == objG) {
                    return objG;
                }
                bn.r rVar2 = bn.r.f5635a;
                return bn.r.f5635a;
            }
            Animatable<Float, AnimationVector1D> animatable3 = this.f50252b;
            Float fC2 = jn.a.c(1.0f);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(m.i(this.f50255e), 0, EasingKt.getLinearEasing(), 2, null);
            this.f50251a = 2;
            if (Animatable.animateTo$default(animatable3, fC2, tweenSpecTween$default, null, null, this, 12, null) == objG) {
                return objG;
            }
            return bn.r.f5635a;
        }
    }

    public static final float a(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    public static final MutableState c() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
    }

    public static final bn.r d(Animatable animatable, float f10, long j10, DrawScope drawScope) {
        tn.p.k(drawScope, "$this$drawBehind");
        DrawScope.m2110drawRoundRectuAw5IA$default(drawScope, j10, 0L, SizeKt.Size(((Number) animatable.getValue()).floatValue() * Size.m1452getWidthimpl(drawScope.mo2113getSizeNHjbRc()), Size.m1449getHeightimpl(drawScope.mo2113getSizeNHjbRc())), CornerRadiusKt.CornerRadius(f10, f10), null, 0.0f, null, 0, 242, null);
        return bn.r.f5635a;
    }

    public static final bn.r e(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Modifier modifier, long j10, int i10, int i11, Composer composer, int i12) {
        g(z10, iVar, modifier, j10, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    public static final void f(MutableState<Float> mutableState, float f10) {
        mutableState.setValue(Float.valueOf(f10));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final boolean r21, @org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i r22, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r23, long r24, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.g(boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        if (iVar instanceof i.a) {
            return 100.0f;
        }
        if (iVar instanceof i.c) {
            if (((i.c) iVar).b() != 0) {
                return (float) (r4.a() / r4.b());
            }
        } else if (!(iVar instanceof i.d) && !tn.p.f(iVar, i.b.f50545a)) {
            throw new NoWhenBranchMatchedException();
        }
        return 0.0f;
    }

    public static final int i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        if (iVar instanceof i.a) {
            return 0;
        }
        if (iVar instanceof i.c) {
            i.c cVar = (i.c) iVar;
            if (cVar.b() == 0) {
                return 0;
            }
            return zn.n.e((int) (cVar.b() - cVar.a()), 0);
        }
        if ((iVar instanceof i.d) || tn.p.f(iVar, i.b.f50545a)) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
