package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class W8 extends AbstractC3398f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W8 f26526c = new W8();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f26527d = new AtomicBoolean(true);

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = f26527d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j10 = this.f27127a / 1000;
            if (j10 != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j10));
            }
            int i10 = this.f27128b;
            if (i10 > 0) {
                jSONObject.put("a-audioBannerFreq", String.valueOf(i10));
            }
            Context context = Ji.f25747a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea eaA = Da.a(context, "banner_audio_pref_file");
                tn.p.k("user_mute_count", "key");
                int i11 = eaA.f25373a.getInt("user_mute_count", -1);
                if (i11 > 0) {
                    jSONObject.put("a-b-umc", String.valueOf(i11));
                }
            }
        }
        return jSONObject;
    }
}
