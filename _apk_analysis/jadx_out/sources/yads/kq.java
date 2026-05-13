package yads;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class kq {
    public static Bitmap a(Bitmap bitmap, double d10) {
        int i10;
        int[] iArr;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, vn.c.c(((double) bitmap.getWidth()) * d10), vn.c.c(((double) bitmap.getHeight()) * d10), false);
        int i11 = 1;
        Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(bitmapCreateScaledBitmap.getConfig(), true);
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i12 = width * height;
        int[] iArr2 = new int[i12];
        bitmapCopy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i13 = width - 1;
        int i14 = height - 1;
        int[] iArr3 = new int[i12];
        int[] iArr4 = new int[i12];
        int[] iArr5 = new int[i12];
        int[] iArr6 = new int[zn.n.e(width, height)];
        int[] iArr7 = new int[1024];
        for (int i15 = 0; i15 < 1024; i15++) {
            iArr7[i15] = i15 / 4;
        }
        int[][] iArr8 = new int[3][];
        for (int i16 = 0; i16 < 3; i16++) {
            iArr8[i16] = new int[3];
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < height) {
            int i20 = -1;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i20 <= i11) {
                Bitmap bitmap2 = bitmapCopy;
                int i30 = iArr2[zn.n.j(i13, zn.n.e(i20, 0)) + i18];
                int i31 = i20 + 1;
                int[] iArr9 = iArr8[i31];
                iArr9[0] = (i30 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr9[1] = (i30 & 65280) >> 8;
                iArr9[2] = i30 & 255;
                int iAbs = 2 - StrictMath.abs(i20);
                int i32 = iArr9[0];
                i21 = (i32 * iAbs) + i21;
                int i33 = iArr9[1];
                i22 = (i33 * iAbs) + i22;
                int i34 = iArr9[2];
                i23 = (iAbs * i34) + i23;
                if (i20 > 0) {
                    i29 += i32;
                    i28 += i33;
                    i27 += i34;
                } else {
                    i26 += i32;
                    i25 += i33;
                    i24 += i34;
                }
                bitmapCopy = bitmap2;
                i20 = i31;
                i11 = 1;
            }
            Bitmap bitmap3 = bitmapCopy;
            int i35 = 0;
            int i36 = 1;
            while (i35 < width) {
                iArr3[i18] = iArr7[i21];
                iArr4[i18] = iArr7[i22];
                iArr5[i18] = iArr7[i23];
                int i37 = i21 - i26;
                int i38 = i22 - i25;
                int i39 = i23 - i24;
                int[] iArr10 = iArr8[(i36 + 2) % 3];
                int i40 = i26 - iArr10[0];
                int i41 = i25 - iArr10[1];
                int i42 = i24 - iArr10[2];
                if (i17 == 0) {
                    iArr = iArr7;
                    iArr6[i35] = Math.min(i35 + 2, i13);
                } else {
                    iArr = iArr7;
                }
                int i43 = iArr2[i19 + iArr6[i35]];
                int i44 = (i43 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr10[0] = i44;
                int i45 = (i43 & 65280) >> 8;
                iArr10[1] = i45;
                int i46 = i43 & 255;
                iArr10[2] = i46;
                int i47 = i29 + i44;
                int i48 = i28 + i45;
                int i49 = i27 + i46;
                i21 = i37 + i47;
                i22 = i38 + i48;
                i23 = i39 + i49;
                i36 = (i36 + 1) % 3;
                int[] iArr11 = iArr8[i36 % 3];
                int i50 = iArr11[0];
                i26 = i40 + i50;
                int i51 = iArr11[1];
                i25 = i41 + i51;
                int i52 = iArr11[2];
                i24 = i42 + i52;
                i29 = i47 - i50;
                i28 = i48 - i51;
                i27 = i49 - i52;
                i18++;
                i35++;
                iArr7 = iArr;
            }
            i19 += width;
            i17++;
            bitmapCopy = bitmap3;
            i11 = 1;
        }
        Bitmap bitmap4 = bitmapCopy;
        int[] iArr12 = iArr7;
        int i53 = 0;
        while (i53 < width) {
            int[] iArr13 = iArr6;
            int i54 = height;
            int[] iArr14 = iArr2;
            int i55 = -1;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = width * (-1);
            int i65 = 0;
            for (int i66 = 1; i55 <= i66; i66 = 1) {
                int iMax = Math.max(0, i64) + i53;
                int i67 = i55 + 1;
                int[] iArr15 = iArr8[i67];
                iArr15[0] = iArr3[iMax];
                iArr15[1] = iArr4[iMax];
                iArr15[2] = iArr5[iMax];
                int iAbs2 = 2 - StrictMath.abs(i55);
                i65 = (iArr3[iMax] * iAbs2) + i65;
                i56 = (iArr4[iMax] * iAbs2) + i56;
                i57 = (iArr5[iMax] * iAbs2) + i57;
                if (i55 > 0) {
                    i63 += iArr15[0];
                    i62 += iArr15[1];
                    i61 += iArr15[2];
                } else {
                    i60 += iArr15[0];
                    i59 += iArr15[1];
                    i58 += iArr15[2];
                }
                if (i55 < i14) {
                    i64 += width;
                }
                i55 = i67;
            }
            int i68 = i53;
            int i69 = i57;
            int i70 = i54;
            int i71 = 0;
            int i72 = 1;
            while (i71 < i70) {
                iArr14[i68] = (iArr14[i68] & ViewCompat.MEASURED_STATE_MASK) | (iArr12[i65] << 16) | (iArr12[i56] << 8) | iArr12[i69];
                int i73 = i65 - i60;
                int i74 = i56 - i59;
                int i75 = i69 - i58;
                int[] iArr16 = iArr8[(i72 + 2) % 3];
                int i76 = i60 - iArr16[0];
                int i77 = i59 - iArr16[1];
                int i78 = i58 - iArr16[2];
                if (i53 == 0) {
                    i10 = i70;
                    iArr13[i71] = Math.min(i71 + 2, i14) * width;
                } else {
                    i10 = i70;
                }
                int i79 = iArr13[i71] + i53;
                int i80 = iArr3[i79];
                iArr16[0] = i80;
                int i81 = iArr4[i79];
                iArr16[1] = i81;
                int i82 = iArr5[i79];
                iArr16[2] = i82;
                int i83 = i63 + i80;
                int i84 = i62 + i81;
                int i85 = i61 + i82;
                i65 = i73 + i83;
                i56 = i74 + i84;
                i69 = i75 + i85;
                i72 = (i72 + 1) % 3;
                int[] iArr17 = iArr8[i72];
                int i86 = iArr17[0];
                i60 = i76 + i86;
                int i87 = iArr17[1];
                i59 = i77 + i87;
                int i88 = iArr17[2];
                i58 = i78 + i88;
                i63 = i83 - i86;
                i62 = i84 - i87;
                i61 = i85 - i88;
                i68 += width;
                i71++;
                i70 = i10;
            }
            i53++;
            iArr6 = iArr13;
            iArr2 = iArr14;
            height = i70;
        }
        bitmap4.setPixels(iArr2, 0, width, 0, 0, width, height);
        return bitmap4;
    }
}
