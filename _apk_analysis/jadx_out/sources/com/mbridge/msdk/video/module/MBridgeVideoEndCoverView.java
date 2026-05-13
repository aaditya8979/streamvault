package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.listener.impl.j;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f41752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f41753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f41754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f41755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f41756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f41757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f41758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f41759t;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.notifyListener.a(104, "");
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
        this.f41752m = "MBridgeVideoEndCoverView";
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41752m = "MBridgeVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f41754o = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f41755p = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f41756q = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f41757r = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f41758s = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th2) {
            q0.b("MBridgeVideoEndCoverView", th2.getMessage());
            return false;
        }
    }

    private void e() {
        ImageView imageView;
        CampaignEx campaignEx = this.f41632b;
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getIconUrl()) && (imageView = this.f41754o) != null) {
                b1.a(imageView, this.f41632b.getLocalRequestId(), this.f41632b.getLocalAllowTrackClick());
                com.mbridge.msdk.foundation.same.image.b.a(this.f41631a.getApplicationContext()).a(this.f41632b.getIconUrl(), new j(this.f41754o, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 8.0f)));
            }
            TextView textView = this.f41756q;
            if (textView != null) {
                textView.setText(this.f41632b.getAppName());
            }
            TextView textView2 = this.f41758s;
            if (textView2 != null) {
                b1.a(textView2, this.f41632b.getLocalRequestId(), this.f41632b.getLocalAllowTrackClick());
                this.f41758s.setText(this.f41632b.getAdCall());
            }
            TextView textView3 = this.f41757r;
            if (textView3 != null) {
                textView3.setText(this.f41632b.getAppDesc());
            }
        }
    }

    private void f() {
        View view = this.f41753n;
        if (view == null) {
            init(this.f41631a);
            preLoadData(this.f41759t);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f41753n.getParent()).removeView(this.f41753n);
        }
        addView(this.f41753n);
        a(this.f41753n);
        d();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        this.f41755p.setOnClickListener(new a());
        this.f41754o.setOnClickListener(new b());
        this.f41758s.setOnClickListener(new c());
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void g() {
        JSONException e10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONException e11;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f37699h, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f41636f));
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f37700i, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f41637g));
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f37704m, 0);
                    try {
                        this.f41634d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f37702k, this.f41634d);
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f37703l, v0.d(getContext()));
                } catch (JSONException e13) {
                    e11 = e13;
                    q0.b("MBridgeVideoEndCoverView", e11.getMessage());
                }
            } catch (JSONException e14) {
                jSONObject2 = jSONObject3;
                e11 = e14;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f37701j, jSONObject2);
            } catch (JSONException e15) {
                e10 = e15;
                e10.printStackTrace();
            }
        } catch (JSONException e16) {
            e10 = e16;
            jSONObject = null;
        }
        this.notifyListener.a(105, jSONObject);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoend_cover");
        if (i0.a(iFindLayout)) {
            View viewInflate = this.f41633c.inflate(iFindLayout, (ViewGroup) null);
            this.f41753n = viewInflate;
            if (viewInflate != null) {
                this.f41635e = a(viewInflate);
                addView(this.f41753n, -1, -1);
                d();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f41636f = motionEvent.getRawX();
        this.f41637g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f41634d = configuration.orientation;
        removeView(this.f41753n);
        f();
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f41759t = bVar;
        try {
            if (this.f41632b == null || !this.f41635e) {
                return;
            }
            e();
        } catch (Throwable th2) {
            q0.a("MBridgeVideoEndCoverView", th2.getMessage());
        }
    }
}
