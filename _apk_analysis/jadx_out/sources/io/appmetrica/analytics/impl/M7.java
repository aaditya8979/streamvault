package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class M7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f65576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f65577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f65578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public K7 f65579d;

    public M7(boolean z10) {
        this.f65576a = z10;
    }

    public final void a() {
        K7 k72 = this.f65579d;
        if (k72 != null) {
            String str = k72.f65472b;
            if (str == null) {
                if (k72.f65473c != null) {
                    a(2);
                    return;
                } else {
                    a(3);
                    return;
                }
            }
            DeferredDeeplinkListener deferredDeeplinkListener = this.f65577b;
            if (deferredDeeplinkListener != null) {
                deferredDeeplinkListener.onDeeplinkLoaded(str);
                this.f65577b = null;
            }
            if (mo.a(this.f65579d.f65471a)) {
                String str2 = this.f65579d.f65473c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f65578c;
                if (deferredDeeplinkParametersListener != null) {
                    deferredDeeplinkParametersListener.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f65578c = null;
                    return;
                }
                return;
            }
            Map<String, String> map = this.f65579d.f65471a;
            DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f65578c;
            if (deferredDeeplinkParametersListener2 != null) {
                deferredDeeplinkParametersListener2.onParametersLoaded(map);
                this.f65578c = null;
            }
        }
    }

    public final void a(int i10) {
        K7 k72 = this.f65579d;
        String str = k72 == null ? null : k72.f65473c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f65577b;
        if (deferredDeeplinkListener != null) {
            if (i10 == 0) {
                throw null;
            }
            int i11 = i10 - 1;
            deferredDeeplinkListener.onError(i11 != 0 ? i11 != 1 ? i11 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f65577b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f65578c;
        if (deferredDeeplinkParametersListener != null) {
            if (i10 == 0) {
                throw null;
            }
            int i12 = i10 - 1;
            deferredDeeplinkParametersListener.onError(i12 != 0 ? i12 != 1 ? i12 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f65578c = null;
        }
    }
}
