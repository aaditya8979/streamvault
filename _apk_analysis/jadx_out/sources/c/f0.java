package c;

import com.yk.e.pl.PreloadTask;
import com.yk.e.util.CoreUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements PreloadTask.IPreloadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f6465a;

    public f0(v vVar) {
        this.f6465a = vVar;
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onCancel(int i10) {
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onFailed(int i10, String str) {
        v vVar = this.f6465a;
        vVar.F = true;
        vVar.a(str);
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onSuccess(int i10) {
        v vVar = this.f6465a;
        CoreUtils.addCacheVideoAdsID(vVar.C, vVar.f71961j);
        this.f6465a.C.runOnUiThread(new a(this));
    }
}
