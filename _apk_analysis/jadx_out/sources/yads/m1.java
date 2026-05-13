package yads;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class m1 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f92206b = new m1();

    public m1() {
        super(1);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        Activity activity = (Activity) ((WeakReference) obj).get();
        return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
    }
}
