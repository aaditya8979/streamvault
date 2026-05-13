package com.bytedance.sdk.component.fkw.fkw;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.bytedance.sdk.component.fkw.zih;

/* JADX INFO: loaded from: classes11.dex */
public final class fkw extends ouw {
    private byte[] ouw;
    private com.bytedance.sdk.component.fkw.le vt;

    public fkw(byte[] bArr, com.bytedance.sdk.component.fkw.le leVar) {
        this.ouw = bArr;
        this.vt = leVar;
    }

    private void ouw(String str, Throwable th2, com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        if (this.vt == null) {
            lhVar.ouw(new cf());
        } else {
            lhVar.ouw(new pno(1002, str, th2));
        }
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "decode";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        Bitmap bitmapDecodeByteArray;
        com.bytedance.sdk.component.fkw.lh.le leVar = lhVar.jqy;
        ImageView.ScaleType scaleType = lhVar.fkw;
        if (scaleType == null) {
            scaleType = com.bytedance.sdk.component.fkw.lh.vt.ouw.ouw;
        }
        ImageView.ScaleType scaleType2 = scaleType;
        Bitmap.Config config = lhVar.f12539le;
        if (config == null) {
            config = com.bytedance.sdk.component.fkw.lh.vt.ouw.vt;
        }
        com.bytedance.sdk.component.fkw.lh.vt.ouw ouwVar = new com.bytedance.sdk.component.fkw.lh.vt.ouw(lhVar.f12543ra, lhVar.pno, scaleType2, config, lhVar.ksc, lhVar.jae);
        try {
            byte[] bArr = this.ouw;
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (ouwVar.yu == 0 && ouwVar.fkw == 0) {
                options.inPreferredConfig = ouwVar.f12581lh;
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            } else {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i10 = options.outWidth;
                int i11 = options.outHeight;
                int iOuw = com.bytedance.sdk.component.fkw.lh.vt.ouw.ouw(ouwVar.yu, ouwVar.fkw, i10, i11, ouwVar.pno);
                int iOuw2 = com.bytedance.sdk.component.fkw.lh.vt.ouw.ouw(ouwVar.fkw, ouwVar.yu, i11, i10, ouwVar.pno);
                options.inJustDecodeBounds = false;
                options.inSampleSize = com.bytedance.sdk.component.fkw.lh.vt.ouw.ouw(i10, i11, iOuw, iOuw2, ouwVar.f12580le, ouwVar.f12582ra);
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iOuw || bitmapDecodeByteArray.getHeight() > iOuw2)) {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iOuw, iOuw2, true);
                    if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                        bitmapDecodeByteArray.recycle();
                    }
                    bitmapDecodeByteArray = bitmapCreateScaledBitmap;
                }
            }
            if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 104857600) {
                int width = bitmapDecodeByteArray.getWidth() / 2;
                int height = bitmapDecodeByteArray.getHeight() / 2;
                if (width > 0 && height > 0) {
                    Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                    if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                        bitmapDecodeByteArray.recycle();
                    }
                    bitmapDecodeByteArray = bitmapCreateScaledBitmap2;
                }
            }
            if (bitmapDecodeByteArray == null) {
                ouw("decode failed bitmap null", null, lhVar);
                return;
            }
            lhVar.ouw(new mwh(bitmapDecodeByteArray, this.vt, false));
            String str = lhVar.vt;
            com.bytedance.sdk.component.fkw.vt vtVarBly = lhVar.f12545tc;
            if (vtVarBly == null) {
                vtVarBly = com.bytedance.sdk.component.fkw.lh.ouw.ouw.bly();
            }
            String string = vtVarBly.pno().toString();
            zih lhVar2 = leVar.f12533lh.get(string);
            if (lhVar2 == null) {
                zih zihVarFkw = leVar.vt.fkw();
                lhVar2 = zihVarFkw != null ? new com.bytedance.sdk.component.fkw.lh.ouw.vt.lh(zihVarFkw) : new com.bytedance.sdk.component.fkw.lh.ouw.vt.lh(new com.bytedance.sdk.component.fkw.lh.ouw.vt.ouw(vtVarBly.vt()));
                leVar.f12533lh.put(string, lhVar2);
            }
            lhVar2.ouw(str, bitmapDecodeByteArray);
        } catch (Throwable th2) {
            ouw("decode failed:" + th2.getMessage(), th2, lhVar);
        }
    }
}
