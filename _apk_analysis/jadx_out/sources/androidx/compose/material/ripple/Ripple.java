package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import bn.r;
import go.e;
import hn.c;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes2.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JI\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001d\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/Indication;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationInstance;", "rememberUpdatedInstance", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/IndicationInstance;", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance", "", "other", "equals", "", "hashCode", "Z", "F", "Landroidx/compose/runtime/State;", "<init>", "(ZFLandroidx/compose/runtime/State;Ltn/i;)V", "material-ripple_release"}, k = 1, mv = {1, 6, 0})
public abstract class Ripple implements Indication {
    private final boolean bounded;

    @NotNull
    private final State<Color> color;
    private final float radius;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1, reason: invalid class name */
    /* JADX INFO: compiled from: Ripple.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @d(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {356}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ RippleIndicationInstance $instance;
        public final /* synthetic */ InteractionSource $interactionSource;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$interactionSource = interactionSource;
            this.$instance = rippleIndicationInstance;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$interactionSource, this.$instance, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final l0 l0Var = (l0) this.L$0;
                go.d<Interaction> interactions = this.$interactionSource.getInteractions();
                final RippleIndicationInstance rippleIndicationInstance = this.$instance;
                e<Interaction> eVar = new e<Interaction>() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$invokeSuspend$$inlined$collect$1
                    @Override // go.e
                    @Nullable
                    public Object emit(Interaction interaction, @NotNull c<? super r> cVar) {
                        Interaction interaction2 = interaction;
                        if (interaction2 instanceof PressInteraction.Press) {
                            rippleIndicationInstance.addRipple((PressInteraction.Press) interaction2, l0Var);
                        } else if (interaction2 instanceof PressInteraction.Release) {
                            rippleIndicationInstance.removeRipple(((PressInteraction.Release) interaction2).getPress());
                        } else if (interaction2 instanceof PressInteraction.Cancel) {
                            rippleIndicationInstance.removeRipple(((PressInteraction.Cancel) interaction2).getPress());
                        } else {
                            rippleIndicationInstance.updateStateLayer$material_ripple_release(interaction2, l0Var);
                        }
                        return r.f5635a;
                    }
                };
                this.label = 1;
                if (interactions.collect(eVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    private Ripple(boolean z10, float f10, State<Color> state) {
        this.bounded = z10;
        this.radius = f10;
        this.color = state;
    }

    public /* synthetic */ Ripple(boolean z10, float f10, State state, i iVar) {
        this(z10, f10, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) other;
        return this.bounded == ripple.bounded && Dp.m3831equalsimpl0(this.radius, ripple.radius) && tn.p.f(this.color, ripple.color);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.bounded) * 31) + Dp.m3832hashCodeimpl(this.radius)) * 31) + this.color.hashCode();
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    @NotNull
    public final IndicationInstance rememberUpdatedInstance(@NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        tn.p.k(interactionSource, "interactionSource");
        composer.startReplaceableGroup(988743187);
        RippleTheme rippleTheme = (RippleTheme) composer.consume(RippleThemeKt.getLocalRippleTheme());
        composer.startReplaceableGroup(-1524341038);
        long jM1629unboximpl = (this.color.getValue().m1629unboximpl() > Color.INSTANCE.m1655getUnspecified0d7_KjU() ? 1 : (this.color.getValue().m1629unboximpl() == Color.INSTANCE.m1655getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? this.color.getValue().m1629unboximpl() : rippleTheme.mo1069defaultColorWaAFU9c(composer, 0);
        composer.endReplaceableGroup();
        RippleIndicationInstance rippleIndicationInstanceMo1244rememberUpdatedRippleInstance942rkJo = mo1244rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, SnapshotStateKt.rememberUpdatedState(Color.m1609boximpl(jM1629unboximpl), composer, 0), SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0), composer, (i10 & 14) | (458752 & (i10 << 12)));
        EffectsKt.LaunchedEffect(rippleIndicationInstanceMo1244rememberUpdatedRippleInstance942rkJo, interactionSource, new AnonymousClass1(interactionSource, rippleIndicationInstanceMo1244rememberUpdatedRippleInstance942rkJo, null), composer, ((i10 << 3) & 112) | 8);
        composer.endReplaceableGroup();
        return rippleIndicationInstanceMo1244rememberUpdatedRippleInstance942rkJo;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo1244rememberUpdatedRippleInstance942rkJo(@NotNull InteractionSource interactionSource, boolean z10, float f10, @NotNull State<Color> state, @NotNull State<RippleAlpha> state2, @Nullable Composer composer, int i10);
}
