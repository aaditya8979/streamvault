package yads;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class dk3 extends hk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f88893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bk3 f88894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v62 f88895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ak3 f88896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h62 f88897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zj3 f88898h;

    public dk3(lu2 lu2Var, e72 e72Var, ai3 ai3Var, d4 d4Var, v9 v9Var, x51 x51Var, d62 d62Var, h32 h32Var, fz1 fz1Var, mi2 mi2Var, my2 my2Var, bk3 bk3Var) {
        super(e72Var);
        this.f88893c = v9Var;
        this.f88894d = bk3Var;
        this.f88895e = new v62(e72Var.getContext(), this, ai3Var, d4Var, lu2Var, v9Var, x51Var, d62Var, h32Var, mi2Var, my2Var);
        this.f88896f = new ak3(((iu3) lu2Var).f());
        this.f88897g = fz1Var.a();
        x51Var.a(bk3Var);
    }

    @Override // yads.hk3
    public final void a() {
        zj3 zj3Var = this.f88898h;
        if (zj3Var != null) {
            zj3Var.k();
        }
        this.f88894d.f88039a = null;
    }

    @Override // yads.hk3
    public final void a(View view) {
        e72 e72Var = (e72) view;
        v62 v62Var = this.f88895e;
        s62 s62Var = v62Var.f95968e;
        if (s62Var != null) {
            ae2 ae2Var = s62Var.f94725l;
            if (ae2Var != null) {
                ae2Var.f87674b.stop();
                n52 n52Var = e72Var.f89137c;
                g72 g72Var = ae2Var.f87675c;
                gl1 gl1Var = n52Var.f92745b;
                g72Var.getClass();
                if (gl1Var != null) {
                    CheckBox muteControl = gl1Var.getMuteControl();
                    if (muteControl != null) {
                        muteControl.setOnClickListener(null);
                        muteControl.setVisibility(8);
                    }
                    ProgressBar videoProgress = gl1Var.getVideoProgress();
                    if (videoProgress != null) {
                        videoProgress.setProgress(0);
                        videoProgress.setVisibility(8);
                    }
                    TextView countDownProgress = gl1Var.getCountDownProgress();
                    if (countDownProgress != null) {
                        countDownProgress.setText("");
                        countDownProgress.setVisibility(8);
                    }
                }
            }
            s62Var.f94719f.b(e72Var);
        }
        g32 g32Var = v62Var.f95969f;
        if (g32Var != null) {
            v62Var.f95964a.f90231a.remove(g32Var);
            v62Var.f95969f = null;
        }
        e72Var.setOnAttachStateChangeListener(null);
        e72Var.setVisibility(8);
        e72Var.setOnClickListener(null);
        e72Var.setOnTouchListener(null);
        e72Var.setSelected(false);
    }

    @Override // yads.hk3
    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        e72 e72Var;
        sd3 sd3Var = (sd3) obj;
        e72 e72Var2 = (e72) b();
        if (e72Var2 != null) {
            kk3Var.a(e72Var2, oiVar);
            if (sd3Var == null || this.f88898h == null) {
                return;
            }
            je3 je3Var = (je3) cn.f0.t0(sd3Var.f94800a);
            kk3Var.a(oiVar, new bh3(e72Var2, je3Var.f91194a));
            v62 v62Var = this.f88895e;
            v62Var.f95966c.getClass();
            int i10 = ((n62) je3Var.f91197d).f92755c;
            e72Var2.setAspectRatio(i10 != 0 ? r5.f92754b / i10 : 1.7777778f);
            s62 s62Var = v62Var.f95968e;
            if (s62Var == null || (e72Var = (e72) s62Var.f94714a.b()) == null) {
                return;
            }
            e72Var.setClickable(false);
        }
    }

    @Override // yads.hk3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }

    @Override // yads.hk3
    public final void b(View view, Object obj) {
        e72 e72Var = (e72) view;
        sd3 sd3Var = (sd3) obj;
        je3 je3Var = (je3) cn.f0.t0(sd3Var.f94800a);
        zj3 zj3VarA = this.f88896f.a(e72Var.getContext(), je3Var, mf3.f92350e);
        this.f88898h = zj3VarA;
        this.f88894d.f88039a = zj3VarA;
        h62 h62Var = this.f88897g;
        Context context = e72Var.getContext();
        v9 v9Var = this.f88893c;
        h62Var.getClass();
        String str = je3Var.f91200g;
        boolean zA = pr0.a(context, or0.f93311c);
        p62[] p62VarArr = p62.f93445b;
        if (tn.p.f("first_video_preloading_strategy", v9Var.f96011v) && zA) {
            hv0 hv0Var = h62Var.f90260c;
            synchronized (hv0Var.f90575d) {
                z52 z52Var = hv0Var.f90573b;
                mj0 mj0Var = z52Var.f97405a;
                if (mj0Var != null) {
                    mj0Var.f92370c++;
                    mj0Var.f92368a.obtainMessage(7, str).sendToTarget();
                }
                z52Var.f97406b.remove(str);
                bn.r rVar = bn.r.f5635a;
            }
        } else {
            h62Var.f90259b.a(str);
        }
        this.f88895e.a(e72Var, sd3Var, zj3VarA);
    }
}
