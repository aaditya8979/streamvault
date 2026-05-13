package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
/* JADX INFO: loaded from: classes11.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B%\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140%¢\u0006\u0004\b'\u0010(J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0019R \u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u001f8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/material/DrawerState;", "", "Lbn/r;", "open", "(Lhn/c;)Ljava/lang/Object;", "close", "Landroidx/compose/material/DrawerValue;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lhn/c;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material/DrawerValue;Lhn/c;)Ljava/lang/Object;", "Landroidx/compose/material/SwipeableState;", "swipeableState", "Landroidx/compose/material/SwipeableState;", "getSwipeableState$material_release", "()Landroidx/compose/material/SwipeableState;", "", "isOpen", "()Z", "isClosed", "getCurrentValue", "()Landroidx/compose/material/DrawerValue;", "currentValue", "isAnimationRunning", "getTargetValue", "getTargetValue$annotations", "()V", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "getOffset$annotations", TypedValues.CycleType.S_WAVE_OFFSET, "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/DrawerValue;Lsn/l;)V", VastTagName.COMPANION, "material_release"}, k = 1, mv = {1, 6, 0})
public final class DrawerState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SwipeableState<DrawerValue> swipeableState;

    /* JADX INFO: compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DrawerState;", "Landroidx/compose/material/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Saver<DrawerState, DrawerValue> Saver(@NotNull final l<? super DrawerValue, Boolean> lVar) {
            p.k(lVar, "confirmStateChange");
            return SaverKt.Saver(new sn.p<SaverScope, DrawerState, DrawerValue>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$1
                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DrawerValue mo2invoke(@NotNull SaverScope saverScope, @NotNull DrawerState drawerState) {
                    p.k(saverScope, "$this$Saver");
                    p.k(drawerState, "it");
                    return drawerState.getCurrentValue();
                }
            }, new l<DrawerValue, DrawerState>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                @Nullable
                public final DrawerState invoke(@NotNull DrawerValue drawerValue) {
                    p.k(drawerValue, "it");
                    return new DrawerState(drawerValue, lVar);
                }
            });
        }
    }

    public DrawerState(@NotNull DrawerValue drawerValue, @NotNull l<? super DrawerValue, Boolean> lVar) {
        p.k(drawerValue, "initialValue");
        p.k(lVar, "confirmStateChange");
        this.swipeableState = new SwipeableState<>(drawerValue, DrawerKt.AnimationSpec, lVar);
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, l lVar, int i10, i iVar) {
        this(drawerValue, (i10 & 2) != 0 ? new l<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerState.1
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull DrawerValue drawerValue2) {
                p.k(drawerValue2, "it");
                return Boolean.TRUE;
            }
        } : lVar);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object animateTo(@NotNull DrawerValue drawerValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull c<? super r> cVar) {
        Object objAnimateTo = this.swipeableState.animateTo(drawerValue, animationSpec, cVar);
        return objAnimateTo == a.g() ? objAnimateTo : r.f5635a;
    }

    @Nullable
    public final Object close(@NotNull c<? super r> cVar) {
        Object objAnimateTo = animateTo(DrawerValue.Closed, DrawerKt.AnimationSpec, cVar);
        return objAnimateTo == a.g() ? objAnimateTo : r.f5635a;
    }

    @NotNull
    public final DrawerValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    @ExperimentalMaterialApi
    @NotNull
    public final State<Float> getOffset() {
        return this.swipeableState.getOffset();
    }

    @NotNull
    public final SwipeableState<DrawerValue> getSwipeableState$material_release() {
        return this.swipeableState;
    }

    @ExperimentalMaterialApi
    @NotNull
    public final DrawerValue getTargetValue() {
        return this.swipeableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.swipeableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    @Nullable
    public final Object open(@NotNull c<? super r> cVar) {
        Object objAnimateTo = animateTo(DrawerValue.Open, DrawerKt.AnimationSpec, cVar);
        return objAnimateTo == a.g() ? objAnimateTo : r.f5635a;
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object snapTo(@NotNull DrawerValue drawerValue, @NotNull c<? super r> cVar) {
        Object objSnapTo = this.swipeableState.snapTo(drawerValue, cVar);
        return objSnapTo == a.g() ? objSnapTo : r.f5635a;
    }
}
