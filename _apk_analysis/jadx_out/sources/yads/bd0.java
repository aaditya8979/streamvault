package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class bd0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gd0 f87961a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(gd0 gd0Var, Looper looper) {
        super(looper);
        this.f87961a = gd0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (zc0 zc0Var : this.f87961a.f89933m) {
            if (Arrays.equals(zc0Var.f97516u, bArr)) {
                if (message.what == 2 && zc0Var.f97500e == 0 && zc0Var.f97510o == 4) {
                    int i10 = ib3.f90737a;
                    zc0Var.a(false);
                    return;
                }
                return;
            }
        }
    }
}
