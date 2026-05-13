package androidx.compose.foundation;

import android.annotation.NonNull;
import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PlatformMagnifier.kt */
/* JADX INFO: loaded from: classes12.dex */
@RequiresApi(29)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "()V", "canUpdateZoom", "", "getCanUpdateZoom", "()Z", "create", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "style", "Landroidx/compose/foundation/MagnifierStyle;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "initialZoom", "", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {

    @NotNull
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    /* JADX INFO: compiled from: PlatformMagnifier.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "Lbn/r;", "update-Wko1d7g", "(JJF)V", "update", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
    @RequiresApi(29)
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlatformMagnifierImpl(@NotNull Magnifier magnifier) {
            super(magnifier);
            p.k(magnifier, "magnifier");
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: update-Wko1d7g */
        public void mo235updateWko1d7g(long sourceCenter, long magnifierCenter, float zoom) {
            if (!Float.isNaN(zoom)) {
                getMagnifier().setZoom(zoom);
            }
            if (OffsetKt.m1402isSpecifiedk4lQ0M(magnifierCenter)) {
                getMagnifier().show(Offset.m1383getXimpl(sourceCenter), Offset.m1384getYimpl(sourceCenter), Offset.m1383getXimpl(magnifierCenter), Offset.m1384getYimpl(magnifierCenter));
            } else {
                getMagnifier().show(Offset.m1383getXimpl(sourceCenter), Offset.m1384getYimpl(sourceCenter));
            }
        }
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    @NotNull
    public PlatformMagnifierImpl create(@NotNull MagnifierStyle style, @NotNull View view, @NotNull Density density, float initialZoom) {
        p.k(style, "style");
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(density, "density");
        if (p.f(style, MagnifierStyle.INSTANCE.getTextDefault())) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long jMo307toSizeXkaWNTQ = density.mo307toSizeXkaWNTQ(style.getSize());
        float fMo306toPx0680j_4 = density.mo306toPx0680j_4(style.getCornerRadius());
        float fMo306toPx0680j_42 = density.mo306toPx0680j_4(style.getElevation());
        Magnifier.Builder builder = new Object(view) { // from class: android.widget.Magnifier.Builder
            static {
                throw new NoClassDefFoundError();
            }

            public /* synthetic */ Builder(@NonNull View view2) {
            }

            @NonNull
            public native /* synthetic */ Magnifier build();

            @NonNull
            public native /* synthetic */ Builder setClippingEnabled(boolean z10);

            @NonNull
            public native /* synthetic */ Builder setCornerRadius(float f10);

            @NonNull
            public native /* synthetic */ Builder setElevation(float f10);

            @NonNull
            public native /* synthetic */ Builder setInitialZoom(float f10);

            @NonNull
            public native /* synthetic */ Builder setSize(int i10, int i11);
        };
        if (jMo307toSizeXkaWNTQ != Size.INSTANCE.m1460getUnspecifiedNHjbRc()) {
            builder.setSize(vn.c.d(Size.m1452getWidthimpl(jMo307toSizeXkaWNTQ)), vn.c.d(Size.m1449getHeightimpl(jMo307toSizeXkaWNTQ)));
        }
        if (!Float.isNaN(fMo306toPx0680j_4)) {
            builder.setCornerRadius(fMo306toPx0680j_4);
        }
        if (!Float.isNaN(fMo306toPx0680j_42)) {
            builder.setElevation(fMo306toPx0680j_42);
        }
        if (!Float.isNaN(initialZoom)) {
            builder.setInitialZoom(initialZoom);
        }
        builder.setClippingEnabled(style.getClippingEnabled());
        Magnifier magnifierBuild = builder.build();
        p.j(magnifierBuild, "Builder(view).run {\n    …    build()\n            }");
        return new PlatformMagnifierImpl(magnifierBuild);
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }
}
