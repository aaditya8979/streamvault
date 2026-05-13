package jh;

import android.app.Activity;
import com.yk.e.pl.PreloadTask;
import com.yk.e.util.CoreUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements PreloadTask.IPreloadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f72448b;

    public j0(u uVar, Activity activity) {
        this.f72448b = uVar;
        this.f72447a = activity;
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onCancel(int i10) {
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onFailed(int i10, String str) {
        boolean z10;
        u uVar = this.f72448b;
        synchronized (uVar) {
            z10 = uVar.E == 0;
        }
        if (z10) {
            u.D(this.f72448b);
            this.f72448b.a(str);
        }
    }

    @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
    public final void onSuccess(int i10) {
        CoreUtils.addCacheVideoAdsID(this.f72447a, this.f72448b.f71961j);
        this.f72447a.runOnUiThread(new b(this));
    }
}
