package l2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.ActivityChooserModel;
import bo.d0;
import com.facebook.appevents.x;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.unified.UnifiedMediationParams;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s2.g;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: MetadataViewObserver.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\"B\u0011\b\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Ll2/f;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Landroid/view/View;", "oldView", "newView", "Lbn/r;", "onGlobalFocusChanged", "h", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "d", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/Runnable;", "runnable", "g", "", "", "b", "Ljava/util/Set;", "processedText", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "<init>", "(Landroid/app/Activity;)V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Map<Integer, f> f73634g = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<String> processedText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WeakReference<Activity> activityWeakReference;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean isTracking;

    /* JADX INFO: renamed from: l2.f$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MetadataViewObserver.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J,\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Ll2/f$a;", "", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lbn/r;", "e", "", "key", "value", "c", "", "userData", "d", "", "MAX_TEXT_LENGTH", "I", "Ll2/f;", "observers", "Ljava/util/Map;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final String c(String key, String value) {
            return p.f(UnifiedMediationParams.KEY_R2, key) ? new Regex("[^\\d.]").replace(value, "") : value;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 2
                r3 = 0
                switch(r0) {
                    case 3585: goto L5c;
                    case 3586: goto L45;
                    case 3587: goto L3c;
                    case 3588: goto Lc;
                    default: goto La;
                }
            La:
                goto L82
            Lc:
                java.lang.String r0 = "r6"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L16
                goto L82
            L16:
                java.lang.String r0 = "-"
                boolean r1 = bo.d0.c0(r8, r0, r3, r2, r1)
                if (r1 == 0) goto L82
                kotlin.text.Regex r1 = new kotlin.text.Regex
                r1.<init>(r0)
                java.util.List r8 = r1.split(r8, r3)
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r8 = r8.toArray(r0)
                if (r8 == 0) goto L34
                java.lang.String[] r8 = (java.lang.String[]) r8
                r8 = r8[r3]
                goto L82
            L34:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T>"
                r6.<init>(r7)
                throw r6
            L3c:
                java.lang.String r0 = "r5"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L4e
                goto L82
            L45:
                java.lang.String r0 = "r4"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L4e
                goto L82
            L4e:
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = "[^a-z]+"
                r0.<init>(r1)
                java.lang.String r1 = ""
                java.lang.String r8 = r0.replace(r8, r1)
                goto L82
            L5c:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L65
                goto L82
            L65:
                java.lang.String r0 = "m"
                boolean r4 = bo.a0.W(r8, r0, r3, r2, r1)
                if (r4 != 0) goto L81
                java.lang.String r4 = "b"
                boolean r4 = bo.a0.W(r8, r4, r3, r2, r1)
                if (r4 != 0) goto L81
                java.lang.String r4 = "ge"
                boolean r8 = bo.a0.W(r8, r4, r3, r2, r1)
                if (r8 == 0) goto L7e
                goto L81
            L7e:
                java.lang.String r8 = "f"
                goto L82
            L81:
                r8 = r0
            L82:
                r6.put(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.f.Companion.d(java.util.Map, java.lang.String, java.lang.String):void");
        }

        @UiThread
        public final void e(@NotNull Activity activity) {
            p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            int iHashCode = activity.hashCode();
            Map mapB = f.b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object fVar = mapB.get(numValueOf);
            if (fVar == null) {
                fVar = new f(activity, null);
                mapB.put(numValueOf, fVar);
            }
            f.c((f) fVar);
        }
    }

    public f(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }

    public /* synthetic */ f(Activity activity, i iVar) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (c3.a.d(f.class)) {
            return null;
        }
        try {
            return f73634g;
        } catch (Throwable th2) {
            c3.a.b(th2, f.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(f fVar) {
        if (c3.a.d(f.class)) {
            return;
        }
        try {
            fVar.h();
        } catch (Throwable th2) {
            c3.a.b(th2, f.class);
        }
    }

    public static final void e(View view, f fVar) {
        if (c3.a.d(f.class)) {
            return;
        }
        try {
            p.k(view, "$view");
            p.k(fVar, "this$0");
            if (view instanceof EditText) {
                fVar.f(view);
            }
        } catch (Throwable th2) {
            c3.a.b(th2, f.class);
        }
    }

    public final void d(final View view) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            g(new Runnable() { // from class: l2.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.e(view, this);
                }
            });
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void f(View view) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            String string = ((EditText) view).getText().toString();
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String string2 = d0.s1(string).toString();
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = string2.toLowerCase();
            p.j(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!(lowerCase.length() == 0) && !this.processedText.contains(lowerCase) && lowerCase.length() <= 100) {
                this.processedText.add(lowerCase);
                HashMap map = new HashMap();
                List<String> listB = c.b(view);
                List<String> listA = null;
                for (d dVar : d.INSTANCE.c()) {
                    Companion companion = INSTANCE;
                    String strC = companion.c(dVar.c(), lowerCase);
                    if (dVar.d().length() > 0) {
                        c cVar = c.f73625a;
                        if (!c.f(strC, dVar.d())) {
                        }
                    }
                    c cVar2 = c.f73625a;
                    if (c.e(listB, dVar.b())) {
                        companion.d(map, dVar.c(), strC);
                    } else {
                        if (listA == null) {
                            listA = c.a(view);
                        }
                        if (c.e(listA, dVar.b())) {
                            companion.d(map, dVar.c(), strC);
                        }
                    }
                }
                x.INSTANCE.e(map);
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void g(Runnable runnable) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void h() {
        if (c3.a.d(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(true)) {
                return;
            }
            g gVar = g.f79018a;
            View viewE = g.e(this.activityWeakReference.get());
            if (viewE == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View view, @Nullable View view2) {
        if (c3.a.d(this)) {
            return;
        }
        if (view != null) {
            try {
                d(view);
            } catch (Throwable th2) {
                c3.a.b(th2, this);
                return;
            }
        }
        if (view2 != null) {
            d(view2);
        }
    }
}
