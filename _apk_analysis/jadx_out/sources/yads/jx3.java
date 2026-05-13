package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public final class jx3 implements pw3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static jx3 f91412f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f91413a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax3 f91414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw3 f91415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vw3 f91416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public nw3 f91417e;

    public jx3(ax3 ax3Var, aw3 aw3Var) {
        this.f91414b = ax3Var;
        this.f91415c = aw3Var;
    }

    public static jx3 a() {
        if (f91412f == null) {
            f91412f = new jx3(new ax3(), new aw3());
        }
        return f91412f;
    }

    @Override // yads.pw3
    public final void a(boolean z10) {
        if (!z10) {
            x83.f96665g.getClass();
            Handler handler = x83.f96667i;
            if (handler != null) {
                handler.removeCallbacks(x83.f96669k);
                x83.f96667i = null;
                return;
            }
            return;
        }
        x83.f96665g.getClass();
        if (x83.f96667i == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            x83.f96667i = handler2;
            handler2.post(x83.f96668j);
            x83.f96667i.postDelayed(x83.f96669k, 200L);
        }
    }
}
