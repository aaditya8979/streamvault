package b;

import com.yk.e.activity.MainInterstitialActivity;

/* JADX INFO: loaded from: classes8.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f5345c;

    public z(MainInterstitialActivity mainInterstitialActivity, int i10) {
        this.f5345c = mainInterstitialActivity;
        this.f5344b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5345c.ILL.setText(String.valueOf(this.f5344b - 1));
        this.f5345c.IL1Iii(this.f5344b - 1);
    }
}
