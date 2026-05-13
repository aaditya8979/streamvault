package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l6 extends i5 implements q0.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f8698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q0.e f8699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d6.b f8700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private x4 f8701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private x4 f8702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q0.b f8703l;

    public class a implements q0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.applovin.impl.sdk.k f8704a;

        public a(com.applovin.impl.sdk.k kVar) {
            this.f8704a = kVar;
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, Object obj) {
            boolean z10 = false;
            boolean z11 = i10 < 200 || i10 >= 500;
            boolean z12 = i10 == 429;
            boolean z13 = i10 != -1009 || l6.this.f8698g.q();
            boolean z14 = (i10 == -900 || i10 == -1000) ? false : true;
            if (!z13 || !z14 || (!z11 && !z12 && !l6.this.f8698g.p())) {
                l6 l6Var = l6.this;
                l6Var.a(l6Var.f8698g.f(), i10, str2, obj);
                return;
            }
            String strA = l6.this.f8698g.a();
            if (l6.this.f8698g.j() <= 0) {
                if (strA == null || !strA.equals(l6.this.f8698g.f())) {
                    l6 l6Var2 = l6.this;
                    l6Var2.a(l6Var2.f8701j);
                } else {
                    l6 l6Var3 = l6.this;
                    l6Var3.a(l6Var3.f8702k);
                }
                l6 l6Var4 = l6.this;
                l6Var4.a(l6Var4.f8698g.f(), i10, str2, obj);
                return;
            }
            com.applovin.impl.sdk.o oVar = l6.this.f8507c;
            if (com.applovin.impl.sdk.o.a()) {
                l6 l6Var5 = l6.this;
                l6Var5.f8507c.k(l6Var5.f8506b, "Unable to send request due to server failure (code " + i10 + "). " + l6.this.f8698g.j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(l6.this.f8698g.k()) + " seconds...");
            }
            int iJ = l6.this.f8698g.j() - 1;
            l6.this.f8698g.a(iJ);
            if (iJ == 0) {
                l6 l6Var6 = l6.this;
                l6Var6.a(l6Var6.f8701j);
                if (StringUtils.isValidString(strA) && strA.length() >= 4) {
                    com.applovin.impl.sdk.o oVar2 = l6.this.f8507c;
                    if (com.applovin.impl.sdk.o.a()) {
                        l6 l6Var7 = l6.this;
                        l6Var7.f8507c.d(l6Var7.f8506b, "Switching to backup endpoint " + strA);
                    }
                    l6.this.f8698g.a(strA);
                    z10 = true;
                }
            }
            long millis = (((Boolean) this.f8704a.a(x4.f10731g3)).booleanValue() && z10) ? 0L : l6.this.f8698g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, l6.this.f8698g.c())) : l6.this.f8698g.k();
            d6 d6VarQ0 = this.f8704a.q0();
            l6 l6Var8 = l6.this;
            d6VarQ0.a(l6Var8, l6Var8.f8700i, millis);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, Object obj, int i10) {
            l6.this.f8698g.a(0);
            l6.this.a(str, obj, i10);
        }
    }

    public l6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        this(aVar, kVar, false);
    }

    public l6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
        super("TaskRepeatRequest", kVar, z10);
        this.f8700i = d6.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.f8698g = aVar;
        this.f8703l = new q0.b();
        this.f8699h = new a(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x4 x4Var) {
        if (x4Var != null) {
            b().o0().a(x4Var, x4Var.a());
        }
    }

    public void a(d6.b bVar) {
        this.f8700i = bVar;
    }

    public abstract void a(String str, int i10, String str2, Object obj);

    public abstract void a(String str, Object obj, int i10);

    public void b(x4 x4Var) {
        this.f8702k = x4Var;
    }

    public void c(x4 x4Var) {
        this.f8701j = x4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        q0 q0VarW = b().w();
        if (!b().E0() && !b().B0()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f8698g.f(), -22, null, null);
        } else if (!StringUtils.isValidString(this.f8698g.f()) || this.f8698g.f().length() < 4) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Task has an invalid or null request endpoint.");
            }
            a(this.f8698g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.f8698g.h())) {
                this.f8698g.b(this.f8698g.b() != null ? "POST" : "GET");
            }
            q0VarW.a(this.f8698g, this.f8703l, this.f8699h);
        }
    }
}
