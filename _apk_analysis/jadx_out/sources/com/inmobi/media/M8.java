package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.M8;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class M8 implements Gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f25937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C f25938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3702r7 f25939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f25940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Q5 f25941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Df f25942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f25943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3580m9 f25944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L8 f25945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final K8 f25946j;

    public M8(InMobiAdActivity inMobiAdActivity) {
        tn.p.k(inMobiAdActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f25937a = new WeakReference(inMobiAdActivity);
        this.f25942f = Ef.a(J5.g());
        this.f25943g = 1.0f;
        this.f25945i = new L8(this);
        this.f25946j = new K8(this);
    }

    public static final void a(M8 m82) {
        m82.f25943g = 1.0f;
        C3702r7 c3702r7 = m82.f25939c;
        if (c3702r7 != null) {
            c3702r7.f28038c = 1.0f;
            c3702r7.c();
        }
        Q5 q52 = m82.f25941e;
        if (q52 != null) {
            q52.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        m82.c();
    }

    public static final void a(Q5 q52) {
        q52.getParent().requestLayout();
    }

    public final void a() {
        Activity activity = (Activity) this.f25937a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void a(int i10, int i11) {
        RelativeLayout.LayoutParams layoutParams;
        Activity activity = (Activity) this.f25937a.get();
        if (activity == null) {
            return;
        }
        Ef.b(this.f25942f);
        if (Ef.b(this.f25942f)) {
            layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            layoutParams.addRule(11);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            layoutParams.addRule(12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(R.id.content)).findViewById(65519);
        tn.p.h(relativeLayout);
        if (((RelativeLayout) relativeLayout.findViewById(65518)) != null) {
            Q5 q52 = this.f25941e;
            if (q52 != null) {
                q52.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        Q5 q53 = this.f25941e;
        if (q53 != null) {
            relativeLayout.addView(q53, layoutParams);
        }
    }

    public final void a(Intent intent, SparseArray sparseArray) {
        Q5 q52;
        Window window;
        tn.p.k(intent, "intent");
        tn.p.k(sparseArray, "adContainers");
        if (!intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            Activity activity = (Activity) this.f25937a.get();
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).a();
                return;
            }
            return;
        }
        C c10 = (C) sparseArray.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
        if (c10 == null) {
            Activity activity2 = (Activity) this.f25937a.get();
            if (activity2 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity2).a();
                return;
            }
            return;
        }
        int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
        if (intExtra == 0) {
            B fullScreenEventsListener = ((GestureDetectorOnGestureListenerC3337ci) c10).getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                ((Vh) fullScreenEventsListener).a();
            }
            Activity activity3 = (Activity) this.f25937a.get();
            if (activity3 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity3).a();
                return;
            }
            return;
        }
        if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.f25937a.get() instanceof InMobiAdActivity)) {
            Object obj = this.f25937a.get();
            tn.p.i(obj, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            if (!((InMobiAdActivity) obj).f25121g) {
                Object obj2 = this.f25937a.get();
                tn.p.i(obj2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) obj2).f25121g = true;
                if (!(c10 instanceof GestureDetectorOnGestureListenerC3337ci) ? false : ((GestureDetectorOnGestureListenerC3337ci) c10).W0) {
                    InterfaceC3580m9 interfaceC3580m9 = this.f25944h;
                    if (interfaceC3580m9 != null) {
                        ((C3605n9) interfaceC3580m9).a("InMobiActivityViewHandler", "showInImmersiveMode");
                    }
                    Object obj3 = this.f25937a.get();
                    InMobiAdActivity inMobiAdActivity = obj3 instanceof InMobiAdActivity ? (InMobiAdActivity) obj3 : null;
                    if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                        C3850x5.f28483a.getClass();
                        if (C3850x5.r()) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.layoutInDisplayCutoutMode = 3;
                            window.setAttributes(attributes);
                            WindowCompat.setDecorFitsSystemWindows(window, false);
                        } else if (C3850x5.p()) {
                            WindowManager.LayoutParams attributes2 = window.getAttributes();
                            attributes2.layoutInDisplayCutoutMode = 1;
                            window.setAttributes(attributes2);
                            WindowCompat.setDecorFitsSystemWindows(window, false);
                        }
                        if (C3850x5.r()) {
                            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
                            tn.p.j(insetsController, "getInsetsController(...)");
                            insetsController.setSystemBarsBehavior(2);
                            insetsController.hide(WindowInsetsCompat.Type.systemBars());
                            insetsController.hide(WindowInsetsCompat.Type.displayCutout());
                        } else if (C3850x5.u()) {
                            window.getDecorView().setSystemUiVisibility(5638);
                        }
                    }
                } else {
                    Activity activity4 = (Activity) this.f25937a.get();
                    if (activity4 != null) {
                        tn.p.k(activity4, "<this>");
                        try {
                            activity4.requestWindowFeature(1);
                            activity4.getWindow().setFlags(1024, 1024);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if ((200 == intExtra && !tn.p.f(CreativeInfo.f52467al, ((GestureDetectorOnGestureListenerC3337ci) c10).getMarkupType())) || ((202 == intExtra && !tn.p.f("htmlUrl", ((GestureDetectorOnGestureListenerC3337ci) c10).getMarkupType())) || (201 == intExtra && !tn.p.f("inmobiJson", ((GestureDetectorOnGestureListenerC3337ci) c10).getMarkupType())))) {
            B fullScreenEventsListener2 = ((GestureDetectorOnGestureListenerC3337ci) c10).getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                ((Vh) fullScreenEventsListener2).a();
            }
            Activity activity5 = (Activity) this.f25937a.get();
            if (activity5 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity5).a();
                return;
            }
            return;
        }
        try {
            this.f25938b = c10;
            ((GestureDetectorOnGestureListenerC3337ci) c10).setFullScreenActivityContext((Activity) this.f25937a.get());
            a();
            Activity activity6 = (Activity) this.f25937a.get();
            if (activity6 != null) {
                RelativeLayout relativeLayout = new RelativeLayout(activity6);
                relativeLayout.setId(65534);
                this.f25940d = relativeLayout;
            }
            a(c10);
            C3702r7 c3702r7 = this.f25939c;
            if (c3702r7 != null) {
                c3702r7.d();
            }
            Activity activity7 = (Activity) this.f25937a.get();
            if (activity7 != null) {
                FrameLayout frameLayout = (FrameLayout) activity7.findViewById(R.id.content);
                RelativeLayout relativeLayout2 = frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null;
                RelativeLayout relativeLayout3 = this.f25940d;
                if (relativeLayout3 != null && relativeLayout2 != null) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout2.findViewById(65534);
                    if (relativeLayout4 != null) {
                        relativeLayout2.removeView(relativeLayout4);
                    }
                    relativeLayout2.addView(relativeLayout3);
                    C3702r7 c3702r72 = this.f25939c;
                    if (c3702r72 != null) {
                        c3702r72.c();
                    }
                }
            }
            if (c10 instanceof GestureDetectorOnGestureListenerC3337ci) {
                ((GestureDetectorOnGestureListenerC3337ci) c10).setEmbeddedBrowserJsCallbacks(this.f25946j);
            }
            if (!(c10 instanceof GestureDetectorOnGestureListenerC3337ci) || (q52 = this.f25941e) == null) {
                return;
            }
            q52.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3337ci) c10).getListener());
        } catch (Exception e10) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) c10;
            gestureDetectorOnGestureListenerC3337ci.setFullScreenActivityContext(null);
            B fullScreenEventsListener3 = gestureDetectorOnGestureListenerC3337ci.getFullScreenEventsListener();
            if (fullScreenEventsListener3 != null) {
                ((Vh) fullScreenEventsListener3).a();
            }
            Activity activity8 = (Activity) this.f25937a.get();
            if (activity8 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity8).a();
            }
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    public final void a(C c10) {
        RelativeLayout relativeLayout;
        if (((Activity) this.f25937a.get()) == null || (relativeLayout = this.f25940d) == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) c10;
        String markupType = gestureDetectorOnGestureListenerC3337ci.getMarkupType();
        if (!tn.p.f(markupType, CreativeInfo.f52467al) && !tn.p.f(markupType, "htmlUrl")) {
            throw new IllegalArgumentException("InMobiActivityViewHandler: Unknown Markup type");
        }
        C3702r7 c3702r7 = new C3702r7(this.f25937a, gestureDetectorOnGestureListenerC3337ci, relativeLayout);
        this.f25939c = c3702r7;
        c3702r7.a(this.f25942f);
        c3702r7.f28038c = this.f25943g;
        c3702r7.f28039d = gestureDetectorOnGestureListenerC3337ci.W0;
    }

    @Override // com.inmobi.media.Gf
    public final void a(Df df2) {
        tn.p.k(df2, "orientation");
        if (((Activity) this.f25937a.get()) == null) {
            return;
        }
        C3702r7 c3702r7 = this.f25939c;
        if (c3702r7 != null) {
            c3702r7.a(df2);
        }
        Df df3 = this.f25942f;
        if (df3 == df2 || Ef.b(df3) == Ef.b(df2)) {
            b(df2);
            return;
        }
        b(df2);
        C3702r7 c3702r72 = this.f25939c;
        if (c3702r72 != null) {
            c3702r72.c();
        }
        b();
    }

    public final void a(JSONObject jSONObject) {
        tn.p.k(jSONObject, "jsonObject");
        C c10 = this.f25938b;
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = c10 instanceof GestureDetectorOnGestureListenerC3337ci ? (GestureDetectorOnGestureListenerC3337ci) c10 : null;
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.c(jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r5 = this;
            com.inmobi.media.Q5 r0 = r5.f25941e
            if (r0 != 0) goto L5
            return
        L5:
            com.inmobi.media.C r0 = r5.f25938b
            r1 = 1
            if (r0 == 0) goto L2b
            boolean r2 = r0 instanceof com.inmobi.media.GestureDetectorOnGestureListenerC3337ci
            if (r2 != 0) goto L10
            r0 = 0
            goto L14
        L10:
            com.inmobi.media.ci r0 = (com.inmobi.media.GestureDetectorOnGestureListenerC3337ci) r0
            boolean r0 = r0.W0
        L14:
            if (r0 != 0) goto L26
            java.lang.ref.WeakReference r0 = r5.f25937a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L2b
            boolean r0 = com.inmobi.media.F3.a(r0)
            if (r0 != r1) goto L2b
        L26:
            com.inmobi.media.L5 r0 = com.inmobi.media.J5.h()
            goto L2f
        L2b:
            com.inmobi.media.L5 r0 = com.inmobi.media.J5.d()
        L2f:
            int r2 = r0.f25855a
            float r2 = (float) r2
            float r3 = r0.f25857c
            float r2 = r2 * r3
            int r0 = r0.f25856b
            float r0 = (float) r0
            float r0 = r0 * r3
            com.inmobi.media.Df r3 = r5.f25942f
            boolean r3 = com.inmobi.media.Ef.b(r3)
            r4 = -1
            if (r3 == 0) goto L4f
            float r0 = (float) r1
            float r1 = r5.f25943g
            float r0 = r0 - r1
            float r0 = r0 * r2
            int r0 = vn.c.d(r0)
            r5.a(r0, r4)
            return
        L4f:
            float r1 = (float) r1
            float r2 = r5.f25943g
            float r1 = r1 - r2
            float r1 = r1 * r0
            int r0 = vn.c.d(r1)
            r5.a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.M8.b():void");
    }

    public final void b(Df df2) {
        Objects.toString(df2);
        this.f25942f = df2;
    }

    public final void c() {
        try {
            final Q5 q52 = this.f25941e;
            if (q52 != null) {
                ViewParent parent = q52.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(q52);
                }
                ViewParent parent2 = q52.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.post(new Runnable() { // from class: n9.n3
                        @Override // java.lang.Runnable
                        public final void run() {
                            M8.a(q52);
                        }
                    });
                }
            }
            Q5 q53 = this.f25941e;
            if (q53 != null) {
                V5 v52 = q53.f26165c;
                if (v52 != null) {
                    v52.destroy();
                }
                q53.f26165c = null;
                q53.f26166d = null;
                q53.f26167e = null;
                xo xoVar = q53.f26169g;
                if (xoVar != null) {
                    xoVar.a();
                }
                q53.removeAllViews();
            }
            this.f25941e = null;
            GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
            a(Mh.a("IN_CUSTOM_EXPAND", "onClose"));
        } catch (Exception unused) {
        }
    }
}
