package com.bytedance.adsdk.ugeno.yoga.vt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.ouw;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.vt.ouw;
import com.bytedance.adsdk.ugeno.yoga.fkw;
import com.bytedance.adsdk.ugeno.yoga.le;
import com.bytedance.adsdk.ugeno.yoga.mwh;
import com.bytedance.adsdk.ugeno.yoga.ryl;
import com.bytedance.adsdk.ugeno.yoga.tlj;
import com.bytedance.adsdk.ugeno.yoga.vt.lh;
import com.bytedance.adsdk.ugeno.yoga.yu;

/* JADX INFO: loaded from: classes.dex */
public class ouw extends com.bytedance.adsdk.ugeno.vt.ouw<lh> {
    private com.bytedance.adsdk.ugeno.yoga.ouw byv;
    private tlj ehk;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.yoga.ouw f11887fn;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    public fkw f11888ln;
    private mwh qni;
    private le smu;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.vt.ouw$ouw, reason: collision with other inner class name */
    public static class C0184ouw extends ouw.C0182ouw {

        /* JADX INFO: renamed from: bs, reason: collision with root package name */
        public int f11889bs;

        /* JADX INFO: renamed from: cd, reason: collision with root package name */
        public int f11890cd;
        private boolean ey;
        public int fak;
        private boolean fqk;
        public int fvf;
        private boolean hun;
        public float jae;
        private boolean jvy;
        public int ksc;

        /* JADX INFO: renamed from: od, reason: collision with root package name */
        public float f11891od;
        public float osn;

        /* JADX INFO: renamed from: pd, reason: collision with root package name */
        public int f11892pd;
        private boolean rrs;
        public int uoy;

        /* JADX INFO: renamed from: uq, reason: collision with root package name */
        public float f11893uq;
        private boolean ux;

