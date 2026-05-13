package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import bn.r;
import cn.v;
import cn.w;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.util.DivTreeWalk;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.state.DivStateCache;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTransitionTrigger;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivStateBinder.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivStateBinder extends DivViewBinder<Div.n, DivState, DivStateLayout> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final DivStateCache divStateCache;

    @NotNull
    private final DivVisibilityActionTracker divVisibilityActionTracker;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TemporaryDivStateCache temporaryStateCache;

    @NotNull
    private final TwoWayStringVariableBinder variableBinder;

    @NotNull
    private final ym.a<DivBinder> viewBinder;

    @NotNull
    private final DivViewCreator viewCreator;

    /* JADX INFO: compiled from: DivStateBinder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DivStateBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivViewCreator divViewCreator, @NotNull ym.a<DivBinder> aVar, @NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryDivStateCache, @NotNull DivActionBinder divActionBinder, @NotNull DivActionBeaconSender divActionBeaconSender, @NotNull DivPatchManager divPatchManager, @NotNull DivPatchCache divPatchCache, @NotNull Div2Logger div2Logger, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull ErrorCollectors errorCollectors, @NotNull TwoWayStringVariableBinder twoWayStringVariableBinder, @NotNull DivRuntimeVisitor divRuntimeVisitor) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.viewBinder = aVar;
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryDivStateCache;
        this.divActionBinder = divActionBinder;
        this.divActionBeaconSender = divActionBeaconSender;
        this.divPatchManager = divPatchManager;
        this.divPatchCache = divPatchCache;
        this.div2Logger = div2Logger;
        this.divVisibilityActionTracker = divVisibilityActionTracker;
        this.errorCollectors = errorCollectors;
        this.variableBinder = twoWayStringVariableBinder;
        this.runtimeVisitor = divRuntimeVisitor;
    }

    private final void bind(final DivStateLayout divStateLayout, final BindingContext bindingContext, DivState divState, DivState divState2, DivState.State state, DivStatePath divStatePath) {
        DivStateLayout divStateLayout2;
        BaseDivViewExtensionsKt.applyDivActions(divStateLayout, bindingContext, divState.f57165b, divState.f57167d, divState.f57189z, divState.f57180q, divState.f57186w, divState.f57185v, divState.D, divState.C, divState.f57166c, divState.f57174k);
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        fixAlignment(divStateLayout, divState, divState2, expressionResolver);
        observeStateIdVariable(divStateLayout, divState, bindingContext, divStatePath);
        sn.a<r> aVar = null;
        BaseDivViewExtensionsKt.bindClipChildren(divStateLayout, divState.f57175l, divState2 != null ? divState2.f57175l : null, expressionResolver);
        final List<DivAction> list = state.f57196e;
        if (list != null) {
            divStateLayout2 = divStateLayout;
            aVar = new sn.a<r>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bind$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.swipeOut(divStateLayout, bindingContext.getDivView(), expressionResolver, list);
                }
            };
        } else {
            divStateLayout2 = divStateLayout;
        }
        divStateLayout2.setSwipeOutCallback(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindState(com.yandex.div.core.view2.divs.widgets.DivStateLayout r26, com.yandex.div.core.view2.BindingContext r27, com.yandex.div2.DivState r28, com.yandex.div2.DivState.State r29, com.yandex.div2.DivState r30, com.yandex.div2.DivState.State r31, com.yandex.div2.Div r32, com.yandex.div.core.state.DivStatePath r33, com.yandex.div.json.expressions.ExpressionResolver r34, java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivStateBinder.bindState(com.yandex.div.core.view2.divs.widgets.DivStateLayout, com.yandex.div.core.view2.BindingContext, com.yandex.div2.DivState, com.yandex.div2.DivState$State, com.yandex.div2.DivState, com.yandex.div2.DivState$State, com.yandex.div2.Div, com.yandex.div.core.state.DivStatePath, com.yandex.div.json.expressions.ExpressionResolver, java.lang.String):void");
    }

    private final void createLayoutParams(View view) {
        view.setLayoutParams(new DivLayoutParams(-1, -2));
    }

    private final DivContentAlignmentHorizontal extractParentContentAlignmentHorizontal(View view, ExpressionResolver expressionResolver) {
        ViewParent parent = view.getParent();
        DivHolderView divHolderView = parent instanceof DivHolderView ? (DivHolderView) parent : null;
        Div div = divHolderView != null ? divHolderView.getDiv() : null;
        Div.b bVar = div instanceof Div.b ? (Div.b) div : null;
        if (bVar == null) {
            return null;
        }
        return bVar.c().f54870o.evaluate(expressionResolver);
    }

    private final DivContentAlignmentVertical extractParentContentAlignmentVertical(View view, ExpressionResolver expressionResolver) {
        ViewParent parent = view.getParent();
        DivHolderView divHolderView = parent instanceof DivHolderView ? (DivHolderView) parent : null;
        Div div = divHolderView != null ? divHolderView.getDiv() : null;
        Div.b bVar = div instanceof Div.b ? (Div.b) div : null;
        if (bVar == null) {
            return null;
        }
        return bVar.c().f54871p.evaluate(expressionResolver);
    }

    private final void fixAlignment(DivStateLayout divStateLayout, DivState divState, DivState divState2, ExpressionResolver expressionResolver) {
        DivAlignmentHorizontal alignmentHorizontal;
        DivAlignmentVertical divAlignmentVerticalEvaluate;
        Expression<DivAlignmentHorizontal> expressionG = divState.g();
        Expression<DivAlignmentVertical> expressionM = divState.m();
        DivAlignmentVertical alignmentVertical = null;
        if (p.f(expressionG, divState2 != null ? divState2.g() : null)) {
            if (p.f(expressionM, divState2 != null ? divState2.m() : null)) {
                return;
            }
        }
        if (expressionG == null || (alignmentHorizontal = expressionG.evaluate(expressionResolver)) == null) {
            DivContentAlignmentHorizontal divContentAlignmentHorizontalExtractParentContentAlignmentHorizontal = extractParentContentAlignmentHorizontal(divStateLayout, expressionResolver);
            alignmentHorizontal = divContentAlignmentHorizontalExtractParentContentAlignmentHorizontal != null ? DivUtilKt.toAlignmentHorizontal(divContentAlignmentHorizontalExtractParentContentAlignmentHorizontal) : null;
        }
        if (expressionM == null || (divAlignmentVerticalEvaluate = expressionM.evaluate(expressionResolver)) == null) {
            DivContentAlignmentVertical divContentAlignmentVerticalExtractParentContentAlignmentVertical = extractParentContentAlignmentVertical(divStateLayout, expressionResolver);
            if (divContentAlignmentVerticalExtractParentContentAlignmentVertical != null) {
                alignmentVertical = DivUtilKt.toAlignmentVertical(divContentAlignmentVerticalExtractParentContentAlignmentVertical);
            }
        } else {
            alignmentVertical = divAlignmentVerticalEvaluate;
        }
        BaseDivViewExtensionsKt.applyAlignment(divStateLayout, alignmentHorizontal, alignmentVertical);
    }

    private final View getIncomingView(View view, Div div, ExpressionResolver expressionResolver) {
        if (view != null) {
            return view;
        }
        View viewCreate = this.viewCreator.create(div, expressionResolver);
        createLayoutParams(viewCreate);
        return viewCreate;
    }

    private final Pair<DivState.State, DivState.State> getStates(DivState divState, BindingContext bindingContext, DivStateLayout divStateLayout, DivStatePath divStatePath, String str) {
        Object next;
        String id2 = bindingContext.getDivView().getDivTag().getId();
        String str2 = divStatePath.getStatesString$div_release() + '/' + str;
        String state = this.temporaryStateCache.getState(id2, str2);
        if (state == null) {
            state = this.divStateCache.getState(id2, str2);
        }
        Object obj = null;
        if (state != null) {
            l<String, r> variableUpdater = divStateLayout.getVariableUpdater();
            if (variableUpdater != null) {
                variableUpdater.invoke(state);
            }
        } else {
            String str3 = divState.H;
            state = str3 != null ? getValueFromVariable(bindingContext, str3) : null;
        }
        Iterator<T> it = divState.I.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (p.f(((DivState.State) next).f57195d, divStateLayout.getStateId())) {
                break;
            }
        }
        DivState.State defaultState = (DivState.State) next;
        if (defaultState == null) {
            defaultState = DivUtilKt.getDefaultState(divState, bindingContext.getExpressionResolver());
        }
        Iterator<T> it2 = divState.I.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (p.f(((DivState.State) next2).f57195d, state)) {
                obj = next2;
                break;
            }
        }
        DivState.State defaultState2 = (DivState.State) obj;
        if (defaultState2 == null) {
            defaultState2 = DivUtilKt.getDefaultState(divState, bindingContext.getExpressionResolver());
        }
        return new Pair<>(defaultState, defaultState2);
    }

    private final String getValueFromVariable(BindingContext bindingContext, String str) {
        Variable mutableVariable;
        Object value;
        VariableController variableController = UtilsKt.getVariableController(bindingContext.getExpressionResolver());
        if (variableController == null || (mutableVariable = variableController.getMutableVariable(str)) == null || (value = mutableVariable.getValue()) == null) {
            return null;
        }
        return value.toString();
    }

    private final void observeStateIdVariable(final DivStateLayout divStateLayout, final DivState divState, final BindingContext bindingContext, final DivStatePath divStatePath) {
        String str = divState.H;
        if (str == null) {
            return;
        }
        divStateLayout.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$observeStateIdVariable$subscription$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable String str2) {
                Object next;
                if (str2 == null || divStateLayout.getStateId() == null || p.f(str2, divStateLayout.getStateId())) {
                    return;
                }
                Iterator<T> it = divState.I.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (p.f(((DivState.State) next).f57195d, str2)) {
                            break;
                        }
                    }
                }
                bindingContext.getDivView().switchToState(divStatePath.append$div_release(DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, divState, null, 1, null), (DivState.State) next, str2), true);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull l<? super String, r> lVar) {
                divStateLayout.setVariableUpdater(lVar);
            }
        }, divStatePath));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        if ((r1 != null && com.yandex.div.core.util.DivUtilKt.containsStateInnerTransitions(r1, r6)) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.transition.Transition replaceViewsAnimated(com.yandex.div.core.view2.BindingContext r9, com.yandex.div2.DivState r10, com.yandex.div2.DivState.State r11, com.yandex.div2.DivState.State r12, android.view.View r13, android.view.View r14) {
        /*
            r8 = this;
            if (r14 == 0) goto L65
            com.yandex.div.core.view2.BindingContext r0 = com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt.getBindingContext(r14)
            if (r0 == 0) goto L65
            com.yandex.div.json.expressions.ExpressionResolver r7 = r0.getExpressionResolver()
            if (r7 != 0) goto Lf
            goto L65
        Lf:
            com.yandex.div.json.expressions.ExpressionResolver r6 = r9.getExpressionResolver()
            boolean r10 = com.yandex.div.core.view2.animations.DivTransitionsKt.allowsTransitionsOnStateChange(r10, r6)
            if (r10 == 0) goto L5a
            r10 = 1
            r0 = 0
            if (r12 == 0) goto L29
            com.yandex.div2.Div r1 = r12.f57194c
            if (r1 == 0) goto L29
            boolean r1 = com.yandex.div.core.util.DivUtilKt.containsStateInnerTransitions(r1, r7)
            if (r1 != r10) goto L29
            r1 = r10
            goto L2a
        L29:
            r1 = r0
        L2a:
            if (r1 != 0) goto L3a
            com.yandex.div2.Div r1 = r11.f57194c
            if (r1 == 0) goto L37
            boolean r1 = com.yandex.div.core.util.DivUtilKt.containsStateInnerTransitions(r1, r6)
            if (r1 != r10) goto L37
            goto L38
        L37:
            r10 = r0
        L38:
            if (r10 == 0) goto L5a
        L3a:
            com.yandex.div.core.view2.Div2View r10 = r9.getDivView()
            com.yandex.div.core.dagger.Div2ViewComponent r10 = r10.getViewComponent$div_release()
            com.yandex.div.core.view2.DivTransitionBuilder r2 = r10.getTransitionBuilder()
            com.yandex.div.core.view2.Div2View r9 = r9.getDivView()
            com.yandex.div.core.dagger.Div2ViewComponent r9 = r9.getViewComponent$div_release()
            com.yandex.div.core.view2.state.DivStateTransitionHolder r3 = r9.getStateTransitionHolder()
            r1 = r8
            r4 = r11
            r5 = r12
            androidx.transition.Transition r9 = r1.setupTransitions(r2, r3, r4, r5, r6, r7)
            goto L64
        L5a:
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            androidx.transition.Transition r9 = r0.setupAnimation(r1, r2, r3, r4, r5)
        L64:
            return r9
        L65:
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            androidx.transition.Transition r9 = r0.setupAnimation(r1, r2, r3, r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivStateBinder.replaceViewsAnimated(com.yandex.div.core.view2.BindingContext, com.yandex.div2.DivState, com.yandex.div2.DivState$State, com.yandex.div2.DivState$State, android.view.View, android.view.View):androidx.transition.Transition");
    }

    private final Transition setupAnimation(BindingContext bindingContext, DivState.State state, DivState.State state2, View view, View view2) {
        List<DivAnimation> listM;
        BindingContext bindingContext2;
        List<DivAnimation> listM2;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivAnimation divAnimation = state.f57192a;
        ExpressionResolver expressionResolver2 = null;
        DivAnimation divAnimation2 = state2 != null ? state2.f57193b : null;
        if (divAnimation == null && divAnimation2 == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (divAnimation != null && view != null) {
            if (divAnimation.f54584e.evaluate(expressionResolver) != DivAnimation.Name.SET) {
                listM2 = v.e(divAnimation);
            } else {
                listM2 = divAnimation.f54583d;
                if (listM2 == null) {
                    listM2 = w.m();
                }
            }
            for (DivAnimation divAnimation3 : listM2) {
                Transition transition = DivStateBinderKt.toTransition(divAnimation3, true, expressionResolver);
                if (transition != null) {
                    transitionSet.addTransition(transition.addTarget(view).setDuration(divAnimation3.f54580a.evaluate(expressionResolver).longValue()).setStartDelay(divAnimation3.f54586g.evaluate(expressionResolver).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator(divAnimation3.f54582c.evaluate(expressionResolver))));
                }
            }
        }
        if (view2 != null && (bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(view2)) != null) {
            expressionResolver2 = bindingContext2.getExpressionResolver();
        }
        if (divAnimation2 != null && expressionResolver2 != null) {
            if (divAnimation2.f54584e.evaluate(expressionResolver2) != DivAnimation.Name.SET) {
                listM = v.e(divAnimation2);
            } else {
                listM = divAnimation2.f54583d;
                if (listM == null) {
                    listM = w.m();
                }
            }
            for (DivAnimation divAnimation4 : listM) {
                Transition transition2 = DivStateBinderKt.toTransition(divAnimation4, false, expressionResolver2);
                if (transition2 != null) {
                    transitionSet.addTransition(transition2.addTarget(view2).setDuration(divAnimation4.f54580a.evaluate(expressionResolver2).longValue()).setStartDelay(divAnimation4.f54586g.evaluate(expressionResolver2).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator(divAnimation4.f54582c.evaluate(expressionResolver2))));
                }
            }
        }
        if (view2 != null) {
            view2.clearAnimation();
        }
        return transitionSet;
    }

    private final Transition setupTransitions(DivTransitionBuilder divTransitionBuilder, DivStateTransitionHolder divStateTransitionHolder, DivState.State state, DivState.State state2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        DivTreeWalk divTreeWalkWalk;
        DivTreeWalk divTreeWalkOnEnter;
        Div div;
        DivTreeWalk divTreeWalkWalk2;
        DivTreeWalk divTreeWalkOnEnter2;
        ao.i<DivItemBuilderResult> iVarZ = null;
        if (p.f(state, state2)) {
            return null;
        }
        ao.i<DivItemBuilderResult> iVarZ2 = (state2 == null || (div = state2.f57194c) == null || (divTreeWalkWalk2 = DivTreeWalkKt.walk(div, expressionResolver2)) == null || (divTreeWalkOnEnter2 = divTreeWalkWalk2.onEnter(new l<Div, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$1
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Div div2) {
                return Boolean.valueOf(!(div2 instanceof Div.n));
            }
        })) == null) ? null : SequencesKt___SequencesKt.z(divTreeWalkOnEnter2, new l<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$2
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                List<DivTransitionTrigger> listL = divItemBuilderResult.getDiv().b().l();
                return Boolean.valueOf(listL != null ? DivTransitionsKt.allowsTransitionsOnStateChange(listL) : true);
            }
        });
        Div div2 = state.f57194c;
        if (div2 != null && (divTreeWalkWalk = DivTreeWalkKt.walk(div2, expressionResolver)) != null && (divTreeWalkOnEnter = divTreeWalkWalk.onEnter(new l<Div, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$3
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Div div3) {
                return Boolean.valueOf(!(div3 instanceof Div.n));
            }
        })) != null) {
            iVarZ = SequencesKt___SequencesKt.z(divTreeWalkOnEnter, new l<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$4
                @Override // sn.l
                @NotNull
                public final Boolean invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                    List<DivTransitionTrigger> listL = divItemBuilderResult.getDiv().b().l();
                    return Boolean.valueOf(listL != null ? DivTransitionsKt.allowsTransitionsOnStateChange(listL) : true);
                }
            });
        }
        TransitionSet transitionSetBuildTransitions = divTransitionBuilder.buildTransitions(iVarZ2, iVarZ, expressionResolver2, expressionResolver);
        divStateTransitionHolder.append(transitionSetBuildTransitions);
        return transitionSetBuildTransitions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void swipeOut(final DivStateLayout divStateLayout, final Div2View div2View, final ExpressionResolver expressionResolver, final List<DivAction> list) {
        div2View.bulkActions$div_release(new sn.a<r>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder.swipeOut.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DivActionBinder divActionBinder = DivStateBinder.this.divActionBinder;
                final Div2View div2View2 = div2View;
                final ExpressionResolver expressionResolver2 = expressionResolver;
                List<DivAction> list2 = list;
                final DivStateBinder divStateBinder = DivStateBinder.this;
                final DivStateLayout divStateLayout2 = divStateLayout;
                divActionBinder.handleActions$div_release(div2View2, expressionResolver2, list2, "state_swipe_out", new l<DivAction, r>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder.swipeOut.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(DivAction divAction) {
                        invoke2(divAction);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DivAction divAction) {
                        divStateBinder.div2Logger.logSwipedAway(div2View2, expressionResolver2, divStateLayout2, divAction);
                        divStateBinder.divActionBeaconSender.sendSwipeOutActionBeacon(divAction, expressionResolver2);
                    }
                });
            }
        });
    }

    private final void untrackRecursively(View view, Div2View div2View, ExpressionResolver expressionResolver) {
        if (view instanceof ViewGroup) {
            for (View view2 : ViewGroupKt.getChildren((ViewGroup) view)) {
                Div divUnbindViewFromDiv$div_release = div2View.unbindViewFromDiv$div_release(view2);
                if (divUnbindViewFromDiv$div_release != null) {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, div2View, expressionResolver, null, divUnbindViewFromDiv$div_release, null, null, 48, null);
                }
                untrackRecursively(view2, div2View, expressionResolver);
            }
        }
    }

    public void bindView(@NotNull final BindingContext bindingContext, @NotNull DivStateLayout divStateLayout, @NotNull Div.n nVar, @NotNull final DivStatePath divStatePath) {
        Div div;
        DivState divStateC = nVar.c();
        Div.n div2 = divStateLayout.getDiv();
        BindingContext bindingContext2 = divStateLayout.getBindingContext();
        ExpressionResolver expressionResolver = bindingContext2 != null ? bindingContext2.getExpressionResolver() : null;
        String id$div_release = DivPathUtils.INSTANCE.getId$div_release(divStateC, new sn.a<r>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bindView$id$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData()).logError(ParsingExceptionKt.missingValue("id", divStatePath.toString()));
            }
        });
        Pair<DivState.State, DivState.State> states = getStates(divStateC, bindingContext, divStateLayout, divStatePath, id$div_release);
        DivState.State stateComponent1 = states.component1();
        DivState.State stateComponent2 = states.component2();
        if (stateComponent1 == null || stateComponent2 == null) {
            return;
        }
        Div activeStateDiv$div_release = divStateLayout.getActiveStateDiv$div_release();
        if (div2 != nVar) {
            this.baseBinder.bindView(bindingContext, divStateLayout, nVar, activeStateDiv$div_release);
            div = activeStateDiv$div_release;
            bind(divStateLayout, bindingContext, divStateC, div2 != null ? div2.c() : null, stateComponent2, divStatePath);
        } else {
            div = activeStateDiv$div_release;
        }
        bindState(divStateLayout, bindingContext, divStateC, stateComponent2, div2 != null ? div2.c() : null, stateComponent1, div, divStatePath, expressionResolver, id$div_release);
    }
}
