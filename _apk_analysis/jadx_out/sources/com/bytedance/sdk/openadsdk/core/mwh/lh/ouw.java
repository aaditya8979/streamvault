package com.bytedance.sdk.openadsdk.core.mwh.lh;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import androidx.multidex.MultiDexExtractor;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.fkw;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.zin.ouw.yu;
import com.ironsource.G5;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static volatile ouw f13817lh;
    private String yu;
    private final Map<vpp, vt> fkw = new ConcurrentHashMap();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final Map<String, JSONObject> f13818le = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final AtomicBoolean f13819ra = new AtomicBoolean(false);
    private final Set<String> pno = Collections.synchronizedSet(new HashSet());
    public final ConcurrentHashMap<String, com.bytedance.sdk.component.ra.vt.ouw> ouw = new ConcurrentHashMap<>();
    public final Map<String, String> vt = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0235ouw {
        void ouw(boolean z10);
    }

    public static class vt {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public long f13823lh;
        public long ouw;
        public long vt;
        public long yu;

        private vt() {
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }
    }

    private ouw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject fkw(File file) {
        byte[] bArrYu;
        try {
            if (!le(file) || (bArrYu = ra.yu(file)) == null || bArrYu.length <= 0) {
                return null;
            }
            String strVt = TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat") ? com.bytedance.sdk.component.utils.ouw.vt(new String(bArrYu)) : com.bytedance.sdk.component.yu.ouw.vt(new String(bArrYu), com.bytedance.sdk.openadsdk.core.ouw.vt());
            if (TextUtils.isEmpty(strVt)) {
                return null;
            }
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(strVt);
            if (jSONObjectJsonObjectInit.length() > 0) {
                this.f13818le.put(file.getParentFile().getName(), jSONObjectJsonObjectInit);
            }
            return jSONObjectJsonObjectInit;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean le(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String lh() {
        File file = new File(yu(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static void lh(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    public static ouw ouw() {
        if (f13817lh == null) {
            synchronized (ouw.class) {
                if (f13817lh == null) {
                    f13817lh = new ouw();
                }
            }
        }
        return f13817lh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r7 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File ouw(java.io.File r7) {
        /*
        L0:
            r0 = 0
            if (r7 == 0) goto L44
            boolean r1 = r7.isDirectory()
            if (r1 == 0) goto L44
            java.io.File[] r1 = r7.listFiles()
            if (r1 == 0) goto L44
            int r2 = r1.length
            if (r2 != 0) goto L13
            goto L44
        L13:
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L16:
            if (r4 >= r2) goto L32
            r5 = r1[r4]
            if (r5 == 0) goto L2f
            boolean r6 = r5.isFile()
            if (r6 == 0) goto L2f
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "index.html"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L2f
            return r7
        L2f:
            int r4 = r4 + 1
            goto L16
        L32:
            int r7 = r1.length
        L33:
            if (r3 >= r7) goto L44
            r2 = r1[r3]
            if (r2 == 0) goto L41
            boolean r4 = r2.isDirectory()
            if (r4 == 0) goto L41
            r7 = r2
            goto L0
        L41:
            int r3 = r3 + 1
            goto L33
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw(java.io.File):java.io.File");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final InterfaceC0235ouw interfaceC0235ouw, final boolean z10) {
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.3
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC0235ouw interfaceC0235ouw2 = interfaceC0235ouw;
                if (interfaceC0235ouw2 != null) {
                    interfaceC0235ouw2.ouw(z10);
                }
            }
        });
    }

    public static void vt(File file) {
        lh(file);
        try {
            bly blyVarOuw = bly.ouw();
            if (blyVarOuw.ryl == null) {
                blyVarOuw.ryl = new lh((byte) 0);
            }
            blyVarOuw.ryl.ouw(file);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ File yu(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return le(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    private String yu() {
        if (TextUtils.isEmpty(this.yu)) {
            try {
                File file = new File(zih.ouw().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.yu = file.getAbsolutePath();
            } catch (Throwable th2) {
                qbp.lh("PlayableCache", "init root path error: ".concat(String.valueOf(th2)));
            }
        }
        return this.yu;
    }

    public final WebResourceResponse ouw(String str, String str2, String str3) {
        String mimeTypeFromExtension;
        File fileOuw;
        String strReplace;
        JSONObject jSONObject;
        String strOptString;
        String strSubstring = str2;
        String strSubstring2 = str3;
        try {
            WebResourceResponse webResourceResponseVt = com.bytedance.sdk.openadsdk.zin.ouw.lh.ouw().vt(strSubstring2);
            if (webResourceResponseVt != null) {
                return webResourceResponseVt;
            }
            if (!this.f13819ra.get()) {
                return null;
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return null;
            }
            boolean z10 = true;
            try {
                if ((strSubstring2.startsWith("http://") || strSubstring2.startsWith("https://")) && strSubstring2.contains("?")) {
                    strSubstring2 = strSubstring2.split("\\?")[0];
                    if (strSubstring2.endsWith("/")) {
                        strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 1);
                    }
                }
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(strSubstring2));
            } catch (Throwable unused) {
                mimeTypeFromExtension = null;
            }
            if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                return null;
            }
            String strOuw = fkw.ouw(str);
            if (TextUtils.isEmpty(strOuw)) {
                return null;
            }
            String str4 = this.vt.get(strOuw);
            if (TextUtils.isEmpty(str4)) {
                fileOuw = ouw(new File(lh(), strOuw));
                if (fileOuw != null && fileOuw.exists()) {
                    this.vt.put(strOuw, fileOuw.getAbsolutePath());
                }
            } else {
                fileOuw = new File(str4);
            }
            if (fileOuw == null || !fileOuw.exists()) {
                return null;
            }
            if (TextUtils.isEmpty(str2)) {
                strReplace = null;
            } else {
                String[] strArrSplit = strSubstring.split("\\?");
                if (strArrSplit != null && strArrSplit.length == 2) {
                    String str5 = strArrSplit[0];
                    if (str5 != null && str5.endsWith("/")) {
                        strSubstring = strSubstring.substring(0, strArrSplit.length - 1);
                    }
                    String str6 = strArrSplit[0];
                    if (str6 != null && str6.endsWith("index.html")) {
                        strSubstring = strArrSplit[0];
                    }
                }
                strReplace = strSubstring.replace("index.html", "");
            }
            if (TextUtils.isEmpty(strReplace)) {
                return null;
            }
            String strReplace2 = strSubstring2.replace(strReplace, "");
            if (!TextUtils.isEmpty(strReplace2) && !strReplace2.startsWith("https://") && !strReplace2.startsWith("http://")) {
                File file = new File(fileOuw, strReplace2);
                if (!file.exists()) {
                    return null;
                }
                if (!file.exists() || ((jSONObject = this.f13818le.get(strOuw)) != null && ((strOptString = jSONObject.optString(strReplace2)) == null || !strOptString.equalsIgnoreCase(fkw.ouw(file))))) {
                    z10 = false;
                }
                if (z10 && file.getCanonicalPath().startsWith(fileOuw.getCanonicalPath())) {
                    return new WebResourceResponse(mimeTypeFromExtension, G5.N, new FileInputStream(file));
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            qbp.ouw("PlayableCache", "playable intercept error: ", th2);
            return null;
        }
    }

    @SuppressLint({"[ByDesign4.2]BadDomainNameVerifier"})
    public final void ouw(final vpp vppVar, final InterfaceC0235ouw interfaceC0235ouw) {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        File file;
        AdSlot adSlot;
        byte b10 = 0;
        if (yu.ouw().vt() && vppVar != null && od.le(vppVar) && (adSlot = vppVar.yiz) != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, -705, "server bidding pre render");
            ouw(interfaceC0235ouw, false);
            return;
        }
        if (vppVar == null || (vtVar = vppVar.f13788sd) == null || TextUtils.isEmpty(vtVar.bly)) {
            com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, -701, null);
            ouw(interfaceC0235ouw, false);
            return;
        }
        final String str = vppVar.f13788sd.bly;
        if (this.pno.contains(str)) {
            return;
        }
        Map<vpp, vt> map = this.fkw;
        vt vtVar2 = new vt(b10);
        vtVar2.ouw = System.currentTimeMillis();
        map.put(vppVar, vtVar2);
        com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar);
        String strOuw = fkw.ouw(str);
        final File file2 = new File(lh(), strOuw);
        String str2 = this.vt.get(strOuw);
        if (TextUtils.isEmpty(str2)) {
            file = ouw(file2);
            if (file != null && file.exists()) {
                this.vt.put(strOuw, file.getAbsolutePath());
            }
        } else {
            file = new File(str2);
        }
        if (file != null && file.exists()) {
            com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, -702, null);
            lh(file2);
            this.fkw.remove(vppVar);
            ouw(interfaceC0235ouw, true);
            return;
        }
        try {
            ra.lh(file2);
        } catch (Throwable unused) {
        }
        this.pno.add(str);
        File file3 = new File(yu(), strOuw + MultiDexExtractor.EXTRACTED_SUFFIX);
        com.bytedance.sdk.component.ra.vt.ouw ouwVarLh = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.lh();
        this.ouw.put(str, ouwVarLh);
        ouwVarLh.ouw(str);
        ouwVarLh.ouw(file3.getParent(), file3.getName());
        ouwVarLh.f12777ra = 7;
        ouwVarLh.f12776le = "playable_download";
        ouwVarLh.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.2
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, final com.bytedance.sdk.component.ra.vt vtVar3) {
                File file4;
                ouw.this.pno.remove(str);
                ouw.this.ouw.remove(str);
                final vt vtVar4 = (vt) ouw.this.fkw.remove(vppVar);
                if (vtVar4 != null) {
                    vtVar4.vt = System.currentTimeMillis();
                }
                if (vtVar3.pno && (file4 = vtVar3.f12775ra) != null && file4.exists()) {
                    ko.lh("PlayableCache", "onResponse: Playable zip download success");
                    bs.vt(new pno("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z10;
                            long j10;
                            try {
                                vt vtVar5 = vtVar4;
                                if (vtVar5 != null) {
                                    vtVar5.f13823lh = System.currentTimeMillis();
                                }
                                uq.ouw(vtVar3.f12775ra.getAbsolutePath(), file2.getAbsolutePath(), (String) null);
                                vt vtVar6 = vtVar4;
                                if (vtVar6 != null) {
                                    vtVar6.yu = System.currentTimeMillis();
                                }
                                vt vtVar7 = vtVar4;
                                long j11 = 0;
                                if (vtVar7 != null) {
                                    j11 = vtVar7.vt - vtVar7.ouw;
                                    j10 = vtVar7.yu - vtVar7.f13823lh;
                                } else {
                                    j10 = 0;
                                }
                                vpp vppVar2 = vppVar;
                                if (vppVar2 != null && (od.lh(vppVar2) || od.vt(vppVar2))) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("loadzip_success_time", j11);
                                        jSONObject.put("unzip_success_time", j10);
                                    } catch (JSONException e10) {
                                        qbp.ouw("PlayableEvent", "onSuccess json error", e10);
                                    }
                                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar2, "playable_preload", "preload_success", jSONObject);
                                }
                                ouw.vt(file2);
                                try {
                                    File fileOuw = ouw.ouw(file2);
                                    if (fileOuw != null && fileOuw.exists()) {
                                        ouw.this.vt.put(file2.getName(), fileOuw.getAbsolutePath());
                                    }
                                    ouw.this.fkw(ouw.yu(fileOuw));
                                } catch (Throwable unused2) {
                                }
                                z10 = true;
                            } catch (Throwable th2) {
                                qbp.ouw("PlayableCache", "unzip error: ", th2);
                                com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, -704, th2.getMessage());
                                z10 = false;
                            }
                            try {
                                vtVar3.f12775ra.delete();
                            } catch (Throwable unused3) {
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            ouw.this.ouw(interfaceC0235ouw, z10);
                        }
                    });
                } else {
                    int i10 = vtVar3.ouw;
                    com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, i10 != 0 ? i10 : -700, null);
                    ko.lh("PlayableCache", "onResponse: Playable zip download fail");
                    ouw.this.ouw(interfaceC0235ouw, false);
                }
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                ouw.this.pno.remove(str);
                ouw.this.ouw.remove(str);
                ouw.this.fkw.remove(vppVar);
                com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, -700, iOException.getMessage());
                ouw.this.ouw(interfaceC0235ouw, false);
                ko.lh("PlayableCache", "onFailure: Playable zip download fail");
            }
        });
    }

    public final boolean ouw(vpp vppVar) {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        String str;
        if (this.f13819ra.get() && vppVar != null && (vtVar = vppVar.f13788sd) != null && (str = vtVar.bly) != null) {
            try {
                if (!TextUtils.isEmpty(this.vt.get(fkw.ouw(str)))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final void vt() {
        if (this.f13819ra.get()) {
            return;
        }
        bs.ouw(new pno("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                File[] fileArrListFiles;
                try {
                    String strLh = ouw.this.lh();
                    if (!TextUtils.isEmpty(strLh)) {
                        File file = new File(strLh);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        File fileOuw = ouw.ouw(file2);
                                        if (fileOuw != null && fileOuw.exists()) {
                                            ouw.this.vt.put(file2.getName(), fileOuw.getAbsolutePath());
                                        }
                                        ouw.this.fkw(ouw.yu(fileOuw));
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.zin.ouw.lh.ouw().ouw(ouw.this.vt);
                ouw.this.f13819ra.set(true);
            }
        });
    }
}
