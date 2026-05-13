package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.media.Q5;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Q5 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f26163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V5 f26165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T5 f26166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC3288al f26167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC3580m9 f26168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public xo f26169g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5(Activity activity) {
        super(activity);
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f26163a = activity;
        this.f26164b = -1;
    }

    public static final bn.r a(Q5 q52, JSONObject jSONObject) {
        tn.p.k(jSONObject, "jsonObject");
        T5 t52 = q52.f26166d;
        if (t52 != null) {
            tn.p.k(jSONObject, "jsonObject");
            C c10 = ((L8) t52).f25860a.f25938b;
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = c10 instanceof GestureDetectorOnGestureListenerC3337ci ? (GestureDetectorOnGestureListenerC3337ci) c10 : null;
            if (gestureDetectorOnGestureListenerC3337ci != null) {
                gestureDetectorOnGestureListenerC3337ci.c(jSONObject);
            }
        }
        return bn.r.f5635a;
    }

    public static final boolean a(Q5 q52, View view, MotionEvent motionEvent) {
        V5 v52 = q52.f26165c;
        if (v52 == null) {
            T5 t52 = q52.f26166d;
            if (t52 != null) {
                M8.a(((L8) t52).f25860a);
            }
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        if (v52.canGoBack()) {
            v52.goBack();
        } else {
            T5 t53 = q52.f26166d;
            if (t53 != null) {
                M8.a(((L8) t53).f25860a);
            }
        }
        return true;
    }

    public static final boolean b(Q5 q52, View view, MotionEvent motionEvent) {
        U5 u52;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        V5 v52 = q52.f26165c;
        if (v52 != null && (u52 = v52.f26477h) != null) {
            U5.a(u52, 5, true, null, 12);
        }
        T5 t52 = q52.f26166d;
        if (t52 != null) {
            M8.a(((L8) t52).f25860a);
        }
        return true;
    }

    public static final boolean c(Q5 q52, View view, MotionEvent motionEvent) {
        V5 v52 = q52.f26165c;
        if (v52 == null) {
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        if (v52.canGoForward()) {
            v52.goForward();
        }
        return true;
    }

    public static final boolean d(Q5 q52, View view, MotionEvent motionEvent) {
        U5 u52;
        U5 u53;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        V5 v52 = q52.f26165c;
        if (v52 != null && (u53 = v52.f26477h) != null) {
            U5.a(u53, 6, true, null, 12);
        }
        V5 v53 = q52.f26165c;
        if (v53 != null && (u52 = v53.f26477h) != null) {
            U5.a(u52, 6, true, null, 12);
        }
        V5 v54 = q52.f26165c;
        if (v54 != null) {
            v54.reload();
        }
        return true;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        tn.p.j(context, "getContext(...)");
        C3501j5 c3501j5 = new C3501j5(context, (byte) 4, this.f26168f);
        c3501j5.setId(65503);
        c3501j5.setOnTouchListener(new View.OnTouchListener() { // from class: n9.a4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.a(this.f75282b, view, motionEvent);
            }
        });
        linearLayout.addView(c3501j5, layoutParams);
    }

    public final void a(String str, R5 r52, boolean z10, long j10, String str2, String str3, String str4, Ya ya2) {
        tn.p.k(str, "expandInput");
        tn.p.k(r52, "inputType");
        tn.p.k(str2, "placementType");
        tn.p.k(str3, "impressionId");
        tn.p.k(str4, "creativeId");
        if (this.f26165c == null) {
            Context context = getContext();
            tn.p.j(context, "getContext(...)");
            V5 v52 = new V5(context, j10, str2, str3, str4, new sn.l() { // from class: n9.x3
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return Q5.a(this.f75688b, (JSONObject) obj);
                }
            }, this.f26168f);
            this.f26165c = v52;
            v52.setId(65517);
        }
        V5 v53 = this.f26165c;
        if (v53 != null) {
            v53.setLandingPageTelemetryControlInfo(ya2);
        }
        if (this.f26164b != str.hashCode()) {
            if (r52 == R5.f26227a) {
                V5 v54 = this.f26165c;
                if (v54 != null) {
                    v54.loadUrl(str);
                }
            } else {
                V5 v55 = this.f26165c;
                if (v55 != null) {
                    v55.loadData(str, "text/html", "UTF-8");
                }
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, 65533);
            V5 v56 = this.f26165c;
            if (v56 != null) {
                v56.setLayoutParams(layoutParams);
            }
            if (findViewById(65517) == null) {
                addView(this.f26165c, layoutParams);
            }
        }
        this.f26164b = str.hashCode();
        if (!z10) {
            View viewFindViewById = findViewById(65533);
            if (viewFindViewById != null) {
                removeView(viewFindViewById);
                return;
            }
            return;
        }
        if (findViewById(65533) != null) {
            return;
        }
        float f10 = J5.d().f25857c;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setId(65533);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        setBackgroundColor(-7829368);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48 * f10));
        layoutParams2.addRule(12);
        addView(linearLayout, layoutParams2);
        if (F3.a(this.f26163a)) {
            xo xoVar = this.f26169g;
            if (xoVar != null) {
                xoVar.a();
            }
            this.f26169g = new xo(this.f26163a, new P5(layoutParams2), this.f26168f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.weight = 25.0f;
        b(linearLayout, layoutParams3);
        d(linearLayout, layoutParams3);
        a(linearLayout, layoutParams3);
        c(linearLayout, layoutParams3);
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        tn.p.j(context, "getContext(...)");
        C3501j5 c3501j5 = new C3501j5(context, (byte) 2, this.f26168f);
        c3501j5.setId(65516);
        c3501j5.setOnTouchListener(new View.OnTouchListener() { // from class: n9.z3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.b(this.f75718b, view, motionEvent);
            }
        });
        linearLayout.addView(c3501j5, layoutParams);
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        tn.p.j(context, "getContext(...)");
        C3501j5 c3501j5 = new C3501j5(context, (byte) 6, this.f26168f);
        c3501j5.setId(1048283);
        c3501j5.setOnTouchListener(new View.OnTouchListener() { // from class: n9.y3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.c(this.f75702b, view, motionEvent);
            }
        });
        linearLayout.addView(c3501j5, layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        tn.p.j(context, "getContext(...)");
        C3501j5 c3501j5 = new C3501j5(context, (byte) 3, this.f26168f);
        c3501j5.setId(65502);
        c3501j5.setOnTouchListener(new View.OnTouchListener() { // from class: n9.b4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.d(this.f75296b, view, motionEvent);
            }
        });
        linearLayout.addView(c3501j5, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53135i, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public final InterfaceC3288al getUserLeftApplicationListener() {
        return this.f26167e;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public final void setEmbeddedBrowserUpdateListener(@NotNull T5 t52) {
        tn.p.k(t52, "browserUpdateListener");
        this.f26166d = t52;
    }

    public final void setLogger(@NotNull InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(interfaceC3580m9, "logger");
        this.f26168f = interfaceC3580m9;
    }

    public final void setUserLeftApplicationListener(@Nullable InterfaceC3288al interfaceC3288al) {
        this.f26167e = interfaceC3288al;
    }
}
