package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import cn.f0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/ScrollableTabData;", "", "Landroidx/compose/material/TabPosition;", "Landroidx/compose/ui/unit/Density;", "density", "", "edgeOffset", "", "tabPositions", "calculateTabOffset", "selectedTab", "Lbn/r;", "onLaidOut", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "Ldo/l0;", "coroutineScope", "Ldo/l0;", "Ljava/lang/Integer;", "<init>", "(Landroidx/compose/foundation/ScrollState;Ldo/l0;)V", "material_release"}, k = 1, mv = {1, 6, 0})
final class ScrollableTabData {

    @NotNull
    private final l0 coroutineScope;

    @NotNull
    private final ScrollState scrollState;

    @Nullable
    private Integer selectedTab;

    public ScrollableTabData(@NotNull ScrollState scrollState, @NotNull l0 l0Var) {
        p.k(scrollState, "scrollState");
        p.k(l0Var, "coroutineScope");
        this.scrollState = scrollState;
        this.coroutineScope = l0Var;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i10, List<TabPosition> list) {
        int iMo300roundToPx0680j_4 = density.mo300roundToPx0680j_4(((TabPosition) f0.F0(list)).m1189getRightD9Ej5fM()) + i10;
        int maxValue = iMo300roundToPx0680j_4 - this.scrollState.getMaxValue();
        return n.n(density.mo300roundToPx0680j_4(tabPosition.getLeft()) - ((maxValue / 2) - (density.mo300roundToPx0680j_4(tabPosition.getWidth()) / 2)), 0, n.e(iMo300roundToPx0680j_4 - maxValue, 0));
    }

    public final void onLaidOut(@NotNull Density density, int i10, @NotNull List<TabPosition> list, int i11) {
        int iCalculateTabOffset;
        p.k(density, "density");
        p.k(list, "tabPositions");
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == i11) {
            return;
        }
        this.selectedTab = Integer.valueOf(i11);
        TabPosition tabPosition = (TabPosition) f0.w0(list, i11);
        if (tabPosition == null || this.scrollState.getValue() == (iCalculateTabOffset = calculateTabOffset(tabPosition, density, i10, list))) {
            return;
        }
        i.d(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, iCalculateTabOffset, null), 3, null);
    }
}
