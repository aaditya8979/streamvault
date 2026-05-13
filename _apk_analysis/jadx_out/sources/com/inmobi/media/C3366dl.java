package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.Result;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: renamed from: com.inmobi.media.dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3366dl implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c f27055a;

    public C3366dl(kotlinx.coroutines.c cVar) {
        this.f27055a = cVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        tn.p.k(call, NotificationCompat.CATEGORY_CALL);
        tn.p.k(iOException, "e");
        kotlinx.coroutines.c cVar = this.f27055a;
        tn.p.k(cVar, "<this>");
        tn.p.k(iOException, "t");
        if (cVar.isActive()) {
            try {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(iOException)));
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        tn.p.k(call, NotificationCompat.CATEGORY_CALL);
        tn.p.k(response, "response");
        P4.a(this.f27055a, response);
    }
}
