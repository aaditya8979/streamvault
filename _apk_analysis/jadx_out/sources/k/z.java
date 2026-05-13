package k;

import com.yk.e.pl.PreloadTask;
import com.yk.e.util.CoreUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class z implements PreloadTask.IPreloadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f72680a;

    public z(x xVar) {
        this.f72680a = xVar;
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onCancel(int i10) {
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onFailed(int i10, String str) {
        x xVar = this.f72680a;
        xVar.L = true;
        xVar.a(str);
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onSuccess(int i10) {
        x xVar = this.f72680a;
        CoreUtils.addCacheVideoAdsID(xVar.G, xVar.f71961j);
        this.f72680a.G.runOnUiThread(new y0(this));
    }
}
