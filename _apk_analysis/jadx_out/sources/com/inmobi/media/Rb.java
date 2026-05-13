package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.util.concurrent.Semaphore;
import kotlin.Result;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Rb {
    public static Object a(sn.a aVar) {
        Semaphore semaphore;
        tn.p.k(aVar, "run");
        try {
            Result.a aVar2 = Result.Companion;
            try {
                try {
                    semaphore = Sb.f26293b;
                    semaphore.acquire();
                    aVar.invoke();
                } catch (Exception e10) {
                    bn.g gVar = P9.f26117a;
                    P9.a(new L2(e10));
                    semaphore = Sb.f26293b;
                }
                semaphore.release();
                return Result.m7534constructorimpl(bn.r.f5635a);
            } catch (Throwable th2) {
                Sb.f26293b.release();
                throw th2;
            }
        } catch (Throwable th3) {
            Result.a aVar3 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(th3));
        }
    }

    public static String a(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return context.getFilesDir() + "/logging";
    }

    public static String a(Context context, long j10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        File file = new File(context.getFilesDir() + "/logging");
        if (!file.exists()) {
            file.mkdirs();
        }
        return context.getFilesDir() + "/logging/" + j10 + ".txt";
    }

    public static void a(sn.l lVar) {
        tn.p.k(lVar, "runnable");
        p000do.i.d(A9.f25147c, null, null, new Nb(lVar, null), 3, null);
    }
}
