package sg.bigo.ads.ad.splash.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.v;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.splash.a.c;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.SplashAdRequest;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes10.dex */
public class b implements h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static Bitmap f81602j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public n f81603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final m f81604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final m f81605c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f81607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f81608f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.ad.splash.b f81610h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.core.f f81612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f81613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Runnable f81614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private View f81615n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicBoolean f81606d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f81609g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81611i = c.a.f81639a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f81616o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<v> f81617p = new ArrayList();

    public b(@NonNull sg.bigo.ads.api.core.f fVar, @NonNull m mVar, @Nullable m mVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        this.f81610h = bVar;
        this.f81604b = mVar;
        this.f81605c = mVar2;
        this.f81612k = fVar;
        this.f81613l = fVar.f81860a.i();
    }

    private void l() {
        n nVar = this.f81607e;
        if (nVar != null) {
            nVar.b();
            this.f81607e = null;
        }
        if (this.f81614m != null) {
            this.f81614m = null;
        }
    }

    private void m() {
        this.f81611i = c.a.f81642d;
        n nVar = this.f81603a;
        if (nVar != null) {
            nVar.b();
        }
        n nVar2 = this.f81608f;
        if (nVar2 != null) {
            nVar2.b();
        }
        l();
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
        VideoController videoController;
        if (this.f81611i == c.a.f81640b && (videoController = this.f81610h.f81733z.getVideoController()) != null) {
            videoController.setVideoLifeCallback(new VideoController.VideoLifeCallback() { // from class: sg.bigo.ads.ad.splash.a.b.1
                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onMuteChange(boolean z10) {
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoEnd() {
                    if (!b.this.f81610h.F()) {
                        b.this.f81610h.D();
                    }
                    sg.bigo.ads.ad.splash.b bVar = b.this.f81610h;
                    m mVar = bVar.C;
                    if (mVar == null || mVar.a("endpage.endpage_timing", 0) != 2) {
                        return;
                    }
                    bVar.a(8, 1);
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPause() {
                    b.this.f81610h.B();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPlay() {
                    b.this.f81610h.C();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoStart() {
                    if (b.this.f81609g.compareAndSet(true, false)) {
                        b.this.h();
                        n nVar = b.this.f81603a;
                        if (nVar != null) {
                            nVar.b();
                            b.this.f81603a = null;
                        }
                        b.this.f81610h.A();
                        n nVar2 = b.this.f81608f;
                        if (nVar2 != null) {
                            nVar2.b();
                            b.this.f81608f = null;
                        }
                    }
                }
            });
            videoController.setBackupLoadCallback(new VideoController.a() { // from class: sg.bigo.ads.ad.splash.a.b.5
                @Override // sg.bigo.ads.api.VideoController.a
                public final void i(boolean z10) {
                    sg.bigo.ads.common.t.a.a(0, 4, "SplashAd", "backup image loaded when show default backup style, so cancel this timer");
                    n nVar = b.this.f81607e;
                    if (nVar != null) {
                        nVar.b();
                        b.this.f81607e = null;
                    }
                    n nVar2 = b.this.f81603a;
                    if (nVar2 != null) {
                        nVar2.b();
                        b.this.f81603a = null;
                    }
                    b.this.f81610h.A();
                    n nVar3 = b.this.f81608f;
                    if (nVar3 != null) {
                        nVar3.b();
                        b.this.f81608f = null;
                    }
                }
            });
        }
        h();
        sg.bigo.ads.api.core.f fVar = this.f81610h.D;
        final String strL = fVar == null ? "" : fVar.f81861b.l();
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.12
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.controller.c.a.a(strL);
                sg.bigo.ads.common.x.a.j(strL);
                String str = strL;
                sg.bigo.ads.common.x.a.a(str, sg.bigo.ads.common.x.a.i(str) + 1);
                sg.bigo.ads.common.x.a.a(strL, System.currentTimeMillis());
            }
        });
    }

    public void a(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container);
        boolean zG = g();
        if (viewGroup2 != null) {
            if (zG) {
                sg.bigo.ads.ad.splash.a.a(viewGroup2, i10);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
    }

    public final void a(@NonNull sg.bigo.ads.ad.b.b bVar, final ImageView imageView) {
        sg.bigo.ads.ad.splash.a.a(bVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.a.b.8
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.8.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(bitmap2);
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final void a(v vVar) {
        if (vVar == null) {
            return;
        }
        if (f81602j != null) {
            vVar.a();
            return;
        }
        this.f81617p.add(vVar);
        if (this.f81616o == 1) {
            return;
        }
        sg.bigo.ads.api.core.n nVar = (sg.bigo.ads.api.core.n) this.f81610h.f81733z.f();
        if (!nVar.aR()) {
            String strAT = nVar.aT();
            if (q.a((CharSequence) strAT)) {
                k();
                return;
            } else {
                this.f81616o = 1;
                sg.bigo.ads.common.p.e.a(this.f81610h.f80021b.f81864e, strAT, nVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.splash.a.b.4
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i10, @NonNull String str, String str2) {
                        b.this.k();
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        b.f81602j = bitmap;
                        b.this.k();
                    }
                });
                return;
            }
        }
        String strB = o.b(this.f81610h.f80021b.f81864e, nVar.aN());
        if (q.a((CharSequence) strB)) {
            k();
            return;
        }
        this.f81616o = 1;
        final String path = Uri.parse(strB).getPath();
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.f81602j = sg.bigo.ads.common.utils.d.a(Uri.parse(path).getPath(), b.this.f81610h.f80021b.f81864e);
                b.this.k();
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public void a(boolean z10) {
        if (!z10) {
            n nVar = this.f81607e;
            if (nVar != null) {
                nVar.d();
            }
            n nVar2 = this.f81608f;
            if (nVar2 != null) {
                nVar2.d();
                return;
            }
            return;
        }
        n nVar3 = this.f81607e;
        if (nVar3 != null && nVar3.e()) {
            this.f81607e.c();
        }
        n nVar4 = this.f81608f;
        if (nVar4 == null || !nVar4.e()) {
            return;
        }
        this.f81608f.c();
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public void a(boolean z10, @NonNull ViewGroup viewGroup, int i10) {
        byte b10;
        sg.bigo.ads.ad.b.b bVar;
        int i11;
        String title;
        int i12;
        View view = this.f81615n;
        if (!z10) {
            if (view != null) {
                this.f81611i = c.a.f81641c;
                view.setVisibility(8);
                m();
                return;
            }
            return;
        }
        if (view != null) {
            this.f81611i = c.a.f81640b;
            view.setVisibility(0);
            return;
        }
        this.f81611i = c.a.f81640b;
        sg.bigo.ads.api.core.n nVar = (sg.bigo.ads.api.core.n) this.f81610h.f81733z.f();
        if (nVar.w() == 2 && !nVar.aZ()) {
            this.f81609g.set(true);
        }
        this.f81615n = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), e(), null, false);
        viewGroup.addView(this.f81615n, 1, new ViewGroup.LayoutParams(-1, -1));
        viewGroup.setTag(11);
        MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
        if (mediaView != null) {
            mediaView.setImageBlurBorder(false);
        }
        AdOptionsView adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.bigo_ad_splash_options);
        final sg.bigo.ads.ad.b.b bVar2 = this.f81610h.f81733z;
        List<View> arrayList = new ArrayList<>();
        boolean zB = sg.bigo.ads.ad.splash.a.b(this.f81604b);
        final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.bigo_ad_splash_icon);
        if (imageView != null) {
            imageView.setTag(1);
            if (zB) {
                sg.bigo.ads.api.b bVar3 = this.f81612k.f81862c;
                if ((bVar3 instanceof SplashAdRequest) && (i12 = ((SplashAdRequest) bVar3).f81786i) != 0) {
                    imageView.setImageResource(i12);
                }
            } else {
                String strC = nVar.av() != null ? nVar.av().c() : null;
                if (q.a((CharSequence) strC) || !URLUtil.isNetworkUrl(strC)) {
                    a(bVar2, imageView);
                } else {
                    sg.bigo.ads.common.p.e.b(this.f81610h.f80021b.f81864e, null, strC, nVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.splash.a.b.6
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i13, @NonNull String str, String str2) {
                            b bVar4 = b.this;
                            if (bVar4.f81611i == c.a.f81640b) {
                                bVar4.a(bVar2, imageView);
                            }
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                            if (b.this.f81611i == c.a.f81640b) {
                                imageView.setImageBitmap(bitmap);
                            }
                        }
                    });
                }
            }
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
        if (textView != null) {
            textView.setTag(2);
            if (zB) {
                sg.bigo.ads.api.b bVar4 = this.f81612k.f81862c;
                title = bVar4 instanceof SplashAdRequest ? ((SplashAdRequest) bVar4).f81787j : null;
            } else {
                title = bVar2.getTitle();
            }
            if (!TextUtils.isEmpty(title)) {
                textView.setText(title);
            }
        }
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_splash_advertiser);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.inter_splash_adtage);
        if (q.a((CharSequence) this.f81613l)) {
            textView2.setVisibility(8);
        } else {
            textView3.setText(R.string.bigo_ad_tag);
            textView2.setText(this.f81613l);
            textView2.setPadding(sg.bigo.ads.common.utils.e.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 1), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 1));
        }
        Button button = (Button) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta);
        if (button != null) {
            button.setTag(7);
            if (!TextUtils.isEmpty(bVar2.getCallToAction())) {
                button.setText(bVar2.getCallToAction());
            }
            arrayList.add(button);
            if (sg.bigo.ads.ad.splash.a.b()) {
                button.getLayoutParams().width = sg.bigo.ads.common.utils.e.a(button.getContext(), 333);
            }
            Drawable background = button.getBackground();
            m mVar = this.f81605c;
            if (mVar != null && (background instanceof GradientDrawable)) {
                ((GradientDrawable) background).setColor(r.a(bVar2, mVar.a("video_play_page.cta_color"), null));
            }
        }
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_description);
        if (textView4 != null) {
            textView4.setTag(6);
            String description = bVar2.getDescription();
            if (!TextUtils.isEmpty(description)) {
                textView4.setText(description);
            }
            arrayList.add(textView4);
        }
        TextView textView5 = (TextView) viewGroup.findViewById(R.id.inter_warning);
        if (textView5 != null) {
            textView5.setTag(8);
            String warning = bVar2.getWarning();
            if (!TextUtils.isEmpty(warning)) {
                textView5.setText(warning);
            }
            arrayList.add(textView5);
        }
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.splash_rating_star);
        if (imageView2 != null) {
            String creativeId = bVar2.getCreativeId();
            if (creativeId == null) {
                creativeId = "";
            }
            Bitmap bitmapA = sg.bigo.ads.common.utils.d.a(imageView2.getContext(), (sg.bigo.ads.ad.b.e.a(creativeId, 4) * 0.5f) + 3.5f, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half);
            if (bitmapA != null) {
                imageView2.setTag(26);
                imageView2.setImageBitmap(bitmapA);
            }
        }
        bVar2.registerViewForInteraction(viewGroup, mediaView, (ImageView) null, adOptionsView, arrayList);
        if (mediaView != null) {
            if (sg.bigo.ads.ad.splash.a.b()) {
                mediaView.getLayoutParams().width = -2;
                b10 = -1;
                mediaView.getLayoutParams().height = -1;
            } else {
                b10 = -1;
            }
            if (bVar2.getCreativeType() == NativeAd.CreativeType.VIDEO) {
                mediaView.b().a(false);
            }
        } else {
            b10 = -1;
        }
        if (this.f81605c != null) {
            sg.bigo.ads.core.adview.h hVar = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.splash.a.b.7
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i13, int i14, int i15, int i16, int i17, int i18) {
                }
            };
            View viewFindViewById = viewGroup.findViewById(R.id.layout_contain_view);
            int iA = this.f81605c.a("video_play_page.click_type");
            if (mediaView != null) {
                if (this.f81605c.c("video_play_page.media_view_clickable_switch")) {
                    sg.bigo.ads.ad.b.a.a(viewGroup, mediaView, 8, bVar2, iA);
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup, mediaView, 8, hVar, iA);
                }
                if (viewFindViewById != null) {
                    viewFindViewById.setTag(9);
                }
                if (this.f81605c.c("video_play_page.other_space_clickable_switch")) {
                    mediaView.setOtherClickAreaClick(true);
                    sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, 8, bVar2, iA);
                    if (viewFindViewById != null) {
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, bVar2, iA);
                    }
                } else {
                    mediaView.setOtherClickAreaClick(false);
                    sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, 8, hVar, iA);
                    if (viewFindViewById != null) {
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, hVar, iA);
                    }
                }
            }
            if (button != null) {
                sg.bigo.ads.ad.b.a.a(viewGroup, button, 8, bVar2, iA);
            }
            if (imageView != null) {
                if (zB) {
                    sg.bigo.ads.ad.b.a.a(viewGroup, imageView, 8, hVar, iA);
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup, imageView, 8, bVar2, iA);
                }
            }
            if (textView != null) {
                if (zB) {
                    sg.bigo.ads.ad.b.a.a(viewGroup, textView, 8, hVar, iA);
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup, textView, 8, bVar2, iA);
                }
            }
            View viewFindViewById2 = viewGroup.findViewById(R.id.inter_layout_ad_tag);
            if (viewFindViewById2 != null) {
                sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById2, 8, hVar, iA);
            }
            View viewFindViewById3 = viewGroup.findViewById(R.id.layout_ad_component);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setTag(18);
                if (this.f81605c.c("video_play_page.ad_component_clickable_switch")) {
                    sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById3, 8, bVar2, iA);
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById3, 8, hVar, iA);
                }
            }
            if (viewFindViewById != null) {
                bVar = bVar2;
                i11 = 6;
                sg.bigo.ads.ad.splash.a.a(viewGroup, viewFindViewById, this.f81605c.a("video_play_page.below_area_dp"), this.f81605c.a("video_play_page.below_area_clickable") == 1, this.f81605c.a("video_play_page.up_area_dp"), this.f81605c.a("video_play_page.up_area_clickable") == 1, 8, iA, bVar);
            } else {
                bVar = bVar2;
                i11 = 6;
            }
        } else {
            bVar = bVar2;
            i11 = 6;
            int iA2 = this.f81604b.a("splash_clickable_area");
            if (iA2 == 1) {
                sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, 1, bVar, 0);
            } else if (iA2 == 2 && mediaView != null) {
                mediaView.setOnTouchListener(null);
            }
        }
        int iA3 = this.f81604b.a("splash_cta_type");
        m mVar2 = this.f81605c;
        if (mVar2 != null) {
            int iA4 = mVar2.a("video_play_page.is_cta_show_animation");
            if (iA4 <= 0 || iA4 > i11) {
                iA4 = 1;
            }
            iA3 = iA4 - 1;
        }
        if (iA3 == 5 && button != null) {
            button.setTextSize(2, 15.0f);
            button.setBackground(null);
            View viewFindViewById4 = viewGroup.findViewById(R.id.splash_footer_bg);
            if (viewFindViewById4 != null) {
                viewFindViewById4.setVisibility(0);
                viewFindViewById4.setTag(14);
                if (this.f81605c != null) {
                    sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById4, 8, bVar, 0);
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById4, 1, bVar, 0);
                }
            }
        }
        a(viewGroup, iA3);
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void b() {
        l();
        this.f81606d.set(true);
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public void c() {
        m();
        f81602j = null;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    @NonNull
    public final int d() {
        return this.f81611i;
    }

    @LayoutRes
    public int e() {
        return (this.f81605c != null && f()) ? sg.bigo.ads.ad.splash.a.b(this.f81604b) ? R.layout.bigo_ad_splash_style_halfscreen : R.layout.bigo_ad_splash_style_fullscreen_immersive : sg.bigo.ads.ad.splash.a.a(this.f81604b);
    }

    public final boolean f() {
        m mVar = this.f81605c;
        return mVar != null && 2 == mVar.a("video_play_page.ad_component_layout", 1);
    }

    public boolean g() {
        return true;
    }

    public final void h() {
        int iA;
        int iMax;
        int iB;
        final int iA2;
        n nVar = this.f81607e;
        if (nVar != null) {
            nVar.b();
            this.f81607e = null;
        }
        final int i10 = -1;
        if (this.f81609g.get() && this.f81610h.f().bh() == null) {
            m mVar = this.f81605c;
            if (mVar != null && (iA2 = w.a(mVar.a("video_play_page.time_for_auto_click", -1))) > 0) {
                n nVar2 = new n(((long) iA2) * 1000) { // from class: sg.bigo.ads.ad.splash.a.b.9
                    @Override // sg.bigo.ads.common.utils.n
                    public final void a() {
                        if (b.this.f81606d.compareAndSet(false, true)) {
                            sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", "auto click after " + iA2 + "s");
                            b.this.f81610h.H();
                        }
                    }

                    @Override // sg.bigo.ads.common.utils.n
                    public final void a(long j10) {
                    }
                };
                this.f81607e = nVar2;
                nVar2.c();
            }
            m mVar2 = this.f81605c;
            if (mVar2 == null || (iB = w.b(mVar2.a("video_play_page.time_for_show_backup", -1))) <= 0) {
                return;
            }
            n nVar3 = new n(((long) iB) * 1000) { // from class: sg.bigo.ads.ad.splash.a.b.2
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    b.this.f81610h.a(10, 13);
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j10) {
                }
            };
            this.f81608f = nVar3;
            nVar3.c();
            return;
        }
        m mVar3 = this.f81605c;
        if (mVar3 == null || (iA = mVar3.a("video_play_page.auto_click")) < 2 || iA > 7) {
            return;
        }
        if (iA <= 5) {
            i10 = iA;
        } else if (iA == 7 && (iMax = Math.max(0, this.f81604b.a("splash_duration"))) > 0 && this.f81603a != null) {
            i10 = iMax - 1;
        }
        if (i10 >= 0) {
            n nVar4 = new n(((long) i10) * 1000) { // from class: sg.bigo.ads.ad.splash.a.b.10
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    if (b.this.f81606d.compareAndSet(false, true)) {
                        sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", "auto click after " + i10 + "s");
                        b.this.f81610h.H();
                    }
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j10) {
                }
            };
            this.f81607e = nVar4;
            nVar4.c();
        } else if (iA == 6) {
            this.f81614m = new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.11
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.f81606d.compareAndSet(false, true)) {
                        sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", "auto click after ");
                        b.this.f81610h.H();
                    }
                }
            };
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final AtomicBoolean i() {
        return this.f81609g;
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final void j() {
        Runnable runnable = this.f81614m;
        if (runnable != null) {
            runnable.run();
            this.f81614m = null;
        }
    }

    public final void k() {
        this.f81616o = 2;
        Iterator<v> it = this.f81617p.iterator();
        while (it.hasNext()) {
            it.next().a();
            it.remove();
        }
    }
}
