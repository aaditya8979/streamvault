package e;

import android.os.Bundle;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f60001a;

    public f0(q qVar) {
        this.f60001a = qVar;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f60001a.N;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.release();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onPause() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f60001a.N;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onPause();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onResume() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f60001a.N;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onResume();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStart() {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onStop() {
    }
}
