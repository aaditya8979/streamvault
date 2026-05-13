package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C3978d4;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONException;
import yads.bo1;

/* JADX INFO: loaded from: classes3.dex */
public final class bo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f88101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final el3 f88102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dl3 f88103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f88104d;

    public bo1(Context context, lu2 lu2Var, d4 d4Var) {
        this(d4Var, new el3(context), new dl3(context, lu2Var));
    }

    public /* synthetic */ bo1(d4 d4Var, el3 el3Var, dl3 dl3Var) {
        this(d4Var, el3Var, dl3Var, Executors.newSingleThreadExecutor());
    }

    public bo1(d4 d4Var, el3 el3Var, dl3 dl3Var, Executor executor) {
        this.f88101a = d4Var;
        this.f88102b = el3Var;
        this.f88103c = dl3Var;
        this.f88104d = executor;
    }

    public static final void a(bo1 bo1Var, fl3 fl3Var, bl3 bl3Var) throws JSONException {
        bo1Var.f88102b.a(fl3Var, bl3Var);
        bo1Var.f88103c.a(bl3Var, bo1Var.f88101a);
    }

    public final void a(CustomizableMediaView customizableMediaView, String str) {
        d4 d4Var = this.f88101a;
        String str2 = d4Var.f88742c.f90339a;
        if (str2 != null) {
            int i10 = d4Var.f88753n;
            ViewGroup.LayoutParams layoutParams = customizableMediaView.getLayoutParams();
            Integer numValueOf = layoutParams != null ? Integer.valueOf(fa3.a(layoutParams.width)) : null;
            ViewGroup.LayoutParams layoutParams2 = customizableMediaView.getLayoutParams();
            Integer numValueOf2 = layoutParams2 != null ? Integer.valueOf(fa3.a(layoutParams2.height)) : null;
            int iA = fa3.a(View.MeasureSpec.getSize(customizableMediaView.getWidthMeasureSpec()));
            int iA2 = fa3.a(View.MeasureSpec.getSize(customizableMediaView.getHeightMeasureSpec()));
            int mode = View.MeasureSpec.getMode(customizableMediaView.getWidthMeasureSpec());
            lj1 lj1Var = mode != Integer.MIN_VALUE ? (mode == 0 || mode != 1073741824) ? lj1.f91997d : lj1.f91995b : lj1.f91996c;
            int mode2 = View.MeasureSpec.getMode(customizableMediaView.getHeightMeasureSpec());
            lj1 lj1Var2 = mode2 != Integer.MIN_VALUE ? (mode2 == 0 || mode2 != 1073741824) ? lj1.f91997d : lj1.f91995b : lj1.f91996c;
            final bl3 bl3Var = new bl3(new al3(fa3.a(customizableMediaView.getWidth()), fa3.a(customizableMediaView.getHeight())), new af1(numValueOf, numValueOf2), new jj1(new kj1(iA, lj1Var), new kj1(iA2, lj1Var2)), kotlin.collections.a.m(bn.h.a("asset", C3978d4.i.I0), bn.h.a("media_type", str)));
            final fl3 fl3Var = new fl3(i10, str2);
            this.f88104d.execute(new Runnable() { // from class: bt.s
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    bo1.a(this.f6276b, fl3Var, bl3Var);
                }
            });
        }
    }
}
