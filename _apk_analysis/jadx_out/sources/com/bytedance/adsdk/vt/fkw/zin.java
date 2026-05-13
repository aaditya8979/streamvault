package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.vt.lh.lh.fkw;
import com.bytedance.adsdk.vt.tlj;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zin {
    private static List<tlj.ouw> lh(JsonReader jsonReader) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                tlj.ouw ouwVar = new tlj.ouw();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    byte b10 = -1;
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 99) {
                        if (iHashCode != 102) {
                            if (iHashCode != 108) {
                                if (iHashCode != 115) {
                                    if (iHashCode != 3153) {
                                        if (iHashCode != 3449) {
                                            if (iHashCode == 96670 && strNextName.equals("ali")) {
                                                b10 = 6;
                                            }
                                        } else if (strNextName.equals("le")) {
                                            b10 = 1;
                                        }
                                    } else if (strNextName.equals("bs")) {
                                        b10 = 5;
                                    }
                                } else if (strNextName.equals("s")) {
                                    b10 = 2;
                                }
                            } else if (strNextName.equals("l")) {
                                b10 = 0;
                            }
                        } else if (strNextName.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                            b10 = 4;
                        }
                    } else if (strNextName.equals("c")) {
                        b10 = 3;
                    }
                    switch (b10) {
                        case 0:
                            ouwVar.ouw = jsonReader.nextInt();
                            break;
                        case 1:
                            ouwVar.vt = jsonReader.nextInt();
                            break;
                        case 2:
                            ouwVar.fkw = jsonReader.nextInt();
                            break;
                        case 3:
                            ouwVar.f12197lh = jsonReader.nextString();
                            break;
                        case 4:
                            ouwVar.yu = jsonReader.nextString();
                            break;
                        case 5:
                            ouwVar.f12196le = jsonReader.nextInt();
                            break;
                        case 6:
                            ouwVar.f12198ra = jsonReader.nextString();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                arrayList.add(ouwVar);
            }
            return arrayList;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static Map<String, Object> ouw(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("lel")) {
                map.put("lel", vt(jsonReader));
            } else if (strNextName.equals("lottie_back")) {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.hashCode();
                    if (strNextName2.equals("hd")) {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ouw(android.util.JsonReader r7, com.bytedance.adsdk.vt.ra.lh r8) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.fkw.zin.ouw(android.util.JsonReader, com.bytedance.adsdk.vt.ra$lh):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ouw(android.util.JsonReader r9, com.bytedance.adsdk.vt.ra.ouw r10) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.fkw.zin.ouw(android.util.JsonReader, com.bytedance.adsdk.vt.ra$ouw):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ouw(android.util.JsonReader r7, com.bytedance.adsdk.vt.ra.vt r8) {
        /*
            r7.beginObject()     // Catch: java.lang.Exception -> L95
        L3:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L91
            java.lang.String r0 = r7.nextName()     // Catch: java.lang.Exception -> L95
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L95
            r2 = 3239(0xca7, float:4.539E-42)
            r3 = -1
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == r2) goto L38
            r2 = 107027(0x1a213, float:1.49977E-40)
            if (r1 == r2) goto L2e
            r2 = 3237004(0x31648c, float:4.536009E-39)
            if (r1 == r2) goto L24
            goto L42
        L24:
            java.lang.String r1 = "inel"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L42
            r0 = r5
            goto L43
        L2e:
            java.lang.String r1 = "lel"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L42
            r0 = r4
            goto L43
        L38:
            java.lang.String r1 = "el"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L42
            r0 = r6
            goto L43
        L42:
            r0 = r3
        L43:
            if (r0 == 0) goto L5b
            if (r0 == r6) goto L54
            if (r0 == r4) goto L4d
            r7.skipValue()     // Catch: java.lang.Exception -> L95
            goto L3
        L4d:
            org.json.JSONArray r0 = vt(r7)     // Catch: java.lang.Exception -> L95
            r8.f12182lh = r0     // Catch: java.lang.Exception -> L95
            goto L3
        L54:
            java.lang.String r0 = r7.nextString()     // Catch: java.lang.Exception -> L95
            r8.ouw = r0     // Catch: java.lang.Exception -> L95
            goto L3
        L5b:
            int[][] r0 = new int[r6][]     // Catch: java.lang.Exception -> L95
            int[] r1 = new int[r4]     // Catch: java.lang.Exception -> L95
            r1[r5] = r3     // Catch: java.lang.Exception -> L95
            r1[r6] = r3     // Catch: java.lang.Exception -> L95
            r0[r5] = r1     // Catch: java.lang.Exception -> L95
            r8.vt = r0     // Catch: java.lang.Exception -> L95
            r7.beginArray()     // Catch: java.lang.Exception -> L95
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L8c
            r7.beginArray()     // Catch: java.lang.Exception -> L95
            r0 = r5
        L74:
            if (r0 >= r4) goto L89
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L95
            if (r1 == 0) goto L86
            int[][] r1 = r8.vt     // Catch: java.lang.Exception -> L95
            r1 = r1[r5]     // Catch: java.lang.Exception -> L95
            int r2 = r7.nextInt()     // Catch: java.lang.Exception -> L95
            r1[r0] = r2     // Catch: java.lang.Exception -> L95
        L86:
            int r0 = r0 + 1
            goto L74
        L89:
            r7.endArray()     // Catch: java.lang.Exception -> L95
        L8c:
            r7.endArray()     // Catch: java.lang.Exception -> L95
            goto L3
        L91:
            r7.endObject()     // Catch: java.lang.Exception -> L95
            return
        L95:
            r7 = move-exception
            r7.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.fkw.zin.ouw(android.util.JsonReader, com.bytedance.adsdk.vt.ra$vt):void");
    }

    public static void ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, SparseArray<com.bytedance.adsdk.vt.lh.yu> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            double dNextDouble = 0.0d;
            double dNextDouble2 = 0.0d;
            char cCharAt = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "fFamily":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "w":
                        dNextDouble = jsonReader.nextDouble();
                        break;
                    case "ch":
                        cCharAt = jsonReader.nextString().charAt(0);
                        break;
                    case "data":
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            if ("shapes".equals(jsonReader.nextName())) {
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add((com.bytedance.adsdk.vt.lh.vt.rn) pno.ouw(jsonReader, raVar));
                                }
                                jsonReader.endArray();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        break;
                    case "size":
                        dNextDouble2 = jsonReader.nextDouble();
                        break;
                    case "style":
                        strNextString = jsonReader.nextString();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            com.bytedance.adsdk.vt.lh.yu yuVar = new com.bytedance.adsdk.vt.lh.yu(arrayList, cCharAt, dNextDouble2, dNextDouble, strNextString, strNextString2);
            sparseArray.put(yuVar.hashCode(), yuVar);
        }
        jsonReader.endArray();
    }

    public static void ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, List<com.bytedance.adsdk.vt.lh.lh.fkw> list, LongSparseArray<com.bytedance.adsdk.vt.lh.lh.fkw> longSparseArray) throws IOException {
        jsonReader.beginArray();
        int i10 = 0;
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.vt.lh.lh.fkw fkwVarOuw = qbp.ouw(jsonReader, raVar);
            if (fkwVarOuw.fkw == fkw.ouw.IMAGE) {
                i10++;
            }
            list.add(fkwVarOuw);
            longSparseArray.put(fkwVarOuw.yu, fkwVarOuw);
            if (i10 > 4) {
                com.bytedance.adsdk.vt.le.yu.vt("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ouw(android.util.JsonReader r17, com.bytedance.adsdk.vt.ra r18, java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.vt.lh.lh.fkw>> r19, java.util.Map<java.lang.String, com.bytedance.adsdk.vt.tlj> r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.fkw.zin.ouw(android.util.JsonReader, com.bytedance.adsdk.vt.ra, java.util.Map, java.util.Map):void");
    }

    public static void ouw(JsonReader jsonReader, List<com.bytedance.adsdk.vt.lh.le> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String strNextString = null;
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.vt.lh.le(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }

    public static void ouw(JsonReader jsonReader, Map<String, com.bytedance.adsdk.vt.lh.lh> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("list")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    float fNextDouble = 0.0f;
                    jsonReader.beginObject();
                    String strNextString = null;
                    String strNextString2 = null;
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        switch (strNextName2) {
                            case "fFamily":
                                strNextString = jsonReader.nextString();
                                break;
                            case "ascent":
                                fNextDouble = (float) jsonReader.nextDouble();
                                break;
                            case "fStyle":
                                strNextString3 = jsonReader.nextString();
                                break;
                            case "fName":
                                strNextString2 = jsonReader.nextString();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    com.bytedance.adsdk.vt.lh.lh lhVar = new com.bytedance.adsdk.vt.lh.lh(strNextString, strNextString2, strNextString3, fNextDouble);
                    map.put(lhVar.vt, lhVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static JSONArray vt(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    byte b10 = -1;
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3324) {
                        if (iHashCode == 116753 && strNextName.equals("vid")) {
                            b10 = 0;
                        }
                    } else if (strNextName.equals("hd")) {
                        b10 = 1;
                    }
                    if (b10 == 0) {
                        try {
                            jSONObject.put("vid", jsonReader.nextString());
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    } else if (b10 != 1) {
                        jsonReader.skipValue();
                    } else {
                        try {
                            jSONObject.put("hd", jsonReader.nextInt());
                        } catch (JSONException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return jSONArray;
    }
}
