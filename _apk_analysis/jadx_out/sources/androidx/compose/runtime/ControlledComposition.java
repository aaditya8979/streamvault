package androidx.compose.runtime;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.r;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.p;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&J\b\u0010\u0013\u001a\u00020\fH&J$\u0010\u0018\u001a\u00020\u00032\u001a\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H'J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H'J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u0003H'J5\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010!2\b\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010$\u001a\u00020#2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H&¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010(\u0082\u0001\u0001+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Composition;", "Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "content", "composeContent", "(Lsn/p;)V", "", "", "values", "recordModificationsOf", "", "observesAnyOf", "block", "prepareCompose", "value", "recordReadOf", "recordWriteOf", "recompose", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "applyChanges", "applyLateChanges", "changesApplied", "invalidateAll", "verifyConsistent", "R", TypedValues.TransitionType.S_TO, "", "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILsn/a;)Ljava/lang/Object;", "isComposing", "()Z", "getHasPendingChanges", "hasPendingChanges", "Landroidx/compose/runtime/CompositionImpl;", "runtime_release"}, k = 1, mv = {1, 6, 0})
public interface ControlledComposition extends Composition {
    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(@NotNull p<? super Composer, ? super Integer, r> content);

    <R> R delegateInvalidations(@Nullable ControlledComposition to2, int groupIndex, @NotNull a<? extends R> block);

    @InternalComposeApi
    void disposeUnusedMovableContent(@NotNull MovableContentState movableContentState);

    boolean getHasPendingChanges();

    @InternalComposeApi
    void insertMovableContent(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(@NotNull Set<? extends Object> values);

    void prepareCompose(@NotNull a<r> aVar);

    boolean recompose();

    void recordModificationsOf(@NotNull Set<? extends Object> set);

    void recordReadOf(@NotNull Object obj);

    void recordWriteOf(@NotNull Object obj);

    @InternalComposeApi
    void verifyConsistent();
}
