package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.inmobi.media.Nh;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes8.dex */
public final class Nh extends Kh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f26046b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nh(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        super(gestureDetectorOnGestureListenerC3337ci);
        this.f26046b = gestureDetectorOnGestureListenerC3337ci;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Nh nh2, View view, int i10, KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        InterfaceC3580m9 interfaceC3580m9 = gestureDetectorOnGestureListenerC3337ci.f26958i;
        if (interfaceC3580m9 != null) {
            String str = GestureDetectorOnGestureListenerC3337ci.f26937g1;
            tn.p.j(str, "access$getTAG$cp(...)");
            ((C3605n9) interfaceC3580m9).a(str, "Back pressed when HTML5 video is playing.");
        }
        nh2.a();
        return true;
    }

    public final void a() {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f26046b;
        if (gestureDetectorOnGestureListenerC3337ci.R == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = gestureDetectorOnGestureListenerC3337ci.S;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = this.f26046b;
        gestureDetectorOnGestureListenerC3337ci2.S = null;
        View view = gestureDetectorOnGestureListenerC3337ci2.R;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.f26046b.R;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f26046b.R);
            }
            this.f26046b.R = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(customViewCallback, "callback");
        if (this.f26046b.f26982u.get() != null) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f26046b;
            gestureDetectorOnGestureListenerC3337ci.R = view;
            gestureDetectorOnGestureListenerC3337ci.S = customViewCallback;
            if (view != null) {
                view.setOnTouchListener(new View.OnTouchListener() { // from class: n9.p3
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        return Nh.a(view2, motionEvent);
                    }
                });
            }
            Activity activity = (Activity) this.f26046b.f26982u.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.f26046b.R;
            if (view2 != null) {
                view2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f26046b.R, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.f26046b.R;
            if (view3 != null) {
                view3.requestFocus();
            }
            final GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = this.f26046b;
            View view4 = gestureDetectorOnGestureListenerC3337ci2.R;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: n9.q3
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i10, KeyEvent keyEvent) {
                    return Nh.a(gestureDetectorOnGestureListenerC3337ci2, this, view5, i10, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }
}
