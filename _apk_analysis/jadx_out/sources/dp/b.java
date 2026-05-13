package dp;

import com.yk.e.callBack.MainFloatViewCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f59915b;

    public b(e eVar) {
        this.f59915b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainFloatViewCallback mainFloatViewCallback;
        e eVar = this.f59915b;
        if (eVar.D || (mainFloatViewCallback = eVar.C) == null) {
            return;
        }
        mainFloatViewCallback.onAdClick();
    }
}
