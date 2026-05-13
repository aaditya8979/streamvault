package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.impl.C5143tk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5143tk implements Jc {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        Z6 z62;
        C5118sk c5118sk = new C5118sk();
        C5093rk c5093rk = new C5093rk();
        C4895jn c4895jn = new C4895jn(c5093rk, c5093rk, new C5059qa(false), new InterfaceC4921kn() { // from class: mh.o0
            @Override // io.appmetrica.analytics.impl.InterfaceC4921kn
            public final boolean a(SQLiteDatabase sQLiteDatabase) {
                return C5143tk.a(sQLiteDatabase);
            }
        });
        C5293zk c5293zkB = C5009oa.I.B();
        synchronized (c5293zkB) {
            C4673b7 c4673b7 = c5293zkB.f68072a;
            z62 = new Z6(context, new C4647a7(c4673b7.f66430a, c4673b7.f66431b, false).a(context, c5118sk), c4895jn, PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new T2(new C5094rl(z62), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            C5009oa.I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(@NotNull Context context) {
        Sm sm2 = (Sm) Qm.a(C4920km.class);
        ProtobufStateStorage<Object> protobufStateStorageA = sm2.a(context, sm2.b(context));
        C4920km c4920km = (C4920km) protobufStateStorageA.read();
        C4894jm c4894jmA = c4920km.a(c4920km.f67158m);
        c4894jmA.f67059o = 0L;
        protobufStateStorageA.save(new C4920km(c4894jmA));
        b(context);
    }
}
