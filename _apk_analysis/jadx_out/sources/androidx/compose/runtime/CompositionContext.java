package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import bn.r;
import com.ironsource.G5;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: CompositionContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\bM\u0010,J*\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H ¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH ¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0018\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b \u0010\fJ\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\"\u0010\fJ/\u0010*\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010&0$j\u0002`'H\u0010¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020\u0005H\u0010¢\u0006\u0004\b+\u0010,J\u000f\u0010/\u001a\u00020\u0005H\u0010¢\u0006\u0004\b.\u0010,J\u0017\u00104\u001a\u00020\u00052\u0006\u00101\u001a\u000200H ¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00052\u0006\u00101\u001a\u000200H ¢\u0006\u0004\b5\u00103J\u001f\u0010;\u001a\u00020\u00052\u0006\u00101\u001a\u0002002\u0006\u00108\u001a\u000207H ¢\u0006\u0004\b9\u0010:J\u0019\u0010>\u001a\u0004\u0018\u0001072\u0006\u00101\u001a\u000200H\u0010¢\u0006\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8 X \u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8 X \u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8 X \u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020G8 X \u0004¢\u0006\u0006\u001a\u0004\bK\u0010I¨\u0006N"}, d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lsn/p;)V", "composeInitial", "invalidate$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "", "Landroidx/compose/runtime/tooling/CompositionData;", G5.Q, "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime_release", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime_release", "unregisterComposer", "registerComposition$runtime_release", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalScope$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getCompositionLocalScope", "startComposing$runtime_release", "()V", "startComposing", "doneComposing$runtime_release", "doneComposing", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "", "getCollectingParameterInformation$runtime_release", "()Z", "collectingParameterInformation", "Lkotlin/coroutines/d;", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/d;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "recomposeCoroutineContext", "<init>", "runtime_release"}, k = 1, mv = {1, 6, 0})
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull p<? super Composer, ? super Integer, r> content);

    public abstract void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference);

    public void doneComposing$runtime_release() {
    }

    public abstract boolean getCollectingParameterInformation$runtime_release();

    @NotNull
    public PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope$runtime_release() {
        return CompositionContextKt.EmptyCompositionLocalMap;
    }

    public abstract int getCompoundHashKey$runtime_release();

    @NotNull
    /* JADX INFO: renamed from: getEffectCoroutineContext$runtime_release */
    public abstract d getEffectCoroutineContext();

    @NotNull
    public abstract d getRecomposeCoroutineContext$runtime_release();

    public abstract void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference);

    public abstract void invalidate$runtime_release(@NotNull ControlledComposition composition);

    public abstract void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope);

    public abstract void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data);

    @Nullable
    public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
        tn.p.k(reference, "reference");
        return null;
    }

    public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
        tn.p.k(table, G5.Q);
    }

    public void registerComposer$runtime_release(@NotNull Composer composer) {
        tn.p.k(composer, "composer");
    }

    public abstract void registerComposition$runtime_release(@NotNull ControlledComposition composition);

    public void startComposing$runtime_release() {
    }

    public void unregisterComposer$runtime_release(@NotNull Composer composer) {
        tn.p.k(composer, "composer");
    }

    public abstract void unregisterComposition$runtime_release(@NotNull ControlledComposition composition);
}
