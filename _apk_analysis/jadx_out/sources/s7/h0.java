package s7;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import s7.m;

/* JADX INFO: compiled from: SystemHandlerWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h0 implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("messagePool")
    public static final List<b> f79467b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f79468a;

    /* JADX INFO: compiled from: SystemHandlerWrapper.java */
    public static final class b implements m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Message f79469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public h0 f79470b;

        public b() {
        }

        public final void a() {
            this.f79469a = null;
            this.f79470b = null;
            h0.d(this);
        }

        public boolean b(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) s7.a.e(this.f79469a));
            a();
            return zSendMessageAtFrontOfQueue;
        }

        public b c(Message message, h0 h0Var) {
            this.f79469a = message;
            this.f79470b = h0Var;
            return this;
        }

        @Override // s7.m.a
        public void sendToTarget() {
            ((Message) s7.a.e(this.f79469a)).sendToTarget();
            a();
        }
    }

    public h0(Handler handler) {
        this.f79468a = handler;
    }

    public static b c() {
        b bVar;
        List<b> list = f79467b;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    public static void d(b bVar) {
        List<b> list = f79467b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // s7.m
    public boolean a(m.a aVar) {
        return ((b) aVar).b(this.f79468a);
    }

    @Override // s7.m
    public boolean hasMessages(int i10) {
        return this.f79468a.hasMessages(i10);
    }

    @Override // s7.m
    public m.a obtainMessage(int i10) {
        return c().c(this.f79468a.obtainMessage(i10), this);
    }

    @Override // s7.m
    public m.a obtainMessage(int i10, int i11, int i12) {
        return c().c(this.f79468a.obtainMessage(i10, i11, i12), this);
    }

    @Override // s7.m
    public m.a obtainMessage(int i10, int i11, int i12, @Nullable Object obj) {
        return c().c(this.f79468a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // s7.m
    public m.a obtainMessage(int i10, @Nullable Object obj) {
        return c().c(this.f79468a.obtainMessage(i10, obj), this);
    }

    @Override // s7.m
    public boolean post(Runnable runnable) {
        return this.f79468a.post(runnable);
    }

    @Override // s7.m
    public void removeCallbacksAndMessages(@Nullable Object obj) {
        this.f79468a.removeCallbacksAndMessages(obj);
    }

    @Override // s7.m
    public void removeMessages(int i10) {
        this.f79468a.removeMessages(i10);
    }

    @Override // s7.m
    public boolean sendEmptyMessage(int i10) {
        return this.f79468a.sendEmptyMessage(i10);
    }

    @Override // s7.m
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.f79468a.sendEmptyMessageAtTime(i10, j10);
    }
}
