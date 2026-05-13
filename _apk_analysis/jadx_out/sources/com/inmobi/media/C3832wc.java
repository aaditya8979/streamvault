package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ViewCompat;
import com.inmobi.media.C3832wc;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3978d4;

/* JADX INFO: renamed from: com.inmobi.media.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3832wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3337ci f28429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3580m9 f28430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3459hc f28431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3279ac f28432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3279ac f28433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3279ac f28434f;

    public C3832wc(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, InterfaceC3580m9 interfaceC3580m9) {
        this.f28429a = gestureDetectorOnGestureListenerC3337ci;
        this.f28430b = interfaceC3580m9;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean a(C3832wc c3832wc, View view, int i10, KeyEvent keyEvent) {
        if (4 != i10 || keyEvent.getAction() != 0) {
            return false;
        }
        C3459hc c3459hc = c3832wc.f28431c;
        if (c3459hc == null) {
            return true;
        }
        c3459hc.b();
        return true;
    }

    public static boolean b() {
        Context context = Ji.f25747a;
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        InterfaceC3580m9 interfaceC3580m9 = this.f28430b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("MraidMediaProcessor", C3978d4.j.P);
        }
        Context context = Ji.f25747a;
        if (context == null) {
            return -1;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28429a;
        if (((gestureDetectorOnGestureListenerC3337ci == null || (renderingConfig = gestureDetectorOnGestureListenerC3337ci.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && Ji.f25752f) {
            return 0;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final void a(String str, int i10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28430b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28429a;
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.a(str, "fireDeviceVolumeChangeEvent(" + i10 + ");");
        }
    }

    public final void a(String str, Activity activity) {
        tn.p.k(str, "url");
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        InterfaceC3580m9 interfaceC3580m9 = this.f28430b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("MraidMediaProcessor", "doPlayMedia");
        }
        C3459hc c3459hc = new C3459hc(activity, this.f28430b);
        this.f28431c = c3459hc;
        c3459hc.setPlaybackData(str);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        C3459hc c3459hc2 = this.f28431c;
        if (c3459hc2 != null) {
            c3459hc2.setLayoutParams(layoutParams);
        }
        C3484ic c3484ic = new C3484ic(activity);
        c3484ic.setOnTouchListener(new View.OnTouchListener() { // from class: n9.ub
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C3832wc.a(view, motionEvent);
            }
        });
        c3484ic.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        c3484ic.addView(this.f28431c);
        InterfaceC3580m9 interfaceC3580m92 = this.f28430b;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c3484ic, new ViewGroup.LayoutParams(-1, -1));
        C3459hc c3459hc3 = this.f28431c;
        if (c3459hc3 != null) {
            c3459hc3.setViewContainer(c3484ic);
        }
        C3459hc c3459hc4 = this.f28431c;
        if (c3459hc4 != null) {
            c3459hc4.requestFocus();
        }
        C3459hc c3459hc5 = this.f28431c;
        if (c3459hc5 != null) {
            c3459hc5.setOnKeyListener(new View.OnKeyListener() { // from class: n9.vb
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    return C3832wc.a(this.f75662b, view, i10, keyEvent);
                }
            });
        }
        C3459hc c3459hc6 = this.f28431c;
        if (c3459hc6 != null) {
            c3459hc6.setListener(new C3807vc(this));
        }
        C3459hc c3459hc7 = this.f28431c;
        if (c3459hc7 != null) {
            c3459hc7.a();
        }
    }

    public final void a(String str, boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28430b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28429a;
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.a(str, "fireDeviceMuteChangeEvent(" + z10 + ");");
        }
    }

    public final void b(String str, boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28430b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28429a;
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.a(str, "fireHeadphonePluggedEvent(" + z10 + ");");
        }
    }
}
