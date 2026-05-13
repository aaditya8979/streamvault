package yads;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class dv2 implements un1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f88992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f88993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yn1 f88994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vn1 f88995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xn1 f88996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wn1 f88997f;

    public dv2(lu2 lu2Var, v9 v9Var, yn1 yn1Var, vn1 vn1Var, xn1 xn1Var, wn1 wn1Var) {
        this.f88992a = lu2Var;
        this.f88993b = v9Var;
        this.f88994c = yn1Var;
        this.f88995d = vn1Var;
        this.f88996e = xn1Var;
        this.f88997f = wn1Var;
    }

    @Override // yads.un1
    public final sn1 a(CustomizableMediaView customizableMediaView, d4 d4Var, mi2 mi2Var, gl1 gl1Var, x51 x51Var, d42 d42Var, h32 h32Var, fz1 fz1Var, ao1 ao1Var, my2 my2Var, on1 on1Var) {
        sn1 sn1VarA;
        sn1 sn1VarA2 = null;
        sn1VarA2 = null;
        sn1VarA2 = null;
        sn1VarA2 = null;
        if (on1Var == null) {
            return null;
        }
        d62 d62Var = d42Var.f88757a;
        o72 o72Var = d42Var.f88758b;
        oj1 oj1Var = on1Var.f93291a;
        Context context = customizableMediaView.getContext();
        Context context2 = customizableMediaView.getContext();
        or0 or0Var = or0.f93313e;
        boolean zA = pr0.a(context2, or0Var);
        if (zA) {
            customizableMediaView.removeAllViews();
        }
        if (d62Var != null) {
            sd3 sd3Var = on1Var.f93292b;
            yn1 yn1Var = this.f88994c;
            yn1Var.getClass();
            Context context3 = customizableMediaView.getContext();
            yn1Var.f97252e.f96645a.getClass();
            kj3 videoScaleType = customizableMediaView.getVideoScaleType();
            if (videoScaleType == null) {
                videoScaleType = kj3.f91613b;
            }
            j62 j62Var = yn1Var.f97253f;
            mj3 mj3Var = sd3Var != null ? sd3Var.f94801b : null;
            j62Var.getClass();
            ai3 ai3Var = new ai3(videoScaleType, mj3Var != null ? mj3Var.f92376a : true, mj3Var != null ? mj3Var.f92377b : false, mj3Var != null ? mj3Var.f92379d : null);
            yn1Var.f97251d.getClass();
            e72 e72VarA = yn1Var.f97254g.a(context3, ai3Var, gl1Var, sd3Var, customizableMediaView.getVideoControlsLayoutId());
            yn1Var.f97250c.getClass();
            if (!pr0.a(customizableMediaView.getContext(), or0Var)) {
                customizableMediaView.removeAllViews();
            }
            customizableMediaView.addView(e72VarA, new FrameLayout.LayoutParams(-1, -1));
            hv2 hv2Var = new hv2(customizableMediaView, ao1Var, new ik3(new dk3(yn1Var.f97248a, e72VarA, ai3Var, d4Var, yn1Var.f97249b, x51Var, d62Var, h32Var, fz1Var, mi2Var, my2Var, new bk3())));
            yz2 yz2Var = my2Var != null ? my2Var.f92648e : null;
            sn1VarA2 = (yz2Var == null || !zA || (sn1VarA = a(customizableMediaView, this.f88992a, mi2Var, ao1Var, my2Var, on1Var)) == null) ? hv2Var : new lv2(customizableMediaView, hv2Var, sn1VarA, ao1Var, yz2Var);
        } else if (o72Var != null && oj1Var != null && tb.a(context)) {
            try {
                sn1VarA2 = this.f88997f.a(customizableMediaView, oj1Var, x51Var, o72Var, ao1Var);
            } catch (xn3 unused) {
            }
        }
        return sn1VarA2 == null ? a(customizableMediaView, this.f88992a, mi2Var, ao1Var, my2Var, on1Var) : sn1VarA2;
    }

    public final sn1 a(CustomizableMediaView customizableMediaView, lu2 lu2Var, mi2 mi2Var, ao1 ao1Var, my2 my2Var, on1 on1Var) {
        List list = on1Var.f93293c;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return this.f88995d.a(customizableMediaView, mi2Var, ao1Var);
        }
        try {
            return this.f88996e.a(this.f88993b, lu2Var, customizableMediaView, mi2Var, list, ao1Var, my2Var);
        } catch (Throwable unused) {
            return this.f88995d.a(customizableMediaView, mi2Var, ao1Var);
        }
    }
}
