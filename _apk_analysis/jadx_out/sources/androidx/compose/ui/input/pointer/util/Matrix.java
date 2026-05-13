package androidx.compose.ui.input.pointer.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/util/Matrix;", "", "", "row", "col", "", "get", "value", "Lbn/r;", "set", "Landroidx/compose/ui/input/pointer/util/Vector;", "getRow", "", "elements", "[Landroidx/compose/ui/input/pointer/util/Vector;", "rows", "cols", "<init>", "(II)V", "ui_release"}, k = 1, mv = {1, 6, 0})
final class Matrix {

    @NotNull
    private final Vector[] elements;

    public Matrix(int i10, int i11) {
        Vector[] vectorArr = new Vector[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            vectorArr[i12] = new Vector(i11);
        }
        this.elements = vectorArr;
    }

    public final float get(int row, int col) {
        return this.elements[row].get(col);
    }

    @NotNull
    public final Vector getRow(int row) {
        return this.elements[row];
    }

    public final void set(int i10, int i11, float f10) {
        this.elements[i10].set(i11, f10);
    }
}
