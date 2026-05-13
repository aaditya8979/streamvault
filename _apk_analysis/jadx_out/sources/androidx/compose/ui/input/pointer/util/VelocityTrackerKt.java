package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerInputChange;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004\u001a,\u0010\u000e\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "work", "kineticEnergyToVelocity", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "event", "Lbn/r;", "addPointerInputChange", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "", "degree", "Landroidx/compose/ui/input/pointer/util/PolynomialFit;", "polyFitLeastSquares", "AssumePointerMoveStoppedMilliseconds", "I", "HistorySize", "HorizonMilliseconds", "MinSampleSize", "DefaultWeight", "F", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static final int MinSampleSize = 3;

    public static final void addPointerInputChange(@NotNull VelocityTracker velocityTracker, @NotNull PointerInputChange pointerInputChange) {
        p.k(velocityTracker, "<this>");
        p.k(pointerInputChange, "event");
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        for (int i10 = 0; i10 < size; i10++) {
            HistoricalChange historicalChange = historical.get(i10);
            velocityTracker.m3087addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.getPosition());
        }
        velocityTracker.m3087addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float kineticEnergyToVelocity(float f10) {
        return Math.signum(f10) * ((float) Math.sqrt(2 * Math.abs(f10)));
    }

    @NotNull
    public static final PolynomialFit polyFitLeastSquares(@NotNull List<Float> list, @NotNull List<Float> list2, int i10) {
        float f10;
        p.k(list, VastAttributes.HORIZONTAL_POSITION);
        p.k(list2, VastAttributes.VERTICAL_POSITION);
        if (i10 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = i10 >= list.size() ? list.size() - 1 : i10;
        int i11 = i10 + 1;
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        while (true) {
            f10 = 0.0f;
            if (i12 >= i11) {
                break;
            }
            arrayList.add(Float.valueOf(0.0f));
            i12++;
        }
        int size2 = list.size();
        int i13 = size + 1;
        Matrix matrix = new Matrix(i13, size2);
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                break;
            }
            matrix.set(0, i14, 1.0f);
            for (int i15 = 1; i15 < i13; i15++) {
                matrix.set(i15, i14, matrix.get(i15 - 1, i14) * list.get(i14).floatValue());
            }
            i14++;
        }
        Matrix matrix2 = new Matrix(i13, size2);
        Matrix matrix3 = new Matrix(i13, i13);
        int i16 = 0;
        while (i16 < i13) {
            for (int i17 = 0; i17 < size2; i17++) {
                matrix2.set(i16, i17, matrix.get(i16, i17));
            }
            for (int i18 = 0; i18 < i16; i18++) {
                float fTimes = matrix2.getRow(i16).times(matrix2.getRow(i18));
                for (int i19 = 0; i19 < size2; i19++) {
                    matrix2.set(i16, i19, matrix2.get(i16, i19) - (matrix2.get(i18, i19) * fTimes));
                }
            }
            float fNorm = matrix2.getRow(i16).norm();
            if (fNorm < 1.0E-6d) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f11 = 1.0f / fNorm;
            for (int i20 = 0; i20 < size2; i20++) {
                matrix2.set(i16, i20, matrix2.get(i16, i20) * f11);
            }
            int i21 = 0;
            while (i21 < i13) {
                matrix3.set(i16, i21, i21 < i16 ? 0.0f : matrix2.getRow(i16).times(matrix.getRow(i21)));
                i21++;
            }
            i16++;
        }
        Vector vector = new Vector(size2);
        for (int i22 = 0; i22 < size2; i22++) {
            vector.set(i22, list2.get(i22).floatValue() * 1.0f);
        }
        int i23 = i13 - 1;
        for (int i24 = i23; -1 < i24; i24--) {
            arrayList.set(i24, Float.valueOf(matrix2.getRow(i24).times(vector)));
            int i25 = i24 + 1;
            if (i25 <= i23) {
                int i26 = i23;
                while (true) {
                    arrayList.set(i24, Float.valueOf(((Number) arrayList.get(i24)).floatValue() - (matrix3.get(i24, i26) * ((Number) arrayList.get(i26)).floatValue())));
                    if (i26 != i25) {
                        i26--;
                    }
                }
            }
            arrayList.set(i24, Float.valueOf(((Number) arrayList.get(i24)).floatValue() / matrix3.get(i24, i24)));
        }
        float fFloatValue = 0.0f;
        for (int i27 = 0; i27 < size2; i27++) {
            fFloatValue += list2.get(i27).floatValue();
        }
        float f12 = fFloatValue / size2;
        float f13 = 0.0f;
        for (int i28 = 0; i28 < size2; i28++) {
            float fFloatValue2 = list2.get(i28).floatValue() - ((Number) arrayList.get(0)).floatValue();
            float fFloatValue3 = 1.0f;
            for (int i29 = 1; i29 < i13; i29++) {
                fFloatValue3 *= list.get(i28).floatValue();
                fFloatValue2 -= ((Number) arrayList.get(i29)).floatValue() * fFloatValue3;
            }
            f13 += fFloatValue2 * 1.0f * fFloatValue2;
            float fFloatValue4 = list2.get(i28).floatValue() - f12;
            f10 += fFloatValue4 * 1.0f * fFloatValue4;
        }
        return new PolynomialFit(arrayList, f10 > 1.0E-6f ? 1.0f - (f13 / f10) : 1.0f);
    }
}
