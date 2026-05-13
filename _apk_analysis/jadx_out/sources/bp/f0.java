package bp;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f5760b;

    public f0(n nVar) {
        this.f5760b = nVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        this.f5760b.f5818b.a(message.obj);
        return false;
    }
}
