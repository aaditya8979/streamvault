package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5113sf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5064qf f67675a = new C5064qf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4964mf fromModel(@NonNull C5088rf c5088rf) {
        C4964mf c4964mf = new C4964mf();
        if (!TextUtils.isEmpty(c5088rf.f67617a)) {
            c4964mf.f67291a = c5088rf.f67617a;
        }
        c4964mf.f67292b = c5088rf.f67618b.toString();
        c4964mf.f67293c = c5088rf.f67619c;
        c4964mf.f67294d = c5088rf.f67620d;
        c4964mf.f67295e = this.f67675a.fromModel(c5088rf.f67621e).intValue();
        return c4964mf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5088rf toModel(@NonNull C4964mf c4964mf) {
        JSONObject jSONObject;
        String str = c4964mf.f67291a;
        String str2 = c4964mf.f67292b;
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        }
        return new C5088rf(str, jSONObject, c4964mf.f67293c, c4964mf.f67294d, this.f67675a.toModel(Integer.valueOf(c4964mf.f67295e)));
    }
}
