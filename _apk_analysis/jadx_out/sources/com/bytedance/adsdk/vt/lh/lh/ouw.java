package com.bytedance.adsdk.vt.lh.lh;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.bytedance.adsdk.vt.lh.lh.fkw;
import com.bytedance.adsdk.vt.lh.vt.jg;
import com.bytedance.adsdk.vt.lh.vt.pno;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import com.bytedance.adsdk.vt.ouw.vt.rn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ouw implements com.bytedance.adsdk.vt.ouw.ouw.fkw, ouw.InterfaceC0186ouw {
    public final Matrix bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private final List<com.bytedance.adsdk.vt.ouw.vt.ouw<?, ?>> f12009cd;
    private final String ex;
    public final rn fkw;
    private ouw jae;
    private final RectF jqy;
    private ouw ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f12013le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final fkw f12014lh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private List<ouw> f12015od;
    public final Matrix ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private Paint f12016pd;
    public BlurMaskFilter pno;
    private final RectF qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public float f12017ra;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.pno f12019tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final RectF f12020th;
    public float tlj;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    private boolean f12021uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final Paint f12022vm;
    private final RectF vpp;
    public final com.bytedance.adsdk.vt.bly vt;
    public com.bytedance.adsdk.vt.ouw.vt.yu yu;
    private final Paint zih;
    private final RectF zin;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final Path f12010cf = new Path();
    private final Matrix ryl = new Matrix();
    private final Matrix mwh = new Matrix();

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final Paint f12011jg = new com.bytedance.adsdk.vt.ouw.ouw(1);

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final Paint f12012ko = new com.bytedance.adsdk.vt.ouw.ouw(PorterDuff.Mode.DST_IN, (byte) 0);

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final Paint f12018rn = new com.bytedance.adsdk.vt.ouw.ouw(PorterDuff.Mode.DST_OUT, (byte) 0);

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.lh.lh.ouw$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] ouw;
        public static final /* synthetic */ int[] vt;

        static {
            int[] iArr = new int[pno.ouw.values().length];
            vt = iArr;
            try {
                iArr[pno.ouw.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                vt[pno.ouw.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                vt[pno.ouw.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                vt[pno.ouw.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[fkw.ouw.values().length];
            ouw = iArr2;
            try {
                iArr2[fkw.ouw.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ouw[fkw.ouw.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ouw[fkw.ouw.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ouw[fkw.ouw.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ouw[fkw.ouw.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ouw[fkw.ouw.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ouw[fkw.ouw.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public ouw(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        com.bytedance.adsdk.vt.ouw.ouw ouwVar = new com.bytedance.adsdk.vt.ouw.ouw(1);
        this.zih = ouwVar;
        this.f12022vm = new com.bytedance.adsdk.vt.ouw.ouw(PorterDuff.Mode.CLEAR);
        this.f12020th = new RectF();
        this.qbp = new RectF();
        this.zin = new RectF();
        this.vpp = new RectF();
        this.jqy = new RectF();
        this.ouw = new Matrix();
        this.f12009cd = new ArrayList();
        this.f12013le = true;
        this.f12017ra = 0.0f;
        this.bly = new Matrix();
        this.tlj = 1.0f;
        this.vt = blyVar;
        this.f12014lh = fkwVar;
        this.ex = fkwVar.f11994lh + "#draw";
        if (fkwVar.zin == fkw.vt.INVERT) {
            ouwVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            ouwVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        rn rnVarOuw = fkwVar.bly.ouw();
        this.fkw = rnVarOuw;
        rnVarOuw.ouw((ouw.InterfaceC0186ouw) this);
        List<com.bytedance.adsdk.vt.lh.vt.pno> list = fkwVar.pno;
        if (list != null && !list.isEmpty()) {
            com.bytedance.adsdk.vt.ouw.vt.pno pnoVar = new com.bytedance.adsdk.vt.ouw.vt.pno(fkwVar.pno);
            this.f12019tc = pnoVar;
            Iterator<com.bytedance.adsdk.vt.ouw.vt.ouw<jg, Path>> it = pnoVar.ouw.iterator();
            while (it.hasNext()) {
                it.next().ouw(this);
            }
            for (com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar2 : this.f12019tc.vt) {
                ouw(ouwVar2);
                ouwVar2.ouw(this);
            }
        }
        if (this.f12014lh.qbp.isEmpty()) {
            vt(true);
            return;
        }
        com.bytedance.adsdk.vt.ouw.vt.yu yuVar = new com.bytedance.adsdk.vt.ouw.vt.yu(this.f12014lh.qbp);
        this.yu = yuVar;
        yuVar.vt = true;
        yuVar.ouw(new ouw.InterfaceC0186ouw() { // from class: com.bytedance.adsdk.vt.lh.lh.ouw.1
            @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0186ouw
            public final void ouw() {
                ouw ouwVar3 = ouw.this;
                ouwVar3.vt(ouwVar3.yu.pno() == 1.0f);
            }
        });
        vt(this.yu.le().floatValue() == 1.0f);
        ouw(this.yu);
    }

    private boolean fkw() {
        com.bytedance.adsdk.vt.ouw.vt.pno pnoVar = this.f12019tc;
        return (pnoVar == null || pnoVar.ouw.isEmpty()) ? false : true;
    }

    private void le() {
        if (this.f12015od != null) {
            return;
        }
        if (this.jae == null) {
            this.f12015od = Collections.emptyList();
            return;
        }
        this.f12015od = new ArrayList();
        for (ouw ouwVar = this.jae; ouwVar != null; ouwVar = ouwVar.jae) {
            this.f12015od.add(ouwVar);
        }
    }

    private void lh(float f10) {
        this.vt.ouw.ouw.ouw(this.f12014lh.f11994lh, f10);
    }

    public static ouw ouw(vt vtVar, fkw fkwVar, com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, Context context) {
        switch (AnonymousClass2.ouw[fkwVar.fkw.ordinal()]) {
            case 1:
                return new ra(blyVar, fkwVar, vtVar, raVar);
            case 2:
                return new vt(blyVar, fkwVar, raVar.vt.get(fkwVar.f11995ra), raVar, context);
            case 3:
                return new pno(blyVar, fkwVar);
            case 4:
                return ouw(blyVar, fkwVar, "text:") ? new lh(blyVar, fkwVar, context) : ouw(blyVar, fkwVar, "videoview:") ? new tlj(blyVar, fkwVar) : new yu(blyVar, fkwVar);
            case 5:
                return new le(blyVar, fkwVar);
            case 6:
                return new bly(blyVar, fkwVar);
            default:
                com.bytedance.adsdk.vt.le.yu.vt("Unknown layer type " + fkwVar.fkw);
                return null;
        }
    }

    private void ouw(Canvas canvas) {
        com.bytedance.adsdk.vt.fkw.ouw("Layer#clearLayer");
        RectF rectF = this.f12020th;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f12022vm);
        com.bytedance.adsdk.vt.fkw.vt("Layer#clearLayer");
    }

    private static boolean ouw(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar, String str) {
        com.bytedance.adsdk.vt.tlj tljVarYu;
        if (blyVar == null || fkwVar == null || (tljVarYu = blyVar.yu(fkwVar.f11995ra)) == null) {
            return false;
        }
        return str.equals(tljVarYu.fkw);
    }

    private boolean yu() {
        return this.ksc != null;
    }

    public com.bytedance.adsdk.vt.fkw.tlj lh() {
        return this.f12014lh.ex;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0186ouw
    public final void ouw() {
        this.vt.invalidateSelf();
    }

    public void ouw(float f10) {
        rn rnVar = this.fkw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar = rnVar.fkw;
        if (ouwVar != null) {
            ouwVar.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar2 = rnVar.pno;
        if (ouwVar2 != null) {
            ouwVar2.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar3 = rnVar.bly;
        if (ouwVar3 != null) {
            ouwVar3.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVar4 = rnVar.ouw;
        if (ouwVar4 != null) {
            ouwVar4.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> ouwVar5 = rnVar.vt;
        if (ouwVar5 != null) {
            ouwVar5.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> ouwVar6 = rnVar.f12158lh;
        if (ouwVar6 != null) {
            ouwVar6.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar7 = rnVar.yu;
        if (ouwVar7 != null) {
            ouwVar7.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.yu yuVar = rnVar.f12157le;
        if (yuVar != null) {
            yuVar.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.yu yuVar2 = rnVar.f12159ra;
        if (yuVar2 != null) {
            yuVar2.ouw(f10);
        }
        if (this.f12019tc != null) {
            for (int i10 = 0; i10 < this.f12019tc.ouw.size(); i10++) {
                this.f12019tc.ouw.get(i10).ouw(f10);
            }
        }
        com.bytedance.adsdk.vt.ouw.vt.yu yuVar3 = this.yu;
        if (yuVar3 != null) {
            yuVar3.ouw(f10);
        }
        ouw ouwVar8 = this.ksc;
        if (ouwVar8 != null) {
            ouwVar8.ouw(f10);
        }
        for (int i11 = 0; i11 < this.f12009cd.size(); i11++) {
            this.f12009cd.get(i11).ouw(f10);
        }
    }

    public final void ouw(int i10) {
        this.tlj = ((this.fkw.fkw != null ? r0.le().intValue() : 100) / 100.0f) * (i10 / 255.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0195, code lost:
    
        r5 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fb A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.lh.lh.ouw.ouw(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public void ouw(RectF rectF, Matrix matrix, boolean z10) {
        this.f12020th.set(0.0f, 0.0f, 0.0f, 0.0f);
        le();
        this.ouw.set(matrix);
        if (z10) {
            List<ouw> list = this.f12015od;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.ouw.preConcat(this.f12015od.get(size).fkw.ouw());
                }
            } else {
                ouw ouwVar = this.jae;
                if (ouwVar != null) {
                    this.ouw.preConcat(ouwVar.fkw.ouw());
                }
            }
        }
        this.ouw.preConcat(this.fkw.ouw());
    }

    public final void ouw(ouw ouwVar) {
        this.ksc = ouwVar;
    }

    public final void ouw(com.bytedance.adsdk.vt.ouw.vt.ouw<?, ?> ouwVar) {
        if (ouwVar == null) {
            return;
        }
        this.f12009cd.add(ouwVar);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<com.bytedance.adsdk.vt.ouw.ouw.lh> list, List<com.bytedance.adsdk.vt.ouw.ouw.lh> list2) {
    }

    public void ouw(boolean z10) {
        if (z10 && this.f12016pd == null) {
            this.f12016pd = new com.bytedance.adsdk.vt.ouw.ouw();
        }
        this.f12021uq = z10;
    }

    public final BlurMaskFilter vt(float f10) {
        if (this.f12017ra == f10) {
            return this.pno;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.pno = blurMaskFilter;
        this.f12017ra = f10;
        return blurMaskFilter;
    }

    public com.bytedance.adsdk.vt.lh.vt.ouw vt() {
        return this.f12014lh.jqy;
    }

    public void vt(Canvas canvas, Matrix matrix, int i10) {
        ouw(i10);
    }

    public final void vt(ouw ouwVar) {
        this.jae = ouwVar;
    }

    public final void vt(boolean z10) {
        if (z10 != this.f12013le) {
            this.f12013le = z10;
            this.vt.invalidateSelf();
        }
    }
}
