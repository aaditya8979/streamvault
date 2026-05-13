package yads;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class h53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f90254a;

    public final void a() {
        this.f90254a = null;
        ArrayList arrayList = i53.f90679b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f90254a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
