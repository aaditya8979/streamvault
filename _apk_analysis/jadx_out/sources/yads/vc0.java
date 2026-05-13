package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class vc0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f96057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc0 f96058b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc0(zc0 zc0Var, Looper looper) {
        super(looper);
        this.f96058b = zc0Var;
    }

    public final boolean a(Message message, hl1 hl1Var) {
        long jMin;
        wc0 wc0Var = (wc0) message.obj;
        if (!wc0Var.f96337b) {
            return false;
        }
        int i10 = wc0Var.f96339d + 1;
        wc0Var.f96339d = i10;
        if (i10 > this.f96058b.f97505j.a(3)) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        Throwable yc0Var = hl1Var.getCause() instanceof IOException ? (IOException) hl1Var.getCause() : new yc0(hl1Var.getCause());
        ae0 ae0Var = this.f96058b.f97505j;
        int i11 = wc0Var.f96339d;
        ae0Var.getClass();
        if ((yc0Var instanceof ob2) || (yc0Var instanceof FileNotFoundException) || (yc0Var instanceof p11) || (yc0Var instanceof eg1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = q30.f93872c;
        while (yc0Var != null) {
            if ((yc0Var instanceof q30) && ((q30) yc0Var).f93873b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            yc0Var = yc0Var.getCause();
        }
        jMin = Math.min((i11 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            return false;
        }
        synchronized (this) {
            if (this.f96057a) {
                return false;
            }
            sendMessageDelayed(Message.obtain(message), jMin);
            return true;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objA;
        wc0 wc0Var = (wc0) message.obj;
        try {
            int i10 = message.what;
            if (i10 == 0) {
                objA = this.f96058b.f97507l.a((nn0) wc0Var.f96338c);
            } else {
                if (i10 != 1) {
                    throw new RuntimeException();
                }
                zc0 zc0Var = this.f96058b;
                objA = zc0Var.f97507l.a(zc0Var.f97508m, (kn0) wc0Var.f96338c);
            }
        } catch (hl1 e10) {
            boolean zA = a(message, e10);
            objA = e10;
            if (zA) {
                return;
            }
        } catch (Exception e11) {
            ih1.d("DefaultDrmSession", ih1.a("Key/provisioning request produced an unexpected exception. Not retrying.", e11));
            objA = e11;
        }
        ae0 ae0Var = this.f96058b.f97505j;
        long j10 = wc0Var.f96336a;
        ae0Var.getClass();
        synchronized (this) {
            if (!this.f96057a) {
                this.f96058b.f97509n.obtainMessage(message.what, Pair.create(wc0Var.f96338c, objA)).sendToTarget();
            }
        }
    }
}
