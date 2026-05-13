package l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.NativeBannerAdView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f73611b;

    public p(b0 b0Var) {
        this.f73611b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        y yVar = this.f73611b.f73583b;
        i.e eVar = yVar.f71962k;
        if (eVar == null || (i10 = eVar.f63662d) == 0) {
            i10 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
        }
        if (eVar == null || (i11 = eVar.f63663e) == 0) {
            i11 = 465;
        }
        Activity activity = yVar.B;
        int i12 = yVar.E;
        if (i12 == 0) {
            yVar.E = (yVar.F * i10) / i11;
        } else {
            int i13 = yVar.F;
            if (i13 == 0) {
                yVar.F = (i12 * i11) / i10;
            } else {
                yVar.E = (int) (i10 * (i13 / i11));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (yVar.E == 0 && yVar.F == 0) {
            yVar.E = screenWidth;
            yVar.F = (i11 * screenWidth) / i10;
        }
        if (yVar.E >= screenWidth) {
            yVar.E = screenWidth;
            yVar.F = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (yVar.F >= screenHeight) {
            yVar.F = screenHeight;
            yVar.E = (i10 * screenHeight) / i11;
        }
        AdLog.d("expressWidth " + yVar.E);
        AdLog.d("expressHeight " + yVar.F);
        View viewInflate = LayoutInflater.from(this.f73611b.f73583b.B).inflate(IDUtil.getLayoutID(this.f73611b.f73583b.B, "main_layout_native_facebook_render"), (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(IDUtil.getViewID(this.f73611b.f73583b.B, "main_fb_native_root_rl"));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(this.f73611b.f73583b.B, "main_fb_native_content_ly"));
        y yVar2 = this.f73611b.f73583b;
        int i14 = yVar2.F;
        linearLayout.addView(NativeBannerAdView.render(yVar2.B, yVar2.D, i14 <= 50 ? NativeBannerAdView.Type.HEIGHT_50 : i14 <= 100 ? NativeBannerAdView.Type.HEIGHT_100 : NativeBannerAdView.Type.HEIGHT_120), -1, -1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        y yVar3 = this.f73611b.f73583b;
        layoutParams.width = yVar3.E;
        layoutParams.height = yVar3.F;
        viewInflate.setLayoutParams(layoutParams);
        this.f73611b.f73583b.C.onAdLoaded(viewInflate);
    }
}
