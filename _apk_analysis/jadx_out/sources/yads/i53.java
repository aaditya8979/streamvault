package yads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class i53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f90679b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f90680a;

    public i53(Handler handler) {
        this.f90680a = handler;
    }

    public static h53 a() {
        h53 h53Var;
        ArrayList arrayList = f90679b;
        synchronized (arrayList) {
            h53Var = arrayList.isEmpty() ? new h53() : (h53) arrayList.remove(arrayList.size() - 1);
        }
        return h53Var;
    }

    public final h53 a(int i10, Object obj) {
        h53 h53VarA = a();
        h53VarA.f90254a = this.f90680a.obtainMessage(i10, obj);
        return h53VarA;
    }
}
