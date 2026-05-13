package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: Arrangement.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b:\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005KLMNOB\t\b\u0002¢\u0006\u0004\bJ\u00100J/\u0010\t\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0082\bJ\u001d\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0015H\u0007J/\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!J/\u0010$\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b#\u0010\u001eJ/\u0010&\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b%\u0010\u001eJ/\u0010(\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b'\u0010\u001eJ/\u0010*\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b)\u0010\u001eR \u0010+\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u00101\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010.R \u00104\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00100\u001a\u0004\b6\u00107R \u00109\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u00105\u0012\u0004\b;\u00100\u001a\u0004\b:\u00107R \u0010<\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u00100\u001a\u0004\b>\u0010?R \u0010A\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010=\u0012\u0004\bC\u00100\u001a\u0004\bB\u0010?R \u0010D\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010=\u0012\u0004\bF\u00100\u001a\u0004\bE\u0010?R \u0010G\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010=\u0012\u0004\bI\u00100\u001a\u0004\bH\u0010?\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "", "", "reversed", "Lkotlin/Function2;", "", "Lbn/r;", "action", "forEachIndexed", "Landroidx/compose/ui/unit/Dp;", "space", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "aligned", "totalSize", "size", "outPosition", "reverseInput", "placeRightOrBottom$foundation_layout_release", "(I[I[IZ)V", "placeRightOrBottom", "placeLeftOrTop$foundation_layout_release", "([I[IZ)V", "placeLeftOrTop", "placeCenter$foundation_layout_release", "placeCenter", "placeSpaceEvenly$foundation_layout_release", "placeSpaceEvenly", "placeSpaceBetween$foundation_layout_release", "placeSpaceBetween", "placeSpaceAround$foundation_layout_release", "placeSpaceAround", "Start", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart$annotations", "()V", "End", "getEnd", "getEnd$annotations", "Top", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop$annotations", "Bottom", "getBottom", "getBottom$annotations", "Center", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter$annotations", "SpaceEvenly", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceBetween", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceAround", "getSpaceAround", "getSpaceAround$annotations", "<init>", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
public final class Arrangement {

    @NotNull
    public static final Arrangement INSTANCE = new Arrangement();

