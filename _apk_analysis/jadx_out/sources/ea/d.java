package ea;

import com.liulishuo.filedownloader.message.MessageSnapshot;
import ea.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: MessageSnapshotThreadPool.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f60949a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.b f60950b;

    /* JADX INFO: compiled from: MessageSnapshotThreadPool.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Integer> f60951a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f60952b;

        /* JADX INFO: renamed from: ea.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MessageSnapshotThreadPool.java */
        public class RunnableC0741a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessageSnapshot f60954b;

            public RunnableC0741a(MessageSnapshot messageSnapshot) {
                this.f60954b = messageSnapshot;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f60950b.d(this.f60954b);
                a.this.f60951a.remove(Integer.valueOf(this.f60954b.g()));
            }
        }

        public a(int i10) {
            this.f60952b = ia.b.a(1, "Flow-" + i10);
        }

        public void b(int i10) {
            this.f60951a.add(Integer.valueOf(i10));
        }

        public void c(MessageSnapshot messageSnapshot) {
            this.f60952b.execute(new RunnableC0741a(messageSnapshot));
        }
    }

    public d(int i10, c.b bVar) {
        this.f60950b = bVar;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f60949a.add(new a(i11));
        }
    }

    public void b(MessageSnapshot messageSnapshot) {
        a aVar = null;
        try {
            synchronized (this.f60949a) {
                int iG = messageSnapshot.g();
                Iterator<a> it = this.f60949a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a next = it.next();
                    if (next.f60951a.contains(Integer.valueOf(iG))) {
                        aVar = next;
                        break;
                    }
                }
                if (aVar == null) {
                    int size = 0;
                    Iterator<a> it2 = this.f60949a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        a next2 = it2.next();
                        if (next2.f60951a.size() <= 0) {
                            aVar = next2;
                            break;
                        } else if (size == 0 || next2.f60951a.size() < size) {
                            size = next2.f60951a.size();
                            aVar = next2;
                        }
                    }
                }
                aVar.b(iG);
            }
        } finally {
            aVar.c(messageSnapshot);
        }
    }
}
