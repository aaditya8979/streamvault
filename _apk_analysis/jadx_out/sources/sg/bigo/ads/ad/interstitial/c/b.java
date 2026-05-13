package sg.bigo.ads.ad.interstitial.c;

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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.d f80458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.multi_img.b f80459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewFlow f80460q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Indicator f80461r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f80462s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.view.c f80463t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.view.c f80464u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.a f80465v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ValueCallback<Double> f80466w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f80467x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List<Runnable> f80468y;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.c.b$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80480a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.multi_img.d.values().length];
            f80480a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.multi_img.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80480a[sg.bigo.ads.ad.interstitial.multi_img.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80480a[sg.bigo.ads.ad.interstitial.multi_img.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80480a[sg.bigo.ads.ad.interstitial.multi_img.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar2, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
        this.f80466w = new ValueCallback<Double>() { // from class: sg.bigo.ads.ad.interstitial.c.b.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d10) {
                Double d11 = d10;
                if (d11 != null) {
                    b.this.b(d11.doubleValue());
                }
            }
        };
        this.f80467x = new AtomicBoolean(false);
        this.f80468y = new ArrayList();
        this.f80459p = bVar2;
        this.f80458o = new sg.bigo.ads.ad.interstitial.d();
    }

    private sg.bigo.ads.ad.interstitial.multi_img.view.a a(final sg.bigo.ads.ad.interstitial.q qVar, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i10, String str, boolean z10) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(this.f80414j.getContext(), this.f80459p, cVar, e(), i10, str, z10, new ValueCallback<sg.bigo.ads.ad.interstitial.multi_img.view.a>() { // from class: sg.bigo.ads.ad.interstitial.c.b.12
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(sg.bigo.ads.ad.interstitial.multi_img.view.a aVar2) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar3 = aVar2;
                sg.bigo.ads.ad.interstitial.u.a(qVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.b.12.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
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
        this.f80460q.addView(aVar.f81217j, bVar);
        if (this.f80465v != null) {
            aVar.f81225r = new d.a() { // from class: sg.bigo.ads.ad.interstitial.c.b.2
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    b.this.f80465v.a(b.this.f80460q.a(aVar.f81217j));
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

    public static /* synthetic */ void a(b bVar, final long j10, long j11, final long j12) {
        if (j10 > 0) {
            ViewFlow viewFlow = bVar.f80460q;
            if (!viewFlow.f82643g && !viewFlow.e()) {
                bVar.f80460q.setScrollEnabled(false);
                int iA = sg.bigo.ads.common.utils.e.a(bVar.f80414j.getContext(), 40);
                final int scrollX = bVar.f80460q.getScrollX();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iA, 0);
                valueAnimatorOfInt.setDuration(2 * j12);
                valueAnimatorOfInt.setStartDelay(j11);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.c.b.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        b.a(b.this, j10 - 1, 300L, j12);
                    }
                };
                valueAnimatorOfInt.addListener(animatorListenerAdapter);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.c.b.8
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        if (b.this.f80467x.get()) {
                            atomicBoolean.set(true);
                            valueAnimator.removeListener(animatorListenerAdapter);
                            valueAnimator.cancel();
                            b.this.f80468y.add(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.8.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    b.a(b.this, j10, 300L, j12);
                                }
                            });
                            return;
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            b.this.f80460q.scrollTo(scrollX + ((Integer) animatedValue).intValue(), b.this.f80460q.getScrollY());
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            }
        }
        bVar.f80460q.setScrollEnabled(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(double d10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            sg.bigo.ads.common.view.ViewFlow r0 = r7.f80460q
            java.util.List r0 = r0.getItems()
            android.view.ViewGroup r1 = r7.f80415k
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            sg.bigo.ads.ad.b.a.a(r1, r2)
            sg.bigo.ads.common.view.ViewFlow r1 = r7.f80460q
            sg.bigo.ads.ad.b.a.a(r1, r2)
            r1 = 0
            r2 = 4
            if (r10 == 0) goto L2d
            android.view.ViewGroup r10 = r7.f80414j
            android.view.ViewGroup r3 = r7.f80415k
            sg.bigo.ads.ad.b.b r4 = r7.f81466f
            sg.bigo.ads.ad.b.a.a(r10, r3, r2, r4, r8)
            android.view.ViewGroup r10 = r7.f80414j
            sg.bigo.ads.common.view.ViewFlow r3 = r7.f80460q
            sg.bigo.ads.ad.b.b r4 = r7.f81466f
            sg.bigo.ads.ad.b.a.a(r10, r3, r2, r4, r8)
            goto L3d
        L2d:
            android.view.ViewGroup r10 = r7.f80414j
            android.view.ViewGroup r3 = r7.f80415k
            sg.bigo.ads.core.adview.h r4 = sg.bigo.ads.ad.interstitial.q.F
            sg.bigo.ads.ad.b.a.a(r10, r3, r2, r4, r1)
            android.view.ViewGroup r10 = r7.f80414j
            sg.bigo.ads.common.view.ViewFlow r3 = r7.f80460q
            sg.bigo.ads.ad.b.a.a(r10, r3, r2, r4, r1)
        L3d:
            boolean r10 = r7.l()
            r3 = 3
            if (r10 != 0) goto L60
            sg.bigo.ads.ad.interstitial.multi_img.b r10 = r7.f80459p
            r4 = 1
            if (r10 == 0) goto L52
            sg.bigo.ads.api.a.m r10 = r10.f81136a
            java.lang.String r5 = "endpage.multi_click_type"
            int r10 = r10.a(r5)
            goto L53
        L52:
            r10 = r4
        L53:
            r5 = 2
            if (r10 == r5) goto L5d
            if (r10 == r3) goto L59
            goto L60
        L59:
            if (r8 == r4) goto L5e
            if (r8 == r5) goto L5e
        L5d:
            r4 = r1
        L5e:
            r8 = r3
            goto L61
        L60:
            r4 = r1
        L61:
            java.util.Iterator r10 = r0.iterator()
        L65:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r10.next()
            android.view.View r0 = (android.view.View) r0
            int r3 = sg.bigo.ads.ad.interstitial.multi_img.view.d.f81211e
            java.lang.Object r0 = r0.getTag(r3)
            boolean r3 = r0 instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d
            if (r3 == 0) goto L65
            sg.bigo.ads.ad.interstitial.multi_img.view.d r0 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) r0
            sg.bigo.ads.common.view.RoundedFrameLayout r3 = r0.f81217j
            r5 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            sg.bigo.ads.ad.b.a.a(r3, r5)
            android.view.ViewGroup r3 = r7.f80414j
            sg.bigo.ads.common.view.RoundedFrameLayout r0 = r0.f81217j
            if (r9 == 0) goto L9e
            sg.bigo.ads.ad.b.b r5 = r7.f81466f
            if (r4 == 0) goto L9a
            sg.bigo.ads.ad.interstitial.c.b$3 r6 = new sg.bigo.ads.ad.interstitial.c.b$3
            r6.<init>()
            sg.bigo.ads.ad.b.a.a(r3, r0, r2, r5, r6)
            goto L65
        L9a:
            sg.bigo.ads.ad.b.a.a(r3, r0, r2, r5, r8)
            goto L65
        L9e:
            sg.bigo.ads.core.adview.h r5 = sg.bigo.ads.ad.interstitial.q.F
            sg.bigo.ads.ad.b.a.a(r3, r0, r2, r5, r1)
            goto L65
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.c.b.a(int, boolean, boolean):void");
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, View view) {
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, final t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        return super.a(qVar, viewGroup, view, new t.a() { // from class: sg.bigo.ads.ad.interstitial.c.b.5
            @Override // sg.bigo.ads.ad.interstitial.t.a
            public final Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2) {
                if (textView.getTag() == 2 && sg.bigo.ads.common.utils.q.a((CharSequence) str2)) {
                    str2 = b.this.f81466f.getDescription();
                }
                t.a aVar2 = aVar;
                return aVar2 != null ? aVar2.a(textView, str, str2) : Pair.create(str, str2);
            }
        }, i10, i11, i12, viewArr);
    }

    public void b(double d10) {
        if (d10 <= 3.0d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.f80463t;
            if (cVar != null) {
                cVar.a(false);
            }
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.f80464u;
            if (cVar2 != null) {
                cVar2.a(false);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = this.f80463t;
        if (cVar3 != null) {
            cVar3.a(true);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = this.f80464u;
        if (cVar4 != null) {
            cVar4.a(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void d(sg.bigo.ads.ad.interstitial.q qVar) {
        int i10;
        Context context;
        Context context2 = this.f80414j.getContext();
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f80459p;
        List<String> listA = bVar != null ? bVar.a() : null;
        sg.bigo.ads.ad.interstitial.multi_img.b bVar2 = this.f80459p;
        boolean z10 = bVar2 != null && bVar2.f81140e;
        sg.bigo.ads.ad.interstitial.multi_img.d dVar = bVar2 != null ? bVar2.f81137b : sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
        sg.bigo.ads.ad.interstitial.multi_img.c cVar = bVar2 != null ? bVar2.f81139d : sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF;
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(this.f81466f);
        this.f80460q = (ViewFlow) this.f80415k.findViewById(R.id.inter_media_ad_view_flow);
        this.f80461r = (Indicator) this.f80415k.findViewById(R.id.inter_vf_indicator);
        sg.bigo.ads.api.a.m mVar = this.f81467g;
        int iA = sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar != null ? mVar.a("endpage.background_colour") : 1);
        if (iA == 2) {
            this.f80415k.setBackgroundColor(this.f80458o.a(ViewCompat.MEASURED_STATE_MASK));
        } else if (iA == 3 || iA == 4) {
            this.f80415k.setBackgroundColor(this.f80458o.a(ViewCompat.MEASURED_STATE_MASK));
            this.f80465v = new sg.bigo.ads.ad.interstitial.multi_img.a(this.f80415k, this.f80460q, this.f80458o, iA);
        } else {
            this.f80415k.setBackgroundColor(this.f80458o.a(-1));
        }
        this.f80462s = (LinearLayout) this.f80415k.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.common.utils.q.a((CharSequence) this.f81466f.getWarning())) {
            ((ViewGroup.MarginLayoutParams) this.f80462s.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.e.a(context2, 8);
        }
        g(qVar);
        this.f80458o.a(this.f80466w);
        if (this.f80459p != null) {
            Context context3 = this.f80414j.getContext();
            this.f80460q.setDividerWidth(sg.bigo.ads.common.utils.e.a(context3, dVar.f81164f));
            this.f80460q.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context3, dVar.f81167i));
            this.f80460q.setViewStyle(dVar.f81168j);
            this.f80460q.setOnItemChangeListener(new sg.bigo.ads.ad.interstitial.multi_img.f(dVar, this.f80461r, this.f80465v));
            int i11 = 0;
            int i12 = 0;
            while (listA != null && i12 < listA.size()) {
                String str = listA.get(i12);
                if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                    i10 = i12;
                    context = context3;
                } else {
                    i10 = i12;
                    context = context3;
                    a(qVar, cVar, iA, str, ((sg.bigo.ads.core.a.a) this.f81466f.f()).al());
                    i11++;
                }
                i12 = i10 + 1;
                context3 = context;
            }
            Context context4 = context3;
            int iMax = Math.max(dVar == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? 3 - i11 : 0, 0);
            if (z10) {
                iMax = Math.max(iMax, 1);
            }
            int i13 = iMax;
            for (int i14 = 0; i14 < i13; i14++) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA = a(qVar, cVar, iA, (String) null, false);
                sg.bigo.ads.ad.interstitial.u.a(qVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.b.6
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        aVarA.a(bitmap);
                    }
                });
            }
            this.f80460q.setMainChildSize(pVarA);
            int i15 = AnonymousClass4.f80480a[dVar.ordinal()];
            if (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) {
                ViewFlow.d dVar2 = new ViewFlow.d() { // from class: sg.bigo.ads.ad.interstitial.c.b.11
                    @Override // sg.bigo.ads.common.view.ViewFlow.d
                    public final void a() {
                        b.this.f81466f.a((sg.bigo.ads.common.i) null, 4, 29);
                    }
                };
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context4, true);
                this.f80463t = cVar2;
                this.f80460q.setStartView(cVar2.f81204a);
                this.f80460q.setOnStartViewShowListener(dVar2);
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context4, false);
                this.f80464u = cVar3;
                this.f80460q.setEndView(cVar3.f81204a);
                this.f80460q.setOnEndViewShowListener(dVar2);
            }
            int itemCount = dVar == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? this.f80460q.getItemCount() >> 1 : 0;
            this.f80460q.b(itemCount);
            sg.bigo.ads.ad.interstitial.multi_img.a aVar = this.f80465v;
            if (aVar != null) {
                aVar.b(itemCount);
            }
        }
        if (l()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar3 = this.f80459p;
        int iA2 = bVar3 != null ? bVar3.f81136a.a("endpage.multi_guide") : 0;
        switch (iA2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(iA2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.f80460q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.10.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                b bVar4 = b.this;
                                if (bVar4.f80460q.f82643g) {
                                    return;
                                }
                                b.a(bVar4, 3L, 0L, 300L);
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
                this.f80460q.setFlipInterval((iA2 - 5) * 1000);
                this.f80460q.c();
                break;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean d() {
        return false;
    }

    public void g(sg.bigo.ads.ad.interstitial.q qVar) {
    }

    public final boolean l() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f80459p;
        return bVar == null || bVar.f81137b == sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    public final void m() {
        this.f80467x.set(true);
    }

    public final void n() {
        this.f80467x.set(false);
        if (sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f80460q)) {
            sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f80460q, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.c.b.9
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    Iterator it = b.this.f80468y.iterator();
                    while (it.hasNext()) {
                        b.this.f80460q.post((Runnable) it.next());
                    }
                    b.this.f80468y.clear();
                    sg.bigo.ads.ad.interstitial.multi_img.f.a(b.this.f80460q, (ValueCallback<Integer>) null);
                }
            });
            return;
        }
        Iterator<Runnable> it = this.f80468y.iterator();
        while (it.hasNext()) {
            this.f80460q.post(it.next());
        }
        this.f80468y.clear();
    }
}
