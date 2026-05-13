package com.bytedance.sdk.component.adexpress.ouw.vt;

import android.text.TextUtils;
import android.util.Pair;
import androidx.multidex.MultiDexExtractor;
import com.bytedance.sdk.component.adexpress.ouw.lh.ouw;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.uq;
import com.ironsource.G5;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lh {
    public static boolean lh(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar2) {
        boolean z10 = true;
        if (ouwVar != null) {
            try {
                if (!TextUtils.isEmpty(ouwVar.ouw)) {
                    if (ouwVar2 == null) {
                        return false;
                    }
                    String str = ouwVar.yu;
                    String str2 = ouwVar2.yu;
                    if ((!TextUtils.isEmpty(str2) && !str2.equals(str)) || ouw(ouwVar.ouw, ouwVar2.ouw)) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map = ouwVar.fkw;
                    Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map2 = ouwVar2.fkw;
                    if (map.isEmpty()) {
                        ko.vt("PlayComponentEngineCacheManager", "old engine is empty");
                        return !map2.isEmpty();
                    }
                    if (map2.isEmpty()) {
                        return false;
                    }
                    if (map.size() == map2.size()) {
                        for (String str3 : map2.keySet()) {
                            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar3 = map.get(str3);
                            if (ouwVar3 == null) {
                                break;
                            }
                            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar4 = map2.get(str3);
                            if (ouwVar4 == null) {
                                break;
                            }
                            if (ouw(ouwVar3.ouw, ouwVar4.ouw)) {
                                break;
                            }
                        }
                        z10 = false;
                    }
                    ko.vt("PlayComponentEngineCacheManager", "update:".concat(String.valueOf(z10)));
                    return z10;
                }
            } catch (Throwable th2) {
                ko.vt("PlayComponentEngineCacheManager", th2.getMessage());
                return false;
            }
        }
        return true;
    }

    public static void ouw(File file, com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, String str) {
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        JSONObject jSONObjectLh;
        if (ouwVar == null) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        String string = (!ouwVar.vt() || (jSONObjectLh = ouwVar.lh()) == null) ? null : jSONObjectLh.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(file3);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileOutputStreamFileOutputStreamCtor.write(string.getBytes(G5.N));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            try {
                fileOutputStreamFileOutputStreamCtor.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
            try {
                ko.lh("PlayComponentEngineCacheManager", "version save error3", th);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Throwable th4) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th4;
            }
        }
    }

    public static boolean ouw(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, String str) {
        if (ouwVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(ouwVar.ouw)) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return ouw(ouwVar.ouw, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean ouw(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r7.length
            int r1 = r6.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            int r3 = r3.length()
            r4 = r6[r2]
            int r4 = r4.length()
            int r3 = r3 - r4
            r4 = 1
            if (r3 != 0) goto L3f
            r3 = r7[r2]
            r5 = r6[r2]
            int r3 = r3.compareTo(r5)
            if (r3 <= 0) goto L2f
            return r4
        L2f:
            if (r3 >= 0) goto L32
            return r1
        L32:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L3c
            int r7 = r7.length
            int r6 = r6.length
            if (r7 <= r6) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            int r2 = r2 + 1
            goto L12
        L3f:
            if (r3 <= 0) goto L42
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.ouw.vt.lh.ouw(java.lang.String, java.lang.String):boolean");
    }

    private boolean ouw(List<ouw.C0194ouw> list, List<ouw.C0194ouw> list2) {
        File file;
        for (ouw.C0194ouw c0194ouw : list) {
            String str = c0194ouw.ouw;
            String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(str);
            File file2 = new File(ouw(), strOuw);
            File file3 = new File(file2 + ".tmp");
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused) {
                }
            }
            if (file3.exists()) {
                try {
                    file3.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.ra.vt.ouw ouwVarLe = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f12430lh.le();
            ouwVarLe.ouw(str);
            ouwVarLe.ouw(ouw().getAbsolutePath(), strOuw);
            com.bytedance.sdk.component.ra.vt vtVarOuw = ouwVarLe.ouw();
            list2.add(c0194ouw);
            if (vtVarOuw == null || !vtVarOuw.pno || (file = vtVarOuw.f12775ra) == null || !file.exists()) {
                vt(list2);
                ko.vt("PlayComponentEngineCacheManager", "really download error");
                return false;
            }
        }
        return true;
    }

    public static void vt(File file, com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, String str) {
        if (ouwVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
            ko.vt("PlayComponentEngineCacheManager", "clear() pkgjson target error");
        }
        if (ouwVar.ouw() != null) {
            Iterator<ouw.C0194ouw> it = ouwVar.ouw().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.fkw.ouw(it.next().ouw)).delete();
                } catch (Throwable unused2) {
                    ko.vt("PlayComponentEngineCacheManager", "clear() resource target error");
                }
            }
        }
    }

    private void vt(List<ouw.C0194ouw> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<ouw.C0194ouw> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(ouw(), com.bytedance.sdk.component.utils.fkw.ouw(it.next().ouw));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public abstract File ouw();

    public final List<ouw.C0194ouw> ouw(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map = ouwVar.fkw;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (map.size() == 0) {
            if (ouwVar2 != null && ouwVar2.fkw.size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map2 = ouwVar2.fkw;
                Iterator<String> it = map2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar3 = map2.get(it.next());
                    if (ouwVar3 != null) {
                        arrayList.addAll(ouwVar3.ouw());
                        ko.vt("PlayComponentEngineCacheManager", "deleteAll");
                    }
                }
            }
        } else if (ouwVar2 != null && ouwVar2.fkw.size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map3 = ouwVar2.fkw;
            for (String str : map.keySet()) {
                com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar4 = map.get(str);
                com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar5 = map3.get(str);
                if (ouwVar5 == null && ouwVar4 != null) {
                    arrayList2.addAll(ouwVar4.ouw());
                } else if (ouwVar4 == null && ouwVar5 != null) {
                    arrayList.addAll(ouwVar5.ouw());
                } else if (ouwVar4 != null) {
                    for (ouw.C0194ouw c0194ouw : ouwVar4.ouw()) {
                        if (c0194ouw != null && !ouwVar5.ouw().contains(c0194ouw) && c0194ouw.vt != null && c0194ouw.ouw != null) {
                            arrayList2.add(c0194ouw);
                        }
                    }
                    for (ouw.C0194ouw c0194ouw2 : ouwVar5.ouw()) {
                        if (c0194ouw2 != null && !ouwVar4.ouw().contains(c0194ouw2)) {
                            arrayList.add(c0194ouw2);
                        }
                    }
                }
            }
        } else if (map.size() != 0) {
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar6 = map.get(it2.next());
                if (ouwVar6 != null) {
                    arrayList2.addAll(ouwVar6.ouw());
                    ko.vt("PlayComponentEngineCacheManager", "updateAll");
                }
            }
        }
        if (ouw(arrayList2, arrayList3)) {
            return arrayList;
        }
        ko.vt("PlayComponentEngineCacheManager", "download error");
        return null;
    }

    public final boolean ouw(ouw.vt vtVar) {
        if (vtVar == null || ouw() == null) {
            return false;
        }
        List<Pair<String, String>> list = vtVar.f12423lh;
        if (list == null || list.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(ouw(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public final boolean ouw(String str) {
        File file;
        String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(str);
        File file2 = new File(ouw().getAbsoluteFile(), strOuw + MultiDexExtractor.EXTRACTED_SUFFIX);
        com.bytedance.sdk.component.ra.vt.ouw ouwVarLe = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f12430lh.le();
        ouwVarLe.ouw(str);
        ouwVarLe.ouw(file2.getParent(), file2.getName());
        com.bytedance.sdk.component.ra.vt vtVarOuw = ouwVarLe.ouw();
        if (vtVarOuw.pno && (file = vtVarOuw.f12775ra) != null && file.exists()) {
            File file3 = vtVarOuw.f12775ra;
            try {
                uq.ouw(file3.getAbsolutePath(), file2.getParent(), (String) null);
                if (!file3.exists()) {
                    return true;
                }
                file3.delete();
                return true;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public final boolean ouw(List<ouw.C0194ouw> list) {
        String str;
        if (list == null || list.size() <= 0 || ouw() == null) {
            return false;
        }
        for (ouw.C0194ouw c0194ouw : list) {
            String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(c0194ouw.ouw);
            if (TextUtils.isEmpty(strOuw)) {
                return false;
            }
            File file = new File(ouw(), strOuw);
            String strOuw2 = com.bytedance.sdk.component.utils.fkw.ouw(file);
            if (!file.exists() || !file.isFile() || (str = c0194ouw.vt) == null || !str.equals(strOuw2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean ouw(Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map) {
        if (map == null || map.size() == 0) {
            ko.vt("PlayComponentEngineCacheManager", "map is false");
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar = map.get(it.next());
            if (ouwVar != null && !ouw(ouwVar.ouw())) {
                ko.vt("PlayComponentEngineCacheManager", "resources is false");
                return false;
            }
        }
        return true;
    }

    public final List<ouw.C0194ouw> vt(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar, com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (ouwVar2 == null || ouwVar2.ouw().isEmpty()) {
            arrayList2.addAll(ouwVar.ouw());
            ko.vt("PlayComponentEngineCacheManager", "loadTemplate update1");
        } else if (ouwVar.ouw().isEmpty()) {
            arrayList.addAll(ouwVar2.ouw());
            ko.vt("PlayComponentEngineCacheManager", "loadTemplate update2");
        } else {
            for (ouw.C0194ouw c0194ouw : ouwVar.ouw()) {
                if (!ouwVar2.ouw().contains(c0194ouw) && c0194ouw != null && c0194ouw.ouw != null && c0194ouw.vt != null) {
                    arrayList2.add(c0194ouw);
                }
            }
            for (ouw.C0194ouw c0194ouw2 : ouwVar2.ouw()) {
                if (!ouwVar.ouw().contains(c0194ouw2)) {
                    arrayList.add(c0194ouw2);
                }
            }
            ko.vt("PlayComponentEngineCacheManager", "loadTemplate update3");
        }
        if (ouw(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }
}
