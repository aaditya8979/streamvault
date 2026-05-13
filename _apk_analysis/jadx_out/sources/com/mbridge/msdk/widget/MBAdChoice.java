package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes9.dex */
public class MBAdChoice extends MBImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f42431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f42432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f42433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f42434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CampaignEx f42435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.feedback.a f42436h;

    public class a implements com.mbridge.msdk.foundation.feedback.a {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }
    }

    public class b implements c {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBAdChoice.this.setImageBitmap(bitmap);
        }
    }

    public MBAdChoice(Context context) {
        super(context);
        this.f42432d = "";
        this.f42433e = "";
        this.f42434f = "";
        this.f42431c = context;
        b();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42432d = "";
        this.f42433e = "";
        this.f42434f = "";
        this.f42431c = context;
        b();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42432d = "";
        this.f42433e = "";
        this.f42434f = "";
        this.f42431c = context;
        b();
    }

    private void a() {
        if (this.f42431c != null) {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f42432d, new b());
        }
    }

    private void a(CampaignEx campaignEx, g gVar) {
        this.f42435g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f42432d = gVar.b();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f42432d = adchoice.g();
        }
        if (!TextUtils.isEmpty(this.f42432d) || gVar == null) {
            return;
        }
        this.f42432d = gVar.b();
    }

    private boolean a(CampaignEx campaignEx) {
        this.f42435g = campaignEx;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        c(campaignEx, gVarD);
        a(campaignEx, gVarD);
        b(campaignEx, gVarD);
        boolean z10 = (TextUtils.isEmpty(this.f42432d) || TextUtils.isEmpty(this.f42433e) || TextUtils.isEmpty(this.f42434f)) ? false : true;
        setImageUrl(this.f42432d);
        return z10;
    }

    private void b() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void b(CampaignEx campaignEx, g gVar) {
        this.f42435g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f42434f = gVar.d();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f42434f = adchoice.i();
        }
        if (!TextUtils.isEmpty(this.f42434f) || gVar == null) {
            return;
        }
        this.f42434f = gVar.d();
    }

    private void c(CampaignEx campaignEx, g gVar) {
        this.f42435g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f42433e = gVar.c();
                return;
            }
            return;
        }
        String privacyUrl = campaignEx.getPrivacyUrl();
        this.f42433e = privacyUrl;
        if (TextUtils.isEmpty(privacyUrl)) {
            CampaignEx.a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                this.f42433e = adchoice.h();
            }
            if (TextUtils.isEmpty(this.f42433e) && gVar != null) {
                this.f42433e = gVar.c();
            }
            if (TextUtils.isEmpty(this.f42433e)) {
                this.f42433e = d.h().f37837g;
            }
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f42436h == null) {
            this.f42436h = new a();
        }
        v0.a(this.f42435g, this.f42436h, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        if (!(campaign instanceof CampaignEx)) {
            this.f42435g = null;
            return;
        }
        CampaignEx campaignEx = (CampaignEx) campaign;
        this.f42435g = campaignEx;
        if (a(campaignEx)) {
            a();
        }
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.feedback.a aVar) {
        this.f42436h = aVar;
    }
}
