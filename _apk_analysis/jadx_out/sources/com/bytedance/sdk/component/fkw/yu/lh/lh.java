package com.bytedance.sdk.component.fkw.yu.lh;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.fkw.bly;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.jg;
import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.pno;
import com.bytedance.sdk.component.fkw.qbp;
import com.bytedance.sdk.component.fkw.ra;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.fkw.tlj;
import com.bytedance.sdk.component.fkw.zin;
import com.squareup.picasso.Utils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public final class lh implements bly {
    public pno bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private boolean f12599cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public WeakReference<ImageView> f12600cf;
    public jg ex;
    public ImageView.ScaleType fkw;
    private boolean jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public th f12601jg;
    public int jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f12602ko;
    private boolean ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public Bitmap.Config f12603le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f12604lh;
    public Future<?> mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private ExecutorService f12605od;
    public String ouw;
    public int pno;
    public le qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f12606ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public final Handler f12607rn;
    public volatile boolean ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public byte[] f12608tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public int f12609th;
    public int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public ra f12610vm;
    public int vpp;
    public String vt;
    public rn yu;
    public boolean zih;
    public com.bytedance.sdk.component.fkw.vt zin;

    public class ouw implements rn {
        public rn ouw;

        public ouw(rn rnVar) {
            this.ouw = rnVar;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(final int i10, final String str, final Throwable th2) {
            lh lhVar = lh.this;
            if (lhVar.f12602ko == 5) {
                lhVar.f12607rn.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        rn rnVar = ouw.this.ouw;
                        if (rnVar != null) {
                            rnVar.ouw(i10, str, th2);
                        }
                    }
                });
                return;
            }
            rn rnVar = this.ouw;
            if (rnVar != null) {
                rnVar.ouw(i10, str, th2);
            }
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(final cf cfVar) {
            Bitmap bitmapOuw;
            final ImageView imageView = lh.this.f12600cf.get();
            if (imageView != null && lh.this.tlj != 3) {
                Object tag = imageView.getTag(1094453505);
                if (tag != null && tag.equals(lh.this.vt)) {
                    Object objVt = cfVar.vt();
                    if (objVt instanceof Bitmap) {
                        final Bitmap bitmap = (Bitmap) cfVar.vt();
                        lh.this.f12607rn.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                imageView.setImageBitmap(bitmap);
                            }
                        });
                    } else if (objVt instanceof Drawable) {
                        final Drawable drawable = (Drawable) cfVar.vt();
                        lh.this.f12607rn.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    Drawable drawable2 = drawable;
                                    if (drawable2 instanceof AnimatedImageDrawable) {
                                        ((AnimatedImageDrawable) drawable2).start();
                                    }
                                }
                                imageView.setImageDrawable(drawable);
                            }
                        });
                    }
                }
            }
            try {
                if (lh.this.bly != null && (cfVar.vt() instanceof Bitmap) && (bitmapOuw = lh.this.bly.ouw((Bitmap) cfVar.vt())) != null) {
                    cfVar.ouw(bitmapOuw);
                }
            } catch (Throwable unused) {
            }
            lh lhVar = lh.this;
            if (lhVar.f12602ko == 5) {
                lhVar.f12607rn.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        rn rnVar = ouw.this.ouw;
                        if (rnVar != null) {
                            rnVar.ouw(cfVar);
                        }
                    }
                });
                return;
            }
            rn rnVar = this.ouw;
            if (rnVar != null) {
                rnVar.ouw(cfVar);
            }
        }
    }

    public static class vt implements tlj {

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public th f12614cf;
        public ImageView.ScaleType fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public String f12615jg;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        public com.bytedance.sdk.component.fkw.vt f12616ko;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public Bitmap.Config f12617le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f12618lh;
        public boolean mwh;
        public rn ouw;
        public int pno;
        public ExecutorService qbp;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public int f12619ra;

        /* JADX INFO: renamed from: rn, reason: collision with root package name */
        public le f12620rn;
        public boolean ryl;

        /* JADX INFO: renamed from: th, reason: collision with root package name */
        public int f12621th;

        /* JADX INFO: renamed from: vm, reason: collision with root package name */
        public int f12622vm;
        public jg vpp;
        public ImageView vt;
        public String yu;
        public pno zih;
        public boolean zin;
        public int bly = 1;
        public int tlj = 5;

        public vt(le leVar) {
            this.f12620rn = leVar;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj fkw(int i10) {
            this.f12621th = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj lh(int i10) {
            this.bly = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final bly ouw(ImageView imageView) {
            this.vt = imageView;
            return new lh(this, (byte) 0).le();
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final bly ouw(rn rnVar) {
            this.tlj = 4;
            return vt(rnVar);
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(int i10) {
            this.f12619ra = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(Bitmap.Config config) {
            this.f12617le = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(ImageView.ScaleType scaleType) {
            this.fkw = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(pno pnoVar) {
            this.zih = pnoVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(th thVar) {
            this.f12614cf = thVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(String str) {
            this.f12618lh = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(boolean z10) {
            this.mwh = z10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final bly vt(rn rnVar) {
            this.ouw = rnVar;
            return new lh(this, (byte) 0).le();
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj vt(int i10) {
            this.pno = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj vt(String str) {
            this.f12615jg = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj yu(int i10) {
            this.f12622vm = i10;
            return this;
        }
    }

    private lh(vt vtVar) {
        this.f12607rn = new Handler(Looper.getMainLooper());
        this.zih = true;
        this.f12608tc = null;
        this.ouw = vtVar.yu;
        this.yu = new ouw(vtVar.ouw);
        this.f12600cf = new WeakReference<>(vtVar.vt);
        this.fkw = vtVar.fkw;
        this.f12603le = vtVar.f12617le;
        this.f12606ra = vtVar.f12619ra;
        this.pno = vtVar.pno;
        this.tlj = vtVar.bly;
        this.f12602ko = vtVar.tlj;
        this.f12601jg = vtVar.f12614cf;
        com.bytedance.sdk.component.fkw.vt vtVar2 = vtVar.f12616ko;
        this.zin = vtVar2 == null ? !TextUtils.isEmpty(vtVar.f12615jg) ? com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.ouw(new File(vtVar.f12615jg)) : com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.bly() : vtVar2;
        if (!TextUtils.isEmpty(vtVar.f12618lh)) {
            ouw(vtVar.f12618lh);
            this.f12604lh = vtVar.f12618lh;
        }
        this.ksc = vtVar.ryl;
        this.jae = vtVar.mwh;
        this.qbp = vtVar.f12620rn;
        this.bly = vtVar.zih;
        this.jqy = vtVar.f12621th;
        this.vpp = vtVar.f12622vm;
        this.f12605od = vtVar.qbp;
        this.f12599cd = vtVar.zin;
        this.ex = vtVar.vpp;
    }

    public /* synthetic */ lh(vt vtVar, byte b10) {
        this(vtVar);
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final Bitmap.Config fkw() {
        return this.f12603le;
    }

    public final bly le() {
        ExecutorService executorServiceOuw;
        try {
            executorServiceOuw = null;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
        }
        if (this.qbp == null) {
            rn rnVar = this.yu;
            if (rnVar != null) {
                rnVar.ouw(1005, "not init !", null);
            }
            return this;
        }
        String str = this.ouw;
        if (TextUtils.isEmpty(str)) {
            this.yu.ouw(2000, "url is empty", null);
            return this;
        }
        mwh mwhVar = this.qbp.vt;
        zin zinVarBly = mwhVar != null ? mwhVar.bly() : null;
        if (!str.startsWith("http://") && !str.startsWith("https://") && zinVarBly != null) {
            zinVarBly.ouw("url is not validate ".concat(str));
        }
        if (this.f12605od == null) {
            le leVar = this.qbp;
            qbp qbpVarLh = leVar.vt.lh();
            if (qbpVarLh == null || (executorServiceOuw = qbpVarLh.ouw()) == null) {
                if (leVar.fkw == null) {
                    ExecutorService executorServiceVt = leVar.vt.vt();
                    if (executorServiceVt == null) {
                        executorServiceVt = com.bytedance.sdk.component.fkw.yu.ouw.vt.ouw();
                    }
                    leVar.fkw = executorServiceVt;
                }
                executorServiceOuw = leVar.fkw;
            }
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.1
            @Override // java.lang.Runnable
            public final void run() {
                lh lhVar = lh.this;
                com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar = new com.bytedance.sdk.component.fkw.yu.lh.ouw(lhVar, lhVar.f12601jg);
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.vt());
                    arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.fkw());
                    arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.ouw());
                    arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.lh());
                    arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.yu());
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (lh.this.ryl) {
                            ouwVar.ouw(1003, Utils.VERB_CANCELED, null);
                            return;
                        }
                        com.bytedance.sdk.component.fkw.yu.vt.le leVar2 = (com.bytedance.sdk.component.fkw.yu.vt.le) arrayList.get(i10);
                        if (lh.this.f12601jg != null && leVar2 != null && !"data_intercept".equals(leVar2.ouw())) {
                            lh.this.f12601jg.ouw(leVar2.ouw(), lh.this);
                        }
                        lh lhVar2 = lh.this;
                        boolean zOuw = leVar2.ouw(lhVar2, lhVar2.f12601jg, ouwVar);
                        if (lh.this.f12601jg != null && !"data_intercept".equals(leVar2.ouw())) {
                            lh.this.f12601jg.ouw(leVar2.ouw());
                        }
                        if (!zOuw) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    ouwVar.ouw(2000, th2.getMessage(), th2);
                }
            }
        };
        if (this.f12599cd) {
            runnable.run();
        } else {
            ExecutorService executorService = this.f12605od;
            if (executorService != null) {
                this.mwh = executorService.submit(runnable);
            } else if (executorServiceOuw != null) {
                this.mwh = executorServiceOuw.submit(runnable);
            }
        }
        return this;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final int lh() {
        return this.pno;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final String ouw() {
        return this.ouw;
    }

    public final void ouw(String str) {
        WeakReference<ImageView> weakReference = this.f12600cf;
        if (weakReference != null && weakReference.get() != null) {
            this.f12600cf.get().setTag(1094453505, str);
        }
        this.vt = str;
    }

    public final String ra() {
        return this.vt + this.tlj;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final int vt() {
        return this.f12606ra;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final ImageView.ScaleType yu() {
        return this.fkw;
    }
}
