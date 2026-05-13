package e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bp.r0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements NativeAdvancedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f60006a;

    public i0(q qVar) {
        this.f60006a = qVar;
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void closeFullScreen(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onClick(MBridgeIds mBridgeIds) {
        this.f60006a.M.onAdClick();
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onClose(MBridgeIds mBridgeIds) {
        this.f60006a.M.onAdClose();
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLeaveApp(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        this.f60006a.v(str);
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
        q qVar = this.f60006a;
        if (qVar.N != null) {
            View viewInflate = LayoutInflater.from(this.f60006a.L).inflate(IDUtil.getLayoutID(qVar.L, "main_layout_native_mintergral"), (ViewGroup) null);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(IDUtil.getViewID(this.f60006a.L, "main_min_native_root_rl"));
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(this.f60006a.L, "main_min_native_content_ly"));
            if (this.f60006a.N.getAdViewGroup() == null) {
                this.f60006a.v("Mintegral adView is null");
                return;
            }
            linearLayout.addView(this.f60006a.N.getAdViewGroup());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            q qVar2 = this.f60006a;
            layoutParams.width = qVar2.B;
            layoutParams.height = qVar2.C;
            viewInflate.setLayoutParams(layoutParams);
            this.f60006a.M.onAdLoaded(viewInflate);
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLogImpression(MBridgeIds mBridgeIds) {
        q qVar = this.f60006a;
        qVar.M.onAdShow(r0.b(null, qVar.f71957f));
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void showFullScreen(MBridgeIds mBridgeIds) {
    }
}
