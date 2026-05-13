package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import com.ironsource.C3978d4;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J;\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R3\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR3\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u001e8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u0014\u0010#\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013R\u0014\u0010%\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u001d\u0010'\u001a\u00020\u00048DX\u0084\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b&\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "Lbn/r;", "recalculateWidthAndHeight", "Landroidx/compose/ui/unit/IntOffset;", C3978d4.i.L, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLsn/l;)V", "placeAt", "", "<set-?>", "width", "I", "getWidth", "()I", "height", "getHeight", "Landroidx/compose/ui/unit/IntSize;", "value", "measuredSize", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "getApparentToRealOffset-nOcc-ac", "apparentToRealOffset", "<init>", "()V", "PlacementScope", "ui_release"}, k = 1, mv = {1, 6, 0})
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private int width;

    /* JADX INFO: compiled from: Placeable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010$J)\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005J$\u0010\u000e\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005J)\u0010\u000e\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\tJ?\u0010\u0015\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010J:\u0010\u0016\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010J?\u0010\u0016\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0014JE\u0010\u0019\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0016\b\b\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010H\u0080\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0014JE\u0010\u001b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0016\b\b\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010H\u0080\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", C3978d4.i.L, "", "zIndex", "Lbn/r;", "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "placeRelative", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "place", "place-70tqf50", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLsn/l;)V", "placeRelativeWithLayer", "placeWithLayer", "placeWithLayer-aW-9-wM", "placeAutoMirrored-aW-9-wM$ui_release", "placeAutoMirrored", "placeApparentToRealOffset-aW-9-wM$ui_release", "placeApparentToRealOffset", "getParentWidth", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "<init>", "()V", VastTagName.COMPANION, "ui_release"}, k = 1, mv = {1, 6, 0})
    public static abstract class PlacementScope {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static LayoutDirection parentLayoutDirection = LayoutDirection.Ltr;
        private static int parentWidth;

        /* JADX INFO: compiled from: Placeable.kt */
        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Lkotlin/Function1;", "Lbn/r;", "block", "executeWithRtlMirroringValues", "<set-?>", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "I", "getParentWidth", "()I", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
        public static final class Companion extends PlacementScope {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final void executeWithRtlMirroringValues(int i10, @NotNull LayoutDirection layoutDirection, @NotNull l<? super PlacementScope, r> lVar) {
                p.k(layoutDirection, "parentLayoutDirection");
                p.k(lVar, "block");
                Companion companion = PlacementScope.INSTANCE;
                int parentWidth = companion.getParentWidth();
                LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                PlacementScope.parentWidth = i10;
                PlacementScope.parentLayoutDirection = layoutDirection;
                lVar.invoke(this);
                PlacementScope.parentWidth = parentWidth;
                PlacementScope.parentLayoutDirection = parentLayoutDirection;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            @NotNull
            public LayoutDirection getParentLayoutDirection() {
                return PlacementScope.parentLayoutDirection;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public int getParentWidth() {
                return PlacementScope.parentWidth;
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.place(placeable, i10, i11, f10);
        }

        /* JADX INFO: renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3154place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            placementScope.m3158place70tqf50(placeable, j10, f10);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.placeRelative(placeable, i10, i11, f10);
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3155placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            placementScope.m3161placeRelative70tqf50(placeable, j10, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i10, i11, f11, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3156placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m3162placeRelativeWithLayeraW9wM(placeable, j10, f11, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i10, i11, f11, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3157placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m3163placeWithLayeraW9wM(placeable, j10, f11, lVar);
        }

        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable, int i10, int i11, float f10) {
            p.k(placeable, "<this>");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            long jM3149getApparentToRealOffsetnOccac = placeable.m3149getApparentToRealOffsetnOccac();
            placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac), IntOffset.m3945getYimpl(jIntOffset) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac)), f10, null);
        }

        /* JADX INFO: renamed from: place-70tqf50, reason: not valid java name */
        public final void m3158place70tqf50(@NotNull Placeable placeable, long j10, float f10) {
            p.k(placeable, "$this$place");
            long jM3149getApparentToRealOffsetnOccac = placeable.m3149getApparentToRealOffsetnOccac();
            placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(j10) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac), IntOffset.m3945getYimpl(j10) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac)), f10, null);
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3159placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeable, long j10, float f10, @Nullable l<? super GraphicsLayerScope, r> lVar) {
            p.k(placeable, "$this$placeApparentToRealOffset");
            long jM3149getApparentToRealOffsetnOccac = placeable.m3149getApparentToRealOffsetnOccac();
            placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(j10) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac), IntOffset.m3945getYimpl(j10) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac)), f10, lVar);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3160placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeable, long j10, float f10, @Nullable l<? super GraphicsLayerScope, r> lVar) {
            p.k(placeable, "$this$placeAutoMirrored");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3149getApparentToRealOffsetnOccac = placeable.m3149getApparentToRealOffsetnOccac();
                placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(j10) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac), IntOffset.m3945getYimpl(j10) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac)), f10, lVar);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3986getWidthimpl(placeable.measuredSize)) - IntOffset.m3944getXimpl(j10), IntOffset.m3945getYimpl(j10));
                long jM3149getApparentToRealOffsetnOccac2 = placeable.m3149getApparentToRealOffsetnOccac();
                placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac2), IntOffset.m3945getYimpl(jIntOffset) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac2)), f10, lVar);
            }
        }

        public final void placeRelative(@NotNull Placeable placeable, int i10, int i11, float f10) {
            p.k(placeable, "<this>");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3149getApparentToRealOffsetnOccac = placeable.m3149getApparentToRealOffsetnOccac();
                placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac), IntOffset.m3945getYimpl(jIntOffset) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac)), f10, null);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3986getWidthimpl(placeable.measuredSize)) - IntOffset.m3944getXimpl(jIntOffset), IntOffset.m3945getYimpl(jIntOffset));
                long jM3149getApparentToRealOffsetnOccac2 = placeable.m3149getApparentToRealOffsetnOccac();
                placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset2) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac2), IntOffset.m3945getYimpl(jIntOffset2) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac2)), f10, null);
            }
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m3161placeRelative70tqf50(@NotNull Placeable placeable, long j10, float f10) {
            p.k(placeable, "$this$placeRelative");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3149getApparentToRealOffsetnOccac = placeable.m3149getApparentToRealOffsetnOccac();
                placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(j10) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac), IntOffset.m3945getYimpl(j10) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac)), f10, null);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3986getWidthimpl(placeable.measuredSize)) - IntOffset.m3944getXimpl(j10), IntOffset.m3945getYimpl(j10));
                long jM3149getApparentToRealOffsetnOccac2 = placeable.m3149getApparentToRealOffsetnOccac();
                placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac2), IntOffset.m3945getYimpl(jIntOffset) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac2)), f10, null);
            }
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i10, int i11, float f10, @NotNull l<? super GraphicsLayerScope, r> lVar) {
            p.k(placeable, "<this>");
            p.k(lVar, "layerBlock");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3149getApparentToRealOffsetnOccac = placeable.m3149getApparentToRealOffsetnOccac();
                placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac), IntOffset.m3945getYimpl(jIntOffset) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac)), f10, lVar);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3986getWidthimpl(placeable.measuredSize)) - IntOffset.m3944getXimpl(jIntOffset), IntOffset.m3945getYimpl(jIntOffset));
                long jM3149getApparentToRealOffsetnOccac2 = placeable.m3149getApparentToRealOffsetnOccac();
                placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset2) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac2), IntOffset.m3945getYimpl(jIntOffset2) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac2)), f10, lVar);
            }
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3162placeRelativeWithLayeraW9wM(@NotNull Placeable placeable, long j10, float f10, @NotNull l<? super GraphicsLayerScope, r> lVar) {
            p.k(placeable, "$this$placeRelativeWithLayer");
            p.k(lVar, "layerBlock");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3149getApparentToRealOffsetnOccac = placeable.m3149getApparentToRealOffsetnOccac();
                placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(j10) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac), IntOffset.m3945getYimpl(j10) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac)), f10, lVar);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3986getWidthimpl(placeable.measuredSize)) - IntOffset.m3944getXimpl(j10), IntOffset.m3945getYimpl(j10));
                long jM3149getApparentToRealOffsetnOccac2 = placeable.m3149getApparentToRealOffsetnOccac();
                placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac2), IntOffset.m3945getYimpl(jIntOffset) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac2)), f10, lVar);
            }
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i10, int i11, float f10, @NotNull l<? super GraphicsLayerScope, r> lVar) {
            p.k(placeable, "<this>");
            p.k(lVar, "layerBlock");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            long jM3149getApparentToRealOffsetnOccac = placeable.m3149getApparentToRealOffsetnOccac();
            placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jIntOffset) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac), IntOffset.m3945getYimpl(jIntOffset) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac)), f10, lVar);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3163placeWithLayeraW9wM(@NotNull Placeable placeable, long j10, float f10, @NotNull l<? super GraphicsLayerScope, r> lVar) {
            p.k(placeable, "$this$placeWithLayer");
            p.k(lVar, "layerBlock");
            long jM3149getApparentToRealOffsetnOccac = placeable.m3149getApparentToRealOffsetnOccac();
            placeable.mo3113placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(j10) + IntOffset.m3944getXimpl(jM3149getApparentToRealOffsetnOccac), IntOffset.m3945getYimpl(j10) + IntOffset.m3945getYimpl(jM3149getApparentToRealOffsetnOccac)), f10, lVar);
        }
    }

    private final void recalculateWidthAndHeight() {
        this.width = n.n(IntSize.m3986getWidthimpl(this.measuredSize), Constraints.m3784getMinWidthimpl(this.measurementConstraints), Constraints.m3782getMaxWidthimpl(this.measurementConstraints));
        this.height = n.n(IntSize.m3985getHeightimpl(this.measuredSize), Constraints.m3783getMinHeightimpl(this.measurementConstraints), Constraints.m3781getMaxHeightimpl(this.measurementConstraints));
    }

    /* JADX INFO: renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m3149getApparentToRealOffsetnOccac() {
        return IntOffsetKt.IntOffset((this.width - IntSize.m3986getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m3985getHeightimpl(this.measuredSize)) / 2);
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m3985getHeightimpl(this.measuredSize);
    }

    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m3986getWidthimpl(this.measuredSize);
    }

    /* JADX INFO: renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public abstract void mo3113placeAtf8xVGno(long position, float zIndex, @Nullable l<? super GraphicsLayerScope, r> layerBlock);

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m3152setMeasuredSizeozmzZPI(long j10) {
        if (IntSize.m3984equalsimpl0(this.measuredSize, j10)) {
            return;
        }
        this.measuredSize = j10;
        recalculateWidthAndHeight();
    }

    /* JADX INFO: renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m3153setMeasurementConstraintsBRTryo0(long j10) {
        if (Constraints.m3775equalsimpl0(this.measurementConstraints, j10)) {
            return;
        }
        this.measurementConstraints = j10;
        recalculateWidthAndHeight();
    }
}
