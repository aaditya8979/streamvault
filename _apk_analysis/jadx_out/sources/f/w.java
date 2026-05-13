package f;

import android.os.Bundle;
import com.facebook.ads.NativeAd;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f61394a;

    public w(f fVar) {
        this.f61394a = fVar;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        NativeAd nativeAd = this.f61394a.F;
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
