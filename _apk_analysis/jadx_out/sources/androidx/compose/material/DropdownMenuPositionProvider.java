package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import bn.r;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013ø\u0001\u0000¢\u0006\u0004\b,\u0010-J5\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\rHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003JF\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R \u0010\u0016\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(R)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/ui/unit/DpOffset;", "component1-RKDOV3M", "()J", "component1", "Landroidx/compose/ui/unit/Density;", "component2", "Lkotlin/Function2;", "Lbn/r;", "component3", "contentOffset", "density", "onPositionCalculated", "copy-rOJDEFc", "(JLandroidx/compose/ui/unit/Density;Lsn/p;)Landroidx/compose/material/DropdownMenuPositionProvider;", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "J", "getContentOffset-RKDOV3M", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Lsn/p;", "getOnPositionCalculated", "()Lsn/p;", "<init>", "(JLandroidx/compose/ui/unit/Density;Lsn/p;Ltn/i;)V", "material_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {
    private final long contentOffset;

    @NotNull
    private final Density density;

    @NotNull
    private final p<IntRect, IntRect, r> onPositionCalculated;

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j10, Density density, p<? super IntRect, ? super IntRect, r> pVar) {
        this.contentOffset = j10;
        this.density = density;
        this.onPositionCalculated = pVar;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j10, Density density, p pVar, int i10, i iVar) {
        this(j10, density, (i10 & 4) != 0 ? new p<IntRect, IntRect, r>() { // from class: androidx.compose.material.DropdownMenuPositionProvider.1
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(IntRect intRect, IntRect intRect2) {
                invoke2(intRect, intRect2);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
                tn.p.k(intRect, "<anonymous parameter 0>");
                tn.p.k(intRect2, "<anonymous parameter 1>");
            }
        } : pVar, null);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j10, Density density, p pVar, i iVar) {
        this(j10, density, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-rOJDEFc$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m1028copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j10, Density density, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i10 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i10 & 4) != 0) {
            pVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m1030copyrOJDEFc(j10, density, pVar);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo773calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
        ao.i iVarS;
        Object obj;
        Object next;
        tn.p.k(anchorBounds, "anchorBounds");
        tn.p.k(layoutDirection, "layoutDirection");
        int iMo300roundToPx0680j_4 = this.density.mo300roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        int iMo300roundToPx0680j_42 = this.density.mo300roundToPx0680j_4(DpOffset.m3887getXD9Ej5fM(this.contentOffset));
        int iMo300roundToPx0680j_43 = this.density.mo300roundToPx0680j_4(DpOffset.m3889getYD9Ej5fM(this.contentOffset));
        int left = anchorBounds.getLeft() + iMo300roundToPx0680j_42;
        int right = (anchorBounds.getRight() - iMo300roundToPx0680j_42) - IntSize.m3986getWidthimpl(popupContentSize);
        int iM3986getWidthimpl = IntSize.m3986getWidthimpl(windowSize) - IntSize.m3986getWidthimpl(popupContentSize);
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(left);
            numArr[1] = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                iM3986getWidthimpl = 0;
            }
            numArr[2] = Integer.valueOf(iM3986getWidthimpl);
            iVarS = ao.r.s(numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(right);
            numArr2[1] = Integer.valueOf(left);
            if (anchorBounds.getRight() <= IntSize.m3986getWidthimpl(windowSize)) {
                iM3986getWidthimpl = 0;
            }
            numArr2[2] = Integer.valueOf(iM3986getWidthimpl);
            iVarS = ao.r.s(numArr2);
        }
        Iterator it = iVarS.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && iIntValue + IntSize.m3986getWidthimpl(popupContentSize) <= IntSize.m3986getWidthimpl(windowSize)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            right = num.intValue();
        }
        int iMax = Math.max(anchorBounds.getBottom() + iMo300roundToPx0680j_43, iMo300roundToPx0680j_4);
        int top2 = (anchorBounds.getTop() - iMo300roundToPx0680j_43) - IntSize.m3985getHeightimpl(popupContentSize);
        Iterator it2 = ao.r.s(Integer.valueOf(iMax), Integer.valueOf(top2), Integer.valueOf(anchorBounds.getTop() - (IntSize.m3985getHeightimpl(popupContentSize) / 2)), Integer.valueOf((IntSize.m3985getHeightimpl(windowSize) - IntSize.m3985getHeightimpl(popupContentSize)) - iMo300roundToPx0680j_4)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            int iIntValue2 = ((Number) next2).intValue();
            if (iIntValue2 >= iMo300roundToPx0680j_4 && iIntValue2 + IntSize.m3985getHeightimpl(popupContentSize) <= IntSize.m3985getHeightimpl(windowSize) - iMo300roundToPx0680j_4) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top2 = num2.intValue();
        }
        this.onPositionCalculated.mo2invoke(anchorBounds, new IntRect(right, top2, IntSize.m3986getWidthimpl(popupContentSize) + right, IntSize.m3985getHeightimpl(popupContentSize) + top2));
        return IntOffsetKt.IntOffset(right, top2);
    }

    /* JADX INFO: renamed from: component1-RKDOV3M, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final p<IntRect, IntRect, r> component3() {
        return this.onPositionCalculated;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-rOJDEFc, reason: not valid java name */
    public final DropdownMenuPositionProvider m1030copyrOJDEFc(long contentOffset, @NotNull Density density, @NotNull p<? super IntRect, ? super IntRect, r> onPositionCalculated) {
        tn.p.k(density, "density");
        tn.p.k(onPositionCalculated, "onPositionCalculated");
        return new DropdownMenuPositionProvider(contentOffset, density, onPositionCalculated, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return DpOffset.m3886equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && tn.p.f(this.density, dropdownMenuPositionProvider.density) && tn.p.f(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* JADX INFO: renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m1031getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final p<IntRect, IntRect, r> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return (((DpOffset.m3891hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    @NotNull
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m3894toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }
}
