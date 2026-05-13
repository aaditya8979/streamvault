package com.fyber.inneractive.sdk.click;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.f0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f15939c;

    public m(r rVar, String str, String str2) {
        this.f15939c = rVar;
        this.f15937a = str;
        this.f15938b = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        c cVar = (c) obj;
        if (this.f15939c.f15946e) {
            return;
        }
        if (exc != null) {
            r.a(this.f15939c, null, this.f15937a, this.f15938b, exc);
            return;
        }
        if (cVar != null) {
            String str = this.f15937a;
            if (cVar.f15915a.size() > 1) {
                ArrayList arrayList = cVar.f15915a;
                str = (String) arrayList.get(arrayList.size() - 1);
            }
            b bVarA = this.f15939c.a(str);
            if ((bVarA == null || bVarA.f15909a == q.FAILED) && !TextUtils.isEmpty(cVar.f15916b)) {
                r rVar = this.f15939c;
                rVar.getClass();
                for (String str2 : cVar.f15915a) {
                    if (!TextUtils.equals(str2, str)) {
                        rVar.f15947f.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                r.a(this.f15939c, cVar.f15916b, str, this.f15938b, null);
                return;
            }
            r rVar2 = this.f15939c;
            rVar2.getClass();
            for (String str3 : cVar.f15915a) {
                if (!TextUtils.equals(str3, str)) {
                    rVar2.f15947f.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                }
            }
            if (this.f15939c.f15947f.size() == 0) {
                this.f15939c.f15947f.add(new j(str, false, q.INTERNAL_REDIRECT, null));
            }
            this.f15939c.a(r.a(str, "followRedirects", "Invalid response"));
        }
    }
}
