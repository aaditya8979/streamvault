package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Collection;

/* JADX INFO: loaded from: classes11.dex */
public final class xc0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc0 f96710a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(zc0 zc0Var, Looper looper) {
        super(looper);
        this.f96710a = zc0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            this.f96710a.a(obj, obj2);
            return;
        }
        zc0 zc0Var = this.f96710a;
        if (obj == zc0Var.f97519x) {
            if (zc0Var.f97510o == 2 || zc0Var.e()) {
                zc0Var.f97519x = null;
                if (obj2 instanceof Exception) {
                    ((ed0) zc0Var.f97498c).a((Exception) obj2, false);
                    return;
                }
                try {
                    zc0Var.f97497b.c((byte[]) obj2);
                    ed0 ed0Var = (ed0) zc0Var.f97498c;
                    ed0Var.f89213b = null;
                    p51 p51VarA = p51.a((Collection) ed0Var.f89212a);
                    ed0Var.f89212a.clear();
                    m51 m51VarListIterator = p51VarA.listIterator(0);
                    while (m51VarListIterator.hasNext()) {
                        zc0 zc0Var2 = (zc0) m51VarListIterator.next();
                        if (zc0Var2.f()) {
                            zc0Var2.a(true);
                        }
                    }
                } catch (Exception e10) {
                    ((ed0) zc0Var.f97498c).a(e10, true);
                }
            }
        }
    }
}
