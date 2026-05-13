package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;

/* JADX INFO: loaded from: classes7.dex */
public final class cf {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f13227lh;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
    public int vt;

    public static abstract class ouw implements View.OnLayoutChangeListener {
        private int ouw;
        private int vt;

        private ouw() {
        }

        public /* synthetic */ ouw(byte b10) {
            this();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.ouw && i19 == this.vt) {
                return;
            }
            this.ouw = i18;
            this.vt = i19;
            ouw();
        }

        public abstract void ouw();
    }

    public static class vt {
        private ouw ouw;

        public final void ouw(Activity activity) {
            Window window;
            if (this.ouw == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.ouw);
            this.ouw = null;
        }

        public final void ouw(final Activity activity, final int i10, final float f10, final boolean z10) {
            if (this.ouw != null) {
                return;
            }
            try {
                final boolean z11 = com.bytedance.sdk.openadsdk.core.zih.yu().qbp() == 1;
                final boolean z12 = osn.lh(activity);
                if (z12 || z11) {
                    this.ouw = new ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.cf.vt.1
                        public boolean ouw;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super((byte) 0);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:46:0x0128 A[Catch: all -> 0x014d, TryCatch #1 {all -> 0x014d, blocks: (B:20:0x0083, B:22:0x0087, B:24:0x0095, B:26:0x00c8, B:28:0x00e0, B:30:0x00e8, B:32:0x00f6, B:33:0x00fa, B:44:0x0122, B:46:0x0128, B:47:0x013a, B:49:0x0140, B:34:0x00fd, B:36:0x0101, B:38:0x010f, B:40:0x0113, B:41:0x0119, B:43:0x011d, B:51:0x0144, B:53:0x0148, B:25:0x00af), top: B:59:0x0083 }] */
                        /* JADX WARN: Removed duplicated region for block: B:49:0x0140 A[Catch: all -> 0x014d, TryCatch #1 {all -> 0x014d, blocks: (B:20:0x0083, B:22:0x0087, B:24:0x0095, B:26:0x00c8, B:28:0x00e0, B:30:0x00e8, B:32:0x00f6, B:33:0x00fa, B:44:0x0122, B:46:0x0128, B:47:0x013a, B:49:0x0140, B:34:0x00fd, B:36:0x0101, B:38:0x010f, B:40:0x0113, B:41:0x0119, B:43:0x011d, B:51:0x0144, B:53:0x0148, B:25:0x00af), top: B:59:0x0083 }] */
                        /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
                        @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.cf.ouw
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void ouw() {
                            /*
                                Method dump skipped, instruction units count: 334
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ouw.cf.vt.AnonymousClass1.ouw():void");
                        }
                    };
                    activity.getWindow().getDecorView().addOnLayoutChangeListener(this.ouw);
                }
            } catch (Exception unused) {
            }
        }
    }

    public cf(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.vt = 0;
        this.f13227lh = false;
        this.ouw = ouwVar;
        ouwVar.f13278vh = ouwVar.vt.ex();
        ouwVar.ucs = ouw(ouwVar.jvy, ouwVar.vt);
        try {
            this.vt = osn.vt(ouwVar.jvy, osn.ouw());
            if (!ouwVar.jvy.getWindow().hasFeature(1)) {
                ouwVar.jvy.requestWindowFeature(1);
            }
            ouwVar.jvy.getWindow().addFlags(16777344);
            if (ouwVar.ucs == 2 || !osn.lh(ouwVar.jvy)) {
                ouwVar.jvy.getWindow().addFlags(1024);
            }
            this.f13227lh = ouwVar.zjp;
        } catch (Throwable th2) {
            Log.e("TTAD.RFSM", "init: ", th2);
        }
    }

    public static int ouw(Activity activity, int i10) {
        int i11 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (ouw(i10, i11)) {
            return Math.abs(osn.jg(activity) - decorView.getWidth());
        }
        return Math.abs(osn.mwh(activity) - decorView.getHeight());
    }

    public static int ouw(Activity activity, vpp vppVar) {
        return 26 == Build.VERSION.SDK_INT ? activity.getResources().getConfiguration().orientation == 1 ? 1 : 2 : vppVar.jqy();
    }

    private static boolean ouw(int i10, int i11) {
        return i10 == 2 && i11 == 2;
    }

    public static int[] ouw(Activity activity, View view, int i10, boolean z10, boolean z11) {
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        int paddingBottom;
        int i11;
        float fOuw;
        int[] iArr = new int[5];
        if (activity == null || view == null) {
            if (view != null) {
                paddingLeft = view.getPaddingLeft();
                paddingTop = view.getPaddingTop();
                paddingRight = view.getPaddingRight();
                paddingBottom = view.getPaddingBottom();
            } else {
                paddingLeft = 0;
                paddingTop = 0;
                paddingRight = 0;
                paddingBottom = 0;
            }
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", "calculateAdjustedPadding: activity/decorView is null, return current padding + adjustStatus=0");
            iArr[0] = paddingLeft;
            iArr[1] = paddingTop;
            iArr[2] = paddingRight;
            iArr[3] = paddingBottom;
            iArr[4] = 0;
            return iArr;
        }
        int i12 = activity.getResources().getConfiguration().orientation;
        int paddingLeft2 = view.getPaddingLeft();
        int paddingTop2 = view.getPaddingTop();
        int paddingRight2 = view.getPaddingRight();
        int paddingBottom2 = view.getPaddingBottom();
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", "calculateAdjustedPadding: initial paddingLeft = " + paddingLeft2 + " , paddingTop = " + paddingTop2 + " , paddingRight = " + paddingRight2 + " , paddingBottom = " + paddingBottom2);
        if (i10 == 1) {
            if (i12 == 1) {
                fOuw = osn.ouw();
                paddingTop2 += (int) fOuw;
                i11 = 1;
            } else {
                paddingLeft2 += (int) osn.ouw();
                i11 = 0;
            }
        } else if (i10 != 2) {
            i11 = 0;
        } else if (i12 == 2) {
            if (z10) {
                paddingLeft2 += (int) osn.ouw();
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (z11) {
                fOuw = osn.ouw();
                paddingTop2 += (int) fOuw;
                i11 = 1;
            }
        } else {
            paddingTop2 += (int) osn.ouw();
            i11 = 0;
        }
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", "calculateAdjustedPadding: systemOrientation = " + i12 + ", orientation = " + i10 + ",adjustStatus =" + i11 + ",paddingLeft =" + paddingLeft2 + ",paddingTop =" + paddingTop2 + ",paddingRight =" + paddingRight2 + ",paddingBottom =" + paddingBottom2);
        return new int[]{paddingLeft2, paddingTop2, paddingRight2, paddingBottom2, i11};
    }

    private static void vt(Activity activity, int i10) {
        if (activity.getRequestedOrientation() == i10) {
            return;
        }
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", "setActivityRequestedOrientation ori =" + i10 + ",systemOrientation =" + activity.getResources().getConfiguration().orientation);
        activity.setRequestedOrientation(i10);
    }

    public final float lh() {
        return osn.vt(this.ouw.jvy, osn.jg(this.ouw.jvy));
    }

    public final void ouw() {
        osn.ouw(this.ouw.jvy);
        this.ouw.jvy.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.cf.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (cf.this.ouw.jvy.isFinishing()) {
                            return;
                        }
                        cf.this.ouw.jvy.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.cf.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                osn.ouw(cf.this.ouw.jvy);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        qbp.lh("TTAD.RFSM", e10.getMessage());
                    }
                }
            }
        });
    }

    public final void ouw(jae jaeVar) {
        if (jaeVar == null) {
            return;
        }
        jaeVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.cf.1
            @Override // java.lang.Runnable
            public final void run() {
                View viewFindViewById;
                try {
                    View decorView = cf.this.ouw.jvy.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    public final float[] ouw(int i10) {
        float[] fArr = new float[2];
        Activity activity = this.ouw.jvy;
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (this.f13227lh) {
            if ((paddingLeft == 0 && paddingTop == 0) && ouw(activity, i10) == 0) {
                int[] iArrOuw = ouw(activity, decorView, i10, osn.lh(activity), com.bytedance.sdk.openadsdk.core.zih.yu().qbp() == 1);
                int i11 = iArrOuw[0];
                paddingTop = iArrOuw[1];
                paddingLeft = i11;
            }
        }
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", "getAdContainerSize: paddingLeft = " + paddingLeft + " , paddingTop = " + paddingTop + " , mIsAdaptDecorSize = " + this.f13227lh);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 35 || this.ouw.vt.ex() != 100.0f) {
            fArr[0] = decorView.getWidth() - (paddingLeft * 2);
            fArr[1] = decorView.getHeight() - (paddingTop * 2);
        } else {
            fArr[0] = decorView.getWidth() - paddingLeft;
            fArr[1] = decorView.getHeight() - paddingTop;
        }
        fArr[0] = osn.vt(activity, fArr[0]);
        float fVt = osn.vt(activity, fArr[1]);
        fArr[1] = fVt;
        if (fArr[0] < 10.0f || fVt < 10.0f) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", "get root view size error, so run backup");
            int i13 = this.vt;
            float fYu = yu();
            float fLh = lh();
            int i14 = this.ouw.ucs;
            if ((i14 == 1) != (fYu > fLh)) {
                float f10 = fYu + fLh;
                fLh = f10 - fLh;
                fYu = f10 - fLh;
            }
            if (i14 == 1) {
                fYu -= i13;
            } else {
                fLh -= i13;
            }
            fArr = new float[]{fLh, fYu};
        }
        if (i12 != 26 && i12 != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i10) {
                    if (i10 == 2) {
                        float f11 = fArr[0];
                        float f12 = fArr[1];
                        if (f11 < f12) {
                            fArr[1] = f11;
                            fArr[0] = f12;
                        }
                    } else {
                        float f13 = fArr[0];
                        float f14 = fArr[1];
                        if (f13 > f14) {
                            fArr[1] = f13;
                            fArr[0] = f14;
                        }
                    }
                }
            }
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", "getAdContainerSize: result = " + fArr[0] + " , " + fArr[1]);
        }
        return fArr;
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void vt() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar.ucs != 2) {
            vt(ouwVar.jvy, 1);
        } else if (ouwVar.mt) {
            vt(ouwVar.jvy, 8);
        } else {
            vt(ouwVar.jvy, 0);
        }
    }

    public final float yu() {
        return osn.vt(this.ouw.jvy, osn.mwh(this.ouw.jvy));
    }
}
