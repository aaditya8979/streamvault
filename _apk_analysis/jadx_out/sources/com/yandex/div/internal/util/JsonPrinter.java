package com.yandex.div.internal.util;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.i;

/* JADX INFO: compiled from: JsonPrinter.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class JsonPrinter {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int indentSpaces;
    private final int nestingLimit;

    /* JADX INFO: compiled from: JsonPrinter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public JsonPrinter(int i10, int i11) {
        this.indentSpaces = i10;
        this.nestingLimit = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final org.json.JSONArray deepCopy(org.json.JSONArray r7, int r8) {
        /*
            r6 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r1 = r7.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L38
            java.lang.Object r3 = r7.opt(r2)
            boolean r4 = r3 instanceof org.json.JSONObject
            java.lang.String r5 = "..."
            if (r4 == 0) goto L23
            if (r8 != 0) goto L1a
        L18:
            r3 = r5
            goto L32
        L1a:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r4 = r8 + (-1)
            org.json.JSONObject r3 = r6.deepCopy(r3, r4)
            goto L32
        L23:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L32
            if (r8 != 0) goto L2a
            goto L18
        L2a:
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r4 = r8 + (-1)
            org.json.JSONArray r3 = r6.deepCopy(r3, r4)
        L32:
            r0.put(r3)
            int r2 = r2 + 1
            goto La
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.util.JsonPrinter.deepCopy(org.json.JSONArray, int):org.json.JSONArray");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final org.json.JSONObject deepCopy(org.json.JSONObject r7, int r8) throws org.json.JSONException {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Iterator r1 = r7.keys()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.opt(r2)
            boolean r4 = r3 instanceof org.json.JSONObject
            java.lang.String r5 = "..."
            if (r4 == 0) goto L2c
            if (r8 != 0) goto L23
        L21:
            r3 = r5
            goto L3b
        L23:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r4 = r8 + (-1)
            org.json.JSONObject r3 = r6.deepCopy(r3, r4)
            goto L3b
        L2c:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L3b
            if (r8 != 0) goto L33
            goto L21
        L33:
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r4 = r8 + (-1)
            org.json.JSONArray r3 = r6.deepCopy(r3, r4)
        L3b:
            r0.put(r2, r3)
            goto L9
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.util.JsonPrinter.deepCopy(org.json.JSONObject, int):org.json.JSONObject");
    }

    @NotNull
    public final String print(@NotNull JSONArray jSONArray) throws JSONException {
        JSONArray jSONArrayDeepCopy = deepCopy(jSONArray, this.nestingLimit);
        int i10 = this.indentSpaces;
        return i10 == 0 ? jSONArrayDeepCopy.toString() : jSONArrayDeepCopy.toString(i10);
    }

    @NotNull
    public final String print(@NotNull JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectDeepCopy = deepCopy(jSONObject, this.nestingLimit);
        int i10 = this.indentSpaces;
        return i10 == 0 ? jSONObjectDeepCopy.toString() : jSONObjectDeepCopy.toString(i10);
    }
}
