package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import com.ironsource.Q6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: AbandonChannelClenUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f11371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11372b = 1;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbandonChannelClenUtils.java */
    public static class C0171a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f11378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public File f11379e;

        public C0171a(String str, String str2, int i10, long j10, File file) {
            this.f11375a = str;
            this.f11376b = str2;
            this.f11377c = i10;
            this.f11378d = j10;
            this.f11379e = file;
        }
    }

    public a(List<String> list) {
        this.f11371a = list;
    }

    public static List<StatisticModel.PackageStatisticModel> a(Context context) {
        return b.a(context).a();
    }

    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, com.bykv.vk.openvk.preload.geckox.d.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        List<ComponentModel.a> list;
        Iterator<Map.Entry<String, ComponentModel.b>> it;
        Iterator<ComponentModel.a> it2;
        List<Long> listB;
        File file2;
        Iterator<Long> it3;
        List<Long> listB2;
        Iterator<Map.Entry<String, ComponentModel.b>> it4;
        Iterator<ComponentModel.a> it5;
        String str;
        List<Long> list2;
        File file3;
        int i10;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Map.Entry<String, ComponentModel.b>> it6 = map.entrySet().iterator();
            while (it6.hasNext()) {
                Map.Entry<String, ComponentModel.b> next = it6.next();
                String key = next.getKey();
                File file4 = new File(file, key);
                if (file4.isDirectory() && (value = next.getValue()) != null && (list = value.f11511a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list3 = value.f11511a;
                    HashSet hashSet = new HashSet();
                    Iterator<ComponentModel.a> it7 = list3.iterator();
                    while (it7.hasNext()) {
                        ComponentModel.a next2 = it7.next();
                        String str2 = next2.f11508a;
                        if (!hashSet.contains(str2)) {
                            hashSet.add(str2);
                            int i11 = next2.f11509b;
                            List<Long> list4 = next2.f11510c;
                            File file5 = new File(file4, str2);
                            String str3 = "--pending-delete";
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 == 3) {
                                        File file6 = new File(file4, str2);
                                        File file7 = new File(file4, str2 + "--pending-delete");
                                        file6.renameTo(file7);
                                        arrayList2.add(new C0171a(key, str2, i11, 0L, file7));
                                    }
                                } else if (list4 != null && (listB2 = g.b(file5)) != null && !listB2.isEmpty()) {
                                    for (Long l10 : listB2) {
                                        if (list4.get(0).longValue() > l10.longValue()) {
                                            File file8 = new File(file5, l10 + str3);
                                            new File(file5, String.valueOf(l10)).renameTo(file8);
                                            it4 = it6;
                                            str = str3;
                                            it5 = it7;
                                            list2 = list4;
                                            file3 = file5;
                                            i10 = i11;
                                            arrayList2.add(new C0171a(key, str2, i11, l10.longValue(), file8));
                                        } else {
                                            it4 = it6;
                                            it5 = it7;
                                            str = str3;
                                            list2 = list4;
                                            file3 = file5;
                                            i10 = i11;
                                        }
                                        str3 = str;
                                        list4 = list2;
                                        i11 = i10;
                                        it7 = it5;
                                        file5 = file3;
                                        it6 = it4;
                                    }
                                }
                                it = it6;
                                it2 = it7;
                            } else {
                                it = it6;
                                it2 = it7;
                                File file9 = file5;
                                if (list4 != null && (listB = g.b(file9)) != null && !listB.isEmpty()) {
                                    Iterator<Long> it8 = listB.iterator();
                                    while (it8.hasNext()) {
                                        Long next3 = it8.next();
                                        if (list4.contains(next3)) {
                                            File file10 = file9;
                                            File file11 = new File(file10, next3 + "--pending-delete");
                                            new File(file10, String.valueOf(next3)).renameTo(file11);
                                            it3 = it8;
                                            file2 = file10;
                                            arrayList2.add(new C0171a(key, str2, i11, next3.longValue(), file11));
                                        } else {
                                            file2 = file9;
                                            it3 = it8;
                                        }
                                        it8 = it3;
                                        file9 = file2;
                                    }
                                }
                            }
                            it6 = it;
                            it7 = it2;
                        }
                    }
                }
            }
            arrayList = arrayList2;
        } catch (Exception e10) {
            e10.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0171a> list5 = arrayList;
                    if (list5 != null && !list5.isEmpty()) {
                        for (C0171a c0171a : list5) {
                            File file12 = c0171a.f11379e;
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            boolean zA = com.bykv.vk.openvk.preload.geckox.utils.b.a(file12);
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            if (zA) {
                                b.a(context2).a(c0171a.f11375a, c0171a.f11376b, c0171a.f11377c, 200, c0171a.f11378d, 0, null, jUptimeMillis2 - jUptimeMillis);
                            } else {
                                b.a(context2).a(c0171a.f11375a, c0171a.f11376b, c0171a.f11377c, 201, c0171a.f11378d, 601, "delete failed", jUptimeMillis2 - jUptimeMillis);
                            }
                        }
                    }
                } catch (Exception e11) {
                    GeckoLogger.w("clean-channel", "", e11);
                }
            }
        });
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.c()) {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a()), e.a(bVar.a()), bVar.l(), bVar.m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a()).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = "https://" + bVar.j() + "/gecko/server/packages/stats";
            try {
                Response responseDoPost = bVar.i().doPost(str, statisticModel.toJson());
                if (responseDoPost.code == 200) {
                    if (new JSONObject(responseDoPost.body).getInt("status") != 0) {
                        throw new RuntimeException("upload failed");
                    }
                } else {
                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f11371a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.f11371a.size(); i10++) {
                    jSONArray.put(this.f11371a.get(i10));
                }
                jSONObject.put("gecko_accesskey", jSONArray);
            }
            jSONObject.put(Q6.F, 0);
            jSONObject.put("msg_type", this.f11372b);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
