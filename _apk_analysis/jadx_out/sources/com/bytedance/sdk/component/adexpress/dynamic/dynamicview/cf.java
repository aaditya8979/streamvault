package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.PangleVideoBridge;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class cf extends le {
    private String ouw;

    public static class ouw implements com.bytedance.sdk.component.fkw.pno {
        private final WeakReference<Context> ouw;

        public ouw(Context context) {
            this.ouw = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.fkw.pno
        public final Bitmap ouw(Bitmap bitmap) {
            Context context = this.ouw.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.yu.ouw.ouw(context, bitmap, 25);
            }
            return null;
        }
    }

    public static class vt implements com.bytedance.sdk.component.fkw.rn {
        private WeakReference<View> ouw;
        private Resources vt;

        public vt(View view, Resources resources) {
            this.ouw = new WeakReference<>(view);
            this.vt = resources;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(int i10, String str, @Nullable Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
            Object objVt;
            View view = this.ouw.get();
            if (view == null || (objVt = cfVar.vt()) == null || cfVar.lh() == null) {
                return;
            }
            if (objVt instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.vt, (Bitmap) objVt));
            } else if (objVt instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && (objVt instanceof AnimatedImageDrawable)) {
                    ((AnimatedImageDrawable) objVt).start();
                }
                view.setBackground((Drawable) objVt);
            }
        }
    }

    public cf(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        Uri uri;
        super(context, dynamicRootView, pnoVar);
        if (!TextUtils.isEmpty(this.ryl.yu.f12289fn) && pnoVar.f12328jg) {
            com.bytedance.sdk.component.adexpress.le.tlj tljVar = new com.bytedance.sdk.component.adexpress.le.tlj(context);
            tljVar.setAnimationsLoop(this.ryl.yu.byv);
            tljVar.setImageLottieTosPath(this.ryl.yu.f12289fn);
            tljVar.setLottieAppNameMaxLength(this.ryl.yu.ehk);
            tljVar.setLottieAdTitleMaxLength(this.ryl.yu.f12292ki);
            tljVar.setLottieAdDescMaxLength(this.ryl.yu.xwt);
            tljVar.setData(pnoVar.f12329ko);
            this.f12215ko = tljVar;
        } else if (this.ryl.yu.ouw > 0.0f) {
            com.bytedance.sdk.component.adexpress.le.tc tcVar = new com.bytedance.sdk.component.adexpress.le.tc(context);
            this.f12215ko = tcVar;
            tcVar.setXRound((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, this.ryl.yu.ouw));
            ((com.bytedance.sdk.component.adexpress.le.tc) this.f12215ko).setYRound((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, this.ryl.yu.ouw));
        } else if (le() || !"arrowButton".equals(pnoVar.bly.ouw)) {
            String strBly = this.ryl.bly();
            boolean zEndsWith = false;
            if (!TextUtils.isEmpty(strBly) && (uri = Uri.parse(strBly)) != null) {
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                    zEndsWith = path.endsWith(".gif");
                }
            }
            if (zEndsWith) {
                this.f12215ko = new com.bytedance.sdk.component.adexpress.le.mwh(context);
            } else {
                this.f12215ko = new ImageView(context);
            }
        } else {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.vt vtVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.vt(context);
            vtVar.setBrickNativeValue(this.ryl);
            this.f12215ko = vtVar;
        }
        this.ouw = getImageKey();
        this.f12215ko.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(pnoVar.bly.ouw)) {
            if (this.ryl.vt() > 0 || this.ryl.ouw() > 0) {
                int iMin = Math.min(this.f12218ra, this.pno);
                this.f12218ra = iMin;
                this.pno = Math.min(iMin, this.pno);
                this.bly = (int) (this.bly + com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, this.ryl.vt() + (this.ryl.ouw() / 2) + 0.5f));
            } else {
                int iMax = Math.max(this.f12218ra, this.pno);
                this.f12218ra = iMax;
                this.pno = Math.max(iMax, this.pno);
            }
            this.ryl.yu.ouw = this.f12218ra / 2;
        }
        addView(this.f12215ko, new FrameLayout.LayoutParams(this.f12218ra, this.pno));
    }

    private String getImageKey() {
        Map<String, String> map = this.f12214jg.getRenderRequest().f12457ra;
        if (map == null || map.size() <= 0) {
            return null;
        }
        return map.get(this.ryl.bly());
    }

    private boolean pno() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        String str = raVar.f12334le;
        if (raVar.yu.odc) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            return Math.abs((((float) this.f12218ra) / (((float) this.pno) * 1.0f)) - (((float) jSONObjectJsonObjectInit.optInt("width")) / (((float) jSONObjectJsonObjectInit.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.f12215ko).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.f12215ko).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).stop();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        int iJg;
        super.ra();
        if (!TextUtils.isEmpty(this.ryl.yu.f12289fn)) {
            ((ImageView) this.f12215ko).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iMwh = 0;
        if ("arrowButton".equals(this.mwh.bly.ouw)) {
            ((ImageView) this.f12215ko).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(this.f12213cf, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.f12215ko).getDrawable() != null) {
                ((ImageView) this.f12215ko).getDrawable().setAutoMirrored(true);
            }
            this.f12215ko.setPadding(0, 0, 0, 0);
            ((ImageView) this.f12215ko).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.f12215ko.setBackgroundColor(this.ryl.mwh());
        String str = this.mwh.bly.vt;
        if ("user".equals(str)) {
            ((ImageView) this.f12215ko).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f12215ko).setColorFilter(this.ryl.le());
            ((ImageView) this.f12215ko).setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.f12215ko;
            int i10 = this.f12218ra;
            imageView.setPadding(i10 / 10, this.pno / 5, i10 / 10, 0);
        } else if (str != null && str.startsWith("@")) {
            try {
                ((ImageView) this.f12215ko).setImageResource(Integer.parseInt(str.substring(1)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        com.bytedance.sdk.component.fkw.ko koVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().yu;
        String strBly = this.ryl.bly();
        if (!TextUtils.isEmpty(strBly) && !strBly.startsWith("http:") && !strBly.startsWith("https:")) {
            String str2 = null;
            DynamicRootView dynamicRootView = this.f12214jg;
            if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                str2 = this.f12214jg.getRenderRequest().jqy;
            }
            strBly = com.bytedance.sdk.component.adexpress.dynamic.fkw.bly.vt(strBly, str2);
        }
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f12430lh;
        if (lhVar != null) {
            iMwh = lhVar.mwh();
            iJg = lhVar.jg();
        } else {
            iJg = 0;
        }
        com.bytedance.sdk.component.fkw.tlj tljVarFkw = koVar.ouw(strBly).ouw(this.ouw).ouw(this.f12218ra).vt(this.pno).yu(iMwh).fkw(iJg);
        String str3 = this.f12214jg.getRenderRequest().tlj;
        if (!TextUtils.isEmpty(str3)) {
            tljVarFkw.vt(str3);
        }
        if (pno()) {
            ((ImageView) this.f12215ko).setScaleType(ImageView.ScaleType.FIT_CENTER);
            tljVarFkw.ouw(Bitmap.Config.ARGB_4444).lh(2).ouw(new ouw(this.f12213cf)).vt(new vt(this.f12215ko, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                tljVarFkw.lh(1).ouw((ImageView) this.f12215ko);
            }
            ((ImageView) this.f12215ko).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.f12215ko instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.f12215ko).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }
}
