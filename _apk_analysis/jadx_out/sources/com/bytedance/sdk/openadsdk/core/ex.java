package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ex implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene ouw;

    public ex(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.ouw = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public final JSONObject encrypt(JSONObject jSONObject, int i10) {
        tc.ouw(1, this.ouw, i10);
        return com.bytedance.sdk.component.utils.ouw.ouw(jSONObject);
    }
}
