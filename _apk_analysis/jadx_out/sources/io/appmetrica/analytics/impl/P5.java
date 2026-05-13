package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class P5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC4983n9 enumC4983n9;
        Bundle bundle = parcel.readBundle(C6.class.getClassLoader());
        if (bundle.containsKey("CounterReport.Source")) {
            int i10 = bundle.getInt("CounterReport.Source");
            EnumC4983n9[] enumC4983n9ArrValues = EnumC4983n9.values();
            int length = enumC4983n9ArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC4983n9 = EnumC4983n9.NATIVE;
                    break;
                }
                enumC4983n9 = enumC4983n9ArrValues[i11];
                if (enumC4983n9.f67355a == i10) {
                    break;
                }
                i11++;
            }
        } else {
            enumC4983n9 = null;
        }
        Q5 q52 = new Q5("", "", 0);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        q52.f65791d = bundle.getInt("CounterReport.Type", -1);
        q52.f65792e = bundle.getInt("CounterReport.CustomType");
        q52.f65789b = StringUtils.ifIsNullToDef(bundle.getString("CounterReport.Value"), "");
        q52.f65790c = bundle.getString("CounterReport.Environment");
        q52.f65788a = bundle.getString("CounterReport.Event");
        q52.f65793f = Q5.a(bundle);
        q52.f65794g = bundle.getInt("CounterReport.TRUNCATED");
        q52.f65795h = bundle.getString("CounterReport.ProfileID");
        q52.f65796i = bundle.getLong("CounterReport.CreationElapsedRealtime");
        q52.f65797j = bundle.getLong("CounterReport.CreationTimestamp");
        q52.f65798k = EnumC4753ea.a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")));
        q52.f65799l = enumC4983n9;
        q52.f65800m = bundle.getBundle("CounterReport.Payload");
        q52.f65801n = bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        q52.f65802o = bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null;
        q52.f65803p = CollectionUtils.bundleToMap(bundle.getBundle("CounterReport.Extras"));
        return q52;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new Q5[i10];
    }
}
