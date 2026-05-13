package sg.bigo.ads.ad.interstitial.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import java.util.Iterator;
import java.util.WeakHashMap;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends sg.bigo.ads.ad.interstitial.t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static long f80596k = sg.bigo.ads.ad.interstitial.u.f81463c;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static long f80597l = sg.bigo.ads.ad.interstitial.u.f81464d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f80598m = sg.bigo.ads.ad.interstitial.u.f81465e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WeakHashMap<Object, ValueCallback<Bitmap>> f80599n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.d f80600o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.q f80601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ViewGroup f80602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup f80603r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.interstitial.w f80604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.api.a.m f80605t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.interstitial.f f80606u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public TextView f80607v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f80608w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ValueCallback<Double> f80609x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f80610y;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.d.a$a, reason: collision with other inner class name */
    public static class C0989a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f80630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f80631b;

        private C0989a(int i10, boolean z10) {
            this.f80630a = i10;
            this.f80631b = z10;
        }

        public /* synthetic */ C0989a(int i10, boolean z10, byte b10) {
            this(i10, z10);
        }
    }

    public a(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
        this.f80599n = new WeakHashMap<>();
        this.f80609x = new ValueCallback<Double>() { // from class: sg.bigo.ads.ad.interstitial.d.a.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d10) {
                Double d11 = d10;
                if (d11 != null) {
                    sg.bigo.ads.ad.interstitial.q qVar = a.this.f80601p;
                    if (qVar != null && qVar.an() != null) {
                        a.this.f80601p.an().onReceiveValue(d11);
                    }
                    a.this.a(d11.doubleValue());
                }
            }
        };
        this.f80610y = 0L;
        this.f80600o = new sg.bigo.ads.ad.interstitial.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(sg.bigo.ads.ad.interstitial.t tVar, @Nullable sg.bigo.ads.api.a.m mVar) {
        return tVar instanceof sg.bigo.ads.ad.interstitial.f.c ? ((sg.bigo.ads.ad.interstitial.f.c) tVar).I() : a(mVar, "video_play_page.webview_layout");
    }

    public static int a(@Nullable sg.bigo.ads.api.a.m mVar, @Nullable String str) {
        int iA = (mVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) str)) ? 0 : mVar.a(str);
        if (iA == 1 || iA == 2 || iA == 3 || iA == 4 || iA == 7 || iA == 8) {
            return iA;
        }
        return 0;
    }

    public static w a(@NonNull sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.a.m mVar, int i10) {
        return i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? new x(bVar, mVar) : new ac(bVar, mVar) : new ab(bVar, mVar) : new aa(bVar, mVar) : new z(bVar, mVar) : new y(bVar, mVar);
    }

    @NonNull
    public static sg.bigo.ads.ad.interstitial.t a(@NonNull sg.bigo.ads.ad.b.b bVar) {
        return new sg.bigo.ads.ad.interstitial.t(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static sg.bigo.ads.ad.interstitial.t a(@NonNull sg.bigo.ads.ad.b.b bVar, int i10) {
        if (bVar instanceof sg.bigo.ads.api.b.f) {
            sg.bigo.ads.api.b.f fVar = (sg.bigo.ads.api.b.f) bVar;
            if (!fVar.K()) {
                return fVar.i_() == 3 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? new sg.bigo.ads.ad.interstitial.d.a.a(bVar) : new sg.bigo.ads.ad.interstitial.d.a.c(bVar) : new sg.bigo.ads.ad.interstitial.d.a.b(bVar) : new sg.bigo.ads.ad.interstitial.d.a.a(bVar) : new sg.bigo.ads.ad.interstitial.d.a.a.a(bVar);
            }
        }
        switch (i10) {
            case 13:
                return new n(bVar);
            case 14:
                return new o(bVar);
            case 15:
                return new p(bVar);
            case 16:
                return new q(bVar);
            case 17:
                return new r(bVar);
            case 18:
                return new s(bVar);
            case 19:
                return new b(bVar);
            case 20:
                return new c(bVar);
            case 21:
                return new d(bVar);
            case 22:
                return new e(bVar);
            case 23:
                return new f(bVar);
            case 24:
                return new g(bVar);
            case 25:
                return new h(bVar);
            case 26:
                return new i(bVar);
            case 27:
                return new j(bVar);
            case 28:
                return new k(bVar);
            case 29:
                return new l(bVar);
            case 30:
            default:
                return new sg.bigo.ads.ad.interstitial.t(bVar);
            case 31:
            case 32:
                sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(bVar);
                return ((31 == i10 || 32 == i10) && pVarA.a()) ? pVarA.getWidth() / pVarA.getHeight() > 0 ? new u(bVar) : 31 == i10 ? new t(bVar) : new v(bVar) : new sg.bigo.ads.ad.interstitial.t(bVar);
        }
    }

    public static /* synthetic */ boolean a(a aVar) {
        return (aVar.f80610y != 0 ? SystemClock.elapsedRealtime() - aVar.f80610y : 0L) > f80596k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(sg.bigo.ads.ad.interstitial.t tVar) {
        if (tVar instanceof sg.bigo.ads.ad.interstitial.f.c) {
            return ((sg.bigo.ads.ad.interstitial.f.c) tVar).K();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(sg.bigo.ads.ad.interstitial.t tVar, @Nullable sg.bigo.ads.api.a.m mVar) {
        return tVar instanceof sg.bigo.ads.ad.interstitial.f.c ? ((sg.bigo.ads.ad.interstitial.f.c) tVar).J() : b(mVar, "video_play_page.webview_force_time");
    }

    @IntRange(from = -1, to = PlaybackStateCompat.ACTION_REWIND)
    public static int b(@Nullable sg.bigo.ads.api.a.m mVar, @Nullable String str) {
        int iA = (mVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) str)) ? 0 : mVar.a(str, -1);
        switch (iA) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return iA;
            case 0:
            default:
                return 0;
        }
    }

    public static sg.bigo.ads.ad.interstitial.c.x b(@NonNull sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.a.m mVar, int i10) {
        return i10 != 3 ? i10 != 5 ? i10 != 6 ? new sg.bigo.ads.ad.interstitial.c.x(bVar, mVar) : new sg.bigo.ads.ad.interstitial.c.aa(bVar, mVar) : new sg.bigo.ads.ad.interstitial.c.z(bVar, mVar) : new sg.bigo.ads.ad.interstitial.c.y(bVar, mVar);
    }

    public abstract void a(double d10);

    public void a(int i10) {
        ViewGroup viewGroup = this.f80602q;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(this.f80600o.a(i10));
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    public final void a(@NonNull ViewGroup viewGroup) {
    }

    public final void a(final TextView textView, final b.a aVar) {
        if (textView == null) {
            return;
        }
        Integer numA = sg.bigo.ads.ad.interstitial.r.a((NativeAd) ((sg.bigo.ads.ad.interstitial.t) this).f81420c);
        if (numA == null) {
            a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.a.6
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        final int iA = sg.bigo.ads.common.w.b.a(bitmap2, -16736769);
                        textView.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.a.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                sg.bigo.ads.ad.interstitial.d.a(textView, iA, aVar);
                            }
                        });
                    } else {
                        synchronized (a.this.f80599n) {
                            a.this.f80599n.put(textView, this);
                        }
                    }
                }
            });
        } else {
            sg.bigo.ads.ad.interstitial.d.a(textView, numA.intValue(), aVar);
        }
    }

    public final boolean a(sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.interstitial.w wVar, @NonNull sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.f fVar) {
        ViewGroup viewGroup2;
        if (qVar == null) {
            return false;
        }
        this.f80601p = qVar;
        this.f80602q = viewGroup;
        if (viewGroup != null) {
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.inter_media_container);
            this.f80603r = viewGroup3;
            viewGroup2 = viewGroup3 == null ? this.f80602q : null;
            this.f80604s = wVar;
            this.f80605t = mVar;
            this.f80606u = fVar;
            this.f80607v = (TextView) this.f80602q.findViewById(R.id.inter_warning);
            sg.bigo.ads.common.utils.u.a(this.f80602q, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.a.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    a.this.f80610y = SystemClock.elapsedRealtime();
                }
            });
            o();
            t();
            q();
            this.f80600o.a(this.f80609x);
            return true;
        }
        this.f80603r = viewGroup2;
        this.f80604s = wVar;
        this.f80605t = mVar;
        this.f80606u = fVar;
        this.f80607v = (TextView) this.f80602q.findViewById(R.id.inter_warning);
        sg.bigo.ads.common.utils.u.a(this.f80602q, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.a.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                a.this.f80610y = SystemClock.elapsedRealtime();
            }
        });
        o();
        t();
        q();
        this.f80600o.a(this.f80609x);
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    @NonNull
    public final sg.bigo.ads.ad.interstitial.d e() {
        return this.f80600o;
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    public void f() {
        super.f();
        this.f80608w = true;
    }

    public final Context j() {
        ViewGroup viewGroup = this.f80602q;
        return viewGroup != null ? viewGroup.getContext() : ((sg.bigo.ads.ad.interstitial.t) this).f81420c.f80021b.f81864e;
    }

    @Nullable
    public abstract ViewGroup k();

    @Nullable
    public abstract MediaView l();

    @Nullable
    public abstract Button m();

    public boolean n() {
        return false;
    }

    public void o() {
        int iX = x();
        if (iX == 2) {
            a(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        if (iX == 3) {
            a(ViewCompat.MEASURED_STATE_MASK);
            r();
        } else if (iX != 4) {
            a(-1);
        } else {
            a(ViewCompat.MEASURED_STATE_MASK);
            s();
        }
    }

    @CallSuper
    public void p() {
        if (this.f80599n.isEmpty()) {
            return;
        }
        a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.a.3
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    synchronized (a.this.f80599n) {
                        Iterator<ValueCallback<Bitmap>> it = a.this.f80599n.values().iterator();
                        while (it.hasNext()) {
                            it.next().onReceiveValue(bitmap2);
                        }
                        a.this.f80599n.clear();
                    }
                }
            }
        });
    }

    public void q() {
        String strI = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f81420c.f()).i();
        TextView textView = (TextView) this.f80602q.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.f80602q.findViewById(R.id.inter_ad_label);
        if (textView != null) {
            if (TextUtils.isEmpty(strI)) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(strI);
            textView.setPadding(sg.bigo.ads.common.utils.e.a(this.f80602q.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1), sg.bigo.ads.common.utils.e.a(textView.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1));
            textView2.setText(R.string.bigo_ad_tag);
        }
    }

    public void r() {
        Integer numA = sg.bigo.ads.ad.interstitial.r.a((NativeAd) ((sg.bigo.ads.ad.interstitial.t) this).f81420c);
        if (numA != null) {
            a(numA.intValue());
        } else {
            a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.a.4
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null) {
                        synchronized (a.this.f80599n) {
                            a aVar = a.this;
                            aVar.f80599n.put(aVar.f80602q, this);
                        }
                    } else {
                        final long j10 = a.a(a.this) ? a.f80597l : 0L;
                        final Integer numA2 = sg.bigo.ads.common.w.b.a(bitmap2);
                        if (numA2 != null) {
                            a.this.f80602q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.a.4.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    a aVar2 = a.this;
                                    sg.bigo.ads.common.w.b.a(aVar2.f80602q, aVar2.f80600o.a(numA2.intValue()), new b.a() { // from class: sg.bigo.ads.ad.interstitial.d.a.4.1.1
                                        @Override // sg.bigo.ads.common.w.b.a
                                        public final long a() {
                                            return j10;
                                        }
                                    });
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    @RequiresApi(api = 17)
    public void s() {
        a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.a.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 == null) {
                    synchronized (a.this.f80599n) {
                        a aVar = a.this;
                        aVar.f80599n.put(aVar.f80602q, this);
                    }
                } else {
                    a aVar2 = a.this;
                    if (aVar2.f80602q != null) {
                        final long j10 = a.a(aVar2) ? a.f80597l : 0L;
                        sg.bigo.ads.common.utils.d.a(a.this.f80602q.getContext(), bitmap2, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.a.5.1
                            @Override // android.webkit.ValueCallback
                            public final /* synthetic */ void onReceiveValue(Bitmap bitmap3) {
                                Bitmap bitmap4 = bitmap3;
                                Integer numA = sg.bigo.ads.common.w.b.a(bitmap4);
                                final BitmapDrawable bitmapDrawable = new BitmapDrawable(a.this.f80602q.getResources(), bitmap4);
                                bitmapDrawable.setAlpha(0);
                                sg.bigo.ads.ad.interstitial.multi_img.a.a(a.this.f80602q, "adview_background_main_tag", bitmapDrawable);
                                sg.bigo.ads.ad.interstitial.c.a(0, a.f80598m, j10, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.d.a.5.1.1
                                    @Override // android.webkit.ValueCallback
                                    public final /* synthetic */ void onReceiveValue(Integer num) {
                                        Integer num2 = num;
                                        if (num2 != null) {
                                            bitmapDrawable.setAlpha(num2.intValue());
                                        }
                                    }
                                }, new ValueCallback<Void>() { // from class: sg.bigo.ads.ad.interstitial.d.a.5.1.2
                                    @Override // android.webkit.ValueCallback
                                    public final /* bridge */ /* synthetic */ void onReceiveValue(Void r12) {
                                    }
                                });
                                if (numA != null) {
                                    a.this.f80600o.a(numA.intValue());
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    @CallSuper
    public void t() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final C0989a u() {
        sg.bigo.ads.api.a.m mVar = this.f80605t;
        boolean z10 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (mVar == null) {
            return new C0989a(-16736769, z10, objArr2 == true ? 1 : 0);
        }
        boolean[] zArr = new boolean[1];
        return new C0989a(sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) this).f81420c, mVar.a("video_play_page.cta_color"), zArr), true ^ zArr[0], objArr == true ? 1 : 0);
    }

    public boolean v() {
        sg.bigo.ads.api.a.m mVar = this.f80605t;
        if (mVar != null) {
            return mVar.c("video_play_page.is_cta_show_animation");
        }
        return false;
    }

    public final int w() {
        sg.bigo.ads.api.a.m mVar = this.f80605t;
        return sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar != null ? mVar.a("video_play_page.mediaview_colour") : 3);
    }

    public int x() {
        sg.bigo.ads.api.a.m mVar = this.f80605t;
        return sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar != null ? mVar.a("video_play_page.background_colour") : 1);
    }

    public int y() {
        sg.bigo.ads.api.a.m mVar = this.f80605t;
        if (mVar != null) {
            return mVar.a("video_play_page.ad_component_show_time");
        }
        return -1;
    }
}
