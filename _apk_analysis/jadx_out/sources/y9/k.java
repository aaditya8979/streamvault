package y9;

import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import y9.a;
import y9.y;

/* JADX INFO: compiled from: FileDownloadMessenger.java */
/* JADX INFO: loaded from: classes10.dex */
public class k implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.b f87447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a.d f87448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Queue<MessageSnapshot> f87449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f87450d = false;

    public k(a.b bVar, a.d dVar) {
        n(bVar, dVar);
    }

    @Override // y9.u
    public void a(MessageSnapshot messageSnapshot) {
        if (ia.d.f64033a) {
            ia.d.a(this, "notify pending %s", this.f87447a);
        }
        this.f87448b.g();
        q(messageSnapshot);
    }

    @Override // y9.u
    public void b(MessageSnapshot messageSnapshot) {
        if (ia.d.f64033a) {
            ia.d.a(this, "notify started %s", this.f87447a);
        }
        this.f87448b.g();
        q(messageSnapshot);
    }

    @Override // y9.u
    public void c(MessageSnapshot messageSnapshot) {
        if (ia.d.f64033a) {
            ia.d.a(this, "notify paused %s", this.f87447a);
        }
        this.f87448b.h();
        q(messageSnapshot);
    }

    @Override // y9.u
    public void d(MessageSnapshot messageSnapshot) {
        a origin = this.f87447a.getOrigin();
        if (ia.d.f64033a) {
            ia.d.a(this, "notify progress %s %d %d", origin, Long.valueOf(origin.p()), Long.valueOf(origin.r()));
        }
        if (origin.l() > 0) {
            this.f87448b.g();
            q(messageSnapshot);
        } else if (ia.d.f64033a) {
            ia.d.a(this, "notify progress but client not request notify %s", this.f87447a);
        }
    }

    @Override // y9.u
    public boolean e() {
        return this.f87449c.peek().getStatus() == 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y9.u
    public void f() {
        if (this.f87450d) {
            return;
        }
        MessageSnapshot messageSnapshotPoll = this.f87449c.poll();
        byte status = messageSnapshotPoll.getStatus();
        a.b bVar = this.f87447a;
        if (bVar == null) {
            throw new IllegalArgumentException(ia.f.o("can't handover the message, no master to receive this message(status[%d]) size[%d]", Integer.valueOf(status), Integer.valueOf(this.f87449c.size())));
        }
        a origin = bVar.getOrigin();
        i listener = origin.getListener();
        y.a aVarD = bVar.D();
        o(status);
        if (listener == null || listener.isInvalid()) {
            return;
        }
        if (status == 4) {
            try {
                listener.blockComplete(origin);
                p(((BlockCompleteMessage) messageSnapshotPoll).d());
                return;
            } catch (Throwable th2) {
                h(aVarD.e(th2));
                return;
            }
        }
        g gVar = listener instanceof g ? (g) listener : null;
        if (status == -4) {
            listener.warn(origin);
            return;
        }
        if (status == -3) {
            listener.completed(origin);
            return;
        }
        if (status == -2) {
            if (gVar != null) {
                gVar.b(origin, messageSnapshotPoll.h(), messageSnapshotPoll.i());
                return;
            } else {
                listener.paused(origin, messageSnapshotPoll.k(), messageSnapshotPoll.l());
                return;
            }
        }
        if (status == -1) {
            listener.error(origin, messageSnapshotPoll.m());
            return;
        }
        if (status == 1) {
            if (gVar != null) {
                gVar.c(origin, messageSnapshotPoll.h(), messageSnapshotPoll.i());
                return;
            } else {
                listener.pending(origin, messageSnapshotPoll.k(), messageSnapshotPoll.l());
                return;
            }
        }
        if (status == 2) {
            if (gVar != null) {
                gVar.a(origin, messageSnapshotPoll.e(), messageSnapshotPoll.o(), origin.p(), messageSnapshotPoll.i());
                return;
            } else {
                listener.connected(origin, messageSnapshotPoll.e(), messageSnapshotPoll.o(), origin.y(), messageSnapshotPoll.l());
                return;
            }
        }
        if (status == 3) {
            if (gVar != null) {
                gVar.d(origin, messageSnapshotPoll.h(), origin.r());
                return;
            } else {
                listener.progress(origin, messageSnapshotPoll.k(), origin.u());
                return;
            }
        }
        if (status != 5) {
            if (status != 6) {
                return;
            }
            listener.started(origin);
        } else if (gVar != null) {
            gVar.e(origin, messageSnapshotPoll.m(), messageSnapshotPoll.j(), messageSnapshotPoll.h());
        } else {
            listener.retry(origin, messageSnapshotPoll.m(), messageSnapshotPoll.j(), messageSnapshotPoll.k());
        }
    }

    @Override // y9.u
    public boolean g() {
        return this.f87447a.getOrigin().t();
    }

    @Override // y9.u
    public void h(MessageSnapshot messageSnapshot) {
        if (ia.d.f64033a) {
            a.b bVar = this.f87447a;
            ia.d.a(this, "notify error %s %s", bVar, bVar.getOrigin().a());
        }
        this.f87448b.h();
        q(messageSnapshot);
    }

    @Override // y9.u
    public void i(MessageSnapshot messageSnapshot) {
        if (ia.d.f64033a) {
            a origin = this.f87447a.getOrigin();
            ia.d.a(this, "notify retry %s %d %d %s", this.f87447a, Integer.valueOf(origin.j()), Integer.valueOf(origin.d()), origin.a());
        }
        this.f87448b.g();
        q(messageSnapshot);
    }

    @Override // y9.u
    public void j(MessageSnapshot messageSnapshot) {
        if (ia.d.f64033a) {
            ia.d.a(this, "notify connected %s", this.f87447a);
        }
        this.f87448b.g();
        q(messageSnapshot);
    }

    @Override // y9.u
    public boolean k() {
        if (ia.d.f64033a) {
            ia.d.a(this, "notify begin %s", this.f87447a);
        }
        if (this.f87447a == null) {
            ia.d.i(this, "can't begin the task, the holder fo the messenger is nil, %d", Integer.valueOf(this.f87449c.size()));
            return false;
        }
        this.f87448b.onBegin();
        return true;
    }

    @Override // y9.u
    public void l(MessageSnapshot messageSnapshot) {
        if (ia.d.f64033a) {
            ia.d.a(this, "notify warn %s", this.f87447a);
        }
        this.f87448b.h();
        q(messageSnapshot);
    }

    @Override // y9.u
    public void m(MessageSnapshot messageSnapshot) {
        if (ia.d.f64033a) {
            ia.d.a(this, "notify block completed %s %s", this.f87447a, Thread.currentThread().getName());
        }
        this.f87448b.g();
        q(messageSnapshot);
    }

    public final void n(a.b bVar, a.d dVar) {
        this.f87447a = bVar;
        this.f87448b = dVar;
        this.f87449c = new LinkedBlockingQueue();
    }

    public final void o(int i10) {
        if (fa.b.e(i10)) {
            if (!this.f87449c.isEmpty()) {
                MessageSnapshot messageSnapshotPeek = this.f87449c.peek();
                ia.d.i(this, "the messenger[%s](with id[%d]) has already accomplished all his job, but there still are some messages in parcel queue[%d] queue-top-status[%d]", this, Integer.valueOf(messageSnapshotPeek.g()), Integer.valueOf(this.f87449c.size()), Byte.valueOf(messageSnapshotPeek.getStatus()));
            }
            this.f87447a = null;
        }
    }

    public void p(MessageSnapshot messageSnapshot) {
        if (ia.d.f64033a) {
            ia.d.a(this, "notify completed %s", this.f87447a);
        }
        this.f87448b.h();
        q(messageSnapshot);
    }

    public final void q(MessageSnapshot messageSnapshot) {
        a.b bVar = this.f87447a;
        if (bVar == null) {
            if (ia.d.f64033a) {
                ia.d.a(this, "occur this case, it would be the host task of this messenger has been over(paused/warn/completed/error) on the other thread before receiving the snapshot(id[%d], status[%d])", Integer.valueOf(messageSnapshot.g()), Byte.valueOf(messageSnapshot.getStatus()));
            }
        } else {
            if (!this.f87450d && bVar.getOrigin().getListener() != null) {
                this.f87449c.offer(messageSnapshot);
                j.d().i(this);
                return;
            }
            if ((l.b() || this.f87447a.H()) && messageSnapshot.getStatus() == 4) {
                this.f87448b.h();
            }
            o(messageSnapshot.getStatus());
        }
    }

    public String toString() {
        Object[] objArr = new Object[2];
        a.b bVar = this.f87447a;
        objArr[0] = Integer.valueOf(bVar == null ? -1 : bVar.getOrigin().getId());
        objArr[1] = super.toString();
        return ia.f.o("%d:%s", objArr);
    }
}
