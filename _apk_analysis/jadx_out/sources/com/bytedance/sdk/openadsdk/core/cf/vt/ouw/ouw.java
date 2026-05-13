package com.bytedance.sdk.openadsdk.core.cf.vt.ouw;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.fkw;
import com.bytedance.adsdk.ugeno.ouw;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.adsdk.vt.tlj;
import com.bytedance.adsdk.vt.yu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class ouw extends lh<vt> {
    private float baa;
    private boolean byv;
    private boolean ehk;

    /* JADX INFO: renamed from: fg, reason: collision with root package name */
    private boolean f13564fg;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private String f13565fn;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f13566ki;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    public HashMap<String, Bitmap> f13567ln;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private float f13568nn;
    public String ouw;
    public ImageView.ScaleType qni;
    public ImageView.ScaleType smu;
    private boolean xwt;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw$1, reason: invalid class name */
    public class AnonymousClass1 implements yu {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.vt.yu
        public final Bitmap ouw(final tlj tljVar) {
            final String strOuw;
            if (tljVar == null) {
                return null;
            }
            String str = tljVar.fkw;
            String str2 = tljVar.yu;
            if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(str, ouw.this.yu);
            } else if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(str2, ouw.this.yu);
            } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                strOuw = null;
            } else {
                strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(str, ouw.this.yu) + com.bytedance.adsdk.ugeno.lh.vt.ouw(str2, ouw.this.yu);
            }
            if (TextUtils.isEmpty(strOuw)) {
                return null;
            }
            Bitmap bitmap = ouw.this.f13567ln.get(strOuw);
            if (bitmap != null) {
                return bitmap;
            }
            fkw.ouw().f11681lh.ouw(ouw.this.bly, strOuw, new ouw.InterfaceC0179ouw() { // from class: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw.1.1
                @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0179ouw
                public final void ouw(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        tlj tljVar2 = tljVar;
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, tljVar2.ouw, tljVar2.vt, false);
                        ouw.this.f13567ln.put(strOuw, bitmapCreateScaledBitmap);
                        ra.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((vt) ouw.this.fkw).ouw(tljVar.f12194lh, bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return ouw.this.f13567ln.get(strOuw);
        }
    }

    public ouw(Context context) {
        super(context);
        this.f13565fn = "images";
        this.f13564fg = true;
        this.f13568nn = 1.0f;
        this.qni = ImageView.ScaleType.FIT_CENTER;
        this.smu = ImageView.ScaleType.FIT_XY;
        this.f13567ln = new HashMap<>();
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        vt vtVar = new vt(this.vt);
        vtVar.f13570lh = this;
        return vtVar;
    }

    public final void ouw(AnimatorListenerAdapter animatorListenerAdapter) {
        ((vt) this.fkw).ouw(animatorListenerAdapter);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2;
        if (TextUtils.isEmpty(str)) {
        }
        super.ouw(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleMode":
                scaleType = ImageView.ScaleType.FIT_XY;
                str2.hashCode();
                switch (str2) {
                    case "center":
                    case "none":
                        scaleType = ImageView.ScaleType.CENTER;
                        break;
                    case "fit":
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                        break;
                    case "crop":
                        scaleType = ImageView.ScaleType.CENTER_CROP;
                        break;
                    case "fill":
                        scaleType = ImageView.ScaleType.FIT_XY;
                        break;
                }
                this.smu = scaleType;
                break;
            case "scaleType":
                scaleType2 = ImageView.ScaleType.FIT_XY;
                str2.hashCode();
                switch (str2) {
                    case "center":
                        scaleType2 = ImageView.ScaleType.CENTER;
                        break;
                    case "fitEnd":
                        scaleType2 = ImageView.ScaleType.FIT_END;
                        break;
                    case "fitStart":
                        scaleType2 = ImageView.ScaleType.FIT_START;
                        break;
                    case "centerInside":
                        scaleType2 = ImageView.ScaleType.CENTER_INSIDE;
                        break;
                    case "fitXY":
                        scaleType2 = ImageView.ScaleType.FIT_XY;
                        break;
                    case "fitCenter":
                        scaleType2 = ImageView.ScaleType.FIT_CENTER;
                        break;
                    case "centerCrop":
                        scaleType2 = ImageView.ScaleType.CENTER_CROP;
                        break;
                }
                this.qni = scaleType2;
                break;
            case "progress":
                this.baa = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case "imagePath":
                this.f13565fn = str2;
                break;
            case "autoReverse":
                this.byv = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, false);
                break;
            case "src":
                this.ouw = com.bytedance.sdk.openadsdk.core.cf.lh.ouw(str2);
                break;
            case "loop":
                if (!ex()) {
                    this.ehk = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, false);
                    break;
                } else {
                    this.f13566ki = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0);
                    break;
                }
                break;
            case "speed":
                this.f13568nn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f);
                break;
            case "autoPlay":
                this.xwt = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, false);
                break;
            case "autoplay":
                this.f13564fg = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    @Override // com.bytedance.adsdk.ugeno.vt.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vt() {
        /*
            r3 = this;
            super.vt()
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            float r1 = r3.baa
            r0.setProgress(r1)
            float r0 = r3.f13568nn
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L17
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.f13568nn = r0
        L17:
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            float r1 = r3.f13568nn
            r0.setSpeed(r1)
            java.lang.String r0 = r3.ouw
            java.lang.String r1 = "local"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L61
            java.lang.String r0 = r3.ouw
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4e
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L4e
            java.lang.String r1 = "shake_phone"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L43
            java.lang.String r0 = "lottie_json/shake_phone.json"
            goto L50
        L43:
            java.lang.String r1 = "swipe_right"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L4e
            java.lang.String r0 = "lottie_json/swipe_right.json"
            goto L50
        L4e:
            java.lang.String r0 = ""
        L50:
            T extends android.view.View r1 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r1 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r1
            r1.setAnimation(r0)
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            java.lang.String r1 = r3.f13565fn
            r0.setImageAssetsFolder(r1)
            goto L6a
        L61:
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            java.lang.String r1 = r3.ouw
            r0.setAnimationFromUrl(r1)
        L6a:
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw$1 r1 = new com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw$1
            r1.<init>()
            r0.setImageAssetDelegate(r1)
            boolean r0 = r3.ex()
            if (r0 == 0) goto L86
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            android.widget.ImageView$ScaleType r1 = r3.smu
            r0.setScaleType(r1)
            goto L8f
        L86:
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            android.widget.ImageView$ScaleType r1 = r3.qni
            r0.setScaleType(r1)
        L8f:
            boolean r0 = r3.ex()
            if (r0 == 0) goto L9f
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            int r1 = r3.f13566ki
            r0.setRepeatCount(r1)
            goto La8
        L9f:
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            boolean r1 = r3.ehk
            r0.ouw(r1)
        La8:
            boolean r0 = r3.ex()
            if (r0 == 0) goto Lbc
            T extends android.view.View r0 = r3.fkw
            if (r0 == 0) goto Lc5
            boolean r1 = r3.f13564fg
            if (r1 == 0) goto Lc5
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            r0.ouw()
            return
        Lbc:
            T extends android.view.View r0 = r3.fkw
            if (r0 == 0) goto Lc5
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            r0.ouw()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw.vt():void");
    }
}
