package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import com.ironsource.C3978d4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0007\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "", "Landroidx/compose/foundation/text/Handle;", "component1", "Landroidx/compose/ui/geometry/Offset;", "component2-F1C5BW0", "()J", "component2", "handle", C3978d4.i.L, "copy-Uv8p0NA", "(Landroidx/compose/foundation/text/Handle;J)Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/foundation/text/Handle;", "getHandle", "()Landroidx/compose/foundation/text/Handle;", "J", "getPosition-F1C5BW0", "<init>", "(Landroidx/compose/foundation/text/Handle;JLtn/i;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class SelectionHandleInfo {

    @NotNull
    private final Handle handle;
    private final long position;

    private SelectionHandleInfo(Handle handle, long j10) {
        this.handle = handle;
        this.position = j10;
    }

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j10, i iVar) {
        this(handle, j10);
    }

    /* JADX INFO: renamed from: copy-Uv8p0NA$default, reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m792copyUv8p0NA$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i10 & 2) != 0) {
            j10 = selectionHandleInfo.position;
        }
        return selectionHandleInfo.m794copyUv8p0NA(handle, j10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Handle getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: component2-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-Uv8p0NA, reason: not valid java name */
    public final SelectionHandleInfo m794copyUv8p0NA(@NotNull Handle handle, long position) {
        p.k(handle, "handle");
        return new SelectionHandleInfo(handle, position, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) other;
        return this.handle == selectionHandleInfo.handle && Offset.m1380equalsimpl0(this.position, selectionHandleInfo.position);
    }

    @NotNull
    public final Handle getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m795getPositionF1C5BW0() {
        return this.position;
    }

    public int hashCode() {
        return (this.handle.hashCode() * 31) + Offset.m1385hashCodeimpl(this.position);
    }

    @NotNull
    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m1391toStringimpl(this.position)) + ')';
    }
}
