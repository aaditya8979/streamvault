package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import com.bytedance.adsdk.vt.lh.vt.vm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
final class fak {
    public static com.bytedance.adsdk.vt.lh.vt.vm ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        boolean z10;
        int i10;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar;
        int i11;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2 = null;
        com.bytedance.adsdk.vt.lh.ouw.ouw ouwVarYu = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
        vm.ouw ouwVar = null;
        vm.vt vtVar3 = null;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.vt.lh.ouw.yu yuVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            z10 = zNextBoolean;
            i10 = 1;
            switch (strNextName) {
                case "c":
                    ouwVarYu = yu.yu(jsonReader, raVar);
                    break;
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        vtVarOuw = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            com.bytedance.adsdk.vt.lh.ouw.vt vtVar4 = vtVar2;
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                vtVarOuw = yu.ouw(jsonReader, raVar, true);
                                vtVar2 = vtVar4;
                            } else {
                                jsonReader.skipValue();
                            }
                            vtVar2 = vtVar4;
                        }
                        vtVar = vtVar2;
                        jsonReader.endObject();
                        strNextString2.hashCode();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                i11 = 1;
                                raVar.mwh = true;
                                arrayList.add(vtVarOuw);
                                i10 = i11;
                                vtVar2 = vtVar;
                                break;
                            case "o":
                                vtVar2 = vtVarOuw;
                                i10 = 1;
                                break;
                            default:
                                i11 = 1;
                                i10 = i11;
                                vtVar2 = vtVar;
                                break;
                        }
                    }
                    com.bytedance.adsdk.vt.lh.ouw.vt vtVar5 = vtVar2;
                    int i12 = i10;
                    jsonReader.endArray();
                    if (arrayList.size() != i12) {
                        vtVar2 = vtVar5;
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        zNextBoolean = z10;
                        vtVar2 = vtVar5;
                        break;
                    }
                    break;
                case "o":
                    yuVar = yu.ouw(jsonReader, raVar);
                    break;
                case "w":
                    vtVarOuw2 = yu.ouw(jsonReader, raVar, true);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    continue;
                    break;
                case "lc":
                    ouwVar = vm.ouw.values()[jsonReader.nextInt() - 1];
                    break;
                case "lj":
                    vtVar3 = vm.vt.values()[jsonReader.nextInt() - 1];
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            zNextBoolean = z10;
        }
        boolean z11 = zNextBoolean;
        if (yuVar == null) {
            yuVar = new com.bytedance.adsdk.vt.lh.ouw.yu(Collections.singletonList(new com.bytedance.adsdk.vt.ra.ouw(100)));
        }
        return new com.bytedance.adsdk.vt.lh.vt.vm(strNextString, vtVar2, arrayList, ouwVarYu, yuVar, vtVarOuw2, ouwVar, vtVar3, fNextDouble, z11);
    }
}
