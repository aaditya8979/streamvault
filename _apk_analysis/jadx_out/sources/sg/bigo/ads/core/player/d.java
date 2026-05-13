package sg.bigo.ads.core.player;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.common.aa.b;
import sg.bigo.ads.core.player.b.f;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Handler f84387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<WeakReference<View>> f84388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f84389d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f84391a = new d(0);
    }

    private d() {
        this.f84386a = false;
        this.f84387b = new Handler(Looper.getMainLooper());
        this.f84388c = new ArrayList<>();
        this.f84389d = new Runnable() { // from class: sg.bigo.ads.core.player.d.1
            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.a()) {
                    d.this.f84387b.postDelayed(this, 500L);
                }
            }
        };
    }

    public /* synthetic */ d(byte b10) {
        this();
    }

    private synchronized void b() {
        c();
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "startCheckTask called");
        this.f84387b.post(this.f84389d);
    }

    private synchronized void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "removeCheckTask called");
        this.f84387b.removeCallbacksAndMessages(null);
        a();
    }

    @Override // sg.bigo.ads.common.aa.b.a
    public final void a(int i10) {
        if (i10 == 1) {
            b();
        }
    }

    public final synchronized void a(@NonNull f fVar) {
        boolean z10;
        Iterator<WeakReference<View>> it = this.f84388c.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            View view = it.next().get();
            if (view == null) {
                it.remove();
            } else if (view == fVar) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            sg.bigo.ads.common.t.a.b("VideoPlayerManager", "register playerView exist already");
            return;
        }
        this.f84388c.add(new WeakReference<>(fVar));
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "register playerView, size = " + this.f84388c.size());
        b();
        if (!this.f84386a) {
            this.f84386a = true;
            sg.bigo.ads.common.aa.b.a(fVar.getContext().getApplicationContext(), this);
        }
    }

    public final synchronized boolean a() {
        f fVar;
        int playStatus;
        if (this.f84388c.isEmpty()) {
            return false;
        }
        View view = null;
        Iterator<WeakReference<View>> it = this.f84388c.iterator();
        boolean z10 = false;
        int i10 = 0;
        while (it.hasNext()) {
            View view2 = it.next().get();
            if (view2 instanceof f) {
                z10 = view2.getContext() != null && sg.bigo.ads.common.aa.b.a(view2.getContext().getApplicationContext());
                float f10 = 0.0f;
                if (sg.bigo.ads.common.ab.a.a(view2, new Rect())) {
                    float height = view2.getHeight() * 1.0f * view2.getWidth();
                    float fHeight = r8.height() * 1.0f * r8.width();
                    if (height <= 0.0f) {
                        sg.bigo.ads.common.t.a.a(0, 3, "ImpressionChecker", "adView is not visible, width or height is 0");
                    } else {
                        f10 = fHeight / height;
                    }
                }
                int i11 = (int) (100.0f * f10);
                if (i11 < i10 || i11 < 50 || !z10) {
                    ((f) view2).s();
                } else {
                    if (i11 == i10) {
                        f fVar2 = (f) view;
                        if (fVar2.f84363f) {
                            fVar2.s();
                        }
                    } else {
                        i10 = i11;
                    }
                    view = view2;
                }
            } else {
                it.remove();
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "playView is recycled, remove it");
            }
        }
        if (view != null && (playStatus = (fVar = (f) view).getPlayStatus()) != 2 && playStatus != 5 && playStatus != 0) {
            fVar.b();
        }
        return z10;
    }

    public final synchronized void b(@NonNull f fVar) {
        Iterator<WeakReference<View>> it = this.f84388c.iterator();
        while (it.hasNext()) {
            View view = it.next().get();
            if (view != null) {
                if (view == fVar) {
                    fVar.s();
                }
            }
            it.remove();
        }
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "unregister player, size = " + this.f84388c.size());
        if (this.f84388c.isEmpty()) {
            c();
        }
    }
}
