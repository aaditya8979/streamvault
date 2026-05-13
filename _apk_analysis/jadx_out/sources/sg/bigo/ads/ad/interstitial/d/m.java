package sg.bigo.ads.ad.interstitial.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.b.a;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes.dex */
public class m extends a {
    public LinearLayout A;
    public sg.bigo.ads.ad.interstitial.multi_img.view.c B;
    public sg.bigo.ads.ad.interstitial.multi_img.view.c C;
    public sg.bigo.ads.ad.interstitial.multi_img.a D;
    public sg.bigo.ads.ad.interstitial.multi_img.view.b E;
    public sg.bigo.ads.ad.interstitial.multi_img.b F;
    private final Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> G;
    private final a.InterfaceC0961a H;
    private final AtomicBoolean I;
    private final List<Runnable> J;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewFlow f80671x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Indicator f80672y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RoundedFrameLayout f80673z;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.d.m$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80699a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.multi_img.d.values().length];
            f80699a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.multi_img.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80699a[sg.bigo.ads.ad.interstitial.multi_img.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80699a[sg.bigo.ads.ad.interstitial.multi_img.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80699a[sg.bigo.ads.ad.interstitial.multi_img.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public m(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
        this.G = new HashSet();
        this.H = new a.InterfaceC0961a() { // from class: sg.bigo.ads.ad.interstitial.d.m.1
            @Override // sg.bigo.ads.ad.b.a.InterfaceC0961a
            public final boolean a() {
                ViewFlow viewFlow = m.this.f80671x;
                if (viewFlow != null) {
                    return viewFlow.f82644h;
                }
                return false;
            }
        };
        this.I = new AtomicBoolean(false);
        this.J = new ArrayList();
    }

    private sg.bigo.ads.ad.interstitial.multi_img.view.a a(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i10, String str, boolean z10) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(context, this.F, cVar, D(), i10, str, z10, new ValueCallback<sg.bigo.ads.ad.interstitial.multi_img.view.a>() { // from class: sg.bigo.ads.ad.interstitial.d.m.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(sg.bigo.ads.ad.interstitial.multi_img.view.a aVar2) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar3 = aVar2;
                m.this.a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.4.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            synchronized (m.this.G) {
                                m.this.G.remove(aVar3);
                            }
                            aVar3.a(bitmap2);
                        }
                    }
                });
            }
        });
        ViewFlow.b bVar = new ViewFlow.b();
        bVar.f82680a = -1;
        bVar.f82681b = -1;
        bVar.f82682c = false;
        bVar.f82683d = cVar.f81156d;
        this.f80671x.addView(aVar.f81217j, bVar);
        if (this.D != null) {
            aVar.f81225r = new d.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.5
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    m.this.D.a(m.this.f80671x.a(aVar.f81217j));
                }

                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void b() {
                    aVar.f81225r = null;
                    a();
                }
            };
        }
        return aVar;
    }

    public static /* synthetic */ void a(m mVar, final long j10, long j11, final long j12) {
        if (j10 > 0) {
            ViewFlow viewFlow = mVar.f80671x;
            if (!viewFlow.f82643g && !viewFlow.e()) {
                mVar.f80671x.setScrollEnabled(false);
                int iA = sg.bigo.ads.common.utils.e.a(mVar.f80602q.getContext(), 40);
                final int scrollX = mVar.f80671x.getScrollX();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iA, 0);
                valueAnimatorOfInt.setDuration(2 * j12);
                valueAnimatorOfInt.setStartDelay(j11);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.d.m.12
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        m.a(m.this, j10 - 1, 300L, j12);
                    }
                };
                valueAnimatorOfInt.addListener(animatorListenerAdapter);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.d.m.13
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        if (m.this.I.get()) {
                            atomicBoolean.set(true);
                            valueAnimator.removeListener(animatorListenerAdapter);
                            valueAnimator.cancel();
                            m.this.J.add(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.13.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                                    m.a(m.this, j10, 300L, j12);
                                }
                            });
                            return;
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            m.this.f80671x.scrollTo(scrollX + ((Integer) animatedValue).intValue(), m.this.f80671x.getScrollY());
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            }
        }
        mVar.f80671x.setScrollEnabled(true);
    }

    public final void A() {
        int iA = this.f80671x.a(this.E.f81217j);
        if (iA < 0 || iA == this.f80671x.getCurrentItem()) {
            return;
        }
        this.f80671x.b(iA);
    }

    @Nullable
    public final sg.bigo.ads.api.a.m B() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        if (bVar != null) {
            return bVar.f81136a;
        }
        return null;
    }

    public boolean C() {
        return E() == sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    public int D() {
        return w();
    }

    public sg.bigo.ads.ad.interstitial.multi_img.d E() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        return bVar != null ? bVar.f81137b : sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    public sg.bigo.ads.ad.interstitial.multi_img.c F() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        return bVar != null ? bVar.f81139d : sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF;
    }

    public final void G() {
        this.I.set(true);
    }

    public final void H() {
        this.I.set(false);
        if (sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f80671x)) {
            sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f80671x, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.d.m.14
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    Iterator it = m.this.J.iterator();
                    while (it.hasNext()) {
                        m.this.f80671x.post((Runnable) it.next());
                    }
                    m.this.J.clear();
                    sg.bigo.ads.ad.interstitial.multi_img.f.a(m.this.f80671x, (ValueCallback<Integer>) null);
                }
            });
            return;
        }
        Iterator<Runnable> it = this.J.iterator();
        while (it.hasNext()) {
            this.f80671x.post(it.next());
        }
        this.J.clear();
    }

    public void I() {
        if (C()) {
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        int iA = bVar != null ? bVar.f81136a.a("video_play_page.multi_guide") : 0;
        switch (iA) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(iA, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.f80671x.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                m mVar = m.this;
                                if (mVar.f80671x.f82643g) {
                                    return;
                                }
                                m.a(mVar, 3L, 0L, 300L);
                            }
                        });
                    }
                });
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f80671x.setFlipInterval((iA - 5) * 1000);
                this.f80671x.c();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J() {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.d.m.J():void");
    }

    public final boolean K() {
        View viewA;
        ViewFlow viewFlow = this.f80671x;
        if (viewFlow == null) {
            return false;
        }
        List<View> items = viewFlow.getItems();
        if (sg.bigo.ads.common.utils.k.a((Collection) items) || items.size() != 1 || (viewA = this.f80671x.a(0)) == null) {
            return false;
        }
        Object tag = viewA.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f81211e);
        if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
            sg.bigo.ads.ad.interstitial.multi_img.c cVar = sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_PARENT;
            dVar.a(cVar);
            dVar.a(4);
            this.f80671x.setViewStyle(3);
            ((ViewFlow.b) viewA.getLayoutParams()).f82683d = cVar.f81156d;
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public void a(double d10) {
        if (d10 <= 3.0d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.B;
            if (cVar != null) {
                cVar.a(false);
            }
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.C;
            if (cVar2 != null) {
                cVar2.a(false);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = this.B;
        if (cVar3 != null) {
            cVar3.a(true);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = this.C;
        if (cVar4 != null) {
            cVar4.a(true);
        }
    }

    public void a(int i10, boolean z10, int i11, boolean z11) {
        T t10;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar == null || (t10 = bVar.f81219l) == 0) {
            return;
        }
        if (z11) {
            sg.bigo.ads.ad.b.a.a(this.f80602q, t10, 8, ((sg.bigo.ads.ad.interstitial.t) this).f81420c, this.H);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f80602q, t10, 8, ((sg.bigo.ads.ad.interstitial.t) this).f81420c, i11);
        }
        if (z10) {
            ((MediaView) this.E.f81219l).setMediaAreaClickable(true);
            ((MediaView) this.E.f81219l).b().a(false);
        } else {
            ((MediaView) this.E.f81219l).setMediaAreaClickable(false);
            ((MediaView) this.E.f81219l).b().a(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, final t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        super.a(viewGroup, view, new t.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.7
            @Override // sg.bigo.ads.ad.interstitial.t.a
            public final Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2) {
                if (textView != null && textView.getTag() == 2 && sg.bigo.ads.common.utils.q.a((CharSequence) str2)) {
                    str2 = ((sg.bigo.ads.ad.interstitial.t) m.this).f81420c.getDescription();
                }
                t.a aVar2 = aVar;
                return aVar2 != null ? aVar2.a(textView, str, str2) : Pair.create(str, str2);
            }
        }, i10, i11, i12, viewArr);
        J();
    }

    public final void a(sg.bigo.ads.ad.interstitial.a aVar, @NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.interstitial.w wVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar, sg.bigo.ads.ad.interstitial.f fVar) {
        this.F = bVar;
        a(aVar, viewGroup, wVar, bVar.f81136a, fVar);
    }

    public void a(sg.bigo.ads.ad.interstitial.q qVar) {
    }

    public void b(int i10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a, sg.bigo.ads.ad.interstitial.t
    public final void f() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            ((MediaView) bVar.f81219l).c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final ViewGroup k() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            return bVar.f81218k;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final MediaView l() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            return (MediaView) bVar.f81219l;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final Button m() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.E;
        if (bVar != null) {
            return bVar.f81201a;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void p() {
        super.p();
        synchronized (this.G) {
            if (this.G.isEmpty()) {
                return;
            }
            final HashSet hashSet = new HashSet(this.G);
            this.G.clear();
            a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.11
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null) {
                        synchronized (m.this.G) {
                            m.this.G.addAll(hashSet);
                        }
                        return;
                    }
                    for (sg.bigo.ads.ad.interstitial.multi_img.view.d dVar : hashSet) {
                        if (dVar instanceof sg.bigo.ads.ad.interstitial.multi_img.view.b) {
                            ((sg.bigo.ads.ad.interstitial.multi_img.view.b) dVar).a(bitmap2);
                        } else if (dVar instanceof sg.bigo.ads.ad.interstitial.multi_img.view.a) {
                            ((sg.bigo.ads.ad.interstitial.multi_img.view.a) dVar).a(bitmap2);
                        }
                    }
                }
            });
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void r() {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void s() {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @CallSuper
    public void t() {
        super.t();
        Context context = this.f80602q.getContext();
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.F;
        List<String> listA = bVar != null ? bVar.a() : null;
        sg.bigo.ads.ad.interstitial.multi_img.b bVar2 = this.F;
        boolean z10 = bVar2 != null && bVar2.f81140e;
        sg.bigo.ads.ad.interstitial.multi_img.d dVarE = E();
        sg.bigo.ads.ad.interstitial.multi_img.c cVarF = F();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) this).f81420c);
        this.f80671x = (ViewFlow) this.f80602q.findViewById(R.id.inter_media_ad_view_flow);
        this.f80672y = (Indicator) this.f80602q.findViewById(R.id.inter_vf_indicator);
        int iX = x();
        if (iX == 3 || iX == 4) {
            this.D = new sg.bigo.ads.ad.interstitial.multi_img.a(this.f80602q, this.f80671x, this.f80600o, iX);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.b(context, cVarF, z(), w(), iX);
        this.E = bVar3;
        this.f80673z = bVar3.f81217j;
        ((MediaView) bVar3.f81219l).setImageBlurBorder(false);
        this.E.a(pVarA.f82290b, pVarA.f82291c);
        if (this.E.b()) {
            final boolean zAR = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f81420c.f()).aR();
            if (zAR) {
                synchronized (this.G) {
                    this.G.add(this.E);
                }
            }
            if (this.D != null) {
                this.E.f81225r = new d.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.8
                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void a() {
                        m mVar = m.this;
                        m.this.D.a(mVar.f80671x.a(mVar.E.f81217j));
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void b() {
                        m.this.E.f81225r = null;
                        a();
                    }
                };
            }
            a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.9
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        if (zAR) {
                            synchronized (m.this.G) {
                                m.this.G.remove(m.this.E);
                            }
                        }
                        m.this.E.a(bitmap2);
                    }
                }
            });
        }
        this.A = (LinearLayout) this.f80602q.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.common.utils.q.a((CharSequence) ((sg.bigo.ads.ad.interstitial.t) this).f81420c.getWarning())) {
            ((ViewGroup.MarginLayoutParams) this.A.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.e.a(context, 8);
        }
        a(this.f80601p);
        if (this.F != null) {
            this.f80671x.setDividerWidth(sg.bigo.ads.common.utils.e.a(context, dVarE.f81164f));
            this.f80671x.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context, dVarE.f81167i));
            this.f80671x.setViewStyle(dVarE.f81168j);
            this.f80671x.setOnItemChangeListener(new sg.bigo.ads.ad.interstitial.multi_img.f(dVarE, this.f80672y, this.D));
            int i10 = 0;
            for (int i11 = 0; listA != null && i11 < listA.size(); i11++) {
                String str = listA.get(i11);
                if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                    a(context, cVarF, iX, str, ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f81420c.f()).al());
                    i10++;
                }
            }
            int iMax = Math.max(dVarE == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? 2 - i10 : 0, 0);
            if (z10) {
                iMax = Math.max(iMax, 1);
            }
            int i12 = iMax;
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i10 + 1;
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA = a(context, cVarF, iX, (String) null, false);
                final boolean zAR2 = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f81420c.f()).aR();
                if (zAR2) {
                    synchronized (this.G) {
                        this.G.add(aVarA);
                    }
                }
                a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.10
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            if (zAR2) {
                                synchronized (m.this.G) {
                                    m.this.G.remove(aVarA);
                                }
                            }
                            aVarA.a(bitmap2);
                        }
                    }
                });
                i13++;
                i10 = i14;
            }
            sg.bigo.ads.ad.interstitial.multi_img.d dVar = sg.bigo.ads.ad.interstitial.multi_img.d.CENTER;
            int i15 = dVarE == dVar ? i10 >> 1 : 0;
            ViewFlow.b bVar4 = new ViewFlow.b();
            bVar4.f82680a = pVarA.f82290b;
            bVar4.f82681b = pVarA.f82291c;
            bVar4.f82682c = true;
            bVar4.f82683d = cVarF.f81156d;
            this.f80671x.addView(this.f80673z, Math.max(0, i15), bVar4);
            int i16 = AnonymousClass6.f80699a[dVarE.ordinal()];
            if (i16 == 1 || i16 == 2 || i16 == 3 || i16 == 4) {
                ViewFlow.d dVar2 = new ViewFlow.d() { // from class: sg.bigo.ads.ad.interstitial.d.m.3
                    @Override // sg.bigo.ads.common.view.ViewFlow.d
                    public final void a() {
                        ((sg.bigo.ads.ad.interstitial.t) m.this).f81420c.a((sg.bigo.ads.common.i) null, 8, 29);
                    }
                };
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, true);
                this.B = cVar;
                this.f80671x.setStartView(cVar.f81204a);
                this.f80671x.setOnStartViewShowListener(dVar2);
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, false);
                this.C = cVar2;
                this.f80671x.setEndView(cVar2.f81204a);
                this.f80671x.setOnEndViewShowListener(dVar2);
            }
            int iA = dVarE == dVar ? this.f80671x.a(this.f80673z) : 0;
            this.f80671x.b(iA);
            sg.bigo.ads.ad.interstitial.multi_img.a aVar = this.D;
            if (aVar != null) {
                aVar.b(iA);
            }
        }
        b(y());
        I();
    }

    public boolean z() {
        return false;
    }
}
