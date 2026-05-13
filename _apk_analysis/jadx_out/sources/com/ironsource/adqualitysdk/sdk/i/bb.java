package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.i.ba;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class bb {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, ba> f767 = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$4, reason: invalid class name */
    public class AnonymousClass4 extends ir {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ String f774;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ ba.c f775;

        public AnonymousClass4(String str, ba.c cVar) {
            this.f774 = str;
            this.f775 = cVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4352() {
            ba baVarM4864 = bb.m4864(bb.this, this.f774);
            if (baVarM4864 != null) {
                baVarM4864.m4857(this.f775);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$5, reason: invalid class name */
    public class AnonymousClass5 extends ir {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ ba.b f776;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ String f778;

        public AnonymousClass5(String str, ba.b bVar) {
            this.f778 = str;
            this.f776 = bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4352() {
            ba baVarM4864 = bb.m4864(bb.this, this.f778);
            if (baVarM4864 != null) {
                baVarM4864.m4856(this.f776);
            }
        }
    }

    public interface e extends r {
    }

    public bb() {
        new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ba m4864(bb bbVar, String str) {
        Map<String, ba> map = bbVar.f767;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m4866(String str) {
        Map<String, ba> map = this.f767;
        ba baVar = map != null ? map.get(str) : null;
        if (baVar != null) {
            return baVar.m4855();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m4867() {
        Iterator it = new ArrayList(this.f767.values()).iterator();
        while (it.hasNext()) {
            if (((ba) it.next()).m4854()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4868(String str) {
        this.f767.put(str, new ba(str));
    }
}
