package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import bn.h;
import bn.r;
import cn.b0;
import cn.f0;
import cn.v0;
import cn.x;
import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import go.l;
import go.u;
import go.v;
import hn.c;
import in.a;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jn.f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h1;
import p000do.k;
import p000do.l0;
import p000do.t1;
import p000do.w;
import sn.q;
import tn.i;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 ®\u00012\u00020\u0001:\b®\u0001¯\u0001°\u0001±\u0001B\u0011\u0012\u0006\u0010j\u001a\u000201¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001d\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H\u0082\bJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J#\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0019\u001a\u00020\u00032(\u0010\u0018\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\"\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dH\u0002J,\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dH\u0002J\b\u0010$\u001a\u00020\u0003H\u0002J\u001c\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J,\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u001b\u001a\u00020\u00072\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dH\u0002J<\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010'2\u0006\u0010\u001b\u001a\u00020\u00072\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0082\b¢\u0006\u0004\b)\u0010*J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+H\u0002J\u0006\u0010/\u001a\u00020.J\u0013\u00100\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0013J\u001b\u00103\u001a\u00020\u00032\u0006\u00102\u001a\u000201H\u0087@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0006\u00105\u001a\u00020\u0003J\u0006\u00106\u001a\u00020\u0003J\u0013\u00107\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u0013J*\u0010<\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00072\u0011\u00109\u001a\r\u0012\u0004\u0012\u00020\u00030(¢\u0006\u0002\b8H\u0010¢\u0006\u0004\b:\u0010;J\u0013\u0010=\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b=\u0010\u0013J\u001d\u0010C\u001a\u00020\u00032\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0010¢\u0006\u0004\bA\u0010BJ\u0017\u0010F\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007H\u0010¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007H\u0010¢\u0006\u0004\bG\u0010EJ\u0017\u0010J\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007H\u0010¢\u0006\u0004\bI\u0010EJ\u0017\u0010O\u001a\u00020\u00032\u0006\u0010L\u001a\u00020KH\u0010¢\u0006\u0004\bM\u0010NJ\u0017\u0010S\u001a\u00020\u00032\u0006\u0010P\u001a\u00020!H\u0010¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u00032\u0006\u0010P\u001a\u00020!H\u0010¢\u0006\u0004\bT\u0010RJ\u001f\u0010Z\u001a\u00020\u00032\u0006\u0010P\u001a\u00020!2\u0006\u0010W\u001a\u00020VH\u0010¢\u0006\u0004\bX\u0010YJ\u0019\u0010]\u001a\u0004\u0018\u00010V2\u0006\u0010P\u001a\u00020!H\u0010¢\u0006\u0004\b[\u0010\\R$\u0010`\u001a\u00020^2\u0006\u0010_\u001a\u00020^8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010j\u001a\u0002018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00070u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR \u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170x0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010wR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00070u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010wR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00070u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010wR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020!0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010wR/\u0010\u007f\u001a\u001c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170~\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0u0}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R#\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020V0}8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0080\u0001R!\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u008c\u0001\u001a\n\u0012\u0005\u0012\u00030\u008b\u00010\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u00070\u008e\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0087\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0087\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0087\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0092\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0087\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0092\u0001R\u0015\u00102\u001a\u0002018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010mR'\u0010 \u0001\u001a\n\u0012\u0005\u0012\u00030\u008b\u00010\u009b\u00018FX\u0087\u0004¢\u0006\u0010\u0012\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001c\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u00030\u008b\u00010¡\u00018F¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0015\u0010¦\u0001\u001a\u00030\u0087\u00018F¢\u0006\b\u001a\u0006\b¥\u0001\u0010\u0092\u0001R\u0018\u0010©\u0001\u001a\u00030\u0084\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010«\u0001\u001a\u00030\u0087\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010\u0092\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006²\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Ldo/k;", "Lbn/r;", "deriveStateLocked", "recordComposerModificationsLocked", "Lkotlin/Function1;", "Landroidx/compose/runtime/ControlledComposition;", "onEachInvalidComposition", "Lkotlinx/coroutines/g;", "callingJob", "registerRunnerJob", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Landroidx/compose/runtime/ProduceFrameSignal;", "frameSignal", "runFrameLoop", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lhn/c;)Ljava/lang/Object;", "awaitWorkAvailable", "(Lhn/c;)Ljava/lang/Object;", "Lkotlin/Function3;", "Ldo/l0;", "Lhn/c;", "", "block", "recompositionRunner", "(Lsn/q;Lhn/c;)Ljava/lang/Object;", "composition", "performInitialMovableContentInserts", "Landroidx/compose/runtime/collection/IdentityArraySet;", "modifiedValues", "performRecompose", "", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "performInsertValues", "discardUnusedValues", "readObserverOf", "writeObserverOf", "T", "Lkotlin/Function0;", "composing", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lsn/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", "applyAndCheck", "Landroidx/compose/runtime/RecomposerInfo;", "asRecomposerInfo", "runRecomposeAndApplyChanges", "Lkotlin/coroutines/d;", "recomposeCoroutineContext", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/d;Lhn/c;)Ljava/lang/Object;", "cancel", "close", "join", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lsn/p;)V", "composeInitial", "awaitIdle", "", "Landroidx/compose/runtime/tooling/CompositionData;", G5.Q, "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "", "<set-?>", "changeCount", "J", "getChangeCount", "()J", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "Ldo/w;", "effectJob", "Ldo/w;", "effectCoroutineContext", "Lkotlin/coroutines/d;", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/d;", "stateLock", "Ljava/lang/Object;", "runnerJob", "Lkotlinx/coroutines/g;", "", "closeCause", "Ljava/lang/Throwable;", "", "knownCompositions", "Ljava/util/List;", "", "snapshotInvalidations", "compositionInvalidations", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "Landroidx/compose/runtime/MovableContent;", "compositionValuesRemoved", "Ljava/util/Map;", "compositionValueStatesAvailable", "workContinuation", "Ldo/k;", "", "concurrentCompositionsOutstanding", "I", "", "isClosed", "Z", "Lgo/l;", "Landroidx/compose/runtime/Recomposer$State;", "_state", "Lgo/l;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "getShouldKeepRecomposing", "()Z", "shouldKeepRecomposing", "getHasSchedulingWork", "hasSchedulingWork", "getHasFrameWorkLocked", "hasFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasConcurrentFrameWorkLocked", "getRecomposeCoroutineContext$runtime_release", "Lgo/d;", "getState", "()Lgo/d;", "getState$annotations", "()V", "state", "Lgo/u;", "getCurrentState", "()Lgo/u;", "currentState", "getHasPendingWork", "hasPendingWork", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "getCollectingParameterInformation$runtime_release", "collectingParameterInformation", "<init>", "(Lkotlin/coroutines/d;)V", VastTagName.COMPANION, "HotReloadable", "RecomposerInfoImpl", "State", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class Recomposer extends CompositionContext {

    @NotNull
    private final l<State> _state;

    @NotNull
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;

    @Nullable
    private Throwable closeCause;

    @NotNull
    private final List<ControlledComposition> compositionInvalidations;

    @NotNull
    private final Map<MovableContentStateReference, MovableContentState> compositionValueStatesAvailable;

    @NotNull
    private final List<MovableContentStateReference> compositionValuesAwaitingInsert;

    @NotNull
    private final Map<MovableContent<Object>, List<MovableContentStateReference>> compositionValuesRemoved;

    @NotNull
    private final List<ControlledComposition> compositionsAwaitingApply;
    private int concurrentCompositionsOutstanding;

    @NotNull
    private final d effectCoroutineContext;

    @NotNull
    private final w effectJob;
    private boolean isClosed;

    @NotNull
    private final List<ControlledComposition> knownCompositions;

    @NotNull
    private final RecomposerInfoImpl recomposerInfo;

    @Nullable
    private g runnerJob;

    @NotNull
    private final List<Set<Object>> snapshotInvalidations;

    @NotNull
    private final Object stateLock;

    @Nullable
    private k<? super r> workContinuation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final l<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = v.a(ExtensionsKt.persistentSetOf());

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002J\u000f\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "info", "Lbn/r;", "addRunning", "removeRunning", "saveStateAndDisposeForHotReload$runtime_release", "()Ljava/lang/Object;", "saveStateAndDisposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "(Ljava/lang/Object;)V", "loadStateAndComposeForHotReload", "", "key", "invalidateGroupsWithKey$runtime_release", "(I)V", "invalidateGroupsWithKey", "Lgo/u;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lgo/u;", "runningRecomposers", "Lgo/l;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "_runningRecomposers", "Lgo/l;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetAdd = persistentSet.add(recomposerInfoImpl);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.b(persistentSet, persistentSetAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetRemove = persistentSet.remove(recomposerInfoImpl);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.b(persistentSet, persistentSetRemove));
        }

        @NotNull
        public final u<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime_release(int key) {
            Iterator it = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).invalidateGroupsWithKey(key);
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(@NotNull Object token) {
            p.k(token, "token");
            List list = (List) token;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((HotReloadable) list.get(i10)).resetContent();
            }
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((HotReloadable) list.get(i11)).recompose();
            }
        }

        @NotNull
        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b0.F(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0002\b\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "Lbn/r;", "clearContent", "resetContent", "recompose", "Landroidx/compose/runtime/CompositionImpl;", "composition", "Landroidx/compose/runtime/CompositionImpl;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composable", "Lsn/p;", "<init>", "(Landroidx/compose/runtime/CompositionImpl;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class HotReloadable {

        @NotNull
        private sn.p<? super Composer, ? super Integer, r> composable;

        @NotNull
        private final CompositionImpl composition;

        public HotReloadable(@NotNull CompositionImpl compositionImpl) {
            p.k(compositionImpl, "composition");
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m1262getLambda1$runtime_release());
            }
        }

        public final void recompose() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "", "key", "Lbn/r;", "invalidateGroupsWithKey", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "saveStateAndDisposeForHotReload", "Lgo/d;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lgo/d;", "state", "", "getHasPendingWork", "()Z", "hasPendingWork", "", "getChangeCount", "()J", "changeCount", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        @NotNull
        public go.d<State> getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int i10) {
            List listJ1;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                listJ1 = f0.j1(recomposer.knownCompositions);
            }
            ArrayList arrayList = new ArrayList(listJ1.size());
            int size = listJ1.size();
            for (int i11 = 0; i11 < size; i11++) {
                ControlledComposition controlledComposition = (ControlledComposition) listJ1.get(i11);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((CompositionImpl) arrayList.get(i12)).invalidateGroupsWithKey(i10);
            }
        }

        @NotNull
        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List listJ1;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                listJ1 = f0.j1(recomposer.knownCompositions);
            }
            ArrayList arrayList = new ArrayList(listJ1.size());
            int size = listJ1.size();
            for (int i10 = 0; i10 < size; i10++) {
                ControlledComposition controlledComposition = (ControlledComposition) listJ1.get(i10);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i11));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$awaitIdle$2, reason: invalid class name */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @jn.d(c = "androidx.compose.runtime.Recomposer$awaitIdle$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements sn.p<State, c<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull State state, @Nullable c<? super Boolean> cVar) {
            return ((AnonymousClass2) create(state, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return jn.a.a(((State) this.L$0).compareTo(State.Idle) > 0);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$join$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @jn.d(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    public static final class C13332 extends SuspendLambda implements sn.p<State, c<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C13332(c<? super C13332> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C13332 c13332 = new C13332(cVar);
            c13332.L$0 = obj;
            return c13332;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull State state, @Nullable c<? super Boolean> cVar) {
            return ((C13332) create(state, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return jn.a.a(((State) this.L$0) == State.ShutDown);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @jn.d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {744}, m = "invokeSuspend")
    public static final class C13342 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
        public final /* synthetic */ q<l0, MonotonicFrameClock, c<? super r>, Object> $block;
        public final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Recomposer.kt */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @jn.d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {745}, m = "invokeSuspend")
        public static final class C00962 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
            public final /* synthetic */ q<l0, MonotonicFrameClock, c<? super r>, Object> $block;
            public final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            private /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00962(q<? super l0, ? super MonotonicFrameClock, ? super c<? super r>, ? extends Object> qVar, MonotonicFrameClock monotonicFrameClock, c<? super C00962> cVar) {
                super(2, cVar);
                this.$block = qVar;
                this.$parentFrameClock = monotonicFrameClock;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                C00962 c00962 = new C00962(this.$block, this.$parentFrameClock, cVar);
                c00962.L$0 = obj;
                return c00962;
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                return ((C00962) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    l0 l0Var = (l0) this.L$0;
                    q<l0, MonotonicFrameClock, c<? super r>, Object> qVar = this.$block;
                    MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                    this.label = 1;
                    if (qVar.invoke(l0Var, monotonicFrameClock, this) == objG) {
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
        public C13342(q<? super l0, ? super MonotonicFrameClock, ? super c<? super r>, ? extends Object> qVar, MonotonicFrameClock monotonicFrameClock, c<? super C13342> cVar) {
            super(2, cVar);
            this.$block = qVar;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C13342 c13342 = Recomposer.this.new C13342(this.$block, this.$parentFrameClock, cVar);
            c13342.L$0 = obj;
            return c13342;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((C13342) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C13342.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runFrameLoop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Recomposer.kt */
    @jn.d(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", l = {IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE, LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW}, m = "runFrameLoop")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C13351 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C13351(c<? super C13351> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Recomposer.this.runFrameLoop(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Ldo/l0;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @jn.d(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {436, 454}, m = "invokeSuspend")
    public static final class C13372 extends SuspendLambda implements q<l0, MonotonicFrameClock, c<? super r>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        public C13372(c<? super C13372> cVar) {
            super(3, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                List list2 = recomposer.compositionValuesAwaitingInsert;
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((MovableContentStateReference) list2.get(i10));
                }
                recomposer.compositionValuesAwaitingInsert.clear();
                r rVar = r.f5635a;
            }
        }

        @Override // sn.q
        @Nullable
        public final Object invoke(@NotNull l0 l0Var, @NotNull MonotonicFrameClock monotonicFrameClock, @Nullable c<? super r> cVar) {
            C13372 c13372 = Recomposer.this.new C13372(cVar);
            c13372.L$0 = monotonicFrameClock;
            return c13372.invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c8 -> B:11:0x0086). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f9 -> B:31:0x00fd). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C13372.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Ldo/l0;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @jn.d(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", l = {592, 612, 613}, m = "invokeSuspend")
    public static final class C13382 extends SuspendLambda implements q<l0, MonotonicFrameClock, c<? super r>, Object> {
        public final /* synthetic */ d $recomposeCoroutineContext;
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public Object L$2;
        public int label;
        public final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13382(d dVar, Recomposer recomposer, c<? super C13382> cVar) {
            super(3, cVar);
            this.$recomposeCoroutineContext = dVar;
            this.this$0 = recomposer;
        }

        @Override // sn.q
        @Nullable
        public final Object invoke(@NotNull l0 l0Var, @NotNull MonotonicFrameClock monotonicFrameClock, @Nullable c<? super r> cVar) {
            C13382 c13382 = new C13382(this.$recomposeCoroutineContext, this.this$0, cVar);
            c13382.L$0 = l0Var;
            c13382.L$1 = monotonicFrameClock;
            return c13382.invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0193 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00aa -> B:25:0x00ac). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 438
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C13382.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public Recomposer(@NotNull d dVar) {
        p.k(dVar, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new sn.a<r>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
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
                k kVarDeriveStateLocked;
                Object obj = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    kVarDeriveStateLocked = recomposer.deriveStateLocked();
                    if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        throw h1.a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
                    }
                }
                if (kVarDeriveStateLocked != null) {
                    Result.a aVar = Result.Companion;
                    kVarDeriveStateLocked.resumeWith(Result.m7534constructorimpl(r.f5635a));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        w wVarA = t1.a((g) dVar.get(g.H8));
        wVarA.f(new sn.l<Throwable, r>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable final Throwable th2) {
                k kVar;
                k kVar2;
                CancellationException cancellationExceptionA = h1.a("Recomposer effect job completed", th2);
                Object obj = this.this$0.stateLock;
                final Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    g gVar = recomposer.runnerJob;
                    kVar = null;
                    if (gVar != null) {
                        recomposer._state.setValue(Recomposer.State.ShuttingDown);
                        if (recomposer.isClosed) {
                            if (recomposer.workContinuation != null) {
                                kVar2 = recomposer.workContinuation;
                            }
                            recomposer.workContinuation = null;
                            gVar.f(new sn.l<Throwable, r>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // sn.l
                                public /* bridge */ /* synthetic */ r invoke(Throwable th3) {
                                    invoke2(th3);
                                    return r.f5635a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Throwable th3) {
                                    Object obj2 = recomposer.stateLock;
                                    Recomposer recomposer2 = recomposer;
                                    Throwable th4 = th2;
                                    synchronized (obj2) {
                                        if (th4 != null) {
                                            if (th3 != null) {
                                                if (!(!(th3 instanceof CancellationException))) {
                                                    th3 = null;
                                                }
                                                if (th3 != null) {
                                                    bn.d.a(th4, th3);
                                                }
                                            }
                                        }
                                        th4 = null;
                                        recomposer2.closeCause = th4;
                                        recomposer2._state.setValue(Recomposer.State.ShutDown);
                                        r rVar = r.f5635a;
                                    }
                                }
                            });
                            kVar = kVar2;
                        } else {
                            gVar.cancel(cancellationExceptionA);
                        }
                        kVar2 = null;
                        recomposer.workContinuation = null;
                        gVar.f(new sn.l<Throwable, r>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // sn.l
                            public /* bridge */ /* synthetic */ r invoke(Throwable th3) {
                                invoke2(th3);
                                return r.f5635a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Throwable th3) {
                                Object obj2 = recomposer.stateLock;
                                Recomposer recomposer2 = recomposer;
                                Throwable th4 = th2;
                                synchronized (obj2) {
                                    if (th4 != null) {
                                        if (th3 != null) {
                                            if (!(!(th3 instanceof CancellationException))) {
                                                th3 = null;
                                            }
                                            if (th3 != null) {
                                                bn.d.a(th4, th3);
                                            }
                                        }
                                    }
                                    th4 = null;
                                    recomposer2.closeCause = th4;
                                    recomposer2._state.setValue(Recomposer.State.ShutDown);
                                    r rVar = r.f5635a;
                                }
                            }
                        });
                        kVar = kVar2;
                    } else {
                        recomposer.closeCause = cancellationExceptionA;
                        recomposer._state.setValue(Recomposer.State.ShutDown);
                        r rVar = r.f5635a;
                    }
                }
                if (kVar != null) {
                    Result.a aVar = Result.Companion;
                    kVar.resumeWith(Result.m7534constructorimpl(r.f5635a));
                }
            }
        });
        this.effectJob = wVarA;
        this.effectCoroutineContext = dVar.plus(broadcastFrameClock).plus(wVarA);
        this.stateLock = new Object();
        this.knownCompositions = new ArrayList();
        this.snapshotInvalidations = new ArrayList();
        this.compositionInvalidations = new ArrayList();
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = v.a(State.Inactive);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(c<? super r> cVar) {
        if (getHasSchedulingWork()) {
            return r.f5635a;
        }
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                Result.a aVar = Result.Companion;
                cVar2.resumeWith(Result.m7534constructorimpl(r.f5635a));
            } else {
                this.workContinuation = cVar2;
            }
            r rVar = r.f5635a;
        }
        Object objB = cVar2.B();
        if (objB == a.g()) {
            f.c(cVar);
        }
        return objB == a.g() ? objB : r.f5635a;
    }

    private final <T> T composing(ControlledComposition composition, IdentityArraySet<Object> modifiedValues, sn.a<? extends T> block) {
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            try {
                return block.invoke();
            } finally {
                n.b(1);
                mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                n.a(1);
            }
        } finally {
            n.b(1);
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            n.a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k<r> deriveStateLocked() {
        State state;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            this.knownCompositions.clear();
            this.snapshotInvalidations.clear();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            k<? super r> kVar = this.workContinuation;
            if (kVar != null) {
                k.a.a(kVar, null, 1, null);
            }
            this.workContinuation = null;
            return null;
        }
        if (this.runnerJob == null) {
            this.snapshotInvalidations.clear();
            this.compositionInvalidations.clear();
            state = this.broadcastFrameClock.getHasAwaiters() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = ((this.compositionInvalidations.isEmpty() ^ true) || (this.snapshotInvalidations.isEmpty() ^ true) || (this.compositionsAwaitingApply.isEmpty() ^ true) || (this.compositionValuesAwaitingInsert.isEmpty() ^ true) || this.concurrentCompositionsOutstanding > 0 || this.broadcastFrameClock.getHasAwaiters()) ? State.PendingWork : State.Idle;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        k kVar2 = this.workContinuation;
        this.workContinuation = null;
        return kVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedValues() {
        int i10;
        List listM;
        synchronized (this.stateLock) {
            if (!this.compositionValuesRemoved.isEmpty()) {
                List listZ = x.z(this.compositionValuesRemoved.values());
                this.compositionValuesRemoved.clear();
                listM = new ArrayList(listZ.size());
                int size = listZ.size();
                for (int i11 = 0; i11 < size; i11++) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) listZ.get(i11);
                    listM.add(h.a(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
                }
                this.compositionValueStatesAvailable.clear();
            } else {
                listM = cn.w.m();
            }
        }
        int size2 = listM.size();
        for (i10 = 0; i10 < size2; i10++) {
            Pair pair = (Pair) listM.get(i10);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return (this.compositionsAwaitingApply.isEmpty() ^ true) || this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasFrameWorkLocked() {
        return (this.compositionInvalidations.isEmpty() ^ true) || this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z10;
        synchronized (this.stateLock) {
            z10 = true;
            if (!(!this.snapshotInvalidations.isEmpty()) && !(!this.compositionInvalidations.isEmpty())) {
                if (!this.broadcastFrameClock.getHasAwaiters()) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z10;
        boolean z11;
        synchronized (this.stateLock) {
            z10 = !this.isClosed;
        }
        if (z10) {
            return true;
        }
        Iterator<g> it = this.effectJob.k().iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            if (it.next().isActive()) {
                z11 = true;
                break;
            }
        }
        return z11;
    }

    public static /* synthetic */ void getState$annotations() {
    }

    private final void performInitialMovableContentInserts(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (p.f(list.get(i10).getComposition(), controlledComposition)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                r rVar = r.f5635a;
                ArrayList arrayList = new ArrayList();
                performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                while (!arrayList.isEmpty()) {
                    performInsertValues(arrayList, null);
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<MovableContentStateReference> it = recomposer.compositionValuesAwaitingInsert.iterator();
            while (it.hasNext()) {
                MovableContentStateReference next = it.next();
                if (p.f(next.getComposition(), controlledComposition)) {
                    list.add(next);
                    it.remove();
                }
            }
            r rVar = r.f5635a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> references, IdentityArraySet<Object> modifiedValues) {
        ArrayList arrayList;
        HashMap map = new HashMap(references.size());
        int size = references.size();
        for (int i10 = 0; i10 < size; i10++) {
            MovableContentStateReference movableContentStateReference = references.get(i10);
            ControlledComposition composition$runtime_release = movableContentStateReference.getComposition();
            Object arrayList2 = map.get(composition$runtime_release);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(composition$runtime_release, arrayList2);
            }
            ((ArrayList) arrayList2).add(movableContentStateReference);
        }
        for (Map.Entry entry : map.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list = (List) entry.getValue();
            ComposerKt.runtimeCheck(!controlledComposition.isComposing());
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, modifiedValues));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list.get(i11);
                            arrayList.add(h.a(movableContentStateReference2, RecomposerKt.removeLastMultiValue(this.compositionValuesRemoved, movableContentStateReference2.getContent$runtime_release())));
                        }
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    r rVar = r.f5635a;
                } finally {
                }
            } finally {
                applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            }
        }
        return f0.g1(map.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.ControlledComposition performRecompose(final androidx.compose.runtime.ControlledComposition r7, final androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r7.isComposing()
            r1 = 0
            if (r0 != 0) goto L50
            boolean r0 = r7.getDisposed()
            if (r0 == 0) goto Le
            goto L50
        Le:
            androidx.compose.runtime.snapshots.Snapshot$Companion r0 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE
            sn.l r2 = r6.readObserverOf(r7)
            sn.l r3 = r6.writeObserverOf(r7, r8)
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r0.takeMutableSnapshot(r2, r3)
            androidx.compose.runtime.snapshots.Snapshot r2 = r0.makeCurrent()     // Catch: java.lang.Throwable -> L4b
            r3 = 1
            r4 = 0
            if (r8 == 0) goto L2d
            boolean r5 = r8.isNotEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r5 != r3) goto L2d
            goto L2e
        L2b:
            r7 = move-exception
            goto L47
        L2d:
            r3 = r4
        L2e:
            if (r3 == 0) goto L38
            androidx.compose.runtime.Recomposer$performRecompose$1$1 r3 = new androidx.compose.runtime.Recomposer$performRecompose$1$1     // Catch: java.lang.Throwable -> L2b
            r3.<init>()     // Catch: java.lang.Throwable -> L2b
            r7.prepareCompose(r3)     // Catch: java.lang.Throwable -> L2b
        L38:
            boolean r8 = r7.recompose()     // Catch: java.lang.Throwable -> L2b
            r0.restoreCurrent(r2)     // Catch: java.lang.Throwable -> L4b
            r6.applyAndCheck(r0)
            if (r8 == 0) goto L45
            goto L46
        L45:
            r7 = r1
        L46:
            return r7
        L47:
            r0.restoreCurrent(r2)     // Catch: java.lang.Throwable -> L4b
            throw r7     // Catch: java.lang.Throwable -> L4b
        L4b:
            r7 = move-exception
            r6.applyAndCheck(r0)
            throw r7
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performRecompose(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.collection.IdentityArraySet):androidx.compose.runtime.ControlledComposition");
    }

    private final sn.l<Object, r> readObserverOf(final ControlledComposition controlledComposition) {
        return new sn.l<Object, r>() { // from class: androidx.compose.runtime.Recomposer.readObserverOf.1
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
                p.k(obj, "value");
                controlledComposition.recordReadOf(obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(q<? super l0, ? super MonotonicFrameClock, ? super c<? super r>, ? extends Object> qVar, c<? super r> cVar) {
        Object objG = p000do.g.g(this.broadcastFrameClock, new C13342(qVar, MonotonicFrameClockKt.getMonotonicFrameClock(cVar.getContext()), null), cVar);
        return objG == a.g() ? objG : r.f5635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordComposerModificationsLocked() {
        if (!this.snapshotInvalidations.isEmpty()) {
            List<Set<Object>> list = this.snapshotInvalidations;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Set<? extends Object> set = list.get(i10);
                List<ControlledComposition> list2 = this.knownCompositions;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    list2.get(i11).recordModificationsOf(set);
                }
            }
            this.snapshotInvalidations.clear();
            if (deriveStateLocked() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    private final void recordComposerModificationsLocked(sn.l<? super ControlledComposition, r> lVar) {
        if (!this.snapshotInvalidations.isEmpty()) {
            List list = this.snapshotInvalidations;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Set<? extends Object> set = (Set) list.get(i10);
                List list2 = this.knownCompositions;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((ControlledComposition) list2.get(i11)).recordModificationsOf(set);
                }
            }
            this.snapshotInvalidations.clear();
        }
        List list3 = this.compositionInvalidations;
        int size3 = list3.size();
        for (int i12 = 0; i12 < size3; i12++) {
            lVar.invoke(list3.get(i12));
        }
        this.compositionInvalidations.clear();
        if (deriveStateLocked() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(g gVar) {
        synchronized (this.stateLock) {
            Throwable th2 = this.closeCause;
            if (th2 != null) {
                throw th2;
            }
            if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            this.runnerJob = gVar;
            deriveStateLocked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a2 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r8, androidx.compose.runtime.ProduceFrameSignal r9, hn.c<? super bn.r> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer.C13351
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer.C13351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L65
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.c.b(r10)
        L3f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L73
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.c.b(r10)
            goto L8d
        L65:
            kotlin.c.b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L73:
            java.lang.Object r6 = r5.stateLock
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r4
            java.lang.Object r6 = r9.awaitFrameRequest(r6, r0)
            if (r6 != r1) goto L88
            return r1
        L88:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L8d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>()
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.L$4 = r8
            r0.label = r3
            java.lang.Object r10 = r5.withFrameNanos(r10, r0)
            if (r10 != r1) goto L3f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, hn.c):java.lang.Object");
    }

    private final sn.l<Object, r> writeObserverOf(final ControlledComposition controlledComposition, final IdentityArraySet<Object> identityArraySet) {
        return new sn.l<Object, r>() { // from class: androidx.compose.runtime.Recomposer.writeObserverOf.1
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
                p.k(obj, "value");
                controlledComposition.recordWriteOf(obj);
                IdentityArraySet<Object> identityArraySet2 = identityArraySet;
                if (identityArraySet2 != null) {
                    identityArraySet2.add(obj);
                }
            }
        };
    }

    @NotNull
    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    @Nullable
    public final Object awaitIdle(@NotNull c<? super r> cVar) {
        Object objK = go.f.k(go.f.O(getCurrentState(), new AnonymousClass2(null)), cVar);
        return objK == a.g() ? objK : r.f5635a;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (this._state.getValue().compareTo(State.Idle) >= 0) {
                this._state.setValue(State.ShuttingDown);
            }
            r rVar = r.f5635a;
        }
        g.a.a(this.effectJob, null, 1, null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                r rVar = r.f5635a;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull sn.p<? super Composer, ? super Integer, r> content) {
        p.k(composition, "composition");
        p.k(content, "content");
        boolean zIsComposing = composition.isComposing();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            try {
                composition.composeContent(content);
                r rVar = r.f5635a;
                if (!zIsComposing) {
                    companion.notifyObjectsInitialized();
                }
                synchronized (this.stateLock) {
                    if (this._state.getValue().compareTo(State.ShuttingDown) > 0 && !this.knownCompositions.contains(composition)) {
                        this.knownCompositions.add(composition);
                    }
                }
                performInitialMovableContentInserts(composition);
                composition.applyChanges();
                composition.applyLateChanges();
                if (zIsComposing) {
                    return;
                }
                companion.notifyObjectsInitialized();
            } finally {
                mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        p.k(reference, "reference");
        synchronized (this.stateLock) {
            RecomposerKt.addMultiValue(this.compositionValuesRemoved, reference.getContent$runtime_release(), reference);
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @NotNull
    public final u<State> getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    /* JADX INFO: renamed from: getEffectCoroutineContext$runtime_release, reason: from getter */
    public d getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasPendingWork() {
        boolean z10;
        synchronized (this.stateLock) {
            z10 = true;
            if (!(!this.snapshotInvalidations.isEmpty()) && !(!this.compositionInvalidations.isEmpty()) && this.concurrentCompositionsOutstanding <= 0 && !(!this.compositionsAwaitingApply.isEmpty())) {
                if (!this.broadcastFrameClock.getHasAwaiters()) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public d getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @NotNull
    public final go.d<State> getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        k<r> kVarDeriveStateLocked;
        p.k(reference, "reference");
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(reference);
            kVarDeriveStateLocked = deriveStateLocked();
        }
        if (kVarDeriveStateLocked != null) {
            Result.a aVar = Result.Companion;
            kVarDeriveStateLocked.resumeWith(Result.m7534constructorimpl(r.f5635a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
        k<r> kVarDeriveStateLocked;
        p.k(composition, "composition");
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                kVarDeriveStateLocked = null;
            } else {
                this.compositionInvalidations.add(composition);
                kVarDeriveStateLocked = deriveStateLocked();
            }
        }
        if (kVarDeriveStateLocked != null) {
            Result.a aVar = Result.Companion;
            kVarDeriveStateLocked.resumeWith(Result.m7534constructorimpl(r.f5635a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
        k<r> kVarDeriveStateLocked;
        p.k(scope, "scope");
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(v0.d(scope));
            kVarDeriveStateLocked = deriveStateLocked();
        }
        if (kVarDeriveStateLocked != null) {
            Result.a aVar = Result.Companion;
            kVarDeriveStateLocked.resumeWith(Result.m7534constructorimpl(r.f5635a));
        }
    }

    @Nullable
    public final Object join(@NotNull c<? super r> cVar) {
        Object objW = go.f.w(getCurrentState(), new C13332(null), cVar);
        return objW == a.g() ? objW : r.f5635a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data) {
        p.k(reference, "reference");
        p.k(data, "data");
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(reference, data);
            r rVar = r.f5635a;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @Nullable
    public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
        MovableContentState movableContentStateRemove;
        p.k(reference, "reference");
        synchronized (this.stateLock) {
            movableContentStateRemove = this.compositionValueStatesAvailable.remove(reference);
        }
        return movableContentStateRemove;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
        p.k(table, G5.Q);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
        p.k(composition, "composition");
    }

    @Nullable
    public final Object runRecomposeAndApplyChanges(@NotNull c<? super r> cVar) {
        Object objRecompositionRunner = recompositionRunner(new C13372(null), cVar);
        return objRecompositionRunner == a.g() ? objRecompositionRunner : r.f5635a;
    }

    @ExperimentalComposeApi
    @Nullable
    public final Object runRecomposeConcurrentlyAndApplyChanges(@NotNull d dVar, @NotNull c<? super r> cVar) {
        Object objRecompositionRunner = recompositionRunner(new C13382(dVar, this, null), cVar);
        return objRecompositionRunner == a.g() ? objRecompositionRunner : r.f5635a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
        p.k(composition, "composition");
        synchronized (this.stateLock) {
            this.knownCompositions.remove(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            r rVar = r.f5635a;
        }
    }
}
