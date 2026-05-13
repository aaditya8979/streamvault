package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bp.r0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements NativeAdvancedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f73593a;

    public f0(i0 i0Var) {
        this.f73593a = i0Var;
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void closeFullScreen(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onClick(MBridgeIds mBridgeIds) {
        this.f73593a.C.onAdClick();
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onClose(MBridgeIds mBridgeIds) {
        this.f73593a.C.onAdClose();
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLeaveApp(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        this.f73593a.v(str);
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
        i0 i0Var = this.f73593a;
        if (i0Var.D != null) {
            View viewInflate = LayoutInflater.from(this.f73593a.B).inflate(IDUtil.getLayoutID(i0Var.B, "main_layout_native_mintergral"), (ViewGroup) null);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(IDUtil.getViewID(this.f73593a.B, "main_min_native_root_rl"));
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(this.f73593a.B, "main_min_native_content_ly"));
            if (this.f73593a.D.getAdViewGroup() == null) {
                this.f73593a.v("Mintegral adView is null");
                return;
            }
            linearLayout.addView(this.f73593a.D.getAdViewGroup());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            i0 i0Var2 = this.f73593a;
            layoutParams.width = i0Var2.E;
            layoutParams.height = i0Var2.F;
            viewInflate.setLayoutParams(layoutParams);
            this.f73593a.C.onAdLoaded(viewInflate);
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLogImpression(MBridgeIds mBridgeIds) {
        i0 i0Var = this.f73593a;
        i0Var.C.onAdShow(r0.b(null, i0Var.f71957f));
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void showFullScreen(MBridgeIds mBridgeIds) {
    }
}
