package sg.bigo.ads.core.player;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f84230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, b> f84231b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, RunnableC1055a> f84232c = new HashMap();

    /* JADX INFO: renamed from: sg.bigo.ads.core.player.a$a, reason: collision with other inner class name */
    public class RunnableC1055a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<sg.bigo.ads.common.h.a> f84233a;

        public RunnableC1055a(sg.bigo.ads.common.h.a aVar) {
            this.f84233a = new WeakReference<>(aVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    WeakReference<sg.bigo.ads.common.h.a> weakReference = RunnableC1055a.this.f84233a;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    RunnableC1055a runnableC1055a = RunnableC1055a.this;
                    a.this.f84232c.remove(runnableC1055a.f84233a.get().f82143a);
                    RunnableC1055a runnableC1055a2 = RunnableC1055a.this;
                    a.this.f84230a.c(runnableC1055a2.f84233a.get());
                }
            });
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sg.bigo.ads.common.h.a f84236a;

        public b(sg.bigo.ads.common.h.a aVar) {
            this.f84236a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    b bVar = b.this;
                    sg.bigo.ads.common.h.a aVar = bVar.f84236a;
                    if (aVar != null) {
                        a.this.f84231b.remove(aVar.f82143a);
                        b bVar2 = b.this;
                        a.this.f84230a.b(bVar2.f84236a);
                        str = "call onDownloadFillTime";
                    } else {
                        str = "downloadInfo is null, not call onDownloadFillTime";
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", str);
                }
            });
        }
    }

    public interface c {
        void b(sg.bigo.ads.common.h.a aVar);

        void c(sg.bigo.ads.common.h.a aVar);
    }

    public a(c cVar) {
        this.f84230a = cVar;
    }

    public final void a(sg.bigo.ads.common.h.a aVar) {
        if (aVar.c()) {
            if (aVar.e() > 0) {
                c(aVar);
            }
            if (aVar.f() > 0) {
                if (this.f84232c.containsKey(aVar.f82143a)) {
                    sg.bigo.ads.common.n.d.a(this.f84232c.remove(aVar.f82143a));
                }
                RunnableC1055a runnableC1055a = new RunnableC1055a(aVar);
                this.f84232c.put(aVar.f82143a, runnableC1055a);
                sg.bigo.ads.common.n.d.a(3, runnableC1055a, ((long) aVar.f()) * 1000);
            }
        }
    }

    public final void b(sg.bigo.ads.common.h.a aVar) {
        if (this.f84232c.containsKey(aVar.f82143a)) {
            sg.bigo.ads.common.n.d.a(this.f84232c.get(aVar.f82143a));
            this.f84232c.remove(aVar.f82143a);
        }
    }

    public final void c(sg.bigo.ads.common.h.a aVar) {
        if (this.f84231b.containsKey(aVar.f82143a)) {
            sg.bigo.ads.common.n.d.a(this.f84231b.remove(aVar.f82143a));
            sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "fillTimeRunnableList.containsKey: " + aVar.f82143a);
        }
        b bVar = new b(aVar);
        this.f84231b.put(aVar.f82143a, bVar);
        sg.bigo.ads.common.n.d.a(3, bVar, ((long) aVar.e()) * 1000);
        sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "startFillTimeRunnable at: " + aVar.e());
    }
}
