package sg.bigo.ads.ad.interstitial;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.c;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.e.c;
import sg.bigo.ads.ad.interstitial.f.b;
import sg.bigo.ads.ad.interstitial.h;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.ad.interstitial.p;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.e.a;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends q implements c.a, b.InterfaceC0996b {
    private final List<Integer> G;

    @NonNull
    private final l H;
    private final WeakHashMap<Object, Integer> I;
    private final Map<Integer, WeakHashMap<Object, Runnable>> J;
    private final a.AbstractC1012a K;
    private boolean O;
    private Runnable P;
    private int Q;
    private int R;
    private final Runnable S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public View f80226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.a.m f80227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.api.a.m f80228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f80229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f80230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f80232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f80233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.interstitial.multi_img.b f80234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f80235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f80236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f80237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f80238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f80239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f80240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AtomicBoolean f80241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f80242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public p f80243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.interstitial.e.c f80244s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.interstitial.h.a f80245t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public sg.bigo.ads.common.utils.n f80246u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public sg.bigo.ads.common.utils.n f80247v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public sg.bigo.ads.common.utils.n f80248w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public sg.bigo.ads.common.utils.n f80249x;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a$2, reason: invalid class name */
    public class AnonymousClass2 extends sg.bigo.ads.common.utils.n {
        public AnonymousClass2(long j10) {
            super(j10, 1000L);
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a() {
            a aVar = a.this;
            aVar.a(aVar.f80247v, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroup viewGroup = a.this.D;
                    if (viewGroup != null) {
                        Context context = viewGroup.getContext();
                        int i10 = R.layout.bigo_ad_view_slide_gesture;
                        ViewGroup viewGroup2 = a.this.D;
                        sg.bigo.ads.common.utils.a.a(context, i10, viewGroup2, viewGroup2 != null);
                        View viewFindViewById = a.this.D.findViewById(R.id.inter_slide_gesture_contain);
                        a aVar2 = a.this;
                        aVar2.f80226a = aVar2.D.findViewById(R.id.inter_slide_gesture);
                        View view = a.this.f80226a;
                        if (view == null) {
                            return;
                        }
                        view.setTag(16);
                        t tVarAj = a.this.aj();
                        a aVar3 = a.this;
                        tVarAj.a(aVar3.D, viewFindViewById, aVar3.ai(), 8, 0, a.this.f80226a);
                        a.this.y();
                        final View view2 = a.this.f80226a;
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(300L);
                        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation2.setDuration(200L);
                        alphaAnimation2.setStartOffset(200L);
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 160.0f, 0.0f);
                        translateAnimation.setDuration(300L);
                        final AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(translateAnimation);
                        animationSet.addAnimation(alphaAnimation);
                        animationSet.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.9

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ View f80410a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ AlphaAnimation f80411b;

                            public AnonymousClass9(final View view22, final AlphaAnimation alphaAnimation22) {
                                view = view22;
                                alphaAnimation = alphaAnimation22;
                            }

                            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                view.startAnimation(alphaAnimation);
                            }
                        });
                        alphaAnimation22.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.10

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ AnimationSet f80379a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ View f80380b;

                            public AnonymousClass10(final AnimationSet animationSet2, final View view22) {
                                animationSet = animationSet2;
                                view = view22;
                            }

                            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                animationSet.setStartOffset(200L);
                                view.startAnimation(animationSet);
                            }
                        });
                        view22.startAnimation(animationSet2);
                        a.this.f80226a.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.2.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) a.this.f81070y)) {
                                    return;
                                }
                                a.this.x();
                            }
                        }, 5000L);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a(long j10) {
        }
    }

    public a(@NonNull Activity activity) {
        super(activity);
        this.G = new ArrayList();
        this.f80229d = false;
        this.f80230e = false;
        this.f80231f = false;
        this.f80232g = false;
        this.f80236k = new Handler(Looper.getMainLooper());
        this.f80238m = 0;
        this.f80239n = 0;
        this.f80240o = 0;
        this.f80241p = new AtomicBoolean(false);
        this.f80242q = true;
        this.H = new l();
        this.I = new WeakHashMap<>();
        this.J = new HashMap();
        this.K = new a.AbstractC1012a() { // from class: sg.bigo.ads.ad.interstitial.a.1
            @Override // sg.bigo.ads.common.e.a.AbstractC1012a
            public final void a(boolean z10) {
                a.this.c(z10);
            }
        };
        this.O = false;
        this.P = null;
        this.Q = 0;
        this.R = 0;
        this.S = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.A();
            }
        };
        sg.bigo.ads.ad.interstitial.f.b.f80917a = new WeakReference<>(this);
    }

    public static /* synthetic */ double a(int i10, int i11, int i12, int i13) {
        return Math.max(Math.abs(i10 - i12), Math.abs(i11 - i13));
    }

    private void a(sg.bigo.ads.api.a.m mVar) {
        if (mVar == null) {
            return;
        }
        this.f80234i = ((s) this.f81070y).F();
        sg.bigo.ads.core.a.a aVarI = ((s) this.f81070y).f();
        this.f80235j = new f(mVar.a("video_play_page.gp_element"), mVar.a("video_play_page.gp_force_time"), aVarI != null ? aVarI.n() : "");
    }

    private boolean ao() {
        if (!this.O) {
            return true;
        }
        if (e_() == 0) {
            return !j() || k();
        }
        return false;
    }

    private void ap() {
        t tVarAj = aj();
        if (tVarAj instanceof sg.bigo.ads.ad.interstitial.d.a) {
            if (tVarAj instanceof sg.bigo.ads.ad.interstitial.d.m) {
                ((sg.bigo.ads.ad.interstitial.d.m) tVarAj).a(this, this.D, this.f80233h, this.f80234i, this.f80235j);
            } else {
                ((sg.bigo.ads.ad.interstitial.d.a) tVarAj).a(this, this.D, this.f80233h, this.f80228c, this.f80235j);
            }
            p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void aq() {
        ViewGroup viewGroup;
        final View viewFindViewById;
        Bitmap bitmapA;
        if (!aH() || (viewGroup = this.D) == null || (viewFindViewById = viewGroup.findViewById(R.id.inter_ad_info_card_right_bottom)) == null) {
            return;
        }
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.inter_star);
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.bigo_ad_info_card_background);
        if (imageView != null && viewFindViewById2 != 0) {
            f fVar = this.f80235j;
            String creativeId = fVar != null ? fVar.f80893c : "";
            if (this.C != null && sg.bigo.ads.common.utils.q.a((CharSequence) creativeId)) {
                creativeId = this.C.getCreativeId();
            }
            float fA = (sg.bigo.ads.ad.b.e.a(creativeId, 4) * 0.5f) + 3.5f;
            d dVar = new d();
            TextView textView = (TextView) viewFindViewById.findViewById(R.id.inter_title);
            TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.inter_description);
            if (textView != null) {
                dVar.b(textView);
            }
            if (textView2 != null) {
                dVar.b(textView2);
            }
            sg.bigo.ads.api.a.m mVar = this.f80228c;
            int iA = mVar != null ? mVar.a("video_play_page.card_background_colour") : -1;
            if (iA == 1) {
                bitmapA = sg.bigo.ads.common.utils.d.a(this.D.getContext(), fA, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half);
                viewFindViewById2.setBackgroundColor(-1);
                dVar.a(-1);
            } else {
                if (iA == 2) {
                    viewFindViewById2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                    dVar.a(ViewCompat.MEASURED_STATE_MASK);
                } else {
                    sg.bigo.ads.ad.interstitial.e.b bVar = new sg.bigo.ads.ad.interstitial.e.b(sg.bigo.ads.common.utils.e.a(imageView.getContext(), 12), 0.0f, new sg.bigo.ads.ad.interstitial.e.a.b() { // from class: sg.bigo.ads.ad.interstitial.a.13
                    }.c());
                    Drawable drawableA = bVar.a();
                    if (drawableA != null) {
                        viewFindViewById2.setBackground(drawableA);
                    } else if (viewFindViewById2 instanceof sg.bigo.ads.common.view.a.c) {
                        ((sg.bigo.ads.common.view.a.c) viewFindViewById2).setBlurStyle(bVar);
                    }
                }
                bitmapA = sg.bigo.ads.common.utils.d.a(this.D.getContext(), fA, R.drawable.bigo_ad_ic_star_white, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half_white);
            }
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
                imageView.setVisibility(0);
            }
        }
        viewFindViewById.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.14
            @Override // java.lang.Runnable
            public final void run() {
                AnimationSet animationSet = new AnimationSet(true);
                Interpolator interpolatorA = sg.bigo.ads.common.utils.b.a(2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setInterpolator(interpolatorA);
                animationSet.addAnimation(alphaAnimation);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 1.0f, 1, 1.0f);
                scaleAnimation.setDuration(300L);
                alphaAnimation.setInterpolator(interpolatorA);
                animationSet.addAnimation(scaleAnimation);
                viewFindViewById.startAnimation(animationSet);
            }
        });
    }

    private void ar() {
        ViewGroup viewGroup;
        sg.bigo.ads.api.a.m mVar;
        if ((aj() instanceof sg.bigo.ads.ad.interstitial.d.a) || (viewGroup = this.D) == null) {
            return;
        }
        View viewFindViewById = viewGroup.findViewById(R.id.inter_download_msg);
        if (viewFindViewById != null) {
            f fVar = this.f80235j;
            if (fVar == null || !fVar.f80894d) {
                viewFindViewById.setVisibility(8);
                return;
            }
            Button button = (Button) viewGroup.findViewById(R.id.inter_btn_cta);
            if (button != null) {
                button.setText(R.string.bigo_ad_cta_download_default);
            }
            aj().a(viewGroup, viewFindViewById, ai(), 8, this.f80233h.f81495i, new View[0]);
        }
        if (aH()) {
            IconListView iconListView = (IconListView) viewGroup.findViewById(R.id.inter_iconlist_download_msg_list);
            if (this.f80235j == null || iconListView == null) {
                return;
            }
            boolean z10 = true;
            if (aH() && P() && (mVar = this.f80228c) != null) {
                int iA = mVar.a("video_play_page.background_colour");
                if (!aH() ? iA == 1 : iA == 1) {
                    z10 = false;
                }
            }
            iconListView.setThemeWhite(z10);
            iconListView.a(this.f80235j);
            iconListView.setVisibility(0);
        }
    }

    private void as() {
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            return;
        }
        Button button = (Button) viewGroup.findViewById(R.id.inter_btn_cta);
        TextView textView = (TextView) this.D.findViewById(R.id.inter_company);
        sg.bigo.ads.api.a.m mVar = this.f80228c;
        if (mVar != null) {
            int iA = mVar.a("video_play_page.cta_color");
            int iA2 = this.f80228c.a("endpage.cta_color");
            int iA3 = this.f80228c.a("layer.cta_color");
            this.f80238m = r.a(((s) this.f81070y).H(), iA, null);
            this.f80239n = r.a(((s) this.f81070y).H(), iA2, null);
            this.f80240o = r.a(((s) this.f81070y).H(), iA3, null);
            if (!(aj() instanceof sg.bigo.ads.ad.interstitial.d.a)) {
                if (button != null) {
                    button.setBackgroundColor(this.f80238m);
                }
                if (textView != null) {
                    textView.setTextColor(this.f80238m);
                }
            }
        }
        if (!P() || this.f80228c == null) {
            return;
        }
        View viewFindViewById = this.D.findViewById(R.id.inter_media_container);
        int iA4 = this.f80228c.a("video_play_page.background_colour");
        boolean z10 = false;
        if (!aH() ? iA4 == 3 || iA4 == 4 : iA4 == 4 || iA4 == 5) {
            z10 = true;
        }
        if (!z10 || viewFindViewById == null) {
            return;
        }
        viewFindViewById.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#66000000", -7829368));
        TextView textView2 = (TextView) this.D.findViewById(R.id.inter_warning);
        if (textView2 != null) {
            textView2.setTextColor(sg.bigo.ads.common.utils.q.b("#66FFFFFF", -1));
        }
    }

    @NonNull
    private LandingPageStyleConfig at() {
        sg.bigo.ads.api.a.m mVar = this.f80228c;
        if (mVar == null || !this.f80229d) {
            mVar = null;
        }
        int iA = sg.bigo.ads.ad.interstitial.h.a.a(mVar);
        int iB = sg.bigo.ads.ad.interstitial.h.a.b(mVar);
        sg.bigo.ads.ad.interstitial.h.a aVar = this.f80245t;
        int iA2 = (aVar == null || !aVar.d()) ? 0 : aj().f81426i;
        if (iA2 == 0) {
            iA2 = r.a(this.C, 0);
        }
        int i10 = iA2;
        Class<? extends sg.bigo.ads.controller.landing.d> clsI = i(iA);
        ViewGroup viewGroup = this.D;
        return new LandingPageStyleConfig(clsI, 9, iA, iB, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, i10, 0.8f);
    }

    private boolean au() {
        sg.bigo.ads.api.a.m mVar = this.f80228c;
        return mVar != null && mVar.c("layer.is_show_layer");
    }

    private void av() {
        ViewGroup viewGroup;
        if (!P() || (viewGroup = this.D) == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_title);
        TextView textView2 = (TextView) this.D.findViewById(R.id.inter_description);
        sg.bigo.ads.api.a.m mVar = this.f80228c;
        int i10 = (mVar != null ? mVar.a("video_play_page.background_colour") : -1) == 1 ? ViewCompat.MEASURED_STATE_MASK : -1;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        if (textView2 != null) {
            textView2.setTextColor(i10);
        }
    }

    public static Class<? extends sg.bigo.ads.controller.landing.d> i(int i10) {
        return i10 == 0 ? sg.bigo.ads.ad.interstitial.f.d.class : (7 == i10 || 8 == i10) ? sg.bigo.ads.ad.interstitial.f.a.class : sg.bigo.ads.ad.interstitial.f.e.class;
    }

    public static boolean j(int i10) {
        return (i10 == 7 || i10 == 8 || i10 == 0) ? false : true;
    }

    private void l(int i10) {
        sg.bigo.ads.ad.interstitial.multi_img.b bVarG;
        if (i10 != 0) {
            if (i10 == 1 && (bVarG = ((s) this.f81070y).G()) != null) {
                bVarG.a(2, 2);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f80234i;
        if (bVar != null) {
            bVar.a(1, 2);
        }
    }

    public void A() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.A.setVisibility(0);
            c.b((View) this.A);
        }
        if (e_() == 0) {
            int i10 = this.f80233h.f81489c;
            int iB = (i10 >= 0 || ((s) this.f81070y).f().x() == 4) ? i10 : 0;
            if (((s) this.f81070y).B()) {
                sg.bigo.ads.core.a.a aVarI = ((s) this.f81070y).f();
                if (this.f80241p.get() && aVarI.bh() == null) {
                    iB = w.b(this.f80233h.f81501o);
                }
            }
            this.A.a(iB, (AdCountDownButton.b) null);
        }
    }

    public final void B() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.getVisibility() != 0) {
            return;
        }
        this.A.clearAnimation();
        this.A.setVisibility(4);
    }

    public boolean C() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        sg.bigo.ads.api.a.m mVar;
        int i10 = R.layout.bigo_ad_view_click_guide;
        if (aH()) {
            sg.bigo.ads.api.a.m mVar2 = this.f80228c;
            iA = mVar2 != null ? mVar2.a("layer.guided_click") : -1;
            if (iA == 1) {
                i10 = R.layout.bigo_ad_view_click_guide_landscape_1;
            } else if (iA == 3) {
                i10 = R.layout.bigo_ad_view_click_guide_landscape_3;
            } else {
                i10 = R.layout.bigo_ad_view_click_guide_landscape_2;
                iA = 2;
            }
        }
        boolean z10 = false;
        if (this.D == null || e_() == 2 || e_() == 8 || !this.f80233h.f81490d) {
            return false;
        }
        sg.bigo.ads.ad.interstitial.h.a aVar = this.f80245t;
        if (aVar != null) {
            viewFindViewById = aVar.a(this, this.D, ai(), new u.a() { // from class: sg.bigo.ads.ad.interstitial.a.4
                @Override // sg.bigo.ads.ad.interstitial.u.a
                public final void a(View view) {
                    a.this.a(view);
                }
            });
        } else {
            Context context = this.D.getContext();
            ViewGroup viewGroup = this.D;
            sg.bigo.ads.common.utils.a.a(context, i10, viewGroup, viewGroup != null);
            viewFindViewById = this.D.findViewById(R.id.inter_click_guide_container);
            if (viewFindViewById != null) {
                aj().a(this.D, viewFindViewById, ai(), 10, this.f80233h.f81499m, viewFindViewById);
                viewFindViewById.setTag(12);
                Button button = (Button) viewFindViewById.findViewById(R.id.inter_btn_cta);
                if (button != null) {
                    button.setTag(17);
                }
                viewFindViewById.findViewById(R.id.inter_icon).setTag(17);
                if (this.f80229d) {
                    if (button != null) {
                        button.setBackgroundColor(this.f80240o);
                    }
                    if (this.f80233h.f81498l) {
                        a(viewFindViewById, 10, ((s) this.f81070y).H(), this.f80233h.f81499m);
                    } else {
                        a(viewFindViewById, 10, q.F, 0);
                    }
                } else {
                    a(viewFindViewById, 5, ((s) this.f81070y).H(), this.f80233h.f81499m);
                }
                c.b(viewFindViewById);
                int i11 = R.id.inter_click_guide;
                View viewFindViewById4 = viewFindViewById.findViewById(i11);
                View viewFindViewById5 = viewFindViewById.findViewById(R.id.inter_click_ripple);
                if (viewFindViewById4 != null && viewFindViewById5 != null) {
                    c.a(viewFindViewById4, viewFindViewById5);
                }
                if (iA == 1 && (viewFindViewById3 = viewFindViewById.findViewById(R.id.inter_btn_cta_layout)) != null) {
                    c.e(viewFindViewById3);
                } else if (iA == 3 && (viewFindViewById2 = viewFindViewById.findViewById(i11)) != null) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(600L);
                    alphaAnimation.setStartOffset(1000L);
                    alphaAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(1));
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -sg.bigo.ads.common.utils.e.a(viewFindViewById2.getContext(), 160));
                    translateAnimation.setDuration(600L);
                    translateAnimation.setStartOffset(1000L);
                    translateAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                    AnimationSet animationSet = new AnimationSet(false);
                    animationSet.addAnimation(alphaAnimation);
                    animationSet.addAnimation(translateAnimation);
                    alphaAnimation.setRepeatCount(Integer.MAX_VALUE);
                    alphaAnimation.setRepeatMode(1);
                    translateAnimation.setRepeatCount(Integer.MAX_VALUE);
                    translateAnimation.setRepeatMode(1);
                    viewFindViewById2.startAnimation(animationSet);
                }
            }
            View viewFindViewById6 = this.D.findViewById(R.id.bigo_ad_layout_click_guide);
            a(viewFindViewById6);
            if (viewFindViewById6 != null) {
                viewFindViewById = viewFindViewById6;
            }
        }
        View view = viewFindViewById;
        if (view != null && (mVar = this.f80228c) != null) {
            int iA = this.f80229d ? mVar.a("layer.below_area_dp") : 0;
            boolean z11 = this.f80229d && this.f80228c.a("layer.below_area_clickable") == 1;
            int iA2 = this.f80229d ? this.f80228c.a("layer.up_area_dp") : 0;
            if (this.f80229d && this.f80228c.a("layer.up_area_clickable") == 1) {
                z10 = true;
            }
            a(view, iA, z11, iA2, z10, 10, this.f80233h.f81499m);
        }
        f(9);
        a(((long) this.f80233h.f81491e) * 1000);
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int D() {
        int iE_ = e_();
        int iD = d();
        switch (iE_) {
            case 1:
                return 2;
            case 2:
                return iD == 5 ? 4 : 2;
            case 3:
                return 3;
            case 4:
            default:
                return 1;
            case 5:
            case 6:
                return 4;
            case 7:
            case 8:
                return 5;
            case 9:
                if (iD == 1) {
                    return 2;
                }
                return iD == 5 ? 4 : 9;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void E() {
        if (I()) {
            at();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void F() {
        super.F();
        this.f80236k.removeCallbacksAndMessages(null);
        sg.bigo.ads.ad.interstitial.e.c cVar = this.f80244s;
        if (cVar != null) {
            IconAds iconAds = cVar.f80829e;
            if (iconAds != null) {
                iconAds.destroy();
            }
            sg.bigo.ads.common.utils.n nVar = cVar.f80836l;
            if (nVar != null) {
                nVar.b();
                cVar.f80836l = null;
            }
            sg.bigo.ads.common.utils.n nVar2 = cVar.f80837m;
            if (nVar2 != null) {
                nVar2.b();
                cVar.f80837m = null;
            }
            cVar.f80841q.clear();
            cVar.f80842r.clear();
            cVar.f80843s.clear();
            cVar.f80844t.clear();
            cVar.f80838n = true;
            cVar.b();
            cVar.c();
        }
        sg.bigo.ads.common.e.a.b(this.A, this.K);
    }

    public final void G() {
        TextView textView = (TextView) this.D.findViewById(R.id.inter_advertiser);
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f80237l)) {
            textView.setVisibility(8);
            return;
        }
        if (!aH() && (textView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(2, R.id.inter_ad_info);
            layoutParams.addRule(12, 0);
            layoutParams.leftMargin = 18;
            layoutParams.setMarginStart(18);
            layoutParams.bottomMargin = 15;
            textView.setLayoutParams(layoutParams);
            textView.setText(this.f80237l);
        }
    }

    public final boolean H() {
        at();
        return false;
    }

    public final boolean I() {
        int iE_ = e_();
        return iE_ == 2 || iE_ == 6 || iE_ == 8 || iE_ == 9;
    }

    public abstract void J();

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[PHI: r0
      0x004d: PHI (r0v16 java.lang.Integer) = (r0v15 java.lang.Integer), (r0v18 java.lang.Integer) binds: [B:23:0x004b, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K() {
        /*
            r9 = this;
            android.view.ViewGroup r0 = r9.D
            if (r0 == 0) goto Lbb
            sg.bigo.ads.api.a.m r0 = r9.f80228c
            r1 = 4
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = -1
            r4 = 2
            r5 = 1
            java.lang.String r6 = "video_play_page.background_colour"
            r7 = -7829368(0xffffffffff888888, float:NaN)
            java.lang.String r8 = "#262E33"
            if (r0 == 0) goto L63
            boolean r0 = r9.P()
            if (r0 == 0) goto L63
            sg.bigo.ads.api.a.m r0 = r9.f80228c
            int r0 = r0.a(r6)
            r6 = -100
            if (r0 != r5) goto L27
            r2 = r3
            goto L53
        L27:
            if (r0 != r4) goto L2a
            goto L53
        L2a:
            boolean r2 = r9.aH()
            r3 = 3
            if (r2 == 0) goto L43
            if (r0 != r1) goto L3c
            sg.bigo.ads.ad.b.b r0 = r9.C
            java.lang.Integer r0 = sg.bigo.ads.ad.interstitial.r.a(r0)
            if (r0 == 0) goto L3e
            goto L4d
        L3c:
            if (r0 != r3) goto L52
        L3e:
            int r2 = sg.bigo.ads.common.utils.q.b(r8, r7)
            goto L53
        L43:
            if (r0 != r3) goto L52
            sg.bigo.ads.ad.b.b r0 = r9.C
            java.lang.Integer r0 = sg.bigo.ads.ad.interstitial.r.a(r0)
            if (r0 == 0) goto L3e
        L4d:
            int r2 = r0.intValue()
            goto L53
        L52:
            r2 = r6
        L53:
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            if (r2 == r6) goto L5f
            r0.a(r1, r2)
            return
        L5f:
            r0.a(r1)
            return
        L63:
            boolean r0 = r9.aH()
            if (r0 == 0) goto Lb2
            sg.bigo.ads.api.a.m r0 = r9.f80228c
            if (r0 == 0) goto Lb1
            int r0 = r0.a(r6)
            if (r0 != r5) goto L7d
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            r0.a(r1, r3)
            return
        L7d:
            if (r0 != r4) goto L89
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            r0.a(r1, r2)
            return
        L89:
            if (r0 != r1) goto L97
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            int r2 = r9.f80238m
            r0.a(r1, r2)
            return
        L97:
            r1 = 5
            if (r0 != r1) goto La4
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            r0.a(r1)
            return
        La4:
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            int r2 = sg.bigo.ads.common.utils.q.b(r8, r7)
            r0.a(r1, r2)
        Lb1:
            return
        Lb2:
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            r0.a(r1)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.K():void");
    }

    public final boolean L() {
        sg.bigo.ads.api.a.m mVar = this.f80228c;
        return mVar != null && 1 == mVar.a("endpage.is_endpage", 1);
    }

    public final boolean M() {
        sg.bigo.ads.api.a.m mVar;
        return (this instanceof sg.bigo.ads.ad.interstitial.g.b) && (mVar = this.f80228c) != null && 1 == mVar.a("endpage.ep_sprt", 0);
    }

    public final boolean N() {
        sg.bigo.ads.api.a.m mVar = this.f80228c;
        return (mVar == null || mVar.a("mid_page.show_time") != 0 || L() || au() || this.f80241p.get()) ? false : true;
    }

    public final boolean O() {
        sg.bigo.ads.api.a.m mVar = this.f80228c;
        return (mVar == null || mVar.a("mid_page.show_time") <= 0 || L() || au() || this.f80241p.get()) ? false : true;
    }

    public final boolean P() {
        int iY = Y();
        return iY == R.layout.bigo_ad_activity_interstitial_percent_warning || iY == R.layout.bigo_ad_activity_interstitial_percent_warning_landscape;
    }

    @Override // sg.bigo.ads.ad.c.a
    public LandingPageStyleConfig a(Context context, String str, int i10, boolean z10) {
        p pVar;
        LandingPageStyleConfig landingPageStyleConfig;
        sg.bigo.ads.api.a.m mVar = null;
        mVar = null;
        sg.bigo.ads.api.a.m mVar2 = null;
        LandingPageStyleConfig landingPageStyleConfig2 = null;
        mVar = null;
        if (!z10) {
            int iE_ = e_();
            if (iE_ == 0) {
                t tVarAj = aj();
                sg.bigo.ads.api.a.m mVar3 = this.f80228c;
                if (mVar3 != null && this.f80229d) {
                    mVar = mVar3;
                }
                int iA = sg.bigo.ads.ad.interstitial.d.a.a(tVarAj, mVar);
                int iB = sg.bigo.ads.ad.interstitial.d.a.b(tVarAj, mVar);
                float f10 = sg.bigo.ads.ad.interstitial.d.a.a(tVarAj) ? 0.67f : 0.8f;
                Class<? extends sg.bigo.ads.controller.landing.d> clsI = i(iA);
                ViewGroup viewGroup = this.D;
                landingPageStyleConfig2 = new LandingPageStyleConfig(clsI, 0, iA, iB, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, r.a(this.C, 0), f10);
            } else if (iE_ == 9) {
                landingPageStyleConfig2 = at();
            } else if (iE_ == 10) {
                sg.bigo.ads.api.a.m mVar4 = this.f80228c;
                if (mVar4 != null && this.f80229d) {
                    mVar2 = mVar4;
                }
                int iA2 = sg.bigo.ads.ad.interstitial.d.a.a(mVar2, "layer.webview_layout");
                int iB2 = sg.bigo.ads.ad.interstitial.d.a.b(mVar2, "layer.webview_force_time");
                Class<? extends sg.bigo.ads.controller.landing.d> clsI2 = i(iA2);
                ViewGroup viewGroup2 = this.D;
                landingPageStyleConfig2 = new LandingPageStyleConfig(clsI2, 10, iA2, iB2, viewGroup2 != null ? viewGroup2.getMeasuredHeight() : 0, r.a(this.C, 0), 0.8f);
                if (!landingPageStyleConfig2.b() && (pVar = this.f80243r) != null) {
                    pVar.e();
                }
            }
            sg.bigo.ads.ad.interstitial.f.b.a(landingPageStyleConfig2);
            return landingPageStyleConfig2;
        }
        int iE_2 = e_();
        if (iE_2 == 0) {
            t tVarAj2 = aj();
            sg.bigo.ads.api.a.m mVar5 = this.f80228c;
            if (mVar5 == null || !this.f80229d) {
                mVar5 = null;
            }
            int iA3 = sg.bigo.ads.ad.interstitial.d.a.a(tVarAj2, mVar5);
            if (j(iA3)) {
                return null;
            }
            landingPageStyleConfig = new LandingPageStyleConfig(i(iA3), 0, iA3, sg.bigo.ads.ad.interstitial.d.a.b(tVarAj2, mVar5), 0, 0, 0.0f);
        } else if (iE_2 == 9) {
            sg.bigo.ads.api.a.m mVar6 = this.f80228c;
            if (mVar6 == null || !this.f80229d) {
                mVar6 = null;
            }
            int iA4 = sg.bigo.ads.ad.interstitial.h.a.a(mVar6);
            if (j(iA4)) {
                return null;
            }
            landingPageStyleConfig = new LandingPageStyleConfig(i(iA4), 9, iA4, sg.bigo.ads.ad.interstitial.h.a.b(mVar6), 0, 0, 0.0f);
        } else {
            if (iE_2 != 10) {
                return null;
            }
            sg.bigo.ads.api.a.m mVar7 = this.f80228c;
            if (mVar7 == null || !this.f80229d) {
                mVar7 = null;
            }
            int iA5 = sg.bigo.ads.ad.interstitial.d.a.a(mVar7, "layer.webview_layout");
            if (j(iA5)) {
                return null;
            }
            landingPageStyleConfig = new LandingPageStyleConfig(i(iA5), 10, iA5, sg.bigo.ads.ad.interstitial.d.a.b(mVar7, "layer.webview_force_time"), 0, 0, 0.0f);
        }
        return landingPageStyleConfig;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0996b
    public final void a(int i10, int i11, int i12, int i13, int i14) {
        if (e_() == e_() && i14 == 0) {
            Object objAj = aj();
            if (objAj instanceof sg.bigo.ads.ad.interstitial.f.c) {
                sg.bigo.ads.ad.interstitial.f.c cVar = (sg.bigo.ads.ad.interstitial.f.c) objAj;
                cVar.a(i10, i11, i12, i13);
                if (cVar.L() && this.O && !this.B.get()) {
                    i();
                }
            }
        }
    }

    public final void a(long j10) {
        if (j10 <= 0) {
            A();
            return;
        }
        B();
        this.f80236k.removeCallbacks(this.S);
        this.f80236k.postDelayed(this.S, j10);
    }

    public final void a(View view) {
        sg.bigo.ads.ad.interstitial.e.a.c cVar;
        String str;
        sg.bigo.ads.ad.interstitial.e.c cVar2 = this.f80244s;
        if (cVar2 == null || !(view instanceof ViewGroup)) {
            return;
        }
        sg.bigo.ads.ad.interstitial.e.c.a(cVar2.f80834j, cVar2.f80832h);
        final sg.bigo.ads.ad.interstitial.e.c cVar3 = this.f80244s;
        final ViewGroup viewGroup = (ViewGroup) view;
        cVar3.f80840p = false;
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) cVar3.f80825a.f(), 2);
        if (viewGroup == null) {
            cVar = cVar3.f80827c;
            str = "layerView is null";
        } else if (sg.bigo.ads.ad.interstitial.e.a.b.b(cVar3.f80827c)) {
            cVar = cVar3.f80827c;
            str = "config is invalid";
        } else {
            if (cVar3.a(2)) {
                cVar3.c();
                sg.bigo.ads.ad.interstitial.e.a aVar = cVar3.f80835k;
                if (aVar != null) {
                    aVar.f80794b.d();
                    sg.bigo.ads.common.utils.u.b(cVar3.f80835k.f80793a);
                }
                cVar3.f80835k = null;
                final sg.bigo.ads.ad.interstitial.e.a.c cVar4 = cVar3.f80827c;
                c.b bVar = new c.b(viewGroup, cVar4) { // from class: sg.bigo.ads.ad.interstitial.e.c.4

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ ViewGroup f80852a;

                    /* JADX INFO: renamed from: e */
                    private boolean f80854e = false;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass4(final ViewGroup viewGroup2, final sg.bigo.ads.ad.interstitial.e.a.b cVar42, final ViewGroup viewGroup22) {
                        super(viewGroup22, cVar42, (byte) 0);
                        viewGroup = viewGroup22;
                        this.f80854e = false;
                    }

                    @Override // sg.bigo.ads.ad.interstitial.e.c.b
                    public final void a(sg.bigo.ads.ad.interstitial.e.a aVar2) {
                        sg.bigo.ads.ad.interstitial.h.a aVar3;
                        RealtimeBlurLinearLayout realtimeBlurLinearLayout;
                        super.a(aVar2);
                        if (!this.f80854e || (aVar3 = c.this.f80828d) == null || (realtimeBlurLinearLayout = aVar2.f80793a) == null) {
                            return;
                        }
                        aVar3.a(realtimeBlurLinearLayout);
                    }

                    @Override // sg.bigo.ads.ad.interstitial.e.c.b
                    public final boolean a() {
                        sg.bigo.ads.ad.interstitial.e.a.c cVar5;
                        String str2;
                        c cVar6 = c.this;
                        if (cVar6.f80829e == null) {
                            cVar5 = cVar6.f80827c;
                            str2 = "icon ads is null";
                        } else {
                            if (!cVar6.f80838n) {
                                if (cVar6.a()) {
                                    c.this.c();
                                    c cVar7 = c.this;
                                    cVar7.a(cVar7.f80827c, "host ad is destroyed", 2);
                                    return true;
                                }
                                List listA = c.a(c.this.f80829e);
                                if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                                    c.this.c();
                                    c cVar8 = c.this;
                                    cVar8.a(cVar8.f80827c, "icon ads download failed", 2);
                                    return true;
                                }
                                boolean zA = c.this.f80827c.a();
                                if (sg.bigo.ads.common.utils.u.c(this.f80861c) && sg.bigo.ads.common.utils.u.d(this.f80861c)) {
                                    c.a(c.this, 2);
                                    c cVar9 = c.this;
                                    Context context = this.f80861c.getContext();
                                    c cVar10 = c.this;
                                    cVar9.f80835k = sg.bigo.ads.ad.interstitial.e.a.a(context, cVar10.f80827c, listA, cVar10.f80842r);
                                    c.a(c.this, zA);
                                    RealtimeBlurLinearLayout realtimeBlurLinearLayout = c.this.f80835k.f80793a;
                                    int iE = this.f80862d.e();
                                    if (iE == 5 || iE == 6) {
                                        View viewFindViewById = viewGroup.findViewById(R.id.inter_icons_bottom_anchor);
                                        View viewFindViewById2 = viewGroup.findViewById(R.id.inter_icons_center_anchor);
                                        if (viewFindViewById != null) {
                                            ViewParent parent = viewFindViewById.getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).addView(realtimeBlurLinearLayout, viewFindViewById.getLayoutParams());
                                            }
                                        }
                                        if (viewFindViewById2 != null) {
                                            sg.bigo.ads.ad.interstitial.e.a aVar2 = c.this.f80835k;
                                            ViewParent parent2 = viewFindViewById2.getParent();
                                            if (parent2 instanceof ViewGroup) {
                                                ViewGroup viewGroup2 = (ViewGroup) parent2;
                                                viewGroup2.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.3

                                                    /* JADX INFO: renamed from: a */
                                                    public final /* synthetic */ View f80870a;

                                                    /* JADX INFO: renamed from: b */
                                                    public final /* synthetic */ ViewGroup f80871b;

                                                    /* JADX INFO: renamed from: c */
                                                    public final /* synthetic */ View f80872c;

                                                    /* JADX INFO: renamed from: d */
                                                    public final /* synthetic */ Integer f80873d;

                                                    /* JADX INFO: renamed from: e */
                                                    public final /* synthetic */ sg.bigo.ads.ad.interstitial.e.a f80874e;

                                                    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.e.c$b$3$1 */
                                                    public class AnonymousClass1 extends sg.bigo.ads.common.h {

                                                        /* JADX INFO: renamed from: a */
                                                        public final /* synthetic */ ValueAnimator f80876a;

                                                        public AnonymousClass1(ValueAnimator valueAnimator) {
                                                            valueAnimator = valueAnimator;
                                                        }

                                                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                        public final void onTransitionEnd(Transition transition) {
                                                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                                            b.this.a(aVar);
                                                        }

                                                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                        public final void onTransitionStart(Transition transition) {
                                                            ValueAnimator valueAnimator = valueAnimator;
                                                            if (valueAnimator != null) {
                                                                valueAnimator.start();
                                                            }
                                                        }
                                                    }

                                                    public AnonymousClass3(View realtimeBlurLinearLayout2, ViewGroup viewGroup22, View viewFindViewById22, Integer num, sg.bigo.ads.ad.interstitial.e.a aVar22) {
                                                        view = realtimeBlurLinearLayout2;
                                                        viewGroup = viewGroup22;
                                                        view = viewFindViewById22;
                                                        num = num;
                                                        aVar = aVar22;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        sg.bigo.ads.common.utils.u.b(view);
                                                        viewGroup.addView(view, view.getLayoutParams());
                                                        ValueAnimator valueAnimatorA = b.this.a(num);
                                                        TransitionSet transitionSet = new TransitionSet();
                                                        transitionSet.addTransition(new ChangeBounds());
                                                        transitionSet.setDuration(300L);
                                                        transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.3.1

                                                            /* JADX INFO: renamed from: a */
                                                            public final /* synthetic */ ValueAnimator f80876a;

                                                            public AnonymousClass1(ValueAnimator valueAnimatorA2) {
                                                                valueAnimator = valueAnimatorA2;
                                                            }

                                                            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                            public final void onTransitionEnd(Transition transition) {
                                                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                                                b.this.a(aVar);
                                                            }

                                                            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                            public final void onTransitionStart(Transition transition) {
                                                                ValueAnimator valueAnimator = valueAnimator;
                                                                if (valueAnimator != null) {
                                                                    valueAnimator.start();
                                                                }
                                                            }
                                                        });
                                                        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
                                                    }
                                                });
                                            }
                                        }
                                    } else {
                                        this.f80854e = true;
                                        a(viewGroup, realtimeBlurLinearLayout2, -234881024, c.this.f80835k);
                                    }
                                    c.a(c.this, this.f80862d, 2, listA);
                                    c cVar11 = c.this;
                                    cVar11.f80837m = c.a(cVar11, cVar11.f80827c, cVar11.f80842r);
                                    n nVar = c.this.f80837m;
                                    if (nVar != null) {
                                        nVar.c();
                                    }
                                }
                                c.this.c();
                                return true;
                            }
                            cVar5 = cVar6.f80827c;
                            str2 = "page is Paused";
                        }
                        cVar6.a(cVar5, str2, 2);
                        return false;
                    }
                };
                cVar3.f80833i = bVar;
                bVar.d();
                return;
            }
            cVar = cVar3.f80827c;
            str = "icon request hasScene return false";
        }
        cVar3.a(cVar, str, 2);
    }

    public final void a(@NonNull View view, int i10, @Nullable sg.bigo.ads.core.adview.h hVar, int i11) {
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            sg.bigo.ads.common.t.a.a(0, "InterstitialNativeActivityImpl", "Failed to set ad click due to native ad view is null.");
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, view, i10, hVar, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final android.view.View r7, int r8, boolean r9, int r10, boolean r11, int r12, int r13) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof android.widget.FrameLayout
            if (r0 != 0) goto L11
            boolean r0 = r7 instanceof android.widget.RelativeLayout
            if (r0 != 0) goto L11
            r7 = 0
            java.lang.String r8 = "InterstitialNativeActivityImpl"
            java.lang.String r9 = "Failed to update up or below area click due to unsupported view."
            sg.bigo.ads.common.t.a.a(r7, r8, r9)
            return
        L11:
            r0 = r7
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.content.Context r1 = r7.getContext()
            if (r1 != 0) goto L1b
            return
        L1b:
            r2 = -1
            if (r8 <= 0) goto L73
            android.view.View r3 = new android.view.View
            r3.<init>(r1)
            int r4 = sg.bigo.ads.R.id.bigo_ad_interstitial_below_area_click
            r3.setId(r4)
            r4 = 25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.setTag(r4)
            boolean r4 = r0 instanceof android.widget.FrameLayout
            if (r4 == 0) goto L44
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            int r8 = sg.bigo.ads.common.utils.e.a(r1, r8)
            r5 = 80
            r4.<init>(r2, r8, r5)
        L40:
            r0.addView(r3, r4)
            goto L57
        L44:
            boolean r4 = r0 instanceof android.widget.RelativeLayout
            if (r4 == 0) goto L57
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            int r8 = sg.bigo.ads.common.utils.e.a(r1, r8)
            r4.<init>(r2, r8)
            r8 = 12
            r4.addRule(r8)
            goto L40
        L57:
            android.view.ViewGroup r8 = r6.D
            if (r9 == 0) goto L69
            if (r8 == 0) goto L73
            T extends sg.bigo.ads.ad.interstitial.k<?> r8 = r6.f81070y
            sg.bigo.ads.ad.interstitial.s r8 = (sg.bigo.ads.ad.interstitial.s) r8
            sg.bigo.ads.ad.b.b r8 = r8.H()
            r6.a(r3, r12, r8, r13)
            goto L73
        L69:
            if (r8 == 0) goto L73
            sg.bigo.ads.ad.interstitial.a$6 r9 = new sg.bigo.ads.ad.interstitial.a$6
            r9.<init>()
            sg.bigo.ads.ad.b.a.a(r8, r3, r12, r9, r13)
        L73:
            if (r10 <= 0) goto Lc2
            android.view.View r8 = new android.view.View
            r8.<init>(r1)
            r9 = 24
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.setTag(r9)
            boolean r9 = r0 instanceof android.widget.FrameLayout
            if (r9 == 0) goto L94
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            int r10 = sg.bigo.ads.common.utils.e.a(r1, r10)
            r9.<init>(r2, r10)
        L90:
            r0.addView(r8, r9)
            goto La2
        L94:
            boolean r9 = r0 instanceof android.widget.RelativeLayout
            if (r9 == 0) goto La2
            android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
            int r10 = sg.bigo.ads.common.utils.e.a(r1, r10)
            r9.<init>(r2, r10)
            goto L90
        La2:
            if (r11 == 0) goto Lb4
            android.view.ViewGroup r7 = r6.D
            if (r7 == 0) goto Lc2
            T extends sg.bigo.ads.ad.interstitial.k<?> r7 = r6.f81070y
            sg.bigo.ads.ad.interstitial.s r7 = (sg.bigo.ads.ad.interstitial.s) r7
            sg.bigo.ads.ad.b.b r7 = r7.H()
            r6.a(r8, r12, r7, r13)
            return
        Lb4:
            sg.bigo.ads.ad.b.b r9 = r6.C
            if (r9 == 0) goto Lc2
            android.view.ViewGroup r9 = r6.D
            sg.bigo.ads.ad.interstitial.a$7 r10 = new sg.bigo.ads.ad.interstitial.a$7
            r10.<init>()
            sg.bigo.ads.ad.b.a.a(r9, r8, r12, r10, r13)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.a(android.view.View, int, boolean, int, boolean, int, int):void");
    }

    public void a(@NonNull ViewGroup viewGroup) {
        MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setTag(5);
        }
        if (this.f80233h.f81487a) {
            viewGroup.setTag(11);
            a(viewGroup, 1, ((s) this.f81070y).H(), this.f80233h.f81495i);
            if (mediaView != null) {
                mediaView.b().a(false);
                return;
            }
            return;
        }
        if (!this.f80229d) {
            a(viewGroup, 8, (sg.bigo.ads.core.adview.h) null, 0);
            return;
        }
        if (!(aj() instanceof sg.bigo.ads.ad.interstitial.d.a) && mediaView != null) {
            a(mediaView, 8, ((s) this.f81070y).H(), this.f80233h.f81495i);
            if (this.f80233h.f81492f) {
                mediaView.setMediaAreaClickable(true);
                mediaView.b().a(false);
            } else {
                mediaView.setMediaAreaClickable(false);
                mediaView.b().a(true);
            }
        }
        if (!(aj() instanceof sg.bigo.ads.ad.interstitial.d.a)) {
            View viewFindViewById = viewGroup.findViewById(R.id.inter_media_container);
            if (v()) {
                viewFindViewById = viewGroup.findViewById(R.id.inter_media_layout);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setTag(9);
                if (this.f80233h.f81493g) {
                    if (mediaView != null) {
                        mediaView.setOtherClickAreaClick(true);
                    }
                    a(viewFindViewById, 8, ((s) this.f81070y).H(), this.f80233h.f81495i);
                } else {
                    if (mediaView != null) {
                        mediaView.setOtherClickAreaClick(false);
                    }
                    a(viewFindViewById, 8, q.F, 0);
                }
            }
        }
        if (aj() instanceof sg.bigo.ads.ad.interstitial.d.a) {
            return;
        }
        View viewFindViewById2 = viewGroup.findViewById(R.id.inter_ad_info);
        if (P() && aH()) {
            viewFindViewById2 = viewGroup.findViewById(R.id.inter_ad_info_inner);
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setTag(18);
            if (v()) {
                viewFindViewById2 = viewGroup.findViewById(R.id.inter_media_container);
                viewFindViewById2.setTag(18);
            }
            if (this.f80233h.f81494h) {
                a(viewFindViewById2, 8, ((s) this.f81070y).H(), this.f80233h.f81495i);
            } else {
                a(viewFindViewById2, 8, q.F, 0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r12 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        if (r12 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        if (r9 == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r12) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.a(boolean):void");
    }

    public final void a(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.I) {
            for (Object obj : objArr) {
                if (obj != null) {
                    this.I.put(obj, 1);
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0996b
    public boolean a(@NonNull MotionEvent motionEvent, @Nullable b.a aVar, int i10) {
        boolean zB;
        AdCountDownButton adCountDownButton = this.A;
        boolean z10 = false;
        if (adCountDownButton != null) {
            if (motionEvent == null || adCountDownButton.f80208f == null) {
                zB = false;
            } else {
                zB = sg.bigo.ads.common.utils.u.b(adCountDownButton.f80208f, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            }
            if (zB) {
                if (motionEvent.getAction() == 1) {
                    if (aVar != null && aVar.a()) {
                        z10 = true;
                    }
                    if (z10 && this.P == null) {
                        if (this.O) {
                            this.P = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AdCountDownButton adCountDownButton2 = a.this.A;
                                    if (adCountDownButton2 != null) {
                                        adCountDownButton2.a();
                                    }
                                }
                            };
                        } else {
                            AdCountDownButton adCountDownButton2 = this.A;
                            if (adCountDownButton2 != null) {
                                adCountDownButton2.a();
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean a(Object obj, Runnable runnable) {
        Integer num;
        if (obj == null || runnable == null) {
            return false;
        }
        synchronized (this.I) {
            num = this.I.get(obj);
        }
        if (num == null) {
            runnable.run();
            return false;
        }
        synchronized (this.J) {
            WeakHashMap<Object, Runnable> weakHashMap = this.J.get(num);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap<>();
                this.J.put(num, weakHashMap);
            }
            weakHashMap.put(obj, runnable);
        }
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0996b
    @CallSuper
    public void a_(int i10) {
        this.O = true;
    }

    @NonNull
    public abstract w b();

    public void b(boolean z10) {
        sg.bigo.ads.common.utils.n nVar;
        sg.bigo.ads.common.utils.n nVar2 = this.f80247v;
        if (nVar2 != null) {
            nVar2.b();
            this.f80247v = null;
        }
        sg.bigo.ads.common.utils.n nVar3 = this.f80246u;
        if (nVar3 != null) {
            nVar3.b();
            this.f80246u = null;
        }
        if (z10 && (nVar = this.f80248w) != null) {
            nVar.b();
            this.f80248w = null;
        }
        sg.bigo.ads.common.utils.n nVar4 = this.f80249x;
        if (nVar4 != null) {
            nVar4.b();
            this.f80249x = null;
        }
    }

    public final void b(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.I) {
            for (Object obj : objArr) {
                if (obj != null) {
                    this.I.remove(obj);
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0996b
    public final void b_(int i10) {
        if (e_() == 0 && i10 == 0 && j() && !k() && this.O && this.B.get()) {
            g();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0996b
    public final void c(int i10) {
        if (e_() == 0 && i10 == 0 && j() && !k() && this.O && !this.B.get()) {
            i();
        }
    }

    @CallSuper
    public void c(boolean z10) {
        if (z10) {
            ac();
        } else {
            ae();
        }
    }

    public final void c(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.J) {
            WeakHashMap<Object, Runnable> weakHashMap = this.J.get(1);
            if (sg.bigo.ads.common.utils.k.a(weakHashMap)) {
                return;
            }
            for (Object obj : objArr) {
                if (obj != null) {
                    weakHashMap.remove(obj);
                }
            }
        }
    }

    public final int d() {
        synchronized (this.G) {
            if (this.G.size() < 2) {
                return -1;
            }
            return this.G.get(1).intValue();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0996b
    public void d(int i10) {
        this.O = false;
        Runnable runnable = this.P;
        if (runnable != null) {
            sg.bigo.ads.common.n.d.a(2, runnable);
            this.P = null;
        } else if (this.B.get()) {
            g();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z10) {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || (adCountDownButton.getVisibility() == 0 && this.A.f80205c)) {
            e(z10);
        } else if (this.A.getVisibility() == 0 && this.A.f80207e) {
            e(z10);
        }
    }

    public final void e() {
        synchronized (this.J) {
            WeakHashMap<Object, Runnable> weakHashMapRemove = this.J.remove(1);
            if (sg.bigo.ads.common.utils.k.a(weakHashMapRemove)) {
                return;
            }
            Iterator<Map.Entry<Object, Runnable>> it = weakHashMapRemove.entrySet().iterator();
            while (it.hasNext()) {
                Runnable value = it.next().getValue();
                if (value != null) {
                    sg.bigo.ads.common.n.d.a(2, value);
                }
            }
        }
    }

    public final void e(int i10) {
        String str;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.D.findViewById(R.id.inter_ad_label);
        if (aH()) {
            if (TextUtils.isEmpty(this.f80237l) || textView2 == null || textView2.getContext() == null) {
                return;
            }
            String strA = sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]);
            if (!P()) {
                textView2.setText(this.f80237l + " · " + strA);
                return;
            }
            str = strA + " · " + this.f80237l;
        } else {
            if (textView == null || textView2 == null) {
                return;
            }
            if (TextUtils.isEmpty(this.f80237l)) {
                textView.setVisibility(8);
                return;
            }
            if (!P()) {
                if (i10 != R.layout.bigo_ad_activity_interstitial_native_top) {
                    textView.bringToFront();
                }
                textView.setText(this.f80237l);
                textView.setPadding(sg.bigo.ads.common.utils.e.a(this.D.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1), sg.bigo.ads.common.utils.e.a(textView.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1));
                textView2.setText(R.string.bigo_ad_tag);
                return;
            }
            textView.setVisibility(8);
            str = sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]) + " · " + this.f80237l;
        }
        textView2.setText(str);
    }

    public final void e(boolean z10) {
        if (f(z10)) {
            l(e_());
            super.d(true);
        }
    }

    public final int e_() {
        synchronized (this.G) {
            if (this.G.isEmpty()) {
                return -1;
            }
            return this.G.get(0).intValue();
        }
    }

    public void f(int i10) {
        p pVar;
        sg.bigo.ads.ad.b.b bVar;
        sg.bigo.ads.ad.interstitial.e.c cVar = this.f80244s;
        if (cVar != null) {
            c.a aVar = cVar.f80831g;
            if (i10 == 0) {
                aVar.f80858a = 1;
            } else if (i10 == 1) {
                aVar.f80858a = 3;
            } else if (i10 == 9) {
                aVar.f80858a = 4;
            } else if (i10 == 10) {
                aVar.f80858a = 2;
            }
        }
        synchronized (this.G) {
            synchronized (this.G) {
                this.G.remove(Integer.valueOf(i10));
            }
            this.G.add(0, Integer.valueOf(i10));
        }
        int iD = d();
        int iE_ = e_();
        if (iE_ != iD) {
            l(iD);
        }
        sg.bigo.ads.ad.b.b bVar2 = this.C;
        if (bVar2 != null) {
            bVar2.d(i10);
        }
        if (((i10 == 0) | (i10 == 1) | (i10 == 2) | (i10 == 4) | (i10 == 5) | (i10 == 6) | (i10 == 7) | (i10 == 8) | (i10 == 9)) && (bVar = this.C) != null) {
            ((sg.bigo.ads.core.a.a) bVar.f()).b(SystemClock.elapsedRealtime());
        }
        if (i10 != 0 && i10 != 10 && i10 != 3 && (pVar = this.f80243r) != null) {
            pVar.b();
        }
        switch (iE_) {
            case 0:
                sg.bigo.ads.ad.interstitial.multi_img.b bVar3 = this.f80234i;
                if (bVar3 != null) {
                    bVar3.a(1, 1);
                }
                l lVar = this.H;
                lVar.a(lVar.f81104b);
                return;
            case 1:
                sg.bigo.ads.ad.interstitial.multi_img.b bVarG = ((s) this.f81070y).G();
                if (bVarG != null) {
                    bVarG.a(2, 1);
                }
                l lVar2 = this.H;
                lVar2.a(lVar2.f81106d);
                w wVar = this.f80233h;
                if (wVar == null || !wVar.f81490d) {
                    k(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 2:
            case 8:
            case 9:
                k(R.drawable.bigo_ad_ic_close);
                l lVar3 = this.H;
                lVar3.a(lVar3.f81107e);
                return;
            case 3:
            case 6:
            default:
                return;
            case 4:
                l lVar4 = this.H;
                lVar4.a(lVar4.f81109g);
                return;
            case 5:
                l lVar5 = this.H;
                lVar5.a(lVar5.f81108f);
                w wVar2 = this.f80233h;
                if (wVar2 == null || !wVar2.f81490d) {
                    k(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 7:
                l lVar6 = this.H;
                lVar6.a(lVar6.f81110h);
                w wVar3 = this.f80233h;
                if (wVar3 == null || !wVar3.f81490d) {
                    k(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 10:
                l lVar7 = this.H;
                lVar7.a(lVar7.f81105c);
                return;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean f() {
        return ao();
    }

    public abstract boolean f(boolean z10);

    @Override // sg.bigo.ads.ad.c.a
    public final boolean f_() {
        return this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r3 = this;
            super.g()
            int r0 = r3.e_()
            sg.bigo.ads.ad.interstitial.p r1 = r3.f80243r
            if (r1 == 0) goto Le
            r1.c()
        Le:
            if (r0 != 0) goto L21
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f81070y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f81104b
        L1c:
            r0.b(r1, r2)
            goto L8b
        L21:
            r1 = 10
            if (r0 != r1) goto L32
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f81070y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f81105c
            goto L1c
        L32:
            r1 = 1
            if (r0 != r1) goto L42
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f81070y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f81106d
            goto L1c
        L42:
            r1 = 2
            if (r0 == r1) goto L7e
            r1 = 8
            if (r0 == r1) goto L7e
            r1 = 9
            if (r0 != r1) goto L4e
            goto L7e
        L4e:
            r1 = 5
            if (r0 != r1) goto L5e
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f81070y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f81108f
            goto L1c
        L5e:
            r1 = 4
            if (r0 != r1) goto L6e
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f81070y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f81109g
            goto L1c
        L6e:
            r1 = 7
            if (r0 != r1) goto L8b
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f81070y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f81110h
            goto L1c
        L7e:
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f81070y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f81107e
            goto L1c
        L8b:
            sg.bigo.ads.ad.interstitial.e.c r0 = r3.f80244s
            if (r0 == 0) goto Lbe
            r1 = 0
            r0.f80838n = r1
            sg.bigo.ads.ad.interstitial.e.a r1 = r0.f80835k
            sg.bigo.ads.ad.interstitial.e.c$b r2 = r0.f80833i
            sg.bigo.ads.ad.interstitial.e.c.b(r1, r2)
            sg.bigo.ads.ad.interstitial.e.a r1 = r0.f80834j
            sg.bigo.ads.ad.interstitial.e.c$b r2 = r0.f80832h
            sg.bigo.ads.ad.interstitial.e.c.b(r1, r2)
            sg.bigo.ads.common.utils.n r1 = r0.f80836l
            if (r1 == 0) goto Laf
            boolean r1 = r1.e()
            if (r1 == 0) goto Laf
            sg.bigo.ads.common.utils.n r1 = r0.f80836l
            r1.c()
        Laf:
            sg.bigo.ads.common.utils.n r1 = r0.f80837m
            if (r1 == 0) goto Lbe
            boolean r1 = r1.e()
            if (r1 == 0) goto Lbe
            sg.bigo.ads.common.utils.n r0 = r0.f80837m
            r0.c()
        Lbe:
            sg.bigo.ads.ad.interstitial.h.a r0 = r3.f80245t
            if (r0 == 0) goto Lc5
            r0.b()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.g():void");
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void g(@LayoutRes int i10) {
        super.g(i10);
        if (this.D == null) {
            return;
        }
        ((s) this.f81070y).E = this.H;
        ap();
        q();
        s();
        as();
        ar();
        t();
        w();
        f(0);
        J();
        ((s) this.f81070y).f().a(this.f80229d);
        a(this.D);
        z();
        a(((long) this.f80233h.f81488b) * 1000);
        aq();
        av();
        o();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void h(int i10) {
        super.g(i10);
        if (this.D == null) {
            return;
        }
        ((s) this.f81070y).E = this.H;
        ap();
        s();
        as();
        ar();
        t();
        w();
        f(0);
        J();
        ((s) this.f81070y).f().a(this.f80229d);
        a(this.D);
        aq();
        av();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean h() {
        return ao();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            r4 = this;
            super.i()
            int r0 = r4.e_()
            sg.bigo.ads.ad.interstitial.p r1 = r4.f80243r
            if (r1 == 0) goto Le
            r1.d()
        Le:
            r1 = 1
            if (r0 != 0) goto L22
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f81070y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f81104b
        L1d:
            r0.a(r2, r3)
            goto L8b
        L22:
            r2 = 10
            if (r0 != r2) goto L33
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f81070y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f81105c
            goto L1d
        L33:
            if (r0 != r1) goto L42
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f81070y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f81106d
            goto L1d
        L42:
            r2 = 2
            if (r0 == r2) goto L7e
            r2 = 8
            if (r0 == r2) goto L7e
            r2 = 9
            if (r0 != r2) goto L4e
            goto L7e
        L4e:
            r2 = 5
            if (r0 != r2) goto L5e
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f81070y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f81108f
            goto L1d
        L5e:
            r2 = 4
            if (r0 != r2) goto L6e
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f81070y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f81109g
            goto L1d
        L6e:
            r2 = 7
            if (r0 != r2) goto L8b
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f81070y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f81110h
            goto L1d
        L7e:
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f81070y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f81107e
            goto L1d
        L8b:
            sg.bigo.ads.ad.interstitial.e.c r0 = r4.f80244s
            if (r0 == 0) goto Lad
            r0.f80838n = r1
            sg.bigo.ads.ad.interstitial.e.a r1 = r0.f80835k
            sg.bigo.ads.ad.interstitial.e.c$b r2 = r0.f80833i
            sg.bigo.ads.ad.interstitial.e.c.a(r1, r2)
            sg.bigo.ads.ad.interstitial.e.a r1 = r0.f80834j
            sg.bigo.ads.ad.interstitial.e.c$b r2 = r0.f80832h
            sg.bigo.ads.ad.interstitial.e.c.a(r1, r2)
            sg.bigo.ads.common.utils.n r1 = r0.f80836l
            if (r1 == 0) goto La6
            r1.d()
        La6:
            sg.bigo.ads.common.utils.n r0 = r0.f80837m
            if (r0 == 0) goto Lad
            r0.d()
        Lad:
            sg.bigo.ads.ad.interstitial.h.a r0 = r4.f80245t
            if (r0 == 0) goto Lb4
            r0.c()
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.i():void");
    }

    public final boolean j() {
        Object objAj = aj();
        if (objAj instanceof sg.bigo.ads.ad.interstitial.f.c) {
            return ((sg.bigo.ads.ad.interstitial.f.c) objAj).K();
        }
        return false;
    }

    public final boolean k() {
        if (e_() != 0 || !this.O) {
            return false;
        }
        Object objAj = aj();
        if (objAj instanceof sg.bigo.ads.ad.interstitial.f.c) {
            return ((sg.bigo.ads.ad.interstitial.f.c) objAj).L();
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    @CallSuper
    public void l() {
        super.l();
        this.f80237l = ((s) this.f81070y).f().i();
        sg.bigo.ads.api.a.m mVarE = ((s) this.f81070y).f().e();
        this.f80228c = mVarE;
        if (mVarE != null) {
            this.f80229d = true;
        }
        this.f80227b = ((s) this.f81070y).f().d().q();
        this.f80233h = b();
        m();
    }

    public void m() {
        sg.bigo.ads.api.a.m mVar = this.f80228c;
        if (mVar == null || !this.f80229d) {
            sg.bigo.ads.api.a.m mVar2 = this.f80227b;
            if (mVar2 != null) {
                a(mVar2);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.h.a aVarA = sg.bigo.ads.ad.interstitial.h.a.a(this.L, this.C, mVar, aH());
        this.f80245t = aVarA;
        this.f80244s = new sg.bigo.ads.ad.interstitial.e.c((s) this.f81070y, this.f80228c, aVarA);
        a(this.f80228c);
        this.C.f80042w = new WeakReference<>(this);
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final int n() {
        sg.bigo.ads.api.a.m mVar = this.f80228c;
        if (mVar == null) {
            return 0;
        }
        if (this.f80229d) {
            return mVar.a("video_play_page.ad_component_layout");
        }
        return 1;
    }

    public void o() {
        this.f80243r = new p(this.L, ((s) this.f81070y).H(), ((s) this.f81070y).f(), this.f80228c, aH(), this.f80235j, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.9
            @Override // java.lang.Runnable
            public final void run() {
                AdCountDownButton adCountDownButton = a.this.A;
                if (adCountDownButton != null) {
                    adCountDownButton.setAlpha(0.0f);
                }
                a.this.f(10);
            }
        }, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.10
            @Override // java.lang.Runnable
            public final void run() {
                AdCountDownButton adCountDownButton = a.this.A;
                if (adCountDownButton != null) {
                    adCountDownButton.setAlpha(1.0f);
                }
                a aVar = a.this;
                aVar.f(aVar.d());
                a.this.aF();
                if (a.this.e_() == 0) {
                    a.this.g();
                }
            }
        }, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.11
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d(false);
            }
        });
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.12
            @Override // java.lang.Runnable
            public final void run() {
                final p pVar = a.this.f80243r;
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Active mid page.");
                sg.bigo.ads.api.a.m mVar = pVar.f81254d;
                Context context = pVar.f81251a;
                if (mVar == null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to empty style config.");
                    return;
                }
                if (context == null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to empty context.");
                    return;
                }
                int iA = mVar.a("mid_page.show_time");
                if (iA != -1 && iA != 0 && iA != 3 && iA != 5 && iA != 10) {
                    iA = 0;
                }
                pVar.E = iA;
                if (iA == 0) {
                    pVar.f81259i = false;
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to show_time in config.");
                    return;
                }
                p.d dVar = pVar.A;
                dVar.f81387b = mVar.a("mid_page.pop_layout");
                dVar.f81386a = mVar.a("mid_page.pop_method");
                dVar.f81388c = mVar.a("mid_page.cta_color");
                p.a aVar = pVar.f81276z;
                aVar.f81369p = pVar;
                aVar.f81358e = mVar.c("mid_page.is_cta_show_animation");
                aVar.f81354a = mVar.a("mid_page.click_type");
                aVar.f81355b = mVar.c("mid_page.ad_component_clickable_switch");
                aVar.f81356c = mVar.c("mid_page.media_view_clickable_switch");
                aVar.f81357d = mVar.c("mid_page.other_space_clickable_switch");
                int iA2 = mVar.a("mid_page.below_area_dp");
                if (iA2 > 0) {
                    aVar.f81359f = sg.bigo.ads.common.utils.e.a(context, iA2);
                }
                aVar.f81360g = mVar.a("mid_page.below_area_clickable") == 1;
                int iA3 = mVar.a("mid_page.up_area_dp");
                if (iA3 > 0) {
                    aVar.f81361h = sg.bigo.ads.common.utils.e.a(context, iA3);
                }
                aVar.f81362i = mVar.a("mid_page.up_area_clickable") == 1;
                aVar.f81363j = sg.bigo.ads.common.utils.e.c(context);
                aVar.f81367n = new View(context);
                aVar.f81368o = new View(context);
                final Context context2 = pVar.f81251a;
                final sg.bigo.ads.ad.b.b bVar = pVar.f81252b;
                final sg.bigo.ads.api.core.b bVar2 = pVar.f81253c;
                if (pVar.a(context2, bVar, bVar2, pVar.f81254d)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Start render mid page.");
                    int i10 = pVar.A.f81386a;
                    ArrayList arrayList = new ArrayList();
                    if (pVar.f81265o) {
                        arrayList.add(2);
                    } else {
                        if (i10 == 1) {
                            arrayList.add(1);
                        }
                        if (i10 == 2) {
                            arrayList.add(1);
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(4);
                        }
                        if (i10 == 3) {
                            arrayList.add(2);
                        }
                        if (i10 == 4) {
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(1);
                            arrayList.add(4);
                        }
                        if (i10 == 5) {
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(4);
                        }
                        if (i10 == 6) {
                            arrayList.add(3);
                        }
                        if (i10 == 7) {
                            arrayList.add(3);
                            arrayList.add(2);
                            arrayList.add(1);
                            arrayList.add(4);
                        }
                        if (i10 == 8) {
                            arrayList.add(3);
                            arrayList.add(2);
                            arrayList.add(4);
                        }
                        if (i10 == 9) {
                        }
                        pVar.f81270t = arrayList;
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.3

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ Context f81330a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ sg.bigo.ads.ad.b.b f81331b;

                            /* JADX INFO: renamed from: c */
                            public final /* synthetic */ sg.bigo.ads.api.core.b f81332c;

                            public AnonymousClass3(final Context context22, final sg.bigo.ads.ad.b.b bVar3, final sg.bigo.ads.api.core.b bVar22) {
                                context = context22;
                                bVar = bVar3;
                                bVar = bVar22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                p.a(p.this, context, bVar, bVar);
                            }
                        });
                    }
                    arrayList.add(4);
                    pVar.f81270t = arrayList;
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.3

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ Context f81330a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ sg.bigo.ads.ad.b.b f81331b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ sg.bigo.ads.api.core.b f81332c;

                        public AnonymousClass3(final Context context22, final sg.bigo.ads.ad.b.b bVar3, final sg.bigo.ads.api.core.b bVar22) {
                            context = context22;
                            bVar = bVar3;
                            bVar = bVar22;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            p.a(p.this, context, bVar, bVar);
                        }
                    });
                }
                Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!p.a(p.this)) {
                            Runnable runnable2 = p.this.f81274x;
                            if (runnable2 != null) {
                                runnable2.run();
                                p.this.f81274x = null;
                            }
                            p.this.g();
                        }
                        p.b(p.this);
                    }
                };
                int i11 = pVar.E;
                if (i11 <= 0) {
                    if (i11 != -1) {
                        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page can not be shown due to invalid show delay.");
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page will be shown after video completion.");
                    pVar.f81273w = runnable;
                    pVar.a();
                    return;
                }
                pVar.f81271u = ((long) i11) * 1000;
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page will be shown after " + pVar.E + "s.");
                pVar.f81272v = runnable;
                pVar.a(pVar.f81271u);
                pVar.a();
            }
        });
    }

    @NonNull
    public final h.a p() {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        sg.bigo.ads.api.a.m mVar = this.f80228c;
        if (mVar != null) {
            int iA = this.f80229d ? mVar.a("video_play_page.below_area_dp") : 0;
            boolean z12 = this.f80229d && this.f80228c.a("video_play_page.below_area_clickable") == 1;
            int iA2 = this.f80229d ? this.f80228c.a("video_play_page.up_area_dp") : 0;
            boolean z13 = this.f80229d && this.f80228c.a("video_play_page.up_area_clickable") == 1;
            int iA3 = this.f80228c.a("video_play_page.click_type");
            a(this.D, iA, z12, iA2, z13, 8, iA3);
            i10 = iA;
            z10 = z12;
            i11 = iA2;
            z11 = z13;
            i12 = iA3;
        } else {
            i10 = 0;
            z10 = false;
            i11 = 0;
            z11 = false;
            i12 = 0;
        }
        return new h.a(i10, z10, i11, z11, i12);
    }

    public void q() {
        sg.bigo.ads.api.a.m mVar = this.f80228c;
        if (mVar == null || !this.f80229d) {
            return;
        }
        int iA = mVar.a("video_play_page.close_button_style");
        k(iA != 2 ? iA != 3 ? iA != 4 ? iA != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4 : R.drawable.bigo_ad_ic_close3 : R.drawable.bigo_ad_ic_close2);
    }

    public int r() {
        w wVar = this.f80233h;
        if (wVar == null) {
            return 0;
        }
        return w.b(wVar.f81501o);
    }

    public void s() {
        int iR;
        if ((((s) this.f81070y).f() instanceof sg.bigo.ads.core.a.a) && ((s) this.f81070y).B()) {
            final sg.bigo.ads.core.a.a aVarI = ((s) this.f81070y).f();
            this.f80241p.set(!aVarI.aZ());
            if (this.f80241p.get() && aVarI.bh() == null && (iR = r()) > 0) {
                sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(((long) iR) * 1000) { // from class: sg.bigo.ads.ad.interstitial.a.15
                    @Override // sg.bigo.ads.common.utils.n
                    public final void a() {
                        aVarI.bc();
                        a aVar = a.this;
                        aVar.a(aVar.f80249x, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.15.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.this.u();
                            }
                        });
                    }

                    @Override // sg.bigo.ads.common.utils.n
                    public final void a(long j10) {
                    }
                };
                this.f80249x = nVar;
                nVar.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.t():void");
    }

    public void u() {
    }

    public boolean v() {
        if (!this.f80229d) {
            return false;
        }
        switch (n()) {
            case 6:
                this.f80232g = false;
                this.f80231f = false;
                if (!aH()) {
                }
                break;
            case 7:
            case 8:
            case 9:
                this.f80232g = false;
                this.f80231f = false;
                break;
            case 10:
                this.f80232g = false;
                this.f80231f = true;
                break;
            case 11:
            case 12:
                this.f80232g = true;
                this.f80231f = false;
                break;
            default:
                this.f80232g = false;
                this.f80231f = false;
                break;
        }
        return false;
    }

    public void w() {
        sg.bigo.ads.api.a.m mVar;
        if (this.f80229d && (mVar = this.f80228c) != null) {
            long jA = ((long) mVar.a("video_play_page.guided_click_gesture_show_time")) * 1000;
            if (jA == 0) {
                return;
            }
            this.f80247v = new AnonymousClass2(jA);
        }
    }

    public final void x() {
        final View viewFindViewById;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.inter_slide_gesture_contain)) == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.11

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f80381a;

            public AnonymousClass11(final View viewFindViewById2) {
                view = viewFindViewById2;
            }

            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                sg.bigo.ads.common.utils.u.b(view);
            }
        });
        viewFindViewById2.startAnimation(alphaAnimation);
        viewFindViewById2.setVisibility(8);
    }

    public final void y() {
        View viewFindViewById = this.D.findViewById(R.id.inter_slide_gesture_contain);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setTag(16);
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.a.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    a.this.Q = (int) motionEvent.getX();
                    a.this.R = (int) motionEvent.getY();
                } else if (action == 1 && a.a(a.this.Q, a.this.R, (int) motionEvent.getX(), (int) motionEvent.getY()) > 10.0d) {
                    a.this.x();
                    ((s) a.this.f81070y).H().a((int) motionEvent.getX(), (int) motionEvent.getY(), a.this.Q, a.this.R, 8, ((Integer) view.getTag()).intValue());
                }
                return true;
            }
        });
    }

    @CallSuper
    public void z() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null) {
            return;
        }
        sg.bigo.ads.common.e.a.a(adCountDownButton, this.K);
    }
}
