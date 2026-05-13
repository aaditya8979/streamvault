package ea;

import com.liulishuo.filedownloader.message.MessageSnapshot;

/* JADX INFO: compiled from: MessageSnapshotFlow.java */
/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile d f60946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f60947b;

    /* JADX INFO: compiled from: MessageSnapshotFlow.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f60948a = new c();
    }

    /* JADX INFO: compiled from: MessageSnapshotFlow.java */
    public interface b {
        void d(MessageSnapshot messageSnapshot);
    }

    public static c a() {
        return a.f60948a;
    }

    public void b(MessageSnapshot messageSnapshot) {
        if (messageSnapshot instanceof ea.a) {
            if (this.f60947b != null) {
                this.f60947b.d(messageSnapshot);
            }
        } else if (this.f60946a != null) {
            this.f60946a.b(messageSnapshot);
        }
    }

    public void c(b bVar) {
        this.f60947b = bVar;
        if (bVar == null) {
            this.f60946a = null;
        } else {
            this.f60946a = new d(5, bVar);
        }
    }
}
