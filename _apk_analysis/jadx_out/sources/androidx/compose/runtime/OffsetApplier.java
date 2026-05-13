package androidx.compose.runtime;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4157n2;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "node", "Lbn/r;", "down", "(Ljava/lang/Object;)V", "up", "", "index", C4157n2.f33007p, "insertTopDown", "(ILjava/lang/Object;)V", "insertBottomUp", "count", "remove", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "move", "clear", "applier", "Landroidx/compose/runtime/Applier;", TypedValues.CycleType.S_WAVE_OFFSET, "I", "nesting", "getCurrent", "()Ljava/lang/Object;", VideoLookHistoryEntry.CURRNET, "<init>", "(Landroidx/compose/runtime/Applier;I)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class OffsetApplier<N> implements Applier<N> {

    @NotNull
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(@NotNull Applier<N> applier, int i10) {
        p.k(applier, "applier");
        this.applier = applier;
        this.offset = i10;
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeRuntimeError("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N node) {
        this.nesting++;
        this.applier.down(node);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, N instance) {
        this.applier.insertBottomUp(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, N instance) {
        this.applier.insertTopDown(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i10, int i11, int i12) {
        int i13 = this.nesting == 0 ? this.offset : 0;
        this.applier.move(i10 + i13, i11 + i13, i12);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i10, int i11) {
        this.applier.remove(i10 + (this.nesting == 0 ? this.offset : 0), i11);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        int i10 = this.nesting;
        if (!(i10 > 0)) {
            ComposerKt.composeRuntimeError("OffsetApplier up called with no corresponding down".toString());
            throw new KotlinNothingValueException();
        }
        this.nesting = i10 - 1;
        this.applier.up();
    }
}
