package androidx.compose.material.ripple;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004JI\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/ripple/PlatformRipple;", "Landroidx/compose/material/ripple/Ripple;", "Landroid/view/ViewGroup;", "findNearestViewGroup", "(Landroidx/compose/runtime/Composer;I)Landroid/view/ViewGroup;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance", "<init>", "(ZFLandroidx/compose/runtime/State;Ltn/i;)V", "material-ripple_release"}, k = 1, mv = {1, 6, 0})
public final class PlatformRipple extends Ripple {
    private PlatformRipple(boolean z10, float f10, State<Color> state) {
        super(z10, f10, state, null);
    }

    public /* synthetic */ PlatformRipple(boolean z10, float f10, State state, i iVar) {
        this(z10, f10, state);
    }

    @Composable
    private final ViewGroup findNearestViewGroup(Composer composer, int i10) {
        composer.startReplaceableGroup(-1737891121);
        Object objConsume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        while (!(objConsume instanceof ViewGroup)) {
            ViewParent parent = ((View) objConsume).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + objConsume + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            p.j(parent, "parent");
            objConsume = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objConsume;
        composer.endReplaceableGroup();
        return viewGroup;
    }

    @Override // androidx.compose.material.ripple.Ripple
    @Composable
    @NotNull
    /* JADX INFO: renamed from: rememberUpdatedRippleInstance-942rkJo */
    public RippleIndicationInstance mo1244rememberUpdatedRippleInstance942rkJo(@NotNull InteractionSource interactionSource, boolean z10, float f10, @NotNull State<Color> state, @NotNull State<RippleAlpha> state2, @Nullable Composer composer, int i10) {
        p.k(interactionSource, "interactionSource");
        p.k(state, "color");
        p.k(state2, "rippleAlpha");
        composer.startReplaceableGroup(331259447);
        ViewGroup viewGroupFindNearestViewGroup = findNearestViewGroup(composer, (i10 >> 15) & 14);
        composer.startReplaceableGroup(1643267286);
        if (viewGroupFindNearestViewGroup.isInEditMode()) {
            composer.startReplaceableGroup(-3686552);
            boolean zChanged = composer.changed(interactionSource) | composer.changed(this);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CommonRippleIndicationInstance(z10, f10, state, state2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) objRememberedValue;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            return commonRippleIndicationInstance;
        }
        composer.endReplaceableGroup();
        View rippleContainer = null;
        int i11 = 0;
        int childCount = viewGroupFindNearestViewGroup.getChildCount();
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = viewGroupFindNearestViewGroup.getChildAt(i11);
            if (childAt instanceof RippleContainer) {
                rippleContainer = childAt;
                break;
            }
            i11++;
        }
        if (rippleContainer == null) {
            Context context = viewGroupFindNearestViewGroup.getContext();
            p.j(context, "view.context");
            rippleContainer = new RippleContainer(context);
            viewGroupFindNearestViewGroup.addView(rippleContainer);
        }
        composer.startReplaceableGroup(-3686095);
        boolean zChanged2 = composer.changed(interactionSource) | composer.changed(this) | composer.changed(rippleContainer);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new AndroidRippleIndicationInstance(z10, f10, state, state2, (RippleContainer) rippleContainer, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        AndroidRippleIndicationInstance androidRippleIndicationInstance = (AndroidRippleIndicationInstance) objRememberedValue2;
        composer.endReplaceableGroup();
        return androidRippleIndicationInstance;
    }
}
