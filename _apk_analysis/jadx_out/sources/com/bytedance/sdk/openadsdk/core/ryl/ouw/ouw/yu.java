package com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ryl.lh.ouw;
import com.bytedance.sdk.openadsdk.core.ryl.ouw.vt;
import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
public final class yu extends com.bytedance.sdk.openadsdk.core.ryl.ouw.vt {

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static final String f13946ra = null;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public ouw.vt f13948lh;
        public String ouw;
        public ouw.EnumC0241ouw vt;
        public String yu;
        public final List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> fkw = new ArrayList();

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public final List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f13947le = new ArrayList();

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public float f13949ra = Float.MIN_VALUE;

        public ouw() {
        }

        public ouw(String str, ouw.EnumC0241ouw enumC0241ouw, ouw.vt vtVar) {
            ouw(str, enumC0241ouw, vtVar);
        }

        public final void ouw(String str, ouw.EnumC0241ouw enumC0241ouw, ouw.vt vtVar) {
            this.ouw = str;
            this.vt = enumC0241ouw;
            this.f13948lh = vtVar;
        }
    }

    public yu(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0109. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06a4  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.sdk.openadsdk.core.ryl.ouw ouw(org.xmlpull.v1.XmlPullParser r42, java.util.List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu.ouw(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.ryl.ouw");
    }

    public static String ouw(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = f13946ra;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    private static List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> ouw(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        lh.ouw ouwVar = new lh.ouw(str);
        ouwVar.ouw = z10;
        return Collections.singletonList(ouwVar.ouw());
    }

    public static List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> ouw(XmlPullParser xmlPullParser, String str, boolean z10) throws XmlPullParserException, IOException {
        return ouw(ouw(xmlPullParser, str), z10);
    }

    private void ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar) {
        if (this.f13950le == null) {
            this.f13950le = new vt.ouw();
        }
        vt.ouw ouwVar2 = this.f13950le;
        ouwVar2.ouw = this.fkw;
        ouwVar2.vt = this.ouw;
        if (ouwVar != null) {
            ouwVar2.f13952lh = ouwVar.ouw.ouw.vt.size() <= 0;
        }
    }

    public static void ouw(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static int vt(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.sdk.openadsdk.core.ryl.ouw vt(org.xmlpull.v1.XmlPullParser r18, java.util.List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu.vt(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.ryl.ouw");
    }

    public static void vt(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == 3) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.ryl.ouw.vt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.sdk.openadsdk.core.ryl.ouw ouw(java.lang.String r5, java.io.File r6, java.util.List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            r4.fkw = r0
            android.content.Context r1 = r4.vt
            r2 = 0
            if (r1 != 0) goto Lc
            r5 = -1
            r4.fkw = r5
            return r2
        Lc:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L18
            if (r6 != 0) goto L18
            r5 = -2
            r4.fkw = r5
            return r2
        L18:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r3 = "UTF-8"
            if (r1 != 0) goto L2a
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            byte[] r5 = r5.getBytes(r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            goto L30
        L2a:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r6 = r5
        L30:
            org.xmlpull.v1.XmlPullParser r5 = android.util.Xml.newPullParser()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r5.setFeature(r1, r0)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            r5.setInput(r6, r3)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            r5.nextTag()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            com.bytedance.sdk.openadsdk.core.ryl.ouw r5 = r4.ouw(r5, r7)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            r4.ouw(r5)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L59
            r6.close()     // Catch: java.io.IOException -> L49
        L49:
            return r5
        L4a:
            r5 = move-exception
            goto L5b
        L4c:
            r6 = r2
        L4d:
            r5 = -3
            r4.fkw = r5     // Catch: java.lang.Throwable -> L59
            r4.ouw(r2)     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L58
            r6.close()     // Catch: java.io.IOException -> L58
        L58:
            return r2
        L59:
            r5 = move-exception
            r2 = r6
        L5b:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L60
        L60:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu.ouw(java.lang.String, java.io.File, java.util.List):com.bytedance.sdk.openadsdk.core.ryl.ouw");
    }
}
