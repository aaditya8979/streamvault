package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f19370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f19372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19373d = true;

    public abstract e a();

    public final e a(String str) throws Exception {
        this.f19373d = str != null;
        e eVar = this.f19370a;
        eVar.getClass();
        eVar.f19383c = System.currentTimeMillis();
        this.f19372c.a(this);
        String strA = this.f19372c.a();
        this.f19370a.f19388h = strA;
        r0 r0VarA = com.fyber.inneractive.sdk.config.a.a(this.f19371b);
        IAlog.a("%sGot unit config for unitId: %s from config manager", IAlog.a(this), this.f19371b);
        IAlog.a("%s%s", IAlog.a(this), r0VarA);
        if (this.f19373d) {
            a(str, r0VarA);
        } else if (b()) {
            h hVar = new h(strA);
            if (hVar.f19407a) {
                String str2 = hVar.f19408b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    throw new Exception("empty ad content detected. failing fast.");
                }
                a(str2, r0VarA);
            }
        } else {
            a(strA, r0VarA);
        }
        return this.f19370a;
    }

    public abstract void a(String str, r0 r0Var);

    public boolean b() {
        return !(this instanceof com.fyber.inneractive.sdk.dv.h);
    }

    public boolean c() {
        return this instanceof com.fyber.inneractive.sdk.dv.h;
    }
}
