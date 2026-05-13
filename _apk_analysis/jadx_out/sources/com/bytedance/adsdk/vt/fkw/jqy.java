package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import com.bytedance.adsdk.vt.lh.vt.bly;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class jqy {
    public static com.bytedance.adsdk.vt.lh.vt.bly ouw(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        boolean zNextBoolean = false;
        bly.ouw ouwVarOuw = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    ouwVarOuw = bly.ouw.ouw(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.vt.lh.vt.bly(strNextString, ouwVarOuw, zNextBoolean);
    }
}
