package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: LazyListItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/PlaceableInfo;", "", "", "size", "I", "getSize", "()I", "setSize", "(I)V", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "animatedOffset", "Landroidx/compose/animation/core/Animatable;", "getAnimatedOffset", "()Landroidx/compose/animation/core/Animatable;", "targetOffset", "J", "getTargetOffset-nOcc-ac", "()J", "setTargetOffset--gyyYBs", "(J)V", "", "<set-?>", "inProgress$delegate", "Landroidx/compose/runtime/MutableState;", "getInProgress", "()Z", "setInProgress", "(Z)V", "inProgress", "initialOffset", "<init>", "(JILtn/i;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
final class PlaceableInfo {

    @NotNull
    private final Animatable<IntOffset, AnimationVector2D> animatedOffset;

    /* JADX INFO: renamed from: inProgress$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState inProgress;
    private int size;
    private long targetOffset;

    private PlaceableInfo(long j10, int i10) {
        this.size = i10;
        this.animatedOffset = new Animatable<>(IntOffset.m3935boximpl(j10), VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), null, 4, null);
        this.targetOffset = j10;
        this.inProgress = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public /* synthetic */ PlaceableInfo(long j10, int i10, i iVar) {
        this(j10, i10);
    }

    @NotNull
    public final Animatable<IntOffset, AnimationVector2D> getAnimatedOffset() {
        return this.animatedOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInProgress() {
        return ((Boolean) this.inProgress.getValue()).booleanValue();
    }

    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getTargetOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getTargetOffset() {
        return this.targetOffset;
    }

    public final void setInProgress(boolean z10) {
        this.inProgress.setValue(Boolean.valueOf(z10));
    }

    public final void setSize(int i10) {
        this.size = i10;
    }

    /* JADX INFO: renamed from: setTargetOffset--gyyYBs, reason: not valid java name */
    public final void m544setTargetOffsetgyyYBs(long j10) {
        this.targetOffset = j10;
    }
}
