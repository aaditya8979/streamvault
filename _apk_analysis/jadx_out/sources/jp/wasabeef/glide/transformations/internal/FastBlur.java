package jp.wasabeef.glide.transformations.internal;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class FastBlur {
    public static Bitmap blur(Bitmap bitmap, int i10, boolean z10) {
        int[] iArr;
        int i11 = i10;
        Bitmap bitmapCopy = z10 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i11 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i12 = width * height;
        int[] iArr2 = new int[i12];
        bitmapCopy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i13 = width - 1;
        int i14 = height - 1;
        int i15 = i11 + i11 + 1;
        int[] iArr3 = new int[i12];
        int[] iArr4 = new int[i12];
        int[] iArr5 = new int[i12];
        int[] iArr6 = new int[Math.max(width, height)];
        int i16 = (i15 + 1) >> 1;
        int i17 = i16 * i16;
        int i18 = i17 * 256;
        int[] iArr7 = new int[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            iArr7[i19] = i19 / i17;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i15, 3);
        int i20 = i11 + 1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < height) {
            Bitmap bitmap2 = bitmapCopy;
            int i24 = height;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = -i11;
            int i34 = 0;
            while (i33 <= i11) {
                int i35 = i14;
                int[] iArr9 = iArr6;
                int i36 = iArr2[i22 + Math.min(i13, Math.max(i33, 0))];
                int[] iArr10 = iArr8[i33 + i11];
                iArr10[0] = (i36 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr10[1] = (i36 & 65280) >> 8;
                iArr10[2] = i36 & 255;
                int iAbs = i20 - Math.abs(i33);
                int i37 = iArr10[0];
                i34 += i37 * iAbs;
                int i38 = iArr10[1];
                i25 += i38 * iAbs;
                int i39 = iArr10[2];
                i26 += iAbs * i39;
                if (i33 > 0) {
                    i30 += i37;
                    i31 += i38;
                    i32 += i39;
                } else {
                    i27 += i37;
                    i28 += i38;
                    i29 += i39;
                }
                i33++;
                i14 = i35;
                iArr6 = iArr9;
            }
            int i40 = i14;
            int[] iArr11 = iArr6;
            int i41 = i11;
            int i42 = i34;
            int i43 = 0;
            while (i43 < width) {
                iArr3[i22] = iArr7[i42];
                iArr4[i22] = iArr7[i25];
                iArr5[i22] = iArr7[i26];
                int i44 = i42 - i27;
                int i45 = i25 - i28;
                int i46 = i26 - i29;
                int[] iArr12 = iArr8[((i41 - i11) + i15) % i15];
                int i47 = i27 - iArr12[0];
                int i48 = i28 - iArr12[1];
                int i49 = i29 - iArr12[2];
                if (i21 == 0) {
                    iArr = iArr7;
                    iArr11[i43] = Math.min(i43 + i11 + 1, i13);
                } else {
                    iArr = iArr7;
                }
                int i50 = iArr2[i23 + iArr11[i43]];
                int i51 = (i50 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr12[0] = i51;
                int i52 = (i50 & 65280) >> 8;
                iArr12[1] = i52;
                int i53 = i50 & 255;
                iArr12[2] = i53;
                int i54 = i30 + i51;
                int i55 = i31 + i52;
                int i56 = i32 + i53;
                i42 = i44 + i54;
                i25 = i45 + i55;
                i26 = i46 + i56;
                i41 = (i41 + 1) % i15;
                int[] iArr13 = iArr8[i41 % i15];
                int i57 = iArr13[0];
                i27 = i47 + i57;
                int i58 = iArr13[1];
                i28 = i48 + i58;
                int i59 = iArr13[2];
                i29 = i49 + i59;
                i30 = i54 - i57;
                i31 = i55 - i58;
                i32 = i56 - i59;
                i22++;
                i43++;
                iArr7 = iArr;
            }
            i23 += width;
            i21++;
            bitmapCopy = bitmap2;
            height = i24;
            i14 = i40;
            iArr6 = iArr11;
        }
        Bitmap bitmap3 = bitmapCopy;
        int i60 = i14;
        int[] iArr14 = iArr6;
        int i61 = height;
        int[] iArr15 = iArr7;
        int i62 = 0;
        while (i62 < width) {
            int i63 = -i11;
            int i64 = i15;
            int[] iArr16 = iArr2;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = 0;
            int i72 = i63;
            int i73 = i63 * width;
            int i74 = 0;
            int i75 = 0;
            while (i72 <= i11) {
                int i76 = width;
                int iMax = Math.max(0, i73) + i62;
                int[] iArr17 = iArr8[i72 + i11];
                iArr17[0] = iArr3[iMax];
                iArr17[1] = iArr4[iMax];
                iArr17[2] = iArr5[iMax];
                int iAbs2 = i20 - Math.abs(i72);
                i74 += iArr3[iMax] * iAbs2;
                i75 += iArr4[iMax] * iAbs2;
                i65 += iArr5[iMax] * iAbs2;
                if (i72 > 0) {
                    i69 += iArr17[0];
                    i70 += iArr17[1];
                    i71 += iArr17[2];
                } else {
                    i66 += iArr17[0];
                    i67 += iArr17[1];
                    i68 += iArr17[2];
                }
                int i77 = i60;
                if (i72 < i77) {
                    i73 += i76;
                }
                i72++;
                i60 = i77;
                width = i76;
            }
            int i78 = width;
            int i79 = i60;
            int i80 = i11;
            int i81 = i62;
            int i82 = i75;
            int i83 = i61;
            int i84 = i74;
            int i85 = 0;
            while (i85 < i83) {
                iArr16[i81] = (iArr16[i81] & ViewCompat.MEASURED_STATE_MASK) | (iArr15[i84] << 16) | (iArr15[i82] << 8) | iArr15[i65];
                int i86 = i84 - i66;
                int i87 = i82 - i67;
                int i88 = i65 - i68;
                int[] iArr18 = iArr8[((i80 - i11) + i64) % i64];
                int i89 = i66 - iArr18[0];
                int i90 = i67 - iArr18[1];
                int i91 = i68 - iArr18[2];
                if (i62 == 0) {
                    iArr14[i85] = Math.min(i85 + i20, i79) * i78;
                }
                int i92 = iArr14[i85] + i62;
                int i93 = iArr3[i92];
                iArr18[0] = i93;
                int i94 = iArr4[i92];
                iArr18[1] = i94;
                int i95 = iArr5[i92];
                iArr18[2] = i95;
                int i96 = i69 + i93;
                int i97 = i70 + i94;
                int i98 = i71 + i95;
                i84 = i86 + i96;
                i82 = i87 + i97;
                i65 = i88 + i98;
                i80 = (i80 + 1) % i64;
                int[] iArr19 = iArr8[i80];
                int i99 = iArr19[0];
                i66 = i89 + i99;
                int i100 = iArr19[1];
                i67 = i90 + i100;
                int i101 = iArr19[2];
                i68 = i91 + i101;
                i69 = i96 - i99;
                i70 = i97 - i100;
                i71 = i98 - i101;
                i81 += i78;
                i85++;
                i11 = i10;
            }
            i62++;
            i11 = i10;
            i60 = i79;
            i61 = i83;
            i15 = i64;
            iArr2 = iArr16;
            width = i78;
        }
        int i102 = width;
        bitmap3.setPixels(iArr2, 0, i102, 0, 0, i102, i61);
        return bitmap3;
    }
}
