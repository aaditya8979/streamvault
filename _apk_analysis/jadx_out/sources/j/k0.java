package j;

import android.view.View;
import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f71900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f71901c;

    public k0(l1 l1Var, View view) {
        this.f71901c = l1Var;
        this.f71900b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMaterialCallback mainMaterialCallback = this.f71901c.f71934b;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdLoaded(this.f71900b);
        }
        MainMaterialCallback mainMaterialCallback2 = this.f71901c.f71935c.f71841g;
        if (mainMaterialCallback2 != null) {
            mainMaterialCallback2.onAdLoaded(this.f71900b);
        }
    }
}
