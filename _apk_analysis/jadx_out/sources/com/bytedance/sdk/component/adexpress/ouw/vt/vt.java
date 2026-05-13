package com.bytedance.sdk.component.adexpress.ouw.vt;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.ouw.lh.ouw;
import com.bytedance.sdk.component.adexpress.yu.bly;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.ironsource.G5;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class vt {
    public static Object ouw = new Object();

    private static boolean fkw(String str) {
        List<ouw.C0194ouw> listOuw;
        if (!yu.vt().vt) {
            return false;
        }
        yu.vt();
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw = yu.fkw();
        if (ouwVarFkw == null || (listOuw = ouwVarFkw.ouw()) == null) {
            return false;
        }
        for (ouw.C0194ouw c0194ouw : listOuw) {
            if (c0194ouw != null && TextUtils.equals(str, c0194ouw.ouw)) {
                return true;
            }
        }
        return false;
    }

    private static File le(String str) {
        if (!yu.vt().vt) {
            return null;
        }
        yu.vt();
        for (ouw.C0194ouw c0194ouw : yu.fkw().ouw()) {
            String str2 = c0194ouw.ouw;
            if (str2 != null && str2.equals(str)) {
                File file = new File(yu.le(), com.bytedance.sdk.component.utils.fkw.ouw(c0194ouw.ouw));
                String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(file);
                String str3 = c0194ouw.vt;
                if (str3 == null || !str3.equals(strOuw)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    public static com.bytedance.sdk.component.adexpress.ouw.lh.vt lh(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        le.ouw();
        final com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVarOuw = le.ouw(str);
        if (vtVarOuw != null) {
            vtVarOuw.f12426ra = Long.valueOf(System.currentTimeMillis());
            com.bytedance.sdk.component.adexpress.yu.yu.ouw(new pno("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.ouw.vt.vt.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (vt.ouw) {
                        fkw.ouw().ouw(vtVarOuw, true);
                    }
                }
            }, 10);
        }
        return vtVarOuw;
    }

    public static String lh() {
        return fkw.lh();
    }

    public static com.bytedance.sdk.component.adexpress.ouw.lh.vt ouw(String str) {
        le.ouw();
        return le.ouw(str);
    }

    public static ouw ouw(String str, bly.ouw ouwVar, String str2) {
        ouw ouwVar2 = new ouw();
        File fileLe = null;
        if (!TextUtils.isEmpty(str2)) {
            yu.vt();
            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw = yu.fkw();
            if (ouwVarFkw == null || !yu.vt().vt) {
                ko.vt("TTDynamic", "is null");
            } else {
                Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map = ouwVarFkw.fkw;
                if (map.size() == 0) {
                    ko.vt("TTDynamic", "map is empty");
                } else {
                    com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar3 = map.get(str2);
                    if (ouwVar3 != null) {
                        Iterator<ouw.C0194ouw> it = ouwVar3.ouw().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ouw.C0194ouw next = it.next();
                            String str3 = next.ouw;
                            if (str3 != null && str3.equals(str)) {
                                File file = new File(yu.le(), com.bytedance.sdk.component.utils.fkw.ouw(next.ouw));
                                String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(file);
                                String str4 = next.vt;
                                if (str4 != null && str4.equals(strOuw)) {
                                    fileLe = file;
                                }
                            }
                        }
                    }
                }
            }
            if (fileLe != null) {
                ouwVar2.vt = 1;
            }
        }
        if (fileLe == null && (fileLe = ra(str)) != null) {
            ouwVar2.vt = 3;
        }
        if (fileLe == null && (fileLe = le(str)) != null) {
            ouwVar2.vt = 2;
        }
        if (TextUtils.isEmpty(str2)) {
            if (!fkw(str)) {
                ouwVar2.vt = 6;
            }
        } else if (!ouw(str, str2)) {
            ouwVar2.vt = 4;
        }
        ko.vt("TTDynamic", "final type:" + ouwVar2.vt);
        if (fileLe != null) {
            try {
                ouwVar2.ouw = new WebResourceResponse(ouwVar.fkw, G5.N, new FileInputStream(fileLe));
            } catch (Throwable th2) {
                ko.lh("TTDynamic", "get html WebResourceResponse error", th2);
            }
        }
        return ouwVar2;
    }

    public static void ouw() {
        yu.vt();
    }

    public static void ouw(com.bytedance.sdk.component.adexpress.ouw.lh.yu yuVar) {
        final le leVarOuw = le.ouw();
        String str = yuVar.f12427le;
        final String str2 = yuVar.ouw;
        final String str3 = yuVar.f12428lh;
        final String str4 = yuVar.vt;
        final String str5 = yuVar.yu;
        final String str6 = yuVar.fkw;
        final String strPno = TextUtils.isEmpty(str) ? com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f12430lh != null ? com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f12430lh.pno() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            ko.fkw("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            final String str7 = "saveTemplate";
            com.bytedance.sdk.component.adexpress.yu.yu.ouw(new pno(str7) { // from class: com.bytedance.sdk.component.adexpress.ouw.vt.le.1
                public final /* synthetic */ String fkw;

                /* JADX INFO: renamed from: le */
                public final /* synthetic */ String f12434le;

                /* JADX INFO: renamed from: lh */
                public final /* synthetic */ String f12435lh;
                public final /* synthetic */ String ouw;
                public final /* synthetic */ String vt;
                public final /* synthetic */ String yu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(final String str72, final String str22, final String str32, final String str42, final String str52, final String str62, final String strPno2) {
                    super(str72);
                    str = str22;
                    str = str32;
                    str = str42;
                    str = str52;
                    str = str62;
                    str = strPno2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    le.this.ouw(str, str, str, str, str, str);
                }
            }, 10);
        }
    }

    private static boolean ouw(String str, String str2) {
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar;
        if (!yu.vt().vt) {
            return false;
        }
        yu.vt();
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw = yu.fkw();
        if (ouwVarFkw == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map = ouwVarFkw.fkw;
        if (map.size() == 0 || (ouwVar = map.get(str2)) == null) {
            return false;
        }
        for (ouw.C0194ouw c0194ouw : ouwVar.ouw()) {
            if (c0194ouw != null && TextUtils.equals(str, c0194ouw.ouw)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ouw(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static File ra(String str) {
        List<Pair<String, String>> list;
        yu.vt();
        ouw.vt vtVar = yu.fkw().f12420lh;
        if (vtVar == null || (list = vtVar.f12423lh) == null || list.size() <= 0) {
            return null;
        }
        for (Pair<String, String> pair : list) {
            Object obj = pair.second;
            if (obj != null && ((String) obj).equals(str)) {
                return new File(yu.le(), (String) pair.first);
            }
        }
        return null;
    }

    public static Set<String> vt(String str) {
        le.ouw();
        return le.vt(str);
    }

    public static void vt() {
        try {
            ra.vt();
            File fileLe = yu.le();
            if (fileLe == null || !fileLe.exists()) {
                return;
            }
            if (fileLe.getParentFile() != null) {
                com.bytedance.sdk.component.utils.ra.lh(fileLe.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.ra.lh(fileLe);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean vt(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    public static String yu(String str) {
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar;
        yu.vt();
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw = yu.fkw();
        if (ouwVarFkw == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            yu.vt();
            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw2 = yu.fkw();
            if (ouwVarFkw2 == null) {
                return null;
            }
            return ouwVarFkw2.vt;
        }
        Map<String, com.bytedance.sdk.component.adexpress.ouw.lh.ouw> map = ouwVarFkw.fkw;
        if (map == null || map.size() <= 0 || (ouwVar = map.get(str)) == null) {
            return null;
        }
        return ouwVar.vt;
    }

    public static boolean yu() {
        return yu.vt().vt;
    }
}
