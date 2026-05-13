package a6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: SystemHandlerWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3537a;

    public e0(Handler handler) {
        this.f3537a = handler;
    }

    @Override // a6.l
    public Looper getLooper() {
        return this.f3537a.getLooper();
    }

    @Override // a6.l
    public Message obtainMessage(int i10, int i11, int i12) {
        return this.f3537a.obtainMessage(i10, i11, i12);
    }

    @Override // a6.l
    public Message obtainMessage(int i10, int i11, int i12, @Nullable Object obj) {
        return this.f3537a.obtainMessage(i10, i11, i12, obj);
    }

    @Override // a6.l
    public Message obtainMessage(int i10, @Nullable Object obj) {
        return this.f3537a.obtainMessage(i10, obj);
    }

    @Override // a6.l
    public void removeMessages(int i10) {
        this.f3537a.removeMessages(i10);
    }

    @Override // a6.l
    public boolean sendEmptyMessage(int i10) {
        return this.f3537a.sendEmptyMessage(i10);
    }

    @Override // a6.l
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.f3537a.sendEmptyMessageAtTime(i10, j10);
    }
}
