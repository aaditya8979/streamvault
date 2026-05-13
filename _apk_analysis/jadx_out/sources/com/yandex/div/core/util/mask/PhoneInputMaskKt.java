package com.yandex.div.core.util.mask;

import ah.yc;
import bo.d0;
import cn.v;
import com.yandex.div.core.util.mask.BaseInputMask;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: PhoneInputMask.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PhoneInputMaskKt {

    @NotNull
    private static final List<BaseInputMask.MaskKey> DEFAULT_DECODING_MASK_KEY;

    @NotNull
    private static final BaseInputMask.MaskData DEFAULT_MASK_DATA;

    static {
        List<BaseInputMask.MaskKey> listE = v.e(new BaseInputMask.MaskKey('0', "\\d", '_'));
        DEFAULT_DECODING_MASK_KEY = listE;
        DEFAULT_MASK_DATA = new BaseInputMask.MaskData(getPhoneMaskPattern(""), listE, false);
    }

    @NotNull
    public static final List<BaseInputMask.MaskKey> getDEFAULT_DECODING_MASK_KEY() {
        return DEFAULT_DECODING_MASK_KEY;
    }

    @NotNull
    public static final BaseInputMask.MaskData getDEFAULT_MASK_DATA() {
        return DEFAULT_MASK_DATA;
    }

    @NotNull
    public static final String getPhoneMaskPattern(@NotNull String str) throws JSONException {
        if (d0.u0(str)) {
            return "000000000000000";
        }
        JSONObject jSONObject = yc.f3926d;
        int i10 = 0;
        while (true) {
            if (jSONObject.has("value")) {
                break;
            }
            String str2 = "*";
            if (i10 >= str.length()) {
                Object obj = jSONObject.get("*");
                p.i(obj, "null cannot be cast to non-null type org.json.JSONObject");
                jSONObject = (JSONObject) obj;
                break;
            }
            int i11 = i10 + 1;
            String strValueOf = String.valueOf(str.charAt(i10));
            if (jSONObject.has(strValueOf)) {
                str2 = strValueOf;
            }
            Object obj2 = jSONObject.get(str2);
            p.i(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj2;
            i10 = i11;
        }
        return jSONObject.getString("value") + "00";
    }
}
