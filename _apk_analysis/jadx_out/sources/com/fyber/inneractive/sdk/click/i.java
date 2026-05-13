package com.fyber.inneractive.sdk.click;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15930c = false;

    public i(boolean z10, String str) {
        this.f15928a = str;
        this.f15929b = z10;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53142p);
        context.startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    @Override // com.fyber.inneractive.sdk.click.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.click.b a(android.content.Context r10, android.net.Uri r11, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.click.i.a(android.content.Context, android.net.Uri, java.util.List):com.fyber.inneractive.sdk.click.b");
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        return !this.f15930c && ("fybernativebrowser".equalsIgnoreCase(uri.getScheme()) || "fybernativebrowser".equalsIgnoreCase(this.f15928a) || this.f15929b || uri.toString().contains("FYBER_OPEN_BROWSER"));
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void cancel() {
        this.f15930c = true;
    }
}
