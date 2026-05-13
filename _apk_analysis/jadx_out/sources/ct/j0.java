package ct;

import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f59451a;

    public j0(a0 a0Var) {
        this.f59451a = a0Var;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        NativeAd nativeAd = this.f59451a.G;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onPause() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onResume() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStart() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStop() {
    }
}
