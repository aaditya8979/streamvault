package sg.bigo.ads.ad.interstitial;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.AutoNextLineLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    @NonNull
    public final d A;

    @NonNull
    public final e B;
    public c C;

    @Nullable
    private final f F;

    @Nullable
    private Runnable G;

    @Nullable
    private Runnable H;

    @Nullable
    private View I;
    private int M;
    private long N;
    private boolean O;

    @Nullable
    private Runnable P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f81251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.b.b f81252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final sg.bigo.ads.api.core.b f81253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final sg.bigo.ads.api.a.m f81254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Runnable f81255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public FrameLayout f81256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public FrameLayout f81257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public AlertDialog f81258h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f81265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f81266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f81267q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f81269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<Integer> f81270t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f81271u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Runnable f81272v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public Runnable f81273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Runnable f81274x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final a f81276z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f81259i = true;
    private boolean J = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f81260j = false;
    private boolean K = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81261k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f81262l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f81263m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f81264n = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f81268r = 0;
    private long L = -1;

    @NonNull
    private final List<Runnable> Q = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final b f81275y = new b();
    public boolean D = false;
    public int E = 0;

    @SuppressLint({"ClickableViewAccessibility"})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f81354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f81355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f81356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f81357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f81358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f81359f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f81360g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f81361h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f81362i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f81363j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f81364k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f81365l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public View f81366m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public View f81367n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public View f81368o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public p f81369p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NonNull
        public final Map<View, sg.bigo.ads.core.adview.h> f81370q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NonNull
        public final sg.bigo.ads.core.adview.h f81371r;

        private a() {
            this.f81354a = 0;
            this.f81370q = new HashMap();
            this.f81371r = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.p.a.1
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i10, int i11, int i12, int i13, int i14, int i15) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Disable click by style config.");
                }
            };
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        public static /* synthetic */ View a(a aVar, View view, float f10, float f11) {
            ArrayList arrayList = new ArrayList();
            aVar.a(view, f10, f11, 0, new int[2], arrayList);
            if (arrayList.size() > 0) {
                return arrayList.get(arrayList.size() - 1);
            }
            return null;
        }

        private void a(View view, float f10, float f11, int i10, @NonNull int[] iArr, @NonNull List<View> list) {
            if (i10 > 10) {
                return;
            }
            int i11 = i10 + 1;
            if (view == null) {
                return;
            }
            view.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            if (f10 > i12 && f10 < i12 + view.getWidth() && f11 > i13 && f11 < i13 + view.getHeight() && (view.getTag() instanceof Integer) && this.f81370q.containsKey(view)) {
                list.add(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    a(viewGroup.getChildAt(i14), f10, f11, i11, iArr, list);
                }
            }
        }

        private void a(final sg.bigo.ads.ad.b.b bVar, @NonNull final View view, final int i10) {
            final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.p.a.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public boolean f81373a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f81374b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f81375c;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f81380h = 11;

                private View a(float f10) {
                    a aVar = a.this;
                    if (f10 < aVar.f81361h) {
                        return aVar.f81367n;
                    }
                    if (aVar.f81359f <= 0 || f10 <= aVar.f81363j - r1) {
                        return null;
                    }
                    return aVar.f81368o;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0156  */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
                    /*
                        Method dump skipped, instruction units count: 474
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.p.a.AnonymousClass2.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
        }

        private void a(sg.bigo.ads.ad.b.b bVar, @NonNull View view, @NonNull View view2, sg.bigo.ads.core.adview.h hVar, int i10) {
            if (hVar == null) {
                view2.setOnTouchListener(null);
            } else {
                a(bVar, view, i10);
            }
        }

        public final sg.bigo.ads.core.adview.h a(final sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.core.adview.h hVar) {
            return hVar == bVar ? new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.p.a.3
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i10, int i11, int i12, int i13, int i14, int i15) {
                    a.this.f81369p.f81263m = true;
                    bVar.a(i10, i11, i12, i13, i14, i15);
                }
            } : hVar;
        }

        public final void a(sg.bigo.ads.ad.b.b bVar, @NonNull View view, @NonNull View view2, int i10, @Nullable sg.bigo.ads.core.adview.h hVar) {
            if (view.getTag() != null) {
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Error that touch view exists another tag.");
            }
            view.setTag(R.id.content, "TouchView");
            view2.setTag(Integer.valueOf(i10));
            if (hVar != null) {
                this.f81370q.put(view2, hVar);
            }
            a(bVar, view, view2, hVar, this.f81354a);
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f81384a = false;

        public b() {
        }

        private void b(Runnable runnable) {
            p.b(p.this);
            sg.bigo.ads.common.n.d.a(2, runnable);
        }

        public final boolean a() {
            p pVar = p.this;
            if (pVar.f81259i && !this.f81384a) {
                this.f81384a = true;
                Runnable runnable = pVar.f81273w;
                if (runnable != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Show mid page due to close button pressed in main page.");
                    b(runnable);
                    return true;
                }
            }
            return false;
        }

        public final boolean a(@Nullable Runnable runnable) {
            Runnable runnable2;
            p pVar = p.this;
            if (pVar.f81259i && !this.f81384a) {
                this.f81384a = true;
                Runnable runnable3 = pVar.f81273w;
                if (runnable3 == null && (runnable2 = pVar.f81272v) != null) {
                    sg.bigo.ads.common.n.d.a(runnable2);
                    p pVar2 = p.this;
                    runnable3 = pVar2.f81272v;
                    pVar2.f81273w = runnable3;
                }
                if (runnable3 != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Show mid page due to video completion.");
                    p.this.f81274x = runnable;
                    b(runnable3);
                    return true;
                }
            }
            return false;
        }
    }

    public interface c {
        boolean a(Runnable runnable);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f81386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f81387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f81388c;

        private d() {
        }

        public /* synthetic */ d(byte b10) {
            this();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f81389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f81390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f81391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<Integer, Long> f81392d;

        private e() {
            this.f81392d = new HashMap();
        }

        public /* synthetic */ e(byte b10) {
            this();
        }

        public static int a(int i10, boolean z10) {
            if (i10 == 1) {
                return z10 ? 2 : 1;
            }
            if (i10 == 2) {
                return 4;
            }
            if (i10 == 3) {
                return 3;
            }
            if (i10 == 4) {
                return 5;
            }
            return i10 == 5 ? 6 : 0;
        }

        private static int a(@NonNull String str, int i10) {
            return (str + i10).hashCode();
        }

        public final void a(sg.bigo.ads.api.core.b bVar, int i10, String str, int i11) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iA = a(str, i11);
            if (this.f81392d.get(Integer.valueOf(iA)) == null) {
                this.f81392d.put(Integer.valueOf(iA), Long.valueOf(SystemClock.elapsedRealtime()));
                sg.bigo.ads.core.d.b.a(bVar, a(i10, false), 1, String.valueOf(iA), 0L, false, 0, (String) null);
            }
        }

        public final void a(sg.bigo.ads.api.core.b bVar, int i10, String str, int i11, int i12, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iA = a(str, i11);
            Long l10 = this.f81392d.get(Integer.valueOf(iA));
            if (l10 == null) {
                return;
            }
            sg.bigo.ads.core.d.b.a(bVar, a(i10, false), 6, String.valueOf(iA), SystemClock.elapsedRealtime() - l10.longValue(), true, i12, str2);
        }

        public final void a(sg.bigo.ads.api.core.b bVar, boolean z10, int i10, String str) {
            if (this.f81391c || this.f81389a <= 0) {
                return;
            }
            this.f81391c = true;
            sg.bigo.ads.core.d.b.a(bVar, a(1, z10), 4, (String) null, SystemClock.elapsedRealtime() - this.f81389a, true, i10, str);
        }

        public final void b(sg.bigo.ads.api.core.b bVar, int i10, String str, int i11) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iA = a(str, i11);
            Long l10 = this.f81392d.get(Integer.valueOf(iA));
            if (l10 == null) {
                return;
            }
            sg.bigo.ads.core.d.b.a(bVar, a(i10, false), 5, String.valueOf(iA), SystemClock.elapsedRealtime() - l10.longValue(), false, 0, (String) null);
        }
    }

    public p(Context context, @NonNull sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.core.b bVar2, sg.bigo.ads.api.a.m mVar, boolean z10, f fVar, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        byte b10 = 0;
        this.f81265o = false;
        this.f81276z = new a(b10);
        this.A = new d(b10);
        this.B = new e(b10);
        this.f81251a = context;
        this.f81252b = bVar;
        this.f81253c = bVar2;
        this.F = fVar;
        this.f81254d = mVar;
        this.f81265o = z10;
        this.f81255e = runnable;
        this.G = runnable2;
        this.H = runnable3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r49v0, types: [sg.bigo.ads.ad.interstitial.p] */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.ViewGroup] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View a(android.content.Context r50, sg.bigo.ads.ad.b.b r51, final sg.bigo.ads.api.core.b r52, boolean r53) {
        /*
            Method dump skipped, instruction units count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.p.a(android.content.Context, sg.bigo.ads.ad.b.b, sg.bigo.ads.api.core.b, boolean):android.view.View");
    }

    @NonNull
    private FrameLayout a(@NonNull Context context, @NonNull View view, boolean z10) {
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        int i11 = this.A.f81387b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z10 ? -1 : -2);
        if (i11 == 1) {
            int iA = sg.bigo.ads.common.utils.e.a(context, 10);
            layoutParams.topMargin = iA;
            layoutParams.bottomMargin = iA;
            layoutParams.leftMargin = iA;
            layoutParams.rightMargin = iA;
            i10 = 17;
        } else {
            layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(context, 40);
            i10 = 80;
        }
        layoutParams.gravity = i10;
        frameLayout.addView(view, layoutParams);
        String str = this.f81252b.R().f81809g;
        if (sg.bigo.ads.common.utils.q.b((CharSequence) str)) {
            sg.bigo.ads.common.view.c.a(context, frameLayout, new sg.bigo.ads.common.view.c(context, str));
        }
        return frameLayout;
    }

    @NonNull
    private static LinearLayout a(Context context, View view, int i10) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#F0F3F4", -7829368));
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.bigo_ad_btn_close);
        imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close_gray_light));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context, 24), sg.bigo.ads.common.utils.e.a(context, 24), 21);
        layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 20);
        frameLayout.addView(imageView, layoutParams);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context, 48)));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, i10));
        return linearLayout;
    }

    private void a(@NonNull Context context, View view, sg.bigo.ads.ad.b.b bVar, @NonNull AutoNextLineLinearLayout autoNextLineLinearLayout, @NonNull String[] strArr) {
        for (String str : strArr) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    TextView textView = new TextView(context);
                    textView.setText(str);
                    textView.setTextColor(sg.bigo.ads.common.utils.q.b("#5F6367", -7829368));
                    textView.setTextSize(13.0f);
                    textView.setPadding(sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 5), sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 5));
                    textView.setGravity(17);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setStroke(sg.bigo.ads.common.utils.e.a(context, 1), sg.bigo.ads.common.utils.q.b("#DBDDE0", -7829368));
                    gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 14));
                    textView.setBackground(gradientDrawable);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, sg.bigo.ads.common.utils.e.a(context, 28));
                    layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(context, 12);
                    layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 12);
                    a(view, textView, 27, bVar, bVar);
                    autoNextLineLinearLayout.addView(textView, layoutParams);
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    private void a(@NonNull Context context, ViewGroup viewGroup, sg.bigo.ads.ad.b.b bVar, @NonNull final sg.bigo.ads.api.core.b bVar2, @NonNull String[] strArr) {
        String[] strArr2;
        ViewGroup viewGroup2;
        String[] strArr3 = strArr;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        final ArrayList arrayList = new ArrayList();
        int i10 = 0;
        ViewGroup viewGroup3 = linearLayout;
        while (i10 < strArr3.length) {
            final String str = strArr3[i10];
            if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                strArr2 = strArr3;
                viewGroup2 = viewGroup3;
            } else {
                final int iA = sg.bigo.ads.common.utils.e.a(context, 200);
                final RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
                roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.e.a(context, 1));
                roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.q.b("#08000000", -7829368));
                final AdImageView adImageView = new AdImageView(context);
                adImageView.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#FFE1E1E6", -7829368));
                adImageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
                this.B.a(bVar2, 2, str, i10);
                ViewGroup viewGroup4 = viewGroup3;
                final int i11 = i10;
                sg.bigo.ads.common.p.g gVar = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.p.8
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i12, @NonNull String str2, String str3) {
                        p.this.B.a(bVar2, 2, str, i11, i12, str2);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        ViewGroup.LayoutParams layoutParams;
                        adImageView.setBackground(null);
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        if (width > 0 && height > 0 && (layoutParams = roundedFrameLayout.getLayoutParams()) != null) {
                            layoutParams.width = (width * iA) / height;
                        }
                        adImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        p.this.B.b(bVar2, 2, str, i11);
                    }
                };
                adImageView.a(gVar);
                arrayList.add(gVar);
                a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        adImageView.a();
                    }
                });
                adImageView.a(str, bVar2.al());
                roundedFrameLayout.addView(adImageView, new FrameLayout.LayoutParams(-1, -1));
                a aVar = this.f81276z;
                a(viewGroup, roundedFrameLayout, 5, bVar, aVar.f81356c ? bVar : aVar.f81371r);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context, 100), iA);
                layoutParams.leftMargin = i10 == 0 ? sg.bigo.ads.common.utils.e.a(context, 20) : sg.bigo.ads.common.utils.e.a(context, 12);
                strArr2 = strArr;
                if (i10 + 1 == strArr2.length) {
                    layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 20);
                }
                viewGroup2 = viewGroup4;
                viewGroup2.addView(roundedFrameLayout, layoutParams);
            }
            a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.10
                @Override // java.lang.Runnable
                public final void run() {
                    arrayList.clear();
                }
            });
            i10++;
            strArr3 = strArr2;
            viewGroup3 = viewGroup2;
        }
        View view = viewGroup3;
        a aVar2 = this.f81276z;
        a(viewGroup, viewGroup, 18, bVar, aVar2.f81357d ? bVar : aVar2.f81371r);
        viewGroup.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull View view, @NonNull View view2, int i10, @NonNull sg.bigo.ads.ad.b.b bVar, @Nullable sg.bigo.ads.core.adview.h hVar) {
        a aVar = this.f81276z;
        aVar.a(bVar, view, view2, i10, aVar.a(bVar, hVar));
    }

    private void a(@NonNull Runnable runnable) {
        this.Q.add(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(sg.bigo.ads.ad.interstitial.p r18, final android.content.Context r19, final sg.bigo.ads.ad.b.b r20, final sg.bigo.ads.api.core.b r21) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.p.a(sg.bigo.ads.ad.interstitial.p, android.content.Context, sg.bigo.ads.ad.b.b, sg.bigo.ads.api.core.b):void");
    }

    public static /* synthetic */ void a(p pVar, final Context context, final sg.bigo.ads.ad.b.b bVar, final sg.bigo.ads.api.core.b bVar2, int i10) {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Notify mid page content view render failed, try next render way.");
        pVar.f81268r = i10;
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.15
            @Override // java.lang.Runnable
            public final void run() {
                p.a(p.this, context, bVar, bVar2);
            }
        });
    }

    @UiThread
    private void a(sg.bigo.ads.api.core.b bVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "All render way failed.");
        this.f81260j = true;
        sg.bigo.ads.core.d.b.a(bVar, "0", e.a(this.f81267q, this.f81266p), this.f81268r);
        e();
    }

    public static /* synthetic */ boolean a(p pVar) {
        String str;
        final Context context = pVar.f81251a;
        final sg.bigo.ads.ad.b.b bVar = pVar.f81252b;
        final sg.bigo.ads.api.core.b bVar2 = pVar.f81253c;
        if (pVar.a(context, bVar, bVar2, pVar.f81254d)) {
            final int i10 = pVar.f81267q;
            final boolean z10 = pVar.f81266p;
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Try show mid page.");
            View view = pVar.I;
            boolean z11 = pVar.J;
            boolean z12 = pVar.f81260j;
            if (z11 && view != null) {
                StringBuilder sb2 = new StringBuilder("Show mid page content, render way: ");
                sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "LOADING" : "FALLBACK" : "IMAGE" : "NATIVE" : "WEB_VIEW");
                sb2.append(".");
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", sb2.toString());
                if (pVar.j()) {
                    boolean z13 = pVar.f81267q == 3;
                    final FrameLayout frameLayoutA = pVar.a(context, pVar.b(context, view, z13), z13);
                    pVar.K = true;
                    if (bVar2 instanceof sg.bigo.ads.core.a.a) {
                        ((sg.bigo.ads.core.a.a) bVar2).g(e.a(i10, z10));
                    }
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.18
                        @Override // java.lang.Runnable
                        public final void run() {
                            p pVar2 = p.this;
                            Context context2 = context;
                            sg.bigo.ads.ad.b.b bVar3 = bVar;
                            sg.bigo.ads.api.core.b bVar4 = bVar2;
                            FrameLayout frameLayout = frameLayoutA;
                            if (!pVar2.f81262l) {
                                pVar2.a(context2, bVar3, bVar4, frameLayout);
                                pVar2.f81256f = frameLayout;
                                return;
                            }
                            FrameLayout frameLayout2 = pVar2.f81257g;
                            if (frameLayout2 != null) {
                                frameLayout2.removeAllViews();
                                pVar2.a(frameLayout);
                                frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                            }
                            pVar2.f81256f = frameLayout2;
                            pVar2.f81262l = false;
                            if ((bVar4 instanceof sg.bigo.ads.core.a.a) && pVar2.f81269s == 0) {
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                pVar2.f81269s = jElapsedRealtime;
                                ((sg.bigo.ads.core.a.a) bVar4).b(jElapsedRealtime);
                            }
                            sg.bigo.ads.core.d.b.a(bVar4, "1", e.a(pVar2.f81267q, pVar2.f81266p), pVar2.f81268r);
                        }
                    });
                }
                return true;
            }
            if (z12) {
                str = "Failed to show mid page due to unavailable.";
            } else {
                if (!z11 && view != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Show mid page loading.");
                    if (pVar.j()) {
                        final FrameLayout frameLayout = new FrameLayout(context);
                        View viewA = sg.bigo.ads.common.utils.a.a(context, pVar.f81265o ? R.layout.bigo_ad_layout_interstitial_mid_page_loading_view_landscape : R.layout.bigo_ad_layout_interstitial_mid_page_loading_view, null, false);
                        if (viewA != null) {
                            pVar.f81262l = true;
                            FrameLayout frameLayoutA2 = pVar.a(context, (View) pVar.b(context, a(context, viewA, -1), true), true);
                            frameLayout.addView(frameLayoutA2, new FrameLayout.LayoutParams(-1, -1));
                            a aVar = pVar.f81276z;
                            pVar.a(viewA, viewA, 18, bVar, aVar.f81355b ? bVar : aVar.f81371r);
                            a aVar2 = pVar.f81276z;
                            pVar.a(frameLayoutA2, frameLayoutA2, 18, bVar, aVar2.f81355b ? bVar : aVar2.f81371r);
                            pVar.f81257g = frameLayout;
                            if (bVar2 instanceof sg.bigo.ads.core.a.a) {
                                ((sg.bigo.ads.core.a.a) bVar2).g(6);
                            }
                            pVar.f81267q = 5;
                            sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.21
                                @Override // java.lang.Runnable
                                public final void run() {
                                    p.this.a(context, bVar, bVar2, frameLayout);
                                }
                            });
                        }
                    }
                    return true;
                }
                str = "Failed to show mid page due to unknown reason.";
            }
            sg.bigo.ads.common.t.a.a(0, "InterstitialMidPageRenderer", str);
        }
        return false;
    }

    @NonNull
    private FrameLayout b(@NonNull Context context, @NonNull View view, boolean z10) {
        int i10 = this.A.f81387b;
        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
        if (i10 == 1) {
            roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 12));
        } else {
            roundedFrameLayout.a(sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 0), sg.bigo.ads.common.utils.e.a(context, 0));
        }
        roundedFrameLayout.addView(view, new FrameLayout.LayoutParams(-1, z10 ? -1 : -2));
        return roundedFrameLayout;
    }

    public static /* synthetic */ void b(p pVar) {
        pVar.f81272v = null;
        pVar.f81273w = null;
    }

    private void i() {
        Runnable runnable;
        if (this.f81275y.f81384a) {
            if ((this.K || this.f81262l) && this.f81264n && (runnable = this.H) != null) {
                runnable.run();
                this.H = null;
            }
        }
    }

    private boolean j() {
        return (!this.f81259i || this.K || this.f81261k) ? false : true;
    }

    public final void a() {
        if (this.P != null || this.L <= 0) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.12
            @Override // java.lang.Runnable
            public final void run() {
                p pVar = p.this;
                pVar.f81260j = true;
                pVar.h();
            }
        };
        this.P = runnable;
        sg.bigo.ads.common.n.d.a(2, runnable, this.L);
    }

    public final void a(int i10, boolean z10) {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Notify mid page content view rendered.");
        this.J = true;
        this.f81267q = i10;
        this.f81266p = z10;
        if (this.f81262l) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Loading page is showing, turn to show mid page.");
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.14
                @Override // java.lang.Runnable
                public final void run() {
                    p.a(p.this);
                }
            });
        }
    }

    public final void a(long j10) {
        Runnable runnable = this.f81272v;
        this.N = SystemClock.elapsedRealtime();
        sg.bigo.ads.common.n.d.a(runnable);
        sg.bigo.ads.common.n.d.a(2, runnable, j10);
    }

    @UiThread
    public final void a(@NonNull final Context context, @NonNull final sg.bigo.ads.ad.b.b bVar, final sg.bigo.ads.api.core.b bVar2, @NonNull final FrameLayout frameLayout) {
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.22
            @Override // java.lang.Runnable
            public final void run() {
                p pVar = p.this;
                pVar.D = false;
                boolean zA = pVar.a(frameLayout);
                if (bVar2 instanceof sg.bigo.ads.core.a.a) {
                    p pVar2 = p.this;
                    if (pVar2.f81269s == 0) {
                        pVar2.f81269s = SystemClock.elapsedRealtime();
                        ((sg.bigo.ads.core.a.a) bVar2).b(p.this.f81269s);
                    }
                }
                sg.bigo.ads.api.core.b bVar3 = bVar2;
                p pVar3 = p.this;
                sg.bigo.ads.core.d.b.a(bVar3, "1", e.a(pVar3.f81267q, pVar3.f81266p), p.this.f81268r);
                Context context2 = context;
                if (context2 instanceof Activity) {
                    Activity activity = (Activity) context2;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        return;
                    }
                }
                AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setCancelable(!zA).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: sg.bigo.ads.ad.interstitial.p.22.1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        p pVar4 = p.this;
                        pVar4.f81261k = true;
                        pVar4.f81262l = false;
                    }
                }).create();
                alertDialogCreate.requestWindowFeature(1);
                alertDialogCreate.show();
                Window window = alertDialogCreate.getWindow();
                window.getDecorView().setPadding(0, 0, 0, 0);
                window.setGravity(17);
                window.setContentView(frameLayout);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                window.setAttributes(attributes);
                p.this.f81258h = alertDialogCreate;
                frameLayout.setVisibility(4);
                frameLayout.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.22.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass22 anonymousClass22 = AnonymousClass22.this;
                        int i10 = p.this.A.f81387b;
                        frameLayout.setVisibility(0);
                        if (i10 == 1) {
                            sg.bigo.ads.ad.interstitial.c.d(frameLayout);
                        } else {
                            sg.bigo.ads.ad.interstitial.c.a(frameLayout, 400L, new b.d());
                        }
                    }
                });
                p pVar4 = p.this;
                Runnable runnable2 = pVar4.f81255e;
                if (runnable2 != null) {
                    runnable2.run();
                    pVar4.f81255e = null;
                    pVar4.f81264n = true;
                }
            }
        };
        c cVar = this.C;
        if (cVar != null) {
            this.D = cVar.a(runnable);
        } else {
            runnable.run();
        }
    }

    public final boolean a(Context context, sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.core.b bVar2, sg.bigo.ads.api.a.m mVar) {
        String str;
        if (context == null) {
            str = "Invalid context.";
        } else if (bVar == null) {
            str = "Invalid native ad.";
        } else if (bVar2 == null) {
            str = "Invalid adData.";
        } else if (mVar == null) {
            str = "Invalid style config.";
        } else {
            if (!this.K) {
                return true;
            }
            str = "Mid page has been shown.";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", str);
        return false;
    }

    @UiThread
    public final boolean a(@NonNull FrameLayout frameLayout) {
        int iA;
        final View viewFindViewById = frameLayout.findViewById(R.id.bigo_ad_btn_cta);
        if (viewFindViewById != null && this.f81276z.f81358e) {
            sg.bigo.ads.ad.interstitial.c.e(viewFindViewById);
            a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.2
                @Override // java.lang.Runnable
                public final void run() {
                    viewFindViewById.clearAnimation();
                }
            });
        }
        final View viewFindViewById2 = frameLayout.findViewById(R.id.bigo_ad_btn_close);
        if (viewFindViewById2 == null) {
            return false;
        }
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.p.19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.this.e();
            }
        });
        sg.bigo.ads.api.a.m mVar = this.f81254d;
        if (mVar != null) {
            iA = mVar.a("mid_page.force_staying_time");
            if (iA < 0 || iA > 5) {
                iA = 3;
            }
        } else {
            iA = 0;
        }
        if (iA == 0) {
            viewFindViewById2.setVisibility(0);
            return true;
        }
        viewFindViewById2.setVisibility(4);
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.20
            @Override // java.lang.Runnable
            public final void run() {
                viewFindViewById2.setVisibility(0);
            }
        }, iA * 1000);
        return true;
    }

    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Disable mid page.");
        this.f81259i = false;
    }

    public final void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page resume.");
        sg.bigo.ads.api.a.m mVar = this.f81254d;
        boolean z10 = mVar != null && mVar.a("endpage.is_endpage", 1) == 0 && !this.f81254d.c("layer.is_show_layer") && -1 == this.E;
        if (this.f81263m && !z10) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Dismiss page after click.");
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.16
                @Override // java.lang.Runnable
                public final void run() {
                    p.this.f();
                }
            });
        } else {
            if (!this.O || this.f81271u <= 0 || this.f81272v == null) {
                return;
            }
            this.O = false;
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Resume show task for " + this.f81271u + " ms.");
            a(this.f81271u);
        }
    }

    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page pause.");
        Runnable runnable = this.f81272v;
        if (this.O || this.f81271u <= 0 || runnable == null) {
            return;
        }
        this.O = true;
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Pause show task.");
        sg.bigo.ads.common.n.d.a(runnable);
        this.f81271u -= SystemClock.elapsedRealtime() - this.N;
    }

    public final void e() {
        int i10 = this.A.f81387b;
        final FrameLayout frameLayout = this.f81262l ? this.f81257g : this.f81256f;
        if (frameLayout == null) {
            f();
            return;
        }
        b.d dVar = new b.d() { // from class: sg.bigo.ads.ad.interstitial.p.17
            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                frameLayout.clearAnimation();
                frameLayout.setVisibility(8);
                p.this.f();
            }
        };
        if (i10 == 1) {
            sg.bigo.ads.ad.interstitial.c.c(frameLayout, dVar);
        } else {
            sg.bigo.ads.ad.interstitial.c.b(frameLayout, dVar);
        }
    }

    public final void f() {
        if (this.f81258h != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Dismiss mid page.");
            this.f81258h.dismiss();
            this.f81258h = null;
            g();
            i();
        }
        h();
    }

    public final void g() {
        Runnable runnable;
        if (!this.f81264n || (runnable = this.G) == null) {
            return;
        }
        runnable.run();
        this.f81255e = null;
    }

    public final void h() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page clean unused resource.");
        Iterator<Runnable> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.Q.clear();
        Runnable runnable = this.f81272v;
        if (runnable != null) {
            sg.bigo.ads.common.n.d.a(runnable);
        }
        Runnable runnable2 = this.P;
        if (runnable2 != null) {
            sg.bigo.ads.common.n.d.a(runnable2);
        }
        this.f81272v = null;
        this.f81273w = null;
        this.f81261k = true;
        this.f81256f = null;
    }
}
