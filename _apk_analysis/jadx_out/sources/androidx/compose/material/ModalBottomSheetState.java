package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import bn.r;
import com.ironsource.C4089j8;
import com.ironsource.C4157n2;
import hn.c;
import in.a;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B=\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0004\b\u001e\u0010\u001fB7\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0004\b\u001e\u0010 J\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0013\u0010\t\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005J\u0013\u0010\n\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/ModalBottomSheetValue;", "Lbn/r;", C4157n2.f33013v, "(Lhn/c;)Ljava/lang/Object;", "halfExpand$material_release", "halfExpand", "expand$material_release", "expand", "hide", "", "isSkipHalfExpanded", "Z", "isSkipHalfExpanded$material_release", "()Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", C4089j8.f32054k, "getHasHalfExpandedState$material_release", "hasHalfExpandedState", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLsn/l;)V", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lsn/l;)V", VastTagName.COMPANION, "material_release"}, k = 1, mv = {1, 6, 0})
@ExperimentalMaterialApi
public final class ModalBottomSheetState extends SwipeableState<ModalBottomSheetValue> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isSkipHalfExpanded;

    @NotNull
    private final NestedScrollConnection nestedScrollConnection;

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007J:\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/ModalBottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "", "skipHalfExpanded", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull l<? super ModalBottomSheetValue, Boolean> lVar) {
            p.k(animationSpec, "animationSpec");
            p.k(lVar, "confirmStateChange");
            return Saver(animationSpec, false, lVar);
        }

        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull final AnimationSpec<Float> animationSpec, final boolean z10, @NotNull final l<? super ModalBottomSheetValue, Boolean> lVar) {
            p.k(animationSpec, "animationSpec");
            p.k(lVar, "confirmStateChange");
            return SaverKt.Saver(new sn.p<SaverScope, ModalBottomSheetState, ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$1
                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final ModalBottomSheetValue mo2invoke(@NotNull SaverScope saverScope, @NotNull ModalBottomSheetState modalBottomSheetState) {
                    p.k(saverScope, "$this$Saver");
                    p.k(modalBottomSheetState, "it");
                    return modalBottomSheetState.getCurrentValue();
                }
            }, new l<ModalBottomSheetValue, ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                @Nullable
                public final ModalBottomSheetState invoke(@NotNull ModalBottomSheetValue modalBottomSheetValue) {
                    p.k(modalBottomSheetValue, "it");
                    return new ModalBottomSheetState(modalBottomSheetValue, animationSpec, z10, lVar);
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue modalBottomSheetValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull l<? super ModalBottomSheetValue, Boolean> lVar) {
        this(modalBottomSheetValue, animationSpec, false, lVar);
        p.k(modalBottomSheetValue, "initialValue");
        p.k(animationSpec, "animationSpec");
        p.k(lVar, "confirmStateChange");
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, l lVar, int i10, i iVar) {
        this(modalBottomSheetValue, (i10 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i10 & 4) != 0 ? new l<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetState.2
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull ModalBottomSheetValue modalBottomSheetValue2) {
                p.k(modalBottomSheetValue2, "it");
                return Boolean.TRUE;
            }
        } : lVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue modalBottomSheetValue, @NotNull AnimationSpec<Float> animationSpec, boolean z10, @NotNull l<? super ModalBottomSheetValue, Boolean> lVar) {
        super(modalBottomSheetValue, animationSpec, lVar);
        p.k(modalBottomSheetValue, "initialValue");
        p.k(animationSpec, "animationSpec");
        p.k(lVar, "confirmStateChange");
        this.isSkipHalfExpanded = z10;
        if (z10) {
            if (!(modalBottomSheetValue != ModalBottomSheetValue.HalfExpanded)) {
                throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
            }
        }
        this.nestedScrollConnection = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, boolean z10, l lVar, int i10, i iVar) {
        this(modalBottomSheetValue, (i10 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, z10, (i10 & 8) != 0 ? new l<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetState.1
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull ModalBottomSheetValue modalBottomSheetValue2) {
                p.k(modalBottomSheetValue2, "it");
                return Boolean.TRUE;
            }
        } : lVar);
    }

    @Nullable
    public final Object expand$material_release(@NotNull c<? super r> cVar) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, ModalBottomSheetValue.Expanded, null, cVar, 2, null);
        return objAnimateTo$default == a.g() ? objAnimateTo$default : r.f5635a;
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return getAnchors$material_release().values().contains(ModalBottomSheetValue.HalfExpanded);
    }

    @NotNull
    /* JADX INFO: renamed from: getNestedScrollConnection$material_release, reason: from getter */
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Nullable
    public final Object halfExpand$material_release(@NotNull c<? super r> cVar) {
        Object objAnimateTo$default;
        return (getHasHalfExpandedState$material_release() && (objAnimateTo$default = SwipeableState.animateTo$default(this, ModalBottomSheetValue.HalfExpanded, null, cVar, 2, null)) == a.g()) ? objAnimateTo$default : r.f5635a;
    }

    @Nullable
    public final Object hide(@NotNull c<? super r> cVar) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, ModalBottomSheetValue.Hidden, null, cVar, 2, null);
        return objAnimateTo$default == a.g() ? objAnimateTo$default : r.f5635a;
    }

    /* JADX INFO: renamed from: isSkipHalfExpanded$material_release, reason: from getter */
    public final boolean getIsSkipHalfExpanded() {
        return this.isSkipHalfExpanded;
    }

    public final boolean isVisible() {
        return getCurrentValue() != ModalBottomSheetValue.Hidden;
    }

    @Nullable
    public final Object show(@NotNull c<? super r> cVar) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, getHasHalfExpandedState$material_release() ? ModalBottomSheetValue.HalfExpanded : ModalBottomSheetValue.Expanded, null, cVar, 2, null);
        return objAnimateTo$default == a.g() ? objAnimateTo$default : r.f5635a;
    }
}