    @NotNull
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(layoutDirection, "layoutDirection");
            p.k(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i10, iArr, iArr2, true);
            }
        }

        @NotNull
        public String toString() {
            return "Arrangement#Start";
        }
    };

    @NotNull
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(layoutDirection, "layoutDirection");
            p.k(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i10, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, true);
            }
        }

        @NotNull
        public String toString() {
            return "Arrangement#End";
        }
    };

    @NotNull
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(iArr2, "outPositions");
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
        }

        @NotNull
        public String toString() {
            return "Arrangement#Top";
        }
    };

    @NotNull
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(iArr2, "outPositions");
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i10, iArr, iArr2, false);
        }

        @NotNull
        public String toString() {
            return "Arrangement#Bottom";
        }
    };

    @NotNull
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1
        private final float spacing = Dp.m3826constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(layoutDirection, "layoutDirection");
            p.k(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i10, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(iArr2, "outPositions");
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name and from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @NotNull
        public String toString() {
            return "Arrangement#Center";
        }
    };

    @NotNull
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1
        private final float spacing = Dp.m3826constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(layoutDirection, "layoutDirection");
            p.k(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i10, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(iArr2, "outPositions");
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @NotNull
        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    };

    @NotNull
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1
        private final float spacing = Dp.m3826constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(layoutDirection, "layoutDirection");
            p.k(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i10, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(iArr2, "outPositions");
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @NotNull
        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    };

    @NotNull
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1
        private final float spacing = Dp.m3826constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(layoutDirection, "layoutDirection");
            p.k(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i10, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(iArr2, "outPositions");
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @NotNull
        public String toString() {
            return "Arrangement#SpaceAround";
        }
    };

    /* JADX INFO: compiled from: Arrangement.kt */
    @Immutable
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001d\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J%\u0010\u001a\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010$R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "()V", "Center", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getCenter$annotations", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Left", "getLeft$annotations", "getLeft", "Right", "getRight$annotations", "getRight", "SpaceAround", "getSpaceAround$annotations", "getSpaceAround", "SpaceBetween", "getSpaceBetween$annotations", "getSpaceBetween", "SpaceEvenly", "getSpaceEvenly$annotations", "getSpaceEvenly", "aligned", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "spacedBy", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "space", "Landroidx/compose/ui/unit/Dp;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Absolute {

        @NotNull
        public static final Absolute INSTANCE = new Absolute();

        @NotNull
        private static final Horizontal Left = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                p.k(density, "<this>");
                p.k(iArr, "sizes");
                p.k(layoutDirection, "layoutDirection");
                p.k(iArr2, "outPositions");
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        };

        @NotNull
        private static final Horizontal Center = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                p.k(density, "<this>");
                p.k(iArr, "sizes");
                p.k(layoutDirection, "layoutDirection");
                p.k(iArr2, "outPositions");
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i10, iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        };

        @NotNull
        private static final Horizontal Right = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                p.k(density, "<this>");
                p.k(iArr, "sizes");
                p.k(layoutDirection, "layoutDirection");
                p.k(iArr2, "outPositions");
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i10, iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        };

        @NotNull
        private static final Horizontal SpaceBetween = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                p.k(density, "<this>");
                p.k(iArr, "sizes");
                p.k(layoutDirection, "layoutDirection");
                p.k(iArr2, "outPositions");
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i10, iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };

        @NotNull
        private static final Horizontal SpaceEvenly = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                p.k(density, "<this>");
                p.k(iArr, "sizes");
                p.k(layoutDirection, "layoutDirection");
                p.k(iArr2, "outPositions");
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i10, iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };

        @NotNull
        private static final Horizontal SpaceAround = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                p.k(density, "<this>");
                p.k(iArr, "sizes");
                p.k(layoutDirection, "layoutDirection");
                p.k(iArr2, "outPositions");
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i10, iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        private Absolute() {
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLeft$annotations() {
        }

        @Stable
        public static /* synthetic */ void getRight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }

        @Stable
        @NotNull
        public final Horizontal aligned(@NotNull final Alignment.Horizontal alignment) {
            p.k(alignment, "alignment");
            return new SpacedAligned(Dp.m3826constructorimpl(0), false, new sn.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$aligned$1
                {
                    super(2);
                }

                @NotNull
                public final Integer invoke(int i10, @NotNull LayoutDirection layoutDirection) {
                    p.k(layoutDirection, "layoutDirection");
                    return Integer.valueOf(alignment.align(0, i10, layoutDirection));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }
            }, null);
        }

        @NotNull
        public final Horizontal getCenter() {
            return Center;
        }

        @NotNull
        public final Horizontal getLeft() {
            return Left;
        }

        @NotNull
        public final Horizontal getRight() {
            return Right;
        }

        @NotNull
        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        @NotNull
        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        @NotNull
        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Stable
        @NotNull
        /* JADX INFO: renamed from: spacedBy-0680j_4, reason: not valid java name */
        public final HorizontalOrVertical m359spacedBy0680j_4(float space) {
            return new SpacedAligned(space, false, null, 0 == true ? 1 : 0);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Horizontal m360spacedByD5KLDUw(float space, @NotNull final Alignment.Horizontal alignment) {
            p.k(alignment, "alignment");
            return new SpacedAligned(space, false, new sn.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$1
                {
                    super(2);
                }

                @NotNull
                public final Integer invoke(int i10, @NotNull LayoutDirection layoutDirection) {
                    p.k(layoutDirection, "layoutDirection");
                    return Integer.valueOf(alignment.align(0, i10, layoutDirection));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }
            }, null);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Vertical m361spacedByD5KLDUw(float space, @NotNull final Alignment.Vertical alignment) {
            p.k(alignment, "alignment");
            return new SpacedAligned(space, false, new sn.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$2
                {
                    super(2);
                }

                @NotNull
                public final Integer invoke(int i10, @NotNull LayoutDirection layoutDirection) {
                    p.k(layoutDirection, "<anonymous parameter 1>");
                    return Integer.valueOf(alignment.align(0, i10));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }
            }, null);
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&R\u001d\u0010\u000f\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lbn/r;", "arrange", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
    @Stable
    public interface Horizontal {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m364getSpacingD9Ej5fM(@NotNull Horizontal horizontal) {
                return Horizontal.super.getSpacing();
            }
        }

        void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float getSpacing() {
            return Dp.m3826constructorimpl(0);
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u001d\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Stable
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m366getSpacingD9Ej5fM(@NotNull HorizontalOrVertical horizontalOrVertical) {
                return HorizontalOrVertical.super.getSpacing();
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float getSpacing() {
            return Dp.m3826constructorimpl(0);
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Immutable
    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014ø\u0001\u0000¢\u0006\u0004\b*\u0010+J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0019\u0010\u0011\u001a\u00020\u000eHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00122\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003R \u0010\u0016\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R+\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010'R#\u0010(\u001a\u00020\u000e8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lbn/r;", "arrange", "", "toString", "Landroidx/compose/ui/unit/Dp;", "component1-D9Ej5fM", "()F", "component1", "", "component2", "Lkotlin/Function2;", "component3", "space", "rtlMirror", "alignment", "copy-8Feqmps", "(FZLsn/p;)Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "copy", "hashCode", "", "other", "equals", "F", "getSpace-D9Ej5fM", "Z", "getRtlMirror", "()Z", "Lsn/p;", "getAlignment", "()Lsn/p;", "spacing", "getSpacing-D9Ej5fM", "<init>", "(FZLsn/p;Ltn/i;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
    public static final /* data */ class SpacedAligned implements HorizontalOrVertical {

        @Nullable
        private final sn.p<Integer, LayoutDirection, Integer> alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        /* JADX WARN: Multi-variable type inference failed */
        private SpacedAligned(float f10, boolean z10, sn.p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            this.space = f10;
            this.rtlMirror = z10;
            this.alignment = pVar;
            this.spacing = f10;
        }

        public /* synthetic */ SpacedAligned(float f10, boolean z10, sn.p pVar, i iVar) {
            this(f10, z10, pVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-8Feqmps$default, reason: not valid java name */
        public static /* synthetic */ SpacedAligned m367copy8Feqmps$default(SpacedAligned spacedAligned, float f10, boolean z10, sn.p pVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = spacedAligned.space;
            }
            if ((i10 & 2) != 0) {
                z10 = spacedAligned.rtlMirror;
            }
            if ((i10 & 4) != 0) {
                pVar = spacedAligned.alignment;
            }
            return spacedAligned.m369copy8Feqmps(f10, z10, pVar);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            int i11;
            int iMin;
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(layoutDirection, "layoutDirection");
            p.k(iArr2, "outPositions");
            if (iArr.length == 0) {
                return;
            }
            int iMo300roundToPx0680j_4 = density.mo300roundToPx0680j_4(this.space);
            boolean z10 = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.INSTANCE;
            if (z10) {
                i11 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i12 = iArr[length];
                    int iMin2 = Math.min(i11, i10 - i12);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iMo300roundToPx0680j_4, (i10 - iMin2) - i12);
                    i11 = iArr2[length] + i12 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i13 = 0;
                i11 = 0;
                iMin = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr[i13];
                    int iMin3 = Math.min(i11, i10 - i15);
                    iArr2[i14] = iMin3;
                    int iMin4 = Math.min(iMo300roundToPx0680j_4, (i10 - iMin3) - i15);
                    int i16 = iArr2[i14] + i15 + iMin4;
                    i13++;
                    i14++;
                    iMin = iMin4;
                    i11 = i16;
                }
            }
            int i17 = i11 - iMin;
            sn.p<Integer, LayoutDirection, Integer> pVar = this.alignment;
            if (pVar == null || i17 >= i10) {
                return;
            }
            int iIntValue = pVar.mo2invoke(Integer.valueOf(i10 - i17), layoutDirection).intValue();
            int length3 = iArr2.length;
            for (int i18 = 0; i18 < length3; i18++) {
                iArr2[i18] = iArr2[i18] + iIntValue;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            p.k(density, "<this>");
            p.k(iArr, "sizes");
            p.k(iArr2, "outPositions");
            arrange(density, i10, iArr, LayoutDirection.Ltr, iArr2);
        }

        /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSpace() {
            return this.space;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        @Nullable
        public final sn.p<Integer, LayoutDirection, Integer> component3() {
            return this.alignment;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-8Feqmps, reason: not valid java name */
        public final SpacedAligned m369copy8Feqmps(float space, boolean rtlMirror, @Nullable sn.p<? super Integer, ? super LayoutDirection, Integer> alignment) {
            return new SpacedAligned(space, rtlMirror, alignment, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) other;
            return Dp.m3831equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && p.f(this.alignment, spacedAligned.alignment);
        }

        @Nullable
        public final sn.p<Integer, LayoutDirection, Integer> getAlignment() {
            return this.alignment;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        /* JADX INFO: renamed from: getSpace-D9Ej5fM, reason: not valid java name */
        public final float m370getSpaceD9Ej5fM() {
            return this.space;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public int hashCode() {
            int iM3832hashCodeimpl = Dp.m3832hashCodeimpl(this.space) * 31;
            boolean z10 = this.rtlMirror;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            int i10 = (iM3832hashCodeimpl + r12) * 31;
            sn.p<Integer, LayoutDirection, Integer> pVar = this.alignment;
            return i10 + (pVar == null ? 0 : pVar.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.rtlMirror ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) Dp.m3837toStringimpl(this.space));
            sb2.append(", ");
            sb2.append(this.alignment);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&R\u001d\u0010\r\u001a\u00020\n8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "outPositions", "Lbn/r;", "arrange", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
    @Stable
    public interface Vertical {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m372getSpacingD9Ej5fM(@NotNull Vertical vertical) {
                return Vertical.super.getSpacing();
            }
        }

        void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float getSpacing() {
            return Dp.m3826constructorimpl(0);
        }
    }

    private Arrangement() {
    }

    private final void forEachIndexed(int[] iArr, boolean z10, sn.p<? super Integer, ? super Integer, r> pVar) {
        if (!z10) {
            int length = iArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                pVar.mo2invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            } else {
                pVar.mo2invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            }
        }
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenter$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    @NotNull
    public final Horizontal aligned(@NotNull final Alignment.Horizontal alignment) {
        p.k(alignment, "alignment");
        return new SpacedAligned(Dp.m3826constructorimpl(0), true, new sn.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement.aligned.1
            {
                super(2);
            }

            @NotNull
            public final Integer invoke(int i10, @NotNull LayoutDirection layoutDirection) {
                p.k(layoutDirection, "layoutDirection");
                return Integer.valueOf(alignment.align(0, i10, layoutDirection));
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Integer mo2invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }
        }, null);
    }

    @Stable
    @NotNull
    public final Vertical aligned(@NotNull final Alignment.Vertical alignment) {
        p.k(alignment, "alignment");
        return new SpacedAligned(Dp.m3826constructorimpl(0), false, new sn.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement.aligned.2
            {
                super(2);
            }

            @NotNull
            public final Integer invoke(int i10, @NotNull LayoutDirection layoutDirection) {
                p.k(layoutDirection, "<anonymous parameter 1>");
                return Integer.valueOf(alignment.align(0, i10));
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Integer mo2invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }
        }, null);
    }

    @NotNull
    public final Vertical getBottom() {
        return Bottom;
    }

    @NotNull
    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    @NotNull
    public final Horizontal getEnd() {
        return End;
    }

    @NotNull
    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    @NotNull
    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    @NotNull
    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    @NotNull
    public final Horizontal getStart() {
        return Start;
    }

    @NotNull
    public final Vertical getTop() {
        return Top;
    }

    public final void placeCenter$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        p.k(size, "size");
        p.k(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float f10 = (totalSize - i11) / 2;
        if (!reverseInput) {
            int length = size.length;
            int i13 = 0;
            while (i10 < length) {
                int i14 = size[i10];
                outPosition[i13] = c.d(f10);
                f10 += i14;
                i10++;
                i13++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = size[length2];
            outPosition[length2] = c.d(f10);
            f10 += i15;
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(@NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        p.k(size, "size");
        p.k(outPosition, "outPosition");
        int i10 = 0;
        if (!reverseInput) {
            int length = size.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = size[i10];
                outPosition[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = size[length2];
            outPosition[length2] = i10;
            i10 += i14;
        }
    }

    public final void placeRightOrBottom$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        p.k(size, "size");
        p.k(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        int i13 = totalSize - i11;
        if (!reverseInput) {
            int length = size.length;
            int i14 = 0;
            while (i10 < length) {
                int i15 = size[i10];
                outPosition[i14] = i13;
                i13 += i15;
                i10++;
                i14++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = size[length2];
            outPosition[length2] = i13;
            i13 += i16;
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        p.k(size, "size");
        p.k(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = (size.length == 0) ^ true ? (totalSize - i11) / size.length : 0.0f;
        float f10 = length / 2;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = c.d(f10);
                f10 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = c.d(f10);
            f10 += i15 + length;
            i10++;
            i14++;
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        p.k(size, "size");
        p.k(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float f10 = 0.0f;
        float length = size.length > 1 ? (totalSize - i11) / (size.length - 1) : 0.0f;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = c.d(f10);
                f10 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = c.d(f10);
            f10 += i15 + length;
            i10++;
            i14++;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        p.k(size, "size");
        p.k(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = (totalSize - i11) / (size.length + 1);
        if (reverseInput) {
            float f10 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = c.d(f10);
                f10 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        float f11 = length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = c.d(f11);
            f11 += i15 + length;
            i10++;
            i14++;
        }
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final HorizontalOrVertical m356spacedBy0680j_4(float space) {
        return new SpacedAligned(space, true, new sn.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            @NotNull
            public final Integer invoke(int i10, @NotNull LayoutDirection layoutDirection) {
                p.k(layoutDirection, "layoutDirection");
                return Integer.valueOf(Alignment.INSTANCE.getStart().align(0, i10, layoutDirection));
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Integer mo2invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }
        }, null);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Horizontal m357spacedByD5KLDUw(float space, @NotNull final Alignment.Horizontal alignment) {
        p.k(alignment, "alignment");
        return new SpacedAligned(space, true, new sn.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            {
                super(2);
            }

            @NotNull
            public final Integer invoke(int i10, @NotNull LayoutDirection layoutDirection) {
                p.k(layoutDirection, "layoutDirection");
                return Integer.valueOf(alignment.align(0, i10, layoutDirection));
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Integer mo2invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }
        }, null);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Vertical m358spacedByD5KLDUw(float space, @NotNull final Alignment.Vertical alignment) {
        p.k(alignment, "alignment");
        return new SpacedAligned(space, false, new sn.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            {
                super(2);
            }

            @NotNull
            public final Integer invoke(int i10, @NotNull LayoutDirection layoutDirection) {
                p.k(layoutDirection, "<anonymous parameter 1>");
                return Integer.valueOf(alignment.align(0, i10));
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Integer mo2invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }
        }, null);
    }
}