        public C0184ouw(com.bytedance.adsdk.ugeno.vt.ouw ouwVar) {
            super(ouwVar);
            this.ksc = 1;
            this.jae = 0.0f;
            this.f11891od = 1.0f;
            this.f11890cd = com.bytedance.adsdk.ugeno.yoga.ouw.AUTO.tlj;
            this.f11893uq = -1.0f;
            this.f11892pd = ryl.RELATIVE.yu;
        }

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0182ouw
        public final /* synthetic */ ViewGroup.LayoutParams ouw() {
            com.bytedance.adsdk.ugeno.vt.ouw ouwVar = this.f11855tc;
            boolean z10 = true;
            if (ouwVar instanceof ouw) {
                if (((ouw) ouwVar).f11888ln == fkw.ROW && ouwVar.od() == -2 && this.ouw == -1.0f && !this.f11855tc.fak()) {
                    this.ouw = -2.0f;
                    this.f11891od = 1.0f;
                    this.jae = 1.0f;
                    this.ey = true;
                    this.f11893uq = -1.0f;
                }
                com.bytedance.adsdk.ugeno.vt.ouw ouwVar2 = this.f11855tc;
                if (((ouw) ouwVar2).f11888ln == fkw.COLUMN && ouwVar2.cd() == -2 && this.vt == -1.0f && !this.f11855tc.fak()) {
                    this.vt = -2.0f;
                    this.f11891od = 1.0f;
                    this.jae = 1.0f;
                    this.ey = true;
                    this.f11893uq = -1.0f;
                }
            }
            lh.ouw ouwVar3 = new lh.ouw((int) this.ouw, (int) this.vt);
            float f10 = (int) (this.qbp ? this.f11851le : this.fkw);
            ouwVar3.yu = f10;
            ouwVar3.ouw.put(18, Float.valueOf(f10));
            float f11 = (int) (this.zin ? this.f11853ra : this.fkw);
            ouwVar3.f11881le = f11;
            ouwVar3.ouw.put(20, Float.valueOf(f11));
            float f12 = (int) (this.vpp ? this.pno : this.fkw);
            ouwVar3.f11882lh = f12;
            ouwVar3.ouw.put(17, Float.valueOf(f12));
            float f13 = (int) (this.jqy ? this.bly : this.fkw);
            ouwVar3.fkw = f13;
            ouwVar3.ouw.put(19, Float.valueOf(f13));
            float f14 = this.ksc;
            ouwVar3.f11883ra = f14;
            ouwVar3.ouw.put(5, Float.valueOf(f14));
            float f15 = this.f11890cd;
            ouwVar3.bly = f15;
            ouwVar3.ouw.put(9, Float.valueOf(f15));
            ouwVar3.ouw(this.jae);
            ouwVar3.vt(this.f11891od);
            float f16 = this.f11852lh;
            ouwVar3.mwh = f16;
            ouwVar3.ouw.put(27, Float.valueOf(f16));
            float f17 = this.yu;
            ouwVar3.f11879jg = f17;
            ouwVar3.ouw.put(28, Float.valueOf(f17));
            if (this.ey) {
                float f18 = this.f11893uq;
                ouwVar3.pno = f18;
                ouwVar3.ouw.put(8, Float.valueOf(f18));
            }
            ouwVar3.lh(this.f11892pd);
            if (this.rrs) {
                ouwVar3.yu(this.fvf);
            }
            if (this.jvy) {
                float f19 = this.f11889bs;
                ouwVar3.tlj = f19;
                ouwVar3.ouw.put(12, Float.valueOf(f19));
            }
            if (this.fqk) {
                ouwVar3.fkw(this.fak);
            }
            if (this.hun) {
                float f20 = this.uoy;
                ouwVar3.f11878cf = f20;
                ouwVar3.ouw.put(13, Float.valueOf(f20));
            }
            if (this.ux) {
                float f21 = this.ouw;
                if ((f21 == -1.0f && this.vt == -1.0f) || (f21 != -2.0f && this.vt != -2.0f)) {
                    z10 = false;
                }
                if (z10) {
                    float f22 = this.osn;
                    if (f22 > 0.0f) {
                        ouwVar3.ryl = f22;
                        ouwVar3.ouw.put(25, Float.valueOf(f22));
                        ouwVar3.vt(0.0f);
                        ouwVar3.ouw(0.0f);
                    }
                }
            }
            return ouwVar3;
        }

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0182ouw
        public final void ouw(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.ouw(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasis":
                    this.ey = true;
                    float fOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, -1.0f);
                    this.f11893uq = fOuw;
                    this.f11893uq = ra.ouw(context, fOuw);
                    break;
                case "bottom":
                    this.jvy = true;
                    this.f11889bs = (int) ra.ouw(context, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0));
                    break;
                case "top":
                    this.rrs = true;
                    this.fvf = (int) ra.ouw(context, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0));
                    break;
                case "left":
                    this.fqk = true;
                    this.fak = (int) ra.ouw(context, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0));
                    break;
                case "order":
                    this.ksc = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1);
                    break;
                case "ratio":
                    this.ux = true;
                    this.osn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                    break;
                case "right":
                    this.hun = true;
                    this.uoy = (int) ra.ouw(context, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0));
                    break;
                case "position":
                    this.f11892pd = ryl.ouw(str2).yu;
                    break;
                case "flexShrink":
                    this.f11891od = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.jae = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.f11890cd = com.bytedance.adsdk.ugeno.yoga.ouw.ouw(str2).tlj;
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0182ouw
        public final String toString() {
            return "LayoutParams{mOrder=" + this.ksc + ", mFlexGrow=" + this.jae + ", mFlexShrink=" + this.f11891od + ", mAlignSelf=" + this.f11890cd + ", mFlexBasis=" + this.f11893uq + ", mPosition=" + this.f11892pd + ", mTop=" + this.fvf + ", mBottom=" + this.f11889bs + ", mLeft=" + this.fak + ", mRight=" + this.uoy + '}';
        }
    }

    public ouw(Context context) {
        super(context);
        this.f11888ln = fkw.ROW;
        this.qni = mwh.NO_WRAP;
        this.smu = le.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.ouw ouwVar = com.bytedance.adsdk.ugeno.yoga.ouw.STRETCH;
        this.f11887fn = ouwVar;
        this.byv = ouwVar;
    }

    private void ouw(final com.bytedance.adsdk.ugeno.bly.yu.ouw ouwVar) {
        this.fkw.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.vt.ouw.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                tlj tljVarOuw;
                if (ouw.this.fkw == null || (tljVarOuw = ((lh) ouw.this.fkw).ouw(ouwVar)) == null) {
                    return;
                }
                int width = ouw.this.fkw.getWidth();
                tljVarOuw.yu(width);
                int height = ouw.this.fkw.getHeight();
                tljVarOuw.fkw(height);
                ouwVar.setCornerRadius(ouw.this.ux);
                ouw.this.fkw.requestLayout();
                if (width > 0 || height > 0) {
                    ouw.this.fkw.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final /* synthetic */ ouw.C0182ouw bly() {
        return new C0184ouw(this);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        lh lhVar = new lh(this.vt);
        lhVar.ouw = this;
        this.ehk = lhVar.getYogaNode();
        return lhVar;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.bly.yu.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.yu.ouw(this.vt);
        ouwVar.setImageDrawable(drawable);
        if (!this.hun || (scaleType = this.rrs) == ImageView.ScaleType.FIT_XY) {
            ouwVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            ouwVar.setScaleType(scaleType);
        }
        ouwVar.setCornerRadius(this.ux);
        lh.ouw ouwVar2 = new lh.ouw(-1, -1);
        ouwVar2.lh(ryl.ABSOLUTE.yu);
        ouwVar2.yu(0.0f);
        ouwVar2.fkw(0.0f);
        T t10 = this.fkw;
        if (t10 instanceof lh) {
            ((lh) t10).addView(ouwVar, 0, ouwVar2);
            ouw(ouwVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        super.ouw(lhVar);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, ViewGroup.LayoutParams layoutParams) {
        if (lhVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.add(lhVar);
        View view = lhVar.fkw;
        if (view != null) {
            ((lh) this.fkw).addView(view, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.f11887fn = com.bytedance.adsdk.ugeno.yoga.ouw.ouw(str2);
                break;
            case "flexDirection":
                this.f11888ln = fkw.ouw(str2);
                break;
            case "alignContent":
                this.byv = com.bytedance.adsdk.ugeno.yoga.ouw.ouw(str2);
                break;
            case "flexWrap":
                this.qni = mwh.ouw(str2);
                break;
            case "justifyContent":
                this.smu = le.ouw(str2);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void tlj() {
        if (this.f11832pd) {
            this.ehk.vt(yu.ALL, this.ksc);
        }
        if (this.fvf) {
            this.ehk.vt(yu.LEFT, this.jae);
        }
        if (this.f11812bs) {
            this.ehk.vt(yu.RIGHT, this.f11831od);
        }
        if (this.fak) {
            this.ehk.vt(yu.TOP, this.f11813cd);
        }
        if (this.uoy) {
            this.ehk.vt(yu.BOTTOM, this.f11841uq);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
    public void vt() {
        super.vt();
        this.ehk.ouw(this.f11888ln);
        this.ehk.ouw(this.qni);
        this.ehk.ouw(this.smu);
        this.ehk.ouw(this.f11887fn);
        this.ehk.lh(this.byv);
        this.ehk.jg();
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void zin() {
        ImageView.ScaleType scaleType;
        if (this.fqk) {
            com.bytedance.adsdk.ugeno.fkw.ouw().f11681lh.ouw(this.bly, this.ey, new ouw.InterfaceC0179ouw() { // from class: com.bytedance.adsdk.ugeno.yoga.vt.ouw.1
                @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0179ouw
                public final void ouw(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (ouw.this.f11828ms != null) {
                            com.bytedance.adsdk.ugeno.core.le unused = ouw.this.f11828ms;
                            String unused2 = ouw.this.ey;
                            return;
                        }
                        return;
                    }
                    if (ouw.this.f11828ms != null) {
                        com.bytedance.adsdk.ugeno.core.le unused3 = ouw.this.f11828ms;
                        String unused4 = ouw.this.ey;
                    }
                    final Bitmap bitmapOuw = ra.ouw(ouw.this.vt, bitmap, (int) ouw.this.jvy);
                    if (bitmapOuw != null) {
                        ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.vt.ouw.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ouw.this.ouw(new BitmapDrawable(bitmapOuw));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.bly.yu.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.yu.ouw(this.vt);
        com.bytedance.adsdk.ugeno.ouw ouwVar2 = com.bytedance.adsdk.ugeno.fkw.ouw().f11681lh;
        cf cfVar = this.bly;
        String str = this.ey;
        int width = this.fkw.getWidth();
        int height = this.fkw.getHeight();
        new ouw.InterfaceC0179ouw() { // from class: com.bytedance.adsdk.ugeno.yoga.vt.ouw.2
            @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0179ouw
            public final void ouw(Bitmap bitmap) {
                if (bitmap == null) {
                    if (ouw.this.f11828ms != null) {
                        com.bytedance.adsdk.ugeno.core.le unused = ouw.this.f11828ms;
                        String unused2 = ouw.this.ey;
                        return;
                    }
                    return;
                }
                if (ouw.this.f11828ms != null) {
                    com.bytedance.adsdk.ugeno.core.le unused3 = ouw.this.f11828ms;
                    String unused4 = ouw.this.ey;
                }
            }
        };
        ouwVar2.ouw(cfVar, str, ouwVar, width, height);
        if (!this.hun || (scaleType = this.rrs) == ImageView.ScaleType.FIT_XY) {
            ouwVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            ouwVar.setScaleType(scaleType);
        }
        ouwVar.setCornerRadius(this.ux);
        lh.ouw ouwVar3 = new lh.ouw(-1, -1);
        ouwVar3.lh(ryl.ABSOLUTE.yu);
        ouwVar3.yu(0.0f);
        ouwVar3.fkw(0.0f);
        T t10 = this.fkw;
        if (t10 instanceof lh) {
            ((lh) t10).addView(ouwVar, 0, ouwVar3);
            ouw(ouwVar);
        }
    }
}
