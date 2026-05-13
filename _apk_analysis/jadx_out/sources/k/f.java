package k;

import android.app.Activity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f72643b;

    public f(m mVar, Activity activity) {
        this.f72643b = mVar;
        this.f72642a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f72643b.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        AppOpenAd.load(this.f72642a, m.J, new AdRequest.Builder().build(), this.f72643b.H);
    }
}
