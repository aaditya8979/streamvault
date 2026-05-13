package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f16770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f16771b;

    public g(List list, i iVar) {
        this.f16770a = list;
        this.f16771b = iVar;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f16770a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f16770a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.f16771b.mReason)));
            }
        }
        return arrayList;
    }
}
