package sg.bigo.ads.core.player.b;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.player.d;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f extends FrameLayout implements sg.bigo.ads.api.c.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private ImageView f84358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.core.g.c f84359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public Context f84360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.c.b f84361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final sg.bigo.ads.core.a.a f84362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f84365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f84366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f84367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f84368k;

    public f(@NonNull Context context, @NonNull sg.bigo.ads.api.c.b bVar, @Nullable sg.bigo.ads.core.a.a aVar) {
        super(context);
        this.f84363f = true;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sg.bigo.ads.core.player.b.f.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view == f.this.f84358a) {
                    f.this.o();
                    return;
                }
                f fVar = f.this;
                if (view == fVar) {
                    fVar.p();
                }
            }
        };
        this.f84366i = onClickListener;
        this.f84367j = new Runnable() { // from class: sg.bigo.ads.core.player.b.f.2
            @Override // java.lang.Runnable
            public final void run() {
                f.this.setPlayOrPauseViewHidden(true);
            }
        };
        this.f84364g = false;
        this.f84368k = true;
        this.f84360c = context;
        this.f84361d = bVar;
        this.f84362e = aVar;
        if (!bVar.f81834c) {
            int iB = sg.bigo.ads.common.utils.a.b(context, R.dimen.bigo_ad_volume_padding);
            ImageView imageView = new ImageView(this.f84360c);
            this.f84358a = imageView;
            imageView.setOnClickListener(onClickListener);
            this.f84358a.setPadding(iB, iB, iB, iB);
            int iB2 = sg.bigo.ads.common.utils.a.b(this.f84360c, R.dimen.bigo_ad_volume_size) + (iB * 2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iB2, iB2, 85);
            layoutParams.rightMargin = iB;
            layoutParams.bottomMargin = iB;
            this.f84358a.setVisibility(0);
            u.a(this.f84358a, this, layoutParams, -1);
        }
        int iB3 = sg.bigo.ads.common.utils.a.b(this.f84360c, R.dimen.bigo_ad_replay_size);
        if (aVar != null && aVar.x() == 2 && sg.bigo.ads.api.c.b.b() > 0) {
            iB3 = sg.bigo.ads.common.utils.e.a(this.f84360c, sg.bigo.ads.api.c.b.b());
        }
        ImageView imageView2 = new ImageView(this.f84360c);
        this.f84365h = imageView2;
        imageView2.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f84360c, R.drawable.bigo_ad_ic_media_play));
        u.a(this.f84365h, this, new FrameLayout.LayoutParams(iB3, iB3, 17), -1);
        setOnClickListener(onClickListener);
    }

    public final void a(String str, Object obj, @Nullable int[] iArr) {
        sg.bigo.ads.core.g.c cVar = this.f84359b;
        if (cVar != null) {
            cVar.a(str, obj, iArr);
        }
    }

    public final void a(String str, @Nullable int[] iArr) {
        sg.bigo.ads.core.g.c cVar = this.f84359b;
        if (cVar != null) {
            cVar.a(str, iArr);
        }
    }

    @CallSuper
    public void a(boolean z10) {
        this.f84364g = false;
    }

    public final void b(int i10) {
        sg.bigo.ads.core.a.a aVar = this.f84362e;
        if (aVar != null) {
            sg.bigo.ads.core.d.b.a(aVar, i10, aVar.aK(), this.f84362e.aM());
        }
    }

    public final void b(boolean z10) {
        ImageView imageView = this.f84358a;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f84360c, z10 ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
    }

    public final void c(boolean z10) {
        ImageView imageView = this.f84365h;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f84360c, z10 ? R.drawable.bigo_ad_ic_media_play : R.drawable.bigo_ad_ic_media_pause));
        }
    }

    public final void d(boolean z10) {
        if (z10) {
            d.a.f84391a.a(this);
        } else {
            d.a.f84391a.b(this);
        }
    }

    public final void e(boolean z10) {
        if (this.f84364g) {
            b(9);
        }
        a(z10);
    }

    public boolean e() {
        return false;
    }

    public boolean n() {
        return this.f84368k;
    }

    public final void o() {
        setMute(!c());
    }

    public final void p() {
        v();
    }

    public final boolean q() {
        return this.f84364g;
    }

    public final void r() {
        this.f84364g = false;
    }

    public final void s() {
        if (t()) {
            a();
        }
    }

    public void setNeedPauseWhenVisiblePercentEqual(boolean z10) {
        this.f84363f = z10;
    }

    public void setOnEventListener(sg.bigo.ads.core.g.c cVar) {
        this.f84359b = cVar;
    }

    public void setPlayOrPauseViewHidden(boolean z10) {
        ImageView imageView = this.f84365h;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 8 : 0);
        }
    }

    public void setStatPrepareEventOnce(boolean z10) {
        this.f84368k = z10;
    }

    public void setVolumeViewHidden(boolean z10) {
        ImageView imageView = this.f84358a;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 4 : 0);
        }
    }

    public final boolean t() {
        return getPlayStatus() == 2;
    }

    public final void u() {
        this.f84364g = true;
        a();
        b(8);
    }

    public final void v() {
        if (e()) {
            if (t()) {
                removeCallbacks(this.f84367j);
                u();
                setPlayOrPauseViewHidden(false);
                c(true);
                return;
            }
            removeCallbacks(this.f84367j);
            e(false);
            this.f84365h.setVisibility(0);
            setPlayOrPauseViewHidden(false);
            c(false);
            postDelayed(this.f84367j, 1500L);
        }
    }
}
