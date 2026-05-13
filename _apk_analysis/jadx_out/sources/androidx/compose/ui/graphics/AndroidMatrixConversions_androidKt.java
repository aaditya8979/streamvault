package androidx.compose.ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AndroidMatrixConversions.android.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "Landroid/graphics/Matrix;", "matrix", "Lbn/r;", "setFrom-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "setFrom", "setFrom-EL8BTi8", "(Landroid/graphics/Matrix;[F)V", "ui-graphics_release"}, k = 2, mv = {1, 6, 0})
public final class AndroidMatrixConversions_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX INFO: renamed from: setFrom-EL8BTi8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1494setFromEL8BTi8(@org.jetbrains.annotations.NotNull android.graphics.Matrix r23, @org.jetbrains.annotations.NotNull float[] r24) {
        /*
            r0 = r24
            java.lang.String r1 = "$this$setFrom"
            r2 = r23
            tn.p.k(r2, r1)
            java.lang.String r1 = "matrix"
            tn.p.k(r0, r1)
            r1 = 2
            r3 = r0[r1]
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L1a
            r5 = r6
            goto L1b
        L1a:
            r5 = r7
        L1b:
            r8 = 8
            r9 = 6
            if (r5 == 0) goto L6e
            r5 = r0[r9]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L28
            r5 = r6
            goto L29
        L28:
            r5 = r7
        L29:
            if (r5 == 0) goto L6e
            r5 = 10
            r5 = r0[r5]
            r10 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L37
            r5 = r6
            goto L38
        L37:
            r5 = r7
        L38:
            if (r5 == 0) goto L6e
            r5 = 14
            r5 = r0[r5]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L44
            r5 = r6
            goto L45
        L44:
            r5 = r7
        L45:
            if (r5 == 0) goto L6e
            r5 = r0[r8]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = r6
            goto L50
        L4f:
            r5 = r7
        L50:
            if (r5 == 0) goto L6e
            r5 = 9
            r5 = r0[r5]
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L5c
            r5 = r6
            goto L5d
        L5c:
            r5 = r7
        L5d:
            if (r5 == 0) goto L6e
            r5 = 11
            r5 = r0[r5]
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L69
            r4 = r6
            goto L6a
        L69:
            r4 = r7
        L6a:
            if (r4 == 0) goto L6e
            r4 = r6
            goto L6f
        L6e:
            r4 = r7
        L6f:
            if (r4 == 0) goto Lba
            r4 = r0[r7]
            r5 = r0[r6]
            r10 = 3
            r11 = r0[r10]
            r12 = 4
            r13 = r0[r12]
            r14 = 5
            r15 = r0[r14]
            r16 = r0[r9]
            r17 = 7
            r18 = r0[r17]
            r19 = r0[r8]
            r20 = 12
            r20 = r0[r20]
            r21 = 13
            r21 = r0[r21]
            r22 = 15
            r22 = r0[r22]
            r0[r7] = r4
            r0[r6] = r13
            r0[r1] = r20
            r0[r10] = r5
            r0[r12] = r15
            r0[r14] = r21
            r0[r9] = r11
            r0[r17] = r18
            r0[r8] = r22
            r23.setValues(r24)
            r0[r7] = r4
            r0[r6] = r5
            r0[r1] = r3
            r0[r10] = r11
            r0[r12] = r13
            r0[r14] = r15
            r0[r9] = r16
            r0[r17] = r18
            r0[r8] = r19
            return
        Lba:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Android does not support arbitrary transforms"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m1494setFromEL8BTi8(android.graphics.Matrix, float[]):void");
    }

    /* JADX INFO: renamed from: setFrom-tU-YjHk, reason: not valid java name */
    public static final void m1495setFromtUYjHk(@NotNull float[] fArr, @NotNull android.graphics.Matrix matrix) {
        p.k(fArr, "$this$setFrom");
        p.k(matrix, "matrix");
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }
}
