package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNodeEntity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: LayoutNodeEntity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b$\u0010%J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020 8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeEntity;", "T", "Landroidx/compose/ui/Modifier;", "M", "", "Lbn/r;", "onAttach", "onDetach", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "layoutNodeWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getLayoutNodeWrapper", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "next", "Landroidx/compose/ui/node/LayoutNodeEntity;", "getNext", "()Landroidx/compose/ui/node/LayoutNodeEntity;", "setNext", "(Landroidx/compose/ui/node/LayoutNodeEntity;)V", "", "<set-?>", "isAttached", "Z", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/Modifier;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public class LayoutNodeEntity<T extends LayoutNodeEntity<T, M>, M extends Modifier> {
    private boolean isAttached;

    @NotNull
    private final LayoutNodeWrapper layoutNodeWrapper;

    @NotNull
    private final M modifier;

    @Nullable
    private T next;

    public LayoutNodeEntity(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull M m10) {
        p.k(layoutNodeWrapper, "layoutNodeWrapper");
        p.k(m10, "modifier");
        this.layoutNodeWrapper = layoutNodeWrapper;
        this.modifier = m10;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNodeWrapper.getLayoutNode();
    }

    @NotNull
    public final LayoutNodeWrapper getLayoutNodeWrapper() {
        return this.layoutNodeWrapper;
    }

    @NotNull
    public final M getModifier() {
        return this.modifier;
    }

    @Nullable
    public final T getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m3248getSizeYbymL2g() {
        return this.layoutNodeWrapper.mo3114getSizeYbymL2g();
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public void onAttach() {
        this.isAttached = true;
    }

    public void onDetach() {
        this.isAttached = false;
    }

    public final void setNext(@Nullable T t10) {
        this.next = t10;
    }
}
