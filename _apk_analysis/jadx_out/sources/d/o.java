package d;

import android.view.View;
import com.yk.e.adview.WorldNativeView;
import com.yk.e.callBack.MainWdNativeAdCallback;
import e.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorldNativeView f59507b;

    public o(WorldNativeView worldNativeView) {
        this.f59507b = worldNativeView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar = this.f59507b.f3377l;
        if (nVar != null) {
            e0 e0Var = (e0) nVar;
            e.a aVar = e0Var.f59999a;
            aVar.m(aVar.M, 29);
            MainWdNativeAdCallback mainWdNativeAdCallback = e0Var.f59999a.L;
            if (mainWdNativeAdCallback != null) {
                mainWdNativeAdCallback.onAdClick();
            }
        }
    }
}
