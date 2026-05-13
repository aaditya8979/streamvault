package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class BaseView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RelativeLayout f39069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RelativeLayout f39070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RelativeLayout f39071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f39072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f39073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f39074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f39075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f39076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RelativeLayout f39077i;
    public a style;

    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public BaseView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullbasescreen", "layout"), this);
        this.f39077i = (RelativeLayout) viewInflate;
        if (viewInflate != null) {
            this.f39069a = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f39070b = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f39071c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f39072d = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f39073e = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_install", "id"));
            this.f39074f = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f39075g = (FrameLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f39076h = (LinearLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_player", "id"));
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f39071c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f39072d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f39074f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f39069a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f39070b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f39073e;
    }

    public a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f39075g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f39076h;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }
}
