package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5168uk {
    public static Q5 a(ServiceModuleCounterReport serviceModuleCounterReport) {
        String value;
        Q5 q52 = new Q5("", "", 0);
        q52.f65791d = serviceModuleCounterReport.getType();
        String name = serviceModuleCounterReport.getName();
        if (name != null) {
            q52.f65788a = name;
        }
        if (serviceModuleCounterReport.getValueBytes() == null && (value = serviceModuleCounterReport.getValue()) != null) {
            q52.f65789b = value;
        }
        byte[] valueBytes = serviceModuleCounterReport.getValueBytes();
        if (valueBytes != null) {
            q52.setValueBytes(valueBytes);
        }
        return q52;
    }
}
