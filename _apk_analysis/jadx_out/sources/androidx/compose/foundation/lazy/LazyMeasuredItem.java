package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import cn.r;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: LazyMeasuredItem.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B~\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\tR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\tR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\tR\u001d\u0010$\u001a\u00020#8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000bR\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b-\u0010\u000bR\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b/\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "", "", TypedValues.CycleType.S_WAVE_OFFSET, "layoutWidth", "layoutHeight", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", C3978d4.i.L, "index", "I", "getIndex", "()I", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "[Landroidx/compose/ui/layout/Placeable;", "", "isVertical", "Z", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "reverseLayout", "beforeContentPadding", "afterContentPadding", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "spacing", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "J", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "size", "getSize", "sizeWithSpacings", "getSizeWithSpacings", "crossAxisSize", "getCrossAxisSize", "<init>", "(I[Landroidx/compose/ui/layout/Placeable;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIILandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;IJLjava/lang/Object;Ltn/i;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyMeasuredItem {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final int crossAxisSize;

    @Nullable
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final Object key;

    @NotNull
    private final LayoutDirection layoutDirection;

    @NotNull
    private final Placeable[] placeables;

    @NotNull
    private final LazyListItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int size;
    private final int sizeWithSpacings;
    private final int spacing;

    @Nullable
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    private LazyMeasuredItem(int i10, Placeable[] placeableArr, boolean z10, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z11, int i11, int i12, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i13, long j10, Object obj) {
        this.index = i10;
        this.placeables = placeableArr;
        this.isVertical = z10;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z11;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.spacing = i13;
        this.visualOffset = j10;
        this.key = obj;
        int height = 0;
        int iMax = 0;
        for (Placeable placeable : placeableArr) {
            height += this.isVertical ? placeable.getHeight() : placeable.getWidth();
            iMax = Math.max(iMax, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = height;
        this.sizeWithSpacings = height + this.spacing;
        this.crossAxisSize = iMax;
    }

    @ExperimentalFoundationApi
    public /* synthetic */ LazyMeasuredItem(int i10, Placeable[] placeableArr, boolean z10, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z11, int i11, int i12, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i13, long j10, Object obj, i iVar) {
        this(i10, placeableArr, z10, horizontal, vertical, layoutDirection, z11, i11, i12, lazyListItemPlacementAnimator, i13, j10, obj);
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Object getKey() {
        return this.key;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    @NotNull
    public final LazyListPositionedItem position(int offset, int layoutWidth, int layoutHeight) {
        long jIntOffset;
        ArrayList arrayList = new ArrayList();
        int i10 = this.isVertical ? layoutHeight : layoutWidth;
        boolean z10 = this.reverseLayout;
        int height = z10 ? (i10 - offset) - this.size : offset;
        int iC0 = z10 ? r.c0(this.placeables) : 0;
        while (true) {
            boolean z11 = this.reverseLayout;
            boolean z12 = true;
            if (!z11 ? iC0 >= this.placeables.length : iC0 < 0) {
                z12 = false;
            }
            if (!z12) {
                return new LazyListPositionedItem(offset, this.index, this.key, this.size, this.sizeWithSpacings, -(!z11 ? this.beforeContentPadding : this.afterContentPadding), i10 + (!z11 ? this.afterContentPadding : this.beforeContentPadding), this.isVertical, arrayList, this.placementAnimator, this.visualOffset, null);
            }
            Placeable placeable = this.placeables[iC0];
            int size = z11 ? 0 : arrayList.size();
            if (this.isVertical) {
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                jIntOffset = IntOffsetKt.IntOffset(horizontal.align(placeable.getWidth(), layoutWidth, this.layoutDirection), height);
            } else {
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                jIntOffset = IntOffsetKt.IntOffset(height, vertical.align(placeable.getHeight(), layoutHeight));
            }
            long j10 = jIntOffset;
            height += this.isVertical ? placeable.getHeight() : placeable.getWidth();
            arrayList.add(size, new LazyListPlaceableWrapper(j10, placeable, this.placeables[iC0].getParentData(), null));
            iC0 = this.reverseLayout ? iC0 - 1 : iC0 + 1;
        }
    }
}
