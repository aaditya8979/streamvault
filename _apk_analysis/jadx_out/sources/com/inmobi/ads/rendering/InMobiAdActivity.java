package com.inmobi.ads.rendering;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.webkit.Profile;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.B;
import com.inmobi.media.C;
import com.inmobi.media.C3501j5;
import com.inmobi.media.C3605n9;
import com.inmobi.media.C3702r7;
import com.inmobi.media.C3850x5;
import com.inmobi.media.F3;
import com.inmobi.media.Ff;
import com.inmobi.media.GestureDetectorOnGestureListenerC3337ci;
import com.inmobi.media.InterfaceC3580m9;
import com.inmobi.media.J5;
import com.inmobi.media.M8;
import com.inmobi.media.Mh;
import com.inmobi.media.O8;
import com.inmobi.media.Q5;
import com.inmobi.media.Q8;
import com.inmobi.media.U5;
import com.inmobi.media.V5;
import com.inmobi.media.Vh;
import com.inmobi.media.xo;
import com.ironsource.C3978d4;
import com.ironsource.Mf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"ClickableViewAccessibility"})
public final class InMobiAdActivity extends Activity {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final SparseArray f25113k = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static GestureDetectorOnGestureListenerC3337ci f25114l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O8 f25115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M8 f25116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3337ci f25117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3580m9 f25122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public xo f25123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnBackInvokedCallback f25124j;

    public static final void a(InMobiAdActivity inMobiAdActivity) {
        inMobiAdActivity.b();
    }

    public static final boolean a(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U5 u52;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = inMobiAdActivity.f25117c;
        if (gestureDetectorOnGestureListenerC3337ci != null && (u52 = gestureDetectorOnGestureListenerC3337ci.D0) != null) {
            U5.a(u52, 5, true, null, 12);
        }
        inMobiAdActivity.f25119e = true;
        inMobiAdActivity.a();
        return true;
    }

    public static final boolean b(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U5 u52;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = inMobiAdActivity.f25117c;
        if (gestureDetectorOnGestureListenerC3337ci != null && (u52 = gestureDetectorOnGestureListenerC3337ci.D0) != null) {
            U5.a(u52, 6, true, null, 12);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = inMobiAdActivity.f25117c;
        if (gestureDetectorOnGestureListenerC3337ci2 != null) {
            gestureDetectorOnGestureListenerC3337ci2.reload();
        }
        return true;
    }

    public static final boolean c(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U5 u52;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = inMobiAdActivity.f25117c;
        if (gestureDetectorOnGestureListenerC3337ci == null || !gestureDetectorOnGestureListenerC3337ci.canGoBack()) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = inMobiAdActivity.f25117c;
            if (gestureDetectorOnGestureListenerC3337ci2 != null && (u52 = gestureDetectorOnGestureListenerC3337ci2.D0) != null) {
                U5.a(u52, 5, true, null, 12);
            }
            inMobiAdActivity.f25119e = true;
            inMobiAdActivity.a();
        } else {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci3 = inMobiAdActivity.f25117c;
            if (gestureDetectorOnGestureListenerC3337ci3 != null) {
                gestureDetectorOnGestureListenerC3337ci3.goBack();
            }
        }
        return true;
    }

    public static final boolean d(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = inMobiAdActivity.f25117c;
        if (gestureDetectorOnGestureListenerC3337ci2 != null && gestureDetectorOnGestureListenerC3337ci2.canGoForward() && (gestureDetectorOnGestureListenerC3337ci = inMobiAdActivity.f25117c) != null) {
            gestureDetectorOnGestureListenerC3337ci.goForward();
        }
        return true;
    }

    public final void a() {
        if (isTaskRoot()) {
            C3850x5.f28483a.getClass();
            if (C3850x5.v()) {
                finishAndRemoveTask();
                return;
            }
        }
        finish();
    }

