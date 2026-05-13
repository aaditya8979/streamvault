package com.luck.picture.lib.widget;

import ab.q;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.TitleBarStyle;
import ma.e;

/* JADX INFO: loaded from: classes3.dex */
public class TitleBar extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RelativeLayout f35289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f35290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f35291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f35292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MarqueeTextView f35293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f35294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f35295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f35296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PictureSelectionConfig f35297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f35298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RelativeLayout f35299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f35300m;

    public static class a {
        public void a() {
            throw null;
        }

        public void b(View view) {
        }

        public void c() {
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
    }

    public void a() {
    }

    public void b() {
        LayoutInflater.from(getContext()).inflate(R$layout.ps_title_bar, this);
    }

    public void c() {
        Context context;
        int i10;
        b();
        setClickable(true);
        setFocusable(true);
        this.f35297j = PictureSelectionConfig.e();
        this.f35298k = findViewById(R$id.top_status_bar);
        this.f35299l = (RelativeLayout) findViewById(R$id.rl_title_bar);
        this.f35290c = (ImageView) findViewById(R$id.ps_iv_left_back);
        this.f35289b = (RelativeLayout) findViewById(R$id.ps_rl_album_bg);
        this.f35292e = (ImageView) findViewById(R$id.ps_iv_delete);
        this.f35296i = findViewById(R$id.ps_rl_album_click);
        this.f35293f = (MarqueeTextView) findViewById(R$id.ps_tv_title);
        this.f35291d = (ImageView) findViewById(R$id.ps_iv_arrow);
        this.f35294g = (TextView) findViewById(R$id.ps_tv_cancel);
        this.f35295h = findViewById(R$id.title_bar_line);
        this.f35290c.setOnClickListener(this);
        this.f35294g.setOnClickListener(this);
        this.f35289b.setOnClickListener(this);
        this.f35299l.setOnClickListener(this);
        this.f35296i.setOnClickListener(this);
        setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_grey));
        a();
        if (!TextUtils.isEmpty(this.f35297j.f35004d0)) {
            setTitle(this.f35297j.f35004d0);
            return;
        }
        if (this.f35297j.f34999b == e.b()) {
            context = getContext();
            i10 = R$string.ps_all_audio;
        } else {
            context = getContext();
            i10 = R$string.ps_camera_roll;
        }
        setTitle(context.getString(i10));
    }

    public void d() {
        if (this.f35297j.L) {
            this.f35298k.getLayoutParams().height = ab.e.i(getContext());
        }
        TitleBarStyle titleBarStyleD = PictureSelectionConfig.T0.d();
        int iH = titleBarStyleD.h();
        if (q.b(iH)) {
            this.f35299l.getLayoutParams().height = iH;
        } else {
            this.f35299l.getLayoutParams().height = ab.e.a(getContext(), 48.0f);
        }
        if (this.f35295h != null) {
            if (titleBarStyleD.s()) {
                this.f35295h.setVisibility(0);
                if (q.c(titleBarStyleD.i())) {
                    this.f35295h.setBackgroundColor(titleBarStyleD.i());
                }
            } else {
                this.f35295h.setVisibility(8);
            }
        }
        int iG = titleBarStyleD.g();
        if (q.c(iG)) {
            setBackgroundColor(iG);
        }
        int iP = titleBarStyleD.p();
        if (q.c(iP)) {
            this.f35290c.setImageResource(iP);
        }
        String strN = titleBarStyleD.n();
        if (q.f(strN)) {
            this.f35293f.setText(strN);
        }
        int iR = titleBarStyleD.r();
        if (q.b(iR)) {
            this.f35293f.setTextSize(iR);
        }
        int iQ = titleBarStyleD.q();
        if (q.c(iQ)) {
            this.f35293f.setTextColor(iQ);
        }
        if (this.f35297j.f35028p0) {
            this.f35291d.setImageResource(R$drawable.ps_ic_trans_1px);
        } else {
            int iO = titleBarStyleD.o();
            if (q.c(iO)) {
                this.f35291d.setImageResource(iO);
            }
        }
        int iF = titleBarStyleD.f();
        if (q.c(iF)) {
            this.f35289b.setBackgroundResource(iF);
        }
        if (titleBarStyleD.t()) {
            this.f35294g.setVisibility(8);
        } else {
            this.f35294g.setVisibility(0);
            int iJ = titleBarStyleD.j();
            if (q.c(iJ)) {
                this.f35294g.setBackgroundResource(iJ);
            }
            String strK = titleBarStyleD.k();
            if (q.f(strK)) {
                this.f35294g.setText(strK);
            }
            int iL = titleBarStyleD.l();
            if (q.c(iL)) {
                this.f35294g.setTextColor(iL);
            }
            int iM = titleBarStyleD.m();
            if (q.b(iM)) {
                this.f35294g.setTextSize(iM);
            }
        }
        int iC = titleBarStyleD.c();
        if (q.c(iC)) {
            this.f35292e.setBackgroundResource(iC);
        } else {
            this.f35292e.setBackgroundResource(R$drawable.ps_ic_delete);
        }
    }

    public ImageView getImageArrow() {
        return this.f35291d;
    }

    public ImageView getImageDelete() {
        return this.f35292e;
    }

    public View getTitleBarLine() {
        return this.f35295h;
    }

    public TextView getTitleCancelView() {
        return this.f35294g;
    }

    public String getTitleText() {
        return this.f35293f.getText().toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        int id2 = view.getId();
        if (id2 == R$id.ps_iv_left_back || id2 == R$id.ps_tv_cancel) {
            a aVar2 = this.f35300m;
            if (aVar2 != null) {
                aVar2.a();
                return;
            }
            return;
        }
        if (id2 == R$id.ps_rl_album_bg || id2 == R$id.ps_rl_album_click) {
            a aVar3 = this.f35300m;
            if (aVar3 != null) {
                aVar3.b(this);
                return;
            }
            return;
        }
        if (id2 != R$id.rl_title_bar || (aVar = this.f35300m) == null) {
            return;
        }
        aVar.c();
    }

    public void setOnTitleBarListener(a aVar) {
        this.f35300m = aVar;
    }

    public void setTitle(String str) {
        this.f35293f.setText(str);
    }
}
