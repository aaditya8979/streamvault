package com.yandex.div.core.view2.divs;

import ah.e2;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import bn.r;
import bo.a0;
import com.yandex.div.R$id;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view.OnPreDrawListeners;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivData;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSwitch;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivVisibility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DivBaseBinder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivBaseBinder {

    @NotNull
    private final DivAccessibilityBinder divAccessibilityBinder;

    @NotNull
    private final DivBackgroundBinder divBackgroundBinder;

    @NotNull
    private final DivFocusBinder divFocusBinder;

    @NotNull
    private final DivLayoutParamsBinder layoutParamsBinder;

    @NotNull
    private final DivTooltipController tooltipController;

    /* JADX INFO: compiled from: DivBaseBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivVisibility.values().length];
            try {
                iArr[DivVisibility.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivVisibility.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivVisibility.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivBaseBinder(@NotNull DivBackgroundBinder divBackgroundBinder, @NotNull DivTooltipController divTooltipController, @NotNull DivFocusBinder divFocusBinder, @NotNull DivAccessibilityBinder divAccessibilityBinder, @NotNull DivLayoutParamsBinder divLayoutParamsBinder) {
        this.divBackgroundBinder = divBackgroundBinder;
        this.tooltipController = divTooltipController;
        this.divFocusBinder = divFocusBinder;
        this.divAccessibilityBinder = divAccessibilityBinder;
        this.layoutParamsBinder = divLayoutParamsBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void applyAlpha(View view, double d10) {
        view.setAlpha((float) d10);
        DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
        if (divBorderSupports != null) {
            divBorderSupports.invalidateBorder();
        }
    }

    private final void applyFocusableState(View view, e2 e2Var) {
        if ((e2Var instanceof DivInput) || (e2Var instanceof DivSwitch)) {
            return;
        }
        view.setFocusable(e2Var.n() != null);
    }

    private final void applyId(View view, String str, int i10) {
        view.setTag(str);
        view.setId(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyVisibility(android.view.View r11, com.yandex.div.core.view2.Div2View r12, ah.e2 r13, com.yandex.div.json.expressions.ExpressionResolver r14, boolean r15) {
        /*
            r10 = this;
            com.yandex.div.core.view2.animations.DivTransitionHandler r0 = r12.getDivTransitionHandler$div_release()
            com.yandex.div.json.expressions.Expression r1 = r13.getVisibility()
            java.lang.Object r1 = r1.evaluate(r14)
            com.yandex.div2.DivVisibility r1 = (com.yandex.div2.DivVisibility) r1
            int[] r2 = com.yandex.div.core.view2.divs.DivBaseBinder.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 2
            r3 = 8
            r4 = 4
            r5 = 0
            r6 = 1
            if (r1 == r6) goto L2d
            if (r1 == r2) goto L2b
            r7 = 3
            if (r1 != r7) goto L25
            r1 = r3
            goto L2e
        L25:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L2b:
            r1 = r4
            goto L2e
        L2d:
            r1 = r5
        L2e:
            if (r1 == 0) goto L33
            r11.clearAnimation()
        L33:
            int r7 = r11.getVisibility()
            java.util.List r8 = r13.l()
            if (r8 == 0) goto L44
            boolean r8 = com.yandex.div.core.view2.animations.DivTransitionsKt.allowsTransitionsOnVisibilityChange(r8)
            if (r8 != 0) goto L44
            r5 = r6
        L44:
            r8 = 0
            if (r5 != 0) goto L84
            com.yandex.div.core.view2.animations.DivTransitionHandler$ChangeType$Visibility r5 = r0.getLastChange(r11)
            if (r5 == 0) goto L51
            int r7 = r5.getNew()
        L51:
            com.yandex.div.core.dagger.Div2ViewComponent r9 = r12.getViewComponent$div_release()
            com.yandex.div.core.view2.DivTransitionBuilder r9 = r9.getTransitionBuilder()
            if (r7 == r4) goto L5d
            if (r7 != r3) goto L69
        L5d:
            if (r1 != 0) goto L69
            com.yandex.div2.DivAppearanceTransition r13 = r13.v()
            androidx.transition.Transition r13 = r9.createAndroidTransition(r13, r6, r14)
        L67:
            r8 = r13
            goto L7f
        L69:
            if (r1 == r4) goto L6d
            if (r1 != r3) goto L7a
        L6d:
            if (r7 != 0) goto L7a
            if (r15 != 0) goto L7a
            com.yandex.div2.DivAppearanceTransition r13 = r13.i()
            androidx.transition.Transition r13 = r9.createAndroidTransition(r13, r2, r14)
            goto L67
        L7a:
            if (r5 == 0) goto L7f
            androidx.transition.TransitionManager.endTransitions(r12)
        L7f:
            if (r8 == 0) goto L84
            r8.addTarget(r11)
        L84:
            if (r8 == 0) goto L8f
            com.yandex.div.core.view2.animations.DivTransitionHandler$ChangeType$Visibility r13 = new com.yandex.div.core.view2.animations.DivTransitionHandler$ChangeType$Visibility
            r13.<init>(r1)
            r0.putTransition(r8, r11, r13)
            goto L92
        L8f:
            r11.setVisibility(r1)
        L92:
            r12.trackChildrenVisibility()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivBaseBinder.applyVisibility(android.view.View, com.yandex.div.core.view2.Div2View, ah.e2, com.yandex.div.json.expressions.ExpressionResolver, boolean):void");
    }

    private final void bind(View view, BindingContext bindingContext, e2 e2Var, e2 e2Var2) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Div2View divView = bindingContext.getDivView();
        ExpressionSubscriber expressionSubscriber = ReleasablesKt.getExpressionSubscriber(view);
        if (Build.VERSION.SDK_INT >= 26) {
            view.setDefaultFocusHighlightEnabled(false);
        }
        bindId(view, divView, e2Var, e2Var2);
        bindLayoutParams(view, bindingContext, e2Var, e2Var2, expressionSubscriber);
        bindMargins(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindAlignment(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindLayoutProvider(view, bindingContext, e2Var, e2Var2);
        bindAccessibility(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindAlpha(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindBackground$default(this, view, bindingContext, e2Var, e2Var2, expressionSubscriber, null, 16, null);
        bindBorder(view, bindingContext, e2Var);
        bindPaddings(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindNextFocus(view, divView, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        DivFocus divFocusN = e2Var.n();
        List<DivAction> list = divFocusN != null ? divFocusN.f55353e : null;
        DivFocus divFocusN2 = e2Var.n();
        bindFocusActions(view, bindingContext, list, divFocusN2 != null ? divFocusN2.f55352d : null);
        bindVisibility(view, divView, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindTransform(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        List<DivTooltip> listH = e2Var.h();
        if (listH != null) {
            this.tooltipController.mapTooltip(view, listH);
        }
        applyFocusableState(view, e2Var);
    }

    private final void bindAccessibility(View view, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        this.divAccessibilityBinder.bind(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
    }

    private final void bindAlignment(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(e2Var.g(), e2Var2 != null ? e2Var2.g() : null)) {
            if (ExpressionsKt.equalsToConstant(e2Var.m(), e2Var2 != null ? e2Var2.m() : null)) {
                return;
            }
        }
        Expression<DivAlignmentHorizontal> expressionG = e2Var.g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM = e2Var.m();
        BaseDivViewExtensionsKt.applyAlignment(view, divAlignmentHorizontalEvaluate, expressionM != null ? expressionM.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(e2Var.g()) && ExpressionsKt.isConstantOrNull(e2Var.m())) {
            return;
        }
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                View view2 = view;
                Expression<DivAlignmentHorizontal> expressionG2 = e2Var.g();
                DivAlignmentHorizontal divAlignmentHorizontalEvaluate2 = expressionG2 != null ? expressionG2.evaluate(expressionResolver) : null;
                Expression<DivAlignmentVertical> expressionM2 = e2Var.m();
                BaseDivViewExtensionsKt.applyAlignment(view2, divAlignmentHorizontalEvaluate2, expressionM2 != null ? expressionM2.evaluate(expressionResolver) : null);
            }
        };
        Expression<DivAlignmentHorizontal> expressionG2 = e2Var.g();
        expressionSubscriber.addSubscription(expressionG2 != null ? expressionG2.observe(expressionResolver, lVar) : null);
        Expression<DivAlignmentVertical> expressionM2 = e2Var.m();
        expressionSubscriber.addSubscription(expressionM2 != null ? expressionM2.observe(expressionResolver, lVar) : null);
    }

    private final void bindAlpha(final View view, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(e2Var.getAlpha(), e2Var2 != null ? e2Var2.getAlpha() : null)) {
            return;
        }
        applyAlpha(view, e2Var.getAlpha().evaluate(expressionResolver).doubleValue());
        if (ExpressionsKt.isConstant(e2Var.getAlpha())) {
            return;
        }
        expressionSubscriber.addSubscription(e2Var.getAlpha().observe(expressionResolver, new l<Double, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindAlpha.1
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
                DivBaseBinder.this.applyAlpha(view, d10);
            }
        }));
    }

    private final void bindBackground(View view, BindingContext bindingContext, e2 e2Var, e2 e2Var2, ExpressionSubscriber expressionSubscriber, Drawable drawable) {
        DivFocus divFocusN;
        DivBackgroundBinder divBackgroundBinder = this.divBackgroundBinder;
        List<DivBackground> background = e2Var.getBackground();
        List<DivBackground> background2 = e2Var2 != null ? e2Var2.getBackground() : null;
        DivFocus divFocusN2 = e2Var.n();
        divBackgroundBinder.bindBackground(bindingContext, view, background, background2, divFocusN2 != null ? divFocusN2.f55349a : null, (e2Var2 == null || (divFocusN = e2Var2.n()) == null) ? null : divFocusN.f55349a, expressionSubscriber, drawable);
    }

    public static /* synthetic */ void bindBackground$default(DivBaseBinder divBaseBinder, View view, BindingContext bindingContext, e2 e2Var, e2 e2Var2, ExpressionSubscriber expressionSubscriber, Drawable drawable, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            drawable = null;
        }
        divBaseBinder.bindBackground(view, bindingContext, e2Var, e2Var2, expressionSubscriber, drawable);
    }

    private final void bindBorder(View view, BindingContext bindingContext, e2 e2Var) {
        DivFocusBinder divFocusBinder = this.divFocusBinder;
        DivFocus divFocusN = e2Var.n();
        divFocusBinder.bindDivBorder(view, bindingContext, divFocusN != null ? divFocusN.f55350b : null, e2Var.x());
    }

    private final void bindFocusActions(View view, BindingContext bindingContext, List<DivAction> list, List<DivAction> list2) {
        this.divFocusBinder.bindDivFocusActions(view, bindingContext, list, list2);
    }

    private final void bindId(View view, Div2View div2View, e2 e2Var, e2 e2Var2) {
        if (p.f(e2Var.getId(), e2Var2 != null ? e2Var2.getId() : null)) {
            return;
        }
        applyId(view, e2Var.getId(), div2View.getViewComponent$div_release().getViewIdProvider().getViewId(e2Var.getId()));
    }

    private final void bindLayoutParams(View view, BindingContext bindingContext, e2 e2Var, e2 e2Var2, ExpressionSubscriber expressionSubscriber) {
        this.layoutParamsBinder.bindLayoutParams(bindingContext, view, e2Var, e2Var2, expressionSubscriber);
    }

    private final void bindLayoutProvider(final View view, final BindingContext bindingContext, e2 e2Var, e2 e2Var2) {
        DivLayoutProvider divLayoutProviderR;
        DivLayoutProvider divLayoutProviderR2;
        DivLayoutProvider divLayoutProviderR3;
        final Div2View divView = bindingContext.getDivView();
        DivData divData = divView.getDivData();
        if (divData == null || (divLayoutProviderR = e2Var.r()) == null) {
            return;
        }
        if (a0.K(divLayoutProviderR.f56173b, (e2Var2 == null || (divLayoutProviderR3 = e2Var2.r()) == null) ? null : divLayoutProviderR3.f56173b, false, 2, null)) {
            if (a0.K(divLayoutProviderR.f56172a, (e2Var2 == null || (divLayoutProviderR2 = e2Var2.r()) == null) ? null : divLayoutProviderR2.f56172a, false, 2, null)) {
                return;
            }
        }
        if ((e2Var2 != null ? e2Var2.r() : null) != null) {
            clearLayoutProviderVariables(view);
        }
        final String str = divLayoutProviderR.f56173b;
        final String str2 = divLayoutProviderR.f56172a;
        if (str == null || str.length() == 0) {
            if (str2 == null || str2.length() == 0) {
                DivActionTypedUtilsKt.logError(divView, new Throwable("Neither width_variable_name nor height_variable_name found."));
                return;
            }
        }
        DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder = divView.getVariablesHolders$div_release().get(divData);
        if (divLayoutProviderVariablesHolder == null) {
            divLayoutProviderVariablesHolder = new DivLayoutProviderVariablesHolder();
            divLayoutProviderVariablesHolder.observeDivData(divData, bindingContext);
            divView.getVariablesHolders$div_release().put(divData, divLayoutProviderVariablesHolder);
        }
        final DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder2 = divLayoutProviderVariablesHolder;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: kg.i
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                DivBaseBinder.bindLayoutProvider$lambda$4(view, this, divView, str, divLayoutProviderVariablesHolder2, bindingContext, str2, view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        if (view.getWidth() > 0 || view.getHeight() > 0) {
            onLayoutChangeListener.onLayoutChange(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), 0, 0, 0, 0);
        }
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        view.setTag(R$id.div_layout_provider_listener_id, onLayoutChangeListener);
        if (divView.getClearVariablesListener$div_release() != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListenerOnPreDrawListener$default = OnPreDrawListeners.onPreDrawListener$default(null, new sn.a<Boolean>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindLayoutProvider$clearVariablesListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final Boolean invoke() {
                divLayoutProviderVariablesHolder2.clear();
                Map<ExpressionResolver, Map<String, Integer>> layoutSizes$div_release = divView.getLayoutSizes$div_release();
                Div2View div2View = divView;
                for (Map.Entry<ExpressionResolver, Map<String, Integer>> entry : layoutSizes$div_release.entrySet()) {
                    ExpressionResolver key = entry.getKey();
                    for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                        VariableMutationHandler.Companion.setVariable(div2View, entry2.getKey(), String.valueOf(entry2.getValue().intValue()), key);
                    }
                }
                divView.getLayoutSizes$div_release().clear();
                return Boolean.TRUE;
            }
        }, 1, null);
        divView.setClearVariablesListener$div_release(onPreDrawListenerOnPreDrawListener$default);
        divView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListenerOnPreDrawListener$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindLayoutProvider$lambda$4(View view, DivBaseBinder divBaseBinder, Div2View div2View, String str, DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder, BindingContext bindingContext, String str2, View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        divBaseBinder.updateSizeVariable(div2View, displayMetrics, str, divLayoutProviderVariablesHolder, i10, i12, i14, i16, bindingContext.getExpressionResolver());
        divBaseBinder.updateSizeVariable(div2View, displayMetrics, str2, divLayoutProviderVariablesHolder, i11, i13, i15, i17, bindingContext.getExpressionResolver());
    }

    private final void bindMargins(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(e2Var.d(), e2Var2 != null ? e2Var2.d() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyMargins(view, e2Var.d(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(e2Var.d())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, e2Var.d(), expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindMargins.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                BaseDivViewExtensionsKt.applyMargins(view, e2Var.d(), expressionResolver);
            }
        });
    }

    private final void bindNextFocus(final View view, Div2View div2View, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivFocus divFocusN;
        DivFocus.NextFocusIds nextFocusIds;
        DivFocus.NextFocusIds nextFocusIds2;
        DivFocus divFocusN2;
        DivFocus.NextFocusIds nextFocusIds3;
        DivFocus.NextFocusIds nextFocusIds4;
        DivFocus divFocusN3;
        DivFocus.NextFocusIds nextFocusIds5;
        DivFocus.NextFocusIds nextFocusIds6;
        DivFocus divFocusN4;
        DivFocus.NextFocusIds nextFocusIds7;
        DivFocus.NextFocusIds nextFocusIds8;
        DivFocus divFocusN5;
        DivFocus.NextFocusIds nextFocusIds9;
        DivFocus.NextFocusIds nextFocusIds10;
        final DivViewIdProvider viewIdProvider = div2View.getViewComponent$div_release().getViewIdProvider();
        DivFocus divFocusN6 = e2Var.n();
        Expression<String> expression = (divFocusN6 == null || (nextFocusIds10 = divFocusN6.f55351c) == null) ? null : nextFocusIds10.f55358b;
        if (!ExpressionsKt.equalsToConstant(expression, (e2Var2 == null || (divFocusN5 = e2Var2.n()) == null || (nextFocusIds9 = divFocusN5.f55351c) == null) ? null : nextFocusIds9.f55358b)) {
            String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            view.setNextFocusForwardId(viewIdProvider.getViewId(strEvaluate));
            view.setAccessibilityTraversalBefore(viewIdProvider.getViewId(strEvaluate));
            if (!ExpressionsKt.isConstantOrNull(expression)) {
                expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(String str) {
                        invoke2(str);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str) {
                        view.setNextFocusForwardId(viewIdProvider.getViewId(str));
                        view.setAccessibilityTraversalBefore(viewIdProvider.getViewId(str));
                    }
                }) : null);
            }
        }
        DivFocus divFocusN7 = e2Var.n();
        Expression<String> expression2 = (divFocusN7 == null || (nextFocusIds8 = divFocusN7.f55351c) == null) ? null : nextFocusIds8.f55359c;
        if (!ExpressionsKt.equalsToConstant(expression2, (e2Var2 == null || (divFocusN4 = e2Var2.n()) == null || (nextFocusIds7 = divFocusN4.f55351c) == null) ? null : nextFocusIds7.f55359c)) {
            view.setNextFocusLeftId(viewIdProvider.getViewId(expression2 != null ? expression2.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression2)) {
                expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(String str) {
                        invoke2(str);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str) {
                        view.setNextFocusLeftId(viewIdProvider.getViewId(str));
                    }
                }) : null);
            }
        }
        DivFocus divFocusN8 = e2Var.n();
        Expression<String> expression3 = (divFocusN8 == null || (nextFocusIds6 = divFocusN8.f55351c) == null) ? null : nextFocusIds6.f55360d;
        if (!ExpressionsKt.equalsToConstant(expression3, (e2Var2 == null || (divFocusN3 = e2Var2.n()) == null || (nextFocusIds5 = divFocusN3.f55351c) == null) ? null : nextFocusIds5.f55360d)) {
            view.setNextFocusRightId(viewIdProvider.getViewId(expression3 != null ? expression3.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression3)) {
                expressionSubscriber.addSubscription(expression3 != null ? expression3.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(String str) {
                        invoke2(str);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str) {
                        view.setNextFocusRightId(viewIdProvider.getViewId(str));
                    }
                }) : null);
            }
        }
        DivFocus divFocusN9 = e2Var.n();
        Expression<String> expression4 = (divFocusN9 == null || (nextFocusIds4 = divFocusN9.f55351c) == null) ? null : nextFocusIds4.f55361e;
        if (!ExpressionsKt.equalsToConstant(expression4, (e2Var2 == null || (divFocusN2 = e2Var2.n()) == null || (nextFocusIds3 = divFocusN2.f55351c) == null) ? null : nextFocusIds3.f55361e)) {
            view.setNextFocusUpId(viewIdProvider.getViewId(expression4 != null ? expression4.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression4)) {
                expressionSubscriber.addSubscription(expression4 != null ? expression4.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(String str) {
                        invoke2(str);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str) {
                        view.setNextFocusUpId(viewIdProvider.getViewId(str));
                    }
                }) : null);
            }
        }
        DivFocus divFocusN10 = e2Var.n();
        Expression<String> expression5 = (divFocusN10 == null || (nextFocusIds2 = divFocusN10.f55351c) == null) ? null : nextFocusIds2.f55357a;
        if (ExpressionsKt.equalsToConstant(expression5, (e2Var2 == null || (divFocusN = e2Var2.n()) == null || (nextFocusIds = divFocusN.f55351c) == null) ? null : nextFocusIds.f55357a)) {
            return;
        }
        view.setNextFocusDownId(viewIdProvider.getViewId(expression5 != null ? expression5.evaluate(expressionResolver) : null));
        if (ExpressionsKt.isConstantOrNull(expression5)) {
            return;
        }
        expressionSubscriber.addSubscription(expression5 != null ? expression5.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(String str) {
                invoke2(str);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str) {
                view.setNextFocusDownId(viewIdProvider.getViewId(str));
            }
        }) : null);
    }

    private final void bindPaddings(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (view instanceof DivPagerView) {
            return;
        }
        if (DivDataExtensionsKt.equalsToConstant(e2Var.p(), e2Var2 != null ? e2Var2.p() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyPaddings(view, e2Var.p(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(e2Var.p())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, e2Var.p(), expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindPaddings.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                BaseDivViewExtensionsKt.applyPaddings(view, e2Var.p(), expressionResolver);
            }
        });
    }

    private final void bindTransform(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(e2Var.getTransform(), e2Var2 != null ? e2Var2.getTransform() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyTransform(view, e2Var, expressionResolver);
        if (DivDataExtensionsKt.isConstant(e2Var.getTransform())) {
            return;
        }
        ExpressionSubscribersKt.observeTransform(expressionSubscriber, e2Var.getTransform(), expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindTransform.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                BaseDivViewExtensionsKt.applyTransform(view, e2Var, expressionResolver);
            }
        });
    }

    private final void bindVisibility(final View view, final Div2View div2View, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(e2Var.getVisibility(), e2Var2 != null ? e2Var2.getVisibility() : null)) {
            return;
        }
        applyVisibility(view, div2View, e2Var, expressionResolver, e2Var2 == null);
        if (ExpressionsKt.isConstant(e2Var.getVisibility())) {
            return;
        }
        expressionSubscriber.addSubscription(e2Var.getVisibility().observe(expressionResolver, new l<DivVisibility, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindVisibility.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(DivVisibility divVisibility) {
                invoke2(divVisibility);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DivVisibility divVisibility) {
                DivBaseBinder.this.applyVisibility(view, div2View, e2Var, expressionResolver, false);
            }
        }));
    }

    private final void clearLayoutProviderVariables(View view) {
        Object tag = view.getTag(R$id.div_layout_provider_listener_id);
        view.removeOnLayoutChangeListener(tag instanceof View.OnLayoutChangeListener ? (View.OnLayoutChangeListener) tag : null);
    }

    private final void updateSizeVariable(Div2View div2View, DisplayMetrics displayMetrics, String str, DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder, int i10, int i11, int i12, int i13, ExpressionResolver expressionResolver) {
        int i14;
        if ((str == null || str.length() == 0) || (i14 = i11 - i10) == i13 - i12) {
            return;
        }
        if (divLayoutProviderVariablesHolder.contains(str)) {
            DivActionTypedUtilsKt.logError(div2View, new Throwable("Size subscriber affects original view size. Relayout was prevented."));
            return;
        }
        Map<ExpressionResolver, Map<String, Integer>> layoutSizes$div_release = div2View.getLayoutSizes$div_release();
        Map<String, Integer> linkedHashMap = layoutSizes$div_release.get(expressionResolver);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            layoutSizes$div_release.put(expressionResolver, linkedHashMap);
        }
        linkedHashMap.put(str, Integer.valueOf(BaseDivViewExtensionsKt.pxToDp(Integer.valueOf(i14), displayMetrics)));
    }

    public final void bindBackground$div_release(@NotNull BindingContext bindingContext, @NotNull View view, @NotNull e2 e2Var, @Nullable e2 e2Var2, @NotNull ExpressionSubscriber expressionSubscriber, @Nullable Drawable drawable) {
        bindBackground(view, bindingContext, e2Var, e2Var2, expressionSubscriber, drawable);
        bindPaddings(view, e2Var, e2Var2, bindingContext.getExpressionResolver(), expressionSubscriber);
    }

    public final void bindId$div_release(@NotNull Div2View div2View, @NotNull View view, @Nullable String str) {
        applyId(view, str, str == null ? -1 : div2View.getViewComponent$div_release().getViewIdProvider().getViewId(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindView(@NotNull BindingContext bindingContext, @NotNull View view, @NotNull Div div, @Nullable Div div2) {
        p.i(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<com.yandex.div2.Div>");
        DivHolderView divHolderView = (DivHolderView) view;
        divHolderView.closeAllSubscription();
        divHolderView.setDiv(div);
        divHolderView.setBindingContext(bindingContext);
        bind(view, bindingContext, div.b(), div2 != null ? div2.b() : null);
    }
}
