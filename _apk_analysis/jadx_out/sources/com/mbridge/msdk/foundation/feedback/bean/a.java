package com.mbridge.msdk.foundation.feedback.bean;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.b;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: FeedBackBtnBean.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static int A = -1;
    private static String B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f37659c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FeedBackButton f37661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f37662f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f37665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBFeedBackDialog f37666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Dialog f37667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSONArray f37668l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f37673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<g> f37674r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f37677u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f37657a = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37660d = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f37663g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37664h = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37669m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f37670n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f37671o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f37672p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f37675s = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 20.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f37676t = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f37678v = new C0443a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f37679w = A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f37680x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f37681y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f37682z = -1;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class C0443a implements com.mbridge.msdk.widget.dialog.b {
        public C0443a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class c implements com.mbridge.msdk.widget.dialog.b {
        public c() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class d implements CompoundButton.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (z10) {
                String unused = a.B = (String) compoundButton.getText();
            }
            if (a.this.f37666j != null) {
                a.this.f37666j.setCancelButtonClickable(!TextUtils.isEmpty(a.B));
            }
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f37667k == null || !a.this.f37667k.isShowing()) {
                    return;
                }
                a.this.f37667k.dismiss();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public static class g implements com.mbridge.msdk.widget.dialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.feedback.a f37689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f37690b;

        public g(String str, com.mbridge.msdk.foundation.feedback.a aVar) {
            this.f37689a = aVar;
            this.f37690b = str;
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            com.mbridge.msdk.foundation.feedback.b.f37652f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f37689a;
            if (aVar != null) {
                aVar.close();
            }
        }

        public void a(int i10) {
            if (this.f37689a == null || i10 != 2) {
                return;
            }
            com.mbridge.msdk.foundation.feedback.b.f37652f = true;
            this.f37689a.a();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            com.mbridge.msdk.foundation.feedback.b.f37652f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f37689a;
            if (aVar != null) {
                aVar.a(a.B);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            com.mbridge.msdk.foundation.feedback.a aVar = this.f37689a;
            if (aVar != null) {
                aVar.close();
            }
        }
    }

    public a(String str) {
        this.f37674r = new ArrayList();
        this.f37665i = str;
        if (this.f37674r == null) {
            this.f37674r = new ArrayList();
        }
        d();
        e();
        c();
    }

    private FeedbackRadioGroup a(b.C0493b c0493b) {
        JSONArray jSONArrayB = c0493b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextD);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    private void a(int i10) {
        if (i10 == 2) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f37665i, 0, 2, B, this.f37660d);
        } else {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f37665i, 0, 3, B, this.f37660d);
        }
        List<g> list = this.f37674r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a(i10);
                }
            }
        }
    }

    private void a(Context context) {
        if (context != null) {
            try {
                com.mbridge.msdk.click.c.e(context, v0.a(this.f37659c));
            } catch (Exception unused) {
                com.mbridge.msdk.click.c.c(context, v0.a(this.f37659c));
            }
        }
    }

    private void a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new d());
        }
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, b.C0493b c0493b) {
        JSONArray jSONArrayB = c0493b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return;
        }
        i0.a(contextD, "mbridge_cm_feedback_choice_btn_bg", "drawable");
        Resources resourcesA = i0.a(contextD);
        int iA = i0.a(contextD, "mbridge_cm_feedback_rb_text_color_color_list", "color");
        ColorStateList colorStateList = null;
        if (resourcesA != null) {
            try {
                colorStateList = resourcesA.getColorStateList(iA);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        int iA2 = v0.a(contextD, 1.0f);
        int iA3 = v0.a(contextD, 1.0f);
        int iA4 = v0.a(contextD, 1.0f);
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            String strOptString = jSONArrayB.optString(i10);
            RadioButton radioButton = new RadioButton(contextD);
            radioButton.setButtonTintList(colorStateList);
            radioButton.setText(strOptString);
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
            }
            radioButton.setCompoundDrawablePadding(iA2);
            radioButton.setPadding(iA2, iA3, iA2, iA3);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            int i11 = iA4 / 4;
            layoutParams.setMargins(iA4, i11, iA4, i11);
            a(radioButton);
            feedbackRadioGroup.addView(radioButton, layoutParams);
        }
    }

    private void b() {
        FeedBackButton feedBackButton = this.f37661e;
        if (feedBackButton != null) {
            int i10 = this.f37681y;
            if (i10 > -1) {
                feedBackButton.setX(i10);
            }
            int i11 = this.f37682z;
            if (i11 > -1) {
                this.f37661e.setY(i11);
            }
            float f10 = this.f37657a;
            if (f10 >= 0.0f) {
                this.f37661e.setAlpha(f10);
                this.f37661e.setEnabled(this.f37657a != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f37661e.getLayoutParams();
            int i12 = this.f37680x;
            if (i12 > 0) {
                this.f37661e.setWidth(i12);
                if (layoutParams != null) {
                    layoutParams.width = this.f37680x;
                }
            }
            int i13 = this.f37664h;
            if (i13 > 0) {
                this.f37661e.setHeight(i13);
                if (layoutParams != null) {
                    layoutParams.height = this.f37664h;
                }
            }
            if (layoutParams != null) {
                this.f37661e.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f37662f)) {
                    this.f37661e.setTextColor(Color.parseColor(this.f37662f));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            float f11 = this.f37663g;
            if (f11 > 0.0f) {
                this.f37661e.setTextSize(f11);
            }
            JSONArray jSONArray = this.f37668l;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                this.f37661e.setPadding(v0.a(contextD, (float) this.f37668l.optDouble(0)), v0.a(contextD, (float) this.f37668l.optDouble(1)), v0.a(contextD, (float) this.f37668l.optDouble(2)), v0.a(contextD, (float) this.f37668l.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i14 = this.f37675s;
            if (i14 > 0) {
                gradientDrawable.setCornerRadius(i14);
            }
            if (TextUtils.isEmpty(this.f37658b)) {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            } else {
                gradientDrawable.setColor(Color.parseColor(this.f37658b));
            }
            this.f37661e.setBackground(gradientDrawable);
        }
    }

    private void c() {
        try {
            if (com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()) != null) {
                com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                b.C0493b c0493bZ = gVarD.z();
                if (c0493bZ == null) {
                    q0.c("", "feedback fbk is null");
                    return;
                }
                d();
                this.f37666j = new MBFeedBackDialog(com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()), this.f37678v);
                FeedbackRadioGroup feedbackRadioGroupA = a(c0493bZ);
                this.f37666j.setCancelText(c0493bZ.d());
                this.f37666j.setConfirmText(c0493bZ.a());
                this.f37666j.setPrivacyText(c0493bZ.c());
                this.f37676t = c0493bZ.e();
                this.f37666j.setTitle(c0493bZ.f());
                this.f37666j.setContent(feedbackRadioGroupA);
                this.f37666j.setCancelButtonClickable(!TextUtils.isEmpty(B));
                a(feedbackRadioGroupA, c0493bZ);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        if (this.f37678v == null) {
            this.f37678v = new c();
        }
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(contextD);
                this.f37661e = feedBackButton;
                int i10 = 8;
                if (this.f37679w != 8) {
                    i10 = 0;
                }
                feedBackButton.setVisibility(i10);
                this.f37661e.setOnClickListener(new b());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f37665i, 1, 4, B, this.f37660d);
        List<g> list = this.f37674r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.b();
                }
            }
        }
        o();
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f37665i, 0, 4, B, this.f37660d);
        List<g> list = this.f37674r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f37665i, 0, 4, B, this.f37660d);
        Context contextF = com.mbridge.msdk.foundation.controller.c.n().f();
        if (contextF == null) {
            contextF = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        List<g> list = this.f37674r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        a(contextF);
        B = "";
    }

    private void o() {
        if (TextUtils.isEmpty(this.f37676t)) {
            return;
        }
        try {
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            if (activityA != null) {
                View viewInflate = LayoutInflater.from(activityA).inflate(i0.a(activityA, "mbridge_cm_feedback_notice_layout", "layout"), (ViewGroup) null);
                Dialog dialog = new Dialog(activityA, 3);
                this.f37667k = dialog;
                dialog.requestWindowFeature(1);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f37667k.getWindow();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -2;
                layoutParams.height = -2;
                this.f37667k.setContentView(viewInflate);
                this.f37667k.show();
                window.setAttributes(layoutParams);
                viewInflate.postDelayed(new e(), 2000L);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10, int i11, int i12, int i13, int i14, float f10, String str, String str2, float f11, JSONArray jSONArray) {
        if (i10 > -1) {
            this.f37681y = i10;
        }
        if (i11 > -1) {
            this.f37682z = i11;
        }
        if (i12 > -1) {
            this.f37680x = i12;
        }
        if (i13 > -1) {
            this.f37664h = i13;
        }
        if (f11 > -1.0f) {
            this.f37663g = f11;
        }
        if (jSONArray != null) {
            this.f37668l = jSONArray;
        }
        this.f37662f = str;
        this.f37658b = str2;
        this.f37657a = f10;
        this.f37675s = i14;
        b();
    }

    public void a(CampaignEx campaignEx) {
        this.f37659c = campaignEx;
    }

    public void a(g gVar) {
        if (this.f37674r == null) {
            this.f37674r = new ArrayList();
        }
        this.f37674r.add(gVar);
    }

    public void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f37661e;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f37657a);
            feedBackButton.setEnabled(this.f37657a != 0.0f);
            feedBackButton.setVisibility(this.f37679w != 8 ? 0 : 8);
            this.f37661e = feedBackButton;
            CampaignEx campaignEx = this.f37659c;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                b();
            }
            feedBackButton.setOnClickListener(new f());
        }
    }

    public void b(int i10) {
        this.f37673q = i10;
    }

    public void b(String str) {
        this.f37660d = str;
    }

    public void c(int i10) {
        this.f37677u = i10;
    }

    public void d(int i10) {
        this.f37679w = i10;
        FeedBackButton feedBackButton = this.f37661e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i10);
        }
    }

    public void f() {
        FeedBackButton feedBackButton = this.f37661e;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f37661e.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f37661e.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f37661e);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f37666j;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f37666j.setListener(null);
        }
        this.f37666j = null;
        this.f37674r = null;
        this.f37661e = null;
        this.f37678v = null;
    }

    public void g() {
        MBFeedBackDialog mBFeedBackDialog = this.f37666j;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.f37666j.cancel();
    }

    public CampaignEx h() {
        return this.f37659c;
    }

    public FeedBackButton i() {
        if (this.f37661e == null) {
            e();
        }
        return this.f37661e;
    }

    public int j() {
        return this.f37673q;
    }

    public int k() {
        return this.f37677u;
    }

    public void p() {
        try {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f37665i, 0, 1, B, this.f37660d);
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            MBFeedBackDialog mBFeedBackDialog = this.f37666j;
            if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != activityA) {
                c();
            }
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            FeedBackButton feedBackButton = this.f37661e;
            if (feedBackButton != null) {
                contextD = feedBackButton.getContext();
            }
            boolean zA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f37665i, contextD, this.f37666j);
            a(zA ? 2 : 3);
            if (zA) {
                return;
            }
            a(contextD);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
