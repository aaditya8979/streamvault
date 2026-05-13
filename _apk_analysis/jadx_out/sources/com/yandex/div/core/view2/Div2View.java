package com.yandex.div.core.view2;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.transition.Scene;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import bn.g;
import bn.r;
import cn.b0;
import cn.f0;
import cn.m;
import cn.v;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivKit;
import com.yandex.div.core.DivViewConfig;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.local.RuntimeStoreImpl;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.core.timer.DivTimerEventDispatcher;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.SingleTimeOnAttachCallback;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.animations.SceneRootWatcher;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.logging.bind.BindingEventReporter;
import com.yandex.div.core.view2.logging.bind.BindingEventReporterProvider;
import com.yandex.div.core.view2.logging.bind.ForceRebindReporter;
import com.yandex.div.core.view2.logging.bind.SimpleRebindReporter;
import com.yandex.div.core.view2.logging.patch.PatchEventReporterProvider;
import com.yandex.div.core.view2.reuse.ComplexRebindReporter;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.reuse.RebindTask;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.histogram.Div2ViewHistogramReporter;
import com.yandex.div.histogram.RenderConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.menu.OverflowMenuSubscriber$Listener;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.util.DivDataUtilsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivData;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Div2View.kt */
/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"ViewConstructor"})
public class Div2View extends FrameContainerLayout implements DivViewFacade {

    @Nullable
    private DivActionHandler actionHandler;
    private final boolean bindOnAttachEnabled;

    @Nullable
    private SingleTimeOnAttachCallback bindOnAttachRunnable;

    @NotNull
    private BindingContext bindingContext;

    @NotNull
    private final ViewBindingProvider bindingProvider;

    @NotNull
    private final BindingEventReporterProvider bindingReporterProvider;

    @NotNull
    private final BulkActionHandler bulkActionsHandler;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener clearVariablesListener;
    private final boolean complexRebindEnabled;
    private DivViewConfig config;
    private final long constructorCallTime;

    @NotNull
    private final Div2Context context;

    @NotNull
    private DivDataTag dataTag;

    @NotNull
    private final Div2Component div2Component;

    @NotNull
    private final Div2Builder divBuilder;

    @Nullable
    private DivData divData;

    @NotNull
    private final List<Object> divDataChangedObservers;

    @Nullable
    private DivTimerEventDispatcher divTimerEventDispatcher;

    @NotNull
    private final DivTransitionHandler divTransitionHandler;
    private boolean drawWasSkipped;
    private boolean forceCanvasClipping;

    @NotNull
    private final GestureDetector gestureDetector;

    @NotNull
    private final g histogramReporter$delegate;
    private boolean inMiddleOfBind;

    @NotNull
    private final InputFocusTracker inputFocusTracker;

    @NotNull
    private final Map<ExpressionResolver, Map<String, Integer>> layoutSizes;

    @NotNull
    private final List<LoadReference> loadReferences;

    @NotNull
    private final Object monitor;

    @Nullable
    private RuntimeStore oldRuntimeStore;

    @NotNull
    private final List<OverflowMenuSubscriber$Listener> overflowMenuListeners;

    @NotNull
    private final PatchEventReporterProvider patchReporterProvider;

    @NotNull
    private final ObserverList<PersistentDivDataObserver> persistentDivDataObservers;

    @NotNull
    private DivDataTag prevDataTag;

    @Nullable
    private RebindTask rebindTask;

    @NotNull
    private final a<RenderConfiguration> renderConfig;

    @Nullable
    private SingleTimeOnAttachCallback reportBindingFinishedRunnable;

    @Nullable
    private SingleTimeOnAttachCallback reportBindingResumedRunnable;

    @NotNull
    private RuntimeStore runtimeStore;
    private long stateId;
    private long timeCreated;

    @NotNull
    private final Map<DivData, DivLayoutProviderVariablesHolder> variablesHolders;

    @NotNull
    private final Div2ViewComponent viewComponent;

    @NotNull
    private final String viewCreateCallType;

    @NotNull
    private final WeakHashMap<View, Div> viewToDivBindings;

    /* JADX INFO: compiled from: Div2View.kt */
    public final class BulkActionHandler {
        private int bulkModeDepth;
        private boolean isPendingStateTemporary = true;

        @NotNull
        private final List<DivStatePath> pendingPaths = new ArrayList();

        @Nullable
        private DivData.State pendingState;

        public BulkActionHandler() {
        }

        private final void reset() {
            this.pendingState = null;
            this.isPendingStateTemporary = true;
            this.pendingPaths.clear();
        }

        public final void bulkActions(@NotNull a<r> aVar) {
            this.bulkModeDepth++;
            aVar.invoke();
            int i10 = this.bulkModeDepth - 1;
            this.bulkModeDepth = i10;
            if (i10 == 0) {
                runBulkActions();
            }
        }

        public final void runBulkActions() {
            DivData.State state = this.pendingState;
            if (state == null) {
                return;
            }
            if (state.f55092b != Div2View.this.getStateId$div_release()) {
                Div2View.this.switchToState(state.f55092b, this.isPendingStateTemporary);
            } else if (Div2View.this.getChildCount() > 0) {
                try {
                    Div2View.this.getViewComponent$div_release().getStateSwitcher().switchStates(state, CollectionsKt.immutableCopy(this.pendingPaths), Div2View.this.getExpressionResolver());
                } catch (StateConflictException e10) {
                    DivActionTypedUtilsKt.logError(Div2View.this, e10);
                    Div2View.this.resetToInitialState();
                }
            }
            reset();
        }

        public final void switchMultipleStates(@Nullable DivData.State state, @NotNull List<DivStatePath> list, boolean z10) {
            DivData.State state2 = this.pendingState;
            if (state2 != null && !p.f(state, state2)) {
                reset();
            }
            this.pendingState = state;
            this.isPendingStateTemporary = this.isPendingStateTemporary && z10;
            b0.F(this.pendingPaths, list);
            Div2View div2View = Div2View.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                div2View.getDiv2Component$div_release().getStateManager().updateStates(div2View.getDivTag().getId(), (DivStatePath) it.next(), z10);
            }
            if (this.bulkModeDepth == 0) {
                runBulkActions();
            }
        }

