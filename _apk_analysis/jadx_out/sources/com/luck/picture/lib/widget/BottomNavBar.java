package com.luck.picture.lib.widget;

import ab.e;
import ab.k;
import ab.q;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.BottomNavBarStyle;

/* JADX INFO: loaded from: classes12.dex */
public class BottomNavBar extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f35233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f35234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CheckBox f35235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PictureSelectionConfig f35236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f35237f;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            BottomNavBar bottomNavBar = BottomNavBar.this;
            bottomNavBar.f35236e.T = z10;
            bottomNavBar.f35235d.setChecked(BottomNavBar.this.f35236e.T);
            b bVar = BottomNavBar.this.f35237f;
            if (bVar != null) {
                bVar.a();
                if (z10 && va.a.l() == 0) {
                    BottomNavBar.this.f35237f.c();
                }
            }
        }
    }

    public static class b {
        public void a() {
            throw null;
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public BottomNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public BottomNavBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e();
    }

    public final void b() {
        if (!this.f35236e.f35046y0) {
            this.f35235d.setText(getContext().getString(R$string.ps_default_original_image));
            return;
        }
        long jA = 0;
        for (int i10 = 0; i10 < va.a.l(); i10++) {
            jA += va.a.n().get(i10).A();
        }
        if (jA <= 0) {
            this.f35235d.setText(getContext().getString(R$string.ps_default_original_image));
        } else {
            this.f35235d.setText(getContext().getString(R$string.ps_original_image, k.e(jA)));
        }
    }

    public void c() {
    }

    public void d() {
        View.inflate(getContext(), R$layout.ps_bottom_nav_bar, this);
    }

    public void e() {
        d();
        setClickable(true);
        setFocusable(true);
        this.f35236e = PictureSelectionConfig.e();
        this.f35233b = (TextView) findViewById(R$id.ps_tv_preview);
        this.f35234c = (TextView) findViewById(R$id.ps_tv_editor);
        this.f35235d = (CheckBox) findViewById(R$id.cb_original);
        this.f35233b.setOnClickListener(this);
        this.f35234c.setVisibility(8);
        setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_grey));
        this.f35235d.setChecked(this.f35236e.T);
        this.f35235d.setOnCheckedChangeListener(new a());
        c();
    }

    public void f() {
        if (this.f35236e.f35003d) {
            setVisibility(8);
            return;
        }
        BottomNavBarStyle bottomNavBarStyleB = PictureSelectionConfig.T0.b();
        if (this.f35236e.f35046y0) {
            this.f35235d.setVisibility(0);
            int iH = bottomNavBarStyleB.h();
            if (q.c(iH)) {
                this.f35235d.setButtonDrawable(iH);
            }
            String strI = bottomNavBarStyleB.i();
            if (q.f(strI)) {
                this.f35235d.setText(strI);
            }
            int iK = bottomNavBarStyleB.k();
            if (q.b(iK)) {
                this.f35235d.setTextSize(iK);
            }
            int iJ = bottomNavBarStyleB.j();
            if (q.c(iJ)) {
                this.f35235d.setTextColor(iJ);
            }
        }
        int iG = bottomNavBarStyleB.g();
        if (q.b(iG)) {
            getLayoutParams().height = iG;
        } else {
            getLayoutParams().height = e.a(getContext(), 46.0f);
        }
        int iF = bottomNavBarStyleB.f();
        if (q.c(iF)) {
            setBackgroundColor(iF);
        }
        int iN = bottomNavBarStyleB.n();
        if (q.c(iN)) {
            this.f35233b.setTextColor(iN);
        }
        int iO = bottomNavBarStyleB.o();
        if (q.b(iO)) {
            this.f35233b.setTextSize(iO);
        }
        String strM = bottomNavBarStyleB.m();
        if (q.f(strM)) {
            this.f35233b.setText(strM);
        }
        String strC = bottomNavBarStyleB.c();
        if (q.f(strC)) {
            this.f35234c.setText(strC);
        }
        int iE = bottomNavBarStyleB.e();
        if (q.b(iE)) {
            this.f35234c.setTextSize(iE);
        }
        int iD = bottomNavBarStyleB.d();
        if (q.c(iD)) {
            this.f35234c.setTextColor(iD);
        }
        int iH2 = bottomNavBarStyleB.h();
        if (q.c(iH2)) {
            this.f35235d.setButtonDrawable(iH2);
        }
        String strI2 = bottomNavBarStyleB.i();
        if (q.f(strI2)) {
            this.f35235d.setText(strI2);
        }
        int iK2 = bottomNavBarStyleB.k();
        if (q.b(iK2)) {
            this.f35235d.setTextSize(iK2);
        }
        int iJ2 = bottomNavBarStyleB.j();
        if (q.c(iJ2)) {
            this.f35235d.setTextColor(iJ2);
        }
    }

    public void g() {
        this.f35235d.setChecked(this.f35236e.T);
    }

    public void h() {
        b();
        BottomNavBarStyle bottomNavBarStyleB = PictureSelectionConfig.T0.b();
        if (va.a.l() <= 0) {
            this.f35233b.setEnabled(false);
            int iN = bottomNavBarStyleB.n();
            if (q.c(iN)) {
                this.f35233b.setTextColor(iN);
            } else {
                this.f35233b.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_9b));
            }
            String strM = bottomNavBarStyleB.m();
            if (q.f(strM)) {
                this.f35233b.setText(strM);
                return;
            } else {
                this.f35233b.setText(getContext().getString(R$string.ps_preview));
                return;
            }
        }
        this.f35233b.setEnabled(true);
        int iQ = bottomNavBarStyleB.q();
        if (q.c(iQ)) {
            this.f35233b.setTextColor(iQ);
        } else {
            this.f35233b.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_fa632d));
        }
        String strP = bottomNavBarStyleB.p();
        if (!q.f(strP)) {
            this.f35233b.setText(getContext().getString(R$string.ps_preview_num, Integer.valueOf(va.a.l())));
        } else if (q.d(strP)) {
            this.f35233b.setText(String.format(strP, Integer.valueOf(va.a.l())));
        } else {
            this.f35233b.setText(strP);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f35237f != null && view.getId() == R$id.ps_tv_preview) {
            this.f35237f.d();
        }
    }

    public void setOnBottomNavBarListener(b bVar) {
        this.f35237f = bVar;
    }
}
