package yads;

import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class n12 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f92691b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile n12 f92692c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f92693a;

    public n12(Map map) {
        this.f92693a = map;
    }

    public final void a(View view, p32 p32Var) {
        synchronized (f92691b) {
            this.f92693a.put(view, p32Var);
            bn.r rVar = bn.r.f5635a;
        }
    }
}
