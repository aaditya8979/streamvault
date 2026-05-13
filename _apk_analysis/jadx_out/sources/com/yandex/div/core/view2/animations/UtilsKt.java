package com.yandex.div.core.view2.animations;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import bn.r;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import zn.n;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UtilsKt {

    @NotNull
    private static final DivAnimation DEFAULT_CLICK_ANIMATION;

    /* JADX INFO: compiled from: Utils.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            try {
                iArr[DivAnimation.Name.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimation.Name.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimation.Name.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAnimation.Name.NO_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DEFAULT_CLICK_ANIMATION = new DivAnimation(Expression.Companion.constant$default(companion, 100L, null, 2, null), Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null), null, null, Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null), null, null, Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null), 108, null);
    }

    private static final Float alphaValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(n.m((float) d10.doubleValue(), 0.0f, 1.0f));
        }
        return null;
    }

    @Nullable
    public static final p<View, MotionEvent, r> asTouchListener(@NotNull DivAnimation divAnimation, @NotNull ExpressionResolver expressionResolver, @NotNull View view) {
        final Animation animation$default = toAnimation$default(divAnimation, expressionResolver, false, view, 2, null);
        final Animation animation$default2 = toAnimation$default(divAnimation, expressionResolver, true, null, 4, null);
        if (animation$default == null && animation$default2 == null) {
            return null;
        }
        return new p<View, MotionEvent, r>() { // from class: com.yandex.div.core.view2.animations.UtilsKt.asTouchListener.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(View view2, MotionEvent motionEvent) {
                invoke2(view2, motionEvent);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull View view2, @NotNull MotionEvent motionEvent) {
                Animation animation;
                if (view2.isEnabled() && view2.isClickable() && view2.hasOnClickListeners()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        Animation animation2 = animation$default;
                        if (animation2 != null) {
                            view2.startAnimation(animation2);
                            return;
                        }
                        return;
                    }
                    if ((action == 1 || action == 3) && (animation = animation$default2) != null) {
                        view2.startAnimation(animation);
                    }
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Object] */
    public static final void capturePosition(@NotNull TransitionValues transitionValues, @NotNull l<? super int[], r> lVar) {
        ?? r02 = new int[2];
        transitionValues.view.getLocationOnScreen(r02);
        lVar.invoke(r02);
    }

    private static final ScaleAnimation createScaleAnimation(float f10, float f11) {
        return new ScaleAnimation(f10, f11, f10, f11, 1, 0.5f, 1, 0.5f);
    }

    @NotNull
    public static final DivAnimation getDEFAULT_CLICK_ANIMATION() {
        return DEFAULT_CLICK_ANIMATION;
    }

    @NotNull
    public static final View getViewForAnimate(@NotNull Transition transition, @NotNull View view, @NotNull ViewGroup viewGroup, @NotNull TransitionValues transitionValues, @NotNull String str) {
        if (tn.p.f(transitionValues.view, view) || !ViewsKt.isActuallyLaidOut(view)) {
            return view;
        }
        Object obj = transitionValues.values.get(str);
        tn.p.i(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, transition, (int[]) obj);
    }

    private static final Float scaleValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(n.d((float) d10.doubleValue(), 0.0f));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.animation.AnimationSet] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.animation.ScaleAnimation] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Iterable, zn.i] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.animation.Animation toAnimation(com.yandex.div2.DivAnimation r9, com.yandex.div.json.expressions.ExpressionResolver r10, boolean r11, android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.animations.UtilsKt.toAnimation(com.yandex.div2.DivAnimation, com.yandex.div.json.expressions.ExpressionResolver, boolean, android.view.View):android.view.animation.Animation");
    }

    public static /* synthetic */ Animation toAnimation$default(DivAnimation divAnimation, ExpressionResolver expressionResolver, boolean z10, View view, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            view = null;
        }
        return toAnimation(divAnimation, expressionResolver, z10, view);
    }
}
