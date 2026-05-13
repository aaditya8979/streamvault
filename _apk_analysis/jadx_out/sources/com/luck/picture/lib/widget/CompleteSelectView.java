package com.luck.picture.lib.widget;

import ab.q;
import ab.s;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import ra.c0;

/* JADX INFO: loaded from: classes5.dex */
public class CompleteSelectView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f35239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f35240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Animation f35241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PictureSelectionConfig f35242e;

    public CompleteSelectView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public CompleteSelectView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b();
    }

    public void a() {
        LayoutInflater.from(getContext()).inflate(R$layout.ps_complete_selected_layout, this);
    }

    public final void b() {
        a();
        setOrientation(0);
        this.f35239b = (TextView) findViewById(R$id.ps_tv_select_num);
        this.f35240c = (TextView) findViewById(R$id.ps_tv_complete);
        setGravity(16);
        this.f35241d = AnimationUtils.loadAnimation(getContext(), R$anim.ps_anim_modal_in);
        this.f35242e = PictureSelectionConfig.e();
    }

    public void c() {
        za.a aVar = PictureSelectionConfig.T0;
        SelectMainStyle selectMainStyleC = aVar.c();
        if (q.c(selectMainStyleC.K())) {
            setBackgroundResource(selectMainStyleC.K());
        }
        String strL = selectMainStyleC.L();
        if (q.f(strL)) {
            if (q.e(strL)) {
                this.f35240c.setText(String.format(strL, Integer.valueOf(va.a.l()), Integer.valueOf(this.f35242e.f35019l)));
            } else {
                this.f35240c.setText(strL);
            }
        }
        int iN = selectMainStyleC.N();
        if (q.b(iN)) {
            this.f35240c.setTextSize(iN);
        }
        int iM = selectMainStyleC.M();
        if (q.c(iM)) {
            this.f35240c.setTextColor(iM);
        }
        BottomNavBarStyle bottomNavBarStyleB = aVar.b();
        if (bottomNavBarStyleB.u()) {
            int iR = bottomNavBarStyleB.r();
            if (q.c(iR)) {
                this.f35239b.setBackgroundResource(iR);
            }
            int iT = bottomNavBarStyleB.t();
            if (q.b(iT)) {
                this.f35239b.setTextSize(iT);
            }
            int iS = bottomNavBarStyleB.s();
            if (q.c(iS)) {
                this.f35239b.setTextColor(iS);
            }
        }
    }

    public void setSelectedChange(boolean z10) {
        za.a aVar = PictureSelectionConfig.T0;
        SelectMainStyle selectMainStyleC = aVar.c();
        if (va.a.l() <= 0) {
            if (z10 && selectMainStyleC.T()) {
                setEnabled(true);
                int iJ = selectMainStyleC.J();
                if (q.c(iJ)) {
                    setBackgroundResource(iJ);
                } else {
                    setBackgroundResource(R$drawable.ps_ic_trans_1px);
                }
                int iP = selectMainStyleC.P();
                if (q.c(iP)) {
                    this.f35240c.setTextColor(iP);
                } else {
                    this.f35240c.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_9b));
                }
            } else {
                setEnabled(this.f35242e.O);
                int iK = selectMainStyleC.K();
                if (q.c(iK)) {
                    setBackgroundResource(iK);
                } else {
                    setBackgroundResource(R$drawable.ps_ic_trans_1px);
                }
                int iM = selectMainStyleC.M();
                if (q.c(iM)) {
                    this.f35240c.setTextColor(iM);
                } else {
                    this.f35240c.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_9b));
                }
            }
            this.f35239b.setVisibility(8);
            String strL = selectMainStyleC.L();
            if (!q.f(strL)) {
                this.f35240c.setText(getContext().getString(R$string.ps_please_select));
            } else if (q.e(strL)) {
                this.f35240c.setText(String.format(strL, Integer.valueOf(va.a.l()), Integer.valueOf(this.f35242e.f35019l)));
            } else {
                this.f35240c.setText(strL);
            }
            int iN = selectMainStyleC.N();
            if (q.b(iN)) {
                this.f35240c.setTextSize(iN);
                return;
            }
            return;
        }
        setEnabled(true);
        int iJ2 = selectMainStyleC.J();
        if (q.c(iJ2)) {
            setBackgroundResource(iJ2);
        } else {
            setBackgroundResource(R$drawable.ps_ic_trans_1px);
        }
        String strO = selectMainStyleC.O();
        if (!q.f(strO)) {
            this.f35240c.setText(getContext().getString(R$string.ps_completed));
        } else if (q.e(strO)) {
            this.f35240c.setText(String.format(strO, Integer.valueOf(va.a.l()), Integer.valueOf(this.f35242e.f35019l)));
        } else {
            this.f35240c.setText(strO);
        }
        int iQ = selectMainStyleC.Q();
        if (q.b(iQ)) {
            this.f35240c.setTextSize(iQ);
        }
        int iP2 = selectMainStyleC.P();
        if (q.c(iP2)) {
            this.f35240c.setTextColor(iP2);
        } else {
            this.f35240c.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_fa632d));
        }
        if (!aVar.b().u()) {
            this.f35239b.setVisibility(8);
            return;
        }
        if (this.f35239b.getVisibility() == 8 || this.f35239b.getVisibility() == 4) {
            this.f35239b.setVisibility(0);
        }
        if (TextUtils.equals(s.g(Integer.valueOf(va.a.l())), this.f35239b.getText())) {
            return;
        }
        this.f35239b.setText(s.g(Integer.valueOf(va.a.l())));
        c0 c0Var = PictureSelectionConfig.f34995o1;
        if (c0Var != null) {
            c0Var.a(this.f35239b);
        } else {
            this.f35239b.startAnimation(this.f35241d);
        }
    }
}
