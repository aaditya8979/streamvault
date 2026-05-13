package sg.bigo.ads.ad.splash.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Iterator;
import sg.bigo.ads.R;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static float f81644l = 20.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private sg.bigo.ads.common.q.b f81645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f81646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f81647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f81648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f81649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float[] f81650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f81651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f81652t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View.OnTouchListener f81653u;

    public d(sg.bigo.ads.api.core.f fVar, @NonNull m mVar, m mVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        super(fVar, mVar, mVar2, bVar);
        this.f81646n = true;
        this.f81647o = 0.0f;
        this.f81648p = 0.0f;
        this.f81649q = -1.0f;
        this.f81650r = new float[]{-1.0f, -1.0f, -1.0f};
        this.f81651s = 0L;
        this.f81653u = new View.OnTouchListener() { // from class: sg.bigo.ads.ad.splash.a.d.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    sg.bigo.ads.common.t.a.a(0, 3, "splashSlide", "down...");
                    d.this.f81647o = motionEvent.getX();
                    d.this.f81648p = motionEvent.getY();
                    return true;
                }
                if (action == 1) {
                    int iA = d.a(Math.round(d.this.f81647o), Math.round(d.this.f81648p), Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
                    sg.bigo.ads.common.t.a.a(0, 3, "splashSlide", "up...".concat(String.valueOf(iA)));
                    if (iA > 30) {
                        d.c(d.this);
                        return true;
                    }
                }
                return false;
            }
        };
    }

    public static /* synthetic */ float a(int i10) {
        if (i10 != 4) {
            return (i10 == 9 || i10 == 1) ? 4.0f : 20.0f;
        }
        return 20.0f;
    }

    public static /* synthetic */ int a(int i10, int i11, int i12, int i13) {
        return Math.max(Math.abs(i10 - i12), Math.abs(i11 - i13));
    }

    public static /* synthetic */ void c(d dVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - dVar.f81651s;
        if (!dVar.f81646n || j10 <= 2000) {
            return;
        }
        dVar.f81651s = jElapsedRealtime;
        dVar.f81610h.f81733z.a((sg.bigo.ads.common.i) null, 8, 22);
    }

    private int l() {
        return sg.bigo.ads.ad.splash.a.b(this.f81604b) ? R.layout.bigo_ad_splash_style_halfscreen_interaction : R.layout.bigo_ad_splash_style_fullscreen_interaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int m() {
        m mVar = this.f81605c;
        if (mVar == null) {
            return 0;
        }
        return mVar.a("video_play_page.interactive_method", 0);
    }

    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10) {
        super.a(z10);
        this.f81646n = z10;
    }

    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10, @NonNull ViewGroup viewGroup, int i10) {
        super.a(z10, viewGroup, i10);
        if (!z10 || this.f81652t) {
            return;
        }
        sg.bigo.ads.ad.splash.a.f81560a = true;
        this.f81652t = true;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_fl_interaction_container);
        int i11 = R.layout.bigo_ad_item_interaction_vertical;
        if (this.f81610h.getStyle() == SplashAd.Style.HORIZONTAL) {
            i11 = R.layout.bigo_ad_item_interaction_horizontal;
        }
        if (viewGroup2 != null) {
            View viewA = sg.bigo.ads.common.utils.a.a(viewGroup2.getContext(), i11, viewGroup2, false);
            viewGroup2.removeAllViews();
            viewGroup2.addView(viewA);
            ImageView imageView = (ImageView) viewA.findViewById(R.id.inter_iv_interaction_arrow);
            ImageView imageView2 = (ImageView) viewA.findViewById(R.id.inter_iv_interaction_phone);
            TextView textView = (TextView) viewA.findViewById(R.id.inter_tv_interaction_type);
            if (imageView != null && imageView2 != null && textView != null) {
                int iM = m();
                int i12 = R.drawable.bigo_ad_interaction_shake_arrow;
                int i13 = R.drawable.bigo_ad_interaction_shake_phone;
                String string = viewA.getContext().getString(R.string.bigo_ad_interaction_shake);
                if (iM != 1) {
                    if (iM == 2) {
                        i13 = R.drawable.bigo_ad_interaction_slide_hand;
                        i12 = R.drawable.bigo_ad_interaction_slide_line;
                        string = viewA.getContext().getString(R.string.bigo_ad_interaction_slide);
                    } else if (iM == 3) {
                        i12 = R.drawable.bigo_ad_interaction_twist_arrow;
                        string = viewA.getContext().getString(R.string.bigo_ad_interaction_twist);
                        i13 = sg.bigo.ads.ad.splash.a.b() ? R.drawable.bigo_ad_interaction_twist_landscape_phone : R.drawable.bigo_ad_interaction_twist_phone;
                    }
                } else if (sg.bigo.ads.ad.splash.a.b()) {
                    i13 = R.drawable.bigo_ad_interaction_shake_landscape_phone;
                }
                imageView.setImageResource(i12);
                imageView2.setImageResource(i13);
                textView.setText(string);
                if (iM == 1) {
                    sg.bigo.ads.ad.splash.a.b(imageView2);
                } else if (iM == 2) {
                    imageView2.setTranslationY(sg.bigo.ads.common.utils.e.a(imageView2.getContext(), 60));
                    sg.bigo.ads.ad.splash.a.a(imageView2, imageView2.getTranslationY());
                } else if (iM == 3) {
                    sg.bigo.ads.ad.splash.a.a(imageView2);
                }
            }
        }
        View viewFindViewById = viewGroup.findViewById(R.id.bigo_ad_splash_media);
        if (2 == m()) {
            if (viewFindViewById != null) {
                viewFindViewById.setOnTouchListener(this.f81653u);
            }
            if (viewGroup2 != null) {
                viewGroup2.setOnTouchListener(this.f81653u);
            }
        }
        Context context = viewGroup.getContext();
        int iM2 = m();
        int iIntValue = 4;
        if (this.f81645m == null && context != null && (1 == iM2 || 3 == iM2)) {
            this.f81645m = new sg.bigo.ads.common.q.b(context, Arrays.asList(4, 9, 1), new sg.bigo.ads.common.q.a() { // from class: sg.bigo.ads.ad.splash.a.d.2
                @Override // sg.bigo.ads.common.q.a
                public final void a(int i14, @NonNull float[] fArr, @NonNull float[] fArr2) {
                    char c10;
                    if (i14 == 4) {
                        c10 = 2;
                        fArr = fArr2;
                    } else {
                        c10 = 0;
                    }
                    if (fArr.length == 3) {
                        int iM3 = d.this.m();
                        if (iM3 != 1) {
                            if (iM3 != 3) {
                                return;
                            }
                            float f10 = fArr[c10];
                            if (-1.0f == d.this.f81650r[c10]) {
                                d.this.f81650r[c10] = f10;
                            }
                            if (Math.abs(f10 - d.this.f81650r[c10]) > d.a(i14)) {
                                d.this.f81650r[c10] = f10;
                                d.c(d.this);
                                return;
                            }
                            return;
                        }
                        for (int i15 = 0; i15 < fArr.length; i15++) {
                            float f11 = fArr[i15];
                            if (-1.0f == d.this.f81650r[i15]) {
                                d.this.f81650r[i15] = f11;
                            }
                            if (Math.abs(f11 - d.this.f81650r[i15]) > d.a(i14)) {
                                d.this.f81650r[i15] = f11;
                                d.c(d.this);
                                return;
                            }
                        }
                    }
                }
            });
        }
        sg.bigo.ads.common.q.b bVar = this.f81645m;
        if (bVar != null) {
            try {
                bVar.f82373c = (SensorManager) bVar.f82371a.get().getApplicationContext().getSystemService("sensor");
                Sensor defaultSensor = null;
                Iterator<Integer> it = bVar.f82376f.iterator();
                while (it.hasNext() && (defaultSensor = bVar.f82373c.getDefaultSensor((iIntValue = it.next().intValue()))) == null) {
                }
                bVar.f82373c.registerListener(bVar.f82377g, defaultSensor, iIntValue);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void c() {
        super.c();
        sg.bigo.ads.common.q.b bVar = this.f81645m;
        if (bVar != null) {
            SensorManager sensorManager = bVar.f82373c;
            if (sensorManager != null) {
                sensorManager.unregisterListener(bVar.f82377g);
                bVar.f82377g = null;
                bVar.f82373c = null;
            }
            bVar.f82372b = null;
            this.f81645m = null;
        }
        this.f81653u = null;
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final int e() {
        if (this.f81605c != null && f()) {
            return sg.bigo.ads.ad.splash.a.b(this.f81604b) ? R.layout.bigo_ad_splash_style_halfscreen_interaction : R.layout.bigo_ad_splash_style_fullscreen_interaction_immersive;
        }
        return l();
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final boolean g() {
        return false;
    }
}
