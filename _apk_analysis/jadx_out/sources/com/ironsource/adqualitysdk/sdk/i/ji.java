package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import androidx.annotation.MainThread;
import com.ironsource.adqualitysdk.sdk.i.jd.AnonymousClass2;
import com.ironsource.adqualitysdk.sdk.i.jd.AnonymousClass3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ji {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ji f2833;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<View> f2835 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<jl> f2837 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<View> f2834 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private io f2836 = new io() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.1
        @Override // com.ironsource.adqualitysdk.sdk.i.io
        /* JADX INFO: renamed from: ｋ */
        public final void mo5915() {
            List<View> listM6815 = ju.m6815();
            ji.this.f2834.clear();
            ji.this.f2834.addAll(ji.this.f2835);
            for (int i10 = 0; i10 < listM6815.size(); i10++) {
                View view = listM6815.get(i10);
                ji.this.f2834.remove(view);
                if (!ji.this.f2835.contains(view)) {
                    ji.this.f2835.add(view);
                    ji.this.m6744(view);
                }
            }
            for (int i11 = 0; i11 < ji.this.f2834.size(); i11++) {
                View view2 = (View) ji.this.f2834.get(i11);
                ji.this.f2835.remove(view2);
                ji.this.m6747(view2);
            }
            ji.this.f2834.clear();
        }
    };

    private ji() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized ji m6743() {
        if (f2833 == null) {
            f2833 = new ji();
        }
        return f2833;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public synchronized void m6744(View view) {
        Iterator<jl> it = this.f2837.iterator();
        while (it.hasNext()) {
            it.next().mo4365(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public synchronized void m6747(View view) {
        Iterator<jl> it = this.f2837.iterator();
        while (it.hasNext()) {
            it.next().mo4361(view);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6750(final jl jlVar) {
        synchronized (this) {
            this.f2837.add(jlVar);
        }
        t.m7067(jd.m6691().new AnonymousClass3(this.f2836));
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                Iterator it = ji.this.f2835.iterator();
                while (it.hasNext()) {
                    jlVar.mo4365((View) it.next());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m6751(jl jlVar) {
        synchronized (this) {
            this.f2837.remove(jlVar);
            if (this.f2837.size() == 0) {
                t.m7067(jd.m6691().new AnonymousClass2(this.f2836));
            }
        }
    }
}
