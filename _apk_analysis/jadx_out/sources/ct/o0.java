package ct;

import android.os.Bundle;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.yk.e.object.LifeListener;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements LifeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f59461a;

    public o0(v vVar) {
        this.f59461a = vVar;
    }

    @Override // com.yk.e.object.LifeListener
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.yk.e.object.LifeListener
    public final void onDestroy() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f59461a.H;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.release();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onPause() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f59461a.H;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onPause();
        }
    }

    @Override // com.yk.e.object.LifeListener
    public final void onResume() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f59461a.H;
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
