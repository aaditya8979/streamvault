package com.yandex.div.core.view2.divs;

import ah.c9;
import ah.e2;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.MainThread;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewGroupKt;
import bn.r;
import cn.b0;
import cn.f0;
import cn.v;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotFixed;
import com.yandex.div2.DivPivotPercentage;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivVisibilityAction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: BaseDivViewExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class BaseDivViewExtensionsKt__BaseDivViewExtensionsKt {

    /* JADX INFO: compiled from: BaseDivViewExtensions.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            try {
                iArr[DivSizeUnit.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSizeUnit.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSizeUnit.SP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void applyAlignment(@NotNull View view, @Nullable DivAlignmentHorizontal divAlignmentHorizontal, @Nullable DivAlignmentVertical divAlignmentVertical) {
        applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
        applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, divAlignmentVertical == DivAlignmentVertical.BASELINE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(AspectView aspectView, Double d10) {
        aspectView.setAspectRatio(d10 != null ? (float) d10.doubleValue() : 0.0f);
    }

    private static final void applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null || divLayoutParams.isBaselineAligned() == z10) {
            return;
        }
        divLayoutParams.setBaselineAligned(z10);
        view.requestLayout();
    }

    public static final void applyBitmapFilters(@NotNull final View view, @NotNull BindingContext bindingContext, @NotNull final Bitmap bitmap, @Nullable final List<? extends DivFilter> list, @NotNull final l<? super Bitmap, r> lVar) {
        int i10;
        if (list == null || list.isEmpty()) {
            lVar.invoke(bitmap);
            return;
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final BitmapEffectHelper bitmapEffectHelper = bindingContext.getDivView().getDiv2Component$div_release().getBitmapEffectHelper();
        if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$applyBitmapFilters$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    int i19;
                    view2.removeOnLayoutChangeListener(this);
                    float fMax = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (r4.getWidth() * fMax), (int) (fMax * bitmap.getHeight()), false);
                    for (DivFilter divFilter : list) {
                        if (divFilter instanceof DivFilter.a) {
                            long jLongValue = ((DivFilter.a) divFilter).c().f54674a.evaluate(expressionResolver).longValue();
                            long j10 = jLongValue >> 31;
                            if (j10 == 0 || j10 == -1) {
                                i19 = (int) jLongValue;
                            } else {
                                KAssert kAssert = KAssert.INSTANCE;
                                if (Assert.isEnabled()) {
                                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                                }
                                i19 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                            }
                            bitmapCreateScaledBitmap = bitmapEffectHelper.blurBitmap(bitmapCreateScaledBitmap, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i19), view.getResources().getDisplayMetrics()));
                        } else if ((divFilter instanceof DivFilter.c) && ViewsKt.isLayoutRtl(view)) {
                            bitmapCreateScaledBitmap = bitmapEffectHelper.mirrorBitmap(bitmapCreateScaledBitmap);
                        }
                    }
                    lVar.invoke(bitmapCreateScaledBitmap);
                }
            });
            return;
        }
        float fMax = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMax), (int) (fMax * bitmap.getHeight()), false);
        for (DivFilter divFilter : list) {
            if (divFilter instanceof DivFilter.a) {
                long jLongValue = ((DivFilter.a) divFilter).c().f54674a.evaluate(expressionResolver).longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i10 = (int) jLongValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue + "' to Int");
                    }
                    i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                bitmapCreateScaledBitmap = bitmapEffectHelper.blurBitmap(bitmapCreateScaledBitmap, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i10), view.getResources().getDisplayMetrics()));
            } else if ((divFilter instanceof DivFilter.c) && ViewsKt.isLayoutRtl(view)) {
                bitmapCreateScaledBitmap = bitmapEffectHelper.mirrorBitmap(bitmapCreateScaledBitmap);
            }
        }
        lVar.invoke(bitmapCreateScaledBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(ViewGroup viewGroup, boolean z10) {
        DivHolderView divHolderView = viewGroup instanceof DivHolderView ? (DivHolderView) viewGroup : null;
        if (divHolderView != null) {
            divHolderView.setNeedClipping(z10);
        }
        ViewParent parent = viewGroup.getParent();
        if (z10 || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).setClipChildren(false);
    }

    public static final void applyDivActions(@NotNull View view, @NotNull BindingContext bindingContext, @Nullable DivAction divAction, @Nullable List<DivAction> list, @Nullable List<DivAction> list2, @Nullable List<DivAction> list3, @Nullable List<DivAction> list4, @Nullable List<DivAction> list5, @Nullable List<DivAction> list6, @Nullable List<DivAction> list7, @NotNull DivAnimation divAnimation, @NotNull Expression<Boolean> expression) {
        List<DivAction> listE;
        DivActionBinder actionBinder = bindingContext.getDivView().getDiv2Component$div_release().getActionBinder();
        if (list == null || list.isEmpty()) {
            listE = divAction != null ? v.e(divAction) : null;
        } else {
            listE = list;
        }
        actionBinder.bindDivActions(bindingContext, view, listE, list2, list3, list4, list5, list6, list7, divAnimation, expression);
    }

    private static final void applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getGravity() != i10) {
                divLayoutParams.setGravity(i10);
                view.requestLayout();
                return;
            }
            return;
        }
        Log.e("DivView", "tag=" + view.getTag() + ": Can't cast " + layoutParams + " to get gravity");
    }

    public static final void applyMargins(@NotNull View view, @Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver expressionResolver) {
        int iUnitToPx;
        int iUnitToPx2;
        int iUnitToPx3;
        int iUnitToPx4;
        Integer numValueOf;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (divEdgeInsets != null) {
            DivSizeUnit divSizeUnitEvaluate = divEdgeInsets.f55205g.evaluate(expressionResolver);
            iUnitToPx = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f55201c.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
            iUnitToPx2 = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f55204f.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
            iUnitToPx3 = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f55202d.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
            iUnitToPx4 = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f55199a.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
            Expression<Long> expression = divEdgeInsets.f55203e;
            Integer numValueOf2 = expression != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(expression.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate)) : null;
            Expression<Long> expression2 = divEdgeInsets.f55200b;
            numValueOf = expression2 != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(expression2.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate)) : null;
            num = numValueOf2;
        } else {
            iUnitToPx = 0;
            iUnitToPx2 = 0;
            iUnitToPx3 = 0;
            iUnitToPx4 = 0;
            numValueOf = null;
        }
        if (marginLayoutParams.leftMargin == iUnitToPx && marginLayoutParams.topMargin == iUnitToPx2 && marginLayoutParams.rightMargin == iUnitToPx3 && marginLayoutParams.bottomMargin == iUnitToPx4 && ((num == null || marginLayoutParams.getMarginStart() == num.intValue()) && (numValueOf == null || marginLayoutParams.getMarginEnd() == numValueOf.intValue()))) {
            return;
        }
        marginLayoutParams.topMargin = iUnitToPx2;
        marginLayoutParams.bottomMargin = iUnitToPx4;
        if (num == null && numValueOf == null) {
            marginLayoutParams.leftMargin = iUnitToPx;
            marginLayoutParams.rightMargin = iUnitToPx3;
        } else {
            marginLayoutParams.setMarginStart(num != null ? num.intValue() : 0);
            marginLayoutParams.setMarginEnd(numValueOf != null ? numValueOf.intValue() : 0);
        }
        view.requestLayout();
    }

    public static final void applyPaddings(@NotNull View view, @Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver expressionResolver) {
        if (divEdgeInsets == null) {
            view.setPadding(0, 0, 0, 0);
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        DivSizeUnit divSizeUnitEvaluate = divEdgeInsets.f55205g.evaluate(expressionResolver);
        Expression<Long> expression = divEdgeInsets.f55203e;
        if (expression == null && divEdgeInsets.f55200b == null) {
            view.setPadding(BaseDivViewExtensionsKt.toPx(divEdgeInsets.f55201c.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics), BaseDivViewExtensionsKt.toPx(divEdgeInsets.f55204f.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics), BaseDivViewExtensionsKt.toPx(divEdgeInsets.f55202d.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics), BaseDivViewExtensionsKt.toPx(divEdgeInsets.f55199a.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics));
            return;
        }
        int px = expression != null ? BaseDivViewExtensionsKt.toPx(expression.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics) : 0;
        int px2 = BaseDivViewExtensionsKt.toPx(divEdgeInsets.f55204f.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics);
        Expression<Long> expression2 = divEdgeInsets.f55200b;
        view.setPaddingRelative(px, px2, expression2 != null ? BaseDivViewExtensionsKt.toPx(expression2.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics) : 0, BaseDivViewExtensionsKt.toPx(divEdgeInsets.f55199a.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics));
    }

    public static final void applyTransform(@NotNull final View view, @NotNull e2 e2Var, @NotNull final ExpressionResolver expressionResolver) {
        r rVar;
        Expression<Double> expression;
        final DivTransform transform = e2Var.getTransform();
        if (transform == null || (expression = transform.f58046c) == null) {
            rVar = null;
        } else {
            view.setRotation((float) expression.evaluate(expressionResolver).doubleValue());
            rVar = r.f5635a;
        }
        if (rVar == null) {
            view.setRotation(0.0f);
        } else if (view.getWidth() == 0 && view.getHeight() == 0) {
            OneShotPreDrawListener.add(view, new Runnable() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$applyTransform$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    View view2 = view;
                    view2.setPivotX(BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view2, view2.getWidth(), transform.f58044a, expressionResolver));
                    View view3 = view;
                    view3.setPivotY(BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view3, view3.getHeight(), transform.f58045b, expressionResolver));
                }
            });
        } else {
            view.setPivotX(getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, view.getWidth(), transform.f58044a, expressionResolver));
            view.setPivotY(getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, view.getHeight(), transform.f58045b, expressionResolver));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindAspectRatio(@NotNull final View view, @Nullable DivAspect divAspect, @Nullable DivAspect divAspect2, @NotNull ExpressionResolver expressionResolver) {
        Expression<Double> expression;
        Expression<Double> expression2;
        if (view instanceof AspectView) {
            Disposable disposableObserve = null;
            if (ExpressionsKt.equalsToConstant(divAspect != null ? divAspect.f54651a : null, divAspect2 != null ? divAspect2.f54651a : null)) {
                return;
            }
            applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((AspectView) view, (divAspect == null || (expression2 = divAspect.f54651a) == null) ? null : expression2.evaluate(expressionResolver));
            if (ExpressionsKt.isConstantOrNull(divAspect != null ? divAspect.f54651a : null) || !(view instanceof ExpressionSubscriber)) {
                return;
            }
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) view;
            if (divAspect != null && (expression = divAspect.f54651a) != null) {
                disposableObserve = expression.observe(expressionResolver, new l<Double, r>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindAspectRatio.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(Double d10) {
                        invoke(d10.doubleValue());
                        return r.f5635a;
                    }

                    public final void invoke(double d10) {
                        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((AspectView) view, Double.valueOf(d10));
                    }
                });
            }
            expressionSubscriber.addSubscription(disposableObserve);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindClipChildren(@NotNull final ViewGroup viewGroup, @NotNull Expression<Boolean> expression, @Nullable Expression<Boolean> expression2, @NotNull ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(viewGroup, expression.evaluate(expressionResolver).booleanValue());
        if (ExpressionsKt.isConstant(expression)) {
            return;
        }
        DivHolderView divHolderView = viewGroup instanceof DivHolderView ? (DivHolderView) viewGroup : null;
        if (divHolderView != null) {
            divHolderView.addSubscription(expression.observe(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindClipChildren.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return r.f5635a;
                }

                public final void invoke(boolean z10) {
                    BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(viewGroup, z10);
                }
            }));
        }
    }

    public static final void bindItemBuilder(@NotNull DivCollectionItemBuilder divCollectionItemBuilder, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        divCollectionItemBuilder.f54767a.observe(expressionResolver, lVar);
        ExpressionResolver itemResolver = DivCollectionExtensionsKt.getItemResolver(divCollectionItemBuilder, expressionResolver);
        Iterator<T> it = divCollectionItemBuilder.f54769c.iterator();
        while (it.hasNext()) {
            ((DivCollectionItemBuilder.Prototype) it.next()).f54776c.observe(itemResolver, lVar);
        }
    }

    public static final void bindStates(@NotNull View view, @NotNull final BindingContext bindingContext, @NotNull final DivBinder divBinder) {
        traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, new l<View, Boolean>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindStates.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull View view2) {
                DivStatePath path;
                if (!(view2 instanceof DivStateLayout)) {
                    return Boolean.TRUE;
                }
                DivStateLayout divStateLayout = (DivStateLayout) view2;
                Div.n div = divStateLayout.getDiv();
                if (div != null && (path = divStateLayout.getPath()) != null) {
                    divBinder.bind(bindingContext, view2, div, path.parentState());
                    return Boolean.FALSE;
                }
                return Boolean.FALSE;
            }
        });
    }

    public static final void clearFocusOnClick(@NotNull View view, @NotNull InputFocusTracker inputFocusTracker) {
        if (view.isFocused() || !view.isInTouchMode()) {
            return;
        }
        inputFocusTracker.removeFocusFromFocusedInput();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final sn.p<android.view.View, android.view.MotionEvent, java.lang.Boolean> createAnimatedTouchListener(@org.jetbrains.annotations.NotNull android.view.View r3, @org.jetbrains.annotations.NotNull com.yandex.div.core.view2.BindingContext r4, @org.jetbrains.annotations.Nullable com.yandex.div2.DivAnimation r5, @org.jetbrains.annotations.Nullable com.yandex.div.core.view2.DivGestureListener r6) {
        /*
            r0 = 0
            if (r5 == 0) goto Lc
            com.yandex.div.json.expressions.ExpressionResolver r1 = r4.getExpressionResolver()
            sn.p r3 = com.yandex.div.core.view2.animations.UtilsKt.asTouchListener(r5, r1, r3)
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r6 == 0) goto L3c
            sn.a r5 = r6.getOnSingleTapListener()
            if (r5 != 0) goto L1d
            sn.a r5 = r6.getOnDoubleTapListener()
            if (r5 != 0) goto L1d
            r5 = 1
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 != 0) goto L22
            r5 = r6
            goto L23
        L22:
            r5 = r0
        L23:
            if (r5 == 0) goto L3c
            android.view.GestureDetector r5 = new android.view.GestureDetector
            com.yandex.div.core.view2.Div2View r4 = r4.getDivView()
            com.yandex.div.core.Div2Context r4 = r4.getContext$div_release()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r5.<init>(r4, r6, r1)
            goto L3d
        L3c:
            r5 = r0
        L3d:
            if (r3 != 0) goto L41
            if (r5 == 0) goto L46
        L41:
            com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1 r0 = new com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1
            r0.<init>()
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.createAnimatedTouchListener(android.view.View, com.yandex.div.core.view2.BindingContext, com.yandex.div2.DivAnimation, com.yandex.div.core.view2.DivGestureListener):sn.p");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void drawShadow(@NotNull View view, @NotNull Canvas canvas) {
        DivBorderDrawer divBorderDrawer;
        int iSave = canvas.save();
        try {
            canvas.translate(view.getX(), view.getY());
            canvas.rotate(view.getRotation(), view.getPivotX(), view.getPivotY());
            DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
            if (divBorderSupports != null && (divBorderDrawer = divBorderSupports.getDivBorderDrawer()) != null) {
                divBorderDrawer.drawShadow(canvas);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void gainAccessibilityFocus(@NotNull View view) {
        view.performAccessibilityAction(64, null);
        view.sendAccessibilityEvent(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final BindingContext getBindingContext(@NotNull View view) {
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        if (divHolderView != null) {
            return divHolderView.getBindingContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, int i10, DivPivot divPivot, ExpressionResolver expressionResolver) {
        Object objB = divPivot.b();
        if (!(objB instanceof DivPivotFixed)) {
            if (!(objB instanceof DivPivotPercentage)) {
                return i10 / 2.0f;
            }
            return i10 * (((float) ((DivPivotPercentage) objB).f56552a.evaluate(expressionResolver).doubleValue()) / 100.0f);
        }
        DivPivotFixed divPivotFixed = (DivPivotFixed) objB;
        Expression<Long> expression = divPivotFixed.f56537b;
        if (expression == null) {
            return i10 / 2.0f;
        }
        float fLongValue = expression.evaluate(expressionResolver).longValue();
        int i11 = WhenMappings.$EnumSwitchMapping$0[divPivotFixed.f56536a.evaluate(expressionResolver).ordinal()];
        if (i11 == 1) {
            return BaseDivViewExtensionsKt.dpToPxF(Float.valueOf(fLongValue), view.getResources().getDisplayMetrics());
        }
        if (i11 == 2) {
            return fLongValue;
        }
        if (i11 == 3) {
            return BaseDivViewExtensionsKt.spToPxF(Float.valueOf(fLongValue), view.getResources().getDisplayMetrics());
        }
        throw new NoWhenBranchMatchedException();
    }

    @MainThread
    public static final void trackVisibilityActions(@NotNull final ViewGroup viewGroup, @NotNull final Div2View div2View, @NotNull final List<DivItemBuilderResult> list, @Nullable List<DivItemBuilderResult> list2) {
        final DivVisibilityActionTracker visibilityActionTracker = div2View.getDiv2Component$div_release().getVisibilityActionTracker();
        if (!(list2 == null || list2.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                b0.F(arrayList, DivUtilKt.getAllSightActions(((DivItemBuilderResult) it.next()).getDiv().b()));
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(((c9) it2.next()).b());
            }
            for (DivItemBuilderResult divItemBuilderResult : list2) {
                List<DivVisibilityAction> allAppearActions = DivUtilKt.getAllAppearActions(divItemBuilderResult.getDiv().b());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : allAppearActions) {
                    if (!hashSet.contains(((DivVisibilityAction) obj).b())) {
                        arrayList2.add(obj);
                    }
                }
                List<DivDisappearAction> allDisappearActions = DivUtilKt.getAllDisappearActions(divItemBuilderResult.getDiv().b());
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : allDisappearActions) {
                    if (!hashSet.contains(((DivDisappearAction) obj2).b())) {
                        arrayList3.add(obj2);
                    }
                }
                visibilityActionTracker.trackVisibilityActionsOf(div2View, divItemBuilderResult.getExpressionResolver(), null, divItemBuilderResult.getDiv(), arrayList2, arrayList3);
            }
        }
        if (!list.isEmpty()) {
            viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$trackVisibilityActions$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    for (Pair pair : SequencesKt___SequencesKt.X(ViewGroupKt.getChildren(viewGroup), f0.g0(list))) {
                        View view2 = (View) pair.component1();
                        DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) pair.component2();
                        DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, div2View, divItemBuilderResult2.getExpressionResolver(), view2, divItemBuilderResult2.getDiv(), null, null, 48, null);
                    }
                }
            });
        }
    }

    private static final void traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, l<? super View, Boolean> lVar) {
        if (lVar.invoke(view).booleanValue() && (view instanceof ViewGroup)) {
            Iterator<View> it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(it.next(), lVar);
            }
        }
    }
}
