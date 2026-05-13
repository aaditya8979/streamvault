package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.vt.lh.ouw.cf;
import com.bytedance.adsdk.vt.lh.vt;
import com.bytedance.adsdk.vt.ouw.vt.ko;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class bly extends com.bytedance.adsdk.vt.lh.lh.ouw {

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> f11979cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final StringBuilder f11980cf;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ex;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final Paint f11981jg;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final Paint f11982ko;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ksc;
    private final Matrix mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> f11983od;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Typeface, Typeface> f11984pd;
    private final com.bytedance.adsdk.vt.bly qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final Map<com.bytedance.adsdk.vt.lh.yu, List<com.bytedance.adsdk.vt.ouw.ouw.yu>> f11985rn;
    private final RectF ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> f11986tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final ko f11987th;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> f11988uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final List<ouw> f11989vm;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> vpp;
    private final LongSparseArray<String> zih;
    private final com.bytedance.adsdk.vt.ra zin;

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.lh.lh.bly$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[vt.ouw.values().length];
            ouw = iArr;
            try {
                iArr[vt.ouw.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[vt.ouw.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[vt.ouw.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ouw {
        public String ouw;
        public float vt;

        private ouw() {
            this.ouw = "";
            this.vt = 0.0f;
        }

        public /* synthetic */ ouw(byte b10) {
            this();
        }

        public final void ouw(String str, float f10) {
            this.ouw = str;
            this.vt = f10;
        }
    }

    public bly(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2;
        com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar;
        com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar2;
        super(blyVar, fkwVar);
        this.f11980cf = new StringBuilder(2);
        this.ryl = new RectF();
        this.mwh = new Matrix();
        this.f11981jg = new Paint() { // from class: com.bytedance.adsdk.vt.lh.lh.bly.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.f11982ko = new Paint() { // from class: com.bytedance.adsdk.vt.lh.lh.bly.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.f11985rn = new HashMap();
        this.zih = new LongSparseArray<>();
        this.f11989vm = new ArrayList();
        this.qbp = blyVar;
        this.zin = fkwVar.vt;
        ko koVarOuw = fkwVar.zih.ouw();
        this.f11987th = koVarOuw;
        koVarOuw.ouw(this);
        ouw(koVarOuw);
        cf cfVar = fkwVar.f11998vm;
        if (cfVar != null && (ouwVar2 = cfVar.ouw) != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw = ouwVar2.ouw();
            this.vpp = ouwVarOuw;
            ouwVarOuw.ouw(this);
            ouw(this.vpp);
        }
        if (cfVar != null && (ouwVar = cfVar.vt) != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw2 = ouwVar.ouw();
            this.ex = ouwVarOuw2;
            ouwVarOuw2.ouw(this);
            ouw(this.ex);
        }
        if (cfVar != null && (vtVar2 = cfVar.f12039lh) != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw3 = vtVar2.ouw();
            this.ksc = ouwVarOuw3;
            ouwVarOuw3.ouw(this);
            ouw(this.ksc);
        }
        if (cfVar == null || (vtVar = cfVar.yu) == null) {
            return;
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw4 = vtVar.ouw();
        this.f11983od = ouwVarOuw4;
        ouwVarOuw4.ouw(this);
        ouw(this.f11983od);
    }

    private static List<String> ouw(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private List<ouw> ouw(String str, float f10, com.bytedance.adsdk.vt.lh.lh lhVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                com.bytedance.adsdk.vt.lh.yu yuVar = this.zin.f12170le.get(com.bytedance.adsdk.vt.lh.yu.ouw(cCharAt, lhVar.ouw, lhVar.f11978lh));
                if (yuVar != null) {
                    fMeasureText = ((float) yuVar.vt) * f11 * com.bytedance.adsdk.vt.le.pno.ouw();
                }
            } else {
                fMeasureText = this.f11981jg.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = fMeasureText + f12;
            if (cCharAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                ouw ouwVarVt = vt(i10);
                if (i12 == i11) {
                    ouwVarVt.ouw(str.substring(i11, i13).trim(), (f13 - f16) - ((r10.length() - r8.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    ouwVarVt.ouw(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((r8.length() - r14.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            vt(i10).ouw(str.substring(i11), f13);
        }
        return this.f11989vm.subList(0, i10);
    }

    private static void ouw(Canvas canvas, com.bytedance.adsdk.vt.lh.vt vtVar, int i10, float f10) {
        PointF pointF = vtVar.ryl;
        PointF pointF2 = vtVar.mwh;
        float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
        float f11 = (i10 * vtVar.f12044le * fOuw) + (pointF == null ? 0.0f : (vtVar.f12044le * 0.6f * fOuw) + pointF.y);
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = AnonymousClass3.ouw[vtVar.yu.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else {
            if (i11 != 3) {
                return;
            }
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
    }

    private static void ouw(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ouw(com.bytedance.adsdk.vt.lh.vt r21, com.bytedance.adsdk.vt.lh.lh r22, android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.lh.lh.bly.ouw(com.bytedance.adsdk.vt.lh.vt, com.bytedance.adsdk.vt.lh.lh, android.graphics.Canvas):void");
    }

    private static void ouw(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private ouw vt(int i10) {
        for (int size = this.f11989vm.size(); size < i10; size++) {
            this.f11989vm.add(new ouw((byte) 0));
        }
        return this.f11989vm.get(i10 - 1);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        super.ouw(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.zin.bly.width(), this.zin.bly.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vt(android.graphics.Canvas r23, android.graphics.Matrix r24, int r25) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.lh.lh.bly.vt(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
