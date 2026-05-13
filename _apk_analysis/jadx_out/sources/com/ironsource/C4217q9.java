package com.ironsource;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4217q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f33347a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.q9$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final void a(@NotNull Context context) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            C4233r9.b(context);
        }
    }
}
