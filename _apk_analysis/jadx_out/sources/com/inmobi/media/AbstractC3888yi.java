package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackersV2;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3888yi {
    public static final List a(com.inmobi.media.ads.network.common.model.Ad ad2, String str) {
        tn.p.k(ad2, "<this>");
        tn.p.k(str, "type");
        List<Trackers> trackers$media_release = ad2.getTrackers$media_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : trackers$media_release) {
            if (tn.p.f(((Trackers) obj).getType(), str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cn.b0.F(arrayList2, ((Trackers) it.next()).getUrl());
        }
        List<TrackingInfo> trackingInfo$media_release = ad2.getTrackingInfo$media_release();
        Collection arrayList3 = new ArrayList();
        for (TrackingInfo trackingInfo : trackingInfo$media_release) {
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList<TrackersV2> arrayList4 = new ArrayList();
            for (Object obj2 : trackers) {
                if (tn.p.f(((TrackersV2) obj2).getType(), str)) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (TrackersV2 trackersV2 : arrayList4) {
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList6 = new ArrayList(cn.x.x(imExts, 10));
                for (String str2 : imExts) {
                    arrayList6.add(trackingInfo.getImBaseUrl() + str2);
                }
                cn.b0.F(arrayList5, cn.f0.O0(url, arrayList6));
            }
            cn.b0.F(arrayList3, arrayList5);
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = cn.w.m();
        }
        return cn.f0.O0(arrayList3, arrayList2);
    }
}
