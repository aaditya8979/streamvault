package com.fyber.inneractive.sdk.config.global.features;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends com.fyber.inneractive.sdk.config.global.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f16040c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f16041d = new HashMap();

    public h(String str) {
        this.f16039b = str;
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final Integer a(String str) {
        Integer numA;
        Iterator it = this.f16041d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                numA = null;
                break;
            }
            numA = ((com.fyber.inneractive.sdk.config.global.k) this.f16041d.get((String) it.next())).a(str);
            if (numA != null) {
                break;
            }
        }
        return numA == null ? super.a(str) : numA;
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final String a(String str, String str2) {
        String strB;
        Iterator it = this.f16041d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                strB = null;
                break;
            }
            strB = ((com.fyber.inneractive.sdk.config.global.k) this.f16041d.get((String) it.next())).b(str);
            if (strB != null) {
                break;
            }
        }
        if (strB != null) {
            return strB;
        }
        com.fyber.inneractive.sdk.config.global.n nVar = this.f16054a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    public final void a(h hVar) {
        hVar.f16039b = this.f16039b;
        hVar.f16054a = this.f16054a;
        hVar.f16040c = new HashMap(this.f16040c);
        hVar.f16041d = new HashMap(this.f16041d);
    }

    public abstract h b();

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final String b(String str) {
        return a(str, null);
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final Boolean c(String str) {
        Boolean boolC;
        Iterator it = this.f16041d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                boolC = null;
                break;
            }
            boolC = ((com.fyber.inneractive.sdk.config.global.k) this.f16041d.get((String) it.next())).c(str);
            if (boolC != null) {
                break;
            }
        }
        return boolC == null ? super.c(str) : boolC;
    }

    public final String toString() {
        return String.format("id: %s, params: %s exp: %s", this.f16039b, this.f16054a, this.f16040c);
    }
}
