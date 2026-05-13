package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class I9 extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J9 f65357b;

    public I9(@NotNull Y4 y42, @NotNull TimeProvider timeProvider) {
        super(y42);
        this.f65357b = new J9(y42, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NotNull Q5 q52) {
        long jOptLong;
        J9 j92 = this.f65357b;
        C9 c92 = j92.f65439a.t().B;
        Long lValueOf = c92 != null ? Long.valueOf(c92.f65100a) : null;
        if (lValueOf != null) {
            yo yoVar = j92.f65439a.f66233t;
            synchronized (yoVar) {
                jOptLong = yoVar.f68052a.a().optLong("external_attribution_window_start", -1L);
            }
            if (jOptLong < 0) {
                jOptLong = j92.f65440b.currentTimeMillis();
                j92.f65439a.f66233t.a(jOptLong);
            }
            if (j92.f65440b.currentTimeMillis() - jOptLong <= lValueOf.longValue()) {
                B9 b92 = (B9) MessageNano.mergeFrom(new B9(), q52.getValueBytes());
                int i10 = b92.f65028a;
                String str = new String(b92.f65029b, bo.c.f5639b);
                if (this.f65357b.f65439a.f66216c.k().get(Integer.valueOf(i10)) != null) {
                    try {
                        if (!(!JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(r10)))) {
                            this.f65880a.f66226m.info("Ignoring attribution of type `" + L9.a(i10) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                J9 j93 = this.f65357b;
                Map<Integer, String> mapK = j93.f65439a.f66216c.k();
                mapK.put(Integer.valueOf(i10), str);
                j93.f65439a.f66216c.b(mapK);
                this.f65880a.f66226m.info("Handling attribution of type `" + L9.a(i10) + '`', new Object[0]);
                return false;
            }
        }
        this.f65880a.f66226m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
