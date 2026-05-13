package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000b\u0010\nR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/draw/DrawResult;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lbn/r;", "block", "Lsn/l;", "getBlock$ui_release", "()Lsn/l;", "setBlock$ui_release", "(Lsn/l;)V", "<init>", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class DrawResult {
    public static final int $stable = 8;

    @NotNull
    private l<? super ContentDrawScope, r> block;

    public DrawResult(@NotNull l<? super ContentDrawScope, r> lVar) {
        p.k(lVar, "block");
        this.block = lVar;
    }

    @NotNull
    public final l<ContentDrawScope, r> getBlock$ui_release() {
        return this.block;
    }

    public final void setBlock$ui_release(@NotNull l<? super ContentDrawScope, r> lVar) {
        p.k(lVar, "<set-?>");
        this.block = lVar;
    }
}
