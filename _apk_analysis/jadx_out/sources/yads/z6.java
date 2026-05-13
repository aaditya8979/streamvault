package yads;

import androidx.media3.common.Player;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f97407a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile rp0 f97408b;

    public static final void a(rp0 rp0Var) {
        f97408b = rp0Var;
        for (Player.Listener listener : f97407a) {
            if (f97408b != null) {
                rp0 rp0Var2 = f97408b;
                if (rp0Var2 != null) {
                    rp0Var2.f94555a.addListener(listener);
                }
            } else {
                f97407a.add(listener);
            }
        }
    }
}
