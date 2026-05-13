package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final class fx1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw1 f89718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89719b;

    public fx1(vw1 vw1Var, long j10) {
        this.f89718a = vw1Var;
        this.f89719b = j10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        bn.r rVar;
        vw1 vw1Var = this.f89718a;
        long j10 = this.f89719b;
        if (j10 <= 0) {
            vw1Var.getClass();
            return;
        }
        if (vw1Var.f96211f) {
            vw1Var.a();
            lm2 lm2Var = vw1Var.f96209d;
            KProperty kProperty = vw1.f96205g[0];
            ViewPager2 viewPager2 = (ViewPager2) lm2Var.f92035a.get();
            if (viewPager2 != null) {
                xw1 xw1Var = new xw1(viewPager2, vw1Var.f96206a, vw1Var.f96207b);
                vw1Var.f96208c.getClass();
                Handler handler = new Handler(Looper.getMainLooper());
                ph1 ph1Var = new ph1(handler);
                vw1Var.f96210e = ph1Var;
                if (xw1Var.f88975b == ct.f88597b) {
                    handler.postDelayed(new oh1(ph1Var, j10, xw1Var), j10);
                }
                rVar = bn.r.f5635a;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                vw1Var.a();
                vw1Var.f96211f = false;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f89718a.a();
    }
}
