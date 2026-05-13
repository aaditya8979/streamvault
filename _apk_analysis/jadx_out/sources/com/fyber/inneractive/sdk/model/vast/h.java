package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f16861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f16862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f16864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f16867g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.vast.b f16869i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f16868h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f16870j = new ArrayList();

    public final boolean a() {
        return (TextUtils.isEmpty(this.f16866f) && TextUtils.isEmpty(this.f16865e) && this.f16864d == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f16861a);
        sb2.append(" h:");
        sb2.append(this.f16862b);
        sb2.append(" ctr:");
        sb2.append(this.f16867g);
        sb2.append(" clt:");
        sb2.append(this.f16868h);
        if (!TextUtils.isEmpty(this.f16866f)) {
            sb2.append(" html:");
            sb2.append(this.f16866f);
        }
        if (this.f16864d != null) {
            sb2.append(" static:");
            sb2.append(this.f16864d.f16873b);
            sb2.append("creative:");
            sb2.append(this.f16864d.f16872a);
        }
        if (!TextUtils.isEmpty(this.f16865e)) {
            sb2.append(" iframe:");
            sb2.append(this.f16865e);
        }
        sb2.append(" events:");
        sb2.append(this.f16870j);
        if (this.f16869i != null) {
            sb2.append(" reason:");
            sb2.append(this.f16869i.f16656a);
            sb2.append(" exception:");
            sb2.append(this.f16869i.getMessage());
        }
        return sb2.toString();
    }
}
