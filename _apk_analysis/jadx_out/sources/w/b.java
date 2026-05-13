package w;

import a6.k0;
import android.app.Activity;
import android.media.AudioManager;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import chuangyuan.ycj.videolibrary.R$color;
import e4.u0;
import java.lang.ref.WeakReference;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import t.f;
import t.g;
import t.h;
import t.i;
import t.j;

/* JADX INFO: compiled from: GestureModule.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements t.a, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f86234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86235b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioManager f86241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GestureDetector f86242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86243j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Formatter f86245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f86246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f86247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f86248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f86249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w.a f86250q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f86236c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86237d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f86238e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f86239f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f86240g = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public StringBuilder f86244k = new StringBuilder();

    /* JADX INFO: renamed from: w.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GestureModule.java */
    public class C1085b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f86251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f86252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f86253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public WeakReference<b> f86254e;

        public C1085b(b bVar) {
            this.f86254e = new WeakReference<>(bVar);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f86251b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            if (b.this.f86250q == null || !b.this.f86250q.H()) {
                return;
            }
            b.this.f86240g = true;
            b bVar = b.this;
            bVar.f86239f = bVar.f86250q.D().P().f60187a;
            b.this.P();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (!b.this.f86240g) {
                WeakReference<b> weakReference = this.f86254e;
                if (weakReference == null || weakReference.get() == null) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY() - motionEvent2.getY();
                float x11 = x10 - motionEvent2.getX();
                if (this.f86251b) {
                    this.f86253d = Math.abs(f10) >= Math.abs(f11);
                    this.f86252c = x10 > ((float) b.this.f86243j) * 0.5f;
                    this.f86251b = false;
                }
                if (this.f86253d) {
                    boolean z10 = motionEvent.getX() <= motionEvent2.getX();
                    long jZ = b.this.f86250q.z();
                    long jA = b.this.f86250q.A();
                    long j10 = (int) (jZ + ((((-x11) / 5.0f) * jA) / b.this.f86243j));
                    long j11 = j10 > jA ? jA : j10 <= 0 ? 0L : j10;
                    b bVar = b.this;
                    bVar.Q(z10, j11, jA, k0.V(bVar.f86244k, b.this.f86245l, j11), k0.V(b.this.f86244k, b.this.f86245l, jA));
                } else {
                    float fD = y10 / v.e.d(b.this.f86234a);
                    if (this.f86252c) {
                        b.this.R(fD);
                    } else {
                        b.this.O(fD);
                    }
                }
            }
            return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
    }

    public b(@NonNull Activity activity, @NonNull w.a aVar) {
        this.f86250q = aVar;
        this.f86234a = activity;
        N(activity, -1);
        this.f86245l = new Formatter(this.f86244k, Locale.getDefault());
        AudioManager audioManager = (AudioManager) activity.getSystemService("audio");
        this.f86241h = audioManager;
        this.f86235b = audioManager.getStreamMaxVolume(3);
        this.f86243j = activity.getResources().getDisplayMetrics().heightPixels;
        this.f86242i = new GestureDetector(activity, new C1085b(this));
    }

    public static void N(Activity activity, int i10) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if (i10 == -1) {
            attributes.screenBrightness = -1.0f;
        } else {
            if (i10 < 10) {
                i10 = 10;
            }
            attributes.screenBrightness = Float.valueOf(i10 / 255.0f).floatValue();
            Settings.System.putInt(activity.getContentResolver(), "screen_brightness", i10);
        }
        activity.getWindow().setAttributes(attributes);
    }

    public final void I() {
        this.f86237d = -1;
        this.f86236c = -1.0f;
        this.f86240g = false;
        long j10 = this.f86238e;
        if (j10 >= 0) {
            i iVar = this.f86246m;
            if (iVar != null) {
                iVar.b(j10);
                this.f86238e = -1L;
            } else {
                this.f86250q.V(j10);
                this.f86238e = -1L;
            }
        }
        if (this.f86249p != null) {
            float f10 = this.f86239f;
            if (f10 > 0.0f) {
                this.f86250q.a0(f10, 1.0f);
                this.f86239f = 0.0f;
            }
        }
        Iterator<t.d> it = this.f86250q.E().iterator();
        while (it.hasNext()) {
            it.next().j(8);
        }
    }

    public void J(g gVar) {
        this.f86247n = gVar;
    }

    public void K(h hVar) {
        this.f86249p = hVar;
    }

    public void L(i iVar) {
        this.f86246m = iVar;
    }

    public void M(j jVar) {
        this.f86248o = jVar;
    }

    public final synchronized void O(float f10) {
        if (this.f86236c < 0.0f) {
            float f11 = this.f86234a.getWindow().getAttributes().screenBrightness;
            this.f86236c = f11;
            if (f11 <= 0.0f) {
                this.f86236c = 0.5f;
            } else if (f11 < 0.01f) {
                this.f86236c = 0.01f;
            }
        }
        WindowManager.LayoutParams attributes = this.f86234a.getWindow().getAttributes();
        float f12 = this.f86236c + f10;
        attributes.screenBrightness = f12;
        if (f12 > 1.0d) {
            attributes.screenBrightness = 1.0f;
        } else if (f12 < 0.01f) {
            attributes.screenBrightness = 0.01f;
        }
        this.f86234a.getWindow().setAttributes(attributes);
        g gVar = this.f86247n;
        if (gVar != null) {
            gVar.b(100, (int) (attributes.screenBrightness * 100.0f));
        } else {
            Iterator<t.d> it = this.f86250q.E().iterator();
            while (it.hasNext()) {
                it.next().b(100, (int) (attributes.screenBrightness * 100.0f));
            }
        }
    }

    public final void P() {
        h hVar = this.f86249p;
        if (hVar != null) {
            hVar.a(2);
            return;
        }
        Iterator<t.d> it = this.f86250q.E().iterator();
        while (it.hasNext()) {
            it.next().h(2);
        }
    }

    public final void Q(boolean z10, long j10, long j11, String str, String str2) {
        this.f86238e = j10;
        i iVar = this.f86246m;
        if (iVar != null) {
            iVar.a(j10, j11, str, str2);
            return;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(this.f86234a, R$color.simple_exo_style_color));
        SpannableString spannableString = new SpannableString(str + "/" + str2);
        spannableString.setSpan(foregroundColorSpan, 0, str.length(), 33);
        Iterator<t.d> it = this.f86250q.E().iterator();
        while (it.hasNext()) {
            it.next().o(z10, spannableString);
        }
    }

    public final void R(float f10) {
        int i10 = 0;
        if (this.f86237d == -1) {
            int streamVolume = this.f86241h.getStreamVolume(3);
            this.f86237d = streamVolume;
            if (streamVolume < 0) {
                this.f86237d = 0;
            }
        }
        int i11 = this.f86235b;
        int i12 = ((int) (f10 * i11 * 6.0f)) + (this.f86237d * 6);
        if (i12 > i11 * 6) {
            i10 = i11 * 6;
        } else if (i12 >= 0) {
            i10 = i12;
        }
        this.f86241h.setStreamVolume(3, i10 / 6, 4);
        j jVar = this.f86248o;
        if (jVar != null) {
            jVar.a(this.f86235b * 6, i10);
            return;
        }
        Iterator<t.d> it = this.f86250q.E().iterator();
        while (it.hasNext()) {
            it.next().a(this.f86235b * 6, i10);
        }
    }

    @Override // t.a
    public void onDestroy() {
        this.f86241h = null;
        this.f86244k = null;
        Formatter formatter = this.f86245l;
        if (formatter != null) {
            formatter.close();
        }
        this.f86245l = null;
        this.f86247n = null;
        this.f86246m = null;
        this.f86248o = null;
        this.f86249p = null;
    }

    @Override // t.f
    public void onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f86242i;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
    }

    @Override // t.f
    public void q() {
        I();
    }

    @Override // t.a
    public void r(u0 u0Var) {
    }
}
