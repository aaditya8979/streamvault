package j;

import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes9.dex */
public final class a2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f71814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f71815d;

    public a2(z zVar, int i10, String str) {
        this.f71815d = zVar;
        this.f71813b = i10;
        this.f71814c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f71815d;
        zVar.f72046c.IL1Iii(this.f71813b, this.f71814c, zVar.f72045b);
        MainNativeAdCallBack mainNativeAdCallBack = this.f71815d.f72046c.f72014e;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdFail(this.f71813b, this.f71814c);
        }
    }
}
