package w;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.google.android.exoplayer.ui.PlayerControlView;
import e4.u0;
import j4.j;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import t.g;
import t.h;
import t.i;
import t.k;
import t.l;

/* JADX INFO: compiled from: VideoPlayerManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w.a f86263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f86264b;

    /* JADX INFO: compiled from: VideoPlayerManager.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f86265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public VideoPlayerView f86266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public PlayerControlView f86267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public t.b f86268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public w.c f86269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f86270f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public com.google.android.exoplayer.drm.a<j> f86271g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public g f86272h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public t.j f86273i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public i f86274j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public h f86275k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f86276l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final CopyOnWriteArraySet<k> f86277m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final CopyOnWriteArraySet<l> f86278n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f86279o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f86280p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public View.OnClickListener f86281q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public t.e f86282r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f86283s;

        /* JADX INFO: compiled from: VideoPlayerManager.java */
        public class a implements t.a {
            public a() {
            }

            @Override // t.a
            public void onDestroy() {
            }

            @Override // t.a
            public void r(u0 u0Var) {
                b.this.f86267c.setPlayer(u0Var);
            }
        }

        public b(int i10, @NonNull VideoPlayerView videoPlayerView) {
            this.f86270f = 1;
            this.f86276l = true;
            this.f86280p = -1;
            this.f86265a = v.e.n(videoPlayerView.getContext());
            this.f86266b = videoPlayerView;
            this.f86270f = i10;
            this.f86277m = new CopyOnWriteArraySet<>();
            this.f86278n = new CopyOnWriteArraySet<>();
        }

        public b(Activity activity, int i10, @IdRes int i11) {
            this(i10, (VideoPlayerView) activity.findViewById(i11));
        }

        public w.a b() {
            w.a aVar;
            c();
            if (this.f86266b != null) {
                aVar = new w.a(this.f86265a, this.f86269e, this.f86266b);
                aVar.e0(this.f86283s);
                w.b bVar = new w.b((Activity) this.f86266b.getContext(), aVar);
                if (this.f86270f == 1) {
                    bVar.J(this.f86272h);
                    bVar.L(this.f86274j);
                    bVar.M(this.f86273i);
                    bVar.K(this.f86275k);
                    aVar.s(bVar);
                }
                t.e eVar = this.f86282r;
                if (eVar != null) {
                    eVar.a(this.f86266b.getPreviewImage());
                }
                this.f86266b.setOnEndGestureListener(bVar);
                this.f86266b.setPlayerGestureOnTouch(this.f86276l);
                this.f86266b.setOnPlayClickListener(this.f86281q);
            } else {
                aVar = new w.a(this.f86265a, this.f86269e);
                aVar.s(new a());
            }
            aVar.y();
            aVar.X(this.f86271g);
            Iterator<k> it = this.f86277m.iterator();
            while (it.hasNext()) {
                aVar.v(it.next());
            }
            Iterator<l> it2 = this.f86278n.iterator();
            while (it2.hasNext()) {
                aVar.u(it2.next());
            }
            int i10 = this.f86280p;
            if (i10 != -1) {
                aVar.b0(i10, this.f86279o);
            } else {
                aVar.c0(this.f86279o);
            }
            return aVar;
        }

        public final void c() {
            if (this.f86269e == null) {
                try {
                    int i10 = x.a.f86716g;
                    this.f86269e = (w.c) x.a.class.getConstructor(Context.class, t.b.class).newInstance(this.f86265a, this.f86268d);
                } catch (Exception unused) {
                    this.f86269e = new w.c(this.f86265a, this.f86268d);
                }
            }
        }

        public b d(@NonNull w.c cVar) {
            this.f86269e = cVar;
            return this;
        }

        public b e(@NonNull g gVar) {
            this.f86272h = gVar;
            return this;
        }

        public b f(@NonNull h hVar) {
            this.f86275k = hVar;
            return this;
        }

        public b g(@NonNull t.j jVar) {
            this.f86273i = jVar;
            return this;
        }

        public b h(boolean z10) {
            this.f86276l = z10;
            return this;
        }

        public b i(boolean z10) {
            this.f86283s = z10;
            return this;
        }

        public b j(@NonNull String str) {
            this.f86266b.setTitle(str);
            return this;
        }

        public b k(boolean z10) {
            this.f86266b.setVerticalFullScreen(z10);
            return this;
        }
    }

    /* JADX INFO: compiled from: VideoPlayerManager.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static e f86285a = new e();
    }

    public e() {
        this.f86264b = false;
    }

    public static e a() {
        return c.f86285a;
    }

    @Nullable
    public w.a b() {
        w.a aVar = this.f86263a;
        if (aVar == null || aVar.D() == null) {
            return null;
        }
        return this.f86263a;
    }

    public boolean c() {
        return this.f86264b;
    }

    public void d() {
        w.a aVar = this.f86263a;
        if (aVar != null) {
            aVar.T();
        }
        this.f86263a = null;
    }

    public void e(boolean z10) {
        this.f86264b = z10;
    }

    public void f(@NonNull w.a aVar) {
        if (this.f86263a == null || !aVar.toString().equals(this.f86263a.toString())) {
            d();
        }
        this.f86263a = aVar;
    }
}
