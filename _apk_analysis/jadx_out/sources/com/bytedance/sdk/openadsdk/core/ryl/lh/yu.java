package com.bytedance.sdk.openadsdk.core.ryl.lh;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.fkw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.ouw.vt;
import com.bytedance.sdk.openadsdk.core.zih;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class yu {
    public static final List<String> ouw = Arrays.asList("video/mp4", "video/3gpp");
    private static final ConcurrentHashMap<String, Boolean> vt = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double ouw(int r6, double r7, int r9, int r10, int r11, @androidx.annotation.Nullable java.lang.String r12) {
        /*
            r0 = 0
            if (r10 <= 0) goto L8
            double r2 = (double) r9
            double r4 = (double) r10
            double r2 = r2 / r4
            goto L9
        L8:
            r2 = r0
        L9:
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 <= 0) goto L13
            double r7 = r7 - r2
            double r7 = java.lang.Math.abs(r7)
            goto L14
        L13:
            r7 = r0
        L14:
            if (r6 <= 0) goto L1f
            int r9 = r6 - r9
            int r9 = r9 / r6
            int r6 = java.lang.Math.abs(r9)
            double r9 = (double) r6
            goto L20
        L1f:
            r9 = r0
        L20:
            double r7 = r7 + r9
            r6 = 0
            int r9 = java.lang.Math.max(r11, r6)
            r10 = 1500(0x5dc, float:2.102E-42)
            r11 = 700(0x2bc, float:9.81E-43)
            if (r11 > r9) goto L2f
            if (r9 > r10) goto L2f
            goto L49
        L2f:
            int r11 = 700 - r9
            int r11 = java.lang.Math.abs(r11)
            float r11 = (float) r11
            r0 = 1143930880(0x442f0000, float:700.0)
            float r11 = r11 / r0
            double r0 = (double) r11
            int r10 = r10 - r9
            int r9 = java.lang.Math.abs(r10)
            float r9 = (float) r9
            r10 = 1153138688(0x44bb8000, float:1500.0)
            float r9 = r9 / r10
            double r9 = (double) r9
            double r0 = java.lang.Math.min(r0, r9)
        L49:
            if (r12 != 0) goto L4d
            java.lang.String r12 = ""
        L4d:
            r9 = -1
            int r10 = r12.hashCode()
            r11 = -1664118616(0xffffffff9ccf90a8, float:-1.3735504E-21)
            if (r10 == r11) goto L66
            r11 = 1331848029(0x4f62635d, float:3.7981627E9)
            if (r10 == r11) goto L5d
            goto L70
        L5d:
            java.lang.String r10 = "video/mp4"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L70
            goto L71
        L66:
            java.lang.String r6 = "video/3gpp"
            boolean r6 = r12.equals(r6)
            if (r6 == 0) goto L70
            r6 = 1
            goto L71
        L70:
            r6 = r9
        L71:
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r6 == 0) goto L77
            r11 = r9
            goto L79
        L77:
            r11 = 4609434218613702656(0x3ff8000000000000, double:1.5)
        L79:
            double r7 = r7 + r9
            double r7 = r7 + r0
            double r9 = r9 / r7
            double r11 = r11 * r9
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(int, double, int, int, int, java.lang.String):double");
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        List<vpp> list = ouwVar.yu;
        if (list != null) {
            Iterator<vpp> it = list.iterator();
            while (it.hasNext()) {
                ouw(it.next());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ouw(final com.bytedance.sdk.openadsdk.core.model.vpp r12) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(com.bytedance.sdk.openadsdk.core.model.vpp):void");
    }

    public static void ouw(final vpp vppVar, final String str, final com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar, final long j10, final vt.ouw ouwVar2) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new pno("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.5
            @Override // java.lang.Runnable
            public final void run() {
                com.bytedance.sdk.openadsdk.core.ryl.vt vtVar;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j10);
                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar3 = ouwVar;
                    String str2 = "load_vast_fail";
                    if (ouwVar3 == null) {
                        vt.ouw ouwVar4 = ouwVar2;
                        if (ouwVar4 != null) {
                            jSONObject.put("error_code", ouwVar4.ouw);
                        }
                    } else if (TextUtils.isEmpty(ouwVar3.ouw()) || TextUtils.isEmpty(ouwVar.f13940le) || ouwVar.pno <= 0.0d) {
                        jSONObject.put("error_code", -3);
                    } else {
                        str2 = "load_vast_success";
                    }
                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar5 = ouwVar;
                    if (ouwVar5 == null || (vtVar = ouwVar5.vt) == null || !TextUtils.isEmpty(vtVar.le())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put(UnifiedMediationParams.KEY_DESCRIPTION, "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, str, "load_vast_icon_fail", jSONObject2);
                    ouwVar.ouw((com.bytedance.sdk.openadsdk.core.ryl.vt) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ouw(vpp vppVar, final String str, final boolean z10, final long j10) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, vppVar.vt(), "track_url_request_result", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.3
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put("duration", j10);
                    jSONObject.put("success", z10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    private static void vt() {
        File[] fileArrListFiles = ra.ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh(), new File(CacheDirFactory.getRootDir()).getName() + "/vast/").listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 5) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file, File file2) {
                File file3 = file;
                File file4 = file2;
                if (file3.lastModified() < file4.lastModified()) {
                    return -1;
                }
                return file3.lastModified() > file4.lastModified() ? 1 : 0;
            }
        });
        int length = fileArrListFiles.length - 5;
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < length; i10++) {
            File file = fileArrListFiles[i10];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(vpp vppVar, File file, fkw.ouw ouwVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu(zih.ouw(), 0, 0);
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVarOuw = yuVar.ouw((String) null, file, new ArrayList());
        if (ouwVarOuw != null) {
            com.bytedance.sdk.openadsdk.core.model.yu yuVar2 = ouwVarOuw.ouw;
            ouwVar.f13661lh = yuVar2.ouw;
            ouwVar.yu = yuVar2.vt;
        }
        ouw(vppVar, ouwVar.ouw, true, j10);
        vt(vppVar, "vast_url", ouwVarOuw, jElapsedRealtime, yuVar.f13950le);
        vt();
    }

    private static void vt(final vpp vppVar, final String str, final com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar, final long j10, final vt.ouw ouwVar2) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new pno("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j10);
                    jSONObject.put(TypedValues.TransitionType.S_FROM, str);
                    if (ouwVar != null) {
                        vpp vppVar2 = vppVar;
                        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar2, vppVar2.vt(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    vt.ouw ouwVar3 = ouwVar2;
                    if (ouwVar3 != null) {
                        jSONObject.put("error_code", ouwVar3.ouw);
                    }
                    vpp vppVar3 = vppVar;
                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar3, vppVar3.vt(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }
}
