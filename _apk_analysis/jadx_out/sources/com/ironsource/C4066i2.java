package com.ironsource;

import com.ironsource.mediationsdk.e;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4066i2 extends e.a {
    public C4066i2(S1 s12, URL url, JSONObject jSONObject, boolean z10, C4193p2 c4193p2) {
        super(s12, url, jSONObject, z10, c4193p2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    public void a(boolean z10, S1 s12, long j10) {
        try {
            if (z10) {
                ((InterfaceC3940b2) s12).a(this.f32577b, this.f32581f + 1, j10, this.f32585j, this.f32584i);
            } else {
                s12.a(this.f32578c, this.f32579d, this.f32581f + 1, this.f32582g, j10);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            s12.a(1009, e10.getMessage(), this.f32581f + 1, this.f32582g, j10);
        }
    }
}
