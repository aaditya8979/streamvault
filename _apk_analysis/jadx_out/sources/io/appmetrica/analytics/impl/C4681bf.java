package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4681bf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5064qf f66437a;

    public C4681bf() {
        this(new C5064qf());
    }

    public C4681bf(C5064qf c5064qf) {
        this.f66437a = c5064qf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4733df toModel(@NonNull C4989nf c4989nf) {
        JSONObject jSONObject;
        String str = c4989nf.f67361a;
        String str2 = c4989nf.f67362b;
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        }
        return new C4733df(str, jSONObject, this.f66437a.toModel(Integer.valueOf(c4989nf.f67363c)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4989nf fromModel(@NonNull C4733df c4733df) {
        C4989nf c4989nf = new C4989nf();
        if (!TextUtils.isEmpty(c4733df.f66608a)) {
            c4989nf.f67361a = c4733df.f66608a;
        }
        c4989nf.f67362b = c4733df.f66609b.toString();
        c4989nf.f67363c = this.f66437a.fromModel(c4733df.f66610c).intValue();
        return c4989nf;
    }
}
