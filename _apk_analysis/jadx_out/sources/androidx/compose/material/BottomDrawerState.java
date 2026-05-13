package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import bn.r;
import hn.c;
import in.a;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/BottomDrawerValue;", "Lbn/r;", "open", "(Lhn/c;)Ljava/lang/Object;", "close", "expand", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "isOpenEnabled", "()Z", "isOpen", "isClosed", "isExpanded", "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/BottomDrawerValue;Lsn/l;)V", VastTagName.COMPANION, "material_release"}, k = 1, mv = {1, 6, 0})
@ExperimentalMaterialApi
public final class BottomDrawerState extends SwipeableState<BottomDrawerValue> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final NestedScrollConnection nestedScrollConnection;

    /* JADX INFO: compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/BottomDrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(@NotNull final l<? super BottomDrawerValue, Boolean> lVar) {
            p.k(lVar, "confirmStateChange");
            return SaverKt.Saver(new sn.p<SaverScope, BottomDrawerState, BottomDrawerValue>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$1
                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final BottomDrawerValue mo2invoke(@NotNull SaverScope saverScope, @NotNull BottomDrawerState bottomDrawerState) {
                    p.k(saverScope, "$this$Saver");
                    p.k(bottomDrawerState, "it");
                    return bottomDrawerState.getCurrentValue();
                }
            }, new l<BottomDrawerValue, BottomDrawerState>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                @Nullable
                public final BottomDrawerState invoke(@NotNull BottomDrawerValue bottomDrawerValue) {
                    p.k(bottomDrawerValue, "it");
                    return new BottomDrawerState(bottomDrawerValue, lVar);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDrawerState(@NotNull BottomDrawerValue bottomDrawerValue, @NotNull l<? super BottomDrawerValue, Boolean> lVar) {
        super(bottomDrawerValue, DrawerKt.AnimationSpec, lVar);
        p.k(bottomDrawerValue, "initialValue");
        p.k(lVar, "confirmStateChange");
        this.nestedScrollConnection = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }

    public /* synthetic */ BottomDrawerState(BottomDrawerValue bottomDrawerValue, l lVar, int i10, i iVar) {
        this(bottomDrawerValue, (i10 & 2) != 0 ? new l<BottomDrawerValue, Boolean>() { // from class: androidx.compose.material.BottomDrawerState.1
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull BottomDrawerValue bottomDrawerValue2) {
                p.k(bottomDrawerValue2, "it");
                return Boolean.TRUE;
            }
        } : lVar);
    }

    private final boolean isOpenEnabled() {
        return getAnchors$material_release().values().contains(BottomDrawerValue.Open);
    }

    @Nullable
    public final Object close(@NotNull c<? super r> cVar) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, BottomDrawerValue.Closed, null, cVar, 2, null);
        return objAnimateTo$default == a.g() ? objAnimateTo$default : r.f5635a;
    }

    @Nullable
    public final Object expand(@NotNull c<? super r> cVar) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, BottomDrawerValue.Expanded, null, cVar, 2, null);
        return objAnimateTo$default == a.g() ? objAnimateTo$default : r.f5635a;
    }

    @NotNull
    /* JADX INFO: renamed from: getNestedScrollConnection$material_release, reason: from getter */
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    public final boolean isClosed() {
        return getCurrentValue() == BottomDrawerValue.Closed;
    }

    public final boolean isExpanded() {
        return getCurrentValue() == BottomDrawerValue.Expanded;
    }

    public final boolean isOpen() {
        return getCurrentValue() != BottomDrawerValue.Closed;
    }

    @Nullable
    public final Object open(@NotNull c<? super r> cVar) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, isOpenEnabled() ? BottomDrawerValue.Open : BottomDrawerValue.Expanded, null, cVar, 2, null);
        return objAnimateTo$default == a.g() ? objAnimateTo$default : r.f5635a;
    }
}
