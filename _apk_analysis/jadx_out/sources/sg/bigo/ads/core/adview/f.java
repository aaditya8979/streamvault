package sg.bigo.ads.core.adview;

import android.view.View;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.player.d;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends c implements MediaView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.core.player.b.f f83593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdImageView f83594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f83595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f83596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public VideoController f83597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f83598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f83599h;

    public static class a implements VideoController {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final sg.bigo.ads.core.player.b.f f83600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private VideoController.VideoLifeCallback f83601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private VideoController.d f83602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private VideoController.c f83603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private VideoController.a f83604e;

        public a(@NonNull sg.bigo.ads.core.player.b.f fVar) {
            this.f83600a = fVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.a getBackupLoadCallback() {
            return this.f83604e;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.c getLoadHTMLCallback() {
            return this.f83603d;
        }

        @Override // sg.bigo.ads.api.VideoController
        @Nullable
        public final VideoController.d getProgressChangeListener() {
            return this.f83602c;
        }

        @Override // sg.bigo.ads.api.VideoController
        @Nullable
        public final VideoController.VideoLifeCallback getVideoLifeCallback() {
            return this.f83601b;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isMuted() {
            sg.bigo.ads.core.player.d unused = d.a.f84391a;
            return this.f83600a.c();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isPaused() {
            sg.bigo.ads.core.player.d unused = d.a.f84391a;
            return this.f83600a.getPlayStatus() == 3;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isPlaying() {
            sg.bigo.ads.core.player.d unused = d.a.f84391a;
            return this.f83600a.t();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void mute(boolean z10) {
            sg.bigo.ads.core.player.d unused = d.a.f84391a;
            this.f83600a.setMute(z10);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyBackupResourceReady() {
            sg.bigo.ads.core.player.d unused = d.a.f84391a;
            sg.bigo.ads.core.player.b.f fVar = this.f83600a;
            if (fVar instanceof sg.bigo.ads.core.player.b.e) {
                ((sg.bigo.ads.core.player.b.e) fVar).l();
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyPlayViewRegister() {
            d.a.f84391a.a(this.f83600a);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyResourceReady() {
            sg.bigo.ads.core.player.d unused = d.a.f84391a;
            sg.bigo.ads.core.player.b.f fVar = this.f83600a;
            if (fVar instanceof sg.bigo.ads.core.player.b.e) {
                ((sg.bigo.ads.core.player.b.e) fVar).m();
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void pause() {
            sg.bigo.ads.core.player.d unused = d.a.f84391a;
            this.f83600a.u();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void play() {
            sg.bigo.ads.core.player.d unused = d.a.f84391a;
            this.f83600a.e(true);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setBackupLoadCallback(VideoController.a aVar) {
            this.f83604e = aVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setLoadHTMLCallback(VideoController.c cVar) {
            this.f83603d = cVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setNeedPauseWhenVisiblePercentEqual(boolean z10) {
            sg.bigo.ads.core.player.b.f fVar = this.f83600a;
            if (fVar != null) {
                fVar.setNeedPauseWhenVisiblePercentEqual(z10);
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setProgressChangeListener(VideoController.d dVar) {
            this.f83602c = dVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setVideoLifeCallback(VideoController.VideoLifeCallback videoLifeCallback) {
            this.f83601b = videoLifeCallback;
        }
    }

    public f(@NonNull sg.bigo.ads.api.a<?> aVar) {
        super(aVar);
        this.f83593b = null;
        this.f83594c = null;
        Boolean bool = Boolean.TRUE;
        this.f83595d = bool;
        this.f83596e = bool;
        this.f83599h = true;
        this.f83598g = true;
    }

    private boolean b(int i10, int i11) {
        AdImageView adImageView = this.f83594c;
        if (adImageView != null) {
            return u.a(i10, i11, adImageView);
        }
        sg.bigo.ads.core.player.b.f fVar = this.f83593b;
        if (fVar != null) {
            return u.a(i10, i11, fVar);
        }
        return false;
    }

    @Override // sg.bigo.ads.core.adview.c
    public final void a(View view) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        }
        u.a(view, this.f83574a, null, -1);
    }

    public final void a(String str) {
        sg.bigo.ads.core.player.b.e eVar = new sg.bigo.ads.core.player.b.e(this.f83574a.getContext(), 0, 0, sg.bigo.ads.api.c.b.b(1), null);
        eVar.setClickable(this.f83599h);
        a(eVar);
        eVar.setPlayInfo$505cff1c(str);
        this.f83597f = new a(eVar);
        this.f83593b = eVar;
    }

    public final void a(@NonNull n nVar, @Nullable sg.bigo.ads.common.p.g gVar) {
        AdImageView adImageView;
        ImageView.ScaleType scaleType;
        AdImageView adImageView2;
        FrameLayout.LayoutParams layoutParams;
        sg.bigo.ads.api.c.b bVarB = sg.bigo.ads.api.c.b.b(nVar.x());
        if (this.f83594c == null) {
            this.f83594c = new AdImageView(this.f83574a.getContext());
        }
        int i10 = bVarB.f81832a;
        if (i10 == 1) {
            adImageView = this.f83594c;
            scaleType = ImageView.ScaleType.FIT_CENTER;
            adImageView.setScaleType(scaleType);
        } else if (i10 != 2) {
            if (i10 == 3) {
                adImageView2 = this.f83594c;
                layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
            } else if (i10 == 4) {
                adImageView2 = this.f83594c;
                layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
            }
            adImageView2.setLayoutParams(layoutParams);
            adImageView = this.f83594c;
            scaleType = ImageView.ScaleType.FIT_CENTER;
            adImageView.setScaleType(scaleType);
        } else {
            adImageView = this.f83594c;
            scaleType = ImageView.ScaleType.CENTER_CROP;
            adImageView.setScaleType(scaleType);
        }
        String strAT = nVar.aT();
        a(this.f83594c);
        this.f83594c.setBlurBorder(this.f83598g);
        this.f83594c.a(gVar);
        if (i.f81802a.n().a(9) && URLUtil.isHttpUrl(strAT) && gVar != null) {
            gVar.a(1305, "Invalid http url", "");
        } else {
            this.f83594c.a(strAT, nVar.al());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[PHI: r1
      0x0025: PHI (r1v1 int) = (r1v0 int), (r1v0 int), (r1v4 int) binds: [B:3:0x0010, B:5:0x0018, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@androidx.annotation.NonNull sg.bigo.ads.core.a.a r9, @androidx.annotation.NonNull sg.bigo.ads.core.f.a.p r10, sg.bigo.ads.core.g.c r11) {
        /*
            r8 = this;
            int r0 = r9.x()
            sg.bigo.ads.api.c.b r5 = sg.bigo.ads.api.c.b.b(r0)
            sg.bigo.ads.api.core.m r0 = r9.aV()
            int r1 = r10.f83969x
            int r10 = r10.f83968w
            if (r0 == 0) goto L25
            long r2 = r0.f81895c
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L25
            int r2 = r0.f81893a
            if (r2 <= 0) goto L1f
            r1 = r2
        L1f:
            int r0 = r0.f81894b
            if (r0 <= 0) goto L25
            r4 = r0
            goto L26
        L25:
            r4 = r10
        L26:
            r3 = r1
            sg.bigo.ads.core.player.b.e r10 = new sg.bigo.ads.core.player.b.e
            sg.bigo.ads.api.a<?> r0 = r8.f83574a
            android.content.Context r2 = r0.getContext()
            r1 = r10
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            boolean r0 = r8.f83599h
            r10.setClickable(r0)
            r8.a(r10)
            sg.bigo.ads.api.a<?> r0 = r8.f83574a
            android.content.Context r0 = r0.getContext()
            java.lang.String r9 = r9.c(r0)
            r10.setPlayInfo$505cff1c(r9)
            r10.setOnEventListener(r11)
            sg.bigo.ads.core.adview.f$a r9 = new sg.bigo.ads.core.adview.f$a
            r9.<init>(r10)
            r8.f83597f = r9
            r8.f83593b = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.adview.f.a(sg.bigo.ads.core.a.a, sg.bigo.ads.core.f.a.p, sg.bigo.ads.core.g.c):void");
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void a(sg.bigo.ads.core.player.b.b bVar) {
        sg.bigo.ads.core.player.b.f fVar = this.f83593b;
        if (fVar instanceof sg.bigo.ads.core.player.b.e) {
            ((sg.bigo.ads.core.player.b.e) fVar).setIVideoPlayerViewListener(bVar);
        }
    }

    public final void a(@NonNull sg.bigo.ads.core.player.b.d dVar) {
        dVar.setVPAIDClickable(this.f83599h);
        a((View) dVar);
        this.f83597f = new a(dVar);
        this.f83593b = dVar;
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void a(boolean z10) {
        sg.bigo.ads.core.player.b.f fVar = this.f83593b;
        if (fVar != null) {
            fVar.setClickable(z10);
        } else {
            this.f83599h = z10;
        }
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final boolean a() {
        sg.bigo.ads.core.player.b.f fVar = this.f83593b;
        return fVar != null ? fVar.isClickable() : this.f83599h;
    }

    @Override // sg.bigo.ads.core.adview.c
    public final boolean a(int i10, int i11) {
        int i12;
        boolean zB = b(i10, i11);
        if ((super.a(i10, i11) && (b(i10, i11) ^ true)) && this.f83595d.booleanValue()) {
            i12 = 9;
        } else {
            if (!zB || !this.f83596e.booleanValue()) {
                return false;
            }
            i12 = 5;
        }
        a(i12);
        return true;
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void b() {
        sg.bigo.ads.core.player.b.f fVar = this.f83593b;
        if (fVar != null) {
            fVar.performClick();
        }
    }

    public final int c() {
        AdImageView adImageView = this.f83594c;
        if (adImageView == null || adImageView.getDrawable() == null) {
            return 0;
        }
        return this.f83594c.getDrawable().getIntrinsicHeight();
    }

    public final int d() {
        AdImageView adImageView = this.f83594c;
        if (adImageView == null || adImageView.getDrawable() == null) {
            return 0;
        }
        return this.f83594c.getDrawable().getIntrinsicWidth();
    }
}
