package sg.bigo.ads.core.player.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import java.util.HashMap;
import java.util.Objects;
import sg.bigo.ads.R;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.player.b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends f implements c.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean E;
    private int F;
    private boolean G;
    private long H;
    private String I;
    private String J;
    private boolean K;
    private boolean L;
    private View M;
    private b N;
    private final TextureView.SurfaceTextureListener O;
    private final View.OnClickListener P;
    private Runnable Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84332a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f84333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f84334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f84335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private ImageView f84336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImageView f84337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AdImageView f84338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f84339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ProgressBar f84340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f84341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private c f84342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f84343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f84344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f84345t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f84346u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f84347v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f84348w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Runnable f84349x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Runnable f84350y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f84351z;

    public e(Context context, int i10, int i11, @NonNull sg.bigo.ads.api.c.b bVar, @Nullable sg.bigo.ads.core.a.a aVar) {
        sg.bigo.ads.core.a.a aVar2;
        super(context, bVar, aVar);
        this.f84342q = new c();
        this.f84343r = 0;
        this.f84344s = 0;
        this.f84345t = true;
        this.f84351z = false;
        this.A = true;
        this.B = false;
        this.C = false;
        this.E = false;
        this.H = 0L;
        this.I = "";
        this.J = "";
        this.K = true;
        this.L = false;
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: sg.bigo.ads.core.player.b.e.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f84353b = SystemClock.elapsedRealtime();

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i12, int i13) {
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onSurfaceTextureAvailable");
                sg.bigo.ads.common.n.d.a(e.this.f84350y);
                e.this.a(13, SystemClock.elapsedRealtime() - this.f84353b, 0);
                e.this.H = SystemClock.elapsedRealtime();
                e.this.f84342q.a(new Surface(surfaceTexture));
                sg.bigo.ads.core.a.a aVar3 = e.this.f84362e;
                if (aVar3 != null && aVar3.aZ()) {
                    e.this.f84342q.a(e.this.f84339n);
                    e.d(e.this);
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "real video is not ready, begin to load backup image");
                sg.bigo.ads.core.a.a aVar4 = e.this.f84362e;
                if (aVar4 == null || aVar4.bh() == null) {
                    e.g(e.this);
                    return;
                }
                Pair<Bitmap, String> pairBh = e.this.f84362e.bh();
                if (pairBh != null) {
                    e.this.a(pairBh.first);
                    if (e.this.N != null) {
                        e.this.N.a((Bitmap) pairBh.first);
                    }
                }
                e.this.w();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                sg.bigo.ads.common.t.a.b("VideoPlayView", "onSurfaceTextureDestroyed");
                e.this.d(false);
                c cVar = e.this.f84342q;
                try {
                    if (!c.f84303h.get()) {
                        cVar.f84304a.reset();
                    }
                    sg.bigo.ads.common.n.d.a(cVar.f84310g);
                } catch (IllegalStateException e10) {
                    c.a aVar3 = cVar.f84306c;
                    if (aVar3 != null) {
                        aVar3.a(11, Log.getStackTraceString(e10), cVar.f84311i);
                    }
                    sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "reset IllegalStateException");
                }
                cVar.f84309f = false;
                cVar.f84308e = false;
                if (!e.this.f84346u) {
                    e eVar = e.this;
                    eVar.f84364g = false;
                    if (eVar.f84343r > 0) {
                        e eVar2 = e.this;
                        eVar2.f84344s = eVar2.f84343r;
                    }
                }
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i12, int i13) {
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onSurfaceTextureSizeChanged");
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.O = surfaceTextureListener;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sg.bigo.ads.core.player.b.e.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (view.getId()) {
                    case 200011:
                        e.this.o();
                        break;
                    case 200012:
                        if (!e.this.G || !e.this.C) {
                            e.this.v();
                        }
                        break;
                }
            }
        };
        this.P = onClickListener;
        this.f84332a = 0;
        this.Q = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.5
            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f84337l != null) {
                    e.this.f84337l.setVisibility(8);
                }
            }
        };
        this.J = aVar != null ? aVar.aT() : "";
        if (aVar != null && aVar.bq() != null) {
            this.I = aVar.bq().f83876b;
        }
        w();
        this.f84348w = bVar.f81837f;
        this.f84346u = bVar.f81836e;
        this.f84333h = i10;
        this.f84334i = i11;
        int i12 = bVar.f81832a;
        this.f84347v = bVar.f81833b;
        g gVar = new g(this.f84360c, i10, i11, i12);
        this.f84335j = gVar;
        u.a(gVar, this, null, -1);
        this.f84335j.setSurfaceTextureListener(surfaceTextureListener);
        sg.bigo.ads.core.a.a aVar3 = this.f84362e;
        if (aVar3 != null && aVar3.x() != 2 && y()) {
            sg.bigo.ads.common.n.d.a(this.f84350y);
            if (this.f84350y == null) {
                this.f84350y = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.x();
                        sg.bigo.ads.core.a.a aVar4 = e.this.f84362e;
                        sg.bigo.ads.core.d.b.a(aVar4, aVar4 != null ? aVar4.aK() : "", 13, "onSurfaceTextureAvailable not called", 0);
                        e.this.a("AdVideoTooLate", new int[]{10311});
                    }
                };
            }
            sg.bigo.ads.common.n.d.a(2, this.f84350y, this.f84348w);
        }
        if (!bVar.f81838g && (aVar2 = this.f84362e) != null && !TextUtils.isEmpty(aVar2.aN())) {
            a(o.b(getContext().getApplicationContext(), this.f84362e.aN()));
        }
        this.f84345t = this.f84342q.a(bVar.f81835d);
        if (!bVar.f81834c) {
            int iB = sg.bigo.ads.common.utils.a.b(this.f84360c, R.dimen.bigo_ad_volume_padding);
            ImageView imageView = new ImageView(this.f84360c);
            this.f84336k = imageView;
            imageView.setId(200011);
            this.f84336k.setOnClickListener(onClickListener);
            this.f84336k.setPadding(iB, iB, iB, iB);
            this.f84336k.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f84360c, this.f84345t ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
            int iB2 = sg.bigo.ads.common.utils.a.b(this.f84360c, R.dimen.bigo_ad_volume_size) + (iB * 2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iB2, iB2, 85);
            layoutParams.rightMargin = iB;
            layoutParams.bottomMargin = iB;
            this.f84336k.setVisibility(0);
            u.a(this.f84336k, this, layoutParams, -1);
        }
        sg.bigo.ads.core.a.a aVar4 = this.f84362e;
        boolean z10 = aVar4 != null && aVar4.aO();
        this.G = z10;
        if (z10) {
            z();
        }
        int iB3 = sg.bigo.ads.common.utils.a.b(this.f84360c, R.dimen.bigo_ad_replay_size);
        sg.bigo.ads.core.a.a aVar5 = this.f84362e;
        if (aVar5 != null && aVar5.x() == 2 && sg.bigo.ads.api.c.b.b() > 0) {
            iB3 = sg.bigo.ads.common.utils.e.a(this.f84360c, sg.bigo.ads.api.c.b.b());
        }
        ImageView imageView2 = new ImageView(this.f84360c);
        this.f84337l = imageView2;
        imageView2.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f84360c, R.drawable.bigo_ad_ic_media_play));
        this.f84337l.setVisibility(this.f84346u ? 0 : 8);
        u.a(this.f84337l, this, new FrameLayout.LayoutParams(iB3, iB3, 17), -1);
        this.f84342q.f84306c = this;
        setId(200012);
        setOnClickListener(onClickListener);
        b(0);
    }

    private void A() {
        if (this.f84340o == null) {
            z();
        }
        this.f84340o.setVisibility(8);
    }

    private void B() {
        if (this.f84341p == null) {
            this.f84341p = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = this.f84341p;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, long j10, int i11) {
        sg.bigo.ads.core.a.a aVar = this.f84362e;
        sg.bigo.ads.core.d.b.a(aVar, aVar != null ? aVar.aK() : "", i10, j10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void a(T t10) {
        if (t10 == 0) {
            return;
        }
        if (this.f84338m == null) {
            AdImageView adImageView = new AdImageView(this.f84360c);
            this.f84338m = adImageView;
            adImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        u.a(this.f84338m, this, new FrameLayout.LayoutParams(-1, -1, 17), -1);
        boolean z10 = false;
        if (t10 instanceof String) {
            String str = (String) t10;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f84338m.setVisibility(0);
            AdImageView adImageView2 = this.f84338m;
            sg.bigo.ads.core.a.a aVar = this.f84362e;
            if (aVar != null && aVar.al()) {
                z10 = true;
            }
            adImageView2.a(str, z10);
            return;
        }
        if (t10 instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) t10;
            this.f84338m.setVisibility(0);
            this.f84338m.setImageBitmap(bitmap);
            ImageView imageView = this.f84336k;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            this.f84335j.f84371a = bitmap.getWidth();
            this.f84335j.f84372b = bitmap.getHeight();
            this.f84335j.requestLayout();
        }
    }

    public static /* synthetic */ void d(e eVar) {
        if (eVar.y()) {
            sg.bigo.ads.common.n.d.a(eVar.f84349x);
            if (eVar.f84349x == null) {
                eVar.f84349x = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.x();
                        e.this.a("AdVideoTooLate", new int[]{10107});
                    }
                };
            }
            sg.bigo.ads.common.n.d.a(2, eVar.f84349x, eVar.f84348w);
        }
    }

    public static /* synthetic */ void g(e eVar) {
        if (eVar.f84341p == null) {
            eVar.f84341p = sg.bigo.ads.common.utils.a.a(eVar.getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = eVar.f84341p;
        if (view != null) {
            u.a(view, eVar, new FrameLayout.LayoutParams(-2, -2, 17), -1);
            eVar.f84341p.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        sg.bigo.ads.core.a.a aVar;
        int i10;
        sg.bigo.ads.core.a.a aVar2 = this.f84362e;
        if (aVar2 == null) {
            return;
        }
        Pair<Bitmap, String> pairBh = aVar2.bh();
        if (this.f84362e.aZ()) {
            aVar = this.f84362e;
            i10 = 0;
        } else if (pairBh == null) {
            aVar = this.f84362e;
            i10 = 5;
        } else {
            if (!Objects.equals(pairBh.second, this.I)) {
                if (Objects.equals(pairBh.second, this.J)) {
                    this.f84362e.j(2);
                    return;
                }
                return;
            }
            aVar = this.f84362e;
            i10 = 1;
        }
        aVar.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f84342q.g();
        this.f84342q.d();
        this.f84342q.e();
    }

    private boolean y() {
        return this.f84348w > 0;
    }

    private void z() {
        Context context = getContext();
        ProgressBar progressBar = new ProgressBar(context);
        this.f84340o = progressBar;
        progressBar.setBackgroundColor(sg.bigo.ads.common.utils.a.c(context, android.R.color.transparent));
        s.a(context, this.f84340o, R.drawable.bigo_ad_progressbar_white);
        this.f84340o.setVisibility(8);
        u.a(this.f84340o, this, new FrameLayout.LayoutParams(-2, -2, 17), -1);
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        c cVar = this.f84342q;
        if (cVar.f84308e && cVar.b()) {
            this.f84351z = false;
            if (this.G) {
                A();
            }
            this.E = false;
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "pauseAd called");
        }
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void a(int i10, String str, int i11) {
        sg.bigo.ads.core.a.a aVar = this.f84362e;
        sg.bigo.ads.core.d.b.a(aVar, aVar != null ? aVar.aK() : "", i10, str, i11);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void a(MediaPlayer mediaPlayer, int i10) {
        sg.bigo.ads.common.n.d.a(this.f84349x);
        A();
        B();
        boolean z10 = this.f84333h == 0 && this.f84334i == 0;
        this.f84333h = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f84334i = videoHeight;
        if (this.L || (z10 && this.f84333h > 0 && videoHeight > 0)) {
            g gVar = this.f84335j;
            gVar.f84371a = this.f84333h;
            gVar.f84372b = videoHeight;
            gVar.requestLayout();
        }
        new HashMap();
        if (this.H > 0) {
            a(10, SystemClock.elapsedRealtime() - this.H, i10);
            this.H = 0L;
        }
        if (this.K) {
            b(18);
        }
        if (this.f84351z || y()) {
            this.f84351z = false;
            b();
        } else {
            if (this.f84364g || this.f84346u) {
                return;
            }
            d(true);
        }
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final void a(boolean z10) {
        super.a(z10);
        this.f84364g = false;
        if (this.f84342q.f84308e) {
            if (!sg.bigo.ads.common.aa.b.a(getContext().getApplicationContext())) {
                sg.bigo.ads.common.t.a.b("VideoPlayView", "screen is off, start ad cancel");
                return;
            }
            if (this.f84342q.a()) {
                this.F = getAdDuration();
                sg.bigo.ads.core.a.a aVar = this.f84362e;
                if (aVar != null) {
                    aVar.j(0);
                }
            }
            AdImageView adImageView = this.f84338m;
            if (adImageView != null) {
                adImageView.setVisibility(8);
            }
            this.f84337l.setVisibility(8);
            d(true);
            return;
        }
        StringBuilder sb2 = new StringBuilder("incorrect status, the player is not prepared");
        sb2.append(z10 ? " wating to play" : ", start ad failed");
        sg.bigo.ads.common.t.a.b("VideoPlayView", sb2.toString());
        this.f84351z = z10;
        int i10 = this.f84332a;
        if (i10 < 8) {
            int i11 = i10 + 1;
            this.f84332a = i11;
            if (i11 == 8) {
                sg.bigo.ads.core.d.b.a(this.f84362e, 3003, 10107, "Not prepared, src path = " + this.f84339n);
            }
        }
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final boolean a(int i10) {
        sg.bigo.ads.common.t.a.a("VideoPlayView", "onInfo called, whatInfo = ".concat(String.valueOf(i10)));
        if (i10 == 3) {
            sg.bigo.ads.common.t.a.a("VideoPlayView", "player pushed first video frame for rendering, video started");
            AdImageView adImageView = this.f84338m;
            if (adImageView != null) {
                adImageView.setVisibility(8);
            }
            ImageView imageView = this.f84336k;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final boolean a(int i10, int i11) {
        if (i10 == 100) {
            this.f84342q.e();
            this.f84342q = new c();
        }
        sg.bigo.ads.common.t.a.a(2, "VideoPlayView", "An error occurred during the video playback: ".concat(String.valueOf(i10)));
        a("AdError", new int[]{i10, i11});
        if (i10 == -38) {
            sg.bigo.ads.common.t.a.a(0, "VideoPlayView", "onError code = -38, now reset status and init again.Range=" + this.f84343r);
            this.f84342q.a(this.f84339n);
        } else {
            sg.bigo.ads.common.t.a.a(0, "VideoPlayView", "onError code = " + i10 + ", now reset status and init again.Range=" + this.f84343r);
            if (this.f84342q.c() == 0) {
                c cVar = this.f84342q;
                if (cVar.f84311i < 3) {
                    cVar.b(15);
                }
            }
        }
        return true;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void b() {
        if (this.f84364g || this.f84346u) {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "tryStartAd, video is completed play, unregister it from list");
            d(false);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "try start play video ad");
            a(false);
        }
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final boolean c() {
        return this.f84345t;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "destroy player");
        d(false);
        x();
        setOnEventListener(null);
        this.f84340o = null;
        sg.bigo.ads.common.n.d.a(this.f84349x);
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final boolean e() {
        return this.f84342q.f84308e;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void f() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onPlay");
        this.f84346u = false;
        int i10 = this.f84344s;
        if (i10 > 0) {
            this.f84342q.a(i10);
            this.f84344s = -1;
        }
        a("AdVideoPlaying", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void g() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", C3978d4.i.f31364t0);
        a("AdVideoPaused", (int[]) null);
    }

    public final int getAdDuration() {
        return this.f84342q.f();
    }

    public final int getAdRemainingTime() {
        return this.f84342q.c();
    }

    public final ImageView getCoverView() {
        return this.f84338m;
    }

    public final int getCurrentPos() {
        return this.f84343r;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final int getPlayStatus() {
        return this.f84342q.f84307d;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void h() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onStop");
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void i() {
        String str;
        int adRemainingTime = getAdRemainingTime();
        if (this.G && (str = this.f84339n) != null && !str.startsWith("file:")) {
            if (this.D == adRemainingTime) {
                if (!this.E) {
                    if (this.f84340o == null) {
                        z();
                    }
                    this.f84340o.setVisibility(0);
                    sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onBuffering");
                    this.C = true;
                    a("AdVideoBuffering", (int[]) null);
                }
                this.E = true;
            } else {
                if (this.E) {
                    A();
                    sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onBuffered");
                    this.C = false;
                    a("AdVideoBuffered", (int[]) null);
                }
                this.E = false;
            }
            this.D = adRemainingTime;
        }
        if (this.F <= 0) {
            int adDuration = getAdDuration();
            this.F = adDuration;
            if (adDuration <= 0) {
                return;
            }
        }
        int i10 = this.F;
        if (adRemainingTime > i10) {
            adRemainingTime = i10;
        }
        this.f84343r = adRemainingTime;
        a("AdRemainingTimeChange", new int[]{adRemainingTime, i10, (int) ((adRemainingTime * 100.0f) / i10)});
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void j() {
        this.f84346u = true;
        AdImageView adImageView = this.f84338m;
        if (adImageView != null) {
            adImageView.setVisibility(0);
        }
        this.f84337l.setVisibility(this.f84347v ? 8 : 0);
        this.f84337l.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f84360c, R.drawable.bigo_ad_ic_media_play));
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onCompletion play");
        d(false);
        a("AdVideoComplete", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void j_() {
        a("AdVideoStart", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void k() {
        a("AdSizeChange", (int[]) null);
    }

    public final void l() {
        g gVar;
        if (this.f84362e == null || (gVar = this.f84335j) == null || !gVar.isAvailable() || this.L || this.f84362e.bh() == null || this.f84362e.bb()) {
            return;
        }
        Bitmap bitmap = (Bitmap) this.f84362e.bh().first;
        this.L = true;
        B();
        a(bitmap);
        int[] iArr = new int[1];
        c cVar = this.f84342q;
        iArr[0] = (cVar == null || !(TextUtils.isEmpty(cVar.f84305b) ^ true)) ? 0 : 1;
        a("AdBackupImgReady", iArr);
    }

    public final void m() {
        g gVar;
        if (this.f84362e == null || (gVar = this.f84335j) == null || this.L || !gVar.isAvailable() || this.f84362e.bb()) {
            return;
        }
        this.L = true;
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "real video is download success, update media player datasource:  " + this.f84362e.c(getContext()));
        this.f84342q.a(this.f84362e.c(getContext().getApplicationContext()));
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final boolean n() {
        return this.K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onDetachedFromWindow called");
        d(false);
        this.f84340o = null;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onVisibilityChanged visibility != VISIBLE");
            d(false);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onVisibilityChanged visibility == VISIBLE");
            d(true);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onWindowVisibilityChanged: ".concat(String.valueOf(i10)));
        View view = this.M;
        if (view != null) {
            if (i10 == 0) {
                u.b(view);
                u.a(this.f84335j, this, null, 0);
            } else {
                u.b(this.f84335j);
                u.a(this.M, this, new FrameLayout.LayoutParams(this.f84333h, this.f84334i), 0);
            }
        }
    }

    public final void setIVideoPlayerViewListener(b bVar) {
        this.N = bVar;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void setMute(boolean z10) {
        if (this.f84345t == z10) {
            this.A = false;
            return;
        }
        boolean zA = this.f84342q.a(z10);
        this.f84345t = zA;
        ImageView imageView = this.f84336k;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f84360c, zA ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
        if (this.A || this.B) {
            this.A = false;
            this.B = false;
        } else {
            int[] iArr = new int[1];
            iArr[0] = this.f84345t ? 0 : 100;
            a("AdVolumeChange", iArr);
        }
    }

    public final void setPlayInfo$505cff1c(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "setPlayInfo path=" + str + ",position=0");
        this.f84339n = str;
        this.f84343r = 0;
    }

    public final void setSeekPos(int i10) {
        this.f84344s = i10;
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final void setStatPrepareEventOnce(boolean z10) {
        this.K = z10;
    }
}
