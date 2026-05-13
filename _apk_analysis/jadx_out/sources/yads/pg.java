package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pg f93587a = new pg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile fh f93588b;

    public static final fh a(Context context) {
        fh fhVar;
        fh fhVar2 = f93588b;
        if (fhVar2 != null) {
            return fhVar2;
        }
        synchronized (f93587a) {
            Context contextA = uz.a(context);
            fhVar = f93588b;
            if (fhVar == null) {
                fhVar = new fh(new zg(contextA));
                f93588b = fhVar;
            }
        }
        return fhVar;
    }
}
