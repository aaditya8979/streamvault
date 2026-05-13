package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import com.bytedance.adsdk.vt.lh.vt.vm;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
final class ko {
    public static com.bytedance.adsdk.vt.lh.vt.le ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        boolean z10;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar;
        float f10;
        vm.ouw ouwVar;
        vm.vt vtVar2;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.vt.ra raVar2 = null;
        com.bytedance.adsdk.vt.lh.ouw.lh lhVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.le leVarVt = null;
        com.bytedance.adsdk.vt.lh.ouw.le leVarVt2 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        vm.ouw ouwVar2 = null;
        vm.vt vtVar3 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar4 = null;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.vt.lh.ouw.yu yuVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            z10 = zNextBoolean;
            vtVar = vtVar4;
            f10 = fNextDouble;
            switch (strNextName) {
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
                        while (jsonReader.hasNext()) {
                            vm.vt vtVar5 = vtVar3;
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            vm.ouw ouwVar3 = ouwVar2;
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                vtVarOuw2 = yu.ouw(jsonReader, raVar, true);
                            } else {
                                jsonReader.skipValue();
                            }
                            vtVar3 = vtVar5;
                            ouwVar2 = ouwVar3;
                        }
                        vm.ouw ouwVar4 = ouwVar2;
                        vm.vt vtVar6 = vtVar3;
                        jsonReader.endObject();
                        if (strNextString2.equals("o")) {
                            vtVar = vtVarOuw2;
                        } else if (strNextString2.equals("d") || strNextString2.equals("g")) {
                            raVar.mwh = true;
                            arrayList.add(vtVarOuw2);
                        }
                        vtVar3 = vtVar6;
                        ouwVar2 = ouwVar4;
                    }
                    ouwVar = ouwVar2;
                    vtVar2 = vtVar3;
                    jsonReader.endArray();
                    if (arrayList.size() != 1) {
                        vtVar4 = vtVar;
                        zNextBoolean = z10;
                        vtVar3 = vtVar2;
                        fNextDouble = f10;
                        ouwVar2 = ouwVar;
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        zNextBoolean = z10;
                        vtVar4 = vtVar;
                        vtVar3 = vtVar2;
                        fNextDouble = f10;
                        ouwVar2 = ouwVar;
                        break;
                    }
                    break;
                case "e":
                    leVarVt2 = yu.vt(jsonReader, raVar);
                    zNextBoolean = z10;
                    vtVar4 = vtVar;
                    fNextDouble = f10;
                    break;
                case "g":
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.hashCode();
                        if (strNextName3.equals(CampaignEx.JSON_KEY_AD_K)) {
                            lhVarOuw = yu.ouw(jsonReader, raVar, iNextInt);
                        } else if (strNextName3.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    zNextBoolean = z10;
                    vtVar4 = vtVar;
                    fNextDouble = f10;
                    break;
                case "o":
                    yuVar = yu.ouw(jsonReader, raVar);
                    zNextBoolean = z10;
                    vtVar4 = vtVar;
                    fNextDouble = f10;
                    break;
                case "s":
                    leVarVt = yu.vt(jsonReader, raVar);
                    zNextBoolean = z10;
                    vtVar4 = vtVar;
                    fNextDouble = f10;
                    break;
                case "t":
                    raVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.vt.lh.vt.ra.LINEAR : com.bytedance.adsdk.vt.lh.vt.ra.RADIAL;
                    zNextBoolean = z10;
                    vtVar4 = vtVar;
                    fNextDouble = f10;
                    break;
                case "w":
                    vtVarOuw = yu.ouw(jsonReader, raVar, true);
                    zNextBoolean = z10;
                    vtVar4 = vtVar;
                    fNextDouble = f10;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    vtVar4 = vtVar;
                    fNextDouble = f10;
                    break;
                case "lc":
                    ouwVar2 = vm.ouw.values()[jsonReader.nextInt() - 1];
                    zNextBoolean = z10;
                    vtVar4 = vtVar;
                    fNextDouble = f10;
                    break;
                case "lj":
                    vtVar3 = vm.vt.values()[jsonReader.nextInt() - 1];
                    zNextBoolean = z10;
                    vtVar4 = vtVar;
                    fNextDouble = f10;
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    zNextBoolean = z10;
                    vtVar4 = vtVar;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    zNextBoolean = z10;
                    vtVar4 = vtVar;
                    fNextDouble = f10;
                    break;
                default:
                    jsonReader.skipValue();
                    ouwVar = ouwVar2;
                    vtVar2 = vtVar3;
                    vtVar4 = vtVar;
                    zNextBoolean = z10;
                    vtVar3 = vtVar2;
                    fNextDouble = f10;
                    ouwVar2 = ouwVar;
                    break;
            }
        }
        vm.ouw ouwVar5 = ouwVar2;
        vm.vt vtVar7 = vtVar3;
        float f11 = fNextDouble;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar8 = vtVar4;
        boolean z11 = zNextBoolean;
        if (yuVar == null) {
            yuVar = new com.bytedance.adsdk.vt.lh.ouw.yu(Collections.singletonList(new com.bytedance.adsdk.vt.ra.ouw(100)));
        }
        return new com.bytedance.adsdk.vt.lh.vt.le(strNextString, raVar2, lhVarOuw, yuVar, leVarVt, leVarVt2, vtVarOuw, ouwVar5, vtVar7, f11, arrayList, vtVar8, z11);
    }
}
