package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f51006c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final o f51007b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public m(@NotNull o oVar) {
        tn.p.k(oVar, "worker");
        this.f51007b = oVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f
    public void a(@NotNull String str) {
        Data dataA;
        tn.p.k(str, "url");
        if (e.d(str) && (dataA = n.a(str)) != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Enqueuing request to " + str, null, false, 12, null);
            this.f51007b.a(new OneTimeWorkRequest.Builder(UrlGetRequestWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).setBackoffCriteria(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS).setInputData(dataA).build());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f
    public void a(@NotNull String str, @NotNull byte[] bArr, @NotNull gl.f fVar, @Nullable String str2) throws Throwable {
        tn.p.k(str, "url");
        tn.p.k(bArr, "body");
        tn.p.k(fVar, "contentType");
        if (e.d(str)) {
            try {
                Pair[] pairArr = {bn.h.a("url", str), bn.h.a("body", bArr), bn.h.a("contentType", fVar.toString()), bn.h.a("contentEncoding", str2)};
                Data.Builder builder = new Data.Builder();
                for (int i10 = 0; i10 < 4; i10++) {
                    Pair pair = pairArr[i10];
                    builder.put((String) pair.getFirst(), pair.getSecond());
                }
                Data dataBuild = builder.build();
                tn.p.j(dataBuild, "dataBuilder.build()");
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Enqueuing request to " + str, null, false, 12, null);
                this.f51007b.a(new OneTimeWorkRequest.Builder(UrlPostRequestWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).setBackoffCriteria(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS).setInputData(dataBuild).build());
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Failed to enqueue persistent request for url: " + str, e10, false, 8, null);
            }
        }
    }
}
