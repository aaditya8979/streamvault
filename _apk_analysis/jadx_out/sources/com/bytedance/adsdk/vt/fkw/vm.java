package com.bytedance.adsdk.vt.fkw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
class vm {
    private static final Interpolator ouw = new LinearInterpolator();
    private static SparseArray<WeakReference<Interpolator>> vt;

    private static Interpolator ouw(PointF pointF, PointF pointF2) {
        Interpolator interpolatorOuw;
        pointF.x = com.bytedance.adsdk.vt.le.ra.vt(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.vt.le.ra.vt(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.vt.le.ra.vt(pointF2.x, -1.0f, 1.0f);
        float fVt = com.bytedance.adsdk.vt.le.ra.vt(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fVt;
        int iOuw = com.bytedance.adsdk.vt.le.pno.ouw(pointF.x, pointF.y, pointF2.x, fVt);
        WeakReference<Interpolator> weakReferenceOuw = com.bytedance.adsdk.vt.fkw.ouw() ? null : ouw(iOuw);
        Interpolator interpolator = weakReferenceOuw != null ? weakReferenceOuw.get() : null;
        if (weakReferenceOuw == null || interpolator == null) {
            try {
                interpolatorOuw = com.bytedance.adsdk.vt.vm.ouw(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                interpolatorOuw = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? com.bytedance.adsdk.vt.vm.ouw(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorOuw;
            if (!com.bytedance.adsdk.vt.fkw.ouw()) {
                try {
                    ouw(iOuw, (WeakReference<Interpolator>) new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.bytedance.adsdk.vt.ra.ouw<T> ouw(android.util.JsonReader r22, com.bytedance.adsdk.vt.ra r23, float r24, com.bytedance.adsdk.vt.fkw.osn<T> r25, boolean r26, boolean r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.fkw.vm.ouw(android.util.JsonReader, com.bytedance.adsdk.vt.ra, float, com.bytedance.adsdk.vt.fkw.osn, boolean, boolean):com.bytedance.adsdk.vt.ra.ouw");
    }

    private static <T> com.bytedance.adsdk.vt.ra.ouw<T> ouw(com.bytedance.adsdk.vt.ra raVar, JsonReader jsonReader, float f10, osn<T> osnVar) throws IOException {
        Interpolator interpolatorOuw;
        jsonReader.beginObject();
        PointF pointFVt = null;
        boolean z10 = false;
        T tOuw = null;
        T tOuw2 = null;
        PointF pointFVt2 = null;
        PointF pointFVt3 = null;
        float fNextDouble = 0.0f;
        PointF pointFVt4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "e":
                    tOuw = osnVar.ouw(jsonReader, f10);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                    break;
                case "i":
                    pointFVt4 = zih.vt(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFVt = zih.vt(jsonReader, 1.0f);
                    break;
                case "s":
                    tOuw2 = osnVar.ouw(jsonReader, f10);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFVt3 = zih.vt(jsonReader, f10);
                    break;
                case "to":
                    pointFVt2 = zih.vt(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z10) {
            if (pointFVt != null && pointFVt4 != null) {
                interpolatorOuw = ouw(pointFVt, pointFVt4);
            }
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar = new com.bytedance.adsdk.vt.ra.ouw<>(raVar, tOuw2, tOuw, interpolatorOuw, fNextDouble, null);
            ouwVar.mwh = pointFVt2;
            ouwVar.f12184jg = pointFVt3;
            return ouwVar;
        }
        tOuw = tOuw2;
        interpolatorOuw = ouw;
        com.bytedance.adsdk.vt.ra.ouw<T> ouwVar2 = new com.bytedance.adsdk.vt.ra.ouw<>(raVar, tOuw2, tOuw, interpolatorOuw, fNextDouble, null);
        ouwVar2.mwh = pointFVt2;
        ouwVar2.f12184jg = pointFVt3;
        return ouwVar2;
    }

    private static WeakReference<Interpolator> ouw(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (vm.class) {
            if (vt == null) {
                vt = new SparseArray<>();
            }
            weakReference = vt.get(i10);
        }
        return weakReference;
    }

    private static void ouw(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (vm.class) {
            vt.put(i10, weakReference);
        }
    }
}