        public final void switchState(@Nullable DivData.State state, @NotNull DivStatePath divStatePath, boolean z10) {
            switchMultipleStates(state, v.e(divStatePath), z10);
        }
    }

    public Div2View(@NotNull Div2Context div2Context, @Nullable AttributeSet attributeSet, int i10) {
        this(div2Context, attributeSet, i10, SystemClock.uptimeMillis());
    }

    public /* synthetic */ Div2View(Div2Context div2Context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(div2Context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private Div2View(Div2Context div2Context, AttributeSet attributeSet, int i10, long j10) {
        super(div2Context, attributeSet, i10);
        this.context = div2Context;
        this.constructorCallTime = j10;
        this.div2Component = getContext$div_release().getDiv2Component$div_release();
        this.viewComponent = getDiv2Component$div_release().viewComponent().divView(this).build();
        this.bindOnAttachEnabled = getDiv2Component$div_release().isBindOnAttachEnabled();
        this.complexRebindEnabled = getDiv2Component$div_release().isComplexRebindEnabled();
        this.bindingProvider = getViewComponent$div_release().getBindingProvider();
        this.bindingReporterProvider = new BindingEventReporterProvider(this);
        this.patchReporterProvider = new PatchEventReporterProvider(this);
        this.divBuilder = getContext$div_release().getDiv2Component$div_release().getDiv2Builder();
        this.loadReferences = new ArrayList();
        this.overflowMenuListeners = new ArrayList();
        this.divDataChangedObservers = new ArrayList();
        this.persistentDivDataObservers = new ObserverList<>();
        this.viewToDivBindings = new WeakHashMap<>();
        this.bulkActionsHandler = new BulkActionHandler();
        this.runtimeStore = RuntimeStore.Companion.getEMPTY();
        this.bindingContext = new BindingContext(this, ExpressionResolver.EMPTY);
        this.monitor = new Object();
        this.stateId = DivDataUtilsKt.getINVALID_STATE_ID(DivData.f55077j);
        this.config = DivViewConfig.DEFAULT;
        this.renderConfig = new a<RenderConfiguration>() { // from class: com.yandex.div.core.view2.Div2View$renderConfig$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            public final RenderConfiguration invoke() {
                return DivKit.Companion.getInstance(this.this$0.getContext$div_release()).getComponent$div_release().getHistogramRecordConfiguration().getRenderConfiguration().get();
            }
        };
        this.histogramReporter$delegate = b.a(LazyThreadSafetyMode.NONE, new a<Div2ViewHistogramReporter>() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final Div2ViewHistogramReporter invoke() {
                final Div2View div2View = this.this$0;
                return new Div2ViewHistogramReporter(new a<HistogramReporter>() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final HistogramReporter invoke() {
                        return div2View.getDiv2Component$div_release().getHistogramReporter();
                    }
                }, this.this$0.renderConfig);
            }
        });
        this.gestureDetector = new GestureDetector(getContext$div_release(), new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.div.core.view2.Div2View$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(@NotNull MotionEvent motionEvent) {
                Div2View div2View = this.this$0;
                BaseDivViewExtensionsKt.clearFocusOnClick(div2View, div2View.getInputFocusTracker$div_release());
                return true;
            }
        }, new Handler(Looper.getMainLooper()));
        this.inputFocusTracker = getViewComponent$div_release().getInputFocusTracker();
        this.layoutSizes = new LinkedHashMap();
        this.variablesHolders = new LinkedHashMap();
        DivDataTag divDataTag = DivDataTag.INVALID;
        this.dataTag = divDataTag;
        this.prevDataTag = divDataTag;
        this.timeCreated = -1L;
        this.viewCreateCallType = getDiv2Component$div_release().getDivCreationTracker().getViewCreateCallType();
        this.drawWasSkipped = true;
        this.divTransitionHandler = new DivTransitionHandler(this);
        this.timeCreated = DivCreationTracker.Companion.getCurrentUptimeMillis();
        getDiv2Component$div_release().getReleaseManager().observeDivLifecycle(this);
    }

    private void addNewStateViewWithTransition(DivData divData, DivData divData2, Div div, DivData.State state, View view, boolean z10, boolean z11) {
        Transition transitionPrepareTransition = z10 ? prepareTransition(divData, divData2, div, state.f55091a) : null;
        if (transitionPrepareTransition != null) {
            Scene currentScene = Scene.getCurrentScene(this);
            if (currentScene != null) {
                currentScene.setExitAction(new Runnable() { // from class: ig.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Div2View.addNewStateViewWithTransition$lambda$41(this.f64206b);
                    }
                });
            }
        } else {
            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this, this);
        }
        if (z11) {
            getDiv2Component$div_release().getDivBinder().bind(getBindingContext$div_release(), view, state.f55091a, DivStatePath.Companion.fromState$div_release(state));
        }
        if (transitionPrepareTransition == null) {
            addView(view);
            getViewComponent$div_release().getErrorMonitor().connect(this);
        } else {
            TransitionManager.endTransitions(this);
            Scene scene = new Scene(this, view);
            SceneRootWatcher.INSTANCE.watchFor(scene, transitionPrepareTransition);
            TransitionManager.go(scene, transitionPrepareTransition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addNewStateViewWithTransition$lambda$41(Div2View div2View) {
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(div2View, div2View);
    }

    private View buildViewAndUpdateState(DivData.State state, long j10, boolean z10) {
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), j10, z10);
        View viewBuildView = this.divBuilder.buildView(state.f55091a, getBindingContext$div_release(), DivStatePath.Companion.fromState$div_release(state));
        getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
        return viewBuildView;
    }

    public static /* synthetic */ View buildViewAndUpdateState$default(Div2View div2View, DivData.State state, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAndUpdateState");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return div2View.buildViewAndUpdateState(state, j10, z10);
    }

    private View buildViewAsyncAndUpdateState(final DivData.State state, long j10, boolean z10) {
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), j10, z10);
        final DivStatePath divStatePathFromState$div_release = DivStatePath.Companion.fromState$div_release(state);
        final View viewCreateView = this.divBuilder.createView(state.f55091a, getBindingContext$div_release(), divStatePathFromState$div_release);
        if (this.bindOnAttachEnabled) {
            setBindOnAttachRunnable$div_release(new SingleTimeOnAttachCallback(this, new a<r>() { // from class: com.yandex.div.core.view2.Div2View.buildViewAsyncAndUpdateState.1
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
                    Div2View div2View = Div2View.this;
                    View view = viewCreateView;
                    DivData.State state2 = state;
                    try {
                        div2View.getDiv2Component$div_release().getDivBinder().bind(div2View.getBindingContext$div_release(), view, state2.f55091a, divStatePathFromState$div_release);
                    } catch (ParsingException e10) {
                        if (!ExpressionFallbacksHelperKt.isExpressionResolveFail(e10)) {
                            throw e10;
                        }
                    }
                    Div2View.this.getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
                }
            }));
        } else {
            getDiv2Component$div_release().getDivBinder().bind(getBindingContext$div_release(), viewCreateView, state.f55091a, divStatePathFromState$div_release);
            if (isAttachedToWindow()) {
                getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
            } else {
                addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@NotNull View view) {
                        this.removeOnAttachStateChangeListener(this);
                        this.getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@NotNull View view) {
                    }
                });
            }
        }
        return viewCreateView;
    }

    public static /* synthetic */ View buildViewAsyncAndUpdateState$default(Div2View div2View, DivData.State state, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAsyncAndUpdateState");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return div2View.buildViewAsyncAndUpdateState(state, j10, z10);
    }

    private void cancelImageLoads() {
        Iterator<T> it = this.loadReferences.iterator();
        while (it.hasNext()) {
            ((LoadReference) it.next()).cancel();
        }
        this.loadReferences.clear();
    }

    private void cleanup(boolean z10) {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            rebindTask.clear();
            r rVar = r.f5635a;
            this.rebindTask = null;
        }
        discardVisibilityTracking();
        cancelImageLoads();
        ReleaseUtils releaseUtils = ReleaseUtils.INSTANCE;
        releaseUtils.releaseMedia$div_release(this, this);
        stopLoadAndSubscriptions();
        getDiv2Component$div_release().getBitmapEffectHelper().release();
        if (z10) {
            releaseUtils.releaseAndRemoveChildren$div_release(this, this);
        }
        ErrorCollector orNull = getViewComponent$div_release().getErrorCollectors().getOrNull(getDataTag(), getDivData());
        if (orNull != null) {
            orNull.cleanRuntimeWarningsAndErrors();
        }
        setDivData$div_release(null);
        setDataTag$div_release(DivDataTag.INVALID);
    }

    private boolean complexRebind(DivData divData, DivData divData2, ComplexRebindReporter complexRebindReporter) {
        DivData.State stateToBind = getStateToBind(divData);
        if (stateToBind == null) {
            complexRebindReporter.onComplexRebindFatalNoState();
            return false;
        }
        getHistogramReporter().onRebindingStarted();
        setDivData$div_release(divData);
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask == null) {
            rebindTask = new RebindTask(this, getDiv2Component$div_release().getDivBinder(), getOldExpressionResolver$div_release(), getExpressionResolver(), complexRebindReporter);
            this.rebindTask = rebindTask;
        }
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), stateToBind.f55092b, false);
        View childAt = getView().getChildAt(0);
        p.i(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        if (!rebindTask.prepareAndRebind(divData2, divData, (ViewGroup) childAt, DivStatePath.Companion.fromState$div_release(stateToBind))) {
            return false;
        }
        requestLayout();
        getHistogramReporter().onRebindingFinished();
        return true;
    }

    private void discardChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component$div_release().getVisibilityActionTracker();
        for (Map.Entry<View, Div> entry : this.viewToDivBindings.entrySet()) {
            View key = entry.getKey();
            Div value = entry.getValue();
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(key);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, value, null, null, 48, null);
            }
        }
    }

    private void discardStateVisibility(DivData.State state) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(getDiv2Component$div_release().getVisibilityActionTracker(), this, getExpressionResolver(), null, state.f55091a, null, null, 48, null);
    }

    private boolean forceSwitchToState(long j10, boolean z10) {
        Object next;
        Object next2;
        setStateId$div_release(j10);
        DivViewState currentState = getCurrentState();
        Long lValueOf = currentState != null ? Long.valueOf(currentState.getCurrentDivStateId()) : null;
        DivData divData = getDivData();
        if (divData == null) {
            return false;
        }
        Iterator<T> it = divData.f55082c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (lValueOf != null && ((DivData.State) next).f55092b == lValueOf.longValue()) {
                break;
            }
        }
        DivData.State state = (DivData.State) next;
        Iterator<T> it2 = divData.f55082c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((DivData.State) next2).f55092b == j10) {
                break;
            }
        }
        DivData.State state2 = (DivData.State) next2;
        if (state2 == null) {
            return false;
        }
        if (state != null) {
            discardStateVisibility(state);
        }
        trackStateVisibility(state2);
        boolean zAreDivsReplaceable$default = DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, state != null ? state.f55091a : null, state2.f55091a, getExpressionResolver(), getExpressionResolver(), null, 16, null);
        addNewStateViewWithTransition(divData, divData, state != null ? state.f55091a : null, state2, zAreDivsReplaceable$default ? updateState(j10, z10) : buildViewAndUpdateState(state2, j10, z10), DivTransitionsKt.allowsTransitionsOnDataChange(divData, getExpressionResolver()), zAreDivsReplaceable$default);
        return true;
    }

    @VisibleForTesting
    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    private DivVideoActionHandler getDivVideoActionHandler() {
        return getDiv2Component$div_release().getDivVideoActionHandler();
    }

    public static /* synthetic */ void getForceCanvasClipping$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Div2ViewHistogramReporter getHistogramReporter() {
        return (Div2ViewHistogramReporter) this.histogramReporter$delegate.getValue();
    }

    private ExpressionResolver getResolver(RuntimeStore runtimeStore) {
        ExpressionsRuntime rootRuntime;
        ExpressionResolverImpl expressionResolver;
        RuntimeStoreImpl runtimeStoreImpl = runtimeStore instanceof RuntimeStoreImpl ? (RuntimeStoreImpl) runtimeStore : null;
        return (runtimeStoreImpl == null || (rootRuntime = runtimeStoreImpl.getRootRuntime()) == null || (expressionResolver = rootRuntime.getExpressionResolver()) == null) ? ExpressionResolver.EMPTY : expressionResolver;
    }

    @VisibleForTesting
    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    private DivData.State getStateToBind(DivData divData) {
        Object next;
        Iterator<T> it = divData.f55082c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DivData.State) next).f55092b == getStateId$div_release()) {
                break;
            }
        }
        DivData.State state = (DivData.State) next;
        return state == null ? (DivData.State) f0.v0(divData.f55082c) : state;
    }

    private DivTooltipController getTooltipController() {
        return getDiv2Component$div_release().getTooltipController();
    }

    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }

    private ao.i<DivItemBuilderResult> itemSequenceForTransition(DivData divData, Div div, final ExpressionResolver expressionResolver) {
        DivTransitionSelector divTransitionSelectorEvaluate;
        Expression<DivTransitionSelector> expression;
        final m mVar = new m();
        if (divData == null || (expression = divData.f55084e) == null || (divTransitionSelectorEvaluate = expression.evaluate(expressionResolver)) == null) {
            divTransitionSelectorEvaluate = DivTransitionSelector.NONE;
        }
        mVar.addLast(divTransitionSelectorEvaluate);
        return SequencesKt___SequencesKt.z(DivTreeWalkKt.walk(div, expressionResolver).onEnter(new l<Div, Boolean>() { // from class: com.yandex.div.core.view2.Div2View.itemSequenceForTransition.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Div div2) {
                if (div2 instanceof Div.n) {
                    mVar.addLast(((Div.n) div2).c().L.evaluate(expressionResolver));
                }
                return Boolean.TRUE;
            }
        }).onLeave(new l<Div, r>() { // from class: com.yandex.div.core.view2.Div2View.itemSequenceForTransition.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Div div2) {
                invoke2(div2);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Div div2) {
                if (div2 instanceof Div.n) {
                    mVar.removeLast();
                }
            }
        }), new l<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.Div2View.itemSequenceForTransition.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                boolean zAllowsTransitionsOnDataChange;
                List<DivTransitionTrigger> listL = divItemBuilderResult.getDiv().b().l();
                if (listL != null) {
                    zAllowsTransitionsOnDataChange = DivTransitionsKt.allowsTransitionsOnDataChange(listL);
                } else {
                    DivTransitionSelector divTransitionSelectorM = mVar.m();
                    zAllowsTransitionsOnDataChange = divTransitionSelectorM != null ? DivTransitionsKt.allowsTransitionsOnDataChange(divTransitionSelectorM) : false;
                }
                return Boolean.valueOf(zAllowsTransitionsOnDataChange);
            }
        });
    }

    private void notifyBindEnded() {
        setInMiddleOfBind$div_release(false);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onAfterDivDataChanged();
        }
    }

    private void notifyBindStarted() {
        if (getInMiddleOfBind$div_release()) {
            DivActionTypedUtilsKt.logError(this, new RuntimeException("New binding started when previous not ended!"));
        }
        setInMiddleOfBind$div_release(true);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onBeforeDivDataChanged();
        }
    }

    private Transition prepareTransition(DivData divData, final DivData divData2, Div div, Div div2) {
        if (div == div2) {
            return null;
        }
        final TransitionSet transitionSetBuildTransitions = getViewComponent$div_release().getTransitionBuilder().buildTransitions(div != null ? itemSequenceForTransition(divData, div, getOldExpressionResolver$div_release()) : null, div2 != null ? itemSequenceForTransition(divData2, div2, getExpressionResolver()) : null, getOldExpressionResolver$div_release(), getExpressionResolver());
        if (transitionSetBuildTransitions.getTransitionCount() == 0) {
            return null;
        }
        final DivDataChangeListener divDataChangeListener = getDiv2Component$div_release().getDivDataChangeListener();
        divDataChangeListener.beforeAnimatedDataChange(this, divData2);
        transitionSetBuildTransitions.addListener((Transition.TransitionListener) new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.Div2View$prepareTransition$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition) {
                divDataChangeListener.afterAnimatedDataChange(this, divData2);
                transitionSetBuildTransitions.removeListener(this);
            }
        });
        return transitionSetBuildTransitions;
    }

    private void rebind(DivData divData, boolean z10, SimpleRebindReporter simpleRebindReporter) {
        try {
            if (getChildCount() == 0) {
                simpleRebindReporter.onSimpleRebindNoChild();
                updateNow(divData, getDataTag(), simpleRebindReporter);
                return;
            }
            DivData.State stateToBind = getStateToBind(divData);
            if (stateToBind == null) {
                simpleRebindReporter.onSimpleRebindFatalNoState();
                return;
            }
            getHistogramReporter().onRebindingStarted();
            ErrorCollector orNull = getViewComponent$div_release().getErrorCollectors().getOrNull(getDataTag(), getDivData());
            if (orNull != null) {
                orNull.cleanRuntimeWarningsAndErrors();
            }
            setDivData$div_release(divData);
            getDiv2Component$div_release().getStateManager().updateState(getDataTag(), stateToBind.f55092b, true);
            getDiv2Component$div_release().getDivBinder().bind(getBindingContext$div_release(), getChildAt(0), stateToBind.f55091a, DivStatePath.Companion.fromState$div_release(stateToBind));
            requestLayout();
            if (z10) {
                getDiv2Component$div_release().getDivStateChangeListener().onDivAnimatedStateChanged(this);
            }
            tryAttachVariableTriggers(divData);
            getHistogramReporter().onRebindingFinished();
            simpleRebindReporter.onSimpleRebindSuccess();
        } catch (Exception e10) {
            simpleRebindReporter.onSimpleRebindException(e10);
            updateNow(divData, getDataTag(), simpleRebindReporter);
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("", e10);
            }
        }
    }

    private void sendCreationHistograms() {
        if (this.timeCreated < 0) {
            return;
        }
        getDiv2Component$div_release().getDivCreationTracker().sendHistograms(this.constructorCallTime, this.timeCreated, getDiv2Component$div_release().getHistogramReporter(), this.viewCreateCallType);
        this.timeCreated = -1L;
    }

    private DivData.State state(DivData divData) {
        Object next;
        long jStateId = stateId(divData);
        Iterator<T> it = divData.f55082c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DivData.State) next).f55092b == jStateId) {
                break;
            }
        }
        return (DivData.State) next;
    }

    private long stateId(DivData divData) {
        DivViewState currentState = getCurrentState();
        return currentState != null ? currentState.getCurrentDivStateId() : DivDataUtilsKt.getInitialStateId(divData);
    }

    private void stopLoadAndSubscriptions() {
        this.viewToDivBindings.clear();
        cancelTooltips();
        clearSubscriptions();
        this.divDataChangedObservers.clear();
    }

    private boolean switchToDivData(DivData divData, DivData divData2, ForceRebindReporter forceRebindReporter) {
        DivData.State state = divData != null ? state(divData) : null;
        DivData.State state2 = state(divData2);
        setStateId$div_release(stateId(divData2));
        if (state2 == null) {
            forceRebindReporter.onForceRebindFatalNoState();
            return false;
        }
        View viewBuildViewAsyncAndUpdateState$default = divData == null ? buildViewAsyncAndUpdateState$default(this, state2, getStateId$div_release(), false, 4, null) : buildViewAndUpdateState$default(this, state2, getStateId$div_release(), false, 4, null);
        if (state != null) {
            discardStateVisibility(state);
        }
        trackStateVisibility(state2);
        addNewStateViewWithTransition(divData, divData2, state != null ? state.f55091a : null, state2, viewBuildViewAsyncAndUpdateState$default, (divData != null && DivTransitionsKt.allowsTransitionsOnDataChange(divData, getOldExpressionResolver$div_release())) || DivTransitionsKt.allowsTransitionsOnDataChange(divData2, getExpressionResolver()), false);
        if (divData != null) {
            forceRebindReporter.onForceRebindSuccess();
        } else {
            forceRebindReporter.onFirstBindingCompleted();
        }
        return true;
    }

    private void trackStateVisibility(DivData.State state) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(getDiv2Component$div_release().getVisibilityActionTracker(), this, getExpressionResolver(), getView(), state.f55091a, null, null, 48, null);
    }

    private void tryAttachVariableTriggers(DivData divData) {
        DivData.State state;
        if ((this.bindOnAttachEnabled && !getView().isAttachedToWindow()) || divData == null || (state = state(divData)) == null) {
            return;
        }
        getViewComponent$div_release().getRuntimeVisitor().createAndAttachRuntimes(state.f55091a, DivStatePath.Companion.fromState$div_release(state), this);
    }

    private boolean updateNow(DivData divData, DivDataTag divDataTag, ForceRebindReporter forceRebindReporter) {
        DivData divData2 = getDivData();
        if (divData2 == null) {
            getHistogramReporter().onBindingStarted();
        } else {
            getHistogramReporter().onRebindingStarted();
        }
        cleanup(false);
        setDataTag$div_release(divDataTag);
        setDivData$div_release(divData);
        boolean zSwitchToDivData = switchToDivData(divData2, divData, forceRebindReporter);
        tryAttachVariableTriggers(divData);
        if (divData2 != null) {
            getHistogramReporter().onRebindingFinished();
            return zSwitchToDivData;
        }
        if (!this.bindOnAttachEnabled) {
            getHistogramReporter().onBindingFinished();
            return zSwitchToDivData;
        }
        getHistogramReporter().onBindingPaused();
        this.reportBindingResumedRunnable = new SingleTimeOnAttachCallback(this, new a<r>() { // from class: com.yandex.div.core.view2.Div2View.updateNow.1
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
                Div2View.this.getHistogramReporter().onBindingResumed();
            }
        });
        this.reportBindingFinishedRunnable = new SingleTimeOnAttachCallback(this, new a<r>() { // from class: com.yandex.div.core.view2.Div2View.updateNow.2
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
                Div2View.this.getHistogramReporter().onBindingFinished();
            }
        });
        return zSwitchToDivData;
    }

    private void updateRuntimeStore(DivData divData, DivDataTag divDataTag) {
        RuntimeStore runtimeStore;
        if (divData == null) {
            return;
        }
        this.oldRuntimeStore = getRuntimeStore$div_release();
        setRuntimeStore$div_release(getDiv2Component$div_release().getRuntimeStoreProvider().getOrCreate$div_release(divDataTag, divData, this));
        getRuntimeStore$div_release().updateSubscriptions();
        if (!p.f(this.oldRuntimeStore, getRuntimeStore$div_release()) && (runtimeStore = this.oldRuntimeStore) != null) {
            runtimeStore.clearBindings(this);
        }
        setBindingContext$div_release(new BindingContext(this, getExpressionResolver()));
    }

    public static /* synthetic */ void updateRuntimeStore$default(Div2View div2View, DivData divData, DivDataTag divDataTag, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRuntimeStore");
        }
        if ((i10 & 1) != 0) {
            divData = div2View.getDivData();
        }
        if ((i10 & 2) != 0) {
            divDataTag = div2View.getDataTag();
        }
        div2View.updateRuntimeStore(divData, divDataTag);
    }

    private View updateState(long j10, boolean z10) {
        View childAt = getView().getChildAt(0);
        getDiv2Component$div_release().getStateManager().updateState(getDataTag(), j10, z10);
        getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
        return childAt;
    }

    private void updateTimers() {
        DivTimerEventDispatcher divTimerEventDispatcher$div_release;
        DivData divData = getDivData();
        if (divData == null) {
            return;
        }
        DivTimerEventDispatcher orCreate$div_release = getDiv2Component$div_release().getDivTimersControllerProvider().getOrCreate$div_release(getDataTag(), divData, getExpressionResolver());
        if (!p.f(getDivTimerEventDispatcher$div_release(), orCreate$div_release) && (divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release()) != null) {
            divTimerEventDispatcher$div_release.onDetach(this);
        }
        setDivTimerEventDispatcher$div_release(orCreate$div_release);
        if (orCreate$div_release != null) {
            orCreate$div_release.onAttach(this);
        }
    }

    public void addLoadReference(@NotNull LoadReference loadReference, @NotNull View view) {
        synchronized (this.monitor) {
            this.loadReferences.add(loadReference);
        }
    }

    public void addPersistentDivDataObserver$div_release(@NotNull PersistentDivDataObserver persistentDivDataObserver) {
        synchronized (this.monitor) {
            this.persistentDivDataObservers.addObserver(persistentDivDataObserver);
        }
    }

    public void applyTimerCommand(@NotNull String str, @NotNull String str2) {
        DivTimerEventDispatcher divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.changeState(str, str2);
        }
    }

    public boolean applyVideoCommand(@NotNull String str, @NotNull String str2, @NotNull ExpressionResolver expressionResolver) {
        return getDivVideoActionHandler().handleAction(this, str, str2, expressionResolver);
    }

    public void bindViewToDiv$div_release(@NotNull View view, @NotNull Div div) {
        this.viewToDivBindings.put(view, div);
    }

    public void bulkActions$div_release(@NotNull a<r> aVar) {
        this.bulkActionsHandler.bulkActions(aVar);
    }

    public void cancelTooltips() {
        getTooltipController().cancelTooltips(this);
    }

    public void cleanup() {
        synchronized (this.monitor) {
            cleanup(true);
            r rVar = r.f5635a;
        }
    }

    public void clearSubscriptions() {
        synchronized (this.monitor) {
            this.overflowMenuListeners.clear();
            r rVar = r.f5635a;
        }
    }

    public void discardVisibilityTracking() {
        List<DivData.State> list;
        DivData divData = getDivData();
        DivData.State state = null;
        Object obj = null;
        state = null;
        if (divData != null && (list = divData.f55082c) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((DivData.State) next).f55092b == getStateId$div_release()) {
                    obj = next;
                    break;
                }
            }
            state = (DivData.State) obj;
        }
        if (state != null) {
            discardStateVisibility(state);
        }
        discardChildrenVisibility();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawStarted();
        }
        super.dispatchDraw(canvas);
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawFinished();
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        this.drawWasSkipped = false;
        getHistogramReporter().onDrawStarted();
        super.draw(canvas);
        getHistogramReporter().onDrawFinished();
        this.drawWasSkipped = true;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @Nullable View view, long j10) {
        if (view != null) {
            if (view.getVisibility() == 0) {
                BaseDivViewExtensionsKt.drawShadow(view, canvas);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Nullable
    public DivActionHandler getActionHandler() {
        return this.actionHandler;
    }

    @Nullable
    public SingleTimeOnAttachCallback getBindOnAttachRunnable$div_release() {
        return this.bindOnAttachRunnable;
    }

    @NotNull
    public BindingContext getBindingContext$div_release() {
        return this.bindingContext;
    }

    @Nullable
    public ViewTreeObserver.OnPreDrawListener getClearVariablesListener$div_release() {
        return this.clearVariablesListener;
    }

    public boolean getComplexRebindInProgress$div_release() {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            return rebindTask.getRebindInProgress();
        }
        return false;
    }

    @Nullable
    public String getComponentName() {
        return getHistogramReporter().getComponent();
    }

    @NotNull
    public DivViewConfig getConfig() {
        return this.config;
    }

    @NotNull
    public Div2Context getContext$div_release() {
        return this.context;
    }

    @Nullable
    public ReusableTokenList getCurrentRebindReusableList$div_release() {
        RebindTask rebindTask;
        if (getComplexRebindInProgress$div_release() && (rebindTask = this.rebindTask) != null) {
            return rebindTask.getReusableList();
        }
        return null;
    }

    @NotNull
    public DivStatePath getCurrentRootPath$div_release() {
        List<DivData.State> list;
        Object next;
        DivStatePath divStatePathFromState$div_release;
        DivData divData = getDivData();
        if (divData != null && (list = divData.f55082c) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((DivData.State) next).f55092b == getStateId$div_release()) {
                    break;
                }
            }
            DivData.State state = (DivData.State) next;
            if (state != null && (divStatePathFromState$div_release = DivStatePath.Companion.fromState$div_release(state)) != null) {
                return divStatePathFromState$div_release;
            }
        }
        return DivStatePath.Companion.fromState(getStateId$div_release());
    }

    @Nullable
    public DivViewState getCurrentState() {
        DivData divData = getDivData();
        if (divData == null) {
            return null;
        }
        DivViewState state = getDiv2Component$div_release().getStateManager().getState(getDataTag());
        List<DivData.State> list = divData.f55082c;
        boolean z10 = true;
        if ((list instanceof Collection) && list.isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (state != null && ((DivData.State) it.next()).f55092b == state.getCurrentDivStateId()) {
                    break;
                }
            }
            z10 = false;
        }
        if (z10) {
            return state;
        }
        return null;
    }

    public long getCurrentStateId() {
        return getStateId$div_release();
    }

    @NotNull
    public DivCustomContainerChildFactory getCustomContainerChildFactory$div_release() {
        return getDiv2Component$div_release().getDivCustomContainerChildFactory();
    }

    @NotNull
    public DivDataTag getDataTag() {
        return this.dataTag;
    }

    @NotNull
    public Div2Component getDiv2Component$div_release() {
        return this.div2Component;
    }

    @Nullable
    public DivData getDivData() {
        return this.divData;
    }

    @NotNull
    public DivDataTag getDivTag() {
        return getDataTag();
    }

    @Nullable
    public DivTimerEventDispatcher getDivTimerEventDispatcher$div_release() {
        return this.divTimerEventDispatcher;
    }

    @NotNull
    public DivTransitionHandler getDivTransitionHandler$div_release() {
        return this.divTransitionHandler;
    }

    @NotNull
    public ExpressionResolver getExpressionResolver() {
        return getResolver(getRuntimeStore$div_release());
    }

    public boolean getForceCanvasClipping() {
        return this.forceCanvasClipping;
    }

    public boolean getInMiddleOfBind$div_release() {
        return this.inMiddleOfBind;
    }

    @NotNull
    public InputFocusTracker getInputFocusTracker$div_release() {
        return this.inputFocusTracker;
    }

    @NotNull
    public Map<ExpressionResolver, Map<String, Integer>> getLayoutSizes$div_release() {
        return this.layoutSizes;
    }

    @NotNull
    public String getLogId() {
        String str;
        DivData divData = getDivData();
        return (divData == null || (str = divData.f55081b) == null) ? "" : str;
    }

    @NotNull
    public MediaReleaseViewVisitor getMediaReleaseViewVisitor$div_release() {
        return getViewComponent$div_release().getMediaReleaseViewVisitor();
    }

    @NotNull
    public ExpressionResolver getOldExpressionResolver$div_release() {
        return getResolver(this.oldRuntimeStore);
    }

    @NotNull
    public DivDataTag getPrevDataTag() {
        return this.prevDataTag;
    }

    @NotNull
    public ReleaseViewVisitor getReleaseViewVisitor$div_release() {
        return getViewComponent$div_release().getReleaseViewVisitor();
    }

    @NotNull
    public RuntimeStore getRuntimeStore$div_release() {
        return this.runtimeStore;
    }

    public long getStateId$div_release() {
        return this.stateId;
    }

    @NotNull
    public Map<DivData, DivLayoutProviderVariablesHolder> getVariablesHolders$div_release() {
        return this.variablesHolders;
    }

    @Override // com.yandex.div.core.DivViewFacade
    @NotNull
    public Div2View getView() {
        return this;
    }

    @NotNull
    public Div2ViewComponent getViewComponent$div_release() {
        return this.viewComponent;
    }

    public boolean getVisualErrorsEnabled() {
        return getViewComponent$div_release().getErrorMonitor().getEnabled$div_release();
    }

    public void handleAction(@NotNull DivAction divAction, @NotNull String str, @NotNull ExpressionResolver expressionResolver) {
        handleActionWithResult(divAction, str, expressionResolver);
    }

    public boolean handleActionWithResult(@NotNull DivAction divAction, @NotNull String str, @NotNull ExpressionResolver expressionResolver) {
        return getDiv2Component$div_release().getActionBinder().handleAction$div_release(this, expressionResolver, divAction, str, null, getActionHandler());
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void hideTooltip(@NotNull String str) {
        getTooltipController().hideTooltip(str, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        SingleTimeOnAttachCallback singleTimeOnAttachCallback = this.reportBindingResumedRunnable;
        if (singleTimeOnAttachCallback != null) {
            singleTimeOnAttachCallback.onAttach();
        }
        tryAttachVariableTriggers(getDivData());
        SingleTimeOnAttachCallback bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
        if (bindOnAttachRunnable$div_release != null) {
            bindOnAttachRunnable$div_release.onAttach();
        }
        SingleTimeOnAttachCallback singleTimeOnAttachCallback2 = this.reportBindingFinishedRunnable;
        if (singleTimeOnAttachCallback2 != null) {
            singleTimeOnAttachCallback2.onAttach();
        }
        DivTimerEventDispatcher divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.onAttach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        discardVisibilityTracking();
        DivTimerEventDispatcher divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.onDetach(this);
        }
        getViewComponent$div_release().getAnimatorController().onDetachedFromWindow();
        getRuntimeStore$div_release().onDetachedFromWindow(this);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        getHistogramReporter().onLayoutStarted();
        super.onLayout(z10, i10, i11, i12, i13);
        tryLogVisibility();
        getHistogramReporter().onLayoutFinished();
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        getHistogramReporter().onMeasureStarted();
        super.onMeasure(i10, i11);
        getHistogramReporter().onMeasureFinished();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        if (getInputFocusTracker$div_release().isFocusedOnInput()) {
            this.gestureDetector.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 0) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removePersistentDivDataObserver$div_release(@NotNull PersistentDivDataObserver persistentDivDataObserver) {
        synchronized (this.monitor) {
            this.persistentDivDataObservers.removeObserver(persistentDivDataObserver);
        }
    }

    public void resetToInitialState() {
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            currentState.reset();
        }
        getDiv2Component$div_release().getTemporaryDivStateCache().resetCard(getDivTag().getId());
        switchToInitialState();
    }

    @Nullable
    public Div rootDiv$div_release() {
        DivData.State state;
        DivData divData = getDivData();
        if (divData == null || (state = state(divData)) == null) {
            return null;
        }
        return state.f55091a;
    }

    public void setActionHandler(@Nullable DivActionHandler divActionHandler) {
        this.actionHandler = divActionHandler;
    }

    public void setBindOnAttachRunnable$div_release(@Nullable SingleTimeOnAttachCallback singleTimeOnAttachCallback) {
        this.bindOnAttachRunnable = singleTimeOnAttachCallback;
    }

    public void setBindingContext$div_release(@NotNull BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    public void setClearVariablesListener$div_release(@Nullable ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.clearVariablesListener = onPreDrawListener;
    }

    public void setComponentName(@Nullable String str) {
        getHistogramReporter().setComponent(str);
    }

    public void setConfig(@NotNull DivViewConfig divViewConfig) {
        this.config = divViewConfig;
    }

    public boolean setData(@Nullable DivData divData, @NotNull DivDataTag divDataTag) {
        return setData(divData, getDivData(), divDataTag);
    }

    public boolean setData(@Nullable DivData divData, @Nullable DivData divData2, @NotNull DivDataTag divDataTag) {
        synchronized (this.monitor) {
            BindingEventReporter bindingEventReporter = this.bindingReporterProvider.get(divData2, divData);
            boolean zUpdateNow = false;
            if (divData == null) {
                bindingEventReporter.onBindingFatalNoData();
                return false;
            }
            if (getDivData() == divData) {
                bindingEventReporter.onBindingFatalSameData();
                return false;
            }
            notifyBindStarted();
            SingleTimeOnAttachCallback bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
            if (bindOnAttachRunnable$div_release != null) {
                bindOnAttachRunnable$div_release.cancel();
            }
            getHistogramReporter().onRenderStarted();
            DivData divData3 = getDivData();
            DivData divData4 = divData3 == null ? divData2 : divData3;
            updateRuntimeStore(divData, divDataTag);
            setDataTag$div_release(divDataTag);
            for (DivData.State state : divData.f55082c) {
                DivViewDataPreloader.preload$default(getDiv2Component$div_release().getDivViewDataPreloader(), state.f55091a, getBindingContext$div_release(), DivStatePath.Companion.fromState$div_release(state), null, 8, null);
            }
            boolean zIsDivDataReplaceable = DivComparator.INSTANCE.isDivDataReplaceable(divData4, divData, getStateId$div_release(), getOldExpressionResolver$div_release(), getExpressionResolver(), bindingEventReporter);
            if (divData4 == null || DivTransitionsKt.allowsTransitionsOnDataChange(divData, getExpressionResolver())) {
                zUpdateNow = updateNow(divData, divDataTag, bindingEventReporter);
            } else if (zIsDivDataReplaceable || !this.complexRebindEnabled || !(getView().getChildAt(0) instanceof ViewGroup) || !complexRebind(divData, divData4, bindingEventReporter)) {
                if (zIsDivDataReplaceable) {
                    rebind(divData, false, bindingEventReporter);
                } else {
                    zUpdateNow = updateNow(divData, divDataTag, bindingEventReporter);
                }
            }
            getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
            sendCreationHistograms();
            notifyBindEnded();
            return zUpdateNow;
        }
    }

    public void setDataTag$div_release(@NotNull DivDataTag divDataTag) {
        setPrevDataTag$div_release(this.dataTag);
        this.dataTag = divDataTag;
        this.bindingProvider.update(divDataTag, getDivData());
    }

    public void setDivData$div_release(@Nullable DivData divData) {
        this.divData = divData;
        updateRuntimeStore$default(this, null, null, 3, null);
        updateTimers();
        this.bindingProvider.update(getDataTag(), this.divData);
    }

    public void setDivTimerEventDispatcher$div_release(@Nullable DivTimerEventDispatcher divTimerEventDispatcher) {
        this.divTimerEventDispatcher = divTimerEventDispatcher;
    }

    public void setForceCanvasClipping(boolean z10) {
        this.forceCanvasClipping = z10;
    }

    public void setInMiddleOfBind$div_release(boolean z10) {
        this.inMiddleOfBind = z10;
    }

    public void setPrevDataTag$div_release(@NotNull DivDataTag divDataTag) {
        this.prevDataTag = divDataTag;
    }

    public void setRuntimeStore$div_release(@NotNull RuntimeStore runtimeStore) {
        this.runtimeStore = runtimeStore;
    }

    public void setStateId$div_release(long j10) {
        this.stateId = j10;
    }

    @Nullable
    public VariableMutationException setVariable(@NotNull String str, @NotNull String str2) {
        return VariableMutationHandler.Companion.setVariable(this, str, str2, getExpressionResolver());
    }

    public void setVisualErrorsEnabled(boolean z10) {
        getViewComponent$div_release().getErrorMonitor().setEnabled$div_release(z10);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void showTooltip(@NotNull String str) {
        DivTooltipController.showTooltip$default(getTooltipController(), str, getBindingContext$div_release(), false, 4, null);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void showTooltip(@NotNull String str, boolean z10) {
        getTooltipController().showTooltip(str, getBindingContext$div_release(), z10);
    }

    @Nullable
    public DivData.State stateToBind(@NotNull DivData divData) {
        return getStateToBind(divData);
    }

    public void subscribe(@NotNull OverflowMenuSubscriber$Listener overflowMenuSubscriber$Listener) {
        synchronized (this.monitor) {
            this.overflowMenuListeners.add(overflowMenuSubscriber$Listener);
        }
    }

    public void switchToInitialState() {
        DivData divData = getDivData();
        if (divData == null) {
            return;
        }
        long initialStateId = DivDataUtilsKt.getInitialStateId(divData);
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            initialStateId = currentState.getCurrentDivStateId();
        }
        switchToState(initialStateId);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(long j10, boolean z10) {
        synchronized (this.monitor) {
            if (j10 != DivDataUtilsKt.getINVALID_STATE_ID(DivData.f55077j)) {
                SingleTimeOnAttachCallback bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
                if (bindOnAttachRunnable$div_release != null) {
                    bindOnAttachRunnable$div_release.cancel();
                }
                forceSwitchToState(j10, z10);
            }
            r rVar = r.f5635a;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(@NotNull DivStatePath divStatePath, boolean z10) {
        List<DivData.State> list;
        synchronized (this.monitor) {
            DivData divData = getDivData();
            DivData.State state = null;
            Object obj = null;
            state = null;
            if (divData != null && (list = divData.f55082c) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((DivData.State) next).f55092b == divStatePath.getTopLevelStateId()) {
                        obj = next;
                        break;
                    }
                }
                state = (DivData.State) obj;
            }
            this.bulkActionsHandler.switchState(state, divStatePath, z10);
            r rVar = r.f5635a;
        }
    }

    @Nullable
    public Div takeBindingDiv$div_release(@NotNull View view) {
        return this.viewToDivBindings.get(view);
    }

    public void trackChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component$div_release().getVisibilityActionTracker();
        for (Map.Entry<View, Div> entry : this.viewToDivBindings.entrySet()) {
            View key = entry.getKey();
            Div value = entry.getValue();
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(key);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                if (ViewCompat.isAttachedToWindow(key)) {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, key, value, null, null, 48, null);
                } else {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, value, null, null, 48, null);
                }
            }
        }
    }

    public void tryLogVisibility() {
        List<DivData.State> list;
        DivData divData = getDivData();
        DivData.State state = null;
        Object obj = null;
        state = null;
        if (divData != null && (list = divData.f55082c) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((DivData.State) next).f55092b == getStateId$div_release()) {
                    obj = next;
                    break;
                }
            }
            state = (DivData.State) obj;
        }
        if (state != null) {
            trackStateVisibility(state);
        }
        trackChildrenVisibility();
    }

    @Nullable
    public Div unbindViewFromDiv$div_release(@NotNull View view) {
        return this.viewToDivBindings.remove(view);
    }
}
