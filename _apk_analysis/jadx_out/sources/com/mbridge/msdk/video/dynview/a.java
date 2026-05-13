package com.mbridge.msdk.video.dynview;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: DynamicBean.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f41371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<View> f41372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41373c;

    public List<View> a() {
        return this.f41372b;
    }

    public void a(View view) {
        this.f41371a = view;
    }

    public void a(List<View> list) {
        this.f41372b = list;
    }

    public void a(boolean z10) {
        this.f41373c = z10;
    }

    public View b() {
        return this.f41371a;
    }

    public boolean c() {
        return this.f41373c;
    }
}
