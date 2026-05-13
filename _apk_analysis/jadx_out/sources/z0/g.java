package z0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: HttpProxyCacheServerClients.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f98154a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f98156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<b> f98157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f98158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f98159f;

    /* JADX INFO: compiled from: HttpProxyCacheServerClients.java */
    public static final class a extends Handler implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f98160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f98161c;

        public a(String str, List<b> list) {
            super(Looper.getMainLooper());
            this.f98160b = str;
            this.f98161c = list;
        }

        @Override // z0.b
        public void a(File file, String str, int i10) {
            Message messageObtainMessage = obtainMessage();
            messageObtainMessage.arg1 = i10;
            messageObtainMessage.obj = file;
            sendMessage(messageObtainMessage);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Iterator<b> it = this.f98161c.iterator();
            while (it.hasNext()) {
                it.next().a((File) message.obj, this.f98160b, message.arg1);
            }
        }
    }

    public g(String str, c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f98157d = copyOnWriteArrayList;
        this.f98155b = (String) k.c(str);
        this.f98159f = (c) k.c(cVar);
        this.f98158e = new a(str, copyOnWriteArrayList);
    }

    public final synchronized void a() {
        if (this.f98154a.decrementAndGet() <= 0) {
            this.f98156c.m();
            this.f98156c = null;
        }
    }

    public int b() {
        return this.f98154a.get();
    }

    public final e c() throws ProxyCacheException {
        String str = this.f98155b;
        c cVar = this.f98159f;
        e eVar = new e(new h(str, cVar.f98128d, cVar.f98129e), new a1.b(this.f98159f.a(this.f98155b), this.f98159f.f98127c));
        eVar.t(this.f98158e);
        return eVar;
    }

    public void d(d dVar, Socket socket) throws IOException, ProxyCacheException {
        e();
        try {
            this.f98154a.incrementAndGet();
            this.f98156c.s(dVar, socket);
        } finally {
            a();
        }
    }

    public final synchronized void e() throws ProxyCacheException {
        this.f98156c = this.f98156c == null ? c() : this.f98156c;
    }
}
