package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.ironsource.C4336xa;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: UploadStatistic.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static Integer a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar) {
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params_for_special", "gecko");
                jSONObject.put("device_id", bVar.r());
                jSONObject.put(Q6.F, 0);
                jSONObject.put("app_version", bVar.o());
                jSONObject.put("api_version", "v3");
                jSONObject.put(C4336xa.f34377b, bVar.k());
                jSONObject.put("x_tt_logid", aVar.f11433e);
                jSONObject.put("http_status", aVar.f11435g);
                jSONObject.put("err_msg", aVar.f11432d);
                if (TextUtils.isEmpty(aVar.f11433e)) {
                    jSONObject.put("deployments_info", aVar.f11430b);
                    jSONObject.put("local_info", aVar.f11429a);
                    jSONObject.put("custom_info", aVar.f11431c);
                } else {
                    jSONObject.put("deployments_info", "");
                    jSONObject.put("local_info", "");
                    jSONObject.put("custom_info", "");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Build.VERSION.SDK_INT);
                jSONObject.put(CommonUrlParts.OS_VERSION, sb2.toString());
                jSONObject.put("device_platform", "android");
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, aVar.f11434f);
                iStatisticMonitorQ.upload("geckosdk_query_pkgs", jSONObject);
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
    }

    public static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        StatisticModel statisticModel;
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.f11527d != null || aVar2.f11529f != 0) {
                if (aVar2.f11531h && aVar2.f11532i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.f11525b;
                    packageStatisticModel.accessKey = aVar2.f11524a;
                    packageStatisticModel.channel = aVar2.f11526c;
                    packageStatisticModel.f11522ac = aVar2.f11537n;
                    packageStatisticModel.f11523id = aVar2.f11539p;
                    packageStatisticModel.patchId = aVar2.f11538o;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f11528e);
                    packageStatisticModel.downloadUrl = aVar2.f11527d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f11528e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.f11530g - aVar2.f11529f);
                    if (!aVar2.f11533j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.f11526c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.f11541r;
                        packageStatisticModel2.f11522ac = aVar2.f11537n;
                        packageStatisticModel2.patchId = aVar2.f11538o;
                        packageStatisticModel2.f11523id = aVar2.f11539p;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f11528e);
                        packageStatisticModel2.downloadUrl = aVar2.f11527d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f11528e);
                    } else if (aVar2.f11534k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f11524a;
                        packageStatisticModel3.groupName = aVar2.f11525b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.f11538o;
                        packageStatisticModel3.f11523id = aVar2.f11539p;
                        packageStatisticModel3.channel = aVar2.f11526c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f11535l - aVar2.f11530g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.f11536m - aVar2.f11535l);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f11524a;
                        packageStatisticModel4.groupName = aVar2.f11525b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.f11526c;
                        packageStatisticModel4.patchId = aVar2.f11538o;
                        packageStatisticModel4.f11523id = aVar2.f11539p;
                        packageStatisticModel4.errMsg = aVar2.f11542s;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f11524a;
                    packageStatisticModel5.groupName = aVar2.f11525b;
                    packageStatisticModel5.channel = aVar2.f11526c;
                    packageStatisticModel5.f11522ac = aVar2.f11537n;
                    packageStatisticModel5.patchId = aVar2.f11538o;
                    packageStatisticModel5.f11523id = aVar2.f11539p;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f11528e);
                    packageStatisticModel5.downloadUrl = aVar2.f11527d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f11528e);
                    if (!aVar2.f11531h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f11528e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f11528e.get(0).reason;
                        }
                    } else if (!aVar2.f11532i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.f11540q;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context contextA = bVar.a();
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.a.a(contextA));
        if (arrayList.isEmpty()) {
            statisticModel = null;
        } else {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), e.a(contextA), bVar.l(), bVar.m());
            StatisticModel statisticModel2 = new StatisticModel();
            statisticModel2.common = common;
            statisticModel2.packages = arrayList;
            String string = UUID.randomUUID().toString();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((StatisticModel.PackageStatisticModel) it.next()).logId = string;
            }
            statisticModel = statisticModel2;
        }
        if (statisticModel == null || statisticModel.packages == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                for (StatisticModel.PackageStatisticModel packageStatisticModel6 : statisticModel.packages) {
                    Common common2 = statisticModel.common;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("params_for_special", "gecko");
                    jSONObject.put("region", common2.region);
                    jSONObject.put("err_code", packageStatisticModel6.errCode);
                    jSONObject.put("err_msg", packageStatisticModel6.errMsg);
                    jSONObject.put("sdk_version", common2.sdkVersion);
                    jSONObject.put("access_key", packageStatisticModel6.accessKey);
                    jSONObject.put("stats_type", packageStatisticModel6.statsType);
                    jSONObject.put("device_id", common2.deviceId);
                    Long l10 = packageStatisticModel6.patchId;
                    jSONObject.put("patch_id", l10 == null ? 0L : l10.longValue());
                    jSONObject.put("group_name", packageStatisticModel6.groupName);
                    jSONObject.put(Q6.F, common2.f11507os);
                    jSONObject.put("app_version", common2.appVersion);
                    jSONObject.put("device_model", common2.deviceModel);
                    jSONObject.put("channel", packageStatisticModel6.channel);
                    Long l11 = packageStatisticModel6.f11523id;
                    jSONObject.put("id", l11 == null ? 0L : l11.longValue());
                    jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, common2.f11506ac);
                    Integer num = packageStatisticModel6.downloadRetryTimes;
                    jSONObject.put("download_retry_times", num == null ? 0 : num.intValue());
                    String str = packageStatisticModel6.downloadUrl;
                    Object obj = "";
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put(DownloadModel.DOWNLOAD_URL, str);
                    jSONObject.put("download_duration", packageStatisticModel6.downloadDuration);
                    List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = packageStatisticModel6.downloadFailRecords;
                    if (list2 != null) {
                        obj = list2;
                    }
                    jSONObject.put("download_fail_records", obj);
                    jSONObject.put("log_id", packageStatisticModel6.logId);
                    Long l12 = packageStatisticModel6.activeCheckDuration;
                    jSONObject.put("active_check_duration", l12 == null ? 0L : l12.longValue());
                    Long l13 = packageStatisticModel6.applyDuration;
                    jSONObject.put("apply_duration", l13 == null ? 0L : l13.longValue());
                    iStatisticMonitorQ.upload("geckosdk_update_stats", jSONObject);
                }
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
        if (bVar.c()) {
            try {
                final String json = statisticModel.toJson();
                if (TextUtils.isEmpty(json)) {
                    return;
                }
                final String str2 = "https://" + bVar.j() + "/gecko/server/packages/stats";
                com.bykv.vk.openvk.preload.geckox.b.g().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (int i10 = 0; i10 < 3; i10++) {
                            try {
                                Response responseDoPost = bVar.i().doPost(str2, json);
                                if (responseDoPost.code != 200) {
                                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str2);
                                }
                                if (new JSONObject(responseDoPost.body).getInt("status") == 0) {
                                    return;
                                }
                            } catch (Exception e10) {
                                GeckoLogger.w("gecko-debug-tag", "upload statistic:", e10);
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (!aVar.f11549z || !aVar.A) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 1;
            packageStatisticModel.accessKey = aVar.f11524a;
            packageStatisticModel.groupName = aVar.f11525b;
            packageStatisticModel.channel = aVar.f11526c;
            packageStatisticModel.f11522ac = aVar.f11537n;
            packageStatisticModel.f11523id = aVar.f11539p;
            packageStatisticModel.downloadRetryTimes = a(aVar.f11544u);
            packageStatisticModel.downloadUrl = aVar.f11543t;
            packageStatisticModel.downloadFailRecords = b(aVar.f11544u);
            if (aVar.f11549z) {
                if (aVar.A) {
                    return;
                }
                packageStatisticModel.errCode = "450";
                packageStatisticModel.errMsg = aVar.C;
                return;
            }
            packageStatisticModel.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f11544u;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel.errMsg = aVar.f11544u.get(0).reason;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel2);
        packageStatisticModel2.statsType = 0;
        packageStatisticModel2.accessKey = aVar.f11524a;
        packageStatisticModel2.groupName = aVar.f11525b;
        packageStatisticModel2.channel = aVar.f11526c;
        packageStatisticModel2.f11522ac = aVar.f11537n;
        packageStatisticModel2.f11523id = aVar.f11539p;
        packageStatisticModel2.downloadRetryTimes = a(aVar.f11544u);
        packageStatisticModel2.downloadUrl = aVar.f11543t;
        packageStatisticModel2.downloadFailRecords = b(aVar.f11544u);
        packageStatisticModel2.downloadDuration = Long.valueOf(aVar.f11546w - aVar.f11545v);
        if (aVar.B) {
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.accessKey = aVar.f11524a;
            packageStatisticModel3.groupName = aVar.f11525b;
            packageStatisticModel3.statsType = 2;
            packageStatisticModel3.f11523id = aVar.f11539p;
            packageStatisticModel3.channel = aVar.f11526c;
            packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar.f11547x - aVar.f11546w);
            packageStatisticModel3.applyDuration = Long.valueOf(aVar.f11548y - aVar.f11547x);
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 3;
        packageStatisticModel4.accessKey = aVar.f11524a;
        packageStatisticModel4.groupName = aVar.f11525b;
        packageStatisticModel4.errCode = "500";
        packageStatisticModel4.f11523id = aVar.f11539p;
        packageStatisticModel4.channel = aVar.f11526c;
        packageStatisticModel4.errMsg = aVar.D;
    }

    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }
}
