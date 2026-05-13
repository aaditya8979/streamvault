package bp;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f5711b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f5713d = new b(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f5712c = new Handler(Looper.getMainLooper());

    public a(int i10, t1 t1Var) {
        this.f5710a = i10;
        this.f5711b = t1Var;
    }
}
