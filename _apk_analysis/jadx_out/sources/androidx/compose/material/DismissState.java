package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
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

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0013\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/DismissState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/DismissValue;", "Landroidx/compose/material/DismissDirection;", "direction", "", "isDismissed", "Lbn/r;", "reset", "(Lhn/c;)Ljava/lang/Object;", "dismiss", "(Landroidx/compose/material/DismissDirection;Lhn/c;)Ljava/lang/Object;", "getDismissDirection", "()Landroidx/compose/material/DismissDirection;", "dismissDirection", "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/DismissValue;Lsn/l;)V", VastTagName.COMPANION, "material_release"}, k = 1, mv = {1, 6, 0})
@ExperimentalMaterialApi
public final class DismissState extends SwipeableState<DismissValue> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/DismissState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DismissState;", "Landroidx/compose/material/DismissValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Saver<DismissState, DismissValue> Saver(@NotNull final l<? super DismissValue, Boolean> lVar) {
            p.k(lVar, "confirmStateChange");
            return SaverKt.Saver(new sn.p<SaverScope, DismissState, DismissValue>() { // from class: androidx.compose.material.DismissState$Companion$Saver$1
                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DismissValue mo2invoke(@NotNull SaverScope saverScope, @NotNull DismissState dismissState) {
                    p.k(saverScope, "$this$Saver");
                    p.k(dismissState, "it");
                    return dismissState.getCurrentValue();
                }
            }, new l<DismissValue, DismissState>() { // from class: androidx.compose.material.DismissState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                @Nullable
                public final DismissState invoke(@NotNull DismissValue dismissValue) {
                    p.k(dismissValue, "it");
                    return new DismissState(dismissValue, lVar);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissState(@NotNull DismissValue dismissValue, @NotNull l<? super DismissValue, Boolean> lVar) {
        super(dismissValue, null, lVar, 2, null);
        p.k(dismissValue, "initialValue");
        p.k(lVar, "confirmStateChange");
    }

    public /* synthetic */ DismissState(DismissValue dismissValue, l lVar, int i10, i iVar) {
        this(dismissValue, (i10 & 2) != 0 ? new l<DismissValue, Boolean>() { // from class: androidx.compose.material.DismissState.1
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull DismissValue dismissValue2) {
                p.k(dismissValue2, "it");
                return Boolean.TRUE;
            }
        } : lVar);
    }

    @Nullable
    public final Object dismiss(@NotNull DismissDirection dismissDirection, @NotNull c<? super r> cVar) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, dismissDirection == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart, null, cVar, 2, null);
        return objAnimateTo$default == a.g() ? objAnimateTo$default : r.f5635a;
    }

    @Nullable
    public final DismissDirection getDismissDirection() {
        if (getOffset().getValue().floatValue() == 0.0f) {
            return null;
        }
        return getOffset().getValue().floatValue() > 0.0f ? DismissDirection.StartToEnd : DismissDirection.EndToStart;
    }

    public final boolean isDismissed(@NotNull DismissDirection direction) {
        p.k(direction, "direction");
        return getCurrentValue() == (direction == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart);
    }

    @Nullable
    public final Object reset(@NotNull c<? super r> cVar) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, DismissValue.Default, null, cVar, 2, null);
        return objAnimateTo$default == a.g() ? objAnimateTo$default : r.f5635a;
    }
}
