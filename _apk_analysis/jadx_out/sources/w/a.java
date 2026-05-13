package w;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer.trackselection.a;
import e4.l0;
import e4.n0;
import e4.u0;
import e4.v0;
import e5.i;
import j4.j;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import t.k;
import t.l;
import t.m;

/* JADX INFO: compiled from: ExoUserPlayer.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static final String C = "w.a";
    public n0.b A;
    public x5.b B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f86202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f86203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f86204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f86205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f86208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f86209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f86210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f86211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ScheduledExecutorService f86212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f86213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w.d f86214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet<k> f86215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArraySet<m> f86216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArraySet<l> f86217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArraySet<t.a> f86218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArraySet<t.d> f86219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u0 f86220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w.c f86221t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l0 f86222u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.google.android.exoplayer.drm.a<j> f86223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public VideoPlayerView f86224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f86225x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f86226y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Runnable f86227z;

    /* JADX INFO: renamed from: w.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExoUserPlayer.java */
    public class RunnableC1084a implements Runnable {
        public RunnableC1084a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<t.d> it = a.this.E().iterator();
            while (it.hasNext()) {
                it.next().u(a.this.C());
            }
        }
    }

    /* JADX INFO: compiled from: ExoUserPlayer.java */
    public class b extends n0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f86229b;

        public b() {
        }

        @Override // e4.n0.b
        public void b(ExoPlaybackException exoPlaybackException) {
            Log.e(a.C, "onPlayerError:" + exoPlaybackException.getMessage());
            a.this.k0();
            if (v.e.j(exoPlaybackException)) {
                a.this.x();
                a.this.i0();
                return;
            }
            Iterator<t.d> it = a.this.E().iterator();
            while (it.hasNext()) {
                it.next().t(0);
            }
            Iterator it2 = a.this.f86215n.iterator();
            while (it2.hasNext()) {
                ((k) it2.next()).b(a.this.f86220s.O());
            }
        }

        @Override // e4.n0.b
        public void e(TrackGroupArray trackGroupArray, w5.c cVar) {
            boolean z10 = true;
            if (a.this.G() > 1) {
                if (this.f86229b) {
                    this.f86229b = false;
                    a.this.f86221t.g(a.this.f86206e);
                    return;
                }
                if (!a.this.f86217p.isEmpty()) {
                    Iterator it = a.this.f86217p.iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).a(a.this.f86220s.getCurrentWindowIndex(), a.this.G());
                    }
                }
                if (a.this.f86221t.c() < 0) {
                    return;
                }
                if (a.this.f86221t.c() == a.this.f86220s.getCurrentWindowIndex() && a.this.f86221t.c() > 0) {
                    z10 = false;
                }
                Iterator<t.d> it2 = a.this.E().iterator();
                while (it2.hasNext()) {
                    it2.next().i(z10);
                }
            }
        }

        @Override // e4.n0.b
        public void onPlayerStateChanged(boolean z10, int i10) {
            Iterator it = a.this.f86215n.iterator();
            while (it.hasNext()) {
                ((k) it.next()).e(a.this.f86220s.getPlayWhenReady());
            }
            Log.d(a.C, "onPlayerStateChanged:" + i10 + "+playWhenReady:" + z10);
            if (i10 == 1) {
                Log.d(a.C, "onPlayerStateChanged::网络状态差，请检查网络。。。");
                Iterator<t.d> it2 = a.this.E().iterator();
                while (it2.hasNext()) {
                    it2.next().t(0);
                }
                return;
            }
            if (i10 == 2) {
                if (z10) {
                    Iterator<t.d> it3 = a.this.E().iterator();
                    while (it3.hasNext()) {
                        it3.next().f(0);
                    }
                }
                Iterator it4 = a.this.f86215n.iterator();
                while (it4.hasNext()) {
                    ((k) it4.next()).c();
                }
                return;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                Log.d(a.C, "onPlayerStateChanged:ended。。。");
                a.this.f86208g = true;
                a.this.x();
                Iterator<t.d> it5 = a.this.E().iterator();
                while (it5.hasNext()) {
                    it5.next().g(0);
                }
                Iterator it6 = a.this.f86215n.iterator();
                while (it6.hasNext()) {
                    ((k) it6.next()).d();
                }
                return;
            }
            for (t.d dVar : a.this.E()) {
                dVar.k(8, false);
                dVar.f(8);
                dVar.m(8);
            }
            if (z10) {
                a.this.f86224w.z(false);
                Log.d(a.C, "onPlayerStateChanged:准备播放");
                a.this.f86210i = false;
                Iterator it7 = a.this.f86215n.iterator();
                while (it7.hasNext()) {
                    ((k) it7.next()).a(a.this.z());
                }
            }
        }

        @Override // e4.n0.a, e4.n0.b
        public void w(v0 v0Var, Object obj, int i10) {
            if (a.this.f86209h) {
                a.this.f86209h = false;
                this.f86229b = true;
                a.this.f86220s.seekTo(a.this.f86220s.getNextWindowIndex(), a.this.f86203b.longValue());
            }
        }
    }

    /* JADX INFO: compiled from: ExoUserPlayer.java */
    public class c implements x5.b {
        public c() {
        }

        @Override // x5.b
        public void a(long j10) {
            if (j10 > a.this.f86226y * 1000) {
                a.this.f86224w.F(0);
                a.this.f0(false);
            } else {
                a.this.f86224w.F(8);
            }
            Log.e(a.C, "onScrubMove" + j10);
        }
    }

    /* JADX INFO: compiled from: ExoUserPlayer.java */
    public final class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f86232a;

        public d() {
            this.f86232a = 0L;
        }

        public /* synthetic */ d(a aVar, RunnableC1084a runnableC1084a) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo;
            String action = intent.getAction();
            if (action == null || !action.equals("android.net.conn.CONNECTIVITY_CHANGE") || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
                return;
            }
            if (activeNetworkInfo.getType() != 0) {
                if (activeNetworkInfo.getType() == 1) {
                    boolean unused = a.this.f86210i;
                }
            } else if (System.currentTimeMillis() - this.f86232a > 500) {
                this.f86232a = System.currentTimeMillis();
                if (e.a().c() || a.this.f86210i) {
                    return;
                }
                Iterator<t.d> it = a.this.E().iterator();
                while (it.hasNext()) {
                    it.next().p(a.this.f86225x);
                }
            }
        }
    }

    public a(@NonNull Context context, @NonNull w.c cVar) {
        this.f86203b = 0L;
        this.f86204c = 0L;
        this.f86205d = 0L;
        this.f86206e = 0;
        this.f86225x = false;
        this.f86226y = 360L;
        this.f86227z = new RunnableC1084a();
        this.A = new b();
        this.B = new c();
        this.f86202a = context.getApplicationContext();
        this.f86215n = new CopyOnWriteArraySet<>();
        this.f86216o = new CopyOnWriteArraySet<>();
        this.f86217p = new CopyOnWriteArraySet<>();
        this.f86218q = new CopyOnWriteArraySet<>();
        this.f86219r = new CopyOnWriteArraySet<>();
        this.f86214m = new w.d(this);
        this.f86221t = cVar;
        Iterator<t.d> it = E().iterator();
        while (it.hasNext()) {
            it.next().c(true);
        }
    }

    public a(@NonNull Context context, @NonNull w.c cVar, @NonNull VideoPlayerView videoPlayerView) {
        this.f86203b = 0L;
        this.f86204c = 0L;
        this.f86205d = 0L;
        this.f86206e = 0;
        this.f86225x = false;
        this.f86226y = 360L;
        this.f86227z = new RunnableC1084a();
        this.A = new b();
        this.B = new c();
        this.f86202a = context.getApplicationContext();
        this.f86224w = videoPlayerView;
        this.f86221t = cVar;
        this.f86215n = new CopyOnWriteArraySet<>();
        this.f86216o = new CopyOnWriteArraySet<>();
        this.f86217p = new CopyOnWriteArraySet<>();
        this.f86218q = new CopyOnWriteArraySet<>();
        this.f86219r = new CopyOnWriteArraySet<>();
        w.d dVar = new w.d(this);
        this.f86214m = dVar;
        videoPlayerView.setExoPlayerListener(dVar);
        t(videoPlayerView.getComponentListener());
        Iterator<t.d> it = E().iterator();
        while (it.hasNext()) {
            it.next().c(true);
        }
    }

    public long A() {
        u0 u0Var = this.f86220s;
        if (u0Var == null) {
            return 0L;
        }
        return u0Var.getDuration();
    }

    public w.c B() {
        return this.f86221t;
    }

    public final String C() {
        Context context = this.f86202a;
        if (context == null) {
            return "";
        }
        long jE = v.e.e(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLongValue = jCurrentTimeMillis - this.f86205d.longValue();
        if (jLongValue == 0) {
            return "1 kb/s";
        }
        long jLongValue2 = ((jE - this.f86204c.longValue()) * 1000) / jLongValue;
        this.f86205d = Long.valueOf(jCurrentTimeMillis);
        this.f86204c = Long.valueOf(jE);
        if (jLongValue2 <= 1024) {
            return jLongValue2 + " kb/s";
        }
        return new DecimalFormat("######0.0").format(v.e.c(jLongValue2)) + " MB/s";
    }

    public u0 D() {
        return this.f86220s;
    }

    public CopyOnWriteArraySet<t.d> E() {
        return this.f86219r;
    }

    public VideoPlayerView F() {
        return this.f86224w;
    }

    public int G() {
        u0 u0Var = this.f86220s;
        if (u0Var == null) {
            return 0;
        }
        if (u0Var.getCurrentTimeline().q()) {
            return 1;
        }
        return this.f86220s.getCurrentTimeline().p();
    }

    public boolean H() {
        int playbackState;
        u0 u0Var = this.f86220s;
        return (u0Var == null || (playbackState = u0Var.getPlaybackState()) == 1 || playbackState == 4 || !this.f86220s.getPlayWhenReady()) ? false : true;
    }

    public boolean I() {
        if (v.e.m(this.f86202a) || this.f86202a.getResources().getConfiguration().orientation != 2) {
            return true;
        }
        Iterator<t.d> it = E().iterator();
        while (it.hasNext()) {
            it.next().l();
        }
        return false;
    }

    public void J(Configuration configuration) {
        if (E() == null || E().size() <= 0) {
            return;
        }
        Iterator<t.d> it = E().iterator();
        while (it.hasNext()) {
            it.next().s(configuration.orientation == 2);
        }
    }

    @CallSuper
    public void K() {
        R();
        Iterator<t.a> it = this.f86218q.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
        w.c cVar = this.f86221t;
        if (cVar != null) {
            cVar.a();
        }
        this.f86204c = 0L;
        this.f86205d = 0L;
        this.f86203b = 0L;
        this.f86206e = 0;
        this.f86215n.clear();
        this.f86216o.clear();
        this.f86217p.clear();
        this.f86218q.clear();
        this.f86219r.clear();
        this.f86208g = false;
        this.f86210i = false;
        this.f86207f = false;
        this.f86212k = null;
        this.f86221t = null;
        this.A = null;
        this.f86214m = null;
        this.f86224w.p(null);
    }

    @CallSuper
    public void L() {
        this.f86210i = true;
        u0 u0Var = this.f86220s;
        if (u0Var != null) {
            this.f86207f = true ^ u0Var.getPlayWhenReady();
            this.f86220s.setPlayWhenReady(false);
        }
    }

    public void M() {
        u0 u0Var = this.f86220s;
        if (u0Var != null) {
            u0Var.setPlayWhenReady(true);
        }
    }

    public void N() {
        VideoPlayerView videoPlayerView = this.f86224w;
        if (videoPlayerView != null) {
            videoPlayerView.p(this.B);
        }
    }

    @CallSuper
    public void O() {
        this.f86210i = true;
        u0 u0Var = this.f86220s;
        if (u0Var != null) {
            this.f86207f = true ^ u0Var.getPlayWhenReady();
            R();
        }
    }

    public void P() {
        if (this.f86220s == null) {
            y();
        }
        boolean z10 = this.f86206e != -1;
        if (this.f86207f) {
            this.f86220s.setPlayWhenReady(false);
        } else {
            this.f86220s.setPlayWhenReady(true);
        }
        this.f86220s.X(this.f86222u);
        for (t.d dVar : E()) {
            dVar.k(8, true);
            dVar.d(false, false);
            dVar.v(true);
            dVar.c(false);
            dVar.m(0);
        }
        if (z10) {
            this.f86220s.seekTo(this.f86206e, this.f86203b.longValue());
        }
        this.f86220s.c(this.A);
        this.f86220s.e(this.A);
        this.f86220s.T(this.f86221t.d(), !z10, false);
        this.f86208g = false;
        this.f86211j = true;
        for (t.d dVar2 : E()) {
            dVar2.onPrepared();
            dVar2.m(0);
        }
    }

    public final void Q() {
        if (this.f86213l == null) {
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            d dVar = new d(this, null);
            this.f86213l = dVar;
            this.f86202a.registerReceiver(dVar, intentFilter);
        }
    }

    public void R() {
        k0();
        j0();
        u0 u0Var = this.f86220s;
        if (u0Var != null) {
            u0Var.c(this.A);
            this.f86220s.m();
            this.f86220s.U();
            this.f86220s = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.f86212k;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        this.f86212k.shutdown();
    }

    public void S() {
        u0 u0Var = this.f86220s;
        if (u0Var != null) {
            u0Var.c(this.A);
            this.f86220s.m();
            this.f86220s.U();
            this.f86220s = null;
        }
    }

    public void T() {
        u0 u0Var = this.f86220s;
        if (u0Var != null) {
            u0Var.m();
            this.f86220s.c(this.A);
            for (t.d dVar : E()) {
                dVar.c(true);
                dVar.reset();
            }
            this.f86220s.U();
            this.f86220s = null;
        }
    }

    public void U() {
        i0();
    }

    public void V(long j10) {
        u0 u0Var = this.f86220s;
        if (u0Var != null) {
            u0Var.k(j10);
        }
    }

    public final void W() {
        if (this.f86212k == null) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            this.f86212k = scheduledExecutorServiceNewScheduledThreadPool;
            scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this.f86227z, 1000L, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    public void X(com.google.android.exoplayer.drm.a<j> aVar) {
        this.f86223v = aVar;
    }

    public void Y(@NonNull Uri uri) {
        this.f86221t.h(uri);
    }

    public void Z(@NonNull String str) {
        Y(Uri.parse(str));
    }

    public void a() {
        Iterator<m> it = this.f86216o.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void a0(@Size(min = 0) float f10, @Size(min = 0) float f11) {
        this.f86222u = null;
        l0 l0Var = new l0(f10, f11);
        this.f86222u = l0Var;
        u0 u0Var = this.f86220s;
        if (u0Var != null) {
            u0Var.X(l0Var);
        }
    }

    public void b() {
        Iterator<m> it = this.f86216o.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void b0(int i10, long j10) {
        this.f86206e = i10;
        this.f86203b = Long.valueOf(j10);
    }

    public void c0(long j10) {
        this.f86203b = Long.valueOf(j10);
    }

    public void d0(boolean z10) {
        this.f86225x = z10;
    }

    public void e0(boolean z10) {
        Iterator<t.d> it = E().iterator();
        while (it.hasNext()) {
            it.next().e(z10);
        }
    }

    public void f0(boolean z10) {
        if (this.f86220s != null) {
            if (z10) {
                Iterator<t.d> it = E().iterator();
                while (it.hasNext()) {
                    it.next().k(8, false);
                }
            }
            this.f86220s.setPlayWhenReady(z10);
        }
    }

    public void g0(@NonNull String str) {
        this.f86207f = false;
        k0();
        if (!(this.f86221t.d() instanceof i)) {
            this.f86221t.h(Uri.parse(str));
            P();
        } else {
            i iVar = (i) this.f86221t.d();
            iVar.T(iVar.X() - 1).d(null);
            iVar.I(this.f86221t.f(Uri.parse(str)));
            this.f86209h = true;
        }
    }

    public a h0() {
        e.a().f(this);
        this.f86207f = false;
        for (t.d dVar : E()) {
            dVar.n(this);
            dVar.c(false);
            dVar.m(0);
        }
        i0();
        Q();
        return this;
    }

    public void i0() {
        P();
    }

    public final void j0() {
        d dVar = this.f86213l;
        if (dVar != null) {
            this.f86202a.unregisterReceiver(dVar);
        }
        this.f86213l = null;
    }

    public void k0() {
        u0 u0Var = this.f86220s;
        if (u0Var != null) {
            this.f86206e = u0Var.getCurrentWindowIndex();
            this.f86203b = Long.valueOf(Math.max(0L, this.f86220s.getContentPosition()));
        }
    }

    public void l0(int i10) {
        this.f86226y = i10;
    }

    public void s(@NonNull t.a aVar) {
        this.f86218q.add(aVar);
    }

    public void t(@NonNull t.d dVar) {
        this.f86219r.add(dVar);
    }

    public void u(@NonNull l lVar) {
        this.f86217p.add(lVar);
    }

    public void v(@NonNull k kVar) {
        this.f86215n.add(kVar);
    }

    public void w(@NonNull m mVar) {
        this.f86216o.add(mVar);
    }

    public void x() {
        this.f86206e = -1;
        this.f86203b = -9223372036854775807L;
    }

    public void y() {
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(new a.d());
        W();
        this.f86220s = e4.l.a(this.f86202a, new e4.j(this.f86202a, 1), defaultTrackSelector, new s.b(), this.f86223v);
        Iterator<t.d> it = E().iterator();
        while (it.hasNext()) {
            it.next().r(this.f86220s);
        }
        Iterator<t.a> it2 = this.f86218q.iterator();
        while (it2.hasNext()) {
            it2.next().r(this.f86220s);
        }
    }

    public long z() {
        u0 u0Var = this.f86220s;
        if (u0Var == null) {
            return 0L;
        }
        return u0Var.getCurrentPosition();
    }
}
