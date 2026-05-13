package com.bytedance.adsdk.vt.lh.lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.vt.lh.lh.fkw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class vt extends ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final List<ouw> f12030cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final RectF f12031jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final RectF f12032ko;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> mwh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final Paint f12033rn;
    public boolean ryl;

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.lh.lh.vt$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[fkw.vt.values().length];
            ouw = iArr;
            try {
                iArr[fkw.vt.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[fkw.vt.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public vt(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar, List<fkw> list, com.bytedance.adsdk.vt.ra raVar, Context context) {
        int i10;
        ouw ouwVar;
        fkw.vt vtVar;
        int i11;
        super(blyVar, fkwVar);
        this.f12030cf = new ArrayList();
        this.f12031jg = new RectF();
        this.f12032ko = new RectF();
        this.f12033rn = new Paint();
        this.ryl = true;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2 = fkwVar.f11997th;
        if (vtVar2 != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = vtVar2.ouw();
            this.mwh = ouwVarOuw;
            ouw(ouwVarOuw);
            this.mwh.ouw(this);
        } else {
            this.mwh = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(raVar.pno.size());
        int size = list.size() - 1;
        ouw ouwVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            fkw fkwVar2 = list.get(size);
            ouw ouwVarOuw2 = ouw.ouw(this, fkwVar2, blyVar, raVar, context);
            if (ouwVarOuw2 != null) {
                longSparseArray.put(ouwVarOuw2.f12014lh.yu, ouwVarOuw2);
                if (ouwVar2 != null) {
                    ouwVar2.ouw(ouwVarOuw2);
                    ouwVar2 = null;
                } else {
                    this.f12030cf.add(0, ouwVarOuw2);
                    if (fkwVar2 != null && (vtVar = fkwVar2.zin) != null && ((i11 = AnonymousClass1.ouw[vtVar.ordinal()]) == 1 || i11 == 2)) {
                        ouwVar2 = ouwVarOuw2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < longSparseArray.size(); i10++) {
            ouw ouwVar3 = (ouw) longSparseArray.get(longSparseArray.keyAt(i10));
            if (ouwVar3 != null && (ouwVar = (ouw) longSparseArray.get(ouwVar3.f12014lh.f11993le)) != null) {
                ouwVar3.vt(ouwVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void ouw(float f10) {
        super.ouw(f10);
        if (this.mwh != null) {
            f10 = ((this.mwh.le().floatValue() * this.f12014lh.vt.ryl) - this.f12014lh.vt.tlj) / (this.vt.ouw.vt() + 0.01f);
        }
        if (this.mwh == null) {
            fkw fkwVar = this.f12014lh;
            f10 -= fkwVar.f11991jg / fkwVar.vt.vt();
        }
        fkw fkwVar2 = this.f12014lh;
        if (fkwVar2.mwh != 0.0f && !"__container".equals(fkwVar2.f11994lh)) {
            f10 /= this.f12014lh.mwh;
        }
        for (int size = this.f12030cf.size() - 1; size >= 0; size--) {
            this.f12030cf.get(size).ouw(f10);
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        super.ouw(rectF, matrix, z10);
        for (int size = this.f12030cf.size() - 1; size >= 0; size--) {
            this.f12031jg.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f12030cf.get(size).ouw(this.f12031jg, this.ouw, true);
            rectF.union(this.f12031jg);
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void ouw(boolean z10) {
        super.ouw(z10);
        Iterator<ouw> it = this.f12030cf.iterator();
        while (it.hasNext()) {
            it.next().ouw(z10);
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i10) {
        super.vt(canvas, matrix, i10);
        com.bytedance.adsdk.vt.fkw.ouw("CompositionLayer#draw");
        RectF rectF = this.f12032ko;
        fkw fkwVar = this.f12014lh;
        rectF.set(0.0f, 0.0f, fkwVar.f11992ko, fkwVar.f11996rn);
        matrix.mapRect(this.f12032ko);
        boolean z10 = this.vt.jqy && this.f12030cf.size() > 1 && i10 != 255;
        if (z10) {
            this.f12033rn.setAlpha(i10);
            com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f12032ko, this.f12033rn);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f12030cf.size() - 1; size >= 0; size--) {
            if (((!this.ryl && "__container".equals(this.f12014lh.f11994lh)) || this.f12032ko.isEmpty()) ? true : canvas.clipRect(this.f12032ko)) {
                this.f12030cf.get(size).ouw(canvas, matrix, i10);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.vt.fkw.vt("CompositionLayer#draw");
    }
}
