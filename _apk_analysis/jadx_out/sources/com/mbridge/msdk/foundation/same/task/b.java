package com.mbridge.msdk.foundation.same.task;

import android.annotation.SuppressLint;
import android.content.Context;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.s0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: CommonTaskLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f37999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<Long, com.mbridge.msdk.foundation.same.task.a> f38000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference<Context> f38001c;

    /* JADX INFO: compiled from: CommonTaskLoader.java */
    public class a implements a.InterfaceC0449a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.same.task.a f38002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0449a f38003b;

        public a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0449a interfaceC0449a) {
            this.f38002a = aVar;
            this.f38003b = interfaceC0449a;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0449a
        public void a(a.b bVar) {
            if (bVar == a.b.CANCEL || bVar == a.b.FINISH) {
                b.this.f38000b.remove(Long.valueOf(this.f38002a.getId()));
            } else if (bVar == a.b.RUNNING && b.this.f38001c.get() == null) {
                b.this.a();
            }
            a.InterfaceC0449a interfaceC0449a = this.f38003b;
            if (interfaceC0449a != null) {
                interfaceC0449a.a(bVar);
            }
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f37999a = c.b();
        } else {
            if (s0.a().a("c_t_p_t_l", true)) {
                int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f37999a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f37999a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f37999a.allowCoreThreadTimeOut(true);
        }
        this.f38000b = new HashMap<>();
        this.f38001c = new WeakReference<>(context);
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context, int i10) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f37999a = c.b();
        } else {
            if (i10 == 0) {
                this.f37999a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f37999a = new ThreadPoolExecutor(i10, (i10 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f37999a.allowCoreThreadTimeOut(true);
        }
        this.f38000b = new HashMap<>();
        this.f38001c = new WeakReference<>(context);
    }

    private synchronized void a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0449a interfaceC0449a) {
        this.f38000b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a(aVar, interfaceC0449a));
    }

    public synchronized void a() {
        try {
            Iterator<Map.Entry<Long, com.mbridge.msdk.foundation.same.task.a>> it = this.f38000b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.f38000b.clear();
        } catch (Exception unused) {
        }
    }

    public void a(com.mbridge.msdk.foundation.same.task.a aVar) {
        a(aVar, null);
        this.f37999a.execute(aVar);
    }

    public void b(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0449a interfaceC0449a) {
        a(aVar, interfaceC0449a);
        this.f37999a.execute(aVar);
    }
}
