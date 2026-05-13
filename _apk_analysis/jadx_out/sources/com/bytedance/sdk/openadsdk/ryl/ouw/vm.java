package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class vm extends com.bytedance.sdk.component.ouw.vm<JSONObject, JSONObject> {
    public static final HashSet<String> yu = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));
    private vpp fkw;

    private vm(vpp vppVar) {
        this.fkw = vppVar;
    }

    public static void ouw(com.bytedance.sdk.component.ouw.ko koVar, vpp vppVar) {
        koVar.ouw(yu, new vm(vppVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011b  */
    @Override // com.bytedance.sdk.component.ouw.yu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object ouw(java.lang.String r11, java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.ryl.ouw.vm.ouw(java.lang.String, java.lang.Object):java.lang.Object");
    }
}
