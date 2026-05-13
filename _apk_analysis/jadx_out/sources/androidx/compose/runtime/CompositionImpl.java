package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.r;
import cn.f0;
import com.ironsource.C4157n2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.p;
import sn.q;
import tn.i;
import tn.n;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0099\u0001B*\u0012\u0006\u0010R\u001a\u00020Q\u0012\n\u0010T\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\u000b\b\u0002\u0010\u0090\u0001\u001a\u0004\u0018\u00010{¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0002J6\u0010\u0015\u001a\u00020\u00022,\u0010\u0014\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00130\u000eH\u0002J\"\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e0\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0002J$\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0082\b¢\u0006\u0004\b&\u0010'J\"\u0010*\u001a\u00020\u00022\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00020$¢\u0006\u0002\b(H\u0016¢\u0006\u0004\b*\u0010+J\u000e\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,J\"\u0010/\u001a\u00020\u00022\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00020$¢\u0006\u0002\b(H\u0016¢\u0006\u0004\b/\u0010+J\b\u00100\u001a\u00020\u0002H\u0016J\u0016\u00101\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u00102\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u00103\u001a\u00020\u00022\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016J\u0010\u00104\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u00105\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u00106\u001a\u00020\bH\u0016J$\u0010;\u001a\u00020\u00022\u001a\u0010:\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000209\u0012\u0006\u0012\u0004\u0018\u0001090807H\u0016J\u0010\u0010>\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<H\u0016J\b\u0010?\u001a\u00020\u0002H\u0016J\b\u0010@\u001a\u00020\u0002H\u0016J\b\u0010A\u001a\u00020\u0002H\u0016J\b\u0010B\u001a\u00020\u0002H\u0016J\b\u0010C\u001a\u00020\u0002H\u0016J5\u0010G\u001a\u00028\u0000\"\u0004\b\u0000\u0010D2\b\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u0010F\u001a\u00020,2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J\u001f\u0010L\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\bJ\u0010KJ\u001b\u0010P\u001a\u00020\u00022\n\u0010=\u001a\u0006\u0012\u0002\b\u00030MH\u0000¢\u0006\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010T\u001a\u0006\u0012\u0002\b\u00030\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR(\u0010X\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00060Vj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010_\u001a\u0012\u0012\u0004\u0012\u00020]0\\j\b\u0012\u0004\u0012\u00020]`^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010!\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00160d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR$\u0010g\u001a\u0012\u0012\u0004\u0012\u00020\u00160\\j\b\u0012\u0004\u0012\u00020\u0016`^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010`R\u001e\u0010h\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030M0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010fR:\u0010\u0014\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00130\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010iR:\u0010j\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00130\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010iR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00160d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010fR*\u0010l\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\"\u0010n\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010v\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010|\u001a\u0004\u0018\u00010{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010~\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b~\u0010o\u001a\u0004\b~\u0010qR\u0016\u0010\u007f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010oR3\u0010\u0080\u0001\u001a\r\u0012\u0004\u0012\u00020\u00020$¢\u0006\u0002\b(8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\b\u0084\u0001\u0010+R\u0016\u0010\u0086\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010qR\u001d\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006078@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001d\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006078@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u0088\u0001R\u001d\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u0016078@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u0088\u0001R\u0014\u0010\u0090\u0001\u001a\u00020{8F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010\u0091\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010qR\u0016\u0010\u0092\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010qR\u0016\u0010\u0094\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010qR\u0016\u0010\u0096\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010q¨\u0006\u009a\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Lbn/r;", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "", "", "values", "", "forgetConditionalScopes", "addPendingInvalidationsLocked", "cleanUpDerivedStateObservations", "value", "invalidateScopeOfLocked", "", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "Landroidx/compose/runtime/Change;", "changes", "applyChangesInLocked", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "Landroidx/compose/runtime/Anchor;", "anchor", C4157n2.f33007p, "Landroidx/compose/runtime/InvalidationResult;", "invalidateChecked", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "takeInvalidations", "Landroidx/compose/runtime/SlotTable;", "slotTable", "validateRecomposeScopeAnchors", "T", "Lkotlin/Function0;", "block", "trackAbandonedValues", "(Lsn/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lsn/p;)V", "", "key", "invalidateGroupsWithKey", "composeContent", "dispose", "recordModificationsOf", "observesAnyOf", "prepareCompose", "recordReadOf", "recordWriteOf", "recompose", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "applyChanges", "applyLateChanges", "changesApplied", "invalidateAll", "verifyConsistent", "R", TypedValues.TransitionType.S_TO, "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILsn/a;)Ljava/lang/Object;", "invalidate", "removeObservation$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime_release", "(Landroidx/compose/runtime/DerivedState;)V", "removeDerivedStateObservation", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "lock", "Ljava/lang/Object;", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "observations", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "conditionallyInvalidatedScopes", "derivedStates", "Ljava/util/List;", "lateChanges", "observationsProcessed", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "pendingInvalidScopes", "Z", "getPendingInvalidScopes$runtime_release", "()Z", "setPendingInvalidScopes$runtime_release", "(Z)V", "invalidationDelegate", "Landroidx/compose/runtime/CompositionImpl;", "invalidationDelegateGroup", "I", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "Lkotlin/coroutines/d;", "_recomposeContext", "Lkotlin/coroutines/d;", "isRoot", "disposed", "composable", "Lsn/p;", "getComposable", "()Lsn/p;", "setComposable", "getAreChildrenComposing", "areChildrenComposing", "getObservedObjects$runtime_release", "()Ljava/util/List;", "observedObjects", "getDerivedStateDependencies$runtime_release", "derivedStateDependencies", "getConditionalScopes$runtime_release", "conditionalScopes", "getRecomposeContext", "()Lkotlin/coroutines/d;", "recomposeContext", "isComposing", "isDisposed", "getHasPendingChanges", "hasPendingChanges", "getHasInvalidations", "hasInvalidations", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/d;)V", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class CompositionImpl implements ControlledComposition {

    @Nullable
    private final d _recomposeContext;

    @NotNull
    private final HashSet<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private final List<q<Applier<?>, SlotWriter, RememberManager, r>> changes;

    @NotNull
    private p<? super Composer, ? super Integer, r> composable;

    @NotNull
    private final ComposerImpl composer;

    @NotNull
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;

    @NotNull
    private final IdentityScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;

    @Nullable
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;

    @NotNull
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;

    @NotNull
    private final List<q<Applier<?>, SlotWriter, RememberManager, r>> lateChanges;

    @NotNull
    private final Object lock;

    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observations;

    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observationsProcessed;

    @NotNull
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;

    @NotNull
    private final AtomicReference<Object> pendingModifications;

    @NotNull
    private final SlotTable slotTable;

    /* JADX INFO: compiled from: Composition.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "Landroidx/compose/runtime/RememberObserver;", C4157n2.f33007p, "Lbn/r;", "remembering", "forgetting", "Lkotlin/Function0;", "effect", "sideEffect", "dispatchRememberObservers", "dispatchSideEffects", "dispatchAbandons", "", "abandoning", "Ljava/util/Set;", "", "Ljava/util/List;", "sideEffects", "<init>", "(Ljava/util/Set;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class RememberEventDispatcher implements RememberManager {

        @NotNull
        private final Set<RememberObserver> abandoning;

        @NotNull
        private final List<RememberObserver> forgetting;

        @NotNull
        private final List<RememberObserver> remembering;

        @NotNull
        private final List<a<r>> sideEffects;

        public RememberEventDispatcher(@NotNull Set<RememberObserver> set) {
            tn.p.k(set, "abandoning");
            this.abandoning = set;
            this.remembering = new ArrayList();
            this.forgetting = new ArrayList();
            this.sideEffects = new ArrayList();
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        RememberObserver next = it.next();
                        it.remove();
                        next.onAbandoned();
                    }
                    r rVar = r.f5635a;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
        }

        public final void dispatchRememberObservers() {
            Object objBeginSection;
            if (!this.forgetting.isEmpty()) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        RememberObserver rememberObserver = this.forgetting.get(size);
                        if (!this.abandoning.contains(rememberObserver)) {
                            rememberObserver.onForgotten();
                        }
                    }
                    r rVar = r.f5635a;
                } finally {
                }
            }
            if (!this.remembering.isEmpty()) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    List<RememberObserver> list = this.remembering;
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        RememberObserver rememberObserver2 = list.get(i10);
                        this.abandoning.remove(rememberObserver2);
                        rememberObserver2.onRemembered();
                    }
                    r rVar2 = r.f5635a;
                } finally {
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    List<a<r>> list = this.sideEffects;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).invoke();
                    }
                    this.sideEffects.clear();
                    r rVar = r.f5635a;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(@NotNull RememberObserver rememberObserver) {
            tn.p.k(rememberObserver, C4157n2.f33007p);
            int iLastIndexOf = this.remembering.lastIndexOf(rememberObserver);
            if (iLastIndexOf < 0) {
                this.forgetting.add(rememberObserver);
            } else {
                this.remembering.remove(iLastIndexOf);
                this.abandoning.remove(rememberObserver);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(@NotNull RememberObserver rememberObserver) {
            tn.p.k(rememberObserver, C4157n2.f33007p);
            int iLastIndexOf = this.forgetting.lastIndexOf(rememberObserver);
            if (iLastIndexOf < 0) {
                this.remembering.add(rememberObserver);
            } else {
                this.forgetting.remove(iLastIndexOf);
                this.abandoning.remove(rememberObserver);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(@NotNull a<r> aVar) {
            tn.p.k(aVar, "effect");
            this.sideEffects.add(aVar);
        }
    }

    public CompositionImpl(@NotNull CompositionContext compositionContext, @NotNull Applier<?> applier, @Nullable d dVar) {
        tn.p.k(compositionContext, "parent");
        tn.p.k(applier, "applier");
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new IdentityScopeMap<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new IdentityScopeMap<>();
        ArrayList arrayList = new ArrayList();
        this.changes = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.lateChanges = arrayList2;
        this.observationsProcessed = new IdentityScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, hashSet, arrayList, arrayList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = dVar;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m1260getLambda1$runtime_release();
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, d dVar, int i10, i iVar) {
        this(compositionContext, applier, (i10 & 4) != 0 ? null : dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r2v9 */
    private static final void addPendingInvalidationsLocked$invalidate(CompositionImpl compositionImpl, boolean z10, Ref$ObjectRef<HashSet<RecomposeScopeImpl>> ref$ObjectRef, Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = compositionImpl.observations;
        int iFind = identityScopeMap.find(obj);
        if (iFind >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : identityScopeMap.scopeSetAt(iFind)) {
                if (!compositionImpl.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                    if (!recomposeScopeImpl.isConditional() || z10) {
                        HashSet<RecomposeScopeImpl> hashSet = ref$ObjectRef.element;
                        ?? r22 = hashSet;
                        if (hashSet == null) {
                            ?? hashSet2 = new HashSet();
                            ref$ObjectRef.element = hashSet2;
                            r22 = hashSet2;
                        }
                        r22.add(recomposeScopeImpl);
                    } else {
                        compositionImpl.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                    }
                }
            }
        }
    }

    private final void applyChangesInLocked(List<q<Applier<?>, SlotWriter, RememberManager, r>> list) {
        boolean zIsEmpty;
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        try {
            if (list.isEmpty()) {
                if (zIsEmpty) {
                    return;
                } else {
                    return;
                }
            }
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:applyChanges");
            try {
                this.applier.onBeginChanges();
                SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                try {
                    Applier<?> applier = this.applier;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).invoke(applier, slotWriterOpenWriter, rememberEventDispatcher);
                    }
                    list.clear();
                    r rVar = r.f5635a;
                    slotWriterOpenWriter.close();
                    this.applier.onEndChanges();
                    Trace trace = Trace.INSTANCE;
                    trace.endSection(objBeginSection);
                    rememberEventDispatcher.dispatchRememberObservers();
                    rememberEventDispatcher.dispatchSideEffects();
                    if (this.pendingInvalidScopes) {
                        objBeginSection = trace.beginSection("Compose:unobserve");
                        try {
                            this.pendingInvalidScopes = false;
                            IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
                            int size2 = identityScopeMap.getSize();
                            int i11 = 0;
                            for (int i12 = 0; i12 < size2; i12++) {
                                int i13 = identityScopeMap.getValueOrder()[i12];
                                IdentityArraySet<RecomposeScopeImpl> identityArraySet = identityScopeMap.getScopeSets()[i13];
                                tn.p.h(identityArraySet);
                                int size3 = identityArraySet.size();
                                int i14 = 0;
                                for (int i15 = 0; i15 < size3; i15++) {
                                    Object obj = identityArraySet.getValues()[i15];
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    }
                                    if (!(!((RecomposeScopeImpl) obj).getValid())) {
                                        if (i14 != i15) {
                                            identityArraySet.getValues()[i14] = obj;
                                        }
                                        i14++;
                                    }
                                }
                                int size4 = identityArraySet.size();
                                for (int i16 = i14; i16 < size4; i16++) {
                                    identityArraySet.getValues()[i16] = null;
                                }
                                identityArraySet.setSize(i14);
                                if (identityArraySet.size() > 0) {
                                    if (i11 != i12) {
                                        int i17 = identityScopeMap.getValueOrder()[i11];
                                        identityScopeMap.getValueOrder()[i11] = i13;
                                        identityScopeMap.getValueOrder()[i12] = i17;
                                    }
                                    i11++;
                                }
                            }
                            int size5 = identityScopeMap.getSize();
                            for (int i18 = i11; i18 < size5; i18++) {
                                identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i18]] = null;
                            }
                            identityScopeMap.setSize(i11);
                            cleanUpDerivedStateObservations();
                            r rVar2 = r.f5635a;
                            Trace.INSTANCE.endSection(objBeginSection);
                        } finally {
                        }
                    }
                    if (this.lateChanges.isEmpty()) {
                        rememberEventDispatcher.dispatchAbandons();
                    }
                } catch (Throwable th2) {
                    slotWriterOpenWriter.close();
                    throw th2;
                }
            } finally {
            }
        } finally {
            if (this.lateChanges.isEmpty()) {
                rememberEventDispatcher.dispatchAbandons();
            }
        }
    }

    private final void cleanUpDerivedStateObservations() {
        IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
        int size = identityScopeMap.getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = identityScopeMap.getValueOrder()[i11];
            IdentityArraySet<DerivedState<?>> identityArraySet = identityScopeMap.getScopeSets()[i12];
            tn.p.h(identityArraySet);
            int size2 = identityArraySet.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size2; i14++) {
                Object obj = identityArraySet.getValues()[i14];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
                if (!(!this.observations.contains((DerivedState) obj))) {
                    if (i13 != i14) {
                        identityArraySet.getValues()[i13] = obj;
                    }
                    i13++;
                }
            }
            int size3 = identityArraySet.size();
            for (int i15 = i13; i15 < size3; i15++) {
                identityArraySet.getValues()[i15] = null;
            }
            identityArraySet.setSize(i13);
            if (identityArraySet.size() > 0) {
                if (i10 != i11) {
                    int i16 = identityScopeMap.getValueOrder()[i10];
                    identityScopeMap.getValueOrder()[i10] = i12;
                    identityScopeMap.getValueOrder()[i11] = i16;
                }
                i10++;
            }
        }
        int size4 = identityScopeMap.getSize();
        for (int i17 = i10; i17 < size4; i17++) {
            identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i17]] = null;
        }
        identityScopeMap.setSize(i10);
        Iterator<RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
        tn.p.j(it, "iterator()");
        while (it.hasNext()) {
            if (!it.next().isConditional()) {
                it.remove();
            }
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (tn.p.f(andSet, CompositionKt.PendingApplyNoModifications)) {
                throw new IllegalStateException("pending composition has not been applied".toString());
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                throw new IllegalStateException(("corrupt pendingModifications drain: " + this.pendingModifications).toString());
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (tn.p.f(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
            }
            throw new IllegalStateException(("corrupt pendingModifications drain: " + this.pendingModifications).toString());
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            addPendingInvalidationsLocked(set, false);
        }
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
        synchronized (this.lock) {
            CompositionImpl compositionImpl = this.invalidationDelegate;
            if (compositionImpl == null || !this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                compositionImpl = null;
            }
            if (compositionImpl == null) {
                if (isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, instance)) {
                    return InvalidationResult.IMMINENT;
                }
                if (instance == null) {
                    this.invalidations.set(scope, null);
                } else {
                    CompositionKt.addValue(this.invalidations, scope, instance);
                }
            }
            if (compositionImpl != null) {
                return compositionImpl.invalidateChecked(scope, anchor, instance);
            }
            this.parent.invalidate$runtime_release(this);
            return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
        }
    }

    private final void invalidateScopeOfLocked(Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
        int iFind = identityScopeMap.find(obj);
        if (iFind >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : identityScopeMap.scopeSetAt(iFind)) {
                if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(obj, recomposeScopeImpl);
                }
            }
        }
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final <T> T trackAbandonedValues(a<? extends T> block) {
        try {
            T tInvoke = block.invoke();
            n.b(1);
            n.a(1);
            return tInvoke;
        } catch (Throwable th2) {
            n.b(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            n.a(1);
            throw th2;
        }
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i10);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + cn.r.i0(slotTable.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            applyChangesInLocked(this.changes);
            drainPendingModificationsLocked();
            r rVar = r.f5635a;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            if (!this.lateChanges.isEmpty()) {
                applyChangesInLocked(this.lateChanges);
            }
            r rVar = r.f5635a;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            this.composer.changesApplied$runtime_release();
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            r rVar = r.f5635a;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull p<? super Composer, ? super Integer, r> content) {
        tn.p.k(content, "content");
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                this.composer.composeContent$runtime_release(takeInvalidations(), content);
                r rVar = r.f5635a;
            }
        } catch (Throwable th2) {
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(@Nullable ControlledComposition to2, int groupIndex, @NotNull a<? extends R> block) {
        tn.p.k(block, "block");
        if (to2 == null || tn.p.f(to2, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) to2;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (!this.disposed) {
                this.disposed = true;
                this.composable = ComposableSingletons$CompositionKt.INSTANCE.m1261getLambda2$runtime_release();
                boolean z10 = this.slotTable.getGroupsSize() > 0;
                if (z10 || (true ^ this.abandonSet.isEmpty())) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z10) {
                        SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                        try {
                            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                            r rVar = r.f5635a;
                            slotWriterOpenWriter.close();
                            this.applier.clear();
                            rememberEventDispatcher.dispatchRememberObservers();
                        } catch (Throwable th2) {
                            slotWriterOpenWriter.close();
                            throw th2;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            r rVar2 = r.f5635a;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(@NotNull MovableContentState movableContentState) {
        tn.p.k(movableContentState, "state");
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter slotWriterOpenWriter = movableContentState.getSlotTable().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
            r rVar = r.f5635a;
            slotWriterOpenWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th2) {
            slotWriterOpenWriter.close();
            throw th2;
        }
    }

    @NotNull
    public final p<Composer, Integer, r> getComposable() {
        return this.composable;
    }

    @NotNull
    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return f0.g1(this.conditionallyInvalidatedScopes);
    }

    @NotNull
    public final List<Object> getDerivedStateDependencies$runtime_release() {
        return cn.r.S(this.derivedStates.getValues());
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.invalidations.getSize() > 0;
        }
        return z10;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @NotNull
    public final List<Object> getObservedObjects$runtime_release() {
        return cn.r.S(this.observations.getValues());
    }

    /* JADX INFO: renamed from: getPendingInvalidScopes$runtime_release, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    @NotNull
    public final d getRecomposeContext() {
        d dVar = this._recomposeContext;
        return dVar == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : dVar;
    }

    @NotNull
    /* JADX INFO: renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        tn.p.k(list, "references");
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!tn.p.f(list.get(i10).getFirst().getComposition(), this)) {
                break;
            } else {
                i10++;
            }
        }
        ComposerKt.runtimeCheck(z10);
        try {
            this.composer.insertMovableContentReferences(list);
            r rVar = r.f5635a;
        } catch (Throwable th2) {
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            throw th2;
        }
    }

    @NotNull
    public final InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
        tn.p.k(scope, "scope");
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor == null || !this.slotTable.ownsAnchor(anchor) || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (anchor.getValid() && scope.getCanRecompose()) {
            return invalidateChecked(scope, anchor, instance);
        }
        return InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            r rVar = r.f5635a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invalidateGroupsWithKey(int r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.lock
            monitor-enter(r0)
            androidx.compose.runtime.SlotTable r1 = r6.slotTable     // Catch: java.lang.Throwable -> L42
            java.util.List r7 = r1.invalidateGroupsWithKey$runtime_release(r7)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L31
            int r2 = r7.size()
            r3 = r0
        L13:
            if (r3 >= r2) goto L2e
            java.lang.Object r4 = r7.get(r3)
            androidx.compose.runtime.RecomposeScopeImpl r4 = (androidx.compose.runtime.RecomposeScopeImpl) r4
            r5 = 0
            androidx.compose.runtime.InvalidationResult r4 = r4.invalidateForResult(r5)
            androidx.compose.runtime.InvalidationResult r5 = androidx.compose.runtime.InvalidationResult.IGNORED
            if (r4 != r5) goto L26
            r4 = r1
            goto L27
        L26:
            r4 = r0
        L27:
            if (r4 == 0) goto L2b
            r7 = r1
            goto L2f
        L2b:
            int r3 = r3 + 1
            goto L13
        L2e:
            r7 = r0
        L2f:
            if (r7 == 0) goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L41
            androidx.compose.runtime.ComposerImpl r7 = r6.composer
            boolean r7 = r7.forceRecomposeScopes$runtime_release()
            if (r7 == 0) goto L41
            androidx.compose.runtime.CompositionContext r7 = r6.parent
            r7.invalidate$runtime_release(r6)
        L41:
            return
        L42:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.invalidateGroupsWithKey(int):void");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    /* JADX INFO: renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(@NotNull Set<? extends Object> values) {
        tn.p.k(values, "values");
        for (Object obj : values) {
            if (this.observations.contains(obj) || this.derivedStates.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull a<r> aVar) {
        tn.p.k(aVar, "block");
        this.composer.prepareCompose$runtime_release(aVar);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zRecompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            try {
                zRecompose$runtime_release = this.composer.recompose$runtime_release(takeInvalidations());
                if (!zRecompose$runtime_release) {
                    drainPendingModificationsLocked();
                }
            } finally {
            }
        }
        return zRecompose$runtime_release;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set<? extends Object> set) {
        Object obj;
        Object objC;
        tn.p.k(set, "values");
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : tn.p.f(obj, CompositionKt.PendingApplyNoModifications)) {
                objC = set;
            } else if (obj instanceof Set) {
                objC = new Set[]{(Set) obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                }
                objC = cn.p.C((Set[]) obj, set);
            }
        } while (!androidx.compose.animation.core.a.a(this.pendingModifications, obj, objC));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                r rVar = r.f5635a;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordReadOf(@NotNull Object obj) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        tn.p.k(obj, "value");
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        this.observations.add(obj, currentRecomposeScope$runtime_release);
        if (obj instanceof DerivedState) {
            this.derivedStates.removeScope(obj);
            Iterator<T> it = ((DerivedState) obj).getDependencies().iterator();
            while (it.hasNext()) {
                this.derivedStates.add((StateObject) it.next(), obj);
            }
        }
        currentRecomposeScope$runtime_release.recordRead(obj);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(@NotNull Object obj) {
        tn.p.k(obj, "value");
        synchronized (this.lock) {
            invalidateScopeOfLocked(obj);
            IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
            int iFind = identityScopeMap.find(obj);
            if (iFind >= 0) {
                Iterator<T> it = identityScopeMap.scopeSetAt(iFind).iterator();
                while (it.hasNext()) {
                    invalidateScopeOfLocked((DerivedState) it.next());
                }
            }
            r rVar = r.f5635a;
        }
    }

    public final void removeDerivedStateObservation$runtime_release(@NotNull DerivedState<?> state) {
        tn.p.k(state, "state");
        if (this.observations.contains(state)) {
            return;
        }
        this.derivedStates.removeScope(state);
    }

    public final void removeObservation$runtime_release(@NotNull Object instance, @NotNull RecomposeScopeImpl scope) {
        tn.p.k(instance, C4157n2.f33007p);
        tn.p.k(scope, "scope");
        this.observations.remove(instance, scope);
    }

    public final void setComposable(@NotNull p<? super Composer, ? super Integer, r> pVar) {
        tn.p.k(pVar, "<set-?>");
        this.composable = pVar;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull p<? super Composer, ? super Integer, r> content) {
        tn.p.k(content, "content");
        if (!(!this.disposed)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z10) {
        this.pendingInvalidScopes = z10;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            r rVar = r.f5635a;
        }
    }
}
