package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f9653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f9654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f9655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f9656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r2 f9657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9658f;

    public int a() {
        return this.f9658f;
    }

    public void a(int i10) {
        this.f9658f = i10;
    }

    public void a(r2 r2Var) {
        this.f9657e = r2Var;
        this.f9653a.setText(r2Var.k());
        this.f9653a.setTextColor(r2Var.l());
        if (this.f9654b != null) {
            if (TextUtils.isEmpty(r2Var.f())) {
                this.f9654b.setVisibility(8);
            } else {
                this.f9654b.setTypeface(null, 0);
                this.f9654b.setVisibility(0);
                this.f9654b.setText(r2Var.f());
                this.f9654b.setTextColor(r2Var.g());
                if (r2Var.p()) {
                    this.f9654b.setTypeface(null, 1);
                }
            }
        }
        if (this.f9655c != null) {
            if (r2Var.h() > 0) {
                this.f9655c.setImageResource(r2Var.h());
                this.f9655c.setColorFilter(r2Var.i());
                this.f9655c.setVisibility(0);
            } else {
                this.f9655c.setVisibility(8);
            }
        }
        if (this.f9656d != null) {
            if (r2Var.d() <= 0) {
                this.f9656d.setVisibility(8);
                return;
            }
            this.f9656d.setImageResource(r2Var.d());
            this.f9656d.setColorFilter(r2Var.e());
            this.f9656d.setVisibility(0);
        }
    }

    public r2 b() {
        return this.f9657e;
    }
}
