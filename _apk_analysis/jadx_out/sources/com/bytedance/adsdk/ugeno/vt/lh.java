package com.bytedance.adsdk.ugeno.vt;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.jg;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.core.pno;
import com.bytedance.adsdk.ugeno.core.ra;
import com.bytedance.adsdk.ugeno.core.rn;
import com.bytedance.adsdk.ugeno.core.tlj;
import com.bytedance.adsdk.ugeno.core.vm;
import com.bytedance.adsdk.ugeno.core.vt.fkw;
import com.bytedance.adsdk.ugeno.core.vt.yu;
import com.bytedance.adsdk.ugeno.ouw;
import com.bytedance.adsdk.ugeno.ouw.le;
import com.bytedance.adsdk.ugeno.ra.ouw;
import com.bytedance.adsdk.ugeno.vt.ouw;
import com.bytedance.adsdk.ugeno.yu;
import com.bytedance.adsdk.ugeno.yu.bly;
import com.ironsource.C3978d4;
import io.appmetrica.analytics.impl.A2;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class lh<T extends View> implements View.OnTouchListener, ko.ouw, yu {
    private tlj ajl;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private boolean f11810ak;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    public float f11811an;
    private String baa;
    public cf bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    public boolean f11812bs;
    private boolean byv;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public float f11813cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f11814cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    public float f11815cj;
    public le coz;
    private boolean cu;
    public boolean eay;
    private boolean ehk;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.vt.vt eot;
    public float euf;
    public boolean ex;
    public String ey;
    public boolean fak;

    /* JADX INFO: renamed from: fg, reason: collision with root package name */
    private GradientDrawable f11816fg;
    public T fkw;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private boolean f11817fn;
    public boolean fqk;
    public boolean fvf;
    public com.bytedance.adsdk.ugeno.ouw.ouw fwd;

    /* JADX INFO: renamed from: gh, reason: collision with root package name */
    public float f11818gh;
    private boolean hsa;
    public boolean hun;
    public vm ixm;
    public float jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public float f11819jg;
    public boolean jqy;
    public float jvy;
    public ko kfa;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f11820ki;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    public boolean f11821kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public float f11822ko;

    /* JADX INFO: renamed from: kq, reason: collision with root package name */
    private boolean f11823kq;
    public float ksc;

    @Deprecated
    private yu.ouw lai;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ouw<ViewGroup> f11824le;
    public com.bytedance.adsdk.ugeno.yu.ouw.ouw lgp;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public JSONObject f11825lh;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    private boolean f11826ln;
    private boolean lna;
    public float lso;
    public float lvd;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    public float f11827mq;

    /* JADX INFO: renamed from: ms, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.core.le f11828ms;
    public String mt;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.vt.lh mu;
    public Map<Integer, mwh> mwe;
    public float mwh;
    public boolean myk;
    private boolean nbp;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    public ViewGroup.LayoutParams f11829ng;
    public float njr;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.ouw f11830nn;
    public float npr;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public float f11831od;
    public float odc;
    public int osn;
    private boolean ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public boolean f11832pd;
    public ra.ouw pno;
    public float pv;
    public float qbp;
    public boolean qld;
    private boolean qni;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public ouw<ViewGroup> f11833ra;

    /* JADX INFO: renamed from: rh, reason: collision with root package name */
    private JSONObject f11834rh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public float f11835rn;
    public ImageView.ScaleType rrs;
    public String ryl;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public float f11836sd;

    /* JADX INFO: renamed from: sm, reason: collision with root package name */
    private String f11837sm;
    private boolean smu;
    private boolean swm;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public boolean f11838tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public float f11839th;
    public boolean tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    public float f11840ub;
    public boolean ucs;
    public boolean uoy;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    public float f11841uq;
    public float ux;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private boolean f11842vf;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    public boolean f11843vh;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    public float f11844vi;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public float f11845vm;
    public boolean vpp;
    private boolean vrp;
    public Context vt;
    public long wbf;

    /* JADX INFO: renamed from: wp, reason: collision with root package name */
    public boolean f11846wp;
    public int xdk;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    public boolean f11847xn;

    @Deprecated
    private fkw xne;
    private boolean xwt;
    public float ycd;
    public int yhj;
    public float yib;
    public ouw.C0181ouw yiz;
    public JSONObject yu;
    public rn yw;
    public float zih;
    public float zin;
    public pno zjp;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.vt.le zjq;
    public bly zrz;
    private float zu;
    public float zvq;

    public lh(Context context) {
        this(context, null);
    }

    public lh(Context context, ouw<ViewGroup> ouwVar) {
        this.mwh = -2.0f;
        this.f11819jg = -2.0f;
        this.mt = "solid";
        this.xdk = 0;
        this.myk = true;
        this.lvd = 0.0f;
        this.f11836sd = 0.0f;
        this.euf = 0.0f;
        this.njr = 1.0f;
        this.f11827mq = 1.0f;
        this.f11811an = 1.0f;
        this.f11818gh = 0.0f;
        this.ycd = 0.0f;
        this.odc = 0.0f;
        this.f11844vi = 0.0f;
        this.npr = 1.0f;
        this.xwt = true;
        this.f11810ak = true;
        this.vrp = false;
        this.lna = false;
        this.eay = false;
        this.zu = 12.0f;
        this.vt = context;
        this.f11824le = ouwVar;
        this.mwe = new HashMap();
        this.f11816fg = new GradientDrawable();
        this.fkw = (T) ouw();
    }

    private void bly() {
        if (TextUtils.equals("dashed", this.mt)) {
            GradientDrawable gradientDrawable = this.f11816fg;
            float f10 = this.yib;
            gradientDrawable.setStroke((int) f10, this.yhj, 3.0f * f10, f10);
        } else {
            if (!TextUtils.equals("dotted", this.mt)) {
                this.f11816fg.setStroke((int) this.yib, this.yhj);
                return;
            }
            GradientDrawable gradientDrawable2 = this.f11816fg;
            float f11 = this.yib;
            gradientDrawable2.setStroke((int) f11, this.yhj, f11 / 2.0f, f11);
        }
    }

    private void jvy() {
        float f10 = this.f11846wp ? this.lso : this.ux;
        float f11 = this.f11821kn ? this.f11815cj : this.ux;
        float f12 = this.ucs ? this.f11840ub : this.ux;
        float f13 = this.f11843vh ? this.pv : this.ux;
        this.f11816fg.setCornerRadii(new float[]{f10, f10, f11, f11, f13, f13, f12, f12});
    }

    @Deprecated
    private void ouw(int i10, JSONObject jSONObject, mwh mwhVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            mwh mwhVar2 = new mwh();
            mwhVar2.f11642lh = jSONObjectOptJSONObject;
            mwhVar2.ouw = this;
            mwhVar.yu = mwhVar2;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C3978d4.g.f31293e);
        if (jSONObjectOptJSONObject2 != null) {
            mwh mwhVar3 = new mwh();
            mwhVar3.f11642lh = jSONObjectOptJSONObject2;
            mwhVar3.ouw = this;
            mwhVar.fkw = mwhVar3;
        }
        mwhVar.f11642lh = jSONObject;
        this.mwe.put(Integer.valueOf(i10), mwhVar);
    }

    private boolean ouw(int i10) {
        Map<Integer, mwh> map = this.mwe;
        return map != null && map.containsKey(Integer.valueOf(i10));
    }

    private void pno() {
        this.eay = this.yu.optBoolean("gesture_through_enable", false);
        Log.d("GesThrough_UGenWidget", "mGestureThroughEnabled: " + this.eay);
    }

    public static lh vt(lh lhVar) {
        while (true) {
            ouw<ViewGroup> ouwVar = lhVar.f11824le;
            if (ouwVar == null && (lhVar instanceof ouw)) {
                return lhVar;
            }
            lhVar = ouwVar;
        }
    }

    public final void bly(String str) {
        this.f11814cf = str;
    }

    public void bs() {
    }

    public final int cd() {
        return (int) this.f11819jg;
    }

    public final float cf() {
        return this.f11836sd;
    }

    public final com.bytedance.adsdk.ugeno.ouw.ouw cf(String str) {
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar = this.fwd;
        if (ouwVar != null && TextUtils.equals(str, ouwVar.vt)) {
            return this.fwd;
        }
        le leVar = this.coz;
        if (leVar != null) {
            return leVar.ouw(str);
        }
        return null;
    }

    public final boolean ex() {
        return this.tlj;
    }

    public final float ey() {
        T t10 = this.fkw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ouw.ra) {
            return ((com.bytedance.adsdk.ugeno.ouw.ra) t10).getStretch();
        }
        return 0.0f;
    }

    public final boolean fak() {
        return this.zvq > 0.0f;
    }

    public final lh<T> fkw(String str) {
        return ouw(str);
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void fkw() {
        if (this.ixm == null || this.hsa) {
            return;
        }
        this.hsa = true;
    }

    public void fvf() {
    }

    public final String jae() {
        return this.ryl;
    }

    public final float jg() {
        return this.f11811an;
    }

    public final ra.ouw jqy() {
        return this.pno;
    }

    public final float ko() {
        return this.ycd;
    }

    public final String ksc() {
        return this.f11814cf;
    }

    public final lh<T> le(String str) {
        return vt(str);
    }

    public void le() {
        com.bytedance.adsdk.ugeno.core.vt.le leVar;
        mwh mwhVar;
        com.bytedance.adsdk.ugeno.core.vt.vt vtVar;
        mwh mwhVar2;
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw;
        List<com.bytedance.adsdk.ugeno.ouw.ouw> list;
        com.bytedance.adsdk.ugeno.core.ouw ouwVar = this.f11830nn;
        if (ouwVar != null) {
            tlj tljVar = new tlj(this.fkw, ouwVar);
            this.ajl = tljVar;
            tljVar.ouw();
        }
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 = this.fwd;
        if (ouwVar2 != null) {
            ouwVar2.ouw();
        }
        le leVar2 = this.coz;
        if (leVar2 != null && (list = leVar2.ouw) != null && !list.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.ouw.ouw ouwVar3 : leVar2.ouw) {
                if (ouwVar3 != null) {
                    ouwVar3.ouw();
                }
            }
        }
        bly blyVar = this.zrz;
        if (blyVar != null && (listOuw = blyVar.ouw("timer")) != null && !listOuw.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
                if (lhVar != null) {
                    lhVar.ouw = blyVar;
                    lhVar.ouw(new Object[0]);
                }
            }
        }
        if (this.eot != null && ouw(10) && (mwhVar2 = (vtVar = this.eot).f11677lh) != null) {
            try {
                int i10 = Integer.parseInt(com.bytedance.adsdk.ugeno.lh.vt.ouw(mwhVar2.f11642lh.optString("delay"), vtVar.yu.yu));
                vtVar.ouw = i10;
                vtVar.fkw.sendEmptyMessageDelayed(1001, i10);
            } catch (NumberFormatException e10) {
                e10.printStackTrace();
            }
        }
        if (this.zjq != null && ouw(9) && (mwhVar = (leVar = this.zjq).yu) != null) {
            JSONObject jSONObject = mwhVar.f11642lh;
            try {
                leVar.vt = Integer.parseInt(com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("interval", "8000"), leVar.fkw.yu));
                leVar.ouw = jSONObject.optBoolean("repeat");
                leVar.f11670le.sendEmptyMessageDelayed(1001, leVar.vt);
            } catch (NumberFormatException e11) {
                e11.printStackTrace();
            }
        }
        final fkw fkwVar = this.xne;
        if (fkwVar != null && fkwVar.yu != Integer.MAX_VALUE) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.vt.fkw.1
                @Override // java.lang.Runnable
                public final void run() {
                    fkw.this.fkw.set(false);
                    Log.d("GesThrough_UGSREvent", "inEffectiveDuation -> false");
                }
            }, fkwVar.yu);
        }
        this.wbf = System.currentTimeMillis();
    }

    public lh<T> lh(String str) {
        if (!TextUtils.isEmpty(this.ryl) && TextUtils.equals(this.ryl, str) && this.xdk == 0) {
            return this;
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void lh() {
        if (this.ixm == null || this.nbp) {
            return;
        }
        this.nbp = true;
    }

    public final void lh(int i10) {
        this.f11816fg.setShape(0);
        this.f11816fg.setColor(i10);
        jvy();
        bly();
        this.fkw.setBackground(this.f11816fg);
    }

    public final void lh(JSONObject jSONObject) {
        this.f11825lh = jSONObject;
    }

    public final float mwh() {
        return this.f11827mq;
    }

    public final int od() {
        return (int) this.mwh;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.vt.lh.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final float osn() {
        T t10 = this.fkw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ouw.ra) {
            return ((com.bytedance.adsdk.ugeno.ouw.ra) t10).getShine();
        }
        return 0.0f;
    }

    public T ouw() {
        return null;
    }

    public lh<T> ouw(String str) {
        if (TextUtils.isEmpty(this.f11814cf) || !TextUtils.equals(this.f11814cf, str)) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void ouw(Canvas canvas) {
        List<com.bytedance.adsdk.ugeno.ouw.ouw> list;
        if (this instanceof ouw) {
            return;
        }
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar = this.fwd;
        if (ouwVar != null) {
            ouwVar.ouw(canvas);
        }
        le leVar = this.coz;
        if (leVar == null || (list = leVar.ouw) == null || list.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 : leVar.ouw) {
            if (ouwVar2 != null) {
                ouwVar2.ouw(canvas);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void ouw(Canvas canvas, IAnimation iAnimation) {
        tlj tljVar = this.ajl;
        if (tljVar != null) {
            try {
                if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(tljVar.f11663le)) {
                    return;
                }
                tljVar.fkw.setColor(com.bytedance.adsdk.ugeno.ra.ouw.ouw(tljVar.f11663le, ViewCompat.MEASURED_STATE_MASK));
                tljVar.fkw.setAlpha(90);
                ((ViewGroup) tljVar.vt.getParent()).setClipChildren(true);
                canvas.drawCircle(tljVar.f11664lh, tljVar.yu, Math.min(r1, r3) * 2 * iAnimation.getRipple(), tljVar.fkw);
            } catch (Throwable th2) {
                Log.d("UGenAnimation", "ripple animation error " + th2.getMessage());
            }
        }
    }

    public void ouw(Drawable drawable) {
        this.fkw.setBackground(drawable);
    }

    public final void ouw(ViewGroup.LayoutParams layoutParams) {
        T t10 = this.fkw;
        if (t10 != null) {
            t10.setLayoutParams(layoutParams);
        }
        this.f11829ng = layoutParams;
    }

    public final void ouw(com.bytedance.adsdk.ugeno.core.fkw fkwVar) {
        bly blyVar = this.zrz;
        if (blyVar != null) {
            blyVar.ouw = fkwVar;
        }
    }

    public final void ouw(ko koVar) {
        this.kfa = koVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko.ouw
    public final void ouw(mwh mwhVar) {
        JSONObject jSONObject;
        ouw<ViewGroup> ouwVar;
        lh<T> lhVarOuw;
        if (mwhVar == null || (jSONObject = mwhVar.f11642lh) == null || !TextUtils.equals(jSONObject.optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = mwhVar.f11642lh.optString("nodeId");
        vt(8);
        this.f11833ra = (ouw) vt(this);
        if (TextUtils.isEmpty(strOptString) || (ouwVar = this.f11833ra) == null || (lhVarOuw = ouwVar.ouw(strOptString)) == null) {
            return;
        }
        lhVarOuw.vt(8);
    }

    public final void ouw(pno pnoVar) {
        this.zjp = pnoVar;
    }

    public final void ouw(ra.ouw ouwVar) {
        this.pno = ouwVar;
    }

    public final void ouw(rn rnVar) {
        this.yw = rnVar;
    }

    public final void ouw(ouw.C0181ouw c0181ouw) {
        if (c0181ouw == null) {
            return;
        }
        this.f11816fg.setShape(0);
        this.f11816fg.setOrientation(c0181ouw.ouw);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f11816fg.setColors(c0181ouw.vt, c0181ouw.f11797lh);
        } else {
            this.f11816fg.setColors(c0181ouw.vt);
        }
        jvy();
        bly();
        this.fkw.setBackground(this.f11816fg);
    }

    public final void ouw(ouw ouwVar) {
        this.f11824le = ouwVar;
    }

    public final void ouw(com.bytedance.adsdk.ugeno.yu.mwh mwhVar) {
        bly blyVar = this.zrz;
        if (blyVar != null) {
            blyVar.vt = mwhVar;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void ouw(String str, String str2) {
        byte b10;
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1964681502:
                b10 = !str.equals("clickable") ? (byte) -1 : (byte) 0;
                break;
            case -1901681170:
                b10 = !str.equals("onRenderSuccess") ? (byte) -1 : (byte) 1;
                break;
            case -1721943862:
                b10 = !str.equals("translateX") ? (byte) -1 : (byte) 2;
                break;
            case -1721943861:
                b10 = !str.equals("translateY") ? (byte) -1 : (byte) 3;
                break;
            case -1501175880:
                b10 = !str.equals("paddingLeft") ? (byte) -1 : (byte) 4;
                break;
            case -1375815020:
                b10 = !str.equals("minWidth") ? (byte) -1 : (byte) 5;
                break;
            case -1351184668:
                b10 = !str.equals("onDelay") ? (byte) -1 : (byte) 6;
                break;
            case -1337252761:
                b10 = !str.equals("onShake") ? (byte) -1 : (byte) 7;
                break;
            case -1337126126:
                b10 = !str.equals("onSlide") ? (byte) -1 : (byte) 8;
                break;
            case -1336288090:
                b10 = !str.equals("onTimer") ? (byte) -1 : (byte) 9;
                break;
            case -1335874424:
                b10 = !str.equals("onTwist") ? (byte) -1 : (byte) 10;
                break;
            case -1332194002:
                b10 = !str.equals(A2.f64965g) ? (byte) -1 : (byte) 11;
                break;
            case -1291329255:
                b10 = !str.equals("events") ? (byte) -1 : (byte) 12;
                break;
            case -1267206133:
                b10 = !str.equals(VastAttributes.OPACITY) ? (byte) -1 : (byte) 13;
                break;
            case -1228066334:
                b10 = !str.equals("borderTopLeftRadius") ? (byte) -1 : (byte) 14;
                break;
            case -1221029593:
                b10 = !str.equals("height") ? (byte) -1 : (byte) 15;
                break;
            case -1081309778:
                b10 = !str.equals(VastAttributes.MARGIN) ? (byte) -1 : (byte) 16;
                break;
            case -1044792121:
                b10 = !str.equals("marginTop") ? (byte) -1 : (byte) 17;
                break;
            case -1013407967:
                b10 = !str.equals("onDown") ? (byte) -1 : (byte) 18;
                break;
            case -933876756:
                b10 = !str.equals("backgroundDrawable") ? (byte) -1 : (byte) 19;
                break;
            case -925180581:
                b10 = !str.equals("rotate") ? (byte) -1 : (byte) 20;
                break;
            case -908189618:
                b10 = !str.equals("scaleX") ? (byte) -1 : (byte) 21;
                break;
            case -908189617:
                b10 = !str.equals("scaleY") ? (byte) -1 : (byte) 22;
                break;
            case -806339567:
                b10 = !str.equals(VastAttributes.PADDING) ? (byte) -1 : (byte) 23;
                break;
            case -681357156:
                b10 = !str.equals("triggerFunc") ? (byte) -1 : (byte) 24;
                break;
            case -289173127:
                b10 = !str.equals("marginBottom") ? (byte) -1 : (byte) 25;
                break;
            case -133587431:
                b10 = !str.equals("minHeight") ? (byte) -1 : (byte) 26;
                break;
            case 3355:
                b10 = !str.equals("id") ? (byte) -1 : (byte) 27;
                break;
            case 3176990:
                b10 = !str.equals("i18n") ? (byte) -1 : (byte) 28;
                break;
            case 3373707:
                b10 = !str.equals("name") ? (byte) -1 : (byte) 29;
                break;
            case 87811796:
                b10 = !str.equals("backgroundImageBlur") ? (byte) -1 : (byte) 30;
                break;
            case 90130308:
                b10 = !str.equals("paddingTop") ? (byte) -1 : (byte) 31;
                break;
            case 94750088:
                b10 = !str.equals("click") ? (byte) -1 : (byte) 32;
                break;
            case 105871684:
                b10 = !str.equals("onTap") ? (byte) -1 : (byte) 33;
                break;
            case 108285963:
                b10 = !str.equals("ratio") ? (byte) -1 : (byte) 34;
                break;
            case 109250890:
                b10 = !str.equals("scale") ? (byte) -1 : (byte) 35;
                break;
            case 113126854:
                b10 = !str.equals("width") ? (byte) -1 : (byte) 36;
                break;
            case 202355100:
                b10 = !str.equals("paddingBottom") ? (byte) -1 : (byte) 37;
                break;
            case 314070383:
                b10 = !str.equals("animations") ? (byte) -1 : (byte) 38;
                break;
            case 320386138:
                b10 = !str.equals("onLoadMore") ? (byte) -1 : (byte) 39;
                break;
            case 333432965:
                b10 = !str.equals("borderTopRightRadius") ? (byte) -1 : (byte) 40;
                break;
            case 529642498:
                b10 = !str.equals("overflow") ? (byte) -1 : (byte) 41;
                break;
            case 581268560:
                b10 = !str.equals("borderBottomLeftRadius") ? (byte) -1 : ExifInterface.START_CODE;
                break;
            case 588239831:
                b10 = !str.equals("borderBottomRightRadius") ? (byte) -1 : (byte) 43;
                break;
            case 713848971:
                b10 = !str.equals("paddingRight") ? (byte) -1 : (byte) 44;
                break;
            case 722830999:
                b10 = !str.equals("borderColor") ? (byte) -1 : (byte) 45;
                break;
            case 737768677:
                b10 = !str.equals("borderStyle") ? (byte) -1 : (byte) 46;
                break;
            case 741115130:
                b10 = !str.equals("borderWidth") ? (byte) -1 : (byte) 47;
                break;
            case 843948038:
                b10 = !str.equals("onExposure") ? (byte) -1 : (byte) 48;
                break;
            case 975087886:
                b10 = !str.equals("marginRight") ? (byte) -1 : (byte) 49;
                break;
            case 1052832078:
                b10 = !str.equals("translate") ? (byte) -1 : (byte) 50;
                break;
            case 1087723621:
                b10 = !str.equals("onAnimation") ? (byte) -1 : (byte) 51;
                break;
            case 1118509956:
                b10 = !str.equals("animation") ? (byte) -1 : (byte) 52;
                break;
            case 1151851515:
                b10 = !str.equals("animatorSet") ? (byte) -1 : (byte) 53;
                break;
            case 1158381436:
                b10 = !str.equals("onPullToRefresh") ? (byte) -1 : (byte) 54;
                break;
            case 1287124693:
                b10 = !str.equals("backgroundColor") ? (byte) -1 : (byte) 55;
                break;
            case 1292595405:
                b10 = !str.equals("backgroundImage") ? (byte) -1 : (byte) 56;
                break;
            case 1301532860:
                b10 = !str.equals("backgroundScale") ? (byte) -1 : (byte) 57;
                break;
            case 1349188574:
                b10 = !str.equals("borderRadius") ? (byte) -1 : (byte) 58;
                break;
            case 1384173149:
                b10 = !str.equals("rotateX") ? (byte) -1 : (byte) 59;
                break;
            case 1384173150:
                b10 = !str.equals("rotateY") ? (byte) -1 : (byte) 60;
                break;
            case 1384173151:
                b10 = !str.equals("rotateZ") ? (byte) -1 : (byte) 61;
                break;
            case 1490730380:
                b10 = !str.equals("onScroll") ? (byte) -1 : (byte) 62;
                break;
            case 1671308008:
                b10 = !str.equals("disable") ? (byte) -1 : (byte) 63;
                break;
            case 1685004456:
                b10 = !str.equals("onLongTap") ? (byte) -1 : (byte) 64;
                break;
            case 1941332754:
                b10 = !str.equals("visibility") ? (byte) -1 : (byte) 65;
                break;
            case 1970934485:
                b10 = !str.equals("marginLeft") ? (byte) -1 : (byte) 66;
                break;
            case 1997542747:
                b10 = !str.equals("availability") ? (byte) -1 : (byte) 67;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                this.f11810ak = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 18:
            case 33:
            case 39:
            case 48:
            case 51:
            case 54:
            case 62:
            case 64:
                vt(str, str2);
                break;
            case 2:
                this.ouw = true;
                this.f11836sd = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case 3:
                this.f11826ln = true;
                this.euf = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case 4:
                this.jae = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.fvf = true;
                break;
            case 5:
                this.qbp = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 11:
            case 55:
                if (!com.bytedance.adsdk.ugeno.ra.ouw.lh(str2)) {
                    this.osn = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, 0);
                    this.qld = false;
                } else {
                    this.qld = true;
                    this.yiz = com.bytedance.adsdk.ugeno.ra.ouw.vt(str2);
                }
                break;
            case 12:
                this.zrz = bly.ouw(this, str2);
                break;
            case 13:
                this.f11820ki = true;
                this.npr = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f);
                break;
            case 14:
                this.lso = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.f11846wp = true;
                break;
            case 15:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.f11819jg = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.f11819jg = -2.0f;
                } else {
                    this.f11819jg = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                }
                this.lna = true;
                break;
            case 16:
                this.f11822ko = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                break;
            case 17:
                this.f11845vm = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.ex = true;
                break;
            case 19:
            case 56:
                this.ey = str2;
                break;
            case 20:
                this.f11817fn = true;
                this.f11818gh = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 21:
                this.qni = true;
                this.f11827mq = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 22:
                this.smu = true;
                this.f11811an = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 23:
                this.ksc = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.f11832pd = true;
                break;
            case 24:
                this.f11837sm = str2;
                break;
            case 25:
                this.f11839th = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.f11838tc = true;
                break;
            case 26:
                this.zin = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 27:
                this.f11814cf = str2;
                break;
            case 28:
                this.f11834rh = com.bytedance.adsdk.ugeno.ra.vt.ouw(str2, (JSONObject) null);
                break;
            case 29:
                this.ryl = str2;
                break;
            case 30:
                float fOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                this.jvy = fOuw;
                if (fOuw > 0.0f) {
                    this.fqk = true;
                }
                break;
            case 31:
                this.f11813cd = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.fak = true;
                break;
            case 32:
                this.baa = str2;
                break;
            case 34:
                this.zvq = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 35:
                this.qni = true;
                this.smu = true;
                float[] fArrOuw = com.bytedance.adsdk.ugeno.ouw.yu.ouw(str2);
                this.f11827mq = fArrOuw[0];
                this.f11811an = fArrOuw[1];
                break;
            case 36:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.mwh = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.mwh = -2.0f;
                } else {
                    this.mwh = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                }
                this.vrp = true;
                break;
            case 37:
                this.f11841uq = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.uoy = true;
                break;
            case 38:
                List<com.bytedance.adsdk.ugeno.ouw.lh> listOuw = com.bytedance.adsdk.ugeno.ouw.yu.ouw(str2, this.yu);
                if (listOuw != null && !listOuw.isEmpty()) {
                    this.coz = new le(this.vt, this, listOuw);
                    break;
                }
                break;
            case 40:
                this.f11815cj = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.f11821kn = true;
                break;
            case 41:
                this.xwt = TextUtils.isEmpty(str2) || !TextUtils.equals(str2, "hidden");
                break;
            case 42:
                this.f11840ub = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.ucs = true;
                break;
            case 43:
                this.pv = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.f11843vh = true;
                break;
            case 44:
                this.f11831od = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.f11812bs = true;
                break;
            case 45:
                this.yhj = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                break;
            case 46:
                this.mt = str2;
                break;
            case 47:
                this.yib = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                break;
            case 49:
                this.zih = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.jqy = true;
                break;
            case 50:
                this.ouw = true;
                this.f11826ln = true;
                float[] fArrOuw2 = com.bytedance.adsdk.ugeno.ouw.yu.ouw(str2);
                this.f11836sd = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, fArrOuw2[0]);
                this.euf = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, fArrOuw2[1]);
                break;
            case 52:
                try {
                    this.fwd = new com.bytedance.adsdk.ugeno.ouw.ouw(this.vt, this, com.bytedance.adsdk.ugeno.ouw.yu.ouw(new JSONObject(str2), this.yu));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
            case 53:
                this.f11830nn = com.bytedance.adsdk.ugeno.core.ouw.ouw(str2, this);
                break;
            case 57:
                this.hun = true;
                str2.hashCode();
                switch (str2) {
                    case "center":
                        this.rrs = ImageView.ScaleType.CENTER;
                        break;
                    case "fit":
                        this.rrs = ImageView.ScaleType.FIT_CENTER;
                        break;
                    case "crop":
                        this.rrs = ImageView.ScaleType.CENTER_CROP;
                        break;
                    default:
                        this.rrs = ImageView.ScaleType.FIT_XY;
                        break;
                }
                this.rrs = this.rrs;
                break;
            case 58:
                this.ux = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                break;
            case 59:
                this.byv = true;
                this.ycd = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 60:
                this.ehk = true;
                this.odc = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 61:
                this.f11844vi = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 63:
                this.f11847xn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, false);
                break;
            case 65:
                if (TextUtils.equals(VastAttributes.VISIBLE, str2)) {
                    this.xdk = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.xdk = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.xdk = 8;
                }
                this.fkw.setVisibility(this.xdk);
                break;
            case 66:
                this.f11835rn = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, str2);
                this.vpp = true;
                break;
            case 67:
                this.myk = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    public final void ouw(String str, Object... objArr) {
        bly blyVar;
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = (TextUtils.isEmpty(str) || (blyVar = this.zrz) == null) ? null : blyVar.ouw(str);
        if (listOuw == null || listOuw.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
            lhVar.ouw = this.zrz;
            lhVar.ouw(objArr);
        }
    }

    public void ouw(JSONObject jSONObject) {
        JSONObject jSONObject2;
        this.yu = jSONObject;
        pno();
        JSONObject jSONObject3 = this.f11825lh;
        if (jSONObject3 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject3.keys();
        ouw<ViewGroup> ouwVar = this.f11824le;
        ouw.C0182ouw c0182ouwBly = ouwVar instanceof ouw ? ouwVar.bly() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(this.f11825lh.optString(next), jSONObject);
            ouw(next, strOuw);
            if (c0182ouwBly != null) {
                c0182ouwBly.ouw(this.vt, next, strOuw);
            }
        }
        if (c0182ouwBly != null) {
            ouw(c0182ouwBly.ouw());
        }
        JSONObject jSONObject4 = this.f11834rh;
        if (jSONObject4 == null || (jSONObject2 = this.yu) == null) {
            return;
        }
        try {
            if (!this.tlj) {
                jSONObject2.put("i18n", jSONObject4);
                return;
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("i18n", this.f11834rh);
            this.yu.put("xNode", jSONObject5);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final void ouw(boolean z10) {
        this.tlj = z10;
    }

    public final void ouw(boolean z10, boolean z11) {
        if (this.fkw != null) {
            ouw(this.f11829ng);
            if (z10) {
                yu((int) this.mwh);
            }
            if (z11) {
                int i10 = (int) this.f11819jg;
                if (!this.tlj) {
                    ViewGroup.LayoutParams layoutParams = this.fkw.getLayoutParams();
                    layoutParams.height = i10;
                    this.fkw.setLayoutParams(layoutParams);
                    return;
                }
                T t10 = this.fkw;
                if (t10 instanceof vt) {
                    ((vt) t10).vt(i10);
                    return;
                }
                ViewParent viewParent = (ViewGroup) t10.getParent();
                if (viewParent instanceof vt) {
                    ((vt) viewParent).vt(this.fkw, i10);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final int[] ouw(int i10, int i11) {
        if (this.zvq > 0.0f) {
            if (this.vrp) {
                int size = View.MeasureSpec.getSize(i10);
                float f10 = this.zvq;
                if (f10 != 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                }
            } else if (this.lna) {
                int size2 = View.MeasureSpec.getSize(i11);
                float f11 = this.zvq;
                if (f11 != 0.0f) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                }
            }
        }
        if (this.ixm != null && !this.cu) {
            this.cu = true;
        }
        return new int[]{i10, i11};
    }

    public final int pd() {
        return this.osn;
    }

    public final lh<T> pno(String str) {
        return yu(str);
    }

    public final JSONObject qbp() {
        return this.f11825lh;
    }

    public final lh<T> ra(String str) {
        return lh(str);
    }

    public void ra() {
        List<com.bytedance.adsdk.ugeno.ouw.ouw> list;
        AnimatorSet animatorSet;
        tlj tljVar = this.ajl;
        if (tljVar != null && (animatorSet = tljVar.ouw) != null) {
            animatorSet.cancel();
        }
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar = this.fwd;
        if (ouwVar != null) {
            ouwVar.vt();
        }
        le leVar = this.coz;
        if (leVar == null || (list = leVar.ouw) == null || list.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 : leVar.ouw) {
            if (ouwVar2 != null) {
                ouwVar2.vt();
            }
        }
    }

    public final float rn() {
        return this.odc;
    }

    public final float rrs() {
        T t10 = this.fkw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ouw.ra) {
            return ((com.bytedance.adsdk.ugeno.ouw.ra) t10).getRubIn();
        }
        return 0.0f;
    }

    public final float ryl() {
        return this.euf;
    }

    public final ouw tc() {
        return this.f11824le;
    }

    public final ko th() {
        return this.kfa;
    }

    public void tlj() {
        this.fkw.setPadding((int) (this.fvf ? this.jae : this.ksc), (int) (this.fak ? this.f11813cd : this.ksc), (int) (this.f11812bs ? this.f11831od : this.ksc), (int) (this.uoy ? this.f11841uq : this.ksc));
    }

    public final void tlj(String str) {
        this.ryl = str;
    }

    public final float uoy() {
        T t10 = this.fkw;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ouw.ra) {
            return ((com.bytedance.adsdk.ugeno.ouw.ra) t10).getRipple();
        }
        return 0.0f;
    }

    public final boolean uq() {
        return this.myk;
    }

    public final float vm() {
        return this.npr;
    }

    public final ViewGroup.LayoutParams vpp() {
        return this.f11829ng;
    }

    public lh<T> vt(String str) {
        if (TextUtils.isEmpty(this.ryl) || !TextUtils.equals(this.ryl, str)) {
            return null;
        }
        return this;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void vt() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapOuw;
        com.bytedance.adsdk.ugeno.core.vt.yu yuVar;
        mwh mwhVar;
        if (TextUtils.isEmpty(this.ey)) {
            if (this.qld) {
                ouw(this.yiz);
            } else {
                this.f11816fg.setColor(this.osn);
                lh(this.osn);
            }
        } else if (this.ey.startsWith("local://")) {
            String strReplace = this.ey.replace("local://", "");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = this.fqk ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.vt.getResources().openRawResource(com.bytedance.adsdk.ugeno.ra.yu.vt(this.vt, strReplace)), null, options);
                if (!this.fqk || (bitmapOuw = com.bytedance.adsdk.ugeno.ra.ra.ouw(this.vt, bitmapDecodeStream, (int) this.jvy)) == null) {
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.vt.getResources(), bitmapDecodeStream);
                    bitmapDrawable = bitmapDrawable2;
                    ouw(bitmapDrawable);
                } else {
                    bitmapDrawable = new BitmapDrawable(this.vt.getResources(), bitmapOuw);
                    ouw(bitmapDrawable);
                }
            } catch (Throwable unused) {
            }
        } else {
            zin();
        }
        tlj();
        vt(this.xdk);
        if (this.ouw) {
            this.fkw.setTranslationX(this.f11836sd);
        }
        if (this.f11826ln) {
            this.fkw.setTranslationY(this.euf);
        }
        if (this.qni) {
            this.fkw.setScaleX(this.f11827mq);
        }
        if (this.smu) {
            this.fkw.setScaleY(this.f11811an);
        }
        if (this.f11817fn) {
            this.fkw.setRotation(this.f11818gh);
        }
        if (this.byv) {
            this.fkw.setRotationX(this.ycd);
        }
        if (this.ehk) {
            this.fkw.setRotationY(-this.odc);
        }
        if (this.f11820ki) {
            this.fkw.setAlpha(this.npr);
        }
        float f10 = this.f11844vi;
        if (f10 != 0.0f) {
            this.fkw.setRotation(f10);
        }
        if (this.f11817fn || this.byv || this.ehk) {
            this.fkw.setCameraDistance(10000.0f);
        }
        this.fkw.setVisibility(this.xdk);
        float f11 = this.f11844vi;
        if (f11 != 0.0f) {
            this.fkw.setRotation(f11);
        }
        ra.ouw ouwVar = this.pno;
        if (ouwVar != null && TextUtils.isEmpty(ouwVar.f11653ra)) {
            this.fkw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.vt.lh.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lh lhVar = lh.this;
                    if (lhVar.zjp != null) {
                        boolean unused2 = lhVar.f11810ak;
                    }
                }
            });
        } else if (ouw(1) && !this.f11842vf) {
            this.fkw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.vt.lh.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    lh lhVar = lh.this;
                    if (lhVar.kfa == null || !lhVar.f11810ak) {
                        return;
                    }
                    lh lhVar2 = lh.this;
                    lhVar2.kfa.ouw(lhVar2.mwe.get(1), lh.this);
                }
            });
        }
        if (this.kfa != null && ouw(4)) {
            if (ouw(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + this.f11814cf);
                this.f11823kq = true;
                this.xne = new fkw(this.vt, this.mwe.get(4), this.mwe.get(1), this.f11823kq, this.eay);
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + this.f11814cf);
                this.xne = new fkw(this.vt, this.mwe.get(4), this.f11823kq, this.eay);
            }
        }
        if (this.kfa != null && ouw(1) && this.f11842vf) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.f11842vf + ", view.id: " + this.f11814cf);
            this.mu = new com.bytedance.adsdk.ugeno.core.vt.lh(this.vt, this.mwe.get(1));
        }
        if (this.kfa != null && ouw(18) && (mwhVar = this.mwe.get(18)) != null) {
            JSONObject jSONObject = mwhVar.f11642lh;
            if (jSONObject != null) {
                try {
                    jSONObject.put("rotateZ", com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("rotateZ"), this.yu));
                } catch (JSONException unused2) {
                }
            }
            this.kfa.ouw(mwhVar, this);
        }
        if (this.kfa != null && ouw(3) && (yuVar = com.bytedance.adsdk.ugeno.fkw.ouw().fkw) != null) {
            this.lai = yuVar.ouw();
            new Object() { // from class: com.bytedance.adsdk.ugeno.vt.lh.3
            };
        }
        if (this.kfa != null && ouw(9)) {
            com.bytedance.adsdk.ugeno.core.vt.le leVar = new com.bytedance.adsdk.ugeno.core.vt.le(this.vt, this.mwe.get(9), this);
            this.zjq = leVar;
            leVar.f11671lh = this.kfa;
        }
        if (ouw(10)) {
            com.bytedance.adsdk.ugeno.core.vt.vt vtVar = new com.bytedance.adsdk.ugeno.core.vt.vt(this.vt, this.mwe.get(10), this);
            this.eot = vtVar;
            vtVar.vt = this.kfa;
        }
        bly blyVar = this.zrz;
        if (blyVar != null) {
            blyVar.ouw();
            this.zrz.vt();
            this.zrz.lh();
        }
        this.fkw.setOnTouchListener(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11814cf);
        this.fkw.setContentDescription(sb2);
        ViewGroup viewGroup = (ViewGroup) this.fkw.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(true ^ this.xwt);
        }
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 = this.fwd;
        if (ouwVar2 != null) {
            ouwVar2.lh();
        }
        le leVar2 = this.coz;
        if (leVar2 != null) {
            leVar2.ouw();
        }
        bly blyVar2 = this.zrz;
        if (blyVar2 != null) {
            blyVar2.yu();
        }
        if (this.kfa == null || !ouw(22)) {
            return;
        }
        this.kfa.ouw(this.mwe.get(22), this);
    }

    public final void vt(int i10) {
        ViewParent viewParent = (ViewGroup) this.fkw.getParent();
        if (viewParent instanceof vt) {
            ((vt) viewParent).lh(this.fkw, i10);
        } else {
            this.fkw.setVisibility(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void vt(int i10, int i11) {
        List<com.bytedance.adsdk.ugeno.ouw.ouw> list;
        tlj tljVar = this.ajl;
        if (tljVar != null) {
            tljVar.f11664lh = i10 / 2;
            tljVar.yu = i11 / 2;
        }
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVar = this.fwd;
        if (ouwVar != null) {
            ouwVar.ouw(i10, i11);
        }
        le leVar = this.coz;
        if (leVar == null || (list = leVar.ouw) == null || list.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 : leVar.ouw) {
            if (ouwVar2 != null) {
                ouwVar2.ouw(i10, i11);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void vt(Canvas canvas) {
        List<com.bytedance.adsdk.ugeno.ouw.ouw> list;
        if (this instanceof ouw) {
            com.bytedance.adsdk.ugeno.ouw.ouw ouwVar = this.fwd;
            if (ouwVar != null) {
                ouwVar.vt(canvas);
            }
            le leVar = this.coz;
            if (leVar == null || (list = leVar.ouw) == null || list.isEmpty()) {
                return;
            }
            for (com.bytedance.adsdk.ugeno.ouw.ouw ouwVar2 : leVar.ouw) {
                if (ouwVar2 != null) {
                    ouwVar2.vt(canvas);
                }
            }
        }
    }

    public final void vt(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.mwe == null) {
            return;
        }
        try {
            int i10 = jg.ouw(str).zin;
            mwh mwhVar = new mwh();
            mwhVar.vt = i10;
            mwhVar.ouw = this;
            JSONObject jSONObject = new JSONObject(str2);
            if (i10 == 3) {
                try {
                    this.zu = Float.parseFloat(com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("shakeAmplitude"), this.yu));
                } catch (NumberFormatException unused) {
                    this.zu = 12.0f;
                }
            }
            if (this.kfa instanceof com.bytedance.adsdk.ugeno.core.ouw.vt) {
                throw null;
            }
            ouw(i10, jSONObject, mwhVar);
        } catch (JSONException unused2) {
        }
    }

    public final void vt(String str, Object... objArr) {
        bly blyVar;
        com.bytedance.adsdk.ugeno.yu.yu.lh lhVarVt = (TextUtils.isEmpty(str) || (blyVar = this.zrz) == null) ? null : blyVar.vt(str);
        if (lhVarVt == null) {
            return;
        }
        lhVarVt.ouw = this.zrz;
        lhVarVt.ouw(objArr);
    }

    public final void vt(JSONObject jSONObject) {
        this.yu = jSONObject;
        pno();
    }

    public lh<T> yu(String str) {
        if (cf(str) != null) {
            return this;
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.yu
    public final void yu() {
        if (this.ixm == null || this.swm) {
            return;
        }
        this.swm = true;
    }

    public final void yu(int i10) {
        if (!this.tlj) {
            ViewGroup.LayoutParams layoutParams = this.fkw.getLayoutParams();
            layoutParams.width = i10;
            this.fkw.setLayoutParams(layoutParams);
            return;
        }
        T t10 = this.fkw;
        if (t10 instanceof vt) {
            ((vt) t10).ouw(i10);
            return;
        }
        ViewParent viewParent = (ViewGroup) t10.getParent();
        if (viewParent instanceof vt) {
            ((vt) viewParent).ouw(this.fkw, i10);
        }
    }

    public final float zih() {
        return this.f11844vi;
    }

    public void zin() {
        com.bytedance.adsdk.ugeno.fkw.ouw().f11681lh.ouw(this.bly, this.ey, new ouw.InterfaceC0179ouw() { // from class: com.bytedance.adsdk.ugeno.vt.lh.4
            @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0179ouw
            public final void ouw(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                lh lhVar = lh.this;
                if (!lhVar.fqk) {
                    com.bytedance.adsdk.ugeno.ra.ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vt.lh.4.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            lh.this.ouw(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapOuw = com.bytedance.adsdk.ugeno.ra.ra.ouw(lhVar.vt, bitmap, (int) lhVar.jvy);
                if (bitmapOuw != null) {
                    com.bytedance.adsdk.ugeno.ra.ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vt.lh.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            lh.this.ouw(new BitmapDrawable(bitmapOuw));
                        }
                    });
                }
            }
        });
    }
}
