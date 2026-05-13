package androidx.compose.foundation.layout;

import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import sn.l;
import sn.p;
import sn.q;
import sn.s;
import vn.c;
import zn.n;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aa\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0019\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001aj\u0010\"\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0002\u001a@\u0010$\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\u001aZ\u0010&\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\"\u001a\u0010*\u001a\u0004\u0018\u00010'*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u001a\u0010.\u001a\u00020+*\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u001a\u00102\u001a\u00020/*\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\"\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\"\u001a\u00105\u001a\u00020/*\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00101\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Lbn/r;", "arrangement", "Landroidx/compose/ui/unit/Dp;", "arrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisSize", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy-TDGSqEk", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lsn/s;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "MinIntrinsicWidthMeasureBlock", "MinIntrinsicHeightMeasureBlock", "MaxIntrinsicWidthMeasureBlock", "MaxIntrinsicHeightMeasureBlock", "children", "Lkotlin/Function2;", "intrinsicMainSize", "intrinsicCrossSize", "crossAxisAvailable", "mainAxisSpacing", "layoutOrientation", "intrinsicOrientation", "intrinsicSize", "mainAxisSize", "intrinsicMainAxisSize", "mainAxisAvailable", "intrinsicCrossAxisSize", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "data", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", ActivityChooserModel.ATTRIBUTE_WEIGHT, "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", VastAttributes.FILL_COLOR, "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 6, 0})
public final class RowColumnImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RowColumnParentData getData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar2, int i10, int i11) {
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        float f10 = 0.0f;
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i12);
            float weight = getWeight(getData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(pVar.mo2invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue(), i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pVar2.mo2invoke(intrinsicMeasurable, Integer.valueOf(iMin2)).intValue());
            } else if (weight > 0.0f) {
                f10 += weight;
            }
        }
        int iD = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : c.d(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i13);
            float weight2 = getWeight(getData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, pVar2.mo2invoke(intrinsicMeasurable2, Integer.valueOf(iD != Integer.MAX_VALUE ? c.d(iD * weight2) : Integer.MAX_VALUE)).intValue());
            }
        }
        return iMax;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, int i10, int i11) {
        int size = list.size();
        float f10 = 0.0f;
        int i12 = 0;
        int iMax = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= size) {
                return c.d(iMax * f10) + i13 + ((list.size() - 1) * i11);
            }
            IntrinsicMeasurable intrinsicMeasurable = list.get(i12);
            float weight = getWeight(getData(intrinsicMeasurable));
            int iIntValue = pVar.mo2invoke(intrinsicMeasurable, Integer.valueOf(i10)).intValue();
            if (weight == 0.0f) {
                i13 += iIntValue;
            } else if (weight > 0.0f) {
                f10 += weight;
                iMax = Math.max(iMax, c.d(iIntValue / weight));
            }
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar2, int i10, int i11, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        return layoutOrientation == layoutOrientation2 ? intrinsicMainAxisSize(list, pVar, i10, i11) : intrinsicCrossAxisSize(list, pVar2, pVar, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: rowColumnMeasurePolicy-TDGSqEk, reason: not valid java name */
    public static final MeasurePolicy m432rowColumnMeasurePolicyTDGSqEk(@NotNull final LayoutOrientation layoutOrientation, @NotNull final s<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], r> sVar, final float f10, @NotNull final SizeMode sizeMode, @NotNull final CrossAxisAlignment crossAxisAlignment) {
        tn.p.k(layoutOrientation, "orientation");
        tn.p.k(sVar, "arrangement");
        tn.p.k(sizeMode, "crossAxisSize");
        tn.p.k(crossAxisAlignment, "crossAxisAlignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                tn.p.k(intrinsicMeasureScope, "<this>");
                tn.p.k(list, "measurables");
                return ((Number) RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo300roundToPx0680j_4(f10)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                tn.p.k(intrinsicMeasureScope, "<this>");
                tn.p.k(list, "measurables");
                return ((Number) RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo300roundToPx0680j_4(f10)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo6measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull final List<? extends Measurable> list, long j10) {
                int iMax;
                int iJ;
                float f11;
                int i10;
                int i11;
                int iMax2;
                int i12;
                int i13;
                RowColumnParentData[] rowColumnParentDataArr;
                List<? extends Measurable> list2 = list;
                tn.p.k(measureScope, "$this$measure");
                tn.p.k(list2, "measurables");
                OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j10, layoutOrientation, null);
                int iMo300roundToPx0680j_4 = measureScope.mo300roundToPx0680j_4(f10);
                int size = list.size();
                final Placeable[] placeableArr = new Placeable[size];
                int size2 = list.size();
                RowColumnParentData[] rowColumnParentDataArr2 = new RowColumnParentData[size2];
                for (int i14 = 0; i14 < size2; i14++) {
                    rowColumnParentDataArr2[i14] = RowColumnImplKt.getData(list2.get(i14));
                }
                int size3 = list.size();
                int i15 = 0;
                int iMax3 = 0;
                int i16 = 0;
                int i17 = 0;
                int iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize = 0;
                boolean z10 = false;
                float f12 = 0.0f;
                while (true) {
                    if (i16 >= size3) {
                        break;
                    }
                    Measurable measurable = list2.get(i16);
                    RowColumnParentData rowColumnParentData = rowColumnParentDataArr2[i16];
                    float weight = RowColumnImplKt.getWeight(rowColumnParentData);
                    if (weight > 0.0f) {
                        f12 += weight;
                        i17++;
                        i12 = i16;
                        i13 = size3;
                        rowColumnParentDataArr = rowColumnParentDataArr2;
                    } else {
                        int mainAxisMax = orientationIndependentConstraints.getMainAxisMax();
                        i12 = i16;
                        i13 = size3;
                        rowColumnParentDataArr = rowColumnParentDataArr2;
                        Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, mainAxisMax != Integer.MAX_VALUE ? mainAxisMax - iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize : Integer.MAX_VALUE, 0, 0, 8, null).m403toBoxConstraintsOenEA2s(layoutOrientation));
                        int iMin = Math.min(iMo300roundToPx0680j_4, (mainAxisMax - iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize) - RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeableMo3112measureBRTryo0, layoutOrientation));
                        iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize += RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeableMo3112measureBRTryo0, layoutOrientation) + iMin;
                        iMax3 = Math.max(iMax3, RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeableMo3112measureBRTryo0, layoutOrientation));
                        boolean z11 = z10 || RowColumnImplKt.isRelative(rowColumnParentData);
                        placeableArr[i12] = placeableMo3112measureBRTryo0;
                        i15 = iMin;
                        z10 = z11;
                    }
                    i16 = i12 + 1;
                    size3 = i13;
                    rowColumnParentDataArr2 = rowColumnParentDataArr;
                }
                int i18 = iMax3;
                final RowColumnParentData[] rowColumnParentDataArr3 = rowColumnParentDataArr2;
                if (i17 == 0) {
                    iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize -= i15;
                    iMax = i18;
                    iJ = 0;
                } else {
                    int i19 = iMo300roundToPx0680j_4 * (i17 - 1);
                    int mainAxisMin = (((f12 <= 0.0f || orientationIndependentConstraints.getMainAxisMax() == Integer.MAX_VALUE) ? orientationIndependentConstraints.getMainAxisMin() : orientationIndependentConstraints.getMainAxisMax()) - iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize) - i19;
                    float f13 = f12 > 0.0f ? mainAxisMin / f12 : 0.0f;
                    int iD = 0;
                    for (int i20 = 0; i20 < size2; i20++) {
                        iD += c.d(RowColumnImplKt.getWeight(rowColumnParentDataArr3[i20]) * f13);
                    }
                    int size4 = list.size();
                    int i21 = mainAxisMin - iD;
                    iMax = i18;
                    int i22 = 0;
                    int iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize2 = 0;
                    while (i22 < size4) {
                        if (placeableArr[i22] == null) {
                            Measurable measurable2 = list2.get(i22);
                            RowColumnParentData rowColumnParentData2 = rowColumnParentDataArr3[i22];
                            float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                            if (!(weight2 > 0.0f)) {
                                throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                            }
                            int iA = c.a(i21);
                            int i23 = i21 - iA;
                            int iMax4 = Math.max(0, c.d(weight2 * f13) + iA);
                            f11 = f13;
                            if (!RowColumnImplKt.getFill(rowColumnParentData2) || iMax4 == Integer.MAX_VALUE) {
                                i10 = size4;
                                i11 = 0;
                            } else {
                                i11 = iMax4;
                                i10 = size4;
                            }
                            Placeable placeableMo3112measureBRTryo02 = measurable2.mo3112measureBRTryo0(new OrientationIndependentConstraints(i11, iMax4, 0, orientationIndependentConstraints.getCrossAxisMax()).m403toBoxConstraintsOenEA2s(layoutOrientation));
                            iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize2 += RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeableMo3112measureBRTryo02, layoutOrientation);
                            iMax = Math.max(iMax, RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeableMo3112measureBRTryo02, layoutOrientation));
                            boolean z12 = z10 || RowColumnImplKt.isRelative(rowColumnParentData2);
                            placeableArr[i22] = placeableMo3112measureBRTryo02;
                            z10 = z12;
                            i21 = i23;
                        } else {
                            f11 = f13;
                            i10 = size4;
                        }
                        i22++;
                        list2 = list;
                        f13 = f11;
                        size4 = i10;
                    }
                    iJ = n.j(iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize2 + i19, orientationIndependentConstraints.getMainAxisMax() - iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize);
                }
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                if (z10) {
                    iMax2 = 0;
                    for (int i24 = 0; i24 < size; i24++) {
                        Placeable placeable = placeableArr[i24];
                        tn.p.h(placeable);
                        CrossAxisAlignment crossAxisAlignment2 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr3[i24]);
                        Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment2 != null ? crossAxisAlignment2.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                        if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                            int i25 = ref$IntRef.element;
                            int iIntValue = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                            if (iIntValue == Integer.MIN_VALUE) {
                                iIntValue = 0;
                            }
                            ref$IntRef.element = Math.max(i25, iIntValue);
                            int iRowColumnMeasurePolicy_TDGSqEk$crossAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, layoutOrientation);
                            LayoutOrientation layoutOrientation2 = layoutOrientation;
                            int iIntValue2 = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                            if (iIntValue2 == Integer.MIN_VALUE) {
                                iIntValue2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, layoutOrientation2);
                            }
                            iMax2 = Math.max(iMax2, iRowColumnMeasurePolicy_TDGSqEk$crossAxisSize - iIntValue2);
                        }
                    }
                } else {
                    iMax2 = 0;
                }
                final int iMax5 = Math.max(iRowColumnMeasurePolicy_TDGSqEk$mainAxisSize + iJ, orientationIndependentConstraints.getMainAxisMin());
                final int iMax6 = (orientationIndependentConstraints.getCrossAxisMax() == Integer.MAX_VALUE || sizeMode != SizeMode.Expand) ? Math.max(iMax, Math.max(orientationIndependentConstraints.getCrossAxisMin(), ref$IntRef.element + iMax2)) : orientationIndependentConstraints.getCrossAxisMax();
                LayoutOrientation layoutOrientation3 = layoutOrientation;
                LayoutOrientation layoutOrientation4 = LayoutOrientation.Horizontal;
                int i26 = layoutOrientation3 == layoutOrientation4 ? iMax5 : iMax6;
                int i27 = layoutOrientation3 == layoutOrientation4 ? iMax6 : iMax5;
                int size5 = list.size();
                final int[] iArr = new int[size5];
                for (int i28 = 0; i28 < size5; i28++) {
                    iArr[i28] = 0;
                }
                final s<Integer, int[], LayoutDirection, Density, int[], r> sVar2 = sVar;
                final LayoutOrientation layoutOrientation5 = layoutOrientation;
                final CrossAxisAlignment crossAxisAlignment3 = crossAxisAlignment;
                return MeasureScope.layout$default(measureScope, i26, i27, null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                        int[] iArr2;
                        int i29;
                        tn.p.k(placementScope, "$this$layout");
                        int size6 = list.size();
                        int[] iArr3 = new int[size6];
                        int i30 = 0;
                        for (int i31 = 0; i31 < size6; i31++) {
                            Placeable placeable2 = placeableArr[i31];
                            tn.p.h(placeable2);
                            iArr3[i31] = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeable2, layoutOrientation5);
                        }
                        sVar2.invoke(Integer.valueOf(iMax5), iArr3, measureScope.getLayoutDirection(), measureScope, iArr);
                        Placeable[] placeableArr2 = placeableArr;
                        RowColumnParentData[] rowColumnParentDataArr4 = rowColumnParentDataArr3;
                        CrossAxisAlignment crossAxisAlignment4 = crossAxisAlignment3;
                        int i32 = iMax6;
                        LayoutOrientation layoutOrientation6 = layoutOrientation5;
                        MeasureScope measureScope2 = measureScope;
                        Ref$IntRef ref$IntRef2 = ref$IntRef;
                        int[] iArr4 = iArr;
                        int length = placeableArr2.length;
                        int i33 = 0;
                        while (i30 < length) {
                            Placeable placeable3 = placeableArr2[i30];
                            int i34 = i33 + 1;
                            tn.p.h(placeable3);
                            CrossAxisAlignment crossAxisAlignment5 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr4[i33]);
                            if (crossAxisAlignment5 == null) {
                                crossAxisAlignment5 = crossAxisAlignment4;
                            }
                            int iRowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 = i32 - RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable3, layoutOrientation6);
                            LayoutOrientation layoutOrientation7 = LayoutOrientation.Horizontal;
                            Placeable[] placeableArr3 = placeableArr2;
                            int i35 = length;
                            int iAlign$foundation_layout_release = crossAxisAlignment5.align$foundation_layout_release(iRowColumnMeasurePolicy_TDGSqEk$crossAxisSize2, layoutOrientation6 == layoutOrientation7 ? LayoutDirection.Ltr : measureScope2.getLayoutDirection(), placeable3, ref$IntRef2.element);
                            if (layoutOrientation6 == layoutOrientation7) {
                                iArr2 = iArr4;
                                i29 = i30;
                                Placeable.PlacementScope.place$default(placementScope, placeable3, iArr4[i33], iAlign$foundation_layout_release, 0.0f, 4, null);
                            } else {
                                iArr2 = iArr4;
                                i29 = i30;
                                Placeable.PlacementScope.place$default(placementScope, placeable3, iAlign$foundation_layout_release, iArr2[i33], 0.0f, 4, null);
                            }
                            i30 = i29 + 1;
                            i33 = i34;
                            length = i35;
                            placeableArr2 = placeableArr3;
                            iArr4 = iArr2;
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                tn.p.k(intrinsicMeasureScope, "<this>");
                tn.p.k(list, "measurables");
                return ((Number) RowColumnImplKt.MinIntrinsicHeightMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo300roundToPx0680j_4(f10)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                tn.p.k(intrinsicMeasureScope, "<this>");
                tn.p.k(list, "measurables");
                return ((Number) RowColumnImplKt.MinIntrinsicWidthMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo300roundToPx0680j_4(f10)))).intValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }
}
