package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.i;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H&R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/vector/VNode;", "", "Lbn/r;", "invalidate", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "Lkotlin/Function0;", "invalidateListener", "Lsn/a;", "getInvalidateListener$ui_release", "()Lsn/a;", "setInvalidateListener$ui_release", "(Lsn/a;)V", "<init>", "()V", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "ui_release"}, k = 1, mv = {1, 6, 0})
public abstract class VNode {
    public static final int $stable = 8;

    @Nullable
    private a<r> invalidateListener;

    private VNode() {
    }

    public /* synthetic */ VNode(i iVar) {
        this();
    }

    public abstract void draw(@NotNull DrawScope drawScope);

    @Nullable
    public a<r> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        a<r> invalidateListener$ui_release = getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke();
        }
    }

    public void setInvalidateListener$ui_release(@Nullable a<r> aVar) {
        this.invalidateListener = aVar;
    }
}