    public final void a(RelativeLayout relativeLayout) {
        float f10 = J5.d().f25857c;
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (48 * f10));
        linearLayout.setOrientation(0);
        linearLayout.setId(65533);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        relativeLayout.setBackgroundColor(-7829368);
        layoutParams.addRule(12);
        if (F3.a(this)) {
            xo xoVar = this.f25123i;
            if (xoVar != null) {
                xoVar.a();
            }
            this.f25123i = new xo(this, new Q8(layoutParams), this.f25122h);
        }
        relativeLayout.addView(linearLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 25.0f;
        C3501j5 c3501j5 = new C3501j5(this, (byte) 2, this.f25122h);
        c3501j5.setOnTouchListener(new View.OnTouchListener() { // from class: m9.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.a(this.f74018b, view, motionEvent);
            }
        });
        linearLayout.addView(c3501j5, layoutParams2);
        C3501j5 c3501j52 = new C3501j5(this, (byte) 3, this.f25122h);
        c3501j52.setOnTouchListener(new View.OnTouchListener() { // from class: m9.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.b(this.f74019b, view, motionEvent);
            }
        });
        linearLayout.addView(c3501j52, layoutParams2);
        C3501j5 c3501j53 = new C3501j5(this, (byte) 4, this.f25122h);
        c3501j53.setOnTouchListener(new View.OnTouchListener() { // from class: m9.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.c(this.f74020b, view, motionEvent);
            }
        });
        linearLayout.addView(c3501j53, layoutParams2);
        C3501j5 c3501j54 = new C3501j5(this, (byte) 6, this.f25122h);
        c3501j54.setOnTouchListener(new View.OnTouchListener() { // from class: m9.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.d(this.f74021b, view, motionEvent);
            }
        });
        linearLayout.addView(c3501j54, layoutParams2);
    }

    public final void b() {
        U5 u52;
        C3702r7 c3702r7;
        InterfaceC3580m9 interfaceC3580m9 = this.f25122h;
        if (interfaceC3580m9 != null) {
            p.j("InMobiAdActivity", "TAG");
            ((C3605n9) interfaceC3580m9).c("InMobiAdActivity", "onBackPressed");
        }
        int i10 = this.f25118d;
        if (i10 == 102) {
            InterfaceC3580m9 interfaceC3580m92 = this.f25122h;
            if (interfaceC3580m92 != null) {
                p.j("InMobiAdActivity", "TAG");
                ((C3605n9) interfaceC3580m92).c("InMobiAdActivity", "back pressed on ad");
            }
            M8 m82 = this.f25116b;
            if (m82 == null || (c3702r7 = m82.f25939c) == null) {
                return;
            }
            c3702r7.a();
            return;
        }
        if (i10 == 100) {
            InterfaceC3580m9 interfaceC3580m93 = this.f25122h;
            if (interfaceC3580m93 != null) {
                p.j("InMobiAdActivity", "TAG");
                ((C3605n9) interfaceC3580m93).c("InMobiAdActivity", "back pressed in browser");
            }
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f25117c;
            if (gestureDetectorOnGestureListenerC3337ci != null && (u52 = gestureDetectorOnGestureListenerC3337ci.D0) != null) {
                U5.a(u52, 7, true, null, 12);
            }
            this.f25119e = true;
            a();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53135i, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        p.k(configuration, "newConfig");
        InterfaceC3580m9 interfaceC3580m9 = this.f25122h;
        if (interfaceC3580m9 != null) {
            p.j("InMobiAdActivity", "TAG");
            ((C3605n9) interfaceC3580m9).c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(configuration);
        O8 o82 = this.f25115a;
        if (o82 != null) {
            o82.b();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(18:(1:41)(35:42|(1:44)|46|(2:48|(1:50)(1:51))|52|(1:54)(1:55)|56|112|57|58|119|59|(1:61)(1:62)|63|64|110|65|66|114|67|(1:69)|70|(1:72)|73|(3:75|117|76)(1:77)|78|(1:80)|81|(1:83)|84|(1:86)|87|(1:89)|90|124)|114|67|(0)|70|(0)|73|(0)(0)|78|(0)|81|(0)|84|(0)|87|(0)|90|124)|119|59|(0)(0)|63|64|110|65|66) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x026e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x026f, code lost:
    
        r1 = r38;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019c A[Catch: Exception -> 0x0274, TryCatch #5 {Exception -> 0x0274, blocks: (B:59:0x0195, B:61:0x019c, B:63:0x01a8, B:62:0x01a4), top: B:119:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a4 A[Catch: Exception -> 0x0274, TryCatch #5 {Exception -> 0x0274, blocks: (B:59:0x0195, B:61:0x019c, B:63:0x01a8, B:62:0x01a4), top: B:119:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2 A[Catch: Exception -> 0x026c, TryCatch #2 {Exception -> 0x026c, blocks: (B:67:0x01e7, B:69:0x01f2, B:70:0x01f7, B:72:0x01fb, B:73:0x0200), top: B:114:0x01e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fb A[Catch: Exception -> 0x026c, TryCatch #2 {Exception -> 0x026c, blocks: (B:67:0x01e7, B:69:0x01f2, B:70:0x01f7, B:72:0x01fb, B:73:0x0200), top: B:114:0x01e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0210 A[Catch: Exception -> 0x026a, TryCatch #4 {Exception -> 0x026a, blocks: (B:76:0x0206, B:78:0x020c, B:80:0x0210, B:81:0x0215, B:83:0x023e, B:84:0x0246, B:86:0x024a, B:87:0x024d, B:89:0x0251, B:90:0x0256), top: B:117:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023e A[Catch: Exception -> 0x026a, TryCatch #4 {Exception -> 0x026a, blocks: (B:76:0x0206, B:78:0x020c, B:80:0x0210, B:81:0x0215, B:83:0x023e, B:84:0x0246, B:86:0x024a, B:87:0x024d, B:89:0x0251, B:90:0x0256), top: B:117:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024a A[Catch: Exception -> 0x026a, TryCatch #4 {Exception -> 0x026a, blocks: (B:76:0x0206, B:78:0x020c, B:80:0x0210, B:81:0x0215, B:83:0x023e, B:84:0x0246, B:86:0x024a, B:87:0x024d, B:89:0x0251, B:90:0x0256), top: B:117:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0251 A[Catch: Exception -> 0x026a, TryCatch #4 {Exception -> 0x026a, blocks: (B:76:0x0206, B:78:0x020c, B:80:0x0210, B:81:0x0215, B:83:0x023e, B:84:0x0246, B:86:0x024a, B:87:0x024d, B:89:0x0251, B:90:0x0256), top: B:117:0x0206 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r39) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.rendering.InMobiAdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        M8 m82;
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci;
        U5 u52;
        B fullScreenEventsListener;
        InterfaceC3580m9 interfaceC3580m9 = this.f25122h;
        if (interfaceC3580m9 != null) {
            p.j("InMobiAdActivity", "TAG");
            ((C3605n9) interfaceC3580m9).c("InMobiAdActivity", "onDestroy");
        }
        int i10 = this.f25118d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = f25114l;
            if (gestureDetectorOnGestureListenerC3337ci2 != null) {
                GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
                gestureDetectorOnGestureListenerC3337ci2.c(Mh.a("IN_CUSTOM_BROWSER", "onClose"));
            }
        } else if (102 == i10 && (m82 = this.f25116b) != null && m82.f25941e != null) {
            GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
            m82.a(Mh.a("IN_CUSTOM_EXPAND", "onClose"));
        }
        if (this.f25119e) {
            int i11 = this.f25118d;
            if (100 == i11) {
                GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci3 = this.f25117c;
                if (gestureDetectorOnGestureListenerC3337ci3 != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3337ci3.getFullScreenEventsListener()) != null) {
                    try {
                        Vh vh2 = (Vh) fullScreenEventsListener;
                        InterfaceC3580m9 interfaceC3580m92 = vh2.f26505a.f26958i;
                        if (interfaceC3580m92 != null) {
                            String str = GestureDetectorOnGestureListenerC3337ci.f26937g1;
                            p.j(str, "access$getTAG$cp(...)");
                            ((C3605n9) interfaceC3580m92).a(str, Mf.f29859m);
                        }
                        if (p.f(Profile.DEFAULT_PROFILE_NAME, vh2.f26505a.getViewState())) {
                            vh2.f26505a.setAndUpdateViewState("Hidden");
                        }
                        vh2.f26505a.W();
                        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci4 = this.f25117c;
                        p.h(gestureDetectorOnGestureListenerC3337ci4);
                        gestureDetectorOnGestureListenerC3337ci4.b();
                        O8 o82 = this.f25115a;
                        if (o82 == null) {
                            p.C("orientationHandler");
                            o82 = null;
                        }
                        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci5 = this.f25117c;
                        p.h(gestureDetectorOnGestureListenerC3337ci5);
                        o82.getClass();
                        p.k(gestureDetectorOnGestureListenerC3337ci5, "orientationListener");
                        o82.f26074b.remove(gestureDetectorOnGestureListenerC3337ci5);
                        o82.a();
                        this.f25117c = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i11) {
                M8 m83 = this.f25116b;
                if (m83 != null) {
                    O8 o83 = this.f25115a;
                    if (o83 == null) {
                        p.C("orientationHandler");
                        o83 = null;
                    }
                    o83.getClass();
                    p.k(m83, "orientationListener");
                    o83.f26074b.remove(m83);
                    o83.a();
                    C3702r7 c3702r7 = m83.f25939c;
                    if (c3702r7 != null) {
                        c3702r7.b();
                    }
                    RelativeLayout relativeLayout = m83.f25940d;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    Q5 q52 = m83.f25941e;
                    if (q52 != null) {
                        V5 v52 = q52.f26165c;
                        if (v52 != null) {
                            v52.destroy();
                        }
                        q52.f26165c = null;
                        q52.f26166d = null;
                        q52.f26167e = null;
                        xo xoVar = q52.f26169g;
                        if (xoVar != null) {
                            xoVar.a();
                        }
                        q52.removeAllViews();
                    }
                    m83.f25937a.clear();
                    m83.f25938b = null;
                    m83.f25939c = null;
                    m83.f25940d = null;
                    m83.f25941e = null;
                }
                this.f25116b = null;
            }
        } else {
            int i12 = this.f25118d;
            if (100 != i12 && 102 == i12) {
                M8 m84 = this.f25116b;
                if (m84 != null) {
                    O8 o84 = this.f25115a;
                    if (o84 == null) {
                        p.C("orientationHandler");
                        o84 = null;
                    }
                    o84.getClass();
                    p.k(m84, "orientationListener");
                    o84.f26074b.remove(m84);
                    o84.a();
                    C3702r7 c3702r72 = m84.f25939c;
                    if (c3702r72 != null) {
                        c3702r72.b();
                    }
                    RelativeLayout relativeLayout2 = m84.f25940d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.removeAllViews();
                    }
                    Q5 q53 = m84.f25941e;
                    if (q53 != null) {
                        V5 v53 = q53.f26165c;
                        if (v53 != null) {
                            v53.destroy();
                        }
                        q53.f26165c = null;
                        q53.f26166d = null;
                        q53.f26167e = null;
                        xo xoVar2 = q53.f26169g;
                        if (xoVar2 != null) {
                            xoVar2.a();
                        }
                        q53.removeAllViews();
                    }
                    m84.f25937a.clear();
                    m84.f25938b = null;
                    m84.f25939c = null;
                    m84.f25940d = null;
                    m84.f25941e = null;
                }
                this.f25116b = null;
            }
            if (100 == this.f25118d && (gestureDetectorOnGestureListenerC3337ci = this.f25117c) != null && (u52 = gestureDetectorOnGestureListenerC3337ci.D0) != null) {
                U5.a(u52, 9, true, null, 12);
            }
        }
        xo xoVar3 = this.f25123i;
        if (xoVar3 != null) {
            xoVar3.a();
        }
        this.f25123i = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        M8 m82;
        O8 o82;
        InterfaceC3580m9 interfaceC3580m9 = this.f25122h;
        if (interfaceC3580m9 != null) {
            p.j("InMobiAdActivity", "TAG");
            ((C3605n9) interfaceC3580m9).c("InMobiAdActivity", "multiWindow mode - " + z10);
        }
        super.onMultiWindowModeChanged(z10);
        if (z10 || (m82 = this.f25116b) == null) {
            return;
        }
        C c10 = m82.f25938b;
        Ff orientationProperties = (c10 == null || !(c10 instanceof GestureDetectorOnGestureListenerC3337ci)) ? null : ((GestureDetectorOnGestureListenerC3337ci) c10).getOrientationProperties();
        if (orientationProperties == null || (o82 = this.f25115a) == null) {
            return;
        }
        o82.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        p.k(configuration, "newConfig");
        super.onMultiWindowModeChanged(z10, configuration);
        onMultiWindowModeChanged(z10);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        p.k(intent, "intent");
        InterfaceC3580m9 interfaceC3580m9 = this.f25122h;
        if (interfaceC3580m9 != null) {
            p.j("InMobiAdActivity", "TAG");
            ((C3605n9) interfaceC3580m9).c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f25120f = false;
        this.f25117c = null;
        setIntent(intent);
        M8 m82 = this.f25116b;
        if (m82 != null) {
            SparseArray sparseArray = f25113k;
            p.k(intent, "intent");
            p.k(sparseArray, "adContainers");
            m82.a(intent, sparseArray);
            C3702r7 c3702r7 = m82.f25939c;
            if (c3702r7 != null) {
                c3702r7.e();
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        M8 m82;
        super.onPause();
        int i10 = this.f25118d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = f25114l;
            if (gestureDetectorOnGestureListenerC3337ci != null) {
                GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
                gestureDetectorOnGestureListenerC3337ci.c(Mh.a("IN_CUSTOM_BROWSER", "onHidden"));
                return;
            }
            return;
        }
        if (102 != i10 || (m82 = this.f25116b) == null || m82.f25941e == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
        m82.a(Mh.a("IN_CUSTOM_EXPAND", "onHidden"));
    }

    @Override // android.app.Activity
    public final void onResume() {
        C3702r7 c3702r7;
        B fullScreenEventsListener;
        InterfaceC3580m9 interfaceC3580m9 = this.f25122h;
        if (interfaceC3580m9 != null) {
            p.j("InMobiAdActivity", "TAG");
            ((C3605n9) interfaceC3580m9).c("InMobiAdActivity", C3978d4.i.f31366u0);
        }
        super.onResume();
        if (this.f25119e) {
            return;
        }
        int i10 = this.f25118d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f25117c;
            if (gestureDetectorOnGestureListenerC3337ci != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3337ci.getFullScreenEventsListener()) != null) {
                try {
                    if (!this.f25120f) {
                        this.f25120f = true;
                        ((Vh) fullScreenEventsListener).b();
                    }
                } catch (Exception unused) {
                }
            }
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = f25114l;
            if (gestureDetectorOnGestureListenerC3337ci2 != null) {
                GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
                gestureDetectorOnGestureListenerC3337ci2.c(Mh.a("IN_CUSTOM_BROWSER", "onVisible"));
                return;
            }
            return;
        }
        if (102 == i10) {
            M8 m82 = this.f25116b;
            if (m82 != null && (c3702r7 = m82.f25939c) != null && !c3702r7.f28043h) {
                try {
                    c3702r7.f28043h = true;
                    B fullScreenEventsListener2 = c3702r7.f28041f.getFullScreenEventsListener();
                    if (fullScreenEventsListener2 != null) {
                        ((Vh) fullScreenEventsListener2).b();
                    }
                } catch (Exception unused2) {
                }
            }
            M8 m83 = this.f25116b;
            if (m83 == null || m83.f25941e == null) {
                return;
            }
            GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
            m83.a(Mh.a("IN_CUSTOM_EXPAND", "onVisible"));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        M8 m82;
        Window window;
        InterfaceC3580m9 interfaceC3580m9 = this.f25122h;
        if (interfaceC3580m9 != null) {
            p.j("InMobiAdActivity", "TAG");
            ((C3605n9) interfaceC3580m9).c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        C3850x5.f28483a.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.f25124j == null) {
                this.f25124j = new OnBackInvokedCallback() { // from class: m9.e
                    @Override // android.window.OnBackInvokedCallback
                    public final void onBackInvoked() {
                        InMobiAdActivity.a(this.f74022a);
                    }
                };
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.f25124j;
            if (onBackInvokedCallback == null) {
                p.C("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
        if (this.f25119e || 102 != this.f25118d || (m82 = this.f25116b) == null) {
            return;
        }
        C3702r7 c3702r7 = m82.f25939c;
        if (c3702r7 != null) {
            c3702r7.e();
        }
        C c10 = m82.f25938b;
        if (c10 != null) {
            if ((c10 instanceof GestureDetectorOnGestureListenerC3337ci ? ((GestureDetectorOnGestureListenerC3337ci) c10).W0 : false) && !C3850x5.r() && C3850x5.u()) {
                Object obj = m82.f25937a.get();
                InMobiAdActivity inMobiAdActivity = obj instanceof InMobiAdActivity ? (InMobiAdActivity) obj : null;
                if (inMobiAdActivity == null || (window = inMobiAdActivity.getWindow()) == null) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(5638);
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        InterfaceC3580m9 interfaceC3580m9 = this.f25122h;
        if (interfaceC3580m9 != null) {
            p.j("InMobiAdActivity", "TAG");
            ((C3605n9) interfaceC3580m9).c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        C3850x5.f28483a.getClass();
        if (Build.VERSION.SDK_INT < 33 || this.f25124j == null) {
            return;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        OnBackInvokedCallback onBackInvokedCallback = this.f25124j;
        if (onBackInvokedCallback == null) {
            p.C("backInvokedCallback");
            onBackInvokedCallback = null;
        }
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }
}
